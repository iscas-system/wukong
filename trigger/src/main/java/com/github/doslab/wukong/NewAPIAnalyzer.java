/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.doslab.wukong;

import java.io.File;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @version 2.3.0
 * @since 2021.2.15
 * 
 **/
public class NewAPIAnalyzer extends AbstractAnalyzer {

	protected ArrayNode list = new ObjectMapper().createArrayNode();
	
	public NewAPIAnalyzer() throws Exception {
		super();
	}

	public static void main(String[] args) throws Exception {
		new NewAPIAnalyzer().analyse();
	}

	@Override
	public void analyse() throws Exception {
		for (File file : new File("jsons").listFiles()) {

			try {
				CloudMetadata ccm = new ObjectMapper().readValue(file, CloudMetadata.class);
				CloudAPIAnalyzer cmd = new CloudAPIAnalyzer(ccm, new CloudClassloader(ccm));
				Map<String, JsonNode> nodes = cmd.extractCloudAPIs();
				ObjectNode item = new ObjectMapper().createObjectNode();
				for (String key : nodes.keySet()) {
					item.put("provider", ccm.kind);
					item.put("artifactId", ccm.getDependency().get(0).getArtifactId());
					item.put("version", ccm.getDependency().get(0).getVersion());
					item.put("operator", key);
					list.add(item);
				}
			} catch (Exception ex) {
				System.out.println(ex);
				continue;
			}
		}
	}

}
