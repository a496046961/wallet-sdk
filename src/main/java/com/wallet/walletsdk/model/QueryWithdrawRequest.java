package com.wallet.walletsdk.model;

import java.math.BigDecimal;

public class QueryWithdrawRequest {

    private String requestId;

    private String fromAddress;

    private String toAddress;


    private String symbol;

    private Long userId;

    private Long status;

    private String hash;

    private Integer current = 1;

    private Integer size = 50;

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

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public QueryWithdrawRequest() {
    }

    public QueryWithdrawRequest(String requestId, String fromAddress, String toAddress, String symbol, Long userId, Long status, String hash, Integer current, Integer size) {
        this.requestId = requestId;
        this.fromAddress = fromAddress;
        this.toAddress = toAddress;
        this.symbol = symbol;
        this.userId = userId;
        this.status = status;
        this.hash = hash;
        this.current = current;
        this.size = size;
    }

    @Override
    public String toString() {
        return "QueryWithdrawRequest{" +
                "requestId='" + requestId + '\'' +
                ", fromAddress='" + fromAddress + '\'' +
                ", toAddress='" + toAddress + '\'' +
                ", symbol='" + symbol + '\'' +
                ", userId=" + userId +
                ", status=" + status +
                ", hash='" + hash + '\'' +
                ", current=" + current +
                ", size=" + size +
                '}';
    }
}
