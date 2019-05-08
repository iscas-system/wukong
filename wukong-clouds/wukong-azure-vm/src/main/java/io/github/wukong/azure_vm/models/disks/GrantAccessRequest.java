package com.github.wukong.azurevm.models.disks;

public class GrantAccessRequest implements com.github.wukong.azurevm.models.AbstractAzureRequest {
	protected java.lang.String resourceGroupName;

	protected java.lang.String diskName;

	protected com.microsoft.azure.management.compute.GrantAccessData grantAccessData;

	public void setResourceGroupName(java.lang.String resourceGroupName) {
		this.resourceGroupName = resourceGroupName;
}
	public java.lang.String getResourceGroupName() {
		return this.resourceGroupName;
}
	public void setDiskName(java.lang.String diskName) {
		this.diskName = diskName;
}
	public java.lang.String getDiskName() {
		return this.diskName;
}
	public void setGrantAccessData(com.microsoft.azure.management.compute.GrantAccessData grantAccessData) {
		this.grantAccessData = grantAccessData;
}
	public com.microsoft.azure.management.compute.GrantAccessData getGrantAccessData() {
		return this.grantAccessData;
}
}