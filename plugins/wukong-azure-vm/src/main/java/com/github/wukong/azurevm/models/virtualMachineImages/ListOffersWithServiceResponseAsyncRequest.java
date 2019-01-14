package com.github.wukong.azurevm.models.virtualMachineImages;

public class ListOffersWithServiceResponseAsyncRequest implements com.github.wukong.azurevm.models.AbstractAzureRequest {
	protected java.lang.String location;

	protected java.lang.String publisherName;

	public void setLocation(java.lang.String location) {
		this.location = location;
}
	public java.lang.String getLocation() {
		return this.location;
}
	public void setPublisherName(java.lang.String publisherName) {
		this.publisherName = publisherName;
}
	public java.lang.String getPublisherName() {
		return this.publisherName;
}
}