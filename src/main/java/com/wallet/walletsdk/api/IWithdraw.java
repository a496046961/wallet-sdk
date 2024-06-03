package com.wallet.walletsdk.api;

import com.wallet.walletsdk.model.MessageResult;
import com.wallet.walletsdk.model.QueryWithdrawRequest;
import com.wallet.walletsdk.model.Withdraw;
import com.wallet.walletsdk.model.WithdrawRequest;

import java.util.List;

public interface IWithdraw {


    MessageResult<List<Withdraw>> get_user_withdraw (QueryWithdrawRequest queryWithdrawRequest);

    MessageResult withdraw(WithdrawRequest withdrawRequest);
}
