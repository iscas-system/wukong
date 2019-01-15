package com.github.wukong.googlece.models.targetSslProxies;

public class SetSslCertificatesRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String targetSslProxy;

	protected com.google.api.services.compute.model.TargetSslProxiesSetSslCertificatesRequest content;

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
	public void setContent(com.google.api.services.compute.model.TargetSslProxiesSetSslCertificatesRequest content) {
		this.content = content;
}
	public com.google.api.services.compute.model.TargetSslProxiesSetSslCertificatesRequest getContent() {
		return this.content;
}
}