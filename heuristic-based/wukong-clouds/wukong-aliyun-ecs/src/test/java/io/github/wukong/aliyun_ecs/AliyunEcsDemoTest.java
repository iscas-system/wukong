/**
 * Copyright (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.wukong.aliyun_ecs;

import com.aliyuncs.ecs.model.v20140526.CreateVpcRequest;
import com.aliyuncs.ecs.model.v20140526.CreateVpcResponse;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * @since 2019/5/8
 * 
 */
public class AliyunEcsDemoTest {

	public static void main(String[] args) throws Exception {
		WukongDefaultAcsClient client = getClient();
		CreateVpcRequest request = client.createVpcRequest();
		CreateVpcResponse response = client.getAcsResponse(request);
		System.out.println(response);
	}

	private static WukongDefaultAcsClient getClient() {
		IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", "", "");
		WukongDefaultAcsClient client = new WukongDefaultAcsClient(profile);
		return client;
	}

}
