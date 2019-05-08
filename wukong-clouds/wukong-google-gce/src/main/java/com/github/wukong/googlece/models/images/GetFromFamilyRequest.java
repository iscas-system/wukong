package com.github.wukong.googlece.models.images;

public class GetFromFamilyRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String family;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setFamily(java.lang.String family) {
		this.family = family;
}
	public java.lang.String getFamily() {
		return this.family;
}
}