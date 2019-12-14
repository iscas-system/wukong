package com.github.wukong.googlece.models.regionOperations;

public class DeleteRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String region;

	protected java.lang.String operation;

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
	public void setOperation(java.lang.String operation) {
		this.operation = operation;
}
	public java.lang.String getOperation() {
		return this.operation;
}
}