package com.github.wukong.googlece.models.firewalls;

public class UpdateRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String firewall;

	protected com.google.api.services.compute.model.Firewall content;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setFirewall(java.lang.String firewall) {
		this.firewall = firewall;
}
	public java.lang.String getFirewall() {
		return this.firewall;
}
	public void setContent(com.google.api.services.compute.model.Firewall content) {
		this.content = content;
}
	public com.google.api.services.compute.model.Firewall getContent() {
		return this.content;
}
}