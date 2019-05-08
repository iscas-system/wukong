package com.github.wukong.googlece.models.regionInstanceGroups;

public class SetNamedPortsRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String region;

	protected java.lang.String instanceGroup;

	protected com.google.api.services.compute.model.RegionInstanceGroupsSetNamedPortsRequest content;

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
	public void setInstanceGroup(java.lang.String instanceGroup) {
		this.instanceGroup = instanceGroup;
}
	public java.lang.String getInstanceGroup() {
		return this.instanceGroup;
}
	public void setContent(com.google.api.services.compute.model.RegionInstanceGroupsSetNamedPortsRequest content) {
		this.content = content;
}
	public com.google.api.services.compute.model.RegionInstanceGroupsSetNamedPortsRequest getContent() {
		return this.content;
}
}