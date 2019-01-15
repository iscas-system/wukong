package com.github.wukong.googlece.models.regionDisks;

public class ResizeRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String region;

	protected java.lang.String disk;

	protected com.google.api.services.compute.model.RegionDisksResizeRequest content;

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
	public void setDisk(java.lang.String disk) {
		this.disk = disk;
}
	public java.lang.String getDisk() {
		return this.disk;
}
	public void setContent(com.google.api.services.compute.model.RegionDisksResizeRequest content) {
		this.content = content;
}
	public com.google.api.services.compute.model.RegionDisksResizeRequest getContent() {
		return this.content;
}
}