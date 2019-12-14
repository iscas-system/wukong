package com.github.wukong.googlece.models.vpnTunnels;

public class InsertRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String region;

	protected com.google.api.services.compute.model.VpnTunnel content;

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
	public void setContent(com.google.api.services.compute.model.VpnTunnel content) {
		this.content = content;
}
	public com.google.api.services.compute.model.VpnTunnel getContent() {
		return this.content;
}
}