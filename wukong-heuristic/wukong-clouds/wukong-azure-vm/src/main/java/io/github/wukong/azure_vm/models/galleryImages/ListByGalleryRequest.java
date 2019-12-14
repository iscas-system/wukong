package io.github.wukong.azure_vm.models.galleryImages;

public class ListByGalleryRequest implements io.github.wukong.azure_vm.models.AbstractAzureRequest {
	protected java.lang.String resourceGroupName;

	protected java.lang.String galleryName;

	public void setResourceGroupName(java.lang.String resourceGroupName) {
		this.resourceGroupName = resourceGroupName;
}
	public java.lang.String getResourceGroupName() {
		return this.resourceGroupName;
}
	public void setGalleryName(java.lang.String galleryName) {
		this.galleryName = galleryName;
}
	public java.lang.String getGalleryName() {
		return this.galleryName;
}
}