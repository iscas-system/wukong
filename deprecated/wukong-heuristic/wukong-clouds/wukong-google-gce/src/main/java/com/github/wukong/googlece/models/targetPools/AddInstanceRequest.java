package com.github.wukong.googlece.models.targetPools;

public class AddInstanceRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String region;

	protected java.lang.String targetPool;

	protected com.google.api.services.compute.model.TargetPoolsAddInstanceRequest content;

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
	public void setTargetPool(java.lang.String targetPool) {
		this.targetPool = targetPool;
}
	public java.lang.String getTargetPool() {
		return this.targetPool;
}
	public void setContent(com.google.api.services.compute.model.TargetPoolsAddInstanceRequest content) {
		this.content = content;
}
	public com.google.api.services.compute.model.TargetPoolsAddInstanceRequest getContent() {
		return this.content;
}
}