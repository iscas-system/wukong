package io.github.wukong.azure_vm.models.snapshots;

public class GetByResourceGroupRequest implements io.github.wukong.azure_vm.models.AbstractAzureRequest {
	protected java.lang.String resourceGroupName;

	protected java.lang.String snapshotName;

	public void setResourceGroupName(java.lang.String resourceGroupName) {
		this.resourceGroupName = resourceGroupName;
}
	public java.lang.String getResourceGroupName() {
		return this.resourceGroupName;
}
	public void setSnapshotName(java.lang.String snapshotName) {
		this.snapshotName = snapshotName;
}
	public java.lang.String getSnapshotName() {
		return this.snapshotName;
}
}