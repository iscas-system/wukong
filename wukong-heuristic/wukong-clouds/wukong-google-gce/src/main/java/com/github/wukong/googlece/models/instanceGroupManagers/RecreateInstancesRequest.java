package com.github.wukong.googlece.models.instanceGroupManagers;

public class RecreateInstancesRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String zone;

	protected java.lang.String instanceGroupManager;

	protected com.google.api.services.compute.model.InstanceGroupManagersRecreateInstancesRequest content;

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
	public void setInstanceGroupManager(java.lang.String instanceGroupManager) {
		this.instanceGroupManager = instanceGroupManager;
}
	public java.lang.String getInstanceGroupManager() {
		return this.instanceGroupManager;
}
	public void setContent(com.google.api.services.compute.model.InstanceGroupManagersRecreateInstancesRequest content) {
		this.content = content;
}
	public com.google.api.services.compute.model.InstanceGroupManagersRecreateInstancesRequest getContent() {
		return this.content;
}
}