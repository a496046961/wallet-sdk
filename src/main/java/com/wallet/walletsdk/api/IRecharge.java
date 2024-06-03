package com.wallet.walletsdk.api;

import com.wallet.walletsdk.model.MessageResult;
import com.wallet.walletsdk.model.Recharge;
import com.wallet.walletsdk.model.RechargeRequest;

import java.util.List;

/**
 * Recharge
 */
public interface IRecharge {

    MessageResult<List<Recharge>> get_recharge_list(RechargeRequest rechargeRequest);

}
