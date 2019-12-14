package com.github.wukong.googlece.models.subnetworks;

public class SetPrivateIpGoogleAccessRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String region;

	protected java.lang.String subnetwork;

	protected com.google.api.services.compute.model.SubnetworksSetPrivateIpGoogleAccessRequest content;

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
	public void setSubnetwork(java.lang.String subnetwork) {
		this.subnetwork = subnetwork;
}
	public java.lang.String getSubnetwork() {
		return this.subnetwork;
}
	public void setContent(com.google.api.services.compute.model.SubnetworksSetPrivateIpGoogleAccessRequest content) {
		this.content = content;
}
	public com.google.api.services.compute.model.SubnetworksSetPrivateIpGoogleAccessRequest getContent() {
		return this.content;
}
}