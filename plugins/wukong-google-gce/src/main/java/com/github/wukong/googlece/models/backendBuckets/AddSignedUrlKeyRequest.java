package com.github.wukong.googlece.models.backendBuckets;

public class AddSignedUrlKeyRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String backendBucket;

	protected com.google.api.services.compute.model.SignedUrlKey content;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setBackendBucket(java.lang.String backendBucket) {
		this.backendBucket = backendBucket;
}
	public java.lang.String getBackendBucket() {
		return this.backendBucket;
}
	public void setContent(com.google.api.services.compute.model.SignedUrlKey content) {
		this.content = content;
}
	public com.google.api.services.compute.model.SignedUrlKey getContent() {
		return this.content;
}
}