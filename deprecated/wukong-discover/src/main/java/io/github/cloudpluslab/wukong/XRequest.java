/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package io.github.cloudpluslab.wukong;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.ecs.model.v20140526.CreateImageResponse;


/**
 * @author tangting18@otcaix.iscas.ac.cn
 * @author wuheng@iscas.ac.cn
 * @since 2019.12.10
 */
public class XRequest extends 
	RpcAcsRequest<CreateImageResponse> {

	protected String param1;
	
	public String getParam1() {
		return param1;
	}

	public void setParam1(String param1) {
		this.param1 = param1;
	}

	public XRequest(String product) {
		super(product);
	}

	@Override
	public Class<CreateImageResponse> getResponseClass() {
		return null;
	}


}
