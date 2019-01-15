package com.github.wukong.googlece.models.sslPolicies;

public class PatchRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String sslPolicy;

	protected com.google.api.services.compute.model.SslPolicy content;

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
	public void setContent(com.google.api.services.compute.model.SslPolicy content) {
		this.content = content;
}
	public com.google.api.services.compute.model.SslPolicy getContent() {
		return this.content;
}
}