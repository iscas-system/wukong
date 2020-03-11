package com.github.wukong.googlece.models.securityPolicies;

public class DeleteRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String securityPolicy;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setSecurityPolicy(java.lang.String securityPolicy) {
		this.securityPolicy = securityPolicy;
}
	public java.lang.String getSecurityPolicy() {
		return this.securityPolicy;
}
}