/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.doslab.wukong;

import java.util.logging.Logger;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @version 2.3.0
 * @since 2021.2.15
 * 
 **/
public abstract class AbstractGenerator {

	protected static final Logger m_logger = Logger.getLogger(AbstractGenerator.class.getName());
	
	public void generate() throws Exception {
		doAnalyse();
		doGenerate();
	}
	
	public abstract void doAnalyse() throws Exception;
	
	public abstract void doGenerate() throws Exception;
	
}
