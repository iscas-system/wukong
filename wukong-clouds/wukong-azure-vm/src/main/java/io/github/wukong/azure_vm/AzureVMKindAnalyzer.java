/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.wukong.azurevm;


import com.github.wukong.azurevm.models.AbstractAzureRequest;
import com.github.wukong.core.anas.ParamAndRespPatternAnalyzer;

/**
 * @author wuheng@iscas.ac.cn
 * @since  2019.1
 */
public class AzureVMKindAnalyzer extends ParamAndRespPatternAnalyzer {

	@Override
	public String getClient() {
		return WukongComputeManagementClientImpl.class.getName();
	}

	@Override
	protected String getSuperclass() {
		return AbstractAzureRequest.class.getName();
	}

}
