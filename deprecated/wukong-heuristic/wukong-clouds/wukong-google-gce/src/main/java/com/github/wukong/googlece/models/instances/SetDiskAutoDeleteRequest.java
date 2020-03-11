package com.github.wukong.googlece.models.instances;

public class SetDiskAutoDeleteRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String zone;

	protected java.lang.String instance;

	protected java.lang.Boolean autoDelete;

	protected java.lang.String deviceName;

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
	public void setInstance(java.lang.String instance) {
		this.instance = instance;
}
	public java.lang.String getInstance() {
		return this.instance;
}
	public void setAutoDelete(java.lang.Boolean autoDelete) {
		this.autoDelete = autoDelete;
}
	public java.lang.Boolean getAutoDelete() {
		return this.autoDelete;
}
	public void setDeviceName(java.lang.String deviceName) {
		this.deviceName = deviceName;
}
	public java.lang.String getDeviceName() {
		return this.deviceName;
}
}