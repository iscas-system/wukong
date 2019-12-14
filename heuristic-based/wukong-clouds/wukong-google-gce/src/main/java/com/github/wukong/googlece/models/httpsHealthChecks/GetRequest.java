package com.github.wukong.googlece.models.httpsHealthChecks;

public class GetRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String httpsHealthCheck;

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
}