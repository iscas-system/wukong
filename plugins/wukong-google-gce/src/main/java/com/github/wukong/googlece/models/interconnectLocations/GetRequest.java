package com.github.wukong.googlece.models.interconnectLocations;

public class GetRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String interconnectLocation;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setInterconnectLocation(java.lang.String interconnectLocation) {
		this.interconnectLocation = interconnectLocation;
}
	public java.lang.String getInterconnectLocation() {
		return this.interconnectLocation;
}
}