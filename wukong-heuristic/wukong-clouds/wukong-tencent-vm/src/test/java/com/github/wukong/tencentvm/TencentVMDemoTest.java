package com.github.wukong.tencentvm;

import com.tencentcloudapi.cvm.v20170312.CvmClient;
import com.tencentcloudapi.cvm.v20170312.models.RunInstancesRequest;

public class TencentVMDemoTest {

	@SuppressWarnings("null")
	public static void main(String[] args) throws Exception {
		CvmClient client = null;
		RunInstancesRequest req = new RunInstancesRequest();
		client.RunInstances(req );
	}

}
