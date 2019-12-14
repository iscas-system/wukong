package com.github.wukong.jdcloudvm;

import com.jdcloud.sdk.service.vm.client.VmClient;
import com.jdcloud.sdk.service.vm.model.AssociateElasticIpRequest;

public class JDcloudVMDemoTest {

	@SuppressWarnings("null")
	public static void main(String[] args) throws Exception {
		VmClient client = null;
		AssociateElasticIpRequest request = null;
		client.associateElasticIp(request);
	}

}
