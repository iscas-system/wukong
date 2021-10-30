/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.doslab.wukong;

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

import io.github.doslab.wukong.utils.FileUtils;
import io.github.doslab.wukong.utils.HttpUtils;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @version 2.3.0
 * @since 2021.2.15
 * 
 **/
public class CloudDescGenerator extends AbstractGenerator {

	public static final String DEPEND_CONFIG = "results/versions.json";
	
	public static final String CLIENT_CONFIG = "conf/client.list";
	
	public final ArrayNode items = new ObjectMapper().createArrayNode();


	@Override
	public void doAnalyse() throws Exception {
		JsonNode clients =  new ObjectMapper().readTree(new File(CLIENT_CONFIG));
		JsonNode depends =  new ObjectMapper().readTree(new File(DEPEND_CONFIG));
		
		for (JsonNode node : depends) {
			ObjectNode item = new ObjectMapper().createObjectNode();
			
			for (JsonNode meta: clients.get(depends.get("type").asText())) {
				item.put("kind", meta.get("name").asText());
				item.put("version", node.get("version").asText());
				item.put("client", meta.get("client").asText());
				item.put("initClient", meta.get("initClient").asText());
				item.set("dependencies", node.get("dependencies"));
			}
			
		}
	}

	@Override
	public void doGenerate() throws Exception {
		
	}
	
}
