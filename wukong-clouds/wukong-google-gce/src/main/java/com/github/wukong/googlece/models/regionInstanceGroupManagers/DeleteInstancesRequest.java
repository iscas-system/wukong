package com.github.wukong.googlece.models.regionInstanceGroupManagers;

public class DeleteInstancesRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String region;

	protected java.lang.String instanceGroupManager;

	protected com.google.api.services.compute.model.RegionInstanceGroupManagersDeleteInstancesRequest content;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setRegion(java.lang.String region) {
		this.region = region;
}
	public java.lang.String getRegion() {
		return this.region;
}
	public void setInstanceGroupManager(java.lang.String instanceGroupManager) {
		this.instanceGroupManager = instanceGroupManager;
}
	public java.lang.String getInstanceGroupManager() {
		return this.instanceGroupManager;
}
	public void setContent(com.google.api.services.compute.model.RegionInstanceGroupManagersDeleteInstancesRequest content) {
		this.content = content;
}
	public com.google.api.services.compute.model.RegionInstanceGroupManagersDeleteInstancesRequest getContent() {
		return this.content;
}
}