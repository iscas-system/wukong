/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.doslab.wukong.utils;

import java.net.URI;
import java.util.concurrent.TimeUnit;

import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.config.SocketConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultClientConnectionReuseStrategy;
import org.apache.http.impl.client.DefaultConnectionKeepAliveStrategy;
import org.apache.http.impl.client.DefaultServiceUnavailableRetryStrategy;
import org.apache.http.impl.client.HttpClients;

/**
 * 
 * @author tangting18@otcaix.iscas.ac.cn
 * @since 2019.12.10
 * 
 * This code comes from Internet, it works well in our case.
 */
public class HttpUtils {

	public static CloseableHttpClient createDefaultHttpClient() {

		SocketConfig socketConfig = SocketConfig.custom().setSoKeepAlive(true).setSoTimeout(0).setSoReuseAddress(true)
				.build();

		RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(0).setConnectionRequestTimeout(0)
				.setSocketTimeout(0).build();

		return HttpClients.custom().setConnectionTimeToLive(0, TimeUnit.SECONDS)
				.setDefaultSocketConfig(socketConfig).setDefaultRequestConfig(requestConfig)
				.setKeepAliveStrategy(new DefaultConnectionKeepAliveStrategy())
				.setConnectionReuseStrategy(new DefaultClientConnectionReuseStrategy())
				.setServiceUnavailableRetryStrategy(new DefaultServiceUnavailableRetryStrategy()).build();
	}
	
	
	public static HttpEntity getResponse(String url) throws Exception {
		CloseableHttpClient client = HttpUtils.createDefaultHttpClient();
		HttpGet request = new HttpGet(new URI(url));
		return client.execute(request).getEntity();
	}
	
}
