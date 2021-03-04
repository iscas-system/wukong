/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.doslab.wukong;

import java.io.BufferedReader;
import java.io.InputStreamReader;
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
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @version 2.3.0
 * @since 2020.2.15
 * 
 **/
public class HttpRequestTest {

	public static final String KEY = "vbtn release";
	
	public static final String DATETIME_STR_START = "</td><td>";
	
	public static final String DATETIME_STR_END   = "</td></tr>";
	
	public static void main(String[] args) throws Exception {
		
		CloseableHttpClient client = createDefaultHttpClient();
		HttpGet request = new HttpGet(new URI("https://mvnrepository.com/artifact/com.aliyun/aliyun-java-sdk-ecs"));
		HttpEntity entity = client.execute(request).getEntity();
		BufferedReader br = new BufferedReader(new InputStreamReader(entity.getContent()));
		String  line = null;
		while ((line = br.readLine()) != null) {
			if (line.contains("aliyun-java-sdk-ecs") && line.contains(KEY)) {
				try {
				System.out.println("----");
				System.out.println(line);
				int stx = line.indexOf(DATETIME_STR_START);
				int etx = line.indexOf(DATETIME_STR_END);
				System.out.println(line.substring(stx + DATETIME_STR_START.length(), etx));
				} catch (Exception ex) {
					
				}
			}
		}
	}

	protected static CloseableHttpClient createDefaultHttpClient() {

		SocketConfig socketConfig = SocketConfig.custom().setSoKeepAlive(true).setSoTimeout(0).setSoReuseAddress(true)
				.build();

		RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(0).setConnectionRequestTimeout(0)
				.setSocketTimeout(0).build();

		return createDefaultHttpClientBuilder().setConnectionTimeToLive(0, TimeUnit.SECONDS)
				.setDefaultSocketConfig(socketConfig).setDefaultRequestConfig(requestConfig)
				.setKeepAliveStrategy(new DefaultConnectionKeepAliveStrategy())
				.setConnectionReuseStrategy(new DefaultClientConnectionReuseStrategy())
				.setServiceUnavailableRetryStrategy(new DefaultServiceUnavailableRetryStrategy()).build();
	}

	protected static HttpClientBuilder createDefaultHttpClientBuilder() {
		return HttpClients.custom();

	}

}
