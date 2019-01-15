package com.github.wukong.googlece.models.httpsHealthChecks;

public class UpdateRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String httpsHealthCheck;

	protected com.google.api.services.compute.model.HttpsHealthCheck content;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setHttpsHealthCheck(java.lang.String httpsHealthCheck) {
		this.httpsHealthCheck = httpsHealthCheck;
}
	public java.lang.String getHttpsHealthCheck() {
		return this.httpsHealthCheck;
}
	public void setContent(com.google.api.services.compute.model.HttpsHealthCheck content) {
		this.content = content;
}
	public com.google.api.services.compute.model.HttpsHealthCheck getContent() {
		return this.content;
}
}