/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.doslab.wukong;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.sql.Timestamp;

import org.apache.http.HttpEntity;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import io.github.doslab.wukong.utils.FileUtils;
import io.github.doslab.wukong.utils.HttpUtils;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @version 2.3.0
 * @since 2021.2.15
 * 
 **/
public class CloudVersionGenerator extends AbstractTask {

	public static final String MAVEN_URL_PREFIX    = "https://repo.maven.apache.org/maven2/";
	
	public static final String MAVEN_DEPEND_CONFIG = "conf/maven.list";
	
	public static final String OUTPUT              = "results/versions.json";
	
	public final ArrayNode items = new ObjectMapper().createArrayNode();

	@Override
	public void doTask() throws Exception {
		BufferedReader br = FileUtils.read(MAVEN_DEPEND_CONFIG);
		String line = null;
		while ((line = br.readLine()) != null) {
			String[] strs = line.split("=");
			String groupId = strs[0];
			String artifactId = strs[1];
			String fullUrl = MAVEN_URL_PREFIX + groupId.replace(".", "/") + "/" + artifactId;
			doAnalyse(groupId, artifactId, HttpUtils.getResponse(fullUrl));
		}
		
	}

	@SuppressWarnings("deprecation")
	protected void doAnalyse(String groupId, String artifactId, HttpEntity entity) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(entity.getContent()));
		String fullline = null;
		while ((fullline = br.readLine()) != null) {
			try {
				if (fullline.contains("href=") 
							&& fullline.indexOf("..") == -1 
							&& fullline.indexOf("xml") == -1) {
					ObjectNode item = new ObjectMapper().createObjectNode();
					int stx = fullline.indexOf("\"");
					int edx = fullline.indexOf("/\"");
					String version = fullline.substring(stx + 1, edx);
					item.put("groupId", groupId);
					item.put("artifactId", artifactId);
					item.put("version", version);
					
					String datatime = fullline.split("\\s+")[3].trim();
					String[] splits = datatime.split("-");
					item.put("release", new Timestamp(
							Integer.parseInt(splits[0].trim()) - 1900, 
							Integer.parseInt(splits[1].trim()), 
							Integer.parseInt(splits[2].trim()), 
							0, 0, 0, 0).toLocaleString());
					
					m_logger.info(item.toPrettyString());
					
					items.add(item);
				}
			} catch (Exception ex) {
				m_logger.warning("ignore " + fullline);
			}
		}
		
		FileUtils.write(new File(OUTPUT), items.toPrettyString());
	}
}
