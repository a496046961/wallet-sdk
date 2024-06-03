package com.wallet.walletsdk.model;

import com.alibaba.fastjson2.JSON;

import java.io.Serializable;

public class MessageResult<T extends Object> implements Serializable {

    private T data;

    private int code;

    private String message;

    private Long total = 0L;

    private Boolean status = true;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public MessageResult() {

    }

    public static <T> MessageResult fail(String message) {
        return new MessageResult(null, -1, message, 0L, false);
    }

    public MessageResult(T data, int code, String message, Long total, Boolean status) {
        this.data = data;
        this.code = code;
        this.message = message;
        this.total = total;
        this.status = status;
    }

    @Override
    public String toString() {
        return "MessageResult{" +
                "data=" + JSON.toJSONString(data) +
                ", code=" + code +
                ", message='" + message + '\'' +
                ", total=" + total +
                ", status=" + status +
                '}';
    }
}
