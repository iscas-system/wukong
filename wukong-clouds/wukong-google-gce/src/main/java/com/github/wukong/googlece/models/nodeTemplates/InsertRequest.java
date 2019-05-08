package com.github.wukong.googlece.models.nodeTemplates;

public class InsertRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String region;

	protected com.google.api.services.compute.model.NodeTemplate content;

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
	public void setContent(com.google.api.services.compute.model.NodeTemplate content) {
		this.content = content;
}
	public com.google.api.services.compute.model.NodeTemplate getContent() {
		return this.content;
}
}