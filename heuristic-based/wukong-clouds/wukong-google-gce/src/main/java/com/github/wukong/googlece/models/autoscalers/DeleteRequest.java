package com.github.wukong.googlece.models.autoscalers;

public class DeleteRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String zone;

	protected java.lang.String autoscaler;

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
	public void setAutoscaler(java.lang.String autoscaler) {
		this.autoscaler = autoscaler;
}
	public java.lang.String getAutoscaler() {
		return this.autoscaler;
}
}