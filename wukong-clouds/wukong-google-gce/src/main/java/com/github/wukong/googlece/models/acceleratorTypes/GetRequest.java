package com.github.wukong.googlece.models.acceleratorTypes;

public class GetRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String zone;

	protected java.lang.String acceleratorType;

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
	public void setAcceleratorType(java.lang.String acceleratorType) {
		this.acceleratorType = acceleratorType;
}
	public java.lang.String getAcceleratorType() {
		return this.acceleratorType;
}
}