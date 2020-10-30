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
public class CloudGeneratorWithConifgTest {

	
	/***************************************************************
	 * 
	 *    Getter
	 * 
	 ***************************************************************/
	
	public static void main(String[] args) throws Exception {
		
		CloudMetadata ccm = new ObjectMapper().readValue(
							new File("conf/vm/jdcloud-vm.json"), 
							CloudMetadata.class);
		CloudGenerator cmd  = new CloudGenerator(ccm, new CloudClassloader(ccm));
		cmd.generateJar();
	}

	
}
