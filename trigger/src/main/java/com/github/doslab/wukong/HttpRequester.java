/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.doslab.wukong;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
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

import com.github.doslab.wukong.utils.StringUtils;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @version 2.3.0
 * @since 2020.2.15
 * 
 **/
public class HttpRequester {

	public static final String VERSION_STR_START = "vbtn release\">";

	public static final String VERSION_STR_END = "</a></td><td>";

	public static final String DATETIME_STR_START = "</td><td>";

	public static final String DATETIME_STR_END = "</td></tr>";

	public static final String MAVEN_URL_PREFIX = "https://mvnrepository.com/artifact/";

	public static final String DEFAULT_GROUPID = "com.aliyun";

	public static final String DEFAULT_ARTIFCAT = "aliyun-java-sdk-ecs";

	public static void main(String[] args) throws Exception {

		Class.forName("org.postgresql.Driver").newInstance();
		String url = "jdbc:postgresql://124.70.64.232:30306/knowledge";
		Connection conn = DriverManager.getConnection(url, "postgres", "onceas");

		String groupId = System.getenv("groupId") == null ? DEFAULT_GROUPID : System.getenv("groupId");
		String artifactId = System.getenv("artifactId") == null ? DEFAULT_ARTIFCAT : System.getenv("artifactId");
		String fullUrl = MAVEN_URL_PREFIX + groupId + "/" + artifactId;
		CloseableHttpClient client = createDefaultHttpClient();
		HttpGet request = new HttpGet(new URI(fullUrl));
		HttpEntity entity = client.execute(request).getEntity();
		BufferedReader br = new BufferedReader(new InputStreamReader(entity.getContent()));
		String line = null;
		while ((line = br.readLine()) != null) {
			if (line.contains(artifactId) && line.contains(VERSION_STR_START)) {
				try {
					
					String version = StringUtils.toMiddleString(line, VERSION_STR_START, VERSION_STR_END);
					PreparedStatement ps = conn.prepareStatement("INSERT INTO versions(groupid,artifactid,version,release) values(?,?,?,?)");
					ps.setString(1, groupId);
					ps.setString(2, artifactId);
					ps.setString(3, version);
					String dateTime = StringUtils.toMiddleString(line, DATETIME_STR_START, DATETIME_STR_END);
					String[] splits = dateTime.split(",");
					ps.setTimestamp(4, new Timestamp(Integer.parseInt(splits[1].trim()) - 1900, 
							StringUtils.toMonth(splits[0]), 1, 0, 0, 0, 0));
					ps.executeUpdate();
				} catch (Exception ex) {
					System.out.println(ex);

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
