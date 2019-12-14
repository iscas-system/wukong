package io.github.wukong.azure_vm.models.virtualMachineScaleSetExtensions;

public class ListAsyncRequest implements io.github.wukong.azure_vm.models.AbstractAzureRequest {
	protected java.lang.String resourceGroupName;

	protected java.lang.String vmScaleSetName;

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
}