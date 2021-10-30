/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.doslab.wukong.utils;

import java.io.BufferedReader;
import java.sql.Timestamp;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;


/**
 * 
 * @author wuheng@iscas.ac.cn
 * @since 2021.10.30
 * 
 */
public class JsonUtils {

	public static JsonNode depFromMavenMeta(String url) throws Exception {
		XmlMapper mapper = new XmlMapper();
	    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	    JsonNode json = mapper.readValue(HttpUtils.getResponse(url).getContent(), JsonNode.class);
	    String datetime = json.get("versioning").get("lastUpdated").asText();
		return toDependency(json.get("groupId").asText(), 
	    					json.get("artifactId").asText(), 
	    					json.get("versioning").get("latest").asText(), 
	    					new Timestamp(Long.parseLong(datetime)));
	}
	
	public static ArrayNode depFromMavenPage(String groupId, String artifactId) throws Exception {
		ArrayNode list = new ObjectMapper().createArrayNode();
		
		String fullline = null;
		BufferedReader brs = FileUtils.read(groupId, artifactId);
		while ((fullline = brs.readLine()) != null) {
			try {
				if (fullline.indexOf("href") != -1
							&& fullline.indexOf("..") == -1 
							&& fullline.indexOf("xml") == -1) {
					list.add(toDependency(groupId, artifactId, 
							versionFromMavenPage(fullline), 
							timeFromMavenPage(fullline)));
				}
			} catch (Exception ex) {
				
			}
		}
		return list;
	}

	@SuppressWarnings("deprecation")
	private static Timestamp timeFromMavenPage(String fullline) {
		String datatime = fullline.split("\\s+")[3].trim();
		String[] splits = datatime.split("-");
		return new Timestamp(
				Integer.parseInt(splits[0].trim()) - 1900, 
				Integer.parseInt(splits[1].trim()), 
				Integer.parseInt(splits[2].trim()), 
				0, 0, 0, 0);
	}

	private static String versionFromMavenPage(String fullline) {
		int stx = fullline.indexOf("\"");
		int edx = fullline.indexOf("/\"");
		return fullline.substring(stx + 1, edx);
	}
	
	@SuppressWarnings("deprecation")
	public static JsonNode toDependency(String groupId, String artifactId, String version, Timestamp time) {
		ObjectNode node = new ObjectMapper().createObjectNode();
		node.put("groupId", groupId);
		node.put("artifactId", artifactId);
		node.put("version", version);
		node.put("release", time.toLocaleString());
	    return node;
	}
}
