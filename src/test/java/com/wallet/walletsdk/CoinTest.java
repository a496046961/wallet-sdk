package com.wallet.walletsdk;

import com.wallet.walletsdk.model.MessageResult;
import com.wallet.walletsdk.model.Symbol;
import org.junit.Test;

import java.util.List;

public class CoinTest {

    @Test
    public void test() throws Exception {
        WalletConfig walletConfig = new WalletConfig();

        walletConfig.setApiKey("f6b7364d-109c-480c-800a-1fde79f74937");
        walletConfig.setCharset("UTF-8");
        walletConfig.setDomain("http://127.0.0.1:23333");
        walletConfig.setEnableLog(true);

        WalletClient walletClient = WalletClientFactory.CreateClient(walletConfig);
        MessageResult<List<Symbol>> messageResult = walletClient.getCoin().support_symbol();

        for (Symbol datum : messageResult.getData()) {
            System.out.println(datum.getName());
        }
    }

}
