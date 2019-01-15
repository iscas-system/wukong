package com.github.wukong.googlece.models.nodeGroups;

public class InsertRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String zone;

	protected java.lang.Integer initialNodeCount;

	protected com.google.api.services.compute.model.NodeGroup content;

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
	public void setInitialNodeCount(java.lang.Integer initialNodeCount) {
		this.initialNodeCount = initialNodeCount;
}
	public java.lang.Integer getInitialNodeCount() {
		return this.initialNodeCount;
}
	public void setContent(com.google.api.services.compute.model.NodeGroup content) {
		this.content = content;
}
	public com.google.api.services.compute.model.NodeGroup getContent() {
		return this.content;
}
}