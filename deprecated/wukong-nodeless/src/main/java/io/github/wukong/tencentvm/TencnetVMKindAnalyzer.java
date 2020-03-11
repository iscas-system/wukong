/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package io.github.wukong.tencentvm;

import com.tencentcloudapi.common.AbstractModel;

import io.github.wukong.core.anas.ParamAndRespPatternAnalyzer;

/**
 * https://cloud.tencent.com/document/api/213/15730
 * 
 * @author wuheng@iscas.ac.cn
 * @since  2019.1
 */
public class TencnetVMKindAnalyzer extends ParamAndRespPatternAnalyzer {

	@Override
	public String getClient() {
		return WukongTencentVMClient.class.getName();
	}

	@Override
	protected String getSuperclass() {
		return AbstractModel.class.getName();
	}

}
