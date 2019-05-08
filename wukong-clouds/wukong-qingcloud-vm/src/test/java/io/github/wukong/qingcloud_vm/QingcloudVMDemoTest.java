/**
 * Copyright (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.wukong.qingcloud_vm;

import com.qingcloud.sdk.config.EnvContext;
import com.qingcloud.sdk.service.InstanceService;
import com.qingcloud.sdk.service.InstanceService.DescribeInstancesInput;
import com.qingcloud.sdk.service.InstanceService.DescribeInstancesOutput;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * @since 2019/5/8
 * 
 */
public class QingcloudVMDemoTest {

	public static void main(String[] args) throws Exception {
		
		InstanceService client = getClient();
        DescribeInstancesInput request = new DescribeInstancesInput();
        DescribeInstancesOutput response = client.describeInstances(request );
        System.out.println(response);
	}

	private static InstanceService getClient() {
		EnvContext context = new EnvContext("ACCESS_KEY_ID_EXAMPLE", "SECRET_ACCESS_KEY_EXAMPLE");
        context.setProtocol("https");
        context.setHost("api.qingcloud.com");
        context.setPort("443");
        context.setZone("pek3b");
        context.setApiLang("zh-cn"); // optional, set return message i18n, default to us-en
        InstanceService service = new InstanceService(context);
		return service;
	}

}
