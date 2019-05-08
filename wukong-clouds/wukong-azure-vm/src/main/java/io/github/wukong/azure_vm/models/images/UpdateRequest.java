package io.github.wukong.azure_vm.models.images;

public class UpdateRequest implements io.github.wukong.azure_vm.models.AbstractAzureRequest {
	protected java.lang.String resourceGroupName;

	protected java.lang.String imageName;

	protected com.microsoft.azure.management.compute.ImageUpdate parameters;

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
	public void setParameters(com.microsoft.azure.management.compute.ImageUpdate parameters) {
		this.parameters = parameters;
}
	public com.microsoft.azure.management.compute.ImageUpdate getParameters() {
		return this.parameters;
}
}