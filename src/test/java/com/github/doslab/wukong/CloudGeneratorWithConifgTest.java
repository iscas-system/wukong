/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.doslab.wukong;

import java.io.File;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @version 2.3.0
 * @since 2020.2.15
 * 
 **/
public class CloudGeneratorWithConifgTest {

	
	/***************************************************************
	 * 
	 *    Getter
	 * 
	 ***************************************************************/
	
	public static void main(String[] args) throws Exception {
		CloudAPIAnalyzer cmd = new CloudAPIAnalyzer(new ObjectMapper().readValue(
							new File("conf/amazoneks.json"), 
							CloudMetadata.class));
		Map<String, JsonNode> nodes = cmd.extraCloudAPIs();
		for (String key: nodes.keySet()) {
			System.out.println(key + ":" + nodes.get(key).toPrettyString());
		}
	}

	
}
