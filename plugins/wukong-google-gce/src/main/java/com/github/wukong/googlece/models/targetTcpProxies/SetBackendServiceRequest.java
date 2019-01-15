package com.github.wukong.googlece.models.targetTcpProxies;

public class SetBackendServiceRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String targetTcpProxy;

	protected com.google.api.services.compute.model.TargetTcpProxiesSetBackendServiceRequest content;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setTargetTcpProxy(java.lang.String targetTcpProxy) {
		this.targetTcpProxy = targetTcpProxy;
}
	public java.lang.String getTargetTcpProxy() {
		return this.targetTcpProxy;
}
	public void setContent(com.google.api.services.compute.model.TargetTcpProxiesSetBackendServiceRequest content) {
		this.content = content;
}
	public com.google.api.services.compute.model.TargetTcpProxiesSetBackendServiceRequest getContent() {
		return this.content;
}
}