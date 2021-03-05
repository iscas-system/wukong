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
 * @since 2021.2.15
 * 
 **/
public class GenerateAPITest {

	public static void main(String[] args) throws Exception {
		CloudMetadata ccm = new ObjectMapper().readValue(new File("jsons/AliyunVM-4.23.9.json"), CloudMetadata.class);
		CloudGenerator cmd = new CloudGenerator(ccm, new CloudClassloader(ccm));
		cmd.generateJar();
	}

}
