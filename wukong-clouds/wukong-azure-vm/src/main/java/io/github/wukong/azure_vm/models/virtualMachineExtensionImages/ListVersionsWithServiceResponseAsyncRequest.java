package io.github.wukong.azure_vm.models.virtualMachineExtensionImages;

public class ListVersionsWithServiceResponseAsyncRequest implements io.github.wukong.azure_vm.models.AbstractAzureRequest {
	protected java.lang.String location;

	protected java.lang.String publisherName;

	protected java.lang.String type;

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
	public void setType(java.lang.String type) {
		this.type = type;
}
	public java.lang.String getType() {
		return this.type;
}
}