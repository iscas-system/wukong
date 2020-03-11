package com.github.wukong.googlece.models.images;

public class DeprecateRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String image;

	protected com.google.api.services.compute.model.DeprecationStatus content;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setImage(java.lang.String image) {
		this.image = image;
}
	public java.lang.String getImage() {
		return this.image;
}
	public void setContent(com.google.api.services.compute.model.DeprecationStatus content) {
		this.content = content;
}
	public com.google.api.services.compute.model.DeprecationStatus getContent() {
		return this.content;
}
}