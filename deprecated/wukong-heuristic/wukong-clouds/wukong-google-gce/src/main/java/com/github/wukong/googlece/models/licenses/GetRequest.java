package com.github.wukong.googlece.models.licenses;

public class GetRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String license;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setLicense(java.lang.String license) {
		this.license = license;
}
	public java.lang.String getLicense() {
		return this.license;
}
}