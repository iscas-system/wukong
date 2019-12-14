package io.github.wukong.azure_vm.models.virtualMachineScaleSetExtensions;

public class ListNextRequest implements io.github.wukong.azure_vm.models.AbstractAzureRequest {
	protected java.lang.String nextPageLink;

	public void setNextPageLink(java.lang.String nextPageLink) {
		this.nextPageLink = nextPageLink;
}
	public java.lang.String getNextPageLink() {
		return this.nextPageLink;
}
}