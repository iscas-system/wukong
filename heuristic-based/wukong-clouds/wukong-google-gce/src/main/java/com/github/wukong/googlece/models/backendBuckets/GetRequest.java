package com.github.wukong.googlece.models.backendBuckets;

public class GetRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String backendBucket;

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
}