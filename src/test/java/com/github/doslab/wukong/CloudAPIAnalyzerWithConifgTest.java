/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.doslab.wukong;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @version 2.3.0
 * @since 2020.2.15
 * 
 **/
public class CloudAPIAnalyzerWithConifgTest {

	
	/***************************************************************
	 * 
	 *    Getter
	 * 
	 ***************************************************************/
	
	public static void main(String[] args) throws Exception {
		CloudGenerator cmd  = new CloudGenerator(new ObjectMapper().readValue(
							new File("conf/amazoneks.json"), 
							CloudMetadata.class));
		cmd.exec();
	}

	
}
