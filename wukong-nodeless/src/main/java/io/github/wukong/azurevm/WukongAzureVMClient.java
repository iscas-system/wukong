/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package io.github.wukong.azurevm;

import com.microsoft.azure.management.compute.implementation.ComputeManagementClientImpl;
import com.microsoft.rest.RestClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;

/**
 * @author wuheng@iscas.ac.cn
 * @since  2019.1
 */
public class WukongAzureVMClient extends ComputeManagementClientImpl {

	public WukongAzureVMClient(RestClient restClient) {
		super(restClient);
	}

	public WukongAzureVMClient(ServiceClientCredentials credentials) {
		super(credentials);
	}

	public WukongAzureVMClient(String baseUrl, ServiceClientCredentials credentials) {
		super(baseUrl, credentials);
	}
	
	
}
