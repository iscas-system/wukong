package com.github.wukong.googlece.models.globalForwardingRules;

public class GetRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String forwardingRule;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setForwardingRule(java.lang.String forwardingRule) {
		this.forwardingRule = forwardingRule;
}
	public java.lang.String getForwardingRule() {
		return this.forwardingRule;
}
}