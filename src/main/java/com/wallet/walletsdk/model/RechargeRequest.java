package com.wallet.walletsdk.model;

public class RechargeRequest {

    private Integer status;

    private Long userId;

    private String hash;

    private Integer current = 1;

    private Integer size = 50;


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public RechargeRequest() {
    }

    public RechargeRequest(Integer status, Long userId, String hash, Integer current, Integer size) {
        this.status = status;
        this.userId = userId;
        this.hash = hash;
        this.current = current;
        this.size = size;
    }

    @Override
    public String toString() {
        return "RechargeRequest{" +
                "status=" + status +
                ", userId=" + userId +
                ", hash='" + hash + '\'' +
                ", current=" + current +
                ", size=" + size +
                '}';
    }
}
