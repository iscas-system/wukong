/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.doslab.wukong;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpEntity;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.github.doslab.wukong.utils.FileUtils;
import com.github.doslab.wukong.utils.HttpUtils;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @version 2.3.0
 * @since 2021.2.15
 * 
 **/
public class GenerateConfigAnalyzer extends AbstractAnalyzer {

	
	public static final String MAVEN_URL_PREFIX = "https://repo.maven.apache.org/maven2/";
	
	public static final String MAVEN_DEPEND_CONFIG = "conf/maven.list";
	
	public static final String DESC_CONFIG = "conf/vm.list";
	
	public static final Map<String, String> coreMapper = new HashMap<>();
	
	public static final Map<String, String> coreVersionMapper = new HashMap<>();
	
	public final JsonNode json;
	
	

	public GenerateConfigAnalyzer() throws Exception {
		super();
		this.json = new ObjectMapper().readTree(new File(DESC_CONFIG));
	}
	
	public static void main(String[] args) throws Exception {
		new GenerateConfigAnalyzer().analyse();
	}

	@Override
	public void analyse() throws Exception {
		BufferedReader br = FileUtils.read(MAVEN_DEPEND_CONFIG);
		String line = null;
		while ((line = br.readLine()) != null) {
			String[] strs = line.split("=");
			String groupId = strs[0];
			String artifactId = strs[1];
			
			if (!json.has(groupId)) {
				continue;
			}
			
			if (artifactId.contains("core")) {
				XmlMapper mapper = new XmlMapper();
			    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			    String fullUrl = MAVEN_URL_PREFIX + groupId.replace(".", "/") + "/" 
			    								+ artifactId + "/maven-metadata.xml";
			    JsonNode json = mapper.readValue(HttpUtils.getResponse(fullUrl).getContent(), JsonNode.class);
				coreMapper.put(groupId, artifactId);
				coreVersionMapper.put(groupId, json.get("versioning").get("latest").asText());
				continue;
			} else {
				String fullUrl = MAVEN_URL_PREFIX + groupId.replace(".", "/") + "/" + artifactId;
				doGenerate(groupId, artifactId, HttpUtils.getResponse(fullUrl));
			}
		}
		
	}

	protected void doGenerate(String groupId, String artifactId, HttpEntity entity) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(entity.getContent()));
		String fullline = null;
		while ((fullline = br.readLine()) != null) {
			if (fullline.contains("href=") 
						&& fullline.indexOf("..") == -1 
						&& fullline.indexOf("xml") == -1) {
				
				try {
					int stx = fullline.indexOf("\"");
					int edx = fullline.indexOf("/\"");
					String version = fullline.substring(stx + 1, edx);
					
					
					ObjectNode node =  new ObjectMapper().createObjectNode();
					node.put("version", version);
					node.put("kind", json.get(groupId).get("name").asText());
					node.put("client", json.get(groupId).get("client").asText());
					node.put("initClient", json.get(groupId).get("initClient").asText());
					
					ArrayNode depends =  new ObjectMapper().createArrayNode();
					ObjectNode item =  new ObjectMapper().createObjectNode();
					item.put("groupId", groupId);
					item.put("artifactId", artifactId);
					item.put("version", version);
					depends.add(item);
					
					if (coreMapper.containsKey(groupId)) {
						ObjectNode item2 =  new ObjectMapper().createObjectNode();
						item2.put("groupId", groupId);
						item2.put("artifactId", coreMapper.get(groupId));
						item2.put("version", coreVersionMapper.get(groupId));
						depends.add(item2);
					}
					
					node.set("dependency", depends);
					
					File file = new File("jsons", json.get(groupId).get("name").asText() 
														+ "-" + version + ".json");
					if (!file.exists()) {
						FileUtils.write(file, node.toPrettyString());
						System.out.println(node.toPrettyString());
					}
					
					
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
	}
	
	@Override
	public String sql() {
		return "INSERT INTO versions(groupid,artifactid,version,release) values(?,?,?,?)";
	}

}
