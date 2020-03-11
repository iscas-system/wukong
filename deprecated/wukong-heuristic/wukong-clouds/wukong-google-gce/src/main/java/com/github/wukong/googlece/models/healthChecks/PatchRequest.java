package com.github.wukong.googlece.models.healthChecks;

public class PatchRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String healthCheck;

	protected com.google.api.services.compute.model.HealthCheck content;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setHealthCheck(java.lang.String healthCheck) {
		this.healthCheck = healthCheck;
}
	public java.lang.String getHealthCheck() {
		return this.healthCheck;
}
	public void setContent(com.google.api.services.compute.model.HealthCheck content) {
		this.content = content;
}
	public com.google.api.services.compute.model.HealthCheck getContent() {
		return this.content;
}
}