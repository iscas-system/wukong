package com.github.wukong.googlece.models.targetSslProxies;

public class SetSslPolicyRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String targetSslProxy;

	protected com.google.api.services.compute.model.SslPolicyReference content;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setTargetSslProxy(java.lang.String targetSslProxy) {
		this.targetSslProxy = targetSslProxy;
}
	public java.lang.String getTargetSslProxy() {
		return this.targetSslProxy;
}
	public void setContent(com.google.api.services.compute.model.SslPolicyReference content) {
		this.content = content;
}
	public com.google.api.services.compute.model.SslPolicyReference getContent() {
		return this.content;
}
}