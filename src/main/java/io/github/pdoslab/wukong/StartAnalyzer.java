/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package io.github.pdoslab.wukong;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import io.github.pdoslab.wukong.core.Heuristicv1;
import io.github.pdoslab.wukong.model.JDKInfo;

/**
 * @author tangting18@otcaix.iscas.ac.cn
 * @author wuheng@iscas.ac.cn
 * @since 2019.12.10
 */
public class StartAnalyzer {

	public final static String JDKINFO_FILE = "conf/jdkinfo.conf-aliyunecs";

	public final static StringBuffer sb = new StringBuffer();

	public static void main(String[] args) throws Exception {

		JDKInfo info = JSON.parseObject(new FileInputStream(
					new File(args[0])), JDKInfo.class);

		Class<?> clientClass = Class.forName(info.getClient());
		List<String> objStrs = Heuristicv1.findObjectJSON(info, clientClass.getDeclaredMethods());
		
		for (String strJson : objStrs) {
			JsonNode node = new ObjectMapper().readTree(strJson);
			
			ObjectNode json = new ObjectMapper().createObjectNode();
			json.put("apiVersion", info.getGroup() + "/" + info.getVersion());
			json.put("kind", info.getKind());
			
			ObjectNode meta = new ObjectMapper().createObjectNode();
			meta.put("name", node.get("name").asText());
			json.set("metadata", meta);
			
			ObjectNode spec = new ObjectMapper().createObjectNode();
			ObjectNode oper = new ObjectMapper().createObjectNode();
			
			oper.put("name", node.get("name").asText());
			oper.set("parameters", node.get("api"));
			spec.set("operator", oper);
			
			json.set("sepc", spec);
			
			generate(json.toPrettyString());
		}
		
		System.out.println("Total APIs for " + info.getKind() + ": " + objStrs.size());
		System.out.println(sb);
	}

	private static void generate(String jsonStr) {
		sb.append("\n\n---\n");
		sb.append(jsonStr);
		sb.append("\n---\n");
	}

}
