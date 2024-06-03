package com.wallet.walletsdk.api;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.TypeReference;
import com.wallet.walletsdk.model.MessageResult;
import com.wallet.walletsdk.model.Symbol;
import com.wallet.walletsdk.util.HttpClientUtil;

import java.util.List;

public class Coin implements ICoin{


    @Override
    public MessageResult<List<Symbol>> support_symbol() {

        String result = HttpClientUtil.get_instance().do_post_with_json_result(ApiUrl.SUPPORT_SYMBOL.getValue(), null);

        MessageResult<List<Symbol>> messageResult = JSON.parseObject(result, new TypeReference<MessageResult<List<Symbol>>>() {
        });

        return messageResult;
    }
}
