/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.wukong.awsecs;


import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.services.ecs.AmazonECSClient;
import com.github.wukong.core.anas.ParamAndRespPatternAnalyzer;

/**
 * @author wuheng@iscas.ac.cn
 * @since  2019.1
 * 
 * https://docs.aws.amazon.com/zh_cn/AmazonECS/latest/developerguide/logging-using-cloudtrail.html
 */
public class AmazonCE2KindAnalyzer extends ParamAndRespPatternAnalyzer {

	@Override
	public String getClient() {
		return AmazonECSClient.class.getName();
	}

	@Override
	protected String getSuperclass() {
		return AmazonWebServiceRequest.class.getName();
	}

}
