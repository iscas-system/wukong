/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.doslab.wukong;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @version 2.3.0
 * @since 2021.2.15
 * 
 **/
public class CloudletGenerator extends AbstractGenerator {

	protected File[] files;

	@Override
	public void doAnalyse() throws Exception {
		this.files = new File("jsons").listFiles();
		m_logger.info("analysing jsons/");
	}

	@Override
	public void doGenerate() throws Exception {
		for (File file : this.files) {
			try {
				CloudMetadata ccm = new ObjectMapper().readValue(file, CloudMetadata.class);
				CloudGenerator cmd = new CloudGenerator(ccm, new CloudClassloader(ccm));
				cmd.generateJar();
				m_logger.info("Generating cloudlet by " + file.getName());
			} catch (Exception ex) {
				
			}
		}
	}

}
