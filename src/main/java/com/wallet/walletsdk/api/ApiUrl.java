package com.wallet.walletsdk.api;

public enum ApiUrl {
    /**
     * CREATE USER
     */
    CREATE_USER("/account/register", "POST"),
    /**
     * GET USER INFO
     */
    GET_USER_INFO("/account/getUserInfo", "POST"),
    /**
     * get support symbol
     */
    SUPPORT_SYMBOL("/symbol/all", "POST"),

    /**
     * get user recharge id
     */
    GET_RECHARGE("/recharge", "POST"),

    /**
     * get user address
     */
    GET_ADDRESS("/address/list", "POST"),
    /**
     * get user withdraw list
     */
    GET_WITHDRAW_LIST("/withdraw/withdraw-list", "POST"),
    WITHDRAW("/withdraw", "POST");

    private String value;
    private String method;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    ApiUrl(String value, String method) {
        this.value = value;
        this.method = method;
    }
}
