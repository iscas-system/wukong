package com.github.wukong.azurevm.models.virtualMachineScaleSetVMs;

public class BeginUpdateRequest implements com.github.wukong.azurevm.models.AbstractAzureRequest {
	protected java.lang.String resourceGroupName;

	protected java.lang.String vmScaleSetName;

	protected java.lang.String instanceId;

	protected com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInner parameters;

	public void setResourceGroupName(java.lang.String resourceGroupName) {
		this.resourceGroupName = resourceGroupName;
}
	public java.lang.String getResourceGroupName() {
		return this.resourceGroupName;
}
	public void setVmScaleSetName(java.lang.String vmScaleSetName) {
		this.vmScaleSetName = vmScaleSetName;
}
	public java.lang.String getVmScaleSetName() {
		return this.vmScaleSetName;
}
	public void setInstanceId(java.lang.String instanceId) {
		this.instanceId = instanceId;
}
	public java.lang.String getInstanceId() {
		return this.instanceId;
}
	public void setParameters(com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInner parameters) {
		this.parameters = parameters;
}
	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInner getParameters() {
		return this.parameters;
}
}