package com.github.wukong.googlece.models.instances;

public class UpdateAccessConfigRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String zone;

	protected java.lang.String instance;

	protected java.lang.String networkInterface;

	protected com.google.api.services.compute.model.AccessConfig content;

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
	public void setInstance(java.lang.String instance) {
		this.instance = instance;
}
	public java.lang.String getInstance() {
		return this.instance;
}
	public void setNetworkInterface(java.lang.String networkInterface) {
		this.networkInterface = networkInterface;
}
	public java.lang.String getNetworkInterface() {
		return this.networkInterface;
}
	public void setContent(com.google.api.services.compute.model.AccessConfig content) {
		this.content = content;
}
	public com.google.api.services.compute.model.AccessConfig getContent() {
		return this.content;
}
}