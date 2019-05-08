package com.github.wukong.googlece.models.disks;

public class CreateSnapshotRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String zone;

	protected java.lang.String disk;

	protected com.google.api.services.compute.model.Snapshot content;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setZone(java.lang.String zone) {
		this.zone = zone;
}
	public java.lang.String getZone() {
		return this.zone;
}
	public void setDisk(java.lang.String disk) {
		this.disk = disk;
}
	public java.lang.String getDisk() {
		return this.disk;
}
	public void setContent(com.google.api.services.compute.model.Snapshot content) {
		this.content = content;
}
	public com.google.api.services.compute.model.Snapshot getContent() {
		return this.content;
}
}