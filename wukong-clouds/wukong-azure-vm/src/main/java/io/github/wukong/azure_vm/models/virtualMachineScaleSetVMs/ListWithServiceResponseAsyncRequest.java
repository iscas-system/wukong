package com.github.wukong.azurevm.models.virtualMachineScaleSetVMs;

public class ListWithServiceResponseAsyncRequest implements com.github.wukong.azurevm.models.AbstractAzureRequest {
	protected java.lang.String resourceGroupName;

	protected java.lang.String virtualMachineScaleSetName;

	public void setResourceGroupName(java.lang.String resourceGroupName) {
		this.resourceGroupName = resourceGroupName;
}
	public java.lang.String getResourceGroupName() {
		return this.resourceGroupName;
}
	public void setVirtualMachineScaleSetName(java.lang.String virtualMachineScaleSetName) {
		this.virtualMachineScaleSetName = virtualMachineScaleSetName;
}
	public java.lang.String getVirtualMachineScaleSetName() {
		return this.virtualMachineScaleSetName;
}
}