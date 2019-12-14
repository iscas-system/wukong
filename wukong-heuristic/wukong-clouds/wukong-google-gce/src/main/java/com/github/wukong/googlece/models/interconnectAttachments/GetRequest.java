package com.github.wukong.googlece.models.interconnectAttachments;

public class GetRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String region;

	protected java.lang.String interconnectAttachment;

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
	public void setInterconnectAttachment(java.lang.String interconnectAttachment) {
		this.interconnectAttachment = interconnectAttachment;
}
	public java.lang.String getInterconnectAttachment() {
		return this.interconnectAttachment;
}
}