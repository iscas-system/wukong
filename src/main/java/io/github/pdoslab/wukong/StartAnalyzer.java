/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package io.github.pdoslab.wukong;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import com.alibaba.fastjson.JSON;

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
			generate(strJson);
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
