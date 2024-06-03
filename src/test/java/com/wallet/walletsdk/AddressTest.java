package com.wallet.walletsdk;

import com.wallet.walletsdk.model.Address;
import com.wallet.walletsdk.model.MessageResult;
import org.junit.Test;

import java.util.List;

public class AddressTest {

    @Test
    public void test() throws Exception {
        WalletConfig walletConfig = new WalletConfig();

        walletConfig.setApiKey("f6b7364d-109c-480c-800a-1fde79f74937");
        walletConfig.setCharset("UTF-8");
        walletConfig.setDomain("http://127.0.0.1:23333");
        walletConfig.setEnableLog(true);

        WalletClient walletClient = WalletClientFactory.CreateClient(walletConfig);

        MessageResult<List<Address>> messageResult = walletClient.getAccount().get_address_list(1787683001233186816L);
        messageResult.getData().forEach(System.out::println);
    }

}
