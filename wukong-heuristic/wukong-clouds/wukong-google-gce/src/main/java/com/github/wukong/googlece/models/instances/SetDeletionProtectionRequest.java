package com.github.wukong.googlece.models.instances;

public class SetDeletionProtectionRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String zone;

	protected java.lang.String resource;

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
	public void setResource(java.lang.String resource) {
		this.resource = resource;
}
	public java.lang.String getResource() {
		return this.resource;
}
}