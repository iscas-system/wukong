package com.github.wukong.googlece.models.instanceGroups;

public class SetNamedPortsRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String zone;

	protected java.lang.String instanceGroup;

	protected com.google.api.services.compute.model.InstanceGroupsSetNamedPortsRequest content;

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
	public void setInstanceGroup(java.lang.String instanceGroup) {
		this.instanceGroup = instanceGroup;
}
	public java.lang.String getInstanceGroup() {
		return this.instanceGroup;
}
	public void setContent(com.google.api.services.compute.model.InstanceGroupsSetNamedPortsRequest content) {
		this.content = content;
}
	public com.google.api.services.compute.model.InstanceGroupsSetNamedPortsRequest getContent() {
		return this.content;
}
}