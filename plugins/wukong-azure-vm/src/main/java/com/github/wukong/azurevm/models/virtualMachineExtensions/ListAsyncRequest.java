package com.github.wukong.azurevm.models.virtualMachineExtensions;

public class ListAsyncRequest implements com.github.wukong.azurevm.models.AbstractAzureRequest {
	protected java.lang.String resourceGroupName;

	protected java.lang.String vmName;

	public void setResourceGroupName(java.lang.String resourceGroupName) {
		this.resourceGroupName = resourceGroupName;
}
	public java.lang.String getResourceGroupName() {
		return this.resourceGroupName;
}
	public void setVmName(java.lang.String vmName) {
		this.vmName = vmName;
}
	public java.lang.String getVmName() {
		return this.vmName;
}
}