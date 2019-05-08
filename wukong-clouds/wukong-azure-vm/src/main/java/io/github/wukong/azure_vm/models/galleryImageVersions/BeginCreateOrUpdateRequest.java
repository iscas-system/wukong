package com.github.wukong.azurevm.models.galleryImageVersions;

public class BeginCreateOrUpdateRequest implements com.github.wukong.azurevm.models.AbstractAzureRequest {
	protected java.lang.String resourceGroupName;

	protected java.lang.String galleryName;

	protected java.lang.String galleryImageName;

	protected java.lang.String galleryImageVersionName;

	protected com.microsoft.azure.management.compute.implementation.GalleryImageVersionInner galleryImageVersion;

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
	public void setGalleryImageVersionName(java.lang.String galleryImageVersionName) {
		this.galleryImageVersionName = galleryImageVersionName;
}
	public java.lang.String getGalleryImageVersionName() {
		return this.galleryImageVersionName;
}
	public void setGalleryImageVersion(com.microsoft.azure.management.compute.implementation.GalleryImageVersionInner galleryImageVersion) {
		this.galleryImageVersion = galleryImageVersion;
}
	public com.microsoft.azure.management.compute.implementation.GalleryImageVersionInner getGalleryImageVersion() {
		return this.galleryImageVersion;
}
}