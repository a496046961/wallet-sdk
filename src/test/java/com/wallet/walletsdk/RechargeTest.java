package com.wallet.walletsdk;

import com.wallet.walletsdk.model.MessageResult;
import com.wallet.walletsdk.model.Recharge;
import com.wallet.walletsdk.model.RechargeRequest;
import org.junit.Test;

import java.util.List;

public class RechargeTest {

    @Test
    public void test() throws Exception {
        WalletConfig walletConfig = new WalletConfig();

        walletConfig.setApiKey("f6b7364d-109c-480c-800a-1fde79f74937");
        walletConfig.setCharset("UTF-8");
        walletConfig.setDomain("http://127.0.0.1:23333");
        walletConfig.setEnableLog(true);

        WalletClient walletClient = WalletClientFactory.CreateClient(walletConfig);
        RechargeRequest rechargeRequest = new RechargeRequest();
       // rechargeRequest.setHash("0x14882b6f5a4162f9cd4dcc6fe3549b23d80224944353f90ea823441e395a016b");
       // rechargeRequest.setUserId(0L);
        rechargeRequest.setStatus(4);
        MessageResult<List<Recharge>> messageResult = walletClient.getRecharge().get_recharge_list(rechargeRequest);

        System.out.println(messageResult.toString());
    }

}
