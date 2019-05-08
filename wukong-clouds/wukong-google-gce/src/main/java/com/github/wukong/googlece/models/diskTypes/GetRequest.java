package com.github.wukong.googlece.models.diskTypes;

public class GetRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String zone;

	protected java.lang.String diskType;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setZone(java.lang.String zone) {
		this.zone = zone;
}
	public java.lang.String getZone() {
		return this.zone;
}
	public void setDiskType(java.lang.String diskType) {
		this.diskType = diskType;
}
	public java.lang.String getDiskType() {
		return this.diskType;
}
}