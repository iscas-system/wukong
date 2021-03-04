/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.doslab.wukong;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Timestamp;

import org.apache.http.HttpEntity;

import com.github.doslab.wukong.utils.FileUtils;
import com.github.doslab.wukong.utils.HttpUtils;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @version 2.3.0
 * @since 2021.2.15
 * 
 **/
public class NewVersionAnalyzer extends AbstractAnalyzer {

	
	public static final String MAVEN_URL_PREFIX = "https://repo.maven.apache.org/maven2/";
	
	public static final String MAVEN_DEPEND_CONFIG = "conf/maven.list";           

	public NewVersionAnalyzer() throws Exception {
		super();
	}
	
	public static void main(String[] args) throws Exception {
		new NewVersionAnalyzer().analyse();
	}

	@Override
	public void analyse() throws Exception {
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
			if (fullline.contains("href=") 
						&& fullline.indexOf("..") == -1 
						&& fullline.indexOf("xml") == -1) {
				try {
					int stx = fullline.indexOf("\"");
					int edx = fullline.indexOf("/\"");
					String version = fullline.substring(stx + 1, edx);
					String datatime = fullline.split("\\s+")[3].trim();
					ps.setString(1, groupId);
					ps.setString(2, artifactId);
					ps.setString(3, version);
					
					
					String[] splits = datatime.split("-");
					ps.setTimestamp(4, new Timestamp(
							Integer.parseInt(splits[0].trim()) - 1900, 
							Integer.parseInt(splits[1].trim()), 
							Integer.parseInt(splits[2].trim()), 
							0, 0, 0, 0));
					ps.executeUpdate();
					System.out.println("insert " + groupId + "," + artifactId + "," + version);
				} catch (Exception ex) {
					break;
				}
			}
		}
	}
	
	@Override
	public String sql() {
		return "INSERT INTO versions(groupid,artifactid,version,release) values(?,?,?,?)";
	}

}
