package com.github.wukong.googlece.models.sslCertificates;

public class DeleteRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String sslCertificate;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setSslCertificate(java.lang.String sslCertificate) {
		this.sslCertificate = sslCertificate;
}
	public java.lang.String getSslCertificate() {
		return this.sslCertificate;
}
}