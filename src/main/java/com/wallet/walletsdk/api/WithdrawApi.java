package com.wallet.walletsdk.api;

import cn.hutool.core.map.MapUtil;
import cn.hutool.core.util.ObjectUtil;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.TypeReference;
import com.wallet.walletsdk.model.MessageResult;
import com.wallet.walletsdk.model.QueryWithdrawRequest;
import com.wallet.walletsdk.model.Withdraw;
import com.wallet.walletsdk.model.WithdrawRequest;
import com.wallet.walletsdk.util.HttpClientUtil;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WithdrawApi implements IWithdraw {

    @Override
    public MessageResult<List<Withdraw>> get_user_withdraw(QueryWithdrawRequest queryWithdrawRequest) {
        Map<String, String> params = MapUtil.newConcurrentHashMap(11);
        if (StringUtils.isNotBlank(queryWithdrawRequest.getRequestId())) {
            params.put("requestId", queryWithdrawRequest.getRequestId());
        }
        if (StringUtils.isNotBlank(queryWithdrawRequest.getFromAddress())) {
            params.put("fromAddress", queryWithdrawRequest.getFromAddress());
        }
        if (StringUtils.isNotBlank(queryWithdrawRequest.getToAddress())) {
            params.put("toAddress", queryWithdrawRequest.getToAddress());
        }
        if (StringUtils.isNotBlank(queryWithdrawRequest.getSymbol())) {
            params.put("symbol", queryWithdrawRequest.getSymbol());
        }
        if (StringUtils.isNotBlank(queryWithdrawRequest.getHash())) {
            params.put("hash", queryWithdrawRequest.getHash());
        }
        if (ObjectUtil.isNotEmpty(queryWithdrawRequest.getUserId())) {
            params.put("userId", queryWithdrawRequest.getUserId().toString());
        }
        if (ObjectUtil.isNotEmpty(queryWithdrawRequest.getStatus())) {
            params.put("status", queryWithdrawRequest.getStatus().toString());
        }

        String result = HttpClientUtil.get_instance().do_post_with_json_result(ApiUrl.GET_WITHDRAW_LIST.getValue(), params);

        MessageResult<List<Withdraw>> messageResult = JSON.parseObject(result, new TypeReference<MessageResult<List<Withdraw>>>() {
        });
        return messageResult;
    }

    @Override
    public MessageResult withdraw(WithdrawRequest withdrawRequest) {
        Map<String, String> params = new HashMap<>(8);
        if (StringUtils.isNotBlank(withdrawRequest.getParentSymbol())) {
            params.put("parentSymbol", withdrawRequest.getParentSymbol());
        }
        params.put("userId", withdrawRequest.getUserId().toString());
        params.put("symbol", withdrawRequest.getSymbol());
        params.put("amount", withdrawRequest.getAmount().toPlainString());
        params.put("toAddress", withdrawRequest.getToAddress());
        params.put("fromAddress", withdrawRequest.getFromAddress());
        params.put("requestId", withdrawRequest.getRequestId());

        String result = HttpClientUtil.get_instance().do_post_with_json_result(ApiUrl.WITHDRAW.getValue(), params);

        MessageResult messageResult = JSON.parseObject(result, new TypeReference<MessageResult>() {
        });

        return messageResult;
    }
}
