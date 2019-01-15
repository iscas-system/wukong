package com.github.wukong.googlece.models.targetSslProxies;

public class GetRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String targetSslProxy;

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
}