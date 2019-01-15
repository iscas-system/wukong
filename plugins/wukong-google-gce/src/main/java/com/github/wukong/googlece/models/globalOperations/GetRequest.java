package com.github.wukong.googlece.models.globalOperations;

public class GetRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String operation;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setOperation(java.lang.String operation) {
		this.operation = operation;
}
	public java.lang.String getOperation() {
		return this.operation;
}
}