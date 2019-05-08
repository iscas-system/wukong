package io.github.wukong.azure_vm.models.virtualMachineScaleSetVMs;

public class DeleteWithServiceResponseAsyncRequest implements io.github.wukong.azure_vm.models.AbstractAzureRequest {
	protected java.lang.String resourceGroupName;

	protected java.lang.String vmScaleSetName;

	protected java.lang.String instanceId;

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
}