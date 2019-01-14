package com.github.wukong.azurevm.models.virtualMachineScaleSets;

public class BeginCreateOrUpdateRequest implements com.github.wukong.azurevm.models.AbstractAzureRequest {
	protected java.lang.String resourceGroupName;

	protected java.lang.String vmScaleSetName;

	protected com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner parameters;

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
	public void setParameters(com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner parameters) {
		this.parameters = parameters;
}
	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner getParameters() {
		return this.parameters;
}
}