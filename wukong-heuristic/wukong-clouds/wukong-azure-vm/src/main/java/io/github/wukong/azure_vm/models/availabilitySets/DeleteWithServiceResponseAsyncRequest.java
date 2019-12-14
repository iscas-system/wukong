package io.github.wukong.azure_vm.models.availabilitySets;

public class DeleteWithServiceResponseAsyncRequest implements io.github.wukong.azure_vm.models.AbstractAzureRequest {
	protected java.lang.String resourceGroupName;

	protected java.lang.String availabilitySetName;

	public void setResourceGroupName(java.lang.String resourceGroupName) {
		this.resourceGroupName = resourceGroupName;
}
	public java.lang.String getResourceGroupName() {
		return this.resourceGroupName;
}
	public void setAvailabilitySetName(java.lang.String availabilitySetName) {
		this.availabilitySetName = availabilitySetName;
}
	public java.lang.String getAvailabilitySetName() {
		return this.availabilitySetName;
}
}