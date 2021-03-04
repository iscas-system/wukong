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
public class NewAPIAnalyzer extends AbstractAnalyzer {

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
				for (String key: nodes.keySet()) {
					ps.setString(1, ccm.kind);
					String artifactId = ccm.getDependency().get(0).getArtifactId();
					ps.setString(2, artifactId);
					String version = ccm.getDependency().get(0).getVersion();
					ps.setString(3, version);
					ps.setString(4, key.toLowerCase());
					ps.setInt(5, 0);
					ps.executeUpdate();
					System.out.println("insert " + ccm.kind + "," + artifactId + "," + version);
					
				}
			} catch (Exception ex) {
				
			}
		}

	}

	@Override
	public String sql() {
		return "INSERT INTO apis(provider, artifactId, version, operator, used) values(?,?,?,?,?)";
	}

}
