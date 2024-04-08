/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.doslab.wukong;

import java.util.HashMap;
import java.util.Map;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.github.doslab.wukong.utils.ReqUtil;

import io.github.kubesys.devfrk.spring.cores.AbstractHttpHandler;
import io.github.kubesys.devfrk.tools.annotations.ServiceDefinition;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @version 2.3.0
 * @since 2020.10.15
 * 
 **/
@ServiceDefinition
public class DemoService extends AbstractHttpHandler {

	/**
	 * clients
	 */
	protected Map<String, String> urls = new HashMap<>();
	
	protected Map<String, String> cookies = new HashMap<>();

	protected static String JSON = "{\r\n"
			+ "	\"listCluster\": {\r\n"
			+ "		\"url\": \"/kapis/resources.kubesphere.io/v1alpha3/clusters/host\",\r\n"
			+ "		\"type\": \"get\"\r\n"
			+ "	}\r\n"
			+ "}";
	
	/**
	 * @param id
	 * @param metadata
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public void createClient(
			String id,
			String url,
			String cookie
			) throws Exception {
		
		urls.put(id, url);
		cookies.put(id, cookie);
		
	}
	
	public JsonNode getClients(
			) throws Exception {
		
		ArrayNode list = new ObjectMapper().createArrayNode();
		
		for (String key : urls.keySet()) {
			ObjectNode node = new ObjectMapper().createObjectNode();
			node.put("id", key);
			node.put("url", urls.get(key));
			node.put("cookie", cookies.get(key));
			list.add(node);
		}
		
		return list;
	}
	
//	@ApiOperation(value = "根据分析的接口进行访问")
	public Object execRequest(
			//@ApiParam(value = "公有云账户ID", required = true, example = "asasd") 
			String id, 
			//@ApiParam(value = "生命周期管理Json，每个Json不一样", required = true, example = "见createClient的输出") 
			JsonNode data) throws Exception  {
		
		JsonNode config = new ObjectMapper().readTree(JSON);
		
		String lifecycle = data.get("lifecycle").asText();
		if (!config.has(lifecycle)) {
			throw new Exception("unsupport lifecycle, please using getLifecycles for more detail");
		}
		
		JsonNode json = config.get(lifecycle);
		
		String path = json.get("url").asText();
		
		String type = json.get("type").asText();
		
		if (type.equals("get")) {
			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpGet httpget = ReqUtil.get(cookies.get(id), urls.get(id) + path);
			CloseableHttpResponse  resp = httpClient.execute(httpget);
			return new ObjectMapper().readTree(resp.getEntity().getContent());
		}
		
		return null;
	}

}
