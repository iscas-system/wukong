package com.github.wukong.googlece.models.globalAddresses;

public class InsertRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected com.google.api.services.compute.model.Address content;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setContent(com.google.api.services.compute.model.Address content) {
		this.content = content;
}
	public com.google.api.services.compute.model.Address getContent() {
		return this.content;
}
}