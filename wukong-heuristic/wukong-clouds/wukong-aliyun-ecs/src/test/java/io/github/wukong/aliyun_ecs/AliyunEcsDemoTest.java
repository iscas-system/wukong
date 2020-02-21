/**
 * Copyright (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.wukong.aliyun_ecs;

import com.aliyuncs.ecs.model.v20140526.DescribeInstanceTypesRequest;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceTypesResponse.InstanceType;
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
		DescribeInstanceTypesRequest req = new DescribeInstanceTypesRequest();
		for (InstanceType image : client.describeInstanceTypesRequest(req).getInstanceTypes()) {
			System.out.println(image.getInstanceTypeId() + ":" + image.getInstanceTypeFamily() + ": <" + image.getCpuCoreCount() + "," + image.getMemorySize() + ">" );
		}
	}

	private static WukongDefaultAcsClient getClient() {
		IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", "", "");
		WukongDefaultAcsClient client = new WukongDefaultAcsClient(profile);
		return client;
	}

}
