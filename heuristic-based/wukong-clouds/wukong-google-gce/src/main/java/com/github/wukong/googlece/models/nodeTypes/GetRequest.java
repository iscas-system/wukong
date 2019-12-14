package com.github.wukong.googlece.models.nodeTypes;

public class GetRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String zone;

	protected java.lang.String nodeType;

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
	public void setNodeType(java.lang.String nodeType) {
		this.nodeType = nodeType;
}
	public java.lang.String getNodeType() {
		return this.nodeType;
}
}