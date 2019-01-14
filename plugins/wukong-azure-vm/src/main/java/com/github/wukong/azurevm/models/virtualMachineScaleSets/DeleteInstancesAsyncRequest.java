package com.github.wukong.azurevm.models.virtualMachineScaleSets;

public class DeleteInstancesAsyncRequest implements com.github.wukong.azurevm.models.AbstractAzureRequest {
	protected java.lang.String resourceGroupName;

	protected java.lang.String vmScaleSetName;

	protected java.util.List<java.lang.String> instanceIds;

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
	public void setInstanceIds(java.util.List<java.lang.String> instanceIds) {
		this.instanceIds = instanceIds;
}
	public java.util.List<java.lang.String> getInstanceIds() {
		return this.instanceIds;
}
}