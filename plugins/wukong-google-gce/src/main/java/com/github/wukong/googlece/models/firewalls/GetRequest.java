package com.github.wukong.googlece.models.firewalls;

public class GetRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String firewall;

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
}