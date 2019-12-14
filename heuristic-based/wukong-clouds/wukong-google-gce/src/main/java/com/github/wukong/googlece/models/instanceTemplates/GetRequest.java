package com.github.wukong.googlece.models.instanceTemplates;

public class GetRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String instanceTemplate;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setInstanceTemplate(java.lang.String instanceTemplate) {
		this.instanceTemplate = instanceTemplate;
}
	public java.lang.String getInstanceTemplate() {
		return this.instanceTemplate;
}
}