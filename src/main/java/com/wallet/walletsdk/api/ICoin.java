package com.wallet.walletsdk.api;

import com.wallet.walletsdk.model.MessageResult;
import com.wallet.walletsdk.model.Symbol;

import java.util.List;

public interface ICoin {

    MessageResult<List<Symbol>> support_symbol();

}
