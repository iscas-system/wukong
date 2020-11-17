/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.doslab.wukong;

import java.io.File;
import java.io.FileWriter;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @version 2.3.0
 * @since 2020.2.15
 * 
 **/
public class CloudAPIAnalyzerWithConifgTest {

	
	/***************************************************************
	 * 
	 *    Getter
	 * 
	 ***************************************************************/
	
	
	static String type = "TencentCVM";
	
	public static void main(String[] args) throws Exception {
		
		File root = new File("jsons", type.toLowerCase());
		
		if (!root.exists()) {
			root.mkdirs();
		}
		
		CloudMetadata ccm = new ObjectMapper().readValue(
							new File("conf/vm/tencent-cvm.json"), 
							CloudMetadata.class);
		CloudAPIAnalyzer cmd = new CloudAPIAnalyzer(ccm, new CloudClassloader(ccm));
		Map<String, JsonNode> nodes = cmd.extractCloudAPIs();
		for (String key: nodes.keySet()) {
			System.out.println("---");
			ObjectNode json = new ObjectMapper().createObjectNode();
			json.put("apiVersion", "cloudplus.io/v1alpha3");
			json.put("kind", "Template");
			
			ObjectNode meta = new ObjectMapper().createObjectNode();
			meta.put("name", type.toLowerCase() + "-" + key.toLowerCase());
			json.set("metadata", meta);
			json.put("type", type);
			
			ObjectNode spec = new ObjectMapper().createObjectNode();
			spec.set(key, nodes.get(key));
			json.set("spec", spec);
			
			FileWriter fw = new FileWriter(new File(root, type.toLowerCase() + "-" + key.toLowerCase() + ".json"));
			fw.write(json.toPrettyString());
			fw.close();
			System.out.println(json.toPrettyString());
		}
	}
	
}
