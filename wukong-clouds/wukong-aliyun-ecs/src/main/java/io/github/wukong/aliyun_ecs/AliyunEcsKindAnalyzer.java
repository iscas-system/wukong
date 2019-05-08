/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package io.github.wukong.aliyun_ecs;

import com.aliyuncs.RpcAcsRequest;

import io.github.wukong.core.anas.ReqAndRespPatternAnalyzer;

/**
 * https://help.aliyun.com/document_detail/25484.html
 *
 * @author wuheng@iscas.ac.cn
 * @since  2019.1
 */
public class AliyunEcsKindAnalyzer extends ReqAndRespPatternAnalyzer {

	@Override
	public String getClient() {
		return WukongDefaultAcsClient.class.getName();
	}

	@Override
	protected String getPostfix() {
		return "Request";
	}

	@Override
	protected String getSuperclass() {
		return RpcAcsRequest.class.getName();
	}

}
