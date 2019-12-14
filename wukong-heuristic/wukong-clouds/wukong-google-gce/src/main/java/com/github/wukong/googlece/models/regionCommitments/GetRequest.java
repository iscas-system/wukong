package com.github.wukong.googlece.models.regionCommitments;

public class GetRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String region;

	protected java.lang.String commitment;

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
	public void setCommitment(java.lang.String commitment) {
		this.commitment = commitment;
}
	public java.lang.String getCommitment() {
		return this.commitment;
}
}