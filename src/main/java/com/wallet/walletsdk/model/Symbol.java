package com.wallet.walletsdk.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Symbol implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 币种名称
     */
    private String name;

    /**
     * 合约地址
     */
    private String contractAddress;

    /**
     * 是否充值
     */
    private boolean canRecharge;

    /**
     * 是否提现
     */
    private boolean canWithdraw;

    /**
     * 是否开启rpc
     */
    private boolean enableRpc;

    /**
     * 最大提现数量
     */
    private BigDecimal maxWithdrawAmount;

    /**
     * 最小提币数量
     */
    private BigDecimal minWithdrawAmount;

    /**
     * 矿工费
     */
    private BigDecimal minerFee;

    /**
     * 状态
     */
    private boolean status;

    /**
     * 精度
     */
    private int decimal;

    /**
     * logo存放地址
     */
    private String imgUrl;

    /**
     * 简介
     */
    private String description;

    /**
     * 项目官方地址
     */
    private String projectSite;

    /**
     * 全名称
     */
    private String fullName;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContractAddress() {
        return contractAddress;
    }

    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
    }

    public boolean isCanRecharge() {
        return canRecharge;
    }

    public void setCanRecharge(boolean canRecharge) {
        this.canRecharge = canRecharge;
    }

    public boolean isCanWithdraw() {
        return canWithdraw;
    }

    public void setCanWithdraw(boolean canWithdraw) {
        this.canWithdraw = canWithdraw;
    }

    public boolean isEnableRpc() {
        return enableRpc;
    }

    public void setEnableRpc(boolean enableRpc) {
        this.enableRpc = enableRpc;
    }

    public BigDecimal getMaxWithdrawAmount() {
        return maxWithdrawAmount;
    }

    public void setMaxWithdrawAmount(BigDecimal maxWithdrawAmount) {
        this.maxWithdrawAmount = maxWithdrawAmount;
    }

    public BigDecimal getMinWithdrawAmount() {
        return minWithdrawAmount;
    }

    public void setMinWithdrawAmount(BigDecimal minWithdrawAmount) {
        this.minWithdrawAmount = minWithdrawAmount;
    }

    public BigDecimal getMinerFee() {
        return minerFee;
    }

    public void setMinerFee(BigDecimal minerFee) {
        this.minerFee = minerFee;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getDecimal() {
        return decimal;
    }

    public void setDecimal(int decimal) {
        this.decimal = decimal;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProjectSite() {
        return projectSite;
    }

    public void setProjectSite(String projectSite) {
        this.projectSite = projectSite;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Symbol() {
    }

    public Symbol(String name, String contractAddress, boolean canRecharge, boolean canWithdraw, boolean enableRpc, BigDecimal maxWithdrawAmount, BigDecimal minWithdrawAmount, BigDecimal minerFee, boolean status, int decimal, String imgUrl, String description, String projectSite, String fullName) {
        this.name = name;
        this.contractAddress = contractAddress;
        this.canRecharge = canRecharge;
        this.canWithdraw = canWithdraw;
        this.enableRpc = enableRpc;
        this.maxWithdrawAmount = maxWithdrawAmount;
        this.minWithdrawAmount = minWithdrawAmount;
        this.minerFee = minerFee;
        this.status = status;
        this.decimal = decimal;
        this.imgUrl = imgUrl;
        this.description = description;
        this.projectSite = projectSite;
        this.fullName = fullName;
    }
}
