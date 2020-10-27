/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.doslab.wukong;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.doslab.wukong.analyzer.CrossCloudAPIAnalyzer;
import com.github.doslab.wukong.analyzer.RequestWithObjectPatternAnalyzer;
import com.github.doslab.wukong.models.CloudMetadataModel;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @version 2.3.0
 * @since 2020.2.15
 * 
 **/
public class APIAnalyzerTest {

	
	/***************************************************************
	 * 
	 *    Getter
	 * 
	 ***************************************************************/
	
	public static void main(String[] args) throws Exception {
		CrossCloudAPIAnalyzer api = new RequestWithObjectPatternAnalyzer(
						new ObjectMapper().readValue(
							new File("conf/amazoneks.json"), 
							CloudMetadataModel.class));
		System.out.println(api.extraCloudAPIs());
	}

	
}
