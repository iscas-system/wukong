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
 * @since 2021.2.15
 * 
 **/
public class GenerateCloudletTest {

	public static void main(String[] args) throws Exception {
		CloudMetadata ccm = new ObjectMapper().readValue(new File("jsons/AliyunVM-4.23.9.json"), CloudMetadata.class);
		CloudAPIAnalyzer cmd = new CloudAPIAnalyzer(ccm, new CloudClassloader(ccm));
		Map<String, JsonNode> nodes = cmd.extractCloudAPIs();
		for (String key: nodes.keySet()) {
			System.out.println(key);
		}
	}

}
