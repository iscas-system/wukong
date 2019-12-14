package com.github.wukong.googlece.models.urlMaps;

public class ValidateRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String urlMap;

	protected com.google.api.services.compute.model.UrlMapsValidateRequest content;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setUrlMap(java.lang.String urlMap) {
		this.urlMap = urlMap;
}
	public java.lang.String getUrlMap() {
		return this.urlMap;
}
	public void setContent(com.google.api.services.compute.model.UrlMapsValidateRequest content) {
		this.content = content;
}
	public com.google.api.services.compute.model.UrlMapsValidateRequest getContent() {
		return this.content;
}
}