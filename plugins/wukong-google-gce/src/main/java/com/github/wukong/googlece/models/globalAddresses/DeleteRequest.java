package com.github.wukong.googlece.models.globalAddresses;

public class DeleteRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String address;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setAddress(java.lang.String address) {
		this.address = address;
}
	public java.lang.String getAddress() {
		return this.address;
}
}