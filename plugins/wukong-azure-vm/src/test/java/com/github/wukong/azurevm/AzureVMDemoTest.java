package com.github.wukong.azurevm;

import com.microsoft.azure.management.compute.implementation.ComputeManagementClientImpl;

public class AzureVMDemoTest {

	@SuppressWarnings("null")
	public static void main(String[] args) throws Exception {
		ComputeManagementClientImpl client = null;
		client.disks().delete(null, null);
	}

}
