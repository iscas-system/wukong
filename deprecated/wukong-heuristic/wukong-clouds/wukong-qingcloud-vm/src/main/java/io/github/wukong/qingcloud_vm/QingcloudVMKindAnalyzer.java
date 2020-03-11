/**
 * Copyright (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.wukong.qingcloud_vm;

import com.qingcloud.sdk.model.IaasParamBody;
import com.qingcloud.sdk.service.InstanceService;

import io.github.wukong.core.anas.ParamAndRespPatternAnalyzer;

/**
 * https://docs.qingcloud.com/product/computing/
 * https://github.com/yunify/qingcloud-sdk-java
 *
 * @author wuheng@otcaix.iscas.ac.cn
 * @since  2019/5/8
 */
public class QingcloudVMKindAnalyzer extends ParamAndRespPatternAnalyzer {

	public QingcloudVMKindAnalyzer() {
		super();
	}

	@Override
	public String getClient() {
		return InstanceService.class.getName();
	}

	@Override
	protected String getSuperclass() {
		return IaasParamBody.class.getName();
	}

}
