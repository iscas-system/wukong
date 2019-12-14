package io.github.wukong.azure_vm.models.images;

public class DeleteAsyncRequest implements io.github.wukong.azure_vm.models.AbstractAzureRequest {
	protected java.lang.String resourceGroupName;

	protected java.lang.String imageName;

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
}