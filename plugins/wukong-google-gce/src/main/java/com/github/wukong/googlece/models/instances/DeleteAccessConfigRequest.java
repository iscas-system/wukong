package com.github.wukong.googlece.models.instances;

public class DeleteAccessConfigRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String zone;

	protected java.lang.String instance;

	protected java.lang.String accessConfig;

	protected java.lang.String networkInterface;

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
	public void setAccessConfig(java.lang.String accessConfig) {
		this.accessConfig = accessConfig;
}
	public java.lang.String getAccessConfig() {
		return this.accessConfig;
}
	public void setNetworkInterface(java.lang.String networkInterface) {
		this.networkInterface = networkInterface;
}
	public java.lang.String getNetworkInterface() {
		return this.networkInterface;
}
}