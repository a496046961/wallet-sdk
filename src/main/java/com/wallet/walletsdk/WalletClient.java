package com.wallet.walletsdk;


import com.wallet.walletsdk.api.IAccount;
import com.wallet.walletsdk.api.ICoin;
import com.wallet.walletsdk.api.IRecharge;
import com.wallet.walletsdk.api.IWithdraw;


public class WalletClient {

   private IAccount iAccount;

   private ICoin coin;

   private IRecharge recharge;

   private IWithdraw withdraw;

    public IAccount getAccount() {
        return iAccount;
    }

    public void setAccount(IAccount iAccount) {
        this.iAccount = iAccount;
    }

    public ICoin getCoin() {
        return coin;
    }

    public void setCoin(ICoin coin) {
        this.coin = coin;
    }

    public IRecharge getRecharge() {
        return recharge;
    }

    public void setRecharge(IRecharge recharge) {
        this.recharge = recharge;
    }

    public IWithdraw getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(IWithdraw withdraw) {
        this.withdraw = withdraw;
    }
}
