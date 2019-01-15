package com.github.wukong.googlece.models.projects;

public class ListXpnHostsRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected com.google.api.services.compute.model.ProjectsListXpnHostsRequest content;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setContent(com.google.api.services.compute.model.ProjectsListXpnHostsRequest content) {
		this.content = content;
}
	public com.google.api.services.compute.model.ProjectsListXpnHostsRequest getContent() {
		return this.content;
}
}