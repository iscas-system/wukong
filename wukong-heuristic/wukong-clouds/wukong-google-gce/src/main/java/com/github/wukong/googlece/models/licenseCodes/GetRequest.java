package com.github.wukong.googlece.models.licenseCodes;

public class GetRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String licenseCode;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setLicenseCode(java.lang.String licenseCode) {
		this.licenseCode = licenseCode;
}
	public java.lang.String getLicenseCode() {
		return this.licenseCode;
}
}