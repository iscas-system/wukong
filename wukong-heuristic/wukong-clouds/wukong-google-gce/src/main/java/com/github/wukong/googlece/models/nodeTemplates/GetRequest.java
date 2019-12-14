package com.github.wukong.googlece.models.nodeTemplates;

public class GetRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String region;

	protected java.lang.String nodeTemplate;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setRegion(java.lang.String region) {
		this.region = region;
}
	public java.lang.String getRegion() {
		return this.region;
}
	public void setNodeTemplate(java.lang.String nodeTemplate) {
		this.nodeTemplate = nodeTemplate;
}
	public java.lang.String getNodeTemplate() {
		return this.nodeTemplate;
}
}