package com.github.wukong.googlece.models.routes;

public class DeleteRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String route;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setRoute(java.lang.String route) {
		this.route = route;
}
	public java.lang.String getRoute() {
		return this.route;
}
}