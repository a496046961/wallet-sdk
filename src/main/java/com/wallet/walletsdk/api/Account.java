package com.wallet.walletsdk.api;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.TypeReference;
import com.wallet.walletsdk.WalletConfig;
import com.wallet.walletsdk.model.Address;
import com.wallet.walletsdk.model.MessageResult;
import com.wallet.walletsdk.model.UserInfo;
import com.wallet.walletsdk.util.HttpClientUtil;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Account implements IAccount {


    /**
     * create user
     *
     * @param userName
     * @return user id
     */
    @Override
    public MessageResult<UserInfo> create_user(String userName) {
        if (StringUtils.isBlank(userName)) {
            return MessageResult.fail("The user name cannot be empty");
        }

        Map<String, String> params = new HashMap<>(2);
        params.put("userName", userName);

        String result = HttpClientUtil.get_instance().do_post_with_json_result(ApiUrl.CREATE_USER.getValue(), params);

        MessageResult<UserInfo> messageResult = JSON.parseObject(result, new TypeReference<MessageResult<UserInfo>>() {
        });

        return messageResult;
    }

    @Override
    public MessageResult<UserInfo> get_user_info(String userName) {
        if (StringUtils.isBlank(userName)) {
            return MessageResult.fail("The user name cannot be empty");
        }
        Map<String, String> params = new HashMap<>(2);
        params.put("userName", userName);
        String result = HttpClientUtil.get_instance().do_post_with_json_result(ApiUrl.GET_USER_INFO.getValue(), params);
        MessageResult<UserInfo> messageResult = JSON.parseObject(result, new TypeReference<MessageResult<UserInfo>>() {
        });

        return messageResult;
    }

    @Override
    public MessageResult<List<Address>> get_address_list(Long userId) {
        if (ObjectUtil.isEmpty(userId)) {
            return MessageResult.fail("The user id cannot be empty");
        }
        Map<String, String> params = new HashMap<>(2);
        params.put("userId", userId.toString());
        String result = HttpClientUtil.get_instance().do_post_with_json_result(ApiUrl.GET_ADDRESS.getValue(), params);

        MessageResult<List<Address>> messageResult = JSON.parseObject(result, new TypeReference<MessageResult<List<Address>>>() {
        });

        return messageResult;
    }


}
