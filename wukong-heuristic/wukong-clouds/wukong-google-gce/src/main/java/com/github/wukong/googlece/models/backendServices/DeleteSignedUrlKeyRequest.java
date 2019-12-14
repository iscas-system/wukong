package com.github.wukong.googlece.models.backendServices;

public class DeleteSignedUrlKeyRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String backendService;

	protected java.lang.String keyName;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setBackendService(java.lang.String backendService) {
		this.backendService = backendService;
}
	public java.lang.String getBackendService() {
		return this.backendService;
}
	public void setKeyName(java.lang.String keyName) {
		this.keyName = keyName;
}
	public java.lang.String getKeyName() {
		return this.keyName;
}
}