package com.github.wukong.googlece.models.targetHttpsProxies;

public class GetRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String targetHttpsProxy;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setTargetHttpsProxy(java.lang.String targetHttpsProxy) {
		this.targetHttpsProxy = targetHttpsProxy;
}
	public java.lang.String getTargetHttpsProxy() {
		return this.targetHttpsProxy;
}
}