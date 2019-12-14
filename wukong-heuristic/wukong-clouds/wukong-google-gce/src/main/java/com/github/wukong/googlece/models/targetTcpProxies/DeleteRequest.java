package com.github.wukong.googlece.models.targetTcpProxies;

public class DeleteRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String targetTcpProxy;

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
}