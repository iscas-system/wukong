package com.github.wukong.googlece.models.forwardingRules;

public class SetTargetRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String region;

	protected java.lang.String forwardingRule;

	protected com.google.api.services.compute.model.TargetReference content;

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
	public void setForwardingRule(java.lang.String forwardingRule) {
		this.forwardingRule = forwardingRule;
}
	public java.lang.String getForwardingRule() {
		return this.forwardingRule;
}
	public void setContent(com.google.api.services.compute.model.TargetReference content) {
		this.content = content;
}
	public com.google.api.services.compute.model.TargetReference getContent() {
		return this.content;
}
}