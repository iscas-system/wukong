package com.github.wukong.googlece.models.zoneOperations;

public class ListRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String zone;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setZone(java.lang.String zone) {
		this.zone = zone;
}
	public java.lang.String getZone() {
		return this.zone;
}
}