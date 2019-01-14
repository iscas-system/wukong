package com.github.wukong.azurevm.models.virtualMachineScaleSets;

public class BeginUpdateRequest implements com.github.wukong.azurevm.models.AbstractAzureRequest {
	protected java.lang.String resourceGroupName;

	protected java.lang.String vmScaleSetName;

	protected com.microsoft.azure.management.compute.VirtualMachineScaleSetUpdate parameters;

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
	public void setParameters(com.microsoft.azure.management.compute.VirtualMachineScaleSetUpdate parameters) {
		this.parameters = parameters;
}
	public com.microsoft.azure.management.compute.VirtualMachineScaleSetUpdate getParameters() {
		return this.parameters;
}
}