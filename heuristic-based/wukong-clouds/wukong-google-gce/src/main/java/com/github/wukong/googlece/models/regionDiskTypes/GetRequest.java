package com.github.wukong.googlece.models.regionDiskTypes;

public class GetRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String region;

	protected java.lang.String diskType;

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
	public void setDiskType(java.lang.String diskType) {
		this.diskType = diskType;
}
	public java.lang.String getDiskType() {
		return this.diskType;
}
}