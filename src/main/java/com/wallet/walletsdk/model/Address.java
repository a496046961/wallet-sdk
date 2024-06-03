package com.wallet.walletsdk.model;

import java.io.Serializable;

public class Address implements Serializable {

    /**
     * 币种id
     */
    private Long symbolId;

    /**
     * 币种名称
     */
    private String symbolName;

    /**
     * 地址
     */
    private String address;

    public Long getSymbolId() {
        return symbolId;
    }

    public void setSymbolId(Long symbolId) {
        this.symbolId = symbolId;
    }

    public String getSymbolName() {
        return symbolName;
    }

    public void setSymbolName(String symbolName) {
        this.symbolName = symbolName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Address() {
    }

    @Override
    public String toString() {
        return "Address{" +
                "symbolId=" + symbolId +
                ", symbolName='" + symbolName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
