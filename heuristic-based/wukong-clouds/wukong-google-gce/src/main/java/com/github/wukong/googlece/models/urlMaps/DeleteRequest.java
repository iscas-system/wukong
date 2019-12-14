package com.github.wukong.googlece.models.urlMaps;

public class DeleteRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String urlMap;

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
}