package com.github.wukong.azurevm.models.disks;

public class GetByResourceGroupRequest implements com.github.wukong.azurevm.models.AbstractAzureRequest {
	protected java.lang.String resourceGroupName;

	protected java.lang.String diskName;

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
}