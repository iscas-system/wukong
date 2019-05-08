package com.github.wukong.azurevm.models.images;

public class CreateOrUpdateRequest implements com.github.wukong.azurevm.models.AbstractAzureRequest {
	protected java.lang.String resourceGroupName;

	protected java.lang.String imageName;

	protected com.microsoft.azure.management.compute.implementation.ImageInner parameters;

	public void setResourceGroupName(java.lang.String resourceGroupName) {
		this.resourceGroupName = resourceGroupName;
}
	public java.lang.String getResourceGroupName() {
		return this.resourceGroupName;
}
	public void setImageName(java.lang.String imageName) {
		this.imageName = imageName;
}
	public java.lang.String getImageName() {
		return this.imageName;
}
	public void setParameters(com.microsoft.azure.management.compute.implementation.ImageInner parameters) {
		this.parameters = parameters;
}
	public com.microsoft.azure.management.compute.implementation.ImageInner getParameters() {
		return this.parameters;
}
}