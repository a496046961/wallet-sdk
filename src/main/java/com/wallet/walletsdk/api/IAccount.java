package com.wallet.walletsdk.api;

import com.wallet.walletsdk.model.Address;
import com.wallet.walletsdk.model.MessageResult;
import com.wallet.walletsdk.model.UserInfo;

import java.util.List;

public interface IAccount {

    MessageResult<UserInfo> create_user(String userName);

    MessageResult<UserInfo> get_user_info(String userName);

    MessageResult<List<Address>> get_address_list(Long userId);

}
