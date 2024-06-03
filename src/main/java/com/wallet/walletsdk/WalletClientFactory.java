package com.wallet.walletsdk;


import com.github.lalyos.jfiglet.FigletFont;
import com.wallet.walletsdk.api.Account;
import com.wallet.walletsdk.api.Coin;
import com.wallet.walletsdk.api.RechargeApi;
import com.wallet.walletsdk.api.WithdrawApi;
import com.wallet.walletsdk.constant.Constant;


import java.io.Serializable;

public class WalletClientFactory implements Serializable {

    public static WalletClient CreateClient(WalletConfig wallet_config) throws Exception {
        if (wallet_config.getEnableLog()) {
            String s = FigletFont.convertOneLine("Central wallet");
            System.out.println(s);
            System.out.println("version: " + wallet_config.getVersion());
        }
        Constant.wallet_config = wallet_config;
        WalletClient walletClient = new WalletClient();
        walletClient.setAccount(new Account());
        walletClient.setCoin(new Coin());
        walletClient.setRecharge(new RechargeApi());
        walletClient.setWithdraw(new WithdrawApi());
        return walletClient;
    }

}
