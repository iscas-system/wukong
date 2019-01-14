package com.github.wukong.azurevm.models.galleryImages;

public class CreateOrUpdateRequest implements com.github.wukong.azurevm.models.AbstractAzureRequest {
	protected java.lang.String resourceGroupName;

	protected java.lang.String galleryName;

	protected java.lang.String galleryImageName;

	protected com.microsoft.azure.management.compute.implementation.GalleryImageInner galleryImage;

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
	public void setGalleryImageName(java.lang.String galleryImageName) {
		this.galleryImageName = galleryImageName;
}
	public java.lang.String getGalleryImageName() {
		return this.galleryImageName;
}
	public void setGalleryImage(com.microsoft.azure.management.compute.implementation.GalleryImageInner galleryImage) {
		this.galleryImage = galleryImage;
}
	public com.microsoft.azure.management.compute.implementation.GalleryImageInner getGalleryImage() {
		return this.galleryImage;
}
}