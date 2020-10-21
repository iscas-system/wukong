/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.doslab.wukong;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.doslab.wukong.cmds.AdapterGenerator;
import com.github.doslab.wukong.models.CloudControllerModel;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @version 2.3.0
 * @since 2020.2.15
 * 
 **/
public class AdapterGeneratorWithConifgTest {

	
	/***************************************************************
	 * 
	 *    Getter
	 * 
	 ***************************************************************/
	
	public static void main(String[] args) throws Exception {
		AdapterGenerator cmd = new AdapterGenerator(new ObjectMapper().readValue(
							new File("conf/amazoneks.json"), 
							CloudControllerModel.class));
		cmd.exec();
	}

	
}
