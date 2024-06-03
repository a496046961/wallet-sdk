package com.wallet.walletsdk;


import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;

import java.io.Serializable;

public class WalletConfig implements Serializable {

    private static final Log log = LogFactory.get();

    private String apiKey;

    private String domain = "http://127.0.0.1:23333";

    private String version = "1.0";

    private String charset = "utf-8";
    private Boolean enableLog = true;

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public Boolean getEnableLog() {
        return enableLog;
    }

    public void setEnableLog(Boolean enableLog) {
        this.enableLog = enableLog;
    }

    public WalletConfig() {
        if (log.isDebugEnabled()) {
            log.debug("Settings WalletConfig configuration");
        }
        if (log.isInfoEnabled()) {
            log.info("Settings WalletConfig configuration");
        }
    }

    public WalletConfig(String apiKey, String domain, String version, String charset, Boolean enableLog) {
        this.apiKey = apiKey;
        this.domain = domain;
        this.version = version;
        this.charset = charset;
        this.enableLog = enableLog;
        if (log.isInfoEnabled()) {
            log.info("Settings WalletConfig configuration, apiKey:{} , domain:{}, version:{}, charset:{}, enableLog:{}",
                    apiKey, domain, version, charset, enableLog);
        }
    }
}
