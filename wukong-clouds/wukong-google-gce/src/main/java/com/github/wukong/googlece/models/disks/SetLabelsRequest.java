package com.github.wukong.googlece.models.disks;

public class SetLabelsRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String zone;

	protected java.lang.String resource;

	protected com.google.api.services.compute.model.ZoneSetLabelsRequest content;

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
	public void setContent(com.google.api.services.compute.model.ZoneSetLabelsRequest content) {
		this.content = content;
}
	public com.google.api.services.compute.model.ZoneSetLabelsRequest getContent() {
		return this.content;
}
}