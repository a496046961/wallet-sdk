package com.wallet.walletsdk.api;


import cn.hutool.core.util.ObjectUtil;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.TypeReference;
import com.wallet.walletsdk.model.MessageResult;
import com.wallet.walletsdk.model.Recharge;
import com.wallet.walletsdk.model.RechargeRequest;
import com.wallet.walletsdk.util.HttpClientUtil;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RechargeApi implements IRecharge {
    @Override
    public MessageResult<List<Recharge>> get_recharge_list(RechargeRequest rechargeRequest) {
        // Map<String, Object> params =
        //         BeanUtil.beanToMap(rechargeRequest, false, true);
        Map<String, String> params = new HashMap<>(6);
        if (ObjectUtil.isNotEmpty(rechargeRequest.getStatus())) {
            params.put("status", rechargeRequest.getStatus().toString());
        }
        if (ObjectUtil.isNotEmpty(rechargeRequest.getUserId())) {
            params.put("userId", rechargeRequest.getUserId().toString());
        }
        if (StringUtils.isNotBlank(rechargeRequest.getHash())) {
            params.put("hash", rechargeRequest.getHash());
        }

        params.put("current", rechargeRequest.getCurrent().toString());
        params.put("size", rechargeRequest.getSize().toString());

        String result = HttpClientUtil.get_instance().do_post_with_json_result(ApiUrl.GET_RECHARGE.getValue(), params);

        MessageResult<List<Recharge>> messageResult = JSON.parseObject(result, new TypeReference<MessageResult<List<Recharge>>>() {
        });

        return messageResult;
    }
}
