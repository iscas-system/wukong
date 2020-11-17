/**
 * Copyright (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.doslab.wukong;

import java.io.File;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.github.kubesys.KubernetesClient;

public class Command  {

	protected static KubernetesClient client = new KubernetesClient(
									System.getenv("kubeUrl"), 
									System.getenv("token"));
	
	public static void generate(CloudMetadata ccm) throws Exception {
		CloudGenerator cmd  = new CloudGenerator(ccm, new CloudClassloader(ccm));
		cmd.generateJar();
	}
	
	public static void register(CloudMetadata ccm) throws Exception {
		String type = ccm.getKind().toLowerCase();
		
		File root = new File("jsons", type);
		
		if (!root.exists()) {
			root.mkdirs();
		}
		
		CloudAPIAnalyzer cmd = new CloudAPIAnalyzer(ccm, new CloudClassloader(ccm));
		Map<String, JsonNode> nodes = cmd.extractCloudAPIs();
		for (String key: nodes.keySet()) {
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
			
			client.createResource(json);
		}
	}
	
	public static void main(String[] args) throws Exception {
		JsonNode json = client.getResource("Account", "default", args[0]);
		CloudMetadata ccm = new ObjectMapper().readValue(json.get("spec").asText(), CloudMetadata.class);
		if (args[1].trim().equals("generate")) {
			generate(ccm);
		} else if (args[1].trim().equals("register")) {
			register(ccm);
		} else {
			throw new Exception("Only support generate and register commands");
		}
	}

}
