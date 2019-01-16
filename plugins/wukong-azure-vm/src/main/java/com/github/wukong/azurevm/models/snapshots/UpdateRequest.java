package com.github.wukong.azurevm.models.snapshots;

public class UpdateRequest implements com.github.wukong.azurevm.models.AbstractAzureRequest {
	protected java.lang.String resourceGroupName;

	protected java.lang.String snapshotName;

	protected com.microsoft.azure.management.compute.SnapshotUpdate snapshot;

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
	public void setSnapshot(com.microsoft.azure.management.compute.SnapshotUpdate snapshot) {
		this.snapshot = snapshot;
}
	public com.microsoft.azure.management.compute.SnapshotUpdate getSnapshot() {
		return this.snapshot;
}
}