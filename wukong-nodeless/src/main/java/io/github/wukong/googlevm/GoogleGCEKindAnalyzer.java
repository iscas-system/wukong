/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package io.github.wukong.googlevm;


import io.github.wukong.core.anas.ParamAndRespPatternAnalyzer;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * @since  2019.1
 */
public class GoogleGCEKindAnalyzer extends ParamAndRespPatternAnalyzer {

	@Override
	public String getClient() {
		return WukongGoogleVMClient.class.getName();
	}

	@Override
	protected String getSuperclass() {
		return null;
	}

}
