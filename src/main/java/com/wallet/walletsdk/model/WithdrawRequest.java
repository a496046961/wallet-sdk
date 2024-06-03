package com.wallet.walletsdk.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class WithdrawRequest implements Serializable {

    // 用户定义的订单号
    private String requestId;


    private String fromAddress;


    private String toAddress;


    private BigDecimal amount;

    private String symbol;

    private Long userId;

    private String parentSymbol;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getParentSymbol() {
        return parentSymbol;
    }

    public void setParentSymbol(String parentSymbol) {
        this.parentSymbol = parentSymbol;
    }

    public WithdrawRequest(String requestId, String fromAddress, String toAddress, BigDecimal amount, String symbol, Long userId, String parentSymbol) {
        this.requestId = requestId;
        this.fromAddress = fromAddress;
        this.toAddress = toAddress;
        this.amount = amount;
        this.symbol = symbol;
        this.userId = userId;
        this.parentSymbol = parentSymbol;
    }

    public WithdrawRequest() {
    }

    @Override
    public String toString() {
        return "WithdrawRequest{" +
                "requestId='" + requestId + '\'' +
                ", fromAddress='" + fromAddress + '\'' +
                ", toAddress='" + toAddress + '\'' +
                ", amount=" + amount +
                ", symbol='" + symbol + '\'' +
                ", userId=" + userId +
                ", parentSymbol='" + parentSymbol + '\'' +
                '}';
    }
}
