package com.wallet.walletsdk.util;


import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.alibaba.fastjson2.JSON;
import com.wallet.walletsdk.WalletConfig;
import com.wallet.walletsdk.constant.Constant;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.sun.deploy.panel.JreLocator.DEFAULT_TIMEOUT;


public class HttpClientUtil {

    private static final Log log = LogFactory.get(HttpClientUtil.class);


    private static HttpClientUtil ins;

    private HttpClient client;

    private static String charset = "UTF-8";

    private static WalletConfig wallet_config = null;

    static RequestConfig config = RequestConfig.custom().setConnectionRequestTimeout(DEFAULT_TIMEOUT)
            .setConnectTimeout(DEFAULT_TIMEOUT).setSocketTimeout(DEFAULT_TIMEOUT).build();

    private HttpClientUtil() {
        if (client == null) {
            client = HttpClients.createDefault();
        }
        if (wallet_config == null) {
            wallet_config = Constant.wallet_config;
            charset = wallet_config.getCharset();
        }
    }

    public static HttpClientUtil get_instance() {
        if (ins == null) {
            synchronized (HttpClientUtil.class) {
                if (ins == null) {
                    ins = new HttpClientUtil();
                }
            }
        }
        return ins;
    }

    public String do_get_with_json_result(String uri) {
        if (wallet_config.getEnableLog()) {
            log.info("uri:{}", uri);
        }
        String json = null;
        HttpResponse response = null;
        try {
            HttpGet request = new HttpGet(uri);
            request.setConfig(config);
            response = client.execute(request);
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                json = EntityUtils.toString(response.getEntity(), Charset.forName(charset));
            }
        } catch (Exception e) {
            log.error(e);
            return null;
        } finally {
            try {
                if (response != null) {
                    EntityUtils.consume(response.getEntity());
                }
            } catch (IOException e) {
                log.error(e);
            }
        }
        if (wallet_config.getEnableLog()) {
            log.info("Result: {}", json);
        }
        return json;
    }

    public String do_post_with_json_result(String uri, Map<String, String> paramMap) {
        if (wallet_config.getEnableLog()) {
            log.info("uri:{}", uri);
            log.info("parma: {}", JSON.toJSONString(paramMap));
        }
        String json = null;
        HttpResponse response = null;
        try {
            String url = wallet_config.getDomain().concat(uri);
            HttpPost request = new HttpPost(url);

            request.setConfig(config);

            request.setHeader("apiKey", wallet_config.getApiKey());

            List<NameValuePair> params = new ArrayList<NameValuePair>(0);
            if (paramMap != null && !paramMap.isEmpty()) {
                for (String key : paramMap.keySet()) {
                    params.add(new BasicNameValuePair(key, paramMap.get(key)));
                }
                request.setEntity(new UrlEncodedFormEntity(params, charset));
            }
            response = client.execute(request);
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                json = EntityUtils.toString(response.getEntity(), Charset.forName(charset));
            }
            request.releaseConnection();
        } catch (Exception e) {
            log.error(e);
            return null;
        } finally {
            try {
                if (response != null) {
                    EntityUtils.consume(response.getEntity());
                }
            } catch (IOException e) {
                log.error(e);
            }
        }
        if (wallet_config.getEnableLog()) {
            log.info("Result: {}", json);
        }
        return json;
    }
}
