package com.github.wukong.googlece.models.vpnTunnels;

public class GetRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String region;

	protected java.lang.String vpnTunnel;

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
	public void setVpnTunnel(java.lang.String vpnTunnel) {
		this.vpnTunnel = vpnTunnel;
}
	public java.lang.String getVpnTunnel() {
		return this.vpnTunnel;
}
}