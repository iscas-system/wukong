package io.github.wukong.azure_vm.models.disks;

public class BeginCreateOrUpdateRequest implements io.github.wukong.azure_vm.models.AbstractAzureRequest {
	protected java.lang.String resourceGroupName;

	protected java.lang.String diskName;

	protected com.microsoft.azure.management.compute.implementation.DiskInner disk;

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
	public void setDisk(com.microsoft.azure.management.compute.implementation.DiskInner disk) {
		this.disk = disk;
}
	public com.microsoft.azure.management.compute.implementation.DiskInner getDisk() {
		return this.disk;
}
}