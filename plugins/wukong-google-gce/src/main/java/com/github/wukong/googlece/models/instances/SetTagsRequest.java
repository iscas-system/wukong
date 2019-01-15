package com.github.wukong.googlece.models.instances;

public class SetTagsRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String zone;

	protected java.lang.String instance;

	protected com.google.api.services.compute.model.Tags content;

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
	public void setContent(com.google.api.services.compute.model.Tags content) {
		this.content = content;
}
	public com.google.api.services.compute.model.Tags getContent() {
		return this.content;
}
}