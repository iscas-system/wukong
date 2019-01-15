/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.wukong.googlece;


import com.github.wukong.core.anas.ParamAndRespPatternAnalyzer;
import com.github.wukong.googlece.models.AbstractGoogleRequest;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * @since  2019.1
 */
public class GoogleGCEKindAnalyzer extends ParamAndRespPatternAnalyzer {

	@Override
	public String getClient() {
		return WukongGoogleGCEClient.class.getName();
	}

	@Override
	protected String getSuperclass() {
		return AbstractGoogleRequest.class.getName();
	}

}
