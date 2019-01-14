package com.github.wukong.azurevm.models.galleries;

public class CreateOrUpdateRequest implements com.github.wukong.azurevm.models.AbstractAzureRequest {
	protected java.lang.String resourceGroupName;

	protected java.lang.String galleryName;

	protected com.microsoft.azure.management.compute.implementation.GalleryInner gallery;

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
	public void setGallery(com.microsoft.azure.management.compute.implementation.GalleryInner gallery) {
		this.gallery = gallery;
}
	public com.microsoft.azure.management.compute.implementation.GalleryInner getGallery() {
		return this.gallery;
}
}