/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.wukong.jdcloudvm;

import com.jdcloud.sdk.service.JdcloudRequest;
import com.jdcloud.sdk.service.vm.client.VmClient;

import io.github.wukong.core.anas.ParamAndRespPatternAnalyzer;

/**
 * https://docs.jdcloud.com/cn/virtual-machines/api/overview
 * 
 * @author wuheng@iscas.ac.cn
 * @since  2019.1
 */
public class JDcloudVMEKindAnalyzer extends ParamAndRespPatternAnalyzer {

	@Override
	public String getClient() {
		return VmClient.class.getName();
	}

	@Override
	protected String getSuperclass() {
		return JdcloudRequest.class.getName();
	}

}
