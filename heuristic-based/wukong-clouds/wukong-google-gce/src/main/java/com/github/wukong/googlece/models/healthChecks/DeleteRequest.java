package com.github.wukong.googlece.models.healthChecks;

public class DeleteRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String healthCheck;

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
}