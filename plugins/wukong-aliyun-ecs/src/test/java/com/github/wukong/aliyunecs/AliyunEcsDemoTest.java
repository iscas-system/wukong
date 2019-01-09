package com.github.wukong.aliyunecs;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.ecs.model.v20140526.CreateVpcRequest;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;

public class AliyunEcsDemoTest {

	public static void main(String[] args) throws Exception {
		IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", "", "");
		IAcsClient client = new DefaultAcsClient(profile);
		CreateVpcRequest req = new CreateVpcRequest();
		client.getAcsResponse(req);
	}

}
