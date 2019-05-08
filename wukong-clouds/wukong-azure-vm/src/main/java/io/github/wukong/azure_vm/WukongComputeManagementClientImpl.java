/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package io.github.wukong.azure_vm;

import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import com.github.kubesys.tool.generators.CodesTool;
import com.microsoft.azure.management.compute.implementation.ComputeManagementClientImpl;
import com.microsoft.rest.RestClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;

import io.github.wukong.azure_vm.models.AbstractAzureRequest;

/**
 * @author wuheng@iscas.ac.cn
 * @since  2019.1
 */
public class WukongComputeManagementClientImpl extends ComputeManagementClientImpl {

	public WukongComputeManagementClientImpl(RestClient restClient) {
		super(restClient);
	}

	public WukongComputeManagementClientImpl(ServiceClientCredentials credentials) {
		super(credentials);
	}

	public WukongComputeManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
		super(baseUrl, credentials);
	}
	
	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.UsageInner>>> listWithServiceResponseAsyncUsages(io.github.wukong.azure_vm.models.usages.ListWithServiceResponseAsyncRequest request) {
		return this.usages().listWithServiceResponseAsync(request.getLocation());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.UsageInner>>> listNextWithServiceResponseAsyncUsages(io.github.wukong.azure_vm.models.usages.ListNextWithServiceResponseAsyncRequest request) {
		return this.usages().listNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.UsageInner> listNextUsages(io.github.wukong.azure_vm.models.usages.ListNextRequest request) {
		return this.usages().listNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.UsageInner>> listNextAsyncUsages(io.github.wukong.azure_vm.models.usages.ListNextAsyncRequest request) {
		return this.usages().listNextAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.UsageInner>>> listNextSinglePageAsyncUsages(io.github.wukong.azure_vm.models.usages.ListNextSinglePageAsyncRequest request) {
		return this.usages().listNextSinglePageAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.UsageInner>>> listSinglePageAsyncUsages(io.github.wukong.azure_vm.models.usages.ListSinglePageAsyncRequest request) {
		return this.usages().listSinglePageAsync(request.getLocation());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.UsageInner> listUsages(io.github.wukong.azure_vm.models.usages.ListRequest request) {
		return this.usages().list(request.getLocation());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.UsageInner>> listAsyncUsages(io.github.wukong.azure_vm.models.usages.ListAsyncRequest request) {
		return this.usages().listAsync(request.getLocation());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.util.List<com.microsoft.azure.management.compute.implementation.ComputeOperationValueInner>>> listWithServiceResponseAsyncOperations(io.github.wukong.azure_vm.models.operations.ListWithServiceResponseAsyncRequest request) {
		return this.operations().listWithServiceResponseAsync();
	}

	public java.util.List<com.microsoft.azure.management.compute.implementation.ComputeOperationValueInner> listOperations(io.github.wukong.azure_vm.models.operations.ListRequest request) {
		return this.operations().list();
	}

	public rx.Observable<java.util.List<com.microsoft.azure.management.compute.implementation.ComputeOperationValueInner>> listAsyncOperations(io.github.wukong.azure_vm.models.operations.ListAsyncRequest request) {
		return this.operations().listAsync();
	}

	public com.microsoft.azure.management.compute.implementation.AvailabilitySetInner getByResourceGroupAvailabilitySets(io.github.wukong.azure_vm.models.availabilitySets.GetByResourceGroupRequest request) {
		return this.availabilitySets().getByResourceGroup(request.getResourceGroupName(),request.getAvailabilitySetName());
	}

	public java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineSizeInner> listAvailableSizesAvailabilitySets(io.github.wukong.azure_vm.models.availabilitySets.ListAvailableSizesRequest request) {
		return this.availabilitySets().listAvailableSizes(request.getResourceGroupName(),request.getAvailabilitySetName());
	}

	public com.microsoft.azure.management.compute.implementation.AvailabilitySetInner createOrUpdateAvailabilitySets(io.github.wukong.azure_vm.models.availabilitySets.CreateOrUpdateRequest request) {
		return this.availabilitySets().createOrUpdate(request.getResourceGroupName(),request.getAvailabilitySetName(),request.getParameters());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.lang.Void>> deleteWithServiceResponseAsyncAvailabilitySets(io.github.wukong.azure_vm.models.availabilitySets.DeleteWithServiceResponseAsyncRequest request) {
		return this.availabilitySets().deleteWithServiceResponseAsync(request.getResourceGroupName(),request.getAvailabilitySetName());
	}

	public rx.Observable<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineSizeInner>> listAvailableSizesAsyncAvailabilitySets(io.github.wukong.azure_vm.models.availabilitySets.ListAvailableSizesAsyncRequest request) {
		return this.availabilitySets().listAvailableSizesAsync(request.getResourceGroupName(),request.getAvailabilitySetName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineSizeInner>>> listAvailableSizesWithServiceResponseAsyncAvailabilitySets(io.github.wukong.azure_vm.models.availabilitySets.ListAvailableSizesWithServiceResponseAsyncRequest request) {
		return this.availabilitySets().listAvailableSizesWithServiceResponseAsync(request.getResourceGroupName(),request.getAvailabilitySetName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.util.List<com.microsoft.azure.management.compute.implementation.AvailabilitySetInner>>> listByResourceGroupWithServiceResponseAsyncAvailabilitySets(io.github.wukong.azure_vm.models.availabilitySets.ListByResourceGroupWithServiceResponseAsyncRequest request) {
		return this.availabilitySets().listByResourceGroupWithServiceResponseAsync(request.getResourceGroupName());
	}

	public com.microsoft.azure.management.compute.implementation.AvailabilitySetInner updateAvailabilitySets(io.github.wukong.azure_vm.models.availabilitySets.UpdateRequest request) {
		return this.availabilitySets().update(request.getResourceGroupName(),request.getAvailabilitySetName(),request.getParameters());
	}

	public rx.Observable<java.lang.Void> deleteAsyncAvailabilitySets(io.github.wukong.azure_vm.models.availabilitySets.DeleteAsyncRequest request) {
		return this.availabilitySets().deleteAsync(request.getResourceGroupName(),request.getAvailabilitySetName());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.AvailabilitySetInner>> listByResourceGroupAsyncAvailabilitySets(io.github.wukong.azure_vm.models.availabilitySets.ListByResourceGroupAsyncRequest request) {
		return this.availabilitySets().listByResourceGroupAsync(request.getResourceGroupName());
	}

	public void deleteAvailabilitySets(io.github.wukong.azure_vm.models.availabilitySets.DeleteRequest request) {
		this.availabilitySets().delete(request.getResourceGroupName(),request.getAvailabilitySetName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.AvailabilitySetInner> listByResourceGroupAvailabilitySets(io.github.wukong.azure_vm.models.availabilitySets.ListByResourceGroupRequest request) {
		return this.availabilitySets().listByResourceGroup(request.getResourceGroupName());
	}

	public java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionImageInner> listVersionsVirtualMachineExtensionImages(io.github.wukong.azure_vm.models.virtualMachineExtensionImages.ListVersionsRequest request) {
		return this.virtualMachineExtensionImages().listVersions(request.getLocation(),request.getPublisherName(),request.getType());
	}

	public rx.Observable<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionImageInner>> listVersionsAsyncVirtualMachineExtensionImages(io.github.wukong.azure_vm.models.virtualMachineExtensionImages.ListVersionsAsyncRequest request) {
		return this.virtualMachineExtensionImages().listVersionsAsync(request.getLocation(),request.getPublisherName(),request.getType());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionImageInner>>> listTypesWithServiceResponseAsyncVirtualMachineExtensionImages(io.github.wukong.azure_vm.models.virtualMachineExtensionImages.ListTypesWithServiceResponseAsyncRequest request) {
		return this.virtualMachineExtensionImages().listTypesWithServiceResponseAsync(request.getLocation(),request.getPublisherName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionImageInner getVirtualMachineExtensionImages(io.github.wukong.azure_vm.models.virtualMachineExtensionImages.GetRequest request) {
		return this.virtualMachineExtensionImages().get(request.getLocation(),request.getPublisherName(),request.getType(),request.getVersion());
	}

	public java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionImageInner> listTypesVirtualMachineExtensionImages(io.github.wukong.azure_vm.models.virtualMachineExtensionImages.ListTypesRequest request) {
		return this.virtualMachineExtensionImages().listTypes(request.getLocation(),request.getPublisherName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionImageInner>>> listVersionsWithServiceResponseAsyncVirtualMachineExtensionImages(io.github.wukong.azure_vm.models.virtualMachineExtensionImages.ListVersionsWithServiceResponseAsyncRequest request) {
		return this.virtualMachineExtensionImages().listVersionsWithServiceResponseAsync(request.getLocation(),request.getPublisherName(),request.getType());
	}

	public rx.Observable<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionImageInner>> listTypesAsyncVirtualMachineExtensionImages(io.github.wukong.azure_vm.models.virtualMachineExtensionImages.ListTypesAsyncRequest request) {
		return this.virtualMachineExtensionImages().listTypesAsync(request.getLocation(),request.getPublisherName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionsListResultInner>> listWithServiceResponseAsyncVirtualMachineExtensions(io.github.wukong.azure_vm.models.virtualMachineExtensions.ListWithServiceResponseAsyncRequest request) {
		return this.virtualMachineExtensions().listWithServiceResponseAsync(request.getResourceGroupName(),request.getVmName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionInner createOrUpdateVirtualMachineExtensions(io.github.wukong.azure_vm.models.virtualMachineExtensions.CreateOrUpdateRequest request) {
		return this.virtualMachineExtensions().createOrUpdate(request.getResourceGroupName(),request.getVmName(),request.getVmExtensionName(),request.getExtensionParameters());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.lang.Void>> deleteWithServiceResponseAsyncVirtualMachineExtensions(io.github.wukong.azure_vm.models.virtualMachineExtensions.DeleteWithServiceResponseAsyncRequest request) {
		return this.virtualMachineExtensions().deleteWithServiceResponseAsync(request.getResourceGroupName(),request.getVmName(),request.getVmExtensionName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionInner getVirtualMachineExtensions(io.github.wukong.azure_vm.models.virtualMachineExtensions.GetRequest request) {
		return this.virtualMachineExtensions().get(request.getResourceGroupName(),request.getVmName(),request.getVmExtensionName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionInner updateVirtualMachineExtensions(io.github.wukong.azure_vm.models.virtualMachineExtensions.UpdateRequest request) {
		return this.virtualMachineExtensions().update(request.getResourceGroupName(),request.getVmName(),request.getVmExtensionName(),request.getExtensionParameters());
	}

	public rx.Observable<java.lang.Void> deleteAsyncVirtualMachineExtensions(io.github.wukong.azure_vm.models.virtualMachineExtensions.DeleteAsyncRequest request) {
		return this.virtualMachineExtensions().deleteAsync(request.getResourceGroupName(),request.getVmName(),request.getVmExtensionName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionInner beginCreateOrUpdateVirtualMachineExtensions(io.github.wukong.azure_vm.models.virtualMachineExtensions.BeginCreateOrUpdateRequest request) {
		return this.virtualMachineExtensions().beginCreateOrUpdate(request.getResourceGroupName(),request.getVmName(),request.getVmExtensionName(),request.getExtensionParameters());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionsListResultInner listVirtualMachineExtensions(io.github.wukong.azure_vm.models.virtualMachineExtensions.ListRequest request) {
		return this.virtualMachineExtensions().list(request.getResourceGroupName(),request.getVmName());
	}

	public rx.Observable<com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionsListResultInner> listAsyncVirtualMachineExtensions(io.github.wukong.azure_vm.models.virtualMachineExtensions.ListAsyncRequest request) {
		return this.virtualMachineExtensions().listAsync(request.getResourceGroupName(),request.getVmName());
	}

	public void deleteVirtualMachineExtensions(io.github.wukong.azure_vm.models.virtualMachineExtensions.DeleteRequest request) {
		this.virtualMachineExtensions().delete(request.getResourceGroupName(),request.getVmName(),request.getVmExtensionName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionInner beginUpdateVirtualMachineExtensions(io.github.wukong.azure_vm.models.virtualMachineExtensions.BeginUpdateRequest request) {
		return this.virtualMachineExtensions().beginUpdate(request.getResourceGroupName(),request.getVmName(),request.getVmExtensionName(),request.getExtensionParameters());
	}

	public java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineImageResourceInner> listSkusVirtualMachineImages(io.github.wukong.azure_vm.models.virtualMachineImages.ListSkusRequest request) {
		return this.virtualMachineImages().listSkus(request.getLocation(),request.getPublisherName(),request.getOffer());
	}

	public rx.Observable<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineImageResourceInner>> listPublishersAsyncVirtualMachineImages(io.github.wukong.azure_vm.models.virtualMachineImages.ListPublishersAsyncRequest request) {
		return this.virtualMachineImages().listPublishersAsync(request.getLocation());
	}

	public rx.Observable<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineImageResourceInner>> listOffersAsyncVirtualMachineImages(io.github.wukong.azure_vm.models.virtualMachineImages.ListOffersAsyncRequest request) {
		return this.virtualMachineImages().listOffersAsync(request.getLocation(),request.getPublisherName());
	}

	public java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineImageResourceInner> listPublishersVirtualMachineImages(io.github.wukong.azure_vm.models.virtualMachineImages.ListPublishersRequest request) {
		return this.virtualMachineImages().listPublishers(request.getLocation());
	}

	public java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineImageResourceInner> listVirtualMachineImages(io.github.wukong.azure_vm.models.virtualMachineImages.ListRequest request) {
		return this.virtualMachineImages().list(request.getLocation(),request.getPublisherName(),request.getOffer(),request.getSkus());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineImageResourceInner>>> listSkusWithServiceResponseAsyncVirtualMachineImages(io.github.wukong.azure_vm.models.virtualMachineImages.ListSkusWithServiceResponseAsyncRequest request) {
		return this.virtualMachineImages().listSkusWithServiceResponseAsync(request.getLocation(),request.getPublisherName(),request.getOffer());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineImageResourceInner>>> listOffersWithServiceResponseAsyncVirtualMachineImages(io.github.wukong.azure_vm.models.virtualMachineImages.ListOffersWithServiceResponseAsyncRequest request) {
		return this.virtualMachineImages().listOffersWithServiceResponseAsync(request.getLocation(),request.getPublisherName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineImageResourceInner>>> listWithServiceResponseAsyncVirtualMachineImages(io.github.wukong.azure_vm.models.virtualMachineImages.ListWithServiceResponseAsyncRequest request) {
		return this.virtualMachineImages().listWithServiceResponseAsync(request.getLocation(),request.getPublisherName(),request.getOffer(),request.getSkus());
	}

	public java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineImageResourceInner> listOffersVirtualMachineImages(io.github.wukong.azure_vm.models.virtualMachineImages.ListOffersRequest request) {
		return this.virtualMachineImages().listOffers(request.getLocation(),request.getPublisherName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineImageInner getVirtualMachineImages(io.github.wukong.azure_vm.models.virtualMachineImages.GetRequest request) {
		return this.virtualMachineImages().get(request.getLocation(),request.getPublisherName(),request.getOffer(),request.getSkus(),request.getVersion());
	}

	public rx.Observable<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineImageResourceInner>> listAsyncVirtualMachineImages(io.github.wukong.azure_vm.models.virtualMachineImages.ListAsyncRequest request) {
		return this.virtualMachineImages().listAsync(request.getLocation(),request.getPublisherName(),request.getOffer(),request.getSkus());
	}

	public rx.Observable<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineImageResourceInner>> listSkusAsyncVirtualMachineImages(io.github.wukong.azure_vm.models.virtualMachineImages.ListSkusAsyncRequest request) {
		return this.virtualMachineImages().listSkusAsync(request.getLocation(),request.getPublisherName(),request.getOffer());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineImageResourceInner>>> listPublishersWithServiceResponseAsyncVirtualMachineImages(io.github.wukong.azure_vm.models.virtualMachineImages.ListPublishersWithServiceResponseAsyncRequest request) {
		return this.virtualMachineImages().listPublishersWithServiceResponseAsync(request.getLocation());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineSizeInner>>> listWithServiceResponseAsyncVirtualMachineSizes(io.github.wukong.azure_vm.models.virtualMachineSizes.ListWithServiceResponseAsyncRequest request) {
		return this.virtualMachineSizes().listWithServiceResponseAsync(request.getLocation());
	}

	public java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineSizeInner> listVirtualMachineSizes(io.github.wukong.azure_vm.models.virtualMachineSizes.ListRequest request) {
		return this.virtualMachineSizes().list(request.getLocation());
	}

	public rx.Observable<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineSizeInner>> listAsyncVirtualMachineSizes(io.github.wukong.azure_vm.models.virtualMachineSizes.ListAsyncRequest request) {
		return this.virtualMachineSizes().listAsync(request.getLocation());
	}

	public com.microsoft.azure.management.compute.implementation.ImageInner getByResourceGroupImages(io.github.wukong.azure_vm.models.images.GetByResourceGroupRequest request) {
		return this.images().getByResourceGroup(request.getResourceGroupName(),request.getImageName());
	}

	public com.microsoft.azure.management.compute.implementation.ImageInner createOrUpdateImages(io.github.wukong.azure_vm.models.images.CreateOrUpdateRequest request) {
		return this.images().createOrUpdate(request.getResourceGroupName(),request.getImageName(),request.getParameters());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.ImageInner> listNextImages(io.github.wukong.azure_vm.models.images.ListNextRequest request) {
		return this.images().listNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.lang.Void>> deleteWithServiceResponseAsyncImages(io.github.wukong.azure_vm.models.images.DeleteWithServiceResponseAsyncRequest request) {
		return this.images().deleteWithServiceResponseAsync(request.getResourceGroupName(),request.getImageName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ImageInner>>> listNextSinglePageAsyncImages(io.github.wukong.azure_vm.models.images.ListNextSinglePageAsyncRequest request) {
		return this.images().listNextSinglePageAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ImageInner>>> listByResourceGroupWithServiceResponseAsyncImages(io.github.wukong.azure_vm.models.images.ListByResourceGroupWithServiceResponseAsyncRequest request) {
		return this.images().listByResourceGroupWithServiceResponseAsync(request.getResourceGroupName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ImageInner>>> listSinglePageAsyncImages(io.github.wukong.azure_vm.models.images.ListSinglePageAsyncRequest request) {
		return this.images().listSinglePageAsync();
	}

	public com.microsoft.azure.management.compute.implementation.ImageInner updateImages(io.github.wukong.azure_vm.models.images.UpdateRequest request) {
		return this.images().update(request.getResourceGroupName(),request.getImageName(),request.getParameters());
	}

	public rx.Observable<java.lang.Void> deleteAsyncImages(io.github.wukong.azure_vm.models.images.DeleteAsyncRequest request) {
		return this.images().deleteAsync(request.getResourceGroupName(),request.getImageName());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ImageInner>> listByResourceGroupAsyncImages(io.github.wukong.azure_vm.models.images.ListByResourceGroupAsyncRequest request) {
		return this.images().listByResourceGroupAsync(request.getResourceGroupName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.ImageInner> listImages(io.github.wukong.azure_vm.models.images.ListRequest request) {
		return this.images().list();
	}

	public void deleteImages(io.github.wukong.azure_vm.models.images.DeleteRequest request) {
		this.images().delete(request.getResourceGroupName(),request.getImageName());
	}

	public com.microsoft.azure.management.compute.implementation.ImageInner beginUpdateImages(io.github.wukong.azure_vm.models.images.BeginUpdateRequest request) {
		return this.images().beginUpdate(request.getResourceGroupName(),request.getImageName(),request.getParameters());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.ImageInner> listByResourceGroupImages(io.github.wukong.azure_vm.models.images.ListByResourceGroupRequest request) {
		return this.images().listByResourceGroup(request.getResourceGroupName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ImageInner>>> listWithServiceResponseAsyncImages(io.github.wukong.azure_vm.models.images.ListWithServiceResponseAsyncRequest request) {
		return this.images().listWithServiceResponseAsync();
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ImageInner>>> listNextWithServiceResponseAsyncImages(io.github.wukong.azure_vm.models.images.ListNextWithServiceResponseAsyncRequest request) {
		return this.images().listNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ImageInner>> listNextAsyncImages(io.github.wukong.azure_vm.models.images.ListNextAsyncRequest request) {
		return this.images().listNextAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ImageInner>> listByResourceGroupNextAsyncImages(io.github.wukong.azure_vm.models.images.ListByResourceGroupNextAsyncRequest request) {
		return this.images().listByResourceGroupNextAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.ImageInner> listByResourceGroupNextImages(io.github.wukong.azure_vm.models.images.ListByResourceGroupNextRequest request) {
		return this.images().listByResourceGroupNext(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.ImageInner beginCreateOrUpdateImages(io.github.wukong.azure_vm.models.images.BeginCreateOrUpdateRequest request) {
		return this.images().beginCreateOrUpdate(request.getResourceGroupName(),request.getImageName(),request.getParameters());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ImageInner>> listAsyncImages(io.github.wukong.azure_vm.models.images.ListAsyncRequest request) {
		return this.images().listAsync();
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ImageInner>>> listByResourceGroupNextWithServiceResponseAsyncImages(io.github.wukong.azure_vm.models.images.ListByResourceGroupNextWithServiceResponseAsyncRequest request) {
		return this.images().listByResourceGroupNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ImageInner>>> listByResourceGroupSinglePageAsyncImages(io.github.wukong.azure_vm.models.images.ListByResourceGroupSinglePageAsyncRequest request) {
		return this.images().listByResourceGroupSinglePageAsync(request.getResourceGroupName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ImageInner>>> listByResourceGroupNextSinglePageAsyncImages(io.github.wukong.azure_vm.models.images.ListByResourceGroupNextSinglePageAsyncRequest request) {
		return this.images().listByResourceGroupNextSinglePageAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineInner> listNextVirtualMachines(io.github.wukong.azure_vm.models.virtualMachines.ListNextRequest request) {
		return this.virtualMachines().listNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineInner>>> listNextSinglePageAsyncVirtualMachines(io.github.wukong.azure_vm.models.virtualMachines.ListNextSinglePageAsyncRequest request) {
		return this.virtualMachines().listNextSinglePageAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineInner>>> listByResourceGroupWithServiceResponseAsyncVirtualMachines(io.github.wukong.azure_vm.models.virtualMachines.ListByResourceGroupWithServiceResponseAsyncRequest request) {
		return this.virtualMachines().listByResourceGroupWithServiceResponseAsync(request.getResourceGroupName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineInner updateVirtualMachines(io.github.wukong.azure_vm.models.virtualMachines.UpdateRequest request) {
		return this.virtualMachines().update(request.getResourceGroupName(),request.getVmName(),request.getParameters());
	}

	public void deleteVirtualMachines(io.github.wukong.azure_vm.models.virtualMachines.DeleteRequest request) {
		this.virtualMachines().delete(request.getResourceGroupName(),request.getVmName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineInner> listByResourceGroupVirtualMachines(io.github.wukong.azure_vm.models.virtualMachines.ListByResourceGroupRequest request) {
		return this.virtualMachines().listByResourceGroup(request.getResourceGroupName());
	}

	public java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineSizeInner> listAvailableSizesVirtualMachines(io.github.wukong.azure_vm.models.virtualMachines.ListAvailableSizesRequest request) {
		return this.virtualMachines().listAvailableSizes(request.getResourceGroupName(),request.getVmName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineInner>>> listNextWithServiceResponseAsyncVirtualMachines(io.github.wukong.azure_vm.models.virtualMachines.ListNextWithServiceResponseAsyncRequest request) {
		return this.virtualMachines().listNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineInner>> listByResourceGroupNextAsyncVirtualMachines(io.github.wukong.azure_vm.models.virtualMachines.ListByResourceGroupNextAsyncRequest request) {
		return this.virtualMachines().listByResourceGroupNextAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineSizeInner>>> listAvailableSizesWithServiceResponseAsyncVirtualMachines(io.github.wukong.azure_vm.models.virtualMachines.ListAvailableSizesWithServiceResponseAsyncRequest request) {
		return this.virtualMachines().listAvailableSizesWithServiceResponseAsync(request.getResourceGroupName(),request.getVmName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineInner> listByResourceGroupNextVirtualMachines(io.github.wukong.azure_vm.models.virtualMachines.ListByResourceGroupNextRequest request) {
		return this.virtualMachines().listByResourceGroupNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineInner>> listAsyncVirtualMachines(io.github.wukong.azure_vm.models.virtualMachines.ListAsyncRequest request) {
		return this.virtualMachines().listAsync();
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineCaptureResultInner beginCaptureVirtualMachines(io.github.wukong.azure_vm.models.virtualMachines.BeginCaptureRequest request) {
		return this.virtualMachines().beginCapture(request.getResourceGroupName(),request.getVmName(),request.getParameters());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineInner>>> listByResourceGroupSinglePageAsyncVirtualMachines(io.github.wukong.azure_vm.models.virtualMachines.ListByResourceGroupSinglePageAsyncRequest request) {
		return this.virtualMachines().listByResourceGroupSinglePageAsync(request.getResourceGroupName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineInner>>> listByResourceGroupNextSinglePageAsyncVirtualMachines(io.github.wukong.azure_vm.models.virtualMachines.ListByResourceGroupNextSinglePageAsyncRequest request) {
		return this.virtualMachines().listByResourceGroupNextSinglePageAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineInner getByResourceGroupVirtualMachines(io.github.wukong.azure_vm.models.virtualMachines.GetByResourceGroupRequest request) {
		return this.virtualMachines().getByResourceGroup(request.getResourceGroupName(),request.getVmName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineInner createOrUpdateVirtualMachines(io.github.wukong.azure_vm.models.virtualMachines.CreateOrUpdateRequest request) {
		return this.virtualMachines().createOrUpdate(request.getResourceGroupName(),request.getVmName(),request.getParameters());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.lang.Void>> deleteWithServiceResponseAsyncVirtualMachines(io.github.wukong.azure_vm.models.virtualMachines.DeleteWithServiceResponseAsyncRequest request) {
		return this.virtualMachines().deleteWithServiceResponseAsync(request.getResourceGroupName(),request.getVmName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineInner>>> listSinglePageAsyncVirtualMachines(io.github.wukong.azure_vm.models.virtualMachines.ListSinglePageAsyncRequest request) {
		return this.virtualMachines().listSinglePageAsync();
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineCaptureResultInner captureVirtualMachines(io.github.wukong.azure_vm.models.virtualMachines.CaptureRequest request) {
		return this.virtualMachines().capture(request.getResourceGroupName(),request.getVmName(),request.getParameters());
	}

	public rx.Observable<java.lang.Void> deleteAsyncVirtualMachines(io.github.wukong.azure_vm.models.virtualMachines.DeleteAsyncRequest request) {
		return this.virtualMachines().deleteAsync(request.getResourceGroupName(),request.getVmName());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineInner>> listByResourceGroupAsyncVirtualMachines(io.github.wukong.azure_vm.models.virtualMachines.ListByResourceGroupAsyncRequest request) {
		return this.virtualMachines().listByResourceGroupAsync(request.getResourceGroupName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineInner> listVirtualMachines(io.github.wukong.azure_vm.models.virtualMachines.ListRequest request) {
		return this.virtualMachines().list();
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineInner beginUpdateVirtualMachines(io.github.wukong.azure_vm.models.virtualMachines.BeginUpdateRequest request) {
		return this.virtualMachines().beginUpdate(request.getResourceGroupName(),request.getVmName(),request.getParameters());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineInner>>> listWithServiceResponseAsyncVirtualMachines(io.github.wukong.azure_vm.models.virtualMachines.ListWithServiceResponseAsyncRequest request) {
		return this.virtualMachines().listWithServiceResponseAsync();
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineInner>> listNextAsyncVirtualMachines(io.github.wukong.azure_vm.models.virtualMachines.ListNextAsyncRequest request) {
		return this.virtualMachines().listNextAsync(request.getNextPageLink());
	}

	public rx.Observable<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineSizeInner>> listAvailableSizesAsyncVirtualMachines(io.github.wukong.azure_vm.models.virtualMachines.ListAvailableSizesAsyncRequest request) {
		return this.virtualMachines().listAvailableSizesAsync(request.getResourceGroupName(),request.getVmName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineInner beginCreateOrUpdateVirtualMachines(io.github.wukong.azure_vm.models.virtualMachines.BeginCreateOrUpdateRequest request) {
		return this.virtualMachines().beginCreateOrUpdate(request.getResourceGroupName(),request.getVmName(),request.getParameters());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineInner>>> listByResourceGroupNextWithServiceResponseAsyncVirtualMachines(io.github.wukong.azure_vm.models.virtualMachines.ListByResourceGroupNextWithServiceResponseAsyncRequest request) {
		return this.virtualMachines().listByResourceGroupNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetSkuInner> listSkusVirtualMachineScaleSets(io.github.wukong.azure_vm.models.virtualMachineScaleSets.ListSkusRequest request) {
		return this.virtualMachineScaleSets().listSkus(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner> listNextVirtualMachineScaleSets(io.github.wukong.azure_vm.models.virtualMachineScaleSets.ListNextRequest request) {
		return this.virtualMachineScaleSets().listNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner>>> listNextSinglePageAsyncVirtualMachineScaleSets(io.github.wukong.azure_vm.models.virtualMachineScaleSets.ListNextSinglePageAsyncRequest request) {
		return this.virtualMachineScaleSets().listNextSinglePageAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner>>> listByResourceGroupWithServiceResponseAsyncVirtualMachineScaleSets(io.github.wukong.azure_vm.models.virtualMachineScaleSets.ListByResourceGroupWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSets().listByResourceGroupWithServiceResponseAsync(request.getResourceGroupName());
	}

	public void deleteInstancesVirtualMachineScaleSets(io.github.wukong.azure_vm.models.virtualMachineScaleSets.DeleteInstancesRequest request) {
		this.virtualMachineScaleSets().deleteInstances(request.getResourceGroupName(),request.getVmScaleSetName(),request.getInstanceIds());
	}

	public com.microsoft.azure.management.compute.implementation.RecoveryWalkResponseInner forceRecoveryServiceFabricPlatformUpdateDomainWalkVirtualMachineScaleSets(io.github.wukong.azure_vm.models.virtualMachineScaleSets.ForceRecoveryServiceFabricPlatformUpdateDomainWalkRequest request) {
		return this.virtualMachineScaleSets().forceRecoveryServiceFabricPlatformUpdateDomainWalk(request.getResourceGroupName(),request.getVmScaleSetName(),request.getPlatformUpdateDomain());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner updateVirtualMachineScaleSets(io.github.wukong.azure_vm.models.virtualMachineScaleSets.UpdateRequest request) {
		return this.virtualMachineScaleSets().update(request.getResourceGroupName(),request.getVmScaleSetName(),request.getParameters());
	}

	public void deleteVirtualMachineScaleSets(io.github.wukong.azure_vm.models.virtualMachineScaleSets.DeleteRequest request) {
		this.virtualMachineScaleSets().delete(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner> listByResourceGroupVirtualMachineScaleSets(io.github.wukong.azure_vm.models.virtualMachineScaleSets.ListByResourceGroupRequest request) {
		return this.virtualMachineScaleSets().listByResourceGroup(request.getResourceGroupName());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetSkuInner>> listSkusNextAsyncVirtualMachineScaleSets(io.github.wukong.azure_vm.models.virtualMachineScaleSets.ListSkusNextAsyncRequest request) {
		return this.virtualMachineScaleSets().listSkusNextAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.lang.Void>> deleteInstancesWithServiceResponseAsyncVirtualMachineScaleSets(io.github.wukong.azure_vm.models.virtualMachineScaleSets.DeleteInstancesWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSets().deleteInstancesWithServiceResponseAsync(request.getResourceGroupName(),request.getVmScaleSetName(),request.getInstanceIds());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner>>> listNextWithServiceResponseAsyncVirtualMachineScaleSets(io.github.wukong.azure_vm.models.virtualMachineScaleSets.ListNextWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSets().listNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner>> listByResourceGroupNextAsyncVirtualMachineScaleSets(io.github.wukong.azure_vm.models.virtualMachineScaleSets.ListByResourceGroupNextAsyncRequest request) {
		return this.virtualMachineScaleSets().listByResourceGroupNextAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner> listByResourceGroupNextVirtualMachineScaleSets(io.github.wukong.azure_vm.models.virtualMachineScaleSets.ListByResourceGroupNextRequest request) {
		return this.virtualMachineScaleSets().listByResourceGroupNext(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetSkuInner> listSkusNextVirtualMachineScaleSets(io.github.wukong.azure_vm.models.virtualMachineScaleSets.ListSkusNextRequest request) {
		return this.virtualMachineScaleSets().listSkusNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner>> listAsyncVirtualMachineScaleSets(io.github.wukong.azure_vm.models.virtualMachineScaleSets.ListAsyncRequest request) {
		return this.virtualMachineScaleSets().listAsync();
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetSkuInner>> listSkusAsyncVirtualMachineScaleSets(io.github.wukong.azure_vm.models.virtualMachineScaleSets.ListSkusAsyncRequest request) {
		return this.virtualMachineScaleSets().listSkusAsync(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner>>> listByResourceGroupSinglePageAsyncVirtualMachineScaleSets(io.github.wukong.azure_vm.models.virtualMachineScaleSets.ListByResourceGroupSinglePageAsyncRequest request) {
		return this.virtualMachineScaleSets().listByResourceGroupSinglePageAsync(request.getResourceGroupName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner>>> listByResourceGroupNextSinglePageAsyncVirtualMachineScaleSets(io.github.wukong.azure_vm.models.virtualMachineScaleSets.ListByResourceGroupNextSinglePageAsyncRequest request) {
		return this.virtualMachineScaleSets().listByResourceGroupNextSinglePageAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner getByResourceGroupVirtualMachineScaleSets(io.github.wukong.azure_vm.models.virtualMachineScaleSets.GetByResourceGroupRequest request) {
		return this.virtualMachineScaleSets().getByResourceGroup(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner createOrUpdateVirtualMachineScaleSets(io.github.wukong.azure_vm.models.virtualMachineScaleSets.CreateOrUpdateRequest request) {
		return this.virtualMachineScaleSets().createOrUpdate(request.getResourceGroupName(),request.getVmScaleSetName(),request.getParameters());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.lang.Void>> deleteWithServiceResponseAsyncVirtualMachineScaleSets(io.github.wukong.azure_vm.models.virtualMachineScaleSets.DeleteWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSets().deleteWithServiceResponseAsync(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public rx.Observable<java.lang.Void> deleteInstancesAsyncVirtualMachineScaleSets(io.github.wukong.azure_vm.models.virtualMachineScaleSets.DeleteInstancesAsyncRequest request) {
		return this.virtualMachineScaleSets().deleteInstancesAsync(request.getResourceGroupName(),request.getVmScaleSetName(),request.getInstanceIds());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner>>> listSinglePageAsyncVirtualMachineScaleSets(io.github.wukong.azure_vm.models.virtualMachineScaleSets.ListSinglePageAsyncRequest request) {
		return this.virtualMachineScaleSets().listSinglePageAsync();
	}

	public rx.Observable<java.lang.Void> deleteAsyncVirtualMachineScaleSets(io.github.wukong.azure_vm.models.virtualMachineScaleSets.DeleteAsyncRequest request) {
		return this.virtualMachineScaleSets().deleteAsync(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInstanceViewInner getInstanceViewVirtualMachineScaleSets(io.github.wukong.azure_vm.models.virtualMachineScaleSets.GetInstanceViewRequest request) {
		return this.virtualMachineScaleSets().getInstanceView(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner>> listByResourceGroupAsyncVirtualMachineScaleSets(io.github.wukong.azure_vm.models.virtualMachineScaleSets.ListByResourceGroupAsyncRequest request) {
		return this.virtualMachineScaleSets().listByResourceGroupAsync(request.getResourceGroupName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner> listVirtualMachineScaleSets(io.github.wukong.azure_vm.models.virtualMachineScaleSets.ListRequest request) {
		return this.virtualMachineScaleSets().list();
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetSkuInner>>> listSkusNextSinglePageAsyncVirtualMachineScaleSets(io.github.wukong.azure_vm.models.virtualMachineScaleSets.ListSkusNextSinglePageAsyncRequest request) {
		return this.virtualMachineScaleSets().listSkusNextSinglePageAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner beginUpdateVirtualMachineScaleSets(io.github.wukong.azure_vm.models.virtualMachineScaleSets.BeginUpdateRequest request) {
		return this.virtualMachineScaleSets().beginUpdate(request.getResourceGroupName(),request.getVmScaleSetName(),request.getParameters());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetSkuInner>>> listSkusWithServiceResponseAsyncVirtualMachineScaleSets(io.github.wukong.azure_vm.models.virtualMachineScaleSets.ListSkusWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSets().listSkusWithServiceResponseAsync(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner>>> listWithServiceResponseAsyncVirtualMachineScaleSets(io.github.wukong.azure_vm.models.virtualMachineScaleSets.ListWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSets().listWithServiceResponseAsync();
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetSkuInner>>> listSkusSinglePageAsyncVirtualMachineScaleSets(io.github.wukong.azure_vm.models.virtualMachineScaleSets.ListSkusSinglePageAsyncRequest request) {
		return this.virtualMachineScaleSets().listSkusSinglePageAsync(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner>> listNextAsyncVirtualMachineScaleSets(io.github.wukong.azure_vm.models.virtualMachineScaleSets.ListNextAsyncRequest request) {
		return this.virtualMachineScaleSets().listNextAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner beginCreateOrUpdateVirtualMachineScaleSets(io.github.wukong.azure_vm.models.virtualMachineScaleSets.BeginCreateOrUpdateRequest request) {
		return this.virtualMachineScaleSets().beginCreateOrUpdate(request.getResourceGroupName(),request.getVmScaleSetName(),request.getParameters());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner>>> listByResourceGroupNextWithServiceResponseAsyncVirtualMachineScaleSets(io.github.wukong.azure_vm.models.virtualMachineScaleSets.ListByResourceGroupNextWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSets().listByResourceGroupNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetSkuInner>>> listSkusNextWithServiceResponseAsyncVirtualMachineScaleSets(io.github.wukong.azure_vm.models.virtualMachineScaleSets.ListSkusNextWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSets().listSkusNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner createOrUpdateVirtualMachineScaleSetExtensions(io.github.wukong.azure_vm.models.virtualMachineScaleSetExtensions.CreateOrUpdateRequest request) {
		return this.virtualMachineScaleSetExtensions().createOrUpdate(request.getResourceGroupName(),request.getVmScaleSetName(),request.getVmssExtensionName(),request.getExtensionParameters());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner> listNextVirtualMachineScaleSetExtensions(io.github.wukong.azure_vm.models.virtualMachineScaleSetExtensions.ListNextRequest request) {
		return this.virtualMachineScaleSetExtensions().listNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.lang.Void>> deleteWithServiceResponseAsyncVirtualMachineScaleSetExtensions(io.github.wukong.azure_vm.models.virtualMachineScaleSetExtensions.DeleteWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSetExtensions().deleteWithServiceResponseAsync(request.getResourceGroupName(),request.getVmScaleSetName(),request.getVmssExtensionName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner>>> listNextSinglePageAsyncVirtualMachineScaleSetExtensions(io.github.wukong.azure_vm.models.virtualMachineScaleSetExtensions.ListNextSinglePageAsyncRequest request) {
		return this.virtualMachineScaleSetExtensions().listNextSinglePageAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner>>> listSinglePageAsyncVirtualMachineScaleSetExtensions(io.github.wukong.azure_vm.models.virtualMachineScaleSetExtensions.ListSinglePageAsyncRequest request) {
		return this.virtualMachineScaleSetExtensions().listSinglePageAsync(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public rx.Observable<java.lang.Void> deleteAsyncVirtualMachineScaleSetExtensions(io.github.wukong.azure_vm.models.virtualMachineScaleSetExtensions.DeleteAsyncRequest request) {
		return this.virtualMachineScaleSetExtensions().deleteAsync(request.getResourceGroupName(),request.getVmScaleSetName(),request.getVmssExtensionName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner> listVirtualMachineScaleSetExtensions(io.github.wukong.azure_vm.models.virtualMachineScaleSetExtensions.ListRequest request) {
		return this.virtualMachineScaleSetExtensions().list(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public void deleteVirtualMachineScaleSetExtensions(io.github.wukong.azure_vm.models.virtualMachineScaleSetExtensions.DeleteRequest request) {
		this.virtualMachineScaleSetExtensions().delete(request.getResourceGroupName(),request.getVmScaleSetName(),request.getVmssExtensionName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner>>> listWithServiceResponseAsyncVirtualMachineScaleSetExtensions(io.github.wukong.azure_vm.models.virtualMachineScaleSetExtensions.ListWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSetExtensions().listWithServiceResponseAsync(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner>>> listNextWithServiceResponseAsyncVirtualMachineScaleSetExtensions(io.github.wukong.azure_vm.models.virtualMachineScaleSetExtensions.ListNextWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSetExtensions().listNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner>> listNextAsyncVirtualMachineScaleSetExtensions(io.github.wukong.azure_vm.models.virtualMachineScaleSetExtensions.ListNextAsyncRequest request) {
		return this.virtualMachineScaleSetExtensions().listNextAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner getVirtualMachineScaleSetExtensions(io.github.wukong.azure_vm.models.virtualMachineScaleSetExtensions.GetRequest request) {
		return this.virtualMachineScaleSetExtensions().get(request.getResourceGroupName(),request.getVmScaleSetName(),request.getVmssExtensionName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner beginCreateOrUpdateVirtualMachineScaleSetExtensions(io.github.wukong.azure_vm.models.virtualMachineScaleSetExtensions.BeginCreateOrUpdateRequest request) {
		return this.virtualMachineScaleSetExtensions().beginCreateOrUpdate(request.getResourceGroupName(),request.getVmScaleSetName(),request.getVmssExtensionName(),request.getExtensionParameters());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner>> listAsyncVirtualMachineScaleSetExtensions(io.github.wukong.azure_vm.models.virtualMachineScaleSetExtensions.ListAsyncRequest request) {
		return this.virtualMachineScaleSetExtensions().listAsync(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public com.microsoft.azure.management.compute.implementation.RollingUpgradeStatusInfoInner getLatestVirtualMachineScaleSetRollingUpgrades(io.github.wukong.azure_vm.models.virtualMachineScaleSetRollingUpgrades.GetLatestRequest request) {
		return this.virtualMachineScaleSetRollingUpgrades().getLatest(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInner> listNextVirtualMachineScaleSetVMs(io.github.wukong.azure_vm.models.virtualMachineScaleSetVMs.ListNextRequest request) {
		return this.virtualMachineScaleSetVMs().listNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.lang.Void>> deleteWithServiceResponseAsyncVirtualMachineScaleSetVMs(io.github.wukong.azure_vm.models.virtualMachineScaleSetVMs.DeleteWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSetVMs().deleteWithServiceResponseAsync(request.getResourceGroupName(),request.getVmScaleSetName(),request.getInstanceId());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInner>>> listNextSinglePageAsyncVirtualMachineScaleSetVMs(io.github.wukong.azure_vm.models.virtualMachineScaleSetVMs.ListNextSinglePageAsyncRequest request) {
		return this.virtualMachineScaleSetVMs().listNextSinglePageAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInner>>> listSinglePageAsyncVirtualMachineScaleSetVMs(io.github.wukong.azure_vm.models.virtualMachineScaleSetVMs.ListSinglePageAsyncRequest request) {
		return this.virtualMachineScaleSetVMs().listSinglePageAsync(request.getResourceGroupName(),request.getVirtualMachineScaleSetName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInner updateVirtualMachineScaleSetVMs(io.github.wukong.azure_vm.models.virtualMachineScaleSetVMs.UpdateRequest request) {
		return this.virtualMachineScaleSetVMs().update(request.getResourceGroupName(),request.getVmScaleSetName(),request.getInstanceId(),request.getParameters());
	}

	public rx.Observable<java.lang.Void> deleteAsyncVirtualMachineScaleSetVMs(io.github.wukong.azure_vm.models.virtualMachineScaleSetVMs.DeleteAsyncRequest request) {
		return this.virtualMachineScaleSetVMs().deleteAsync(request.getResourceGroupName(),request.getVmScaleSetName(),request.getInstanceId());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInstanceViewInner getInstanceViewVirtualMachineScaleSetVMs(io.github.wukong.azure_vm.models.virtualMachineScaleSetVMs.GetInstanceViewRequest request) {
		return this.virtualMachineScaleSetVMs().getInstanceView(request.getResourceGroupName(),request.getVmScaleSetName(),request.getInstanceId());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInner> listVirtualMachineScaleSetVMs(io.github.wukong.azure_vm.models.virtualMachineScaleSetVMs.ListRequest request) {
		return this.virtualMachineScaleSetVMs().list(request.getResourceGroupName(),request.getVirtualMachineScaleSetName());
	}

	public void deleteVirtualMachineScaleSetVMs(io.github.wukong.azure_vm.models.virtualMachineScaleSetVMs.DeleteRequest request) {
		this.virtualMachineScaleSetVMs().delete(request.getResourceGroupName(),request.getVmScaleSetName(),request.getInstanceId());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInner beginUpdateVirtualMachineScaleSetVMs(io.github.wukong.azure_vm.models.virtualMachineScaleSetVMs.BeginUpdateRequest request) {
		return this.virtualMachineScaleSetVMs().beginUpdate(request.getResourceGroupName(),request.getVmScaleSetName(),request.getInstanceId(),request.getParameters());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInner>>> listWithServiceResponseAsyncVirtualMachineScaleSetVMs(io.github.wukong.azure_vm.models.virtualMachineScaleSetVMs.ListWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSetVMs().listWithServiceResponseAsync(request.getResourceGroupName(),request.getVirtualMachineScaleSetName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInner>>> listNextWithServiceResponseAsyncVirtualMachineScaleSetVMs(io.github.wukong.azure_vm.models.virtualMachineScaleSetVMs.ListNextWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSetVMs().listNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInner>> listNextAsyncVirtualMachineScaleSetVMs(io.github.wukong.azure_vm.models.virtualMachineScaleSetVMs.ListNextAsyncRequest request) {
		return this.virtualMachineScaleSetVMs().listNextAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInner getVirtualMachineScaleSetVMs(io.github.wukong.azure_vm.models.virtualMachineScaleSetVMs.GetRequest request) {
		return this.virtualMachineScaleSetVMs().get(request.getResourceGroupName(),request.getVmScaleSetName(),request.getInstanceId());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInner>> listAsyncVirtualMachineScaleSetVMs(io.github.wukong.azure_vm.models.virtualMachineScaleSetVMs.ListAsyncRequest request) {
		return this.virtualMachineScaleSetVMs().listAsync(request.getResourceGroupName(),request.getVirtualMachineScaleSetName());
	}

	public com.microsoft.azure.management.compute.implementation.LogAnalyticsOperationResultInner beginExportThrottledRequestsLogAnalytics(io.github.wukong.azure_vm.models.logAnalytics.BeginExportThrottledRequestsRequest request) {
		return this.logAnalytics().beginExportThrottledRequests(request.getLocation(),request.getParameters());
	}

	public com.microsoft.azure.management.compute.implementation.LogAnalyticsOperationResultInner exportRequestRateByIntervalLogAnalytics(io.github.wukong.azure_vm.models.logAnalytics.ExportRequestRateByIntervalRequest request) {
		return this.logAnalytics().exportRequestRateByInterval(request.getLocation(),request.getParameters());
	}

	public com.microsoft.azure.management.compute.implementation.LogAnalyticsOperationResultInner exportThrottledRequestsLogAnalytics(io.github.wukong.azure_vm.models.logAnalytics.ExportThrottledRequestsRequest request) {
		return this.logAnalytics().exportThrottledRequests(request.getLocation(),request.getParameters());
	}

	public com.microsoft.azure.management.compute.implementation.LogAnalyticsOperationResultInner beginExportRequestRateByIntervalLogAnalytics(io.github.wukong.azure_vm.models.logAnalytics.BeginExportRequestRateByIntervalRequest request) {
		return this.logAnalytics().beginExportRequestRateByInterval(request.getLocation(),request.getParameters());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.RunCommandDocumentBaseInner>>> listWithServiceResponseAsyncVirtualMachineRunCommands(io.github.wukong.azure_vm.models.virtualMachineRunCommands.ListWithServiceResponseAsyncRequest request) {
		return this.virtualMachineRunCommands().listWithServiceResponseAsync(request.getLocation());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.RunCommandDocumentBaseInner>>> listNextWithServiceResponseAsyncVirtualMachineRunCommands(io.github.wukong.azure_vm.models.virtualMachineRunCommands.ListNextWithServiceResponseAsyncRequest request) {
		return this.virtualMachineRunCommands().listNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.RunCommandDocumentBaseInner> listNextVirtualMachineRunCommands(io.github.wukong.azure_vm.models.virtualMachineRunCommands.ListNextRequest request) {
		return this.virtualMachineRunCommands().listNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.RunCommandDocumentBaseInner>> listNextAsyncVirtualMachineRunCommands(io.github.wukong.azure_vm.models.virtualMachineRunCommands.ListNextAsyncRequest request) {
		return this.virtualMachineRunCommands().listNextAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.RunCommandDocumentBaseInner>>> listNextSinglePageAsyncVirtualMachineRunCommands(io.github.wukong.azure_vm.models.virtualMachineRunCommands.ListNextSinglePageAsyncRequest request) {
		return this.virtualMachineRunCommands().listNextSinglePageAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.RunCommandDocumentInner getVirtualMachineRunCommands(io.github.wukong.azure_vm.models.virtualMachineRunCommands.GetRequest request) {
		return this.virtualMachineRunCommands().get(request.getLocation(),request.getCommandId());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.RunCommandDocumentBaseInner>>> listSinglePageAsyncVirtualMachineRunCommands(io.github.wukong.azure_vm.models.virtualMachineRunCommands.ListSinglePageAsyncRequest request) {
		return this.virtualMachineRunCommands().listSinglePageAsync(request.getLocation());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.RunCommandDocumentBaseInner> listVirtualMachineRunCommands(io.github.wukong.azure_vm.models.virtualMachineRunCommands.ListRequest request) {
		return this.virtualMachineRunCommands().list(request.getLocation());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.RunCommandDocumentBaseInner>> listAsyncVirtualMachineRunCommands(io.github.wukong.azure_vm.models.virtualMachineRunCommands.ListAsyncRequest request) {
		return this.virtualMachineRunCommands().listAsync(request.getLocation());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ResourceSkuInner>>> listWithServiceResponseAsyncResourceSkus(io.github.wukong.azure_vm.models.resourceSkus.ListWithServiceResponseAsyncRequest request) {
		return this.resourceSkus().listWithServiceResponseAsync();
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ResourceSkuInner>>> listNextWithServiceResponseAsyncResourceSkus(io.github.wukong.azure_vm.models.resourceSkus.ListNextWithServiceResponseAsyncRequest request) {
		return this.resourceSkus().listNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.ResourceSkuInner> listNextResourceSkus(io.github.wukong.azure_vm.models.resourceSkus.ListNextRequest request) {
		return this.resourceSkus().listNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ResourceSkuInner>> listNextAsyncResourceSkus(io.github.wukong.azure_vm.models.resourceSkus.ListNextAsyncRequest request) {
		return this.resourceSkus().listNextAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ResourceSkuInner>>> listNextSinglePageAsyncResourceSkus(io.github.wukong.azure_vm.models.resourceSkus.ListNextSinglePageAsyncRequest request) {
		return this.resourceSkus().listNextSinglePageAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ResourceSkuInner>>> listSinglePageAsyncResourceSkus(io.github.wukong.azure_vm.models.resourceSkus.ListSinglePageAsyncRequest request) {
		return this.resourceSkus().listSinglePageAsync();
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.ResourceSkuInner> listResourceSkus(io.github.wukong.azure_vm.models.resourceSkus.ListRequest request) {
		return this.resourceSkus().list();
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ResourceSkuInner>> listAsyncResourceSkus(io.github.wukong.azure_vm.models.resourceSkus.ListAsyncRequest request) {
		return this.resourceSkus().listAsync();
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.DiskInner> listNextDisks(io.github.wukong.azure_vm.models.disks.ListNextRequest request) {
		return this.disks().listNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.DiskInner>>> listNextSinglePageAsyncDisks(io.github.wukong.azure_vm.models.disks.ListNextSinglePageAsyncRequest request) {
		return this.disks().listNextSinglePageAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.DiskInner>>> listByResourceGroupWithServiceResponseAsyncDisks(io.github.wukong.azure_vm.models.disks.ListByResourceGroupWithServiceResponseAsyncRequest request) {
		return this.disks().listByResourceGroupWithServiceResponseAsync(request.getResourceGroupName());
	}

	public com.microsoft.azure.management.compute.implementation.DiskInner updateDisks(io.github.wukong.azure_vm.models.disks.UpdateRequest request) {
		return this.disks().update(request.getResourceGroupName(),request.getDiskName(),request.getDisk());
	}

	public void deleteDisks(io.github.wukong.azure_vm.models.disks.DeleteRequest request) {
		this.disks().delete(request.getResourceGroupName(),request.getDiskName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.DiskInner> listByResourceGroupDisks(io.github.wukong.azure_vm.models.disks.ListByResourceGroupRequest request) {
		return this.disks().listByResourceGroup(request.getResourceGroupName());
	}

	public com.microsoft.azure.management.compute.implementation.AccessUriInner beginGrantAccessDisks(io.github.wukong.azure_vm.models.disks.BeginGrantAccessRequest request) {
		return this.disks().beginGrantAccess(request.getResourceGroupName(),request.getDiskName(),request.getGrantAccessData());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.DiskInner>>> listNextWithServiceResponseAsyncDisks(io.github.wukong.azure_vm.models.disks.ListNextWithServiceResponseAsyncRequest request) {
		return this.disks().listNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.DiskInner>> listByResourceGroupNextAsyncDisks(io.github.wukong.azure_vm.models.disks.ListByResourceGroupNextAsyncRequest request) {
		return this.disks().listByResourceGroupNextAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.DiskInner> listByResourceGroupNextDisks(io.github.wukong.azure_vm.models.disks.ListByResourceGroupNextRequest request) {
		return this.disks().listByResourceGroupNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.DiskInner>> listAsyncDisks(io.github.wukong.azure_vm.models.disks.ListAsyncRequest request) {
		return this.disks().listAsync();
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.DiskInner>>> listByResourceGroupSinglePageAsyncDisks(io.github.wukong.azure_vm.models.disks.ListByResourceGroupSinglePageAsyncRequest request) {
		return this.disks().listByResourceGroupSinglePageAsync(request.getResourceGroupName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.DiskInner>>> listByResourceGroupNextSinglePageAsyncDisks(io.github.wukong.azure_vm.models.disks.ListByResourceGroupNextSinglePageAsyncRequest request) {
		return this.disks().listByResourceGroupNextSinglePageAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.DiskInner getByResourceGroupDisks(io.github.wukong.azure_vm.models.disks.GetByResourceGroupRequest request) {
		return this.disks().getByResourceGroup(request.getResourceGroupName(),request.getDiskName());
	}

	public com.microsoft.azure.management.compute.implementation.DiskInner createOrUpdateDisks(io.github.wukong.azure_vm.models.disks.CreateOrUpdateRequest request) {
		return this.disks().createOrUpdate(request.getResourceGroupName(),request.getDiskName(),request.getDisk());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.lang.Void>> deleteWithServiceResponseAsyncDisks(io.github.wukong.azure_vm.models.disks.DeleteWithServiceResponseAsyncRequest request) {
		return this.disks().deleteWithServiceResponseAsync(request.getResourceGroupName(),request.getDiskName());
	}

	public com.microsoft.azure.management.compute.implementation.AccessUriInner grantAccessDisks(io.github.wukong.azure_vm.models.disks.GrantAccessRequest request) {
		return this.disks().grantAccess(request.getResourceGroupName(),request.getDiskName(),request.getGrantAccessData());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.DiskInner>>> listSinglePageAsyncDisks(io.github.wukong.azure_vm.models.disks.ListSinglePageAsyncRequest request) {
		return this.disks().listSinglePageAsync();
	}

	public rx.Observable<java.lang.Void> deleteAsyncDisks(io.github.wukong.azure_vm.models.disks.DeleteAsyncRequest request) {
		return this.disks().deleteAsync(request.getResourceGroupName(),request.getDiskName());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.DiskInner>> listByResourceGroupAsyncDisks(io.github.wukong.azure_vm.models.disks.ListByResourceGroupAsyncRequest request) {
		return this.disks().listByResourceGroupAsync(request.getResourceGroupName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.DiskInner> listDisks(io.github.wukong.azure_vm.models.disks.ListRequest request) {
		return this.disks().list();
	}

	public com.microsoft.azure.management.compute.implementation.DiskInner beginUpdateDisks(io.github.wukong.azure_vm.models.disks.BeginUpdateRequest request) {
		return this.disks().beginUpdate(request.getResourceGroupName(),request.getDiskName(),request.getDisk());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.DiskInner>>> listWithServiceResponseAsyncDisks(io.github.wukong.azure_vm.models.disks.ListWithServiceResponseAsyncRequest request) {
		return this.disks().listWithServiceResponseAsync();
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.DiskInner>> listNextAsyncDisks(io.github.wukong.azure_vm.models.disks.ListNextAsyncRequest request) {
		return this.disks().listNextAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.DiskInner beginCreateOrUpdateDisks(io.github.wukong.azure_vm.models.disks.BeginCreateOrUpdateRequest request) {
		return this.disks().beginCreateOrUpdate(request.getResourceGroupName(),request.getDiskName(),request.getDisk());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.DiskInner>>> listByResourceGroupNextWithServiceResponseAsyncDisks(io.github.wukong.azure_vm.models.disks.ListByResourceGroupNextWithServiceResponseAsyncRequest request) {
		return this.disks().listByResourceGroupNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.SnapshotInner> listNextSnapshots(io.github.wukong.azure_vm.models.snapshots.ListNextRequest request) {
		return this.snapshots().listNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.SnapshotInner>>> listNextSinglePageAsyncSnapshots(io.github.wukong.azure_vm.models.snapshots.ListNextSinglePageAsyncRequest request) {
		return this.snapshots().listNextSinglePageAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.SnapshotInner>>> listByResourceGroupWithServiceResponseAsyncSnapshots(io.github.wukong.azure_vm.models.snapshots.ListByResourceGroupWithServiceResponseAsyncRequest request) {
		return this.snapshots().listByResourceGroupWithServiceResponseAsync(request.getResourceGroupName());
	}

	public com.microsoft.azure.management.compute.implementation.SnapshotInner updateSnapshots(io.github.wukong.azure_vm.models.snapshots.UpdateRequest request) {
		return this.snapshots().update(request.getResourceGroupName(),request.getSnapshotName(),request.getSnapshot());
	}

	public void deleteSnapshots(io.github.wukong.azure_vm.models.snapshots.DeleteRequest request) {
		this.snapshots().delete(request.getResourceGroupName(),request.getSnapshotName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.SnapshotInner> listByResourceGroupSnapshots(io.github.wukong.azure_vm.models.snapshots.ListByResourceGroupRequest request) {
		return this.snapshots().listByResourceGroup(request.getResourceGroupName());
	}

	public com.microsoft.azure.management.compute.implementation.AccessUriInner beginGrantAccessSnapshots(io.github.wukong.azure_vm.models.snapshots.BeginGrantAccessRequest request) {
		return this.snapshots().beginGrantAccess(request.getResourceGroupName(),request.getSnapshotName(),request.getGrantAccessData());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.SnapshotInner>>> listNextWithServiceResponseAsyncSnapshots(io.github.wukong.azure_vm.models.snapshots.ListNextWithServiceResponseAsyncRequest request) {
		return this.snapshots().listNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.SnapshotInner>> listByResourceGroupNextAsyncSnapshots(io.github.wukong.azure_vm.models.snapshots.ListByResourceGroupNextAsyncRequest request) {
		return this.snapshots().listByResourceGroupNextAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.SnapshotInner> listByResourceGroupNextSnapshots(io.github.wukong.azure_vm.models.snapshots.ListByResourceGroupNextRequest request) {
		return this.snapshots().listByResourceGroupNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.SnapshotInner>> listAsyncSnapshots(io.github.wukong.azure_vm.models.snapshots.ListAsyncRequest request) {
		return this.snapshots().listAsync();
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.SnapshotInner>>> listByResourceGroupSinglePageAsyncSnapshots(io.github.wukong.azure_vm.models.snapshots.ListByResourceGroupSinglePageAsyncRequest request) {
		return this.snapshots().listByResourceGroupSinglePageAsync(request.getResourceGroupName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.SnapshotInner>>> listByResourceGroupNextSinglePageAsyncSnapshots(io.github.wukong.azure_vm.models.snapshots.ListByResourceGroupNextSinglePageAsyncRequest request) {
		return this.snapshots().listByResourceGroupNextSinglePageAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.SnapshotInner getByResourceGroupSnapshots(io.github.wukong.azure_vm.models.snapshots.GetByResourceGroupRequest request) {
		return this.snapshots().getByResourceGroup(request.getResourceGroupName(),request.getSnapshotName());
	}

	public com.microsoft.azure.management.compute.implementation.SnapshotInner createOrUpdateSnapshots(io.github.wukong.azure_vm.models.snapshots.CreateOrUpdateRequest request) {
		return this.snapshots().createOrUpdate(request.getResourceGroupName(),request.getSnapshotName(),request.getSnapshot());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.lang.Void>> deleteWithServiceResponseAsyncSnapshots(io.github.wukong.azure_vm.models.snapshots.DeleteWithServiceResponseAsyncRequest request) {
		return this.snapshots().deleteWithServiceResponseAsync(request.getResourceGroupName(),request.getSnapshotName());
	}

	public com.microsoft.azure.management.compute.implementation.AccessUriInner grantAccessSnapshots(io.github.wukong.azure_vm.models.snapshots.GrantAccessRequest request) {
		return this.snapshots().grantAccess(request.getResourceGroupName(),request.getSnapshotName(),request.getGrantAccessData());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.SnapshotInner>>> listSinglePageAsyncSnapshots(io.github.wukong.azure_vm.models.snapshots.ListSinglePageAsyncRequest request) {
		return this.snapshots().listSinglePageAsync();
	}

	public rx.Observable<java.lang.Void> deleteAsyncSnapshots(io.github.wukong.azure_vm.models.snapshots.DeleteAsyncRequest request) {
		return this.snapshots().deleteAsync(request.getResourceGroupName(),request.getSnapshotName());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.SnapshotInner>> listByResourceGroupAsyncSnapshots(io.github.wukong.azure_vm.models.snapshots.ListByResourceGroupAsyncRequest request) {
		return this.snapshots().listByResourceGroupAsync(request.getResourceGroupName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.SnapshotInner> listSnapshots(io.github.wukong.azure_vm.models.snapshots.ListRequest request) {
		return this.snapshots().list();
	}

	public com.microsoft.azure.management.compute.implementation.SnapshotInner beginUpdateSnapshots(io.github.wukong.azure_vm.models.snapshots.BeginUpdateRequest request) {
		return this.snapshots().beginUpdate(request.getResourceGroupName(),request.getSnapshotName(),request.getSnapshot());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.SnapshotInner>>> listWithServiceResponseAsyncSnapshots(io.github.wukong.azure_vm.models.snapshots.ListWithServiceResponseAsyncRequest request) {
		return this.snapshots().listWithServiceResponseAsync();
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.SnapshotInner>> listNextAsyncSnapshots(io.github.wukong.azure_vm.models.snapshots.ListNextAsyncRequest request) {
		return this.snapshots().listNextAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.SnapshotInner beginCreateOrUpdateSnapshots(io.github.wukong.azure_vm.models.snapshots.BeginCreateOrUpdateRequest request) {
		return this.snapshots().beginCreateOrUpdate(request.getResourceGroupName(),request.getSnapshotName(),request.getSnapshot());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.SnapshotInner>>> listByResourceGroupNextWithServiceResponseAsyncSnapshots(io.github.wukong.azure_vm.models.snapshots.ListByResourceGroupNextWithServiceResponseAsyncRequest request) {
		return this.snapshots().listByResourceGroupNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.GalleryInner getByResourceGroupGalleries(io.github.wukong.azure_vm.models.galleries.GetByResourceGroupRequest request) {
		return this.galleries().getByResourceGroup(request.getResourceGroupName(),request.getGalleryName());
	}

	public com.microsoft.azure.management.compute.implementation.GalleryInner createOrUpdateGalleries(io.github.wukong.azure_vm.models.galleries.CreateOrUpdateRequest request) {
		return this.galleries().createOrUpdate(request.getResourceGroupName(),request.getGalleryName(),request.getGallery());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.GalleryInner> listNextGalleries(io.github.wukong.azure_vm.models.galleries.ListNextRequest request) {
		return this.galleries().listNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.lang.Void>> deleteWithServiceResponseAsyncGalleries(io.github.wukong.azure_vm.models.galleries.DeleteWithServiceResponseAsyncRequest request) {
		return this.galleries().deleteWithServiceResponseAsync(request.getResourceGroupName(),request.getGalleryName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryInner>>> listNextSinglePageAsyncGalleries(io.github.wukong.azure_vm.models.galleries.ListNextSinglePageAsyncRequest request) {
		return this.galleries().listNextSinglePageAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryInner>>> listByResourceGroupWithServiceResponseAsyncGalleries(io.github.wukong.azure_vm.models.galleries.ListByResourceGroupWithServiceResponseAsyncRequest request) {
		return this.galleries().listByResourceGroupWithServiceResponseAsync(request.getResourceGroupName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryInner>>> listSinglePageAsyncGalleries(io.github.wukong.azure_vm.models.galleries.ListSinglePageAsyncRequest request) {
		return this.galleries().listSinglePageAsync();
	}

	public rx.Observable<java.lang.Void> deleteAsyncGalleries(io.github.wukong.azure_vm.models.galleries.DeleteAsyncRequest request) {
		return this.galleries().deleteAsync(request.getResourceGroupName(),request.getGalleryName());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryInner>> listByResourceGroupAsyncGalleries(io.github.wukong.azure_vm.models.galleries.ListByResourceGroupAsyncRequest request) {
		return this.galleries().listByResourceGroupAsync(request.getResourceGroupName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.GalleryInner> listGalleries(io.github.wukong.azure_vm.models.galleries.ListRequest request) {
		return this.galleries().list();
	}

	public void deleteGalleries(io.github.wukong.azure_vm.models.galleries.DeleteRequest request) {
		this.galleries().delete(request.getResourceGroupName(),request.getGalleryName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.GalleryInner> listByResourceGroupGalleries(io.github.wukong.azure_vm.models.galleries.ListByResourceGroupRequest request) {
		return this.galleries().listByResourceGroup(request.getResourceGroupName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryInner>>> listWithServiceResponseAsyncGalleries(io.github.wukong.azure_vm.models.galleries.ListWithServiceResponseAsyncRequest request) {
		return this.galleries().listWithServiceResponseAsync();
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryInner>>> listNextWithServiceResponseAsyncGalleries(io.github.wukong.azure_vm.models.galleries.ListNextWithServiceResponseAsyncRequest request) {
		return this.galleries().listNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryInner>> listNextAsyncGalleries(io.github.wukong.azure_vm.models.galleries.ListNextAsyncRequest request) {
		return this.galleries().listNextAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryInner>> listByResourceGroupNextAsyncGalleries(io.github.wukong.azure_vm.models.galleries.ListByResourceGroupNextAsyncRequest request) {
		return this.galleries().listByResourceGroupNextAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.GalleryInner> listByResourceGroupNextGalleries(io.github.wukong.azure_vm.models.galleries.ListByResourceGroupNextRequest request) {
		return this.galleries().listByResourceGroupNext(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.GalleryInner beginCreateOrUpdateGalleries(io.github.wukong.azure_vm.models.galleries.BeginCreateOrUpdateRequest request) {
		return this.galleries().beginCreateOrUpdate(request.getResourceGroupName(),request.getGalleryName(),request.getGallery());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryInner>> listAsyncGalleries(io.github.wukong.azure_vm.models.galleries.ListAsyncRequest request) {
		return this.galleries().listAsync();
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryInner>>> listByResourceGroupNextWithServiceResponseAsyncGalleries(io.github.wukong.azure_vm.models.galleries.ListByResourceGroupNextWithServiceResponseAsyncRequest request) {
		return this.galleries().listByResourceGroupNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryInner>>> listByResourceGroupSinglePageAsyncGalleries(io.github.wukong.azure_vm.models.galleries.ListByResourceGroupSinglePageAsyncRequest request) {
		return this.galleries().listByResourceGroupSinglePageAsync(request.getResourceGroupName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryInner>>> listByResourceGroupNextSinglePageAsyncGalleries(io.github.wukong.azure_vm.models.galleries.ListByResourceGroupNextSinglePageAsyncRequest request) {
		return this.galleries().listByResourceGroupNextSinglePageAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.GalleryImageInner> listByGalleryGalleryImages(io.github.wukong.azure_vm.models.galleryImages.ListByGalleryRequest request) {
		return this.galleryImages().listByGallery(request.getResourceGroupName(),request.getGalleryName());
	}

	public com.microsoft.azure.management.compute.implementation.GalleryImageInner createOrUpdateGalleryImages(io.github.wukong.azure_vm.models.galleryImages.CreateOrUpdateRequest request) {
		return this.galleryImages().createOrUpdate(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName(),request.getGalleryImage());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryImageInner>>> listByGalleryWithServiceResponseAsyncGalleryImages(io.github.wukong.azure_vm.models.galleryImages.ListByGalleryWithServiceResponseAsyncRequest request) {
		return this.galleryImages().listByGalleryWithServiceResponseAsync(request.getResourceGroupName(),request.getGalleryName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryImageInner>>> listByGalleryNextSinglePageAsyncGalleryImages(io.github.wukong.azure_vm.models.galleryImages.ListByGalleryNextSinglePageAsyncRequest request) {
		return this.galleryImages().listByGalleryNextSinglePageAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.lang.Void>> deleteWithServiceResponseAsyncGalleryImages(io.github.wukong.azure_vm.models.galleryImages.DeleteWithServiceResponseAsyncRequest request) {
		return this.galleryImages().deleteWithServiceResponseAsync(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.GalleryImageInner> listByGalleryNextGalleryImages(io.github.wukong.azure_vm.models.galleryImages.ListByGalleryNextRequest request) {
		return this.galleryImages().listByGalleryNext(request.getNextPageLink());
	}

	public rx.Observable<java.lang.Void> deleteAsyncGalleryImages(io.github.wukong.azure_vm.models.galleryImages.DeleteAsyncRequest request) {
		return this.galleryImages().deleteAsync(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryImageInner>>> listByGalleryNextWithServiceResponseAsyncGalleryImages(io.github.wukong.azure_vm.models.galleryImages.ListByGalleryNextWithServiceResponseAsyncRequest request) {
		return this.galleryImages().listByGalleryNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryImageInner>> listByGalleryNextAsyncGalleryImages(io.github.wukong.azure_vm.models.galleryImages.ListByGalleryNextAsyncRequest request) {
		return this.galleryImages().listByGalleryNextAsync(request.getNextPageLink());
	}

	public void deleteGalleryImages(io.github.wukong.azure_vm.models.galleryImages.DeleteRequest request) {
		this.galleryImages().delete(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryImageInner>> listByGalleryAsyncGalleryImages(io.github.wukong.azure_vm.models.galleryImages.ListByGalleryAsyncRequest request) {
		return this.galleryImages().listByGalleryAsync(request.getResourceGroupName(),request.getGalleryName());
	}

	public com.microsoft.azure.management.compute.implementation.GalleryImageInner getGalleryImages(io.github.wukong.azure_vm.models.galleryImages.GetRequest request) {
		return this.galleryImages().get(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryImageInner>>> listByGallerySinglePageAsyncGalleryImages(io.github.wukong.azure_vm.models.galleryImages.ListByGallerySinglePageAsyncRequest request) {
		return this.galleryImages().listByGallerySinglePageAsync(request.getResourceGroupName(),request.getGalleryName());
	}

	public com.microsoft.azure.management.compute.implementation.GalleryImageInner beginCreateOrUpdateGalleryImages(io.github.wukong.azure_vm.models.galleryImages.BeginCreateOrUpdateRequest request) {
		return this.galleryImages().beginCreateOrUpdate(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName(),request.getGalleryImage());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.GalleryImageVersionInner> listByGalleryImageGalleryImageVersions(io.github.wukong.azure_vm.models.galleryImageVersions.ListByGalleryImageRequest request) {
		return this.galleryImageVersions().listByGalleryImage(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName());
	}

	public com.microsoft.azure.management.compute.implementation.GalleryImageVersionInner createOrUpdateGalleryImageVersions(io.github.wukong.azure_vm.models.galleryImageVersions.CreateOrUpdateRequest request) {
		return this.galleryImageVersions().createOrUpdate(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName(),request.getGalleryImageVersionName(),request.getGalleryImageVersion());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.lang.Void>> deleteWithServiceResponseAsyncGalleryImageVersions(io.github.wukong.azure_vm.models.galleryImageVersions.DeleteWithServiceResponseAsyncRequest request) {
		return this.galleryImageVersions().deleteWithServiceResponseAsync(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName(),request.getGalleryImageVersionName());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryImageVersionInner>> listByGalleryImageNextAsyncGalleryImageVersions(io.github.wukong.azure_vm.models.galleryImageVersions.ListByGalleryImageNextAsyncRequest request) {
		return this.galleryImageVersions().listByGalleryImageNextAsync(request.getNextPageLink());
	}

	public rx.Observable<java.lang.Void> deleteAsyncGalleryImageVersions(io.github.wukong.azure_vm.models.galleryImageVersions.DeleteAsyncRequest request) {
		return this.galleryImageVersions().deleteAsync(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName(),request.getGalleryImageVersionName());
	}

	public void deleteGalleryImageVersions(io.github.wukong.azure_vm.models.galleryImageVersions.DeleteRequest request) {
		this.galleryImageVersions().delete(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName(),request.getGalleryImageVersionName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.GalleryImageVersionInner> listByGalleryImageNextGalleryImageVersions(io.github.wukong.azure_vm.models.galleryImageVersions.ListByGalleryImageNextRequest request) {
		return this.galleryImageVersions().listByGalleryImageNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryImageVersionInner>>> listByGalleryImageNextWithServiceResponseAsyncGalleryImageVersions(io.github.wukong.azure_vm.models.galleryImageVersions.ListByGalleryImageNextWithServiceResponseAsyncRequest request) {
		return this.galleryImageVersions().listByGalleryImageNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryImageVersionInner>>> listByGalleryImageNextSinglePageAsyncGalleryImageVersions(io.github.wukong.azure_vm.models.galleryImageVersions.ListByGalleryImageNextSinglePageAsyncRequest request) {
		return this.galleryImageVersions().listByGalleryImageNextSinglePageAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.GalleryImageVersionInner getGalleryImageVersions(io.github.wukong.azure_vm.models.galleryImageVersions.GetRequest request) {
		return this.galleryImageVersions().get(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName(),request.getGalleryImageVersionName());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryImageVersionInner>> listByGalleryImageAsyncGalleryImageVersions(io.github.wukong.azure_vm.models.galleryImageVersions.ListByGalleryImageAsyncRequest request) {
		return this.galleryImageVersions().listByGalleryImageAsync(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryImageVersionInner>>> listByGalleryImageWithServiceResponseAsyncGalleryImageVersions(io.github.wukong.azure_vm.models.galleryImageVersions.ListByGalleryImageWithServiceResponseAsyncRequest request) {
		return this.galleryImageVersions().listByGalleryImageWithServiceResponseAsync(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName());
	}

	public com.microsoft.azure.management.compute.implementation.GalleryImageVersionInner beginCreateOrUpdateGalleryImageVersions(io.github.wukong.azure_vm.models.galleryImageVersions.BeginCreateOrUpdateRequest request) {
		return this.galleryImageVersions().beginCreateOrUpdate(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName(),request.getGalleryImageVersionName(),request.getGalleryImageVersion());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryImageVersionInner>>> listByGalleryImageSinglePageAsyncGalleryImageVersions(io.github.wukong.azure_vm.models.galleryImageVersions.ListByGalleryImageSinglePageAsyncRequest request) {
		return this.galleryImageVersions().listByGalleryImageSinglePageAsync(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName());
	}
	
	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName(WukongComputeManagementClientImpl.class.getName());
		for (Method method : clazz.getMethods()) {
			if (method.getReturnType().getName().endsWith("Inner")) {
				Class<?> objcls = method.getReturnType();
				Map<String, Method> map = new HashMap<String, Method>();
				for (Method om : objcls.getMethods()) {
					if (om.getName().startsWith("list") || om.getName().startsWith("delete")
							|| om.getReturnType().getName().endsWith("Inner")) {
						if (!map.containsKey(om.getName())) {
							map.put(om.getName(), om);
						} else {
							Method m = map.get(om.getName());
							if (om.getParameterCount() < m.getParameterCount()) {
								map.put(om.getName(), om);
							}
						}
					}
				
				}
				for (Method thisMethod : map.values()) {
					File file = new File(CodesTool.getBase(AbstractAzureRequest.class), method.getName());
					if (!file.exists()) {
						file.mkdirs();
					}
					CodesTool.generateRequest(file, AbstractAzureRequest.class, method, thisMethod, false, -1);
				}
			}
		}
	}

}
