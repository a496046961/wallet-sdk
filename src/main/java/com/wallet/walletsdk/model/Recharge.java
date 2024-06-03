package com.wallet.walletsdk.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Recharge implements Serializable {

    private static final long serialVersionUID = 11L;

    private Long id;

    // 提现地址
    private String fromAddress;

    // 收款地址
    private String toAddress;

    /**
     * 原始转账数量
     */
    private String originalNumber;

    /**
     * 转账数量
     */
    private BigDecimal transferNumber;

    // 交易hash
    private String txId;

    // 块高度
    private Long blockHeightNumber;

    // 交易时间
    private Long txTimestamp;

    /**
     * 币种名称
     */
    private String coinName;

    /**
     * 精度
     */
    private int decimal;


    /**
     * 创建时间
     */

    private LocalDateTime createDate;

    /**
     * 修改时间
     */
    private LocalDateTime updateDate;

    /**
     * 状态 1:创建 2:确认中 3:审核中 4:成功 5:失败 6:手动失败
     */
    private Long status;

    private Long userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getOriginalNumber() {
        return originalNumber;
    }

    public void setOriginalNumber(String originalNumber) {
        this.originalNumber = originalNumber;
    }

    public BigDecimal getTransferNumber() {
        return transferNumber;
    }

    public void setTransferNumber(BigDecimal transferNumber) {
        this.transferNumber = transferNumber;
    }

    public String getTxId() {
        return txId;
    }

    public void setTxId(String txId) {
        this.txId = txId;
    }

    public Long getBlockHeightNumber() {
        return blockHeightNumber;
    }

    public void setBlockHeightNumber(Long blockHeightNumber) {
        this.blockHeightNumber = blockHeightNumber;
    }

    public Long getTxTimestamp() {
        return txTimestamp;
    }

    public void setTxTimestamp(Long txTimestamp) {
        this.txTimestamp = txTimestamp;
    }

    public String getCoinName() {
        return coinName;
    }

    public void setCoinName(String coinName) {
        this.coinName = coinName;
    }

    public int getDecimal() {
        return decimal;
    }

    public void setDecimal(int decimal) {
        this.decimal = decimal;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Recharge() {
    }

    public Recharge(Long id, String fromAddress, String toAddress, String originalNumber, BigDecimal transferNumber, String txId, Long blockHeightNumber, Long txTimestamp, String coinName, int decimal, LocalDateTime createDate, LocalDateTime updateDate, Long status, Long userId) {
        this.id = id;
        this.fromAddress = fromAddress;
        this.toAddress = toAddress;
        this.originalNumber = originalNumber;
        this.transferNumber = transferNumber;
        this.txId = txId;
        this.blockHeightNumber = blockHeightNumber;
        this.txTimestamp = txTimestamp;
        this.coinName = coinName;
        this.decimal = decimal;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.status = status;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Recharge{" +
                "id=" + id +
                ", fromAddress='" + fromAddress + '\'' +
                ", toAddress='" + toAddress + '\'' +
                ", originalNumber='" + originalNumber + '\'' +
                ", transferNumber=" + transferNumber +
                ", txId='" + txId + '\'' +
                ", blockHeightNumber=" + blockHeightNumber +
                ", txTimestamp=" + txTimestamp +
                ", coinName='" + coinName + '\'' +
                ", decimal=" + decimal +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", status=" + status +
                ", userId=" + userId +
                '}';
    }
}
