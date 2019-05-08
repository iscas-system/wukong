package com.github.wukong.azurevm.models.virtualMachines;

public class BeginUpdateRequest implements com.github.wukong.azurevm.models.AbstractAzureRequest {
	protected java.lang.String resourceGroupName;

	protected java.lang.String vmName;

	protected com.microsoft.azure.management.compute.VirtualMachineUpdate parameters;

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
	public void setParameters(com.microsoft.azure.management.compute.VirtualMachineUpdate parameters) {
		this.parameters = parameters;
}
	public com.microsoft.azure.management.compute.VirtualMachineUpdate getParameters() {
		return this.parameters;
}
}