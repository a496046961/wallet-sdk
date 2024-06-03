package com.wallet.walletsdk.model;

public class UserInfo {

    private Long userId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public UserInfo() {
    }

    public UserInfo(Long userId) {
        this.userId = userId;
    }
}
