package com.wallet.walletsdk;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.wallet.walletsdk.model.MessageResult;
import com.wallet.walletsdk.model.UserInfo;
import org.junit.Test;

public class AccountTest {

    private static final Log log = LogFactory.get();

    @Test
    public void create() throws Exception {
        WalletConfig walletConfig = new WalletConfig();

        walletConfig.setApiKey("f6b7364d-109c-480c-800a-1fde79f74937");
        walletConfig.setCharset("UTF-8");
        walletConfig.setDomain("http://127.0.0.1:23333");
        walletConfig.setEnableLog(true);

        WalletClient walletClient = WalletClientFactory.CreateClient(walletConfig);

        MessageResult<UserInfo> messageResult =
                walletClient.getAccount().create_user("test12334");
        log.info("messageResult: {}", messageResult);

       messageResult =
                walletClient.getAccount().get_user_info("test12334");

    }


    @Test
    public void test1(){
        System.out.println("1787683001233186816".length());
    }

}
