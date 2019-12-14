package com.github.wukong.googlece.models.regionDisks;

public class SetLabelsRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String region;

	protected java.lang.String resource;

	protected com.google.api.services.compute.model.RegionSetLabelsRequest content;

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
	public void setResource(java.lang.String resource) {
		this.resource = resource;
}
	public java.lang.String getResource() {
		return this.resource;
}
	public void setContent(com.google.api.services.compute.model.RegionSetLabelsRequest content) {
		this.content = content;
}
	public com.google.api.services.compute.model.RegionSetLabelsRequest getContent() {
		return this.content;
}
}