/**
 * Copyright (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.doslab.wukong;

import java.util.logging.Logger;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @version 2.3.0
 * @since 2021.2.15
 * 
 **/
public abstract class AbstractAnalyzer {

	protected static final Logger m_logger = Logger.getLogger(AbstractAnalyzer.class.getName());
	
	public abstract void analyse() throws Exception;
	
}
