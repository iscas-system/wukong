package com.github.wukong.googlece.models.routers;

public class GetRouterStatusRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String region;

	protected java.lang.String router;

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
	public void setRouter(java.lang.String router) {
		this.router = router;
}
	public java.lang.String getRouter() {
		return this.router;
}
}