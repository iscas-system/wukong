/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package io.github.wukong.aws_ec2;


import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.services.ec2.AmazonEC2Client;

import io.github.wukong.core.anas.ParamAndRespPatternAnalyzer;

/**
 * @author wuheng@iscas.ac.cn
 * @since  2019.1
 */
public class AmazonCE2KindAnalyzer extends ParamAndRespPatternAnalyzer {

	@Override
	public String getClient() {
		return AmazonEC2Client.class.getName();
	}

	@Override
	protected String getSuperclass() {
		return AmazonWebServiceRequest.class.getName();
	}

}
