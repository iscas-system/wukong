package com.github.wukong.googlece.models.targetVpnGateways;

public class DeleteRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String region;

	protected java.lang.String targetVpnGateway;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setRegion(java.lang.String region) {
		this.region = region;
}
	public java.lang.String getRegion() {
		return this.region;
}
	public void setTargetVpnGateway(java.lang.String targetVpnGateway) {
		this.targetVpnGateway = targetVpnGateway;
}
	public java.lang.String getTargetVpnGateway() {
		return this.targetVpnGateway;
}
}