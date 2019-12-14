package com.github.wukong.googlece.models.snapshots;

public class GetRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String snapshot;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setSnapshot(java.lang.String snapshot) {
		this.snapshot = snapshot;
}
	public java.lang.String getSnapshot() {
		return this.snapshot;
}
}