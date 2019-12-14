package com.github.wukong.googlece.models.sslPolicies;

public class GetRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String sslPolicy;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setSslPolicy(java.lang.String sslPolicy) {
		this.sslPolicy = sslPolicy;
}
	public java.lang.String getSslPolicy() {
		return this.sslPolicy;
}
}