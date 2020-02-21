/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package io.github.wukong.amazonvm;


import com.amazonaws.AmazonWebServiceRequest;

import io.github.wukong.core.anas.ParamAndRespPatternAnalyzer;

/**
 * @author wuheng@iscas.ac.cn
 * @since  2019.1
 */
public class AmazonCE2KindAnalyzer extends ParamAndRespPatternAnalyzer {

	@Override
	public String getClient() {
		return WukongAmazonVMClient.class.getName();
	}

	@Override
	protected String getSuperclass() {
		return AmazonWebServiceRequest.class.getName();
	}

}
