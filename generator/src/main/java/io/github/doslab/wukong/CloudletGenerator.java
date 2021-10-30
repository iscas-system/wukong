/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.doslab.wukong;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.doslab.wukong.CloudClassloader;
import io.github.doslab.wukong.CloudGenerator;
import io.github.doslab.wukong.CloudMetadata;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @version 2.3.0
 * @since 2021.2.15
 * 
 **/
public class CloudletGenerator extends AbstractTask {


	public CloudletGenerator() throws Exception {
		super();
	}

	public static void main(String[] args) throws Exception {
		new CloudletGenerator().doTask();
	}

	@Override
	public void doTask() throws Exception {
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

}
