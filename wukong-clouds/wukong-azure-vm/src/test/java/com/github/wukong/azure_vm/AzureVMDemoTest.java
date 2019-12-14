package com.github.wukong.azure_vm;

import com.microsoft.azure.management.compute.implementation.ComputeManagementClientImpl;

public class AzureVMDemoTest {

	@SuppressWarnings("null")
	public static void main(String[] args) throws Exception {
		ComputeManagementClientImpl client = null;
		client.disks().delete(null, null);
		client.disks().beginCreateOrUpdate(null, null, null);
		client.galleries().delete(null, null);
	}

}
