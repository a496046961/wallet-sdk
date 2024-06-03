package com.wallet.walletsdk;

import com.wallet.walletsdk.model.MessageResult;
import com.wallet.walletsdk.model.QueryWithdrawRequest;
import com.wallet.walletsdk.model.Withdraw;
import com.wallet.walletsdk.model.WithdrawRequest;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

public class WithdrawTest {

    @Test
    public void WithdrawList () throws Exception {
        WalletConfig walletConfig = new WalletConfig();

        walletConfig.setApiKey("f6b7364d-109c-480c-800a-1fde79f74937");
        walletConfig.setCharset("UTF-8");
        walletConfig.setDomain("http://127.0.0.1:23333");
        walletConfig.setEnableLog(true);

        WalletClient walletClient = WalletClientFactory.CreateClient(walletConfig);
        QueryWithdrawRequest queryWithdrawRequest = new QueryWithdrawRequest();
        queryWithdrawRequest.setRequestId("12286");

        MessageResult<List<Withdraw>> messageResult = walletClient.getWithdraw().get_user_withdraw(queryWithdrawRequest);

        messageResult.getData().forEach(System.out::println);

    }

    @Test
    public void withdraw () throws Exception {
        WalletConfig walletConfig = new WalletConfig();

        walletConfig.setApiKey("f6b7364d-109c-480c-800a-1fde79f74937");
        walletConfig.setCharset("UTF-8");
        walletConfig.setDomain("http://127.0.0.1:23333");
        walletConfig.setEnableLog(true);

        WalletClient walletClient = WalletClientFactory.CreateClient(walletConfig);

        WithdrawRequest withdrawRequest = new WithdrawRequest();
        withdrawRequest.setAmount(BigDecimal.ONE);
        withdrawRequest.setRequestId(System.currentTimeMillis()+"");
        withdrawRequest.setSymbol("WIN");
        withdrawRequest.setFromAddress("TZGjczrKCHAWtnKiM3AHgNxUtvD2yE46AB");
        withdrawRequest.setToAddress("TXnFeAtaAa8PVkkn8HBhsWd61wZN2oa1ji");
        withdrawRequest.setParentSymbol("TRX");
        withdrawRequest.setUserId(1715069598842L);
        MessageResult messageResult = walletClient.getWithdraw().withdraw(withdrawRequest);
        System.out.println(messageResult.toString());
    }


}
