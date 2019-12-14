package com.github.wukong.googlece.models.networks;

public class DeleteRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String network;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setNetwork(java.lang.String network) {
		this.network = network;
}
	public java.lang.String getNetwork() {
		return this.network;
}
}