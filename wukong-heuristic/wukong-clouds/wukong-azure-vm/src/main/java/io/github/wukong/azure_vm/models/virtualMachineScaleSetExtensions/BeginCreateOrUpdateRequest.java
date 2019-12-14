package io.github.wukong.azure_vm.models.virtualMachineScaleSetExtensions;

public class BeginCreateOrUpdateRequest implements io.github.wukong.azure_vm.models.AbstractAzureRequest {
	protected java.lang.String resourceGroupName;

	protected java.lang.String vmScaleSetName;

	protected java.lang.String vmssExtensionName;

	protected com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner extensionParameters;

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
	public void setVmssExtensionName(java.lang.String vmssExtensionName) {
		this.vmssExtensionName = vmssExtensionName;
}
	public java.lang.String getVmssExtensionName() {
		return this.vmssExtensionName;
}
	public void setExtensionParameters(com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner extensionParameters) {
		this.extensionParameters = extensionParameters;
}
	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner getExtensionParameters() {
		return this.extensionParameters;
}
}