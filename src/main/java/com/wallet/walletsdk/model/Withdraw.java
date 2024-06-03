package com.wallet.walletsdk.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Withdraw implements Serializable {


    private String requestId;

    private String fromAddress;

    private String toAddress;

    private BigDecimal amount;

    private String symbol;

    /**
     * 交易hash
     */
    private String txId;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;

    /**
     * 修改时间
     */
    private LocalDateTime updateDate;

    /**
     * 状态  0 未审核，1 审核通过，2 审核拒绝，3 支付中已经打币（未二次确认），4 支付失败，5 已完成，6 已撤销
     */

    private Long status;

    /**
     * 手续费币种
     */
    private String feeSymbol;

    /**
     * 手续费
     */
    private BigDecimal realFee;

    /**
     * 备注
     */
    private String remark;

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

    public String getTxId() {
        return txId;
    }

    public void setTxId(String txId) {
        this.txId = txId;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getFeeSymbol() {
        return feeSymbol;
    }

    public void setFeeSymbol(String feeSymbol) {
        this.feeSymbol = feeSymbol;
    }

    public BigDecimal getRealFee() {
        return realFee;
    }

    public void setRealFee(BigDecimal realFee) {
        this.realFee = realFee;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Withdraw() {
    }

    @Override
    public String toString() {
        return "Withdraw{" +
                "requestId='" + requestId + '\'' +
                ", fromAddress='" + fromAddress + '\'' +
                ", toAddress='" + toAddress + '\'' +
                ", amount=" + amount +
                ", symbol='" + symbol + '\'' +
                ", txId='" + txId + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", status=" + status +
                ", feeSymbol='" + feeSymbol + '\'' +
                ", realFee=" + realFee +
                ", remark='" + remark + '\'' +
                '}';
    }

    public Withdraw(String requestId, String fromAddress, String toAddress, BigDecimal amount, String symbol, String txId, LocalDateTime createDate, LocalDateTime updateDate, Long status, String feeSymbol, BigDecimal realFee, String remark) {
        this.requestId = requestId;
        this.fromAddress = fromAddress;
        this.toAddress = toAddress;
        this.amount = amount;
        this.symbol = symbol;
        this.txId = txId;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.status = status;
        this.feeSymbol = feeSymbol;
        this.realFee = realFee;
        this.remark = remark;
    }
}
