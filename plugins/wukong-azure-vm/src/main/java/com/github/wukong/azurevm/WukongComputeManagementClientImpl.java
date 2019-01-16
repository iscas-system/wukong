/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.wukong.azurevm;

import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import com.github.wukong.azurevm.models.AbstractAzureRequest;
import com.github.wukong.core.tools.CodesTool;
import com.microsoft.azure.management.compute.implementation.ComputeManagementClientImpl;
import com.microsoft.rest.RestClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;

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
	
	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.UsageInner>>> listWithServiceResponseAsyncUsages(com.github.wukong.azurevm.models.usages.ListWithServiceResponseAsyncRequest request) {
		return this.usages().listWithServiceResponseAsync(request.getLocation());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.UsageInner>>> listNextWithServiceResponseAsyncUsages(com.github.wukong.azurevm.models.usages.ListNextWithServiceResponseAsyncRequest request) {
		return this.usages().listNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.UsageInner> listNextUsages(com.github.wukong.azurevm.models.usages.ListNextRequest request) {
		return this.usages().listNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.UsageInner>> listNextAsyncUsages(com.github.wukong.azurevm.models.usages.ListNextAsyncRequest request) {
		return this.usages().listNextAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.UsageInner>>> listNextSinglePageAsyncUsages(com.github.wukong.azurevm.models.usages.ListNextSinglePageAsyncRequest request) {
		return this.usages().listNextSinglePageAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.UsageInner>>> listSinglePageAsyncUsages(com.github.wukong.azurevm.models.usages.ListSinglePageAsyncRequest request) {
		return this.usages().listSinglePageAsync(request.getLocation());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.UsageInner> listUsages(com.github.wukong.azurevm.models.usages.ListRequest request) {
		return this.usages().list(request.getLocation());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.UsageInner>> listAsyncUsages(com.github.wukong.azurevm.models.usages.ListAsyncRequest request) {
		return this.usages().listAsync(request.getLocation());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.util.List<com.microsoft.azure.management.compute.implementation.ComputeOperationValueInner>>> listWithServiceResponseAsyncOperations(com.github.wukong.azurevm.models.operations.ListWithServiceResponseAsyncRequest request) {
		return this.operations().listWithServiceResponseAsync();
	}

	public java.util.List<com.microsoft.azure.management.compute.implementation.ComputeOperationValueInner> listOperations(com.github.wukong.azurevm.models.operations.ListRequest request) {
		return this.operations().list();
	}

	public rx.Observable<java.util.List<com.microsoft.azure.management.compute.implementation.ComputeOperationValueInner>> listAsyncOperations(com.github.wukong.azurevm.models.operations.ListAsyncRequest request) {
		return this.operations().listAsync();
	}

	public com.microsoft.azure.management.compute.implementation.AvailabilitySetInner getByResourceGroupAvailabilitySets(com.github.wukong.azurevm.models.availabilitySets.GetByResourceGroupRequest request) {
		return this.availabilitySets().getByResourceGroup(request.getResourceGroupName(),request.getAvailabilitySetName());
	}

	public java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineSizeInner> listAvailableSizesAvailabilitySets(com.github.wukong.azurevm.models.availabilitySets.ListAvailableSizesRequest request) {
		return this.availabilitySets().listAvailableSizes(request.getResourceGroupName(),request.getAvailabilitySetName());
	}

	public com.microsoft.azure.management.compute.implementation.AvailabilitySetInner createOrUpdateAvailabilitySets(com.github.wukong.azurevm.models.availabilitySets.CreateOrUpdateRequest request) {
		return this.availabilitySets().createOrUpdate(request.getResourceGroupName(),request.getAvailabilitySetName(),request.getParameters());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.lang.Void>> deleteWithServiceResponseAsyncAvailabilitySets(com.github.wukong.azurevm.models.availabilitySets.DeleteWithServiceResponseAsyncRequest request) {
		return this.availabilitySets().deleteWithServiceResponseAsync(request.getResourceGroupName(),request.getAvailabilitySetName());
	}

	public rx.Observable<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineSizeInner>> listAvailableSizesAsyncAvailabilitySets(com.github.wukong.azurevm.models.availabilitySets.ListAvailableSizesAsyncRequest request) {
		return this.availabilitySets().listAvailableSizesAsync(request.getResourceGroupName(),request.getAvailabilitySetName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineSizeInner>>> listAvailableSizesWithServiceResponseAsyncAvailabilitySets(com.github.wukong.azurevm.models.availabilitySets.ListAvailableSizesWithServiceResponseAsyncRequest request) {
		return this.availabilitySets().listAvailableSizesWithServiceResponseAsync(request.getResourceGroupName(),request.getAvailabilitySetName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.util.List<com.microsoft.azure.management.compute.implementation.AvailabilitySetInner>>> listByResourceGroupWithServiceResponseAsyncAvailabilitySets(com.github.wukong.azurevm.models.availabilitySets.ListByResourceGroupWithServiceResponseAsyncRequest request) {
		return this.availabilitySets().listByResourceGroupWithServiceResponseAsync(request.getResourceGroupName());
	}

	public com.microsoft.azure.management.compute.implementation.AvailabilitySetInner updateAvailabilitySets(com.github.wukong.azurevm.models.availabilitySets.UpdateRequest request) {
		return this.availabilitySets().update(request.getResourceGroupName(),request.getAvailabilitySetName(),request.getParameters());
	}

	public rx.Observable<java.lang.Void> deleteAsyncAvailabilitySets(com.github.wukong.azurevm.models.availabilitySets.DeleteAsyncRequest request) {
		return this.availabilitySets().deleteAsync(request.getResourceGroupName(),request.getAvailabilitySetName());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.AvailabilitySetInner>> listByResourceGroupAsyncAvailabilitySets(com.github.wukong.azurevm.models.availabilitySets.ListByResourceGroupAsyncRequest request) {
		return this.availabilitySets().listByResourceGroupAsync(request.getResourceGroupName());
	}

	public void deleteAvailabilitySets(com.github.wukong.azurevm.models.availabilitySets.DeleteRequest request) {
		this.availabilitySets().delete(request.getResourceGroupName(),request.getAvailabilitySetName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.AvailabilitySetInner> listByResourceGroupAvailabilitySets(com.github.wukong.azurevm.models.availabilitySets.ListByResourceGroupRequest request) {
		return this.availabilitySets().listByResourceGroup(request.getResourceGroupName());
	}

	public java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionImageInner> listVersionsVirtualMachineExtensionImages(com.github.wukong.azurevm.models.virtualMachineExtensionImages.ListVersionsRequest request) {
		return this.virtualMachineExtensionImages().listVersions(request.getLocation(),request.getPublisherName(),request.getType());
	}

	public rx.Observable<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionImageInner>> listVersionsAsyncVirtualMachineExtensionImages(com.github.wukong.azurevm.models.virtualMachineExtensionImages.ListVersionsAsyncRequest request) {
		return this.virtualMachineExtensionImages().listVersionsAsync(request.getLocation(),request.getPublisherName(),request.getType());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionImageInner>>> listTypesWithServiceResponseAsyncVirtualMachineExtensionImages(com.github.wukong.azurevm.models.virtualMachineExtensionImages.ListTypesWithServiceResponseAsyncRequest request) {
		return this.virtualMachineExtensionImages().listTypesWithServiceResponseAsync(request.getLocation(),request.getPublisherName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionImageInner getVirtualMachineExtensionImages(com.github.wukong.azurevm.models.virtualMachineExtensionImages.GetRequest request) {
		return this.virtualMachineExtensionImages().get(request.getLocation(),request.getPublisherName(),request.getType(),request.getVersion());
	}

	public java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionImageInner> listTypesVirtualMachineExtensionImages(com.github.wukong.azurevm.models.virtualMachineExtensionImages.ListTypesRequest request) {
		return this.virtualMachineExtensionImages().listTypes(request.getLocation(),request.getPublisherName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionImageInner>>> listVersionsWithServiceResponseAsyncVirtualMachineExtensionImages(com.github.wukong.azurevm.models.virtualMachineExtensionImages.ListVersionsWithServiceResponseAsyncRequest request) {
		return this.virtualMachineExtensionImages().listVersionsWithServiceResponseAsync(request.getLocation(),request.getPublisherName(),request.getType());
	}

	public rx.Observable<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionImageInner>> listTypesAsyncVirtualMachineExtensionImages(com.github.wukong.azurevm.models.virtualMachineExtensionImages.ListTypesAsyncRequest request) {
		return this.virtualMachineExtensionImages().listTypesAsync(request.getLocation(),request.getPublisherName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionsListResultInner>> listWithServiceResponseAsyncVirtualMachineExtensions(com.github.wukong.azurevm.models.virtualMachineExtensions.ListWithServiceResponseAsyncRequest request) {
		return this.virtualMachineExtensions().listWithServiceResponseAsync(request.getResourceGroupName(),request.getVmName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionInner createOrUpdateVirtualMachineExtensions(com.github.wukong.azurevm.models.virtualMachineExtensions.CreateOrUpdateRequest request) {
		return this.virtualMachineExtensions().createOrUpdate(request.getResourceGroupName(),request.getVmName(),request.getVmExtensionName(),request.getExtensionParameters());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.lang.Void>> deleteWithServiceResponseAsyncVirtualMachineExtensions(com.github.wukong.azurevm.models.virtualMachineExtensions.DeleteWithServiceResponseAsyncRequest request) {
		return this.virtualMachineExtensions().deleteWithServiceResponseAsync(request.getResourceGroupName(),request.getVmName(),request.getVmExtensionName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionInner getVirtualMachineExtensions(com.github.wukong.azurevm.models.virtualMachineExtensions.GetRequest request) {
		return this.virtualMachineExtensions().get(request.getResourceGroupName(),request.getVmName(),request.getVmExtensionName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionInner updateVirtualMachineExtensions(com.github.wukong.azurevm.models.virtualMachineExtensions.UpdateRequest request) {
		return this.virtualMachineExtensions().update(request.getResourceGroupName(),request.getVmName(),request.getVmExtensionName(),request.getExtensionParameters());
	}

	public rx.Observable<java.lang.Void> deleteAsyncVirtualMachineExtensions(com.github.wukong.azurevm.models.virtualMachineExtensions.DeleteAsyncRequest request) {
		return this.virtualMachineExtensions().deleteAsync(request.getResourceGroupName(),request.getVmName(),request.getVmExtensionName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionInner beginCreateOrUpdateVirtualMachineExtensions(com.github.wukong.azurevm.models.virtualMachineExtensions.BeginCreateOrUpdateRequest request) {
		return this.virtualMachineExtensions().beginCreateOrUpdate(request.getResourceGroupName(),request.getVmName(),request.getVmExtensionName(),request.getExtensionParameters());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionsListResultInner listVirtualMachineExtensions(com.github.wukong.azurevm.models.virtualMachineExtensions.ListRequest request) {
		return this.virtualMachineExtensions().list(request.getResourceGroupName(),request.getVmName());
	}

	public rx.Observable<com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionsListResultInner> listAsyncVirtualMachineExtensions(com.github.wukong.azurevm.models.virtualMachineExtensions.ListAsyncRequest request) {
		return this.virtualMachineExtensions().listAsync(request.getResourceGroupName(),request.getVmName());
	}

	public void deleteVirtualMachineExtensions(com.github.wukong.azurevm.models.virtualMachineExtensions.DeleteRequest request) {
		this.virtualMachineExtensions().delete(request.getResourceGroupName(),request.getVmName(),request.getVmExtensionName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionInner beginUpdateVirtualMachineExtensions(com.github.wukong.azurevm.models.virtualMachineExtensions.BeginUpdateRequest request) {
		return this.virtualMachineExtensions().beginUpdate(request.getResourceGroupName(),request.getVmName(),request.getVmExtensionName(),request.getExtensionParameters());
	}

	public java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineImageResourceInner> listSkusVirtualMachineImages(com.github.wukong.azurevm.models.virtualMachineImages.ListSkusRequest request) {
		return this.virtualMachineImages().listSkus(request.getLocation(),request.getPublisherName(),request.getOffer());
	}

	public rx.Observable<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineImageResourceInner>> listPublishersAsyncVirtualMachineImages(com.github.wukong.azurevm.models.virtualMachineImages.ListPublishersAsyncRequest request) {
		return this.virtualMachineImages().listPublishersAsync(request.getLocation());
	}

	public rx.Observable<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineImageResourceInner>> listOffersAsyncVirtualMachineImages(com.github.wukong.azurevm.models.virtualMachineImages.ListOffersAsyncRequest request) {
		return this.virtualMachineImages().listOffersAsync(request.getLocation(),request.getPublisherName());
	}

	public java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineImageResourceInner> listPublishersVirtualMachineImages(com.github.wukong.azurevm.models.virtualMachineImages.ListPublishersRequest request) {
		return this.virtualMachineImages().listPublishers(request.getLocation());
	}

	public java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineImageResourceInner> listVirtualMachineImages(com.github.wukong.azurevm.models.virtualMachineImages.ListRequest request) {
		return this.virtualMachineImages().list(request.getLocation(),request.getPublisherName(),request.getOffer(),request.getSkus());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineImageResourceInner>>> listSkusWithServiceResponseAsyncVirtualMachineImages(com.github.wukong.azurevm.models.virtualMachineImages.ListSkusWithServiceResponseAsyncRequest request) {
		return this.virtualMachineImages().listSkusWithServiceResponseAsync(request.getLocation(),request.getPublisherName(),request.getOffer());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineImageResourceInner>>> listOffersWithServiceResponseAsyncVirtualMachineImages(com.github.wukong.azurevm.models.virtualMachineImages.ListOffersWithServiceResponseAsyncRequest request) {
		return this.virtualMachineImages().listOffersWithServiceResponseAsync(request.getLocation(),request.getPublisherName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineImageResourceInner>>> listWithServiceResponseAsyncVirtualMachineImages(com.github.wukong.azurevm.models.virtualMachineImages.ListWithServiceResponseAsyncRequest request) {
		return this.virtualMachineImages().listWithServiceResponseAsync(request.getLocation(),request.getPublisherName(),request.getOffer(),request.getSkus());
	}

	public java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineImageResourceInner> listOffersVirtualMachineImages(com.github.wukong.azurevm.models.virtualMachineImages.ListOffersRequest request) {
		return this.virtualMachineImages().listOffers(request.getLocation(),request.getPublisherName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineImageInner getVirtualMachineImages(com.github.wukong.azurevm.models.virtualMachineImages.GetRequest request) {
		return this.virtualMachineImages().get(request.getLocation(),request.getPublisherName(),request.getOffer(),request.getSkus(),request.getVersion());
	}

	public rx.Observable<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineImageResourceInner>> listAsyncVirtualMachineImages(com.github.wukong.azurevm.models.virtualMachineImages.ListAsyncRequest request) {
		return this.virtualMachineImages().listAsync(request.getLocation(),request.getPublisherName(),request.getOffer(),request.getSkus());
	}

	public rx.Observable<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineImageResourceInner>> listSkusAsyncVirtualMachineImages(com.github.wukong.azurevm.models.virtualMachineImages.ListSkusAsyncRequest request) {
		return this.virtualMachineImages().listSkusAsync(request.getLocation(),request.getPublisherName(),request.getOffer());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineImageResourceInner>>> listPublishersWithServiceResponseAsyncVirtualMachineImages(com.github.wukong.azurevm.models.virtualMachineImages.ListPublishersWithServiceResponseAsyncRequest request) {
		return this.virtualMachineImages().listPublishersWithServiceResponseAsync(request.getLocation());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineSizeInner>>> listWithServiceResponseAsyncVirtualMachineSizes(com.github.wukong.azurevm.models.virtualMachineSizes.ListWithServiceResponseAsyncRequest request) {
		return this.virtualMachineSizes().listWithServiceResponseAsync(request.getLocation());
	}

	public java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineSizeInner> listVirtualMachineSizes(com.github.wukong.azurevm.models.virtualMachineSizes.ListRequest request) {
		return this.virtualMachineSizes().list(request.getLocation());
	}

	public rx.Observable<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineSizeInner>> listAsyncVirtualMachineSizes(com.github.wukong.azurevm.models.virtualMachineSizes.ListAsyncRequest request) {
		return this.virtualMachineSizes().listAsync(request.getLocation());
	}

	public com.microsoft.azure.management.compute.implementation.ImageInner getByResourceGroupImages(com.github.wukong.azurevm.models.images.GetByResourceGroupRequest request) {
		return this.images().getByResourceGroup(request.getResourceGroupName(),request.getImageName());
	}

	public com.microsoft.azure.management.compute.implementation.ImageInner createOrUpdateImages(com.github.wukong.azurevm.models.images.CreateOrUpdateRequest request) {
		return this.images().createOrUpdate(request.getResourceGroupName(),request.getImageName(),request.getParameters());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.ImageInner> listNextImages(com.github.wukong.azurevm.models.images.ListNextRequest request) {
		return this.images().listNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.lang.Void>> deleteWithServiceResponseAsyncImages(com.github.wukong.azurevm.models.images.DeleteWithServiceResponseAsyncRequest request) {
		return this.images().deleteWithServiceResponseAsync(request.getResourceGroupName(),request.getImageName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ImageInner>>> listNextSinglePageAsyncImages(com.github.wukong.azurevm.models.images.ListNextSinglePageAsyncRequest request) {
		return this.images().listNextSinglePageAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ImageInner>>> listByResourceGroupWithServiceResponseAsyncImages(com.github.wukong.azurevm.models.images.ListByResourceGroupWithServiceResponseAsyncRequest request) {
		return this.images().listByResourceGroupWithServiceResponseAsync(request.getResourceGroupName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ImageInner>>> listSinglePageAsyncImages(com.github.wukong.azurevm.models.images.ListSinglePageAsyncRequest request) {
		return this.images().listSinglePageAsync();
	}

	public com.microsoft.azure.management.compute.implementation.ImageInner updateImages(com.github.wukong.azurevm.models.images.UpdateRequest request) {
		return this.images().update(request.getResourceGroupName(),request.getImageName(),request.getParameters());
	}

	public rx.Observable<java.lang.Void> deleteAsyncImages(com.github.wukong.azurevm.models.images.DeleteAsyncRequest request) {
		return this.images().deleteAsync(request.getResourceGroupName(),request.getImageName());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ImageInner>> listByResourceGroupAsyncImages(com.github.wukong.azurevm.models.images.ListByResourceGroupAsyncRequest request) {
		return this.images().listByResourceGroupAsync(request.getResourceGroupName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.ImageInner> listImages(com.github.wukong.azurevm.models.images.ListRequest request) {
		return this.images().list();
	}

	public void deleteImages(com.github.wukong.azurevm.models.images.DeleteRequest request) {
		this.images().delete(request.getResourceGroupName(),request.getImageName());
	}

	public com.microsoft.azure.management.compute.implementation.ImageInner beginUpdateImages(com.github.wukong.azurevm.models.images.BeginUpdateRequest request) {
		return this.images().beginUpdate(request.getResourceGroupName(),request.getImageName(),request.getParameters());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.ImageInner> listByResourceGroupImages(com.github.wukong.azurevm.models.images.ListByResourceGroupRequest request) {
		return this.images().listByResourceGroup(request.getResourceGroupName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ImageInner>>> listWithServiceResponseAsyncImages(com.github.wukong.azurevm.models.images.ListWithServiceResponseAsyncRequest request) {
		return this.images().listWithServiceResponseAsync();
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ImageInner>>> listNextWithServiceResponseAsyncImages(com.github.wukong.azurevm.models.images.ListNextWithServiceResponseAsyncRequest request) {
		return this.images().listNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ImageInner>> listNextAsyncImages(com.github.wukong.azurevm.models.images.ListNextAsyncRequest request) {
		return this.images().listNextAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ImageInner>> listByResourceGroupNextAsyncImages(com.github.wukong.azurevm.models.images.ListByResourceGroupNextAsyncRequest request) {
		return this.images().listByResourceGroupNextAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.ImageInner> listByResourceGroupNextImages(com.github.wukong.azurevm.models.images.ListByResourceGroupNextRequest request) {
		return this.images().listByResourceGroupNext(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.ImageInner beginCreateOrUpdateImages(com.github.wukong.azurevm.models.images.BeginCreateOrUpdateRequest request) {
		return this.images().beginCreateOrUpdate(request.getResourceGroupName(),request.getImageName(),request.getParameters());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ImageInner>> listAsyncImages(com.github.wukong.azurevm.models.images.ListAsyncRequest request) {
		return this.images().listAsync();
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ImageInner>>> listByResourceGroupNextWithServiceResponseAsyncImages(com.github.wukong.azurevm.models.images.ListByResourceGroupNextWithServiceResponseAsyncRequest request) {
		return this.images().listByResourceGroupNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ImageInner>>> listByResourceGroupSinglePageAsyncImages(com.github.wukong.azurevm.models.images.ListByResourceGroupSinglePageAsyncRequest request) {
		return this.images().listByResourceGroupSinglePageAsync(request.getResourceGroupName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ImageInner>>> listByResourceGroupNextSinglePageAsyncImages(com.github.wukong.azurevm.models.images.ListByResourceGroupNextSinglePageAsyncRequest request) {
		return this.images().listByResourceGroupNextSinglePageAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineInner> listNextVirtualMachines(com.github.wukong.azurevm.models.virtualMachines.ListNextRequest request) {
		return this.virtualMachines().listNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineInner>>> listNextSinglePageAsyncVirtualMachines(com.github.wukong.azurevm.models.virtualMachines.ListNextSinglePageAsyncRequest request) {
		return this.virtualMachines().listNextSinglePageAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineInner>>> listByResourceGroupWithServiceResponseAsyncVirtualMachines(com.github.wukong.azurevm.models.virtualMachines.ListByResourceGroupWithServiceResponseAsyncRequest request) {
		return this.virtualMachines().listByResourceGroupWithServiceResponseAsync(request.getResourceGroupName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineInner updateVirtualMachines(com.github.wukong.azurevm.models.virtualMachines.UpdateRequest request) {
		return this.virtualMachines().update(request.getResourceGroupName(),request.getVmName(),request.getParameters());
	}

	public void deleteVirtualMachines(com.github.wukong.azurevm.models.virtualMachines.DeleteRequest request) {
		this.virtualMachines().delete(request.getResourceGroupName(),request.getVmName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineInner> listByResourceGroupVirtualMachines(com.github.wukong.azurevm.models.virtualMachines.ListByResourceGroupRequest request) {
		return this.virtualMachines().listByResourceGroup(request.getResourceGroupName());
	}

	public java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineSizeInner> listAvailableSizesVirtualMachines(com.github.wukong.azurevm.models.virtualMachines.ListAvailableSizesRequest request) {
		return this.virtualMachines().listAvailableSizes(request.getResourceGroupName(),request.getVmName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineInner>>> listNextWithServiceResponseAsyncVirtualMachines(com.github.wukong.azurevm.models.virtualMachines.ListNextWithServiceResponseAsyncRequest request) {
		return this.virtualMachines().listNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineInner>> listByResourceGroupNextAsyncVirtualMachines(com.github.wukong.azurevm.models.virtualMachines.ListByResourceGroupNextAsyncRequest request) {
		return this.virtualMachines().listByResourceGroupNextAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineSizeInner>>> listAvailableSizesWithServiceResponseAsyncVirtualMachines(com.github.wukong.azurevm.models.virtualMachines.ListAvailableSizesWithServiceResponseAsyncRequest request) {
		return this.virtualMachines().listAvailableSizesWithServiceResponseAsync(request.getResourceGroupName(),request.getVmName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineInner> listByResourceGroupNextVirtualMachines(com.github.wukong.azurevm.models.virtualMachines.ListByResourceGroupNextRequest request) {
		return this.virtualMachines().listByResourceGroupNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineInner>> listAsyncVirtualMachines(com.github.wukong.azurevm.models.virtualMachines.ListAsyncRequest request) {
		return this.virtualMachines().listAsync();
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineCaptureResultInner beginCaptureVirtualMachines(com.github.wukong.azurevm.models.virtualMachines.BeginCaptureRequest request) {
		return this.virtualMachines().beginCapture(request.getResourceGroupName(),request.getVmName(),request.getParameters());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineInner>>> listByResourceGroupSinglePageAsyncVirtualMachines(com.github.wukong.azurevm.models.virtualMachines.ListByResourceGroupSinglePageAsyncRequest request) {
		return this.virtualMachines().listByResourceGroupSinglePageAsync(request.getResourceGroupName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineInner>>> listByResourceGroupNextSinglePageAsyncVirtualMachines(com.github.wukong.azurevm.models.virtualMachines.ListByResourceGroupNextSinglePageAsyncRequest request) {
		return this.virtualMachines().listByResourceGroupNextSinglePageAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineInner getByResourceGroupVirtualMachines(com.github.wukong.azurevm.models.virtualMachines.GetByResourceGroupRequest request) {
		return this.virtualMachines().getByResourceGroup(request.getResourceGroupName(),request.getVmName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineInner createOrUpdateVirtualMachines(com.github.wukong.azurevm.models.virtualMachines.CreateOrUpdateRequest request) {
		return this.virtualMachines().createOrUpdate(request.getResourceGroupName(),request.getVmName(),request.getParameters());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.lang.Void>> deleteWithServiceResponseAsyncVirtualMachines(com.github.wukong.azurevm.models.virtualMachines.DeleteWithServiceResponseAsyncRequest request) {
		return this.virtualMachines().deleteWithServiceResponseAsync(request.getResourceGroupName(),request.getVmName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineInner>>> listSinglePageAsyncVirtualMachines(com.github.wukong.azurevm.models.virtualMachines.ListSinglePageAsyncRequest request) {
		return this.virtualMachines().listSinglePageAsync();
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineCaptureResultInner captureVirtualMachines(com.github.wukong.azurevm.models.virtualMachines.CaptureRequest request) {
		return this.virtualMachines().capture(request.getResourceGroupName(),request.getVmName(),request.getParameters());
	}

	public rx.Observable<java.lang.Void> deleteAsyncVirtualMachines(com.github.wukong.azurevm.models.virtualMachines.DeleteAsyncRequest request) {
		return this.virtualMachines().deleteAsync(request.getResourceGroupName(),request.getVmName());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineInner>> listByResourceGroupAsyncVirtualMachines(com.github.wukong.azurevm.models.virtualMachines.ListByResourceGroupAsyncRequest request) {
		return this.virtualMachines().listByResourceGroupAsync(request.getResourceGroupName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineInner> listVirtualMachines(com.github.wukong.azurevm.models.virtualMachines.ListRequest request) {
		return this.virtualMachines().list();
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineInner beginUpdateVirtualMachines(com.github.wukong.azurevm.models.virtualMachines.BeginUpdateRequest request) {
		return this.virtualMachines().beginUpdate(request.getResourceGroupName(),request.getVmName(),request.getParameters());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineInner>>> listWithServiceResponseAsyncVirtualMachines(com.github.wukong.azurevm.models.virtualMachines.ListWithServiceResponseAsyncRequest request) {
		return this.virtualMachines().listWithServiceResponseAsync();
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineInner>> listNextAsyncVirtualMachines(com.github.wukong.azurevm.models.virtualMachines.ListNextAsyncRequest request) {
		return this.virtualMachines().listNextAsync(request.getNextPageLink());
	}

	public rx.Observable<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineSizeInner>> listAvailableSizesAsyncVirtualMachines(com.github.wukong.azurevm.models.virtualMachines.ListAvailableSizesAsyncRequest request) {
		return this.virtualMachines().listAvailableSizesAsync(request.getResourceGroupName(),request.getVmName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineInner beginCreateOrUpdateVirtualMachines(com.github.wukong.azurevm.models.virtualMachines.BeginCreateOrUpdateRequest request) {
		return this.virtualMachines().beginCreateOrUpdate(request.getResourceGroupName(),request.getVmName(),request.getParameters());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineInner>>> listByResourceGroupNextWithServiceResponseAsyncVirtualMachines(com.github.wukong.azurevm.models.virtualMachines.ListByResourceGroupNextWithServiceResponseAsyncRequest request) {
		return this.virtualMachines().listByResourceGroupNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetSkuInner> listSkusVirtualMachineScaleSets(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListSkusRequest request) {
		return this.virtualMachineScaleSets().listSkus(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner> listNextVirtualMachineScaleSets(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListNextRequest request) {
		return this.virtualMachineScaleSets().listNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner>>> listNextSinglePageAsyncVirtualMachineScaleSets(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListNextSinglePageAsyncRequest request) {
		return this.virtualMachineScaleSets().listNextSinglePageAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner>>> listByResourceGroupWithServiceResponseAsyncVirtualMachineScaleSets(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListByResourceGroupWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSets().listByResourceGroupWithServiceResponseAsync(request.getResourceGroupName());
	}

	public void deleteInstancesVirtualMachineScaleSets(com.github.wukong.azurevm.models.virtualMachineScaleSets.DeleteInstancesRequest request) {
		this.virtualMachineScaleSets().deleteInstances(request.getResourceGroupName(),request.getVmScaleSetName(),request.getInstanceIds());
	}

	public com.microsoft.azure.management.compute.implementation.RecoveryWalkResponseInner forceRecoveryServiceFabricPlatformUpdateDomainWalkVirtualMachineScaleSets(com.github.wukong.azurevm.models.virtualMachineScaleSets.ForceRecoveryServiceFabricPlatformUpdateDomainWalkRequest request) {
		return this.virtualMachineScaleSets().forceRecoveryServiceFabricPlatformUpdateDomainWalk(request.getResourceGroupName(),request.getVmScaleSetName(),request.getPlatformUpdateDomain());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner updateVirtualMachineScaleSets(com.github.wukong.azurevm.models.virtualMachineScaleSets.UpdateRequest request) {
		return this.virtualMachineScaleSets().update(request.getResourceGroupName(),request.getVmScaleSetName(),request.getParameters());
	}

	public void deleteVirtualMachineScaleSets(com.github.wukong.azurevm.models.virtualMachineScaleSets.DeleteRequest request) {
		this.virtualMachineScaleSets().delete(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner> listByResourceGroupVirtualMachineScaleSets(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListByResourceGroupRequest request) {
		return this.virtualMachineScaleSets().listByResourceGroup(request.getResourceGroupName());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetSkuInner>> listSkusNextAsyncVirtualMachineScaleSets(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListSkusNextAsyncRequest request) {
		return this.virtualMachineScaleSets().listSkusNextAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.lang.Void>> deleteInstancesWithServiceResponseAsyncVirtualMachineScaleSets(com.github.wukong.azurevm.models.virtualMachineScaleSets.DeleteInstancesWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSets().deleteInstancesWithServiceResponseAsync(request.getResourceGroupName(),request.getVmScaleSetName(),request.getInstanceIds());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner>>> listNextWithServiceResponseAsyncVirtualMachineScaleSets(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListNextWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSets().listNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner>> listByResourceGroupNextAsyncVirtualMachineScaleSets(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListByResourceGroupNextAsyncRequest request) {
		return this.virtualMachineScaleSets().listByResourceGroupNextAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner> listByResourceGroupNextVirtualMachineScaleSets(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListByResourceGroupNextRequest request) {
		return this.virtualMachineScaleSets().listByResourceGroupNext(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetSkuInner> listSkusNextVirtualMachineScaleSets(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListSkusNextRequest request) {
		return this.virtualMachineScaleSets().listSkusNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner>> listAsyncVirtualMachineScaleSets(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListAsyncRequest request) {
		return this.virtualMachineScaleSets().listAsync();
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetSkuInner>> listSkusAsyncVirtualMachineScaleSets(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListSkusAsyncRequest request) {
		return this.virtualMachineScaleSets().listSkusAsync(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner>>> listByResourceGroupSinglePageAsyncVirtualMachineScaleSets(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListByResourceGroupSinglePageAsyncRequest request) {
		return this.virtualMachineScaleSets().listByResourceGroupSinglePageAsync(request.getResourceGroupName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner>>> listByResourceGroupNextSinglePageAsyncVirtualMachineScaleSets(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListByResourceGroupNextSinglePageAsyncRequest request) {
		return this.virtualMachineScaleSets().listByResourceGroupNextSinglePageAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner getByResourceGroupVirtualMachineScaleSets(com.github.wukong.azurevm.models.virtualMachineScaleSets.GetByResourceGroupRequest request) {
		return this.virtualMachineScaleSets().getByResourceGroup(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner createOrUpdateVirtualMachineScaleSets(com.github.wukong.azurevm.models.virtualMachineScaleSets.CreateOrUpdateRequest request) {
		return this.virtualMachineScaleSets().createOrUpdate(request.getResourceGroupName(),request.getVmScaleSetName(),request.getParameters());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.lang.Void>> deleteWithServiceResponseAsyncVirtualMachineScaleSets(com.github.wukong.azurevm.models.virtualMachineScaleSets.DeleteWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSets().deleteWithServiceResponseAsync(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public rx.Observable<java.lang.Void> deleteInstancesAsyncVirtualMachineScaleSets(com.github.wukong.azurevm.models.virtualMachineScaleSets.DeleteInstancesAsyncRequest request) {
		return this.virtualMachineScaleSets().deleteInstancesAsync(request.getResourceGroupName(),request.getVmScaleSetName(),request.getInstanceIds());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner>>> listSinglePageAsyncVirtualMachineScaleSets(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListSinglePageAsyncRequest request) {
		return this.virtualMachineScaleSets().listSinglePageAsync();
	}

	public rx.Observable<java.lang.Void> deleteAsyncVirtualMachineScaleSets(com.github.wukong.azurevm.models.virtualMachineScaleSets.DeleteAsyncRequest request) {
		return this.virtualMachineScaleSets().deleteAsync(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInstanceViewInner getInstanceViewVirtualMachineScaleSets(com.github.wukong.azurevm.models.virtualMachineScaleSets.GetInstanceViewRequest request) {
		return this.virtualMachineScaleSets().getInstanceView(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner>> listByResourceGroupAsyncVirtualMachineScaleSets(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListByResourceGroupAsyncRequest request) {
		return this.virtualMachineScaleSets().listByResourceGroupAsync(request.getResourceGroupName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner> listVirtualMachineScaleSets(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListRequest request) {
		return this.virtualMachineScaleSets().list();
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetSkuInner>>> listSkusNextSinglePageAsyncVirtualMachineScaleSets(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListSkusNextSinglePageAsyncRequest request) {
		return this.virtualMachineScaleSets().listSkusNextSinglePageAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner beginUpdateVirtualMachineScaleSets(com.github.wukong.azurevm.models.virtualMachineScaleSets.BeginUpdateRequest request) {
		return this.virtualMachineScaleSets().beginUpdate(request.getResourceGroupName(),request.getVmScaleSetName(),request.getParameters());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetSkuInner>>> listSkusWithServiceResponseAsyncVirtualMachineScaleSets(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListSkusWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSets().listSkusWithServiceResponseAsync(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner>>> listWithServiceResponseAsyncVirtualMachineScaleSets(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSets().listWithServiceResponseAsync();
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetSkuInner>>> listSkusSinglePageAsyncVirtualMachineScaleSets(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListSkusSinglePageAsyncRequest request) {
		return this.virtualMachineScaleSets().listSkusSinglePageAsync(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner>> listNextAsyncVirtualMachineScaleSets(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListNextAsyncRequest request) {
		return this.virtualMachineScaleSets().listNextAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner beginCreateOrUpdateVirtualMachineScaleSets(com.github.wukong.azurevm.models.virtualMachineScaleSets.BeginCreateOrUpdateRequest request) {
		return this.virtualMachineScaleSets().beginCreateOrUpdate(request.getResourceGroupName(),request.getVmScaleSetName(),request.getParameters());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner>>> listByResourceGroupNextWithServiceResponseAsyncVirtualMachineScaleSets(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListByResourceGroupNextWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSets().listByResourceGroupNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetSkuInner>>> listSkusNextWithServiceResponseAsyncVirtualMachineScaleSets(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListSkusNextWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSets().listSkusNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner createOrUpdateVirtualMachineScaleSetExtensions(com.github.wukong.azurevm.models.virtualMachineScaleSetExtensions.CreateOrUpdateRequest request) {
		return this.virtualMachineScaleSetExtensions().createOrUpdate(request.getResourceGroupName(),request.getVmScaleSetName(),request.getVmssExtensionName(),request.getExtensionParameters());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner> listNextVirtualMachineScaleSetExtensions(com.github.wukong.azurevm.models.virtualMachineScaleSetExtensions.ListNextRequest request) {
		return this.virtualMachineScaleSetExtensions().listNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.lang.Void>> deleteWithServiceResponseAsyncVirtualMachineScaleSetExtensions(com.github.wukong.azurevm.models.virtualMachineScaleSetExtensions.DeleteWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSetExtensions().deleteWithServiceResponseAsync(request.getResourceGroupName(),request.getVmScaleSetName(),request.getVmssExtensionName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner>>> listNextSinglePageAsyncVirtualMachineScaleSetExtensions(com.github.wukong.azurevm.models.virtualMachineScaleSetExtensions.ListNextSinglePageAsyncRequest request) {
		return this.virtualMachineScaleSetExtensions().listNextSinglePageAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner>>> listSinglePageAsyncVirtualMachineScaleSetExtensions(com.github.wukong.azurevm.models.virtualMachineScaleSetExtensions.ListSinglePageAsyncRequest request) {
		return this.virtualMachineScaleSetExtensions().listSinglePageAsync(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public rx.Observable<java.lang.Void> deleteAsyncVirtualMachineScaleSetExtensions(com.github.wukong.azurevm.models.virtualMachineScaleSetExtensions.DeleteAsyncRequest request) {
		return this.virtualMachineScaleSetExtensions().deleteAsync(request.getResourceGroupName(),request.getVmScaleSetName(),request.getVmssExtensionName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner> listVirtualMachineScaleSetExtensions(com.github.wukong.azurevm.models.virtualMachineScaleSetExtensions.ListRequest request) {
		return this.virtualMachineScaleSetExtensions().list(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public void deleteVirtualMachineScaleSetExtensions(com.github.wukong.azurevm.models.virtualMachineScaleSetExtensions.DeleteRequest request) {
		this.virtualMachineScaleSetExtensions().delete(request.getResourceGroupName(),request.getVmScaleSetName(),request.getVmssExtensionName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner>>> listWithServiceResponseAsyncVirtualMachineScaleSetExtensions(com.github.wukong.azurevm.models.virtualMachineScaleSetExtensions.ListWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSetExtensions().listWithServiceResponseAsync(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner>>> listNextWithServiceResponseAsyncVirtualMachineScaleSetExtensions(com.github.wukong.azurevm.models.virtualMachineScaleSetExtensions.ListNextWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSetExtensions().listNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner>> listNextAsyncVirtualMachineScaleSetExtensions(com.github.wukong.azurevm.models.virtualMachineScaleSetExtensions.ListNextAsyncRequest request) {
		return this.virtualMachineScaleSetExtensions().listNextAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner getVirtualMachineScaleSetExtensions(com.github.wukong.azurevm.models.virtualMachineScaleSetExtensions.GetRequest request) {
		return this.virtualMachineScaleSetExtensions().get(request.getResourceGroupName(),request.getVmScaleSetName(),request.getVmssExtensionName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner beginCreateOrUpdateVirtualMachineScaleSetExtensions(com.github.wukong.azurevm.models.virtualMachineScaleSetExtensions.BeginCreateOrUpdateRequest request) {
		return this.virtualMachineScaleSetExtensions().beginCreateOrUpdate(request.getResourceGroupName(),request.getVmScaleSetName(),request.getVmssExtensionName(),request.getExtensionParameters());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner>> listAsyncVirtualMachineScaleSetExtensions(com.github.wukong.azurevm.models.virtualMachineScaleSetExtensions.ListAsyncRequest request) {
		return this.virtualMachineScaleSetExtensions().listAsync(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public com.microsoft.azure.management.compute.implementation.RollingUpgradeStatusInfoInner getLatestVirtualMachineScaleSetRollingUpgrades(com.github.wukong.azurevm.models.virtualMachineScaleSetRollingUpgrades.GetLatestRequest request) {
		return this.virtualMachineScaleSetRollingUpgrades().getLatest(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInner> listNextVirtualMachineScaleSetVMs(com.github.wukong.azurevm.models.virtualMachineScaleSetVMs.ListNextRequest request) {
		return this.virtualMachineScaleSetVMs().listNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.lang.Void>> deleteWithServiceResponseAsyncVirtualMachineScaleSetVMs(com.github.wukong.azurevm.models.virtualMachineScaleSetVMs.DeleteWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSetVMs().deleteWithServiceResponseAsync(request.getResourceGroupName(),request.getVmScaleSetName(),request.getInstanceId());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInner>>> listNextSinglePageAsyncVirtualMachineScaleSetVMs(com.github.wukong.azurevm.models.virtualMachineScaleSetVMs.ListNextSinglePageAsyncRequest request) {
		return this.virtualMachineScaleSetVMs().listNextSinglePageAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInner>>> listSinglePageAsyncVirtualMachineScaleSetVMs(com.github.wukong.azurevm.models.virtualMachineScaleSetVMs.ListSinglePageAsyncRequest request) {
		return this.virtualMachineScaleSetVMs().listSinglePageAsync(request.getResourceGroupName(),request.getVirtualMachineScaleSetName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInner updateVirtualMachineScaleSetVMs(com.github.wukong.azurevm.models.virtualMachineScaleSetVMs.UpdateRequest request) {
		return this.virtualMachineScaleSetVMs().update(request.getResourceGroupName(),request.getVmScaleSetName(),request.getInstanceId(),request.getParameters());
	}

	public rx.Observable<java.lang.Void> deleteAsyncVirtualMachineScaleSetVMs(com.github.wukong.azurevm.models.virtualMachineScaleSetVMs.DeleteAsyncRequest request) {
		return this.virtualMachineScaleSetVMs().deleteAsync(request.getResourceGroupName(),request.getVmScaleSetName(),request.getInstanceId());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInstanceViewInner getInstanceViewVirtualMachineScaleSetVMs(com.github.wukong.azurevm.models.virtualMachineScaleSetVMs.GetInstanceViewRequest request) {
		return this.virtualMachineScaleSetVMs().getInstanceView(request.getResourceGroupName(),request.getVmScaleSetName(),request.getInstanceId());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInner> listVirtualMachineScaleSetVMs(com.github.wukong.azurevm.models.virtualMachineScaleSetVMs.ListRequest request) {
		return this.virtualMachineScaleSetVMs().list(request.getResourceGroupName(),request.getVirtualMachineScaleSetName());
	}

	public void deleteVirtualMachineScaleSetVMs(com.github.wukong.azurevm.models.virtualMachineScaleSetVMs.DeleteRequest request) {
		this.virtualMachineScaleSetVMs().delete(request.getResourceGroupName(),request.getVmScaleSetName(),request.getInstanceId());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInner beginUpdateVirtualMachineScaleSetVMs(com.github.wukong.azurevm.models.virtualMachineScaleSetVMs.BeginUpdateRequest request) {
		return this.virtualMachineScaleSetVMs().beginUpdate(request.getResourceGroupName(),request.getVmScaleSetName(),request.getInstanceId(),request.getParameters());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInner>>> listWithServiceResponseAsyncVirtualMachineScaleSetVMs(com.github.wukong.azurevm.models.virtualMachineScaleSetVMs.ListWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSetVMs().listWithServiceResponseAsync(request.getResourceGroupName(),request.getVirtualMachineScaleSetName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInner>>> listNextWithServiceResponseAsyncVirtualMachineScaleSetVMs(com.github.wukong.azurevm.models.virtualMachineScaleSetVMs.ListNextWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSetVMs().listNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInner>> listNextAsyncVirtualMachineScaleSetVMs(com.github.wukong.azurevm.models.virtualMachineScaleSetVMs.ListNextAsyncRequest request) {
		return this.virtualMachineScaleSetVMs().listNextAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInner getVirtualMachineScaleSetVMs(com.github.wukong.azurevm.models.virtualMachineScaleSetVMs.GetRequest request) {
		return this.virtualMachineScaleSetVMs().get(request.getResourceGroupName(),request.getVmScaleSetName(),request.getInstanceId());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInner>> listAsyncVirtualMachineScaleSetVMs(com.github.wukong.azurevm.models.virtualMachineScaleSetVMs.ListAsyncRequest request) {
		return this.virtualMachineScaleSetVMs().listAsync(request.getResourceGroupName(),request.getVirtualMachineScaleSetName());
	}

	public com.microsoft.azure.management.compute.implementation.LogAnalyticsOperationResultInner beginExportThrottledRequestsLogAnalytics(com.github.wukong.azurevm.models.logAnalytics.BeginExportThrottledRequestsRequest request) {
		return this.logAnalytics().beginExportThrottledRequests(request.getLocation(),request.getParameters());
	}

	public com.microsoft.azure.management.compute.implementation.LogAnalyticsOperationResultInner exportRequestRateByIntervalLogAnalytics(com.github.wukong.azurevm.models.logAnalytics.ExportRequestRateByIntervalRequest request) {
		return this.logAnalytics().exportRequestRateByInterval(request.getLocation(),request.getParameters());
	}

	public com.microsoft.azure.management.compute.implementation.LogAnalyticsOperationResultInner exportThrottledRequestsLogAnalytics(com.github.wukong.azurevm.models.logAnalytics.ExportThrottledRequestsRequest request) {
		return this.logAnalytics().exportThrottledRequests(request.getLocation(),request.getParameters());
	}

	public com.microsoft.azure.management.compute.implementation.LogAnalyticsOperationResultInner beginExportRequestRateByIntervalLogAnalytics(com.github.wukong.azurevm.models.logAnalytics.BeginExportRequestRateByIntervalRequest request) {
		return this.logAnalytics().beginExportRequestRateByInterval(request.getLocation(),request.getParameters());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.RunCommandDocumentBaseInner>>> listWithServiceResponseAsyncVirtualMachineRunCommands(com.github.wukong.azurevm.models.virtualMachineRunCommands.ListWithServiceResponseAsyncRequest request) {
		return this.virtualMachineRunCommands().listWithServiceResponseAsync(request.getLocation());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.RunCommandDocumentBaseInner>>> listNextWithServiceResponseAsyncVirtualMachineRunCommands(com.github.wukong.azurevm.models.virtualMachineRunCommands.ListNextWithServiceResponseAsyncRequest request) {
		return this.virtualMachineRunCommands().listNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.RunCommandDocumentBaseInner> listNextVirtualMachineRunCommands(com.github.wukong.azurevm.models.virtualMachineRunCommands.ListNextRequest request) {
		return this.virtualMachineRunCommands().listNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.RunCommandDocumentBaseInner>> listNextAsyncVirtualMachineRunCommands(com.github.wukong.azurevm.models.virtualMachineRunCommands.ListNextAsyncRequest request) {
		return this.virtualMachineRunCommands().listNextAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.RunCommandDocumentBaseInner>>> listNextSinglePageAsyncVirtualMachineRunCommands(com.github.wukong.azurevm.models.virtualMachineRunCommands.ListNextSinglePageAsyncRequest request) {
		return this.virtualMachineRunCommands().listNextSinglePageAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.RunCommandDocumentInner getVirtualMachineRunCommands(com.github.wukong.azurevm.models.virtualMachineRunCommands.GetRequest request) {
		return this.virtualMachineRunCommands().get(request.getLocation(),request.getCommandId());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.RunCommandDocumentBaseInner>>> listSinglePageAsyncVirtualMachineRunCommands(com.github.wukong.azurevm.models.virtualMachineRunCommands.ListSinglePageAsyncRequest request) {
		return this.virtualMachineRunCommands().listSinglePageAsync(request.getLocation());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.RunCommandDocumentBaseInner> listVirtualMachineRunCommands(com.github.wukong.azurevm.models.virtualMachineRunCommands.ListRequest request) {
		return this.virtualMachineRunCommands().list(request.getLocation());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.RunCommandDocumentBaseInner>> listAsyncVirtualMachineRunCommands(com.github.wukong.azurevm.models.virtualMachineRunCommands.ListAsyncRequest request) {
		return this.virtualMachineRunCommands().listAsync(request.getLocation());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ResourceSkuInner>>> listWithServiceResponseAsyncResourceSkus(com.github.wukong.azurevm.models.resourceSkus.ListWithServiceResponseAsyncRequest request) {
		return this.resourceSkus().listWithServiceResponseAsync();
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ResourceSkuInner>>> listNextWithServiceResponseAsyncResourceSkus(com.github.wukong.azurevm.models.resourceSkus.ListNextWithServiceResponseAsyncRequest request) {
		return this.resourceSkus().listNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.ResourceSkuInner> listNextResourceSkus(com.github.wukong.azurevm.models.resourceSkus.ListNextRequest request) {
		return this.resourceSkus().listNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ResourceSkuInner>> listNextAsyncResourceSkus(com.github.wukong.azurevm.models.resourceSkus.ListNextAsyncRequest request) {
		return this.resourceSkus().listNextAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ResourceSkuInner>>> listNextSinglePageAsyncResourceSkus(com.github.wukong.azurevm.models.resourceSkus.ListNextSinglePageAsyncRequest request) {
		return this.resourceSkus().listNextSinglePageAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ResourceSkuInner>>> listSinglePageAsyncResourceSkus(com.github.wukong.azurevm.models.resourceSkus.ListSinglePageAsyncRequest request) {
		return this.resourceSkus().listSinglePageAsync();
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.ResourceSkuInner> listResourceSkus(com.github.wukong.azurevm.models.resourceSkus.ListRequest request) {
		return this.resourceSkus().list();
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ResourceSkuInner>> listAsyncResourceSkus(com.github.wukong.azurevm.models.resourceSkus.ListAsyncRequest request) {
		return this.resourceSkus().listAsync();
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.DiskInner> listNextDisks(com.github.wukong.azurevm.models.disks.ListNextRequest request) {
		return this.disks().listNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.DiskInner>>> listNextSinglePageAsyncDisks(com.github.wukong.azurevm.models.disks.ListNextSinglePageAsyncRequest request) {
		return this.disks().listNextSinglePageAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.DiskInner>>> listByResourceGroupWithServiceResponseAsyncDisks(com.github.wukong.azurevm.models.disks.ListByResourceGroupWithServiceResponseAsyncRequest request) {
		return this.disks().listByResourceGroupWithServiceResponseAsync(request.getResourceGroupName());
	}

	public com.microsoft.azure.management.compute.implementation.DiskInner updateDisks(com.github.wukong.azurevm.models.disks.UpdateRequest request) {
		return this.disks().update(request.getResourceGroupName(),request.getDiskName(),request.getDisk());
	}

	public void deleteDisks(com.github.wukong.azurevm.models.disks.DeleteRequest request) {
		this.disks().delete(request.getResourceGroupName(),request.getDiskName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.DiskInner> listByResourceGroupDisks(com.github.wukong.azurevm.models.disks.ListByResourceGroupRequest request) {
		return this.disks().listByResourceGroup(request.getResourceGroupName());
	}

	public com.microsoft.azure.management.compute.implementation.AccessUriInner beginGrantAccessDisks(com.github.wukong.azurevm.models.disks.BeginGrantAccessRequest request) {
		return this.disks().beginGrantAccess(request.getResourceGroupName(),request.getDiskName(),request.getGrantAccessData());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.DiskInner>>> listNextWithServiceResponseAsyncDisks(com.github.wukong.azurevm.models.disks.ListNextWithServiceResponseAsyncRequest request) {
		return this.disks().listNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.DiskInner>> listByResourceGroupNextAsyncDisks(com.github.wukong.azurevm.models.disks.ListByResourceGroupNextAsyncRequest request) {
		return this.disks().listByResourceGroupNextAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.DiskInner> listByResourceGroupNextDisks(com.github.wukong.azurevm.models.disks.ListByResourceGroupNextRequest request) {
		return this.disks().listByResourceGroupNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.DiskInner>> listAsyncDisks(com.github.wukong.azurevm.models.disks.ListAsyncRequest request) {
		return this.disks().listAsync();
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.DiskInner>>> listByResourceGroupSinglePageAsyncDisks(com.github.wukong.azurevm.models.disks.ListByResourceGroupSinglePageAsyncRequest request) {
		return this.disks().listByResourceGroupSinglePageAsync(request.getResourceGroupName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.DiskInner>>> listByResourceGroupNextSinglePageAsyncDisks(com.github.wukong.azurevm.models.disks.ListByResourceGroupNextSinglePageAsyncRequest request) {
		return this.disks().listByResourceGroupNextSinglePageAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.DiskInner getByResourceGroupDisks(com.github.wukong.azurevm.models.disks.GetByResourceGroupRequest request) {
		return this.disks().getByResourceGroup(request.getResourceGroupName(),request.getDiskName());
	}

	public com.microsoft.azure.management.compute.implementation.DiskInner createOrUpdateDisks(com.github.wukong.azurevm.models.disks.CreateOrUpdateRequest request) {
		return this.disks().createOrUpdate(request.getResourceGroupName(),request.getDiskName(),request.getDisk());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.lang.Void>> deleteWithServiceResponseAsyncDisks(com.github.wukong.azurevm.models.disks.DeleteWithServiceResponseAsyncRequest request) {
		return this.disks().deleteWithServiceResponseAsync(request.getResourceGroupName(),request.getDiskName());
	}

	public com.microsoft.azure.management.compute.implementation.AccessUriInner grantAccessDisks(com.github.wukong.azurevm.models.disks.GrantAccessRequest request) {
		return this.disks().grantAccess(request.getResourceGroupName(),request.getDiskName(),request.getGrantAccessData());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.DiskInner>>> listSinglePageAsyncDisks(com.github.wukong.azurevm.models.disks.ListSinglePageAsyncRequest request) {
		return this.disks().listSinglePageAsync();
	}

	public rx.Observable<java.lang.Void> deleteAsyncDisks(com.github.wukong.azurevm.models.disks.DeleteAsyncRequest request) {
		return this.disks().deleteAsync(request.getResourceGroupName(),request.getDiskName());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.DiskInner>> listByResourceGroupAsyncDisks(com.github.wukong.azurevm.models.disks.ListByResourceGroupAsyncRequest request) {
		return this.disks().listByResourceGroupAsync(request.getResourceGroupName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.DiskInner> listDisks(com.github.wukong.azurevm.models.disks.ListRequest request) {
		return this.disks().list();
	}

	public com.microsoft.azure.management.compute.implementation.DiskInner beginUpdateDisks(com.github.wukong.azurevm.models.disks.BeginUpdateRequest request) {
		return this.disks().beginUpdate(request.getResourceGroupName(),request.getDiskName(),request.getDisk());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.DiskInner>>> listWithServiceResponseAsyncDisks(com.github.wukong.azurevm.models.disks.ListWithServiceResponseAsyncRequest request) {
		return this.disks().listWithServiceResponseAsync();
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.DiskInner>> listNextAsyncDisks(com.github.wukong.azurevm.models.disks.ListNextAsyncRequest request) {
		return this.disks().listNextAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.DiskInner beginCreateOrUpdateDisks(com.github.wukong.azurevm.models.disks.BeginCreateOrUpdateRequest request) {
		return this.disks().beginCreateOrUpdate(request.getResourceGroupName(),request.getDiskName(),request.getDisk());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.DiskInner>>> listByResourceGroupNextWithServiceResponseAsyncDisks(com.github.wukong.azurevm.models.disks.ListByResourceGroupNextWithServiceResponseAsyncRequest request) {
		return this.disks().listByResourceGroupNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.SnapshotInner> listNextSnapshots(com.github.wukong.azurevm.models.snapshots.ListNextRequest request) {
		return this.snapshots().listNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.SnapshotInner>>> listNextSinglePageAsyncSnapshots(com.github.wukong.azurevm.models.snapshots.ListNextSinglePageAsyncRequest request) {
		return this.snapshots().listNextSinglePageAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.SnapshotInner>>> listByResourceGroupWithServiceResponseAsyncSnapshots(com.github.wukong.azurevm.models.snapshots.ListByResourceGroupWithServiceResponseAsyncRequest request) {
		return this.snapshots().listByResourceGroupWithServiceResponseAsync(request.getResourceGroupName());
	}

	public com.microsoft.azure.management.compute.implementation.SnapshotInner updateSnapshots(com.github.wukong.azurevm.models.snapshots.UpdateRequest request) {
		return this.snapshots().update(request.getResourceGroupName(),request.getSnapshotName(),request.getSnapshot());
	}

	public void deleteSnapshots(com.github.wukong.azurevm.models.snapshots.DeleteRequest request) {
		this.snapshots().delete(request.getResourceGroupName(),request.getSnapshotName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.SnapshotInner> listByResourceGroupSnapshots(com.github.wukong.azurevm.models.snapshots.ListByResourceGroupRequest request) {
		return this.snapshots().listByResourceGroup(request.getResourceGroupName());
	}

	public com.microsoft.azure.management.compute.implementation.AccessUriInner beginGrantAccessSnapshots(com.github.wukong.azurevm.models.snapshots.BeginGrantAccessRequest request) {
		return this.snapshots().beginGrantAccess(request.getResourceGroupName(),request.getSnapshotName(),request.getGrantAccessData());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.SnapshotInner>>> listNextWithServiceResponseAsyncSnapshots(com.github.wukong.azurevm.models.snapshots.ListNextWithServiceResponseAsyncRequest request) {
		return this.snapshots().listNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.SnapshotInner>> listByResourceGroupNextAsyncSnapshots(com.github.wukong.azurevm.models.snapshots.ListByResourceGroupNextAsyncRequest request) {
		return this.snapshots().listByResourceGroupNextAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.SnapshotInner> listByResourceGroupNextSnapshots(com.github.wukong.azurevm.models.snapshots.ListByResourceGroupNextRequest request) {
		return this.snapshots().listByResourceGroupNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.SnapshotInner>> listAsyncSnapshots(com.github.wukong.azurevm.models.snapshots.ListAsyncRequest request) {
		return this.snapshots().listAsync();
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.SnapshotInner>>> listByResourceGroupSinglePageAsyncSnapshots(com.github.wukong.azurevm.models.snapshots.ListByResourceGroupSinglePageAsyncRequest request) {
		return this.snapshots().listByResourceGroupSinglePageAsync(request.getResourceGroupName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.SnapshotInner>>> listByResourceGroupNextSinglePageAsyncSnapshots(com.github.wukong.azurevm.models.snapshots.ListByResourceGroupNextSinglePageAsyncRequest request) {
		return this.snapshots().listByResourceGroupNextSinglePageAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.SnapshotInner getByResourceGroupSnapshots(com.github.wukong.azurevm.models.snapshots.GetByResourceGroupRequest request) {
		return this.snapshots().getByResourceGroup(request.getResourceGroupName(),request.getSnapshotName());
	}

	public com.microsoft.azure.management.compute.implementation.SnapshotInner createOrUpdateSnapshots(com.github.wukong.azurevm.models.snapshots.CreateOrUpdateRequest request) {
		return this.snapshots().createOrUpdate(request.getResourceGroupName(),request.getSnapshotName(),request.getSnapshot());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.lang.Void>> deleteWithServiceResponseAsyncSnapshots(com.github.wukong.azurevm.models.snapshots.DeleteWithServiceResponseAsyncRequest request) {
		return this.snapshots().deleteWithServiceResponseAsync(request.getResourceGroupName(),request.getSnapshotName());
	}

	public com.microsoft.azure.management.compute.implementation.AccessUriInner grantAccessSnapshots(com.github.wukong.azurevm.models.snapshots.GrantAccessRequest request) {
		return this.snapshots().grantAccess(request.getResourceGroupName(),request.getSnapshotName(),request.getGrantAccessData());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.SnapshotInner>>> listSinglePageAsyncSnapshots(com.github.wukong.azurevm.models.snapshots.ListSinglePageAsyncRequest request) {
		return this.snapshots().listSinglePageAsync();
	}

	public rx.Observable<java.lang.Void> deleteAsyncSnapshots(com.github.wukong.azurevm.models.snapshots.DeleteAsyncRequest request) {
		return this.snapshots().deleteAsync(request.getResourceGroupName(),request.getSnapshotName());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.SnapshotInner>> listByResourceGroupAsyncSnapshots(com.github.wukong.azurevm.models.snapshots.ListByResourceGroupAsyncRequest request) {
		return this.snapshots().listByResourceGroupAsync(request.getResourceGroupName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.SnapshotInner> listSnapshots(com.github.wukong.azurevm.models.snapshots.ListRequest request) {
		return this.snapshots().list();
	}

	public com.microsoft.azure.management.compute.implementation.SnapshotInner beginUpdateSnapshots(com.github.wukong.azurevm.models.snapshots.BeginUpdateRequest request) {
		return this.snapshots().beginUpdate(request.getResourceGroupName(),request.getSnapshotName(),request.getSnapshot());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.SnapshotInner>>> listWithServiceResponseAsyncSnapshots(com.github.wukong.azurevm.models.snapshots.ListWithServiceResponseAsyncRequest request) {
		return this.snapshots().listWithServiceResponseAsync();
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.SnapshotInner>> listNextAsyncSnapshots(com.github.wukong.azurevm.models.snapshots.ListNextAsyncRequest request) {
		return this.snapshots().listNextAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.SnapshotInner beginCreateOrUpdateSnapshots(com.github.wukong.azurevm.models.snapshots.BeginCreateOrUpdateRequest request) {
		return this.snapshots().beginCreateOrUpdate(request.getResourceGroupName(),request.getSnapshotName(),request.getSnapshot());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.SnapshotInner>>> listByResourceGroupNextWithServiceResponseAsyncSnapshots(com.github.wukong.azurevm.models.snapshots.ListByResourceGroupNextWithServiceResponseAsyncRequest request) {
		return this.snapshots().listByResourceGroupNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.GalleryInner getByResourceGroupGalleries(com.github.wukong.azurevm.models.galleries.GetByResourceGroupRequest request) {
		return this.galleries().getByResourceGroup(request.getResourceGroupName(),request.getGalleryName());
	}

	public com.microsoft.azure.management.compute.implementation.GalleryInner createOrUpdateGalleries(com.github.wukong.azurevm.models.galleries.CreateOrUpdateRequest request) {
		return this.galleries().createOrUpdate(request.getResourceGroupName(),request.getGalleryName(),request.getGallery());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.GalleryInner> listNextGalleries(com.github.wukong.azurevm.models.galleries.ListNextRequest request) {
		return this.galleries().listNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.lang.Void>> deleteWithServiceResponseAsyncGalleries(com.github.wukong.azurevm.models.galleries.DeleteWithServiceResponseAsyncRequest request) {
		return this.galleries().deleteWithServiceResponseAsync(request.getResourceGroupName(),request.getGalleryName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryInner>>> listNextSinglePageAsyncGalleries(com.github.wukong.azurevm.models.galleries.ListNextSinglePageAsyncRequest request) {
		return this.galleries().listNextSinglePageAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryInner>>> listByResourceGroupWithServiceResponseAsyncGalleries(com.github.wukong.azurevm.models.galleries.ListByResourceGroupWithServiceResponseAsyncRequest request) {
		return this.galleries().listByResourceGroupWithServiceResponseAsync(request.getResourceGroupName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryInner>>> listSinglePageAsyncGalleries(com.github.wukong.azurevm.models.galleries.ListSinglePageAsyncRequest request) {
		return this.galleries().listSinglePageAsync();
	}

	public rx.Observable<java.lang.Void> deleteAsyncGalleries(com.github.wukong.azurevm.models.galleries.DeleteAsyncRequest request) {
		return this.galleries().deleteAsync(request.getResourceGroupName(),request.getGalleryName());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryInner>> listByResourceGroupAsyncGalleries(com.github.wukong.azurevm.models.galleries.ListByResourceGroupAsyncRequest request) {
		return this.galleries().listByResourceGroupAsync(request.getResourceGroupName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.GalleryInner> listGalleries(com.github.wukong.azurevm.models.galleries.ListRequest request) {
		return this.galleries().list();
	}

	public void deleteGalleries(com.github.wukong.azurevm.models.galleries.DeleteRequest request) {
		this.galleries().delete(request.getResourceGroupName(),request.getGalleryName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.GalleryInner> listByResourceGroupGalleries(com.github.wukong.azurevm.models.galleries.ListByResourceGroupRequest request) {
		return this.galleries().listByResourceGroup(request.getResourceGroupName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryInner>>> listWithServiceResponseAsyncGalleries(com.github.wukong.azurevm.models.galleries.ListWithServiceResponseAsyncRequest request) {
		return this.galleries().listWithServiceResponseAsync();
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryInner>>> listNextWithServiceResponseAsyncGalleries(com.github.wukong.azurevm.models.galleries.ListNextWithServiceResponseAsyncRequest request) {
		return this.galleries().listNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryInner>> listNextAsyncGalleries(com.github.wukong.azurevm.models.galleries.ListNextAsyncRequest request) {
		return this.galleries().listNextAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryInner>> listByResourceGroupNextAsyncGalleries(com.github.wukong.azurevm.models.galleries.ListByResourceGroupNextAsyncRequest request) {
		return this.galleries().listByResourceGroupNextAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.GalleryInner> listByResourceGroupNextGalleries(com.github.wukong.azurevm.models.galleries.ListByResourceGroupNextRequest request) {
		return this.galleries().listByResourceGroupNext(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.GalleryInner beginCreateOrUpdateGalleries(com.github.wukong.azurevm.models.galleries.BeginCreateOrUpdateRequest request) {
		return this.galleries().beginCreateOrUpdate(request.getResourceGroupName(),request.getGalleryName(),request.getGallery());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryInner>> listAsyncGalleries(com.github.wukong.azurevm.models.galleries.ListAsyncRequest request) {
		return this.galleries().listAsync();
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryInner>>> listByResourceGroupNextWithServiceResponseAsyncGalleries(com.github.wukong.azurevm.models.galleries.ListByResourceGroupNextWithServiceResponseAsyncRequest request) {
		return this.galleries().listByResourceGroupNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryInner>>> listByResourceGroupSinglePageAsyncGalleries(com.github.wukong.azurevm.models.galleries.ListByResourceGroupSinglePageAsyncRequest request) {
		return this.galleries().listByResourceGroupSinglePageAsync(request.getResourceGroupName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryInner>>> listByResourceGroupNextSinglePageAsyncGalleries(com.github.wukong.azurevm.models.galleries.ListByResourceGroupNextSinglePageAsyncRequest request) {
		return this.galleries().listByResourceGroupNextSinglePageAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.GalleryImageInner> listByGalleryGalleryImages(com.github.wukong.azurevm.models.galleryImages.ListByGalleryRequest request) {
		return this.galleryImages().listByGallery(request.getResourceGroupName(),request.getGalleryName());
	}

	public com.microsoft.azure.management.compute.implementation.GalleryImageInner createOrUpdateGalleryImages(com.github.wukong.azurevm.models.galleryImages.CreateOrUpdateRequest request) {
		return this.galleryImages().createOrUpdate(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName(),request.getGalleryImage());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryImageInner>>> listByGalleryWithServiceResponseAsyncGalleryImages(com.github.wukong.azurevm.models.galleryImages.ListByGalleryWithServiceResponseAsyncRequest request) {
		return this.galleryImages().listByGalleryWithServiceResponseAsync(request.getResourceGroupName(),request.getGalleryName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryImageInner>>> listByGalleryNextSinglePageAsyncGalleryImages(com.github.wukong.azurevm.models.galleryImages.ListByGalleryNextSinglePageAsyncRequest request) {
		return this.galleryImages().listByGalleryNextSinglePageAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.lang.Void>> deleteWithServiceResponseAsyncGalleryImages(com.github.wukong.azurevm.models.galleryImages.DeleteWithServiceResponseAsyncRequest request) {
		return this.galleryImages().deleteWithServiceResponseAsync(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.GalleryImageInner> listByGalleryNextGalleryImages(com.github.wukong.azurevm.models.galleryImages.ListByGalleryNextRequest request) {
		return this.galleryImages().listByGalleryNext(request.getNextPageLink());
	}

	public rx.Observable<java.lang.Void> deleteAsyncGalleryImages(com.github.wukong.azurevm.models.galleryImages.DeleteAsyncRequest request) {
		return this.galleryImages().deleteAsync(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryImageInner>>> listByGalleryNextWithServiceResponseAsyncGalleryImages(com.github.wukong.azurevm.models.galleryImages.ListByGalleryNextWithServiceResponseAsyncRequest request) {
		return this.galleryImages().listByGalleryNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryImageInner>> listByGalleryNextAsyncGalleryImages(com.github.wukong.azurevm.models.galleryImages.ListByGalleryNextAsyncRequest request) {
		return this.galleryImages().listByGalleryNextAsync(request.getNextPageLink());
	}

	public void deleteGalleryImages(com.github.wukong.azurevm.models.galleryImages.DeleteRequest request) {
		this.galleryImages().delete(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryImageInner>> listByGalleryAsyncGalleryImages(com.github.wukong.azurevm.models.galleryImages.ListByGalleryAsyncRequest request) {
		return this.galleryImages().listByGalleryAsync(request.getResourceGroupName(),request.getGalleryName());
	}

	public com.microsoft.azure.management.compute.implementation.GalleryImageInner getGalleryImages(com.github.wukong.azurevm.models.galleryImages.GetRequest request) {
		return this.galleryImages().get(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryImageInner>>> listByGallerySinglePageAsyncGalleryImages(com.github.wukong.azurevm.models.galleryImages.ListByGallerySinglePageAsyncRequest request) {
		return this.galleryImages().listByGallerySinglePageAsync(request.getResourceGroupName(),request.getGalleryName());
	}

	public com.microsoft.azure.management.compute.implementation.GalleryImageInner beginCreateOrUpdateGalleryImages(com.github.wukong.azurevm.models.galleryImages.BeginCreateOrUpdateRequest request) {
		return this.galleryImages().beginCreateOrUpdate(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName(),request.getGalleryImage());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.GalleryImageVersionInner> listByGalleryImageGalleryImageVersions(com.github.wukong.azurevm.models.galleryImageVersions.ListByGalleryImageRequest request) {
		return this.galleryImageVersions().listByGalleryImage(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName());
	}

	public com.microsoft.azure.management.compute.implementation.GalleryImageVersionInner createOrUpdateGalleryImageVersions(com.github.wukong.azurevm.models.galleryImageVersions.CreateOrUpdateRequest request) {
		return this.galleryImageVersions().createOrUpdate(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName(),request.getGalleryImageVersionName(),request.getGalleryImageVersion());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.lang.Void>> deleteWithServiceResponseAsyncGalleryImageVersions(com.github.wukong.azurevm.models.galleryImageVersions.DeleteWithServiceResponseAsyncRequest request) {
		return this.galleryImageVersions().deleteWithServiceResponseAsync(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName(),request.getGalleryImageVersionName());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryImageVersionInner>> listByGalleryImageNextAsyncGalleryImageVersions(com.github.wukong.azurevm.models.galleryImageVersions.ListByGalleryImageNextAsyncRequest request) {
		return this.galleryImageVersions().listByGalleryImageNextAsync(request.getNextPageLink());
	}

	public rx.Observable<java.lang.Void> deleteAsyncGalleryImageVersions(com.github.wukong.azurevm.models.galleryImageVersions.DeleteAsyncRequest request) {
		return this.galleryImageVersions().deleteAsync(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName(),request.getGalleryImageVersionName());
	}

	public void deleteGalleryImageVersions(com.github.wukong.azurevm.models.galleryImageVersions.DeleteRequest request) {
		this.galleryImageVersions().delete(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName(),request.getGalleryImageVersionName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.GalleryImageVersionInner> listByGalleryImageNextGalleryImageVersions(com.github.wukong.azurevm.models.galleryImageVersions.ListByGalleryImageNextRequest request) {
		return this.galleryImageVersions().listByGalleryImageNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryImageVersionInner>>> listByGalleryImageNextWithServiceResponseAsyncGalleryImageVersions(com.github.wukong.azurevm.models.galleryImageVersions.ListByGalleryImageNextWithServiceResponseAsyncRequest request) {
		return this.galleryImageVersions().listByGalleryImageNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryImageVersionInner>>> listByGalleryImageNextSinglePageAsyncGalleryImageVersions(com.github.wukong.azurevm.models.galleryImageVersions.ListByGalleryImageNextSinglePageAsyncRequest request) {
		return this.galleryImageVersions().listByGalleryImageNextSinglePageAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.GalleryImageVersionInner getGalleryImageVersions(com.github.wukong.azurevm.models.galleryImageVersions.GetRequest request) {
		return this.galleryImageVersions().get(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName(),request.getGalleryImageVersionName());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryImageVersionInner>> listByGalleryImageAsyncGalleryImageVersions(com.github.wukong.azurevm.models.galleryImageVersions.ListByGalleryImageAsyncRequest request) {
		return this.galleryImageVersions().listByGalleryImageAsync(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryImageVersionInner>>> listByGalleryImageWithServiceResponseAsyncGalleryImageVersions(com.github.wukong.azurevm.models.galleryImageVersions.ListByGalleryImageWithServiceResponseAsyncRequest request) {
		return this.galleryImageVersions().listByGalleryImageWithServiceResponseAsync(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName());
	}

	public com.microsoft.azure.management.compute.implementation.GalleryImageVersionInner beginCreateOrUpdateGalleryImageVersions(com.github.wukong.azurevm.models.galleryImageVersions.BeginCreateOrUpdateRequest request) {
		return this.galleryImageVersions().beginCreateOrUpdate(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName(),request.getGalleryImageVersionName(),request.getGalleryImageVersion());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryImageVersionInner>>> listByGalleryImageSinglePageAsyncGalleryImageVersions(com.github.wukong.azurevm.models.galleryImageVersions.ListByGalleryImageSinglePageAsyncRequest request) {
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
