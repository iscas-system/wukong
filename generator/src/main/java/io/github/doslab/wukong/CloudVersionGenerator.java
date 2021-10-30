/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.doslab.wukong;

import java.io.BufferedReader;
import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import io.github.doslab.wukong.utils.FileUtils;
import io.github.doslab.wukong.utils.JsonUtils;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @version 2.3.0
 * @since 2021.2.15
 * 
 **/
public class CloudVersionGenerator extends AbstractGenerator {

	public static final String MAVEN_URL_PREFIX    = "https://repo.maven.apache.org/maven2/";
	
	public static final String MAVEN_DEPEND_CONFIG = "conf/maven.list";
	
	public static final String OUTPUT              = "results/versions.json";
	
	public final ArrayNode items = new ObjectMapper().createArrayNode();

	@Override
	public void generate() throws Exception {
		doAnalyse();
		doGenerate();
	}

	public void doAnalyse() throws Exception {
		BufferedReader br = FileUtils.read(MAVEN_DEPEND_CONFIG);
		String line = null;
		while ((line = br.readLine()) != null) {
			String groupId = line.split("=")[0];
			String[] coreAndArtifactId = line.split("=")[1].split(",");
			
			JsonNode core = null;
			if (coreAndArtifactId.length == 2) {
			    String coreUrl = MAVEN_URL_PREFIX + groupId.replace(".", "/") + "/" 
			    								+ coreAndArtifactId[0] + "/maven-metadata.xml";
			    core = JsonUtils.depFromMavenMeta(coreUrl);
			} 
			
			String artifactId = coreAndArtifactId[coreAndArtifactId.length - 1];
			for (JsonNode node : JsonUtils.depFromMavenPage(
						groupId, artifactId)) {
				ObjectNode item = new ObjectMapper().createObjectNode();
				item.put("type", groupId);
				item.put("version", node.get("version").asText());
				item.put("release", node.get("release").asText());
				
				ArrayNode deps = new ObjectMapper().createArrayNode();
				if (core != null) {
					deps.add(core);
				}
				
				((ObjectNode) node).remove("release");
				deps.add(node);
				item.set("dependencies", deps);
				
				items.add(item);
				m_logger.info("analysing " + item.toPrettyString());
			}
		}
	}

	public void doGenerate() throws Exception {
		FileUtils.write(new File(OUTPUT), items.toPrettyString());
		m_logger.info("generating " + OUTPUT);
	}
}
