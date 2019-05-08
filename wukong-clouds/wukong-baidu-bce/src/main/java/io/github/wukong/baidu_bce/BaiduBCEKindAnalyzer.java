/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.wukong.baidubce;

import com.baidubce.model.AbstractBceRequest;
import com.baidubce.services.bcc.BccClient;
import com.github.wukong.core.anas.ParamAndRespPatternAnalyzer;

/**
 * https://cloud.baidu.com/doc/BCC/API.html
 * 
 * @author wuheng@iscas.ac.cn
 * @since  2019.1
 */
public class BaiduBCEKindAnalyzer extends ParamAndRespPatternAnalyzer {

	@Override
	public String getClient() {
		return BccClient.class.getName();
	}

	@Override
	protected String getSuperclass() {
		return AbstractBceRequest.class.getName();
	}

}
