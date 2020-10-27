/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.doslab.wukong;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.doslab.wukong.cmds.APIGenerator;
import com.github.doslab.wukong.models.CloudMetadataModel;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @version 2.3.0
 * @since 2020.2.15
 * 
 **/
public class APIGeneratorWithConifgTest {

	
	/***************************************************************
	 * 
	 *    Getter
	 * 
	 ***************************************************************/
	
	public static void main(String[] args) throws Exception {
		APIGenerator cmd = new APIGenerator(new ObjectMapper().readValue(
							new File("conf/amazoneks.json"), 
							CloudMetadataModel.class));
		cmd.exec();
	}

	
}
