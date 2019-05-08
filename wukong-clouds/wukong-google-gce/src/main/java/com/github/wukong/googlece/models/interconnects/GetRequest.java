package com.github.wukong.googlece.models.interconnects;

public class GetRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String interconnect;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setInterconnect(java.lang.String interconnect) {
		this.interconnect = interconnect;
}
	public java.lang.String getInterconnect() {
		return this.interconnect;
}
}