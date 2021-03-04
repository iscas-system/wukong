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
public class GenerateCloudletAnalyzer extends AbstractAnalyzer {



	public GenerateCloudletAnalyzer() throws Exception {
		super();
	}

	public static void main(String[] args) throws Exception {
		new GenerateCloudletAnalyzer().analyse();
	}

	@Override
	public void analyse() throws Exception {
		for (File file : new File("jsons").listFiles()) {
			try {
				CloudMetadata ccm = new ObjectMapper().readValue(file, CloudMetadata.class);
				CloudGenerator cmd = new CloudGenerator(ccm, new CloudClassloader(ccm));
				cmd.generateJar();
				System.out.println("Generating cloudlet by " + file.getName());
			} catch (Exception ex) {
				
			}
		}

	}

	@Override
	public String sql() {
		return null;
	}

}
