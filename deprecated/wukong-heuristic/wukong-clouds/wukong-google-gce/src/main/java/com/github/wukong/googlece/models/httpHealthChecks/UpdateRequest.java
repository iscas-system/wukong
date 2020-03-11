package com.github.wukong.googlece.models.httpHealthChecks;

public class UpdateRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String httpHealthCheck;

	protected com.google.api.services.compute.model.HttpHealthCheck content;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setHttpHealthCheck(java.lang.String httpHealthCheck) {
		this.httpHealthCheck = httpHealthCheck;
}
	public java.lang.String getHttpHealthCheck() {
		return this.httpHealthCheck;
}
	public void setContent(com.google.api.services.compute.model.HttpHealthCheck content) {
		this.content = content;
}
	public com.google.api.services.compute.model.HttpHealthCheck getContent() {
		return this.content;
}
}