package com.github.wukong.googlece.models.targetHttpProxies;

public class SetUrlMapRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String targetHttpProxy;

	protected com.google.api.services.compute.model.UrlMapReference content;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setTargetHttpProxy(java.lang.String targetHttpProxy) {
		this.targetHttpProxy = targetHttpProxy;
}
	public java.lang.String getTargetHttpProxy() {
		return this.targetHttpProxy;
}
	public void setContent(com.google.api.services.compute.model.UrlMapReference content) {
		this.content = content;
}
	public com.google.api.services.compute.model.UrlMapReference getContent() {
		return this.content;
}
}