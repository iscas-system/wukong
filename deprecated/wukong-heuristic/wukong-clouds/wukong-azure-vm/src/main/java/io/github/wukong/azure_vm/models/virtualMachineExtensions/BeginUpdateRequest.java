package io.github.wukong.azure_vm.models.virtualMachineExtensions;

public class BeginUpdateRequest implements io.github.wukong.azure_vm.models.AbstractAzureRequest {
	protected java.lang.String resourceGroupName;

	protected java.lang.String vmName;

	protected java.lang.String vmExtensionName;

	protected com.microsoft.azure.management.compute.VirtualMachineExtensionUpdate extensionParameters;

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
	public void setVmExtensionName(java.lang.String vmExtensionName) {
		this.vmExtensionName = vmExtensionName;
}
	public java.lang.String getVmExtensionName() {
		return this.vmExtensionName;
}
	public void setExtensionParameters(com.microsoft.azure.management.compute.VirtualMachineExtensionUpdate extensionParameters) {
		this.extensionParameters = extensionParameters;
}
	public com.microsoft.azure.management.compute.VirtualMachineExtensionUpdate getExtensionParameters() {
		return this.extensionParameters;
}
}