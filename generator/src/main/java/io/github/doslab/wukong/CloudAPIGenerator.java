/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.doslab.wukong;

import java.io.File;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import io.github.doslab.wukong.utils.FileUtils;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @version 2.3.0
 * @since 2021.2.15
 * 
 **/
public class CloudAPIGenerator extends AbstractGenerator {

	protected ArrayNode items = new ObjectMapper().createArrayNode();

	@Override
	public void doAnalyse() throws Exception {
		for (File file : new File("jsons").listFiles()) {
			try {
				CloudMetadata ccm = new ObjectMapper().readValue(file, CloudMetadata.class);
				CloudAPIAnalyzer cmd = new CloudAPIAnalyzer(ccm, new CloudClassloader(ccm));
				Map<String, JsonNode> nodes = cmd.extractCloudAPIs();
				ObjectNode item = new ObjectMapper().createObjectNode();
				item.put("kind", ccm.kind);
				item.put("version", ccm.getDependencies().
						get(ccm.getDependencies().size() - 1).getVersion());
				
				ArrayNode operators = new ObjectMapper().createArrayNode();
				for (String key : nodes.keySet()) {
					operators.add(nodes.get(key).get("lifecycle"));
				}
				
				item.set("operators", operators);
				items.add(item);
				m_logger.info("analysing " + file);
			} catch (Exception ex) {
				m_logger.warning("ignore " + ex);
			}
		}

	}

	@Override
	public void doGenerate() throws Exception {
		for (JsonNode item : items) {
			String file = "apis/" + item.get("kind").asText() + 
					"-" + item.get("version").asText() + ".json";
			FileUtils.write(new File(file), item.toPrettyString());
			m_logger.info("generating " + file);
		}
	}
}
