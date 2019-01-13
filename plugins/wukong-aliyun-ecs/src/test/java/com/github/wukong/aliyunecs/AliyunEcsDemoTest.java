package com.github.wukong.aliyunecs;

import com.aliyuncs.ecs.model.v20140526.CreateVpcRequest;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;

public class AliyunEcsDemoTest {

	public static void main(String[] args) throws Exception {
		IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", "", "");
		WukongDefaultAcsClient client = new WukongDefaultAcsClient(profile);
		CreateVpcRequest req = client.createVpcRequest();
		client.getAcsResponse(req);
	}

}
