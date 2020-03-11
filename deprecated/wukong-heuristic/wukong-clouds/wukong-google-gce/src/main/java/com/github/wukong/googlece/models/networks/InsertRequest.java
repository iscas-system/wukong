package com.github.wukong.googlece.models.networks;

public class InsertRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected com.google.api.services.compute.model.Network content;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setContent(com.google.api.services.compute.model.Network content) {
		this.content = content;
}
	public com.google.api.services.compute.model.Network getContent() {
		return this.content;
}
}