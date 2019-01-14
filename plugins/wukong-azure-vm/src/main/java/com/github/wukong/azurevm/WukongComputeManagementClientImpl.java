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
	
	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.UsageInner>>> listWithServiceResponseAsync(com.github.wukong.azurevm.models.usages.ListWithServiceResponseAsyncRequest request) {
		return this.usages().listWithServiceResponseAsync(request.getLocation());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.UsageInner>>> listNextWithServiceResponseAsync(com.github.wukong.azurevm.models.usages.ListNextWithServiceResponseAsyncRequest request) {
		return this.usages().listNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.UsageInner> listNext(com.github.wukong.azurevm.models.usages.ListNextRequest request) {
		return this.usages().listNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.UsageInner>> listNextAsync(com.github.wukong.azurevm.models.usages.ListNextAsyncRequest request) {
		return this.usages().listNextAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.UsageInner>>> listNextSinglePageAsync(com.github.wukong.azurevm.models.usages.ListNextSinglePageAsyncRequest request) {
		return this.usages().listNextSinglePageAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.UsageInner>>> listSinglePageAsync(com.github.wukong.azurevm.models.usages.ListSinglePageAsyncRequest request) {
		return this.usages().listSinglePageAsync(request.getLocation());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.UsageInner> list(com.github.wukong.azurevm.models.usages.ListRequest request) {
		return this.usages().list(request.getLocation());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.UsageInner>> listAsync(com.github.wukong.azurevm.models.usages.ListAsyncRequest request) {
		return this.usages().listAsync(request.getLocation());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.util.List<com.microsoft.azure.management.compute.implementation.ComputeOperationValueInner>>> listWithServiceResponseAsync(com.github.wukong.azurevm.models.operations.ListWithServiceResponseAsyncRequest request) {
		return this.operations().listWithServiceResponseAsync();
	}

	public java.util.List<com.microsoft.azure.management.compute.implementation.ComputeOperationValueInner> list(com.github.wukong.azurevm.models.operations.ListRequest request) {
		return this.operations().list();
	}

	public rx.Observable<java.util.List<com.microsoft.azure.management.compute.implementation.ComputeOperationValueInner>> listAsync(com.github.wukong.azurevm.models.operations.ListAsyncRequest request) {
		return this.operations().listAsync();
	}

	public com.microsoft.azure.management.compute.implementation.AvailabilitySetInner getByResourceGroup(com.github.wukong.azurevm.models.availabilitySets.GetByResourceGroupRequest request) {
		return this.availabilitySets().getByResourceGroup(request.getResourceGroupName(),request.getAvailabilitySetName());
	}

	public java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineSizeInner> listAvailableSizes(com.github.wukong.azurevm.models.availabilitySets.ListAvailableSizesRequest request) {
		return this.availabilitySets().listAvailableSizes(request.getResourceGroupName(),request.getAvailabilitySetName());
	}

	public com.microsoft.azure.management.compute.implementation.AvailabilitySetInner createOrUpdate(com.github.wukong.azurevm.models.availabilitySets.CreateOrUpdateRequest request) {
		return this.availabilitySets().createOrUpdate(request.getResourceGroupName(),request.getAvailabilitySetName(),request.getParameters());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.lang.Void>> deleteWithServiceResponseAsync(com.github.wukong.azurevm.models.availabilitySets.DeleteWithServiceResponseAsyncRequest request) {
		return this.availabilitySets().deleteWithServiceResponseAsync(request.getResourceGroupName(),request.getAvailabilitySetName());
	}

	public rx.Observable<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineSizeInner>> listAvailableSizesAsync(com.github.wukong.azurevm.models.availabilitySets.ListAvailableSizesAsyncRequest request) {
		return this.availabilitySets().listAvailableSizesAsync(request.getResourceGroupName(),request.getAvailabilitySetName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineSizeInner>>> listAvailableSizesWithServiceResponseAsync(com.github.wukong.azurevm.models.availabilitySets.ListAvailableSizesWithServiceResponseAsyncRequest request) {
		return this.availabilitySets().listAvailableSizesWithServiceResponseAsync(request.getResourceGroupName(),request.getAvailabilitySetName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.util.List<com.microsoft.azure.management.compute.implementation.AvailabilitySetInner>>> listByResourceGroupWithServiceResponseAsync(com.github.wukong.azurevm.models.availabilitySets.ListByResourceGroupWithServiceResponseAsyncRequest request) {
		return this.availabilitySets().listByResourceGroupWithServiceResponseAsync(request.getResourceGroupName());
	}

	public com.microsoft.azure.management.compute.implementation.AvailabilitySetInner update(com.github.wukong.azurevm.models.availabilitySets.UpdateRequest request) {
		return this.availabilitySets().update(request.getResourceGroupName(),request.getAvailabilitySetName(),request.getParameters());
	}

	public rx.Observable<java.lang.Void> deleteAsync(com.github.wukong.azurevm.models.availabilitySets.DeleteAsyncRequest request) {
		return this.availabilitySets().deleteAsync(request.getResourceGroupName(),request.getAvailabilitySetName());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.AvailabilitySetInner>> listByResourceGroupAsync(com.github.wukong.azurevm.models.availabilitySets.ListByResourceGroupAsyncRequest request) {
		return this.availabilitySets().listByResourceGroupAsync(request.getResourceGroupName());
	}

	public void delete(com.github.wukong.azurevm.models.availabilitySets.DeleteRequest request) {
		this.availabilitySets().delete(request.getResourceGroupName(),request.getAvailabilitySetName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.AvailabilitySetInner> listByResourceGroup(com.github.wukong.azurevm.models.availabilitySets.ListByResourceGroupRequest request) {
		return this.availabilitySets().listByResourceGroup(request.getResourceGroupName());
	}

	public java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionImageInner> listVersions(com.github.wukong.azurevm.models.virtualMachineExtensionImages.ListVersionsRequest request) {
		return this.virtualMachineExtensionImages().listVersions(request.getLocation(),request.getPublisherName(),request.getType());
	}

	public rx.Observable<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionImageInner>> listVersionsAsync(com.github.wukong.azurevm.models.virtualMachineExtensionImages.ListVersionsAsyncRequest request) {
		return this.virtualMachineExtensionImages().listVersionsAsync(request.getLocation(),request.getPublisherName(),request.getType());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionImageInner>>> listTypesWithServiceResponseAsync(com.github.wukong.azurevm.models.virtualMachineExtensionImages.ListTypesWithServiceResponseAsyncRequest request) {
		return this.virtualMachineExtensionImages().listTypesWithServiceResponseAsync(request.getLocation(),request.getPublisherName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionImageInner get(com.github.wukong.azurevm.models.virtualMachineExtensionImages.GetRequest request) {
		return this.virtualMachineExtensionImages().get(request.getLocation(),request.getPublisherName(),request.getType(),request.getVersion());
	}

	public java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionImageInner> listTypes(com.github.wukong.azurevm.models.virtualMachineExtensionImages.ListTypesRequest request) {
		return this.virtualMachineExtensionImages().listTypes(request.getLocation(),request.getPublisherName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionImageInner>>> listVersionsWithServiceResponseAsync(com.github.wukong.azurevm.models.virtualMachineExtensionImages.ListVersionsWithServiceResponseAsyncRequest request) {
		return this.virtualMachineExtensionImages().listVersionsWithServiceResponseAsync(request.getLocation(),request.getPublisherName(),request.getType());
	}

	public rx.Observable<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionImageInner>> listTypesAsync(com.github.wukong.azurevm.models.virtualMachineExtensionImages.ListTypesAsyncRequest request) {
		return this.virtualMachineExtensionImages().listTypesAsync(request.getLocation(),request.getPublisherName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionsListResultInner>> listWithServiceResponseAsync(com.github.wukong.azurevm.models.virtualMachineExtensions.ListWithServiceResponseAsyncRequest request) {
		return this.virtualMachineExtensions().listWithServiceResponseAsync(request.getResourceGroupName(),request.getVmName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionInner createOrUpdate(com.github.wukong.azurevm.models.virtualMachineExtensions.CreateOrUpdateRequest request) {
		return this.virtualMachineExtensions().createOrUpdate(request.getResourceGroupName(),request.getVmName(),request.getVmExtensionName(),request.getExtensionParameters());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.lang.Void>> deleteWithServiceResponseAsync(com.github.wukong.azurevm.models.virtualMachineExtensions.DeleteWithServiceResponseAsyncRequest request) {
		return this.virtualMachineExtensions().deleteWithServiceResponseAsync(request.getResourceGroupName(),request.getVmName(),request.getVmExtensionName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionInner get(com.github.wukong.azurevm.models.virtualMachineExtensions.GetRequest request) {
		return this.virtualMachineExtensions().get(request.getResourceGroupName(),request.getVmName(),request.getVmExtensionName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionInner update(com.github.wukong.azurevm.models.virtualMachineExtensions.UpdateRequest request) {
		return this.virtualMachineExtensions().update(request.getResourceGroupName(),request.getVmName(),request.getVmExtensionName(),request.getExtensionParameters());
	}

	public rx.Observable<java.lang.Void> deleteAsync(com.github.wukong.azurevm.models.virtualMachineExtensions.DeleteAsyncRequest request) {
		return this.virtualMachineExtensions().deleteAsync(request.getResourceGroupName(),request.getVmName(),request.getVmExtensionName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionInner beginCreateOrUpdate(com.github.wukong.azurevm.models.virtualMachineExtensions.BeginCreateOrUpdateRequest request) {
		return this.virtualMachineExtensions().beginCreateOrUpdate(request.getResourceGroupName(),request.getVmName(),request.getVmExtensionName(),request.getExtensionParameters());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionsListResultInner list(com.github.wukong.azurevm.models.virtualMachineExtensions.ListRequest request) {
		return this.virtualMachineExtensions().list(request.getResourceGroupName(),request.getVmName());
	}

	public rx.Observable<com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionsListResultInner> listAsync(com.github.wukong.azurevm.models.virtualMachineExtensions.ListAsyncRequest request) {
		return this.virtualMachineExtensions().listAsync(request.getResourceGroupName(),request.getVmName());
	}

	public void delete(com.github.wukong.azurevm.models.virtualMachineExtensions.DeleteRequest request) {
		this.virtualMachineExtensions().delete(request.getResourceGroupName(),request.getVmName(),request.getVmExtensionName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionInner beginUpdate(com.github.wukong.azurevm.models.virtualMachineExtensions.BeginUpdateRequest request) {
		return this.virtualMachineExtensions().beginUpdate(request.getResourceGroupName(),request.getVmName(),request.getVmExtensionName(),request.getExtensionParameters());
	}

	public java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineImageResourceInner> listSkus(com.github.wukong.azurevm.models.virtualMachineImages.ListSkusRequest request) {
		return this.virtualMachineImages().listSkus(request.getLocation(),request.getPublisherName(),request.getOffer());
	}

	public rx.Observable<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineImageResourceInner>> listPublishersAsync(com.github.wukong.azurevm.models.virtualMachineImages.ListPublishersAsyncRequest request) {
		return this.virtualMachineImages().listPublishersAsync(request.getLocation());
	}

	public rx.Observable<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineImageResourceInner>> listOffersAsync(com.github.wukong.azurevm.models.virtualMachineImages.ListOffersAsyncRequest request) {
		return this.virtualMachineImages().listOffersAsync(request.getLocation(),request.getPublisherName());
	}

	public java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineImageResourceInner> listPublishers(com.github.wukong.azurevm.models.virtualMachineImages.ListPublishersRequest request) {
		return this.virtualMachineImages().listPublishers(request.getLocation());
	}

	public java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineImageResourceInner> list(com.github.wukong.azurevm.models.virtualMachineImages.ListRequest request) {
		return this.virtualMachineImages().list(request.getLocation(),request.getPublisherName(),request.getOffer(),request.getSkus());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineImageResourceInner>>> listSkusWithServiceResponseAsync(com.github.wukong.azurevm.models.virtualMachineImages.ListSkusWithServiceResponseAsyncRequest request) {
		return this.virtualMachineImages().listSkusWithServiceResponseAsync(request.getLocation(),request.getPublisherName(),request.getOffer());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineImageResourceInner>>> listOffersWithServiceResponseAsync(com.github.wukong.azurevm.models.virtualMachineImages.ListOffersWithServiceResponseAsyncRequest request) {
		return this.virtualMachineImages().listOffersWithServiceResponseAsync(request.getLocation(),request.getPublisherName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineImageResourceInner>>> listWithServiceResponseAsync(com.github.wukong.azurevm.models.virtualMachineImages.ListWithServiceResponseAsyncRequest request) {
		return this.virtualMachineImages().listWithServiceResponseAsync(request.getLocation(),request.getPublisherName(),request.getOffer(),request.getSkus());
	}

	public java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineImageResourceInner> listOffers(com.github.wukong.azurevm.models.virtualMachineImages.ListOffersRequest request) {
		return this.virtualMachineImages().listOffers(request.getLocation(),request.getPublisherName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineImageInner get(com.github.wukong.azurevm.models.virtualMachineImages.GetRequest request) {
		return this.virtualMachineImages().get(request.getLocation(),request.getPublisherName(),request.getOffer(),request.getSkus(),request.getVersion());
	}

	public rx.Observable<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineImageResourceInner>> listAsync(com.github.wukong.azurevm.models.virtualMachineImages.ListAsyncRequest request) {
		return this.virtualMachineImages().listAsync(request.getLocation(),request.getPublisherName(),request.getOffer(),request.getSkus());
	}

	public rx.Observable<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineImageResourceInner>> listSkusAsync(com.github.wukong.azurevm.models.virtualMachineImages.ListSkusAsyncRequest request) {
		return this.virtualMachineImages().listSkusAsync(request.getLocation(),request.getPublisherName(),request.getOffer());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineImageResourceInner>>> listPublishersWithServiceResponseAsync(com.github.wukong.azurevm.models.virtualMachineImages.ListPublishersWithServiceResponseAsyncRequest request) {
		return this.virtualMachineImages().listPublishersWithServiceResponseAsync(request.getLocation());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineSizeInner>>> listWithServiceResponseAsync(com.github.wukong.azurevm.models.virtualMachineSizes.ListWithServiceResponseAsyncRequest request) {
		return this.virtualMachineSizes().listWithServiceResponseAsync(request.getLocation());
	}

	public java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineSizeInner> list(com.github.wukong.azurevm.models.virtualMachineSizes.ListRequest request) {
		return this.virtualMachineSizes().list(request.getLocation());
	}

	public rx.Observable<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineSizeInner>> listAsync(com.github.wukong.azurevm.models.virtualMachineSizes.ListAsyncRequest request) {
		return this.virtualMachineSizes().listAsync(request.getLocation());
	}

	public com.microsoft.azure.management.compute.implementation.ImageInner getByResourceGroup(com.github.wukong.azurevm.models.images.GetByResourceGroupRequest request) {
		return this.images().getByResourceGroup(request.getResourceGroupName(),request.getImageName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.ImageInner> listNext(com.github.wukong.azurevm.models.images.ListNextRequest request) {
		return this.images().listNext(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.ImageInner createOrUpdate(com.github.wukong.azurevm.models.images.CreateOrUpdateRequest request) {
		return this.images().createOrUpdate(request.getResourceGroupName(),request.getImageName(),request.getParameters());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.lang.Void>> deleteWithServiceResponseAsync(com.github.wukong.azurevm.models.images.DeleteWithServiceResponseAsyncRequest request) {
		return this.images().deleteWithServiceResponseAsync(request.getResourceGroupName(),request.getImageName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ImageInner>>> listNextSinglePageAsync(com.github.wukong.azurevm.models.images.ListNextSinglePageAsyncRequest request) {
		return this.images().listNextSinglePageAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ImageInner>>> listByResourceGroupWithServiceResponseAsync(com.github.wukong.azurevm.models.images.ListByResourceGroupWithServiceResponseAsyncRequest request) {
		return this.images().listByResourceGroupWithServiceResponseAsync(request.getResourceGroupName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ImageInner>>> listSinglePageAsync(com.github.wukong.azurevm.models.images.ListSinglePageAsyncRequest request) {
		return this.images().listSinglePageAsync();
	}

	public com.microsoft.azure.management.compute.implementation.ImageInner update(com.github.wukong.azurevm.models.images.UpdateRequest request) {
		return this.images().update(request.getResourceGroupName(),request.getImageName(),request.getParameters());
	}

	public rx.Observable<java.lang.Void> deleteAsync(com.github.wukong.azurevm.models.images.DeleteAsyncRequest request) {
		return this.images().deleteAsync(request.getResourceGroupName(),request.getImageName());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ImageInner>> listByResourceGroupAsync(com.github.wukong.azurevm.models.images.ListByResourceGroupAsyncRequest request) {
		return this.images().listByResourceGroupAsync(request.getResourceGroupName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.ImageInner> list(com.github.wukong.azurevm.models.images.ListRequest request) {
		return this.images().list();
	}

	public void delete(com.github.wukong.azurevm.models.images.DeleteRequest request) {
		this.images().delete(request.getResourceGroupName(),request.getImageName());
	}

	public com.microsoft.azure.management.compute.implementation.ImageInner beginUpdate(com.github.wukong.azurevm.models.images.BeginUpdateRequest request) {
		return this.images().beginUpdate(request.getResourceGroupName(),request.getImageName(),request.getParameters());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.ImageInner> listByResourceGroup(com.github.wukong.azurevm.models.images.ListByResourceGroupRequest request) {
		return this.images().listByResourceGroup(request.getResourceGroupName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ImageInner>>> listWithServiceResponseAsync(com.github.wukong.azurevm.models.images.ListWithServiceResponseAsyncRequest request) {
		return this.images().listWithServiceResponseAsync();
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ImageInner>>> listNextWithServiceResponseAsync(com.github.wukong.azurevm.models.images.ListNextWithServiceResponseAsyncRequest request) {
		return this.images().listNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ImageInner>> listNextAsync(com.github.wukong.azurevm.models.images.ListNextAsyncRequest request) {
		return this.images().listNextAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ImageInner>> listByResourceGroupNextAsync(com.github.wukong.azurevm.models.images.ListByResourceGroupNextAsyncRequest request) {
		return this.images().listByResourceGroupNextAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.ImageInner> listByResourceGroupNext(com.github.wukong.azurevm.models.images.ListByResourceGroupNextRequest request) {
		return this.images().listByResourceGroupNext(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.ImageInner beginCreateOrUpdate(com.github.wukong.azurevm.models.images.BeginCreateOrUpdateRequest request) {
		return this.images().beginCreateOrUpdate(request.getResourceGroupName(),request.getImageName(),request.getParameters());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ImageInner>> listAsync(com.github.wukong.azurevm.models.images.ListAsyncRequest request) {
		return this.images().listAsync();
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ImageInner>>> listByResourceGroupNextWithServiceResponseAsync(com.github.wukong.azurevm.models.images.ListByResourceGroupNextWithServiceResponseAsyncRequest request) {
		return this.images().listByResourceGroupNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ImageInner>>> listByResourceGroupSinglePageAsync(com.github.wukong.azurevm.models.images.ListByResourceGroupSinglePageAsyncRequest request) {
		return this.images().listByResourceGroupSinglePageAsync(request.getResourceGroupName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ImageInner>>> listByResourceGroupNextSinglePageAsync(com.github.wukong.azurevm.models.images.ListByResourceGroupNextSinglePageAsyncRequest request) {
		return this.images().listByResourceGroupNextSinglePageAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineInner> listNext(com.github.wukong.azurevm.models.virtualMachines.ListNextRequest request) {
		return this.virtualMachines().listNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineInner>>> listNextSinglePageAsync(com.github.wukong.azurevm.models.virtualMachines.ListNextSinglePageAsyncRequest request) {
		return this.virtualMachines().listNextSinglePageAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineInner>>> listByResourceGroupWithServiceResponseAsync(com.github.wukong.azurevm.models.virtualMachines.ListByResourceGroupWithServiceResponseAsyncRequest request) {
		return this.virtualMachines().listByResourceGroupWithServiceResponseAsync(request.getResourceGroupName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineInner update(com.github.wukong.azurevm.models.virtualMachines.UpdateRequest request) {
		return this.virtualMachines().update(request.getResourceGroupName(),request.getVmName(),request.getParameters());
	}

	public void delete(com.github.wukong.azurevm.models.virtualMachines.DeleteRequest request) {
		this.virtualMachines().delete(request.getResourceGroupName(),request.getVmName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineInner> listByResourceGroup(com.github.wukong.azurevm.models.virtualMachines.ListByResourceGroupRequest request) {
		return this.virtualMachines().listByResourceGroup(request.getResourceGroupName());
	}

	public java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineSizeInner> listAvailableSizes(com.github.wukong.azurevm.models.virtualMachines.ListAvailableSizesRequest request) {
		return this.virtualMachines().listAvailableSizes(request.getResourceGroupName(),request.getVmName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineInner>>> listNextWithServiceResponseAsync(com.github.wukong.azurevm.models.virtualMachines.ListNextWithServiceResponseAsyncRequest request) {
		return this.virtualMachines().listNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineInner>> listByResourceGroupNextAsync(com.github.wukong.azurevm.models.virtualMachines.ListByResourceGroupNextAsyncRequest request) {
		return this.virtualMachines().listByResourceGroupNextAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineSizeInner>>> listAvailableSizesWithServiceResponseAsync(com.github.wukong.azurevm.models.virtualMachines.ListAvailableSizesWithServiceResponseAsyncRequest request) {
		return this.virtualMachines().listAvailableSizesWithServiceResponseAsync(request.getResourceGroupName(),request.getVmName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineInner> listByResourceGroupNext(com.github.wukong.azurevm.models.virtualMachines.ListByResourceGroupNextRequest request) {
		return this.virtualMachines().listByResourceGroupNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineInner>> listAsync(com.github.wukong.azurevm.models.virtualMachines.ListAsyncRequest request) {
		return this.virtualMachines().listAsync();
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineCaptureResultInner beginCapture(com.github.wukong.azurevm.models.virtualMachines.BeginCaptureRequest request) {
		return this.virtualMachines().beginCapture(request.getResourceGroupName(),request.getVmName(),request.getParameters());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineInner>>> listByResourceGroupSinglePageAsync(com.github.wukong.azurevm.models.virtualMachines.ListByResourceGroupSinglePageAsyncRequest request) {
		return this.virtualMachines().listByResourceGroupSinglePageAsync(request.getResourceGroupName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineInner>>> listByResourceGroupNextSinglePageAsync(com.github.wukong.azurevm.models.virtualMachines.ListByResourceGroupNextSinglePageAsyncRequest request) {
		return this.virtualMachines().listByResourceGroupNextSinglePageAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineInner getByResourceGroup(com.github.wukong.azurevm.models.virtualMachines.GetByResourceGroupRequest request) {
		return this.virtualMachines().getByResourceGroup(request.getResourceGroupName(),request.getVmName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineInner createOrUpdate(com.github.wukong.azurevm.models.virtualMachines.CreateOrUpdateRequest request) {
		return this.virtualMachines().createOrUpdate(request.getResourceGroupName(),request.getVmName(),request.getParameters());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.lang.Void>> deleteWithServiceResponseAsync(com.github.wukong.azurevm.models.virtualMachines.DeleteWithServiceResponseAsyncRequest request) {
		return this.virtualMachines().deleteWithServiceResponseAsync(request.getResourceGroupName(),request.getVmName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineInner>>> listSinglePageAsync(com.github.wukong.azurevm.models.virtualMachines.ListSinglePageAsyncRequest request) {
		return this.virtualMachines().listSinglePageAsync();
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineCaptureResultInner capture(com.github.wukong.azurevm.models.virtualMachines.CaptureRequest request) {
		return this.virtualMachines().capture(request.getResourceGroupName(),request.getVmName(),request.getParameters());
	}

	public rx.Observable<java.lang.Void> deleteAsync(com.github.wukong.azurevm.models.virtualMachines.DeleteAsyncRequest request) {
		return this.virtualMachines().deleteAsync(request.getResourceGroupName(),request.getVmName());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineInner>> listByResourceGroupAsync(com.github.wukong.azurevm.models.virtualMachines.ListByResourceGroupAsyncRequest request) {
		return this.virtualMachines().listByResourceGroupAsync(request.getResourceGroupName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineInner> list(com.github.wukong.azurevm.models.virtualMachines.ListRequest request) {
		return this.virtualMachines().list();
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineInner beginUpdate(com.github.wukong.azurevm.models.virtualMachines.BeginUpdateRequest request) {
		return this.virtualMachines().beginUpdate(request.getResourceGroupName(),request.getVmName(),request.getParameters());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineInner>>> listWithServiceResponseAsync(com.github.wukong.azurevm.models.virtualMachines.ListWithServiceResponseAsyncRequest request) {
		return this.virtualMachines().listWithServiceResponseAsync();
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineInner>> listNextAsync(com.github.wukong.azurevm.models.virtualMachines.ListNextAsyncRequest request) {
		return this.virtualMachines().listNextAsync(request.getNextPageLink());
	}

	public rx.Observable<java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineSizeInner>> listAvailableSizesAsync(com.github.wukong.azurevm.models.virtualMachines.ListAvailableSizesAsyncRequest request) {
		return this.virtualMachines().listAvailableSizesAsync(request.getResourceGroupName(),request.getVmName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineInner beginCreateOrUpdate(com.github.wukong.azurevm.models.virtualMachines.BeginCreateOrUpdateRequest request) {
		return this.virtualMachines().beginCreateOrUpdate(request.getResourceGroupName(),request.getVmName(),request.getParameters());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineInner>>> listByResourceGroupNextWithServiceResponseAsync(com.github.wukong.azurevm.models.virtualMachines.ListByResourceGroupNextWithServiceResponseAsyncRequest request) {
		return this.virtualMachines().listByResourceGroupNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetSkuInner> listSkus(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListSkusRequest request) {
		return this.virtualMachineScaleSets().listSkus(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner> listNext(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListNextRequest request) {
		return this.virtualMachineScaleSets().listNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner>>> listNextSinglePageAsync(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListNextSinglePageAsyncRequest request) {
		return this.virtualMachineScaleSets().listNextSinglePageAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner>>> listByResourceGroupWithServiceResponseAsync(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListByResourceGroupWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSets().listByResourceGroupWithServiceResponseAsync(request.getResourceGroupName());
	}

	public void deleteInstances(com.github.wukong.azurevm.models.virtualMachineScaleSets.DeleteInstancesRequest request) {
		this.virtualMachineScaleSets().deleteInstances(request.getResourceGroupName(),request.getVmScaleSetName(),request.getInstanceIds());
	}

	public com.microsoft.azure.management.compute.implementation.RecoveryWalkResponseInner forceRecoveryServiceFabricPlatformUpdateDomainWalk(com.github.wukong.azurevm.models.virtualMachineScaleSets.ForceRecoveryServiceFabricPlatformUpdateDomainWalkRequest request) {
		return this.virtualMachineScaleSets().forceRecoveryServiceFabricPlatformUpdateDomainWalk(request.getResourceGroupName(),request.getVmScaleSetName(),request.getPlatformUpdateDomain());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner update(com.github.wukong.azurevm.models.virtualMachineScaleSets.UpdateRequest request) {
		return this.virtualMachineScaleSets().update(request.getResourceGroupName(),request.getVmScaleSetName(),request.getParameters());
	}

	public void delete(com.github.wukong.azurevm.models.virtualMachineScaleSets.DeleteRequest request) {
		this.virtualMachineScaleSets().delete(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner> listByResourceGroup(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListByResourceGroupRequest request) {
		return this.virtualMachineScaleSets().listByResourceGroup(request.getResourceGroupName());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetSkuInner>> listSkusNextAsync(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListSkusNextAsyncRequest request) {
		return this.virtualMachineScaleSets().listSkusNextAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.lang.Void>> deleteInstancesWithServiceResponseAsync(com.github.wukong.azurevm.models.virtualMachineScaleSets.DeleteInstancesWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSets().deleteInstancesWithServiceResponseAsync(request.getResourceGroupName(),request.getVmScaleSetName(),request.getInstanceIds());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner>>> listNextWithServiceResponseAsync(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListNextWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSets().listNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner>> listByResourceGroupNextAsync(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListByResourceGroupNextAsyncRequest request) {
		return this.virtualMachineScaleSets().listByResourceGroupNextAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner> listByResourceGroupNext(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListByResourceGroupNextRequest request) {
		return this.virtualMachineScaleSets().listByResourceGroupNext(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetSkuInner> listSkusNext(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListSkusNextRequest request) {
		return this.virtualMachineScaleSets().listSkusNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner>> listAsync(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListAsyncRequest request) {
		return this.virtualMachineScaleSets().listAsync();
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetSkuInner>> listSkusAsync(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListSkusAsyncRequest request) {
		return this.virtualMachineScaleSets().listSkusAsync(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner>>> listByResourceGroupSinglePageAsync(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListByResourceGroupSinglePageAsyncRequest request) {
		return this.virtualMachineScaleSets().listByResourceGroupSinglePageAsync(request.getResourceGroupName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner>>> listByResourceGroupNextSinglePageAsync(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListByResourceGroupNextSinglePageAsyncRequest request) {
		return this.virtualMachineScaleSets().listByResourceGroupNextSinglePageAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner getByResourceGroup(com.github.wukong.azurevm.models.virtualMachineScaleSets.GetByResourceGroupRequest request) {
		return this.virtualMachineScaleSets().getByResourceGroup(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner createOrUpdate(com.github.wukong.azurevm.models.virtualMachineScaleSets.CreateOrUpdateRequest request) {
		return this.virtualMachineScaleSets().createOrUpdate(request.getResourceGroupName(),request.getVmScaleSetName(),request.getParameters());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.lang.Void>> deleteWithServiceResponseAsync(com.github.wukong.azurevm.models.virtualMachineScaleSets.DeleteWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSets().deleteWithServiceResponseAsync(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public rx.Observable<java.lang.Void> deleteInstancesAsync(com.github.wukong.azurevm.models.virtualMachineScaleSets.DeleteInstancesAsyncRequest request) {
		return this.virtualMachineScaleSets().deleteInstancesAsync(request.getResourceGroupName(),request.getVmScaleSetName(),request.getInstanceIds());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner>>> listSinglePageAsync(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListSinglePageAsyncRequest request) {
		return this.virtualMachineScaleSets().listSinglePageAsync();
	}

	public rx.Observable<java.lang.Void> deleteAsync(com.github.wukong.azurevm.models.virtualMachineScaleSets.DeleteAsyncRequest request) {
		return this.virtualMachineScaleSets().deleteAsync(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInstanceViewInner getInstanceView(com.github.wukong.azurevm.models.virtualMachineScaleSets.GetInstanceViewRequest request) {
		return this.virtualMachineScaleSets().getInstanceView(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner>> listByResourceGroupAsync(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListByResourceGroupAsyncRequest request) {
		return this.virtualMachineScaleSets().listByResourceGroupAsync(request.getResourceGroupName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner> list(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListRequest request) {
		return this.virtualMachineScaleSets().list();
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetSkuInner>>> listSkusNextSinglePageAsync(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListSkusNextSinglePageAsyncRequest request) {
		return this.virtualMachineScaleSets().listSkusNextSinglePageAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner beginUpdate(com.github.wukong.azurevm.models.virtualMachineScaleSets.BeginUpdateRequest request) {
		return this.virtualMachineScaleSets().beginUpdate(request.getResourceGroupName(),request.getVmScaleSetName(),request.getParameters());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetSkuInner>>> listSkusWithServiceResponseAsync(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListSkusWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSets().listSkusWithServiceResponseAsync(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner>>> listWithServiceResponseAsync(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSets().listWithServiceResponseAsync();
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetSkuInner>>> listSkusSinglePageAsync(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListSkusSinglePageAsyncRequest request) {
		return this.virtualMachineScaleSets().listSkusSinglePageAsync(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner>> listNextAsync(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListNextAsyncRequest request) {
		return this.virtualMachineScaleSets().listNextAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner beginCreateOrUpdate(com.github.wukong.azurevm.models.virtualMachineScaleSets.BeginCreateOrUpdateRequest request) {
		return this.virtualMachineScaleSets().beginCreateOrUpdate(request.getResourceGroupName(),request.getVmScaleSetName(),request.getParameters());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner>>> listByResourceGroupNextWithServiceResponseAsync(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListByResourceGroupNextWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSets().listByResourceGroupNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetSkuInner>>> listSkusNextWithServiceResponseAsync(com.github.wukong.azurevm.models.virtualMachineScaleSets.ListSkusNextWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSets().listSkusNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner> listNext(com.github.wukong.azurevm.models.virtualMachineScaleSetExtensions.ListNextRequest request) {
		return this.virtualMachineScaleSetExtensions().listNext(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner createOrUpdate(com.github.wukong.azurevm.models.virtualMachineScaleSetExtensions.CreateOrUpdateRequest request) {
		return this.virtualMachineScaleSetExtensions().createOrUpdate(request.getResourceGroupName(),request.getVmScaleSetName(),request.getVmssExtensionName(),request.getExtensionParameters());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.lang.Void>> deleteWithServiceResponseAsync(com.github.wukong.azurevm.models.virtualMachineScaleSetExtensions.DeleteWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSetExtensions().deleteWithServiceResponseAsync(request.getResourceGroupName(),request.getVmScaleSetName(),request.getVmssExtensionName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner>>> listNextSinglePageAsync(com.github.wukong.azurevm.models.virtualMachineScaleSetExtensions.ListNextSinglePageAsyncRequest request) {
		return this.virtualMachineScaleSetExtensions().listNextSinglePageAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner>>> listSinglePageAsync(com.github.wukong.azurevm.models.virtualMachineScaleSetExtensions.ListSinglePageAsyncRequest request) {
		return this.virtualMachineScaleSetExtensions().listSinglePageAsync(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public rx.Observable<java.lang.Void> deleteAsync(com.github.wukong.azurevm.models.virtualMachineScaleSetExtensions.DeleteAsyncRequest request) {
		return this.virtualMachineScaleSetExtensions().deleteAsync(request.getResourceGroupName(),request.getVmScaleSetName(),request.getVmssExtensionName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner> list(com.github.wukong.azurevm.models.virtualMachineScaleSetExtensions.ListRequest request) {
		return this.virtualMachineScaleSetExtensions().list(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public void delete(com.github.wukong.azurevm.models.virtualMachineScaleSetExtensions.DeleteRequest request) {
		this.virtualMachineScaleSetExtensions().delete(request.getResourceGroupName(),request.getVmScaleSetName(),request.getVmssExtensionName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner>>> listWithServiceResponseAsync(com.github.wukong.azurevm.models.virtualMachineScaleSetExtensions.ListWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSetExtensions().listWithServiceResponseAsync(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner>>> listNextWithServiceResponseAsync(com.github.wukong.azurevm.models.virtualMachineScaleSetExtensions.ListNextWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSetExtensions().listNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner>> listNextAsync(com.github.wukong.azurevm.models.virtualMachineScaleSetExtensions.ListNextAsyncRequest request) {
		return this.virtualMachineScaleSetExtensions().listNextAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner get(com.github.wukong.azurevm.models.virtualMachineScaleSetExtensions.GetRequest request) {
		return this.virtualMachineScaleSetExtensions().get(request.getResourceGroupName(),request.getVmScaleSetName(),request.getVmssExtensionName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner beginCreateOrUpdate(com.github.wukong.azurevm.models.virtualMachineScaleSetExtensions.BeginCreateOrUpdateRequest request) {
		return this.virtualMachineScaleSetExtensions().beginCreateOrUpdate(request.getResourceGroupName(),request.getVmScaleSetName(),request.getVmssExtensionName(),request.getExtensionParameters());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner>> listAsync(com.github.wukong.azurevm.models.virtualMachineScaleSetExtensions.ListAsyncRequest request) {
		return this.virtualMachineScaleSetExtensions().listAsync(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public com.microsoft.azure.management.compute.implementation.RollingUpgradeStatusInfoInner getLatest(com.github.wukong.azurevm.models.virtualMachineScaleSetRollingUpgrades.GetLatestRequest request) {
		return this.virtualMachineScaleSetRollingUpgrades().getLatest(request.getResourceGroupName(),request.getVmScaleSetName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInner> listNext(com.github.wukong.azurevm.models.virtualMachineScaleSetVMs.ListNextRequest request) {
		return this.virtualMachineScaleSetVMs().listNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.lang.Void>> deleteWithServiceResponseAsync(com.github.wukong.azurevm.models.virtualMachineScaleSetVMs.DeleteWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSetVMs().deleteWithServiceResponseAsync(request.getResourceGroupName(),request.getVmScaleSetName(),request.getInstanceId());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInner>>> listNextSinglePageAsync(com.github.wukong.azurevm.models.virtualMachineScaleSetVMs.ListNextSinglePageAsyncRequest request) {
		return this.virtualMachineScaleSetVMs().listNextSinglePageAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInner>>> listSinglePageAsync(com.github.wukong.azurevm.models.virtualMachineScaleSetVMs.ListSinglePageAsyncRequest request) {
		return this.virtualMachineScaleSetVMs().listSinglePageAsync(request.getResourceGroupName(),request.getVirtualMachineScaleSetName());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInner update(com.github.wukong.azurevm.models.virtualMachineScaleSetVMs.UpdateRequest request) {
		return this.virtualMachineScaleSetVMs().update(request.getResourceGroupName(),request.getVmScaleSetName(),request.getInstanceId(),request.getParameters());
	}

	public rx.Observable<java.lang.Void> deleteAsync(com.github.wukong.azurevm.models.virtualMachineScaleSetVMs.DeleteAsyncRequest request) {
		return this.virtualMachineScaleSetVMs().deleteAsync(request.getResourceGroupName(),request.getVmScaleSetName(),request.getInstanceId());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInstanceViewInner getInstanceView(com.github.wukong.azurevm.models.virtualMachineScaleSetVMs.GetInstanceViewRequest request) {
		return this.virtualMachineScaleSetVMs().getInstanceView(request.getResourceGroupName(),request.getVmScaleSetName(),request.getInstanceId());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInner> list(com.github.wukong.azurevm.models.virtualMachineScaleSetVMs.ListRequest request) {
		return this.virtualMachineScaleSetVMs().list(request.getResourceGroupName(),request.getVirtualMachineScaleSetName());
	}

	public void delete(com.github.wukong.azurevm.models.virtualMachineScaleSetVMs.DeleteRequest request) {
		this.virtualMachineScaleSetVMs().delete(request.getResourceGroupName(),request.getVmScaleSetName(),request.getInstanceId());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInner beginUpdate(com.github.wukong.azurevm.models.virtualMachineScaleSetVMs.BeginUpdateRequest request) {
		return this.virtualMachineScaleSetVMs().beginUpdate(request.getResourceGroupName(),request.getVmScaleSetName(),request.getInstanceId(),request.getParameters());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInner>>> listWithServiceResponseAsync(com.github.wukong.azurevm.models.virtualMachineScaleSetVMs.ListWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSetVMs().listWithServiceResponseAsync(request.getResourceGroupName(),request.getVirtualMachineScaleSetName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInner>>> listNextWithServiceResponseAsync(com.github.wukong.azurevm.models.virtualMachineScaleSetVMs.ListNextWithServiceResponseAsyncRequest request) {
		return this.virtualMachineScaleSetVMs().listNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInner>> listNextAsync(com.github.wukong.azurevm.models.virtualMachineScaleSetVMs.ListNextAsyncRequest request) {
		return this.virtualMachineScaleSetVMs().listNextAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInner get(com.github.wukong.azurevm.models.virtualMachineScaleSetVMs.GetRequest request) {
		return this.virtualMachineScaleSetVMs().get(request.getResourceGroupName(),request.getVmScaleSetName(),request.getInstanceId());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInner>> listAsync(com.github.wukong.azurevm.models.virtualMachineScaleSetVMs.ListAsyncRequest request) {
		return this.virtualMachineScaleSetVMs().listAsync(request.getResourceGroupName(),request.getVirtualMachineScaleSetName());
	}

	public com.microsoft.azure.management.compute.implementation.LogAnalyticsOperationResultInner beginExportThrottledRequests(com.github.wukong.azurevm.models.logAnalytics.BeginExportThrottledRequestsRequest request) {
		return this.logAnalytics().beginExportThrottledRequests(request.getLocation(),request.getParameters());
	}

	public com.microsoft.azure.management.compute.implementation.LogAnalyticsOperationResultInner exportRequestRateByInterval(com.github.wukong.azurevm.models.logAnalytics.ExportRequestRateByIntervalRequest request) {
		return this.logAnalytics().exportRequestRateByInterval(request.getLocation(),request.getParameters());
	}

	public com.microsoft.azure.management.compute.implementation.LogAnalyticsOperationResultInner exportThrottledRequests(com.github.wukong.azurevm.models.logAnalytics.ExportThrottledRequestsRequest request) {
		return this.logAnalytics().exportThrottledRequests(request.getLocation(),request.getParameters());
	}

	public com.microsoft.azure.management.compute.implementation.LogAnalyticsOperationResultInner beginExportRequestRateByInterval(com.github.wukong.azurevm.models.logAnalytics.BeginExportRequestRateByIntervalRequest request) {
		return this.logAnalytics().beginExportRequestRateByInterval(request.getLocation(),request.getParameters());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.RunCommandDocumentBaseInner>>> listWithServiceResponseAsync(com.github.wukong.azurevm.models.virtualMachineRunCommands.ListWithServiceResponseAsyncRequest request) {
		return this.virtualMachineRunCommands().listWithServiceResponseAsync(request.getLocation());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.RunCommandDocumentBaseInner>>> listNextWithServiceResponseAsync(com.github.wukong.azurevm.models.virtualMachineRunCommands.ListNextWithServiceResponseAsyncRequest request) {
		return this.virtualMachineRunCommands().listNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.RunCommandDocumentBaseInner> listNext(com.github.wukong.azurevm.models.virtualMachineRunCommands.ListNextRequest request) {
		return this.virtualMachineRunCommands().listNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.RunCommandDocumentBaseInner>> listNextAsync(com.github.wukong.azurevm.models.virtualMachineRunCommands.ListNextAsyncRequest request) {
		return this.virtualMachineRunCommands().listNextAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.RunCommandDocumentBaseInner>>> listNextSinglePageAsync(com.github.wukong.azurevm.models.virtualMachineRunCommands.ListNextSinglePageAsyncRequest request) {
		return this.virtualMachineRunCommands().listNextSinglePageAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.RunCommandDocumentInner get(com.github.wukong.azurevm.models.virtualMachineRunCommands.GetRequest request) {
		return this.virtualMachineRunCommands().get(request.getLocation(),request.getCommandId());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.RunCommandDocumentBaseInner>>> listSinglePageAsync(com.github.wukong.azurevm.models.virtualMachineRunCommands.ListSinglePageAsyncRequest request) {
		return this.virtualMachineRunCommands().listSinglePageAsync(request.getLocation());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.RunCommandDocumentBaseInner> list(com.github.wukong.azurevm.models.virtualMachineRunCommands.ListRequest request) {
		return this.virtualMachineRunCommands().list(request.getLocation());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.RunCommandDocumentBaseInner>> listAsync(com.github.wukong.azurevm.models.virtualMachineRunCommands.ListAsyncRequest request) {
		return this.virtualMachineRunCommands().listAsync(request.getLocation());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ResourceSkuInner>>> listWithServiceResponseAsync(com.github.wukong.azurevm.models.resourceSkus.ListWithServiceResponseAsyncRequest request) {
		return this.resourceSkus().listWithServiceResponseAsync();
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ResourceSkuInner>>> listNextWithServiceResponseAsync(com.github.wukong.azurevm.models.resourceSkus.ListNextWithServiceResponseAsyncRequest request) {
		return this.resourceSkus().listNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.ResourceSkuInner> listNext(com.github.wukong.azurevm.models.resourceSkus.ListNextRequest request) {
		return this.resourceSkus().listNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ResourceSkuInner>> listNextAsync(com.github.wukong.azurevm.models.resourceSkus.ListNextAsyncRequest request) {
		return this.resourceSkus().listNextAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ResourceSkuInner>>> listNextSinglePageAsync(com.github.wukong.azurevm.models.resourceSkus.ListNextSinglePageAsyncRequest request) {
		return this.resourceSkus().listNextSinglePageAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ResourceSkuInner>>> listSinglePageAsync(com.github.wukong.azurevm.models.resourceSkus.ListSinglePageAsyncRequest request) {
		return this.resourceSkus().listSinglePageAsync();
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.ResourceSkuInner> list(com.github.wukong.azurevm.models.resourceSkus.ListRequest request) {
		return this.resourceSkus().list();
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.ResourceSkuInner>> listAsync(com.github.wukong.azurevm.models.resourceSkus.ListAsyncRequest request) {
		return this.resourceSkus().listAsync();
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.DiskInner> listNext(com.github.wukong.azurevm.models.disks.ListNextRequest request) {
		return this.disks().listNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.DiskInner>>> listNextSinglePageAsync(com.github.wukong.azurevm.models.disks.ListNextSinglePageAsyncRequest request) {
		return this.disks().listNextSinglePageAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.DiskInner>>> listByResourceGroupWithServiceResponseAsync(com.github.wukong.azurevm.models.disks.ListByResourceGroupWithServiceResponseAsyncRequest request) {
		return this.disks().listByResourceGroupWithServiceResponseAsync(request.getResourceGroupName());
	}

	public com.microsoft.azure.management.compute.implementation.DiskInner update(com.github.wukong.azurevm.models.disks.UpdateRequest request) {
		return this.disks().update(request.getResourceGroupName(),request.getDiskName(),request.getDisk());
	}

	public void delete(com.github.wukong.azurevm.models.disks.DeleteRequest request) {
		this.disks().delete(request.getResourceGroupName(),request.getDiskName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.DiskInner> listByResourceGroup(com.github.wukong.azurevm.models.disks.ListByResourceGroupRequest request) {
		return this.disks().listByResourceGroup(request.getResourceGroupName());
	}

	public com.microsoft.azure.management.compute.implementation.AccessUriInner beginGrantAccess(com.github.wukong.azurevm.models.disks.BeginGrantAccessRequest request) {
		return this.disks().beginGrantAccess(request.getResourceGroupName(),request.getDiskName(),request.getGrantAccessData());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.DiskInner>>> listNextWithServiceResponseAsync(com.github.wukong.azurevm.models.disks.ListNextWithServiceResponseAsyncRequest request) {
		return this.disks().listNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.DiskInner>> listByResourceGroupNextAsync(com.github.wukong.azurevm.models.disks.ListByResourceGroupNextAsyncRequest request) {
		return this.disks().listByResourceGroupNextAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.DiskInner> listByResourceGroupNext(com.github.wukong.azurevm.models.disks.ListByResourceGroupNextRequest request) {
		return this.disks().listByResourceGroupNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.DiskInner>> listAsync(com.github.wukong.azurevm.models.disks.ListAsyncRequest request) {
		return this.disks().listAsync();
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.DiskInner>>> listByResourceGroupSinglePageAsync(com.github.wukong.azurevm.models.disks.ListByResourceGroupSinglePageAsyncRequest request) {
		return this.disks().listByResourceGroupSinglePageAsync(request.getResourceGroupName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.DiskInner>>> listByResourceGroupNextSinglePageAsync(com.github.wukong.azurevm.models.disks.ListByResourceGroupNextSinglePageAsyncRequest request) {
		return this.disks().listByResourceGroupNextSinglePageAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.DiskInner getByResourceGroup(com.github.wukong.azurevm.models.disks.GetByResourceGroupRequest request) {
		return this.disks().getByResourceGroup(request.getResourceGroupName(),request.getDiskName());
	}

	public com.microsoft.azure.management.compute.implementation.DiskInner createOrUpdate(com.github.wukong.azurevm.models.disks.CreateOrUpdateRequest request) {
		return this.disks().createOrUpdate(request.getResourceGroupName(),request.getDiskName(),request.getDisk());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.lang.Void>> deleteWithServiceResponseAsync(com.github.wukong.azurevm.models.disks.DeleteWithServiceResponseAsyncRequest request) {
		return this.disks().deleteWithServiceResponseAsync(request.getResourceGroupName(),request.getDiskName());
	}

	public com.microsoft.azure.management.compute.implementation.AccessUriInner grantAccess(com.github.wukong.azurevm.models.disks.GrantAccessRequest request) {
		return this.disks().grantAccess(request.getResourceGroupName(),request.getDiskName(),request.getGrantAccessData());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.DiskInner>>> listSinglePageAsync(com.github.wukong.azurevm.models.disks.ListSinglePageAsyncRequest request) {
		return this.disks().listSinglePageAsync();
	}

	public rx.Observable<java.lang.Void> deleteAsync(com.github.wukong.azurevm.models.disks.DeleteAsyncRequest request) {
		return this.disks().deleteAsync(request.getResourceGroupName(),request.getDiskName());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.DiskInner>> listByResourceGroupAsync(com.github.wukong.azurevm.models.disks.ListByResourceGroupAsyncRequest request) {
		return this.disks().listByResourceGroupAsync(request.getResourceGroupName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.DiskInner> list(com.github.wukong.azurevm.models.disks.ListRequest request) {
		return this.disks().list();
	}

	public com.microsoft.azure.management.compute.implementation.DiskInner beginUpdate(com.github.wukong.azurevm.models.disks.BeginUpdateRequest request) {
		return this.disks().beginUpdate(request.getResourceGroupName(),request.getDiskName(),request.getDisk());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.DiskInner>>> listWithServiceResponseAsync(com.github.wukong.azurevm.models.disks.ListWithServiceResponseAsyncRequest request) {
		return this.disks().listWithServiceResponseAsync();
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.DiskInner>> listNextAsync(com.github.wukong.azurevm.models.disks.ListNextAsyncRequest request) {
		return this.disks().listNextAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.DiskInner beginCreateOrUpdate(com.github.wukong.azurevm.models.disks.BeginCreateOrUpdateRequest request) {
		return this.disks().beginCreateOrUpdate(request.getResourceGroupName(),request.getDiskName(),request.getDisk());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.DiskInner>>> listByResourceGroupNextWithServiceResponseAsync(com.github.wukong.azurevm.models.disks.ListByResourceGroupNextWithServiceResponseAsyncRequest request) {
		return this.disks().listByResourceGroupNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.SnapshotInner> listNext(com.github.wukong.azurevm.models.snapshots.ListNextRequest request) {
		return this.snapshots().listNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.SnapshotInner>>> listNextSinglePageAsync(com.github.wukong.azurevm.models.snapshots.ListNextSinglePageAsyncRequest request) {
		return this.snapshots().listNextSinglePageAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.SnapshotInner>>> listByResourceGroupWithServiceResponseAsync(com.github.wukong.azurevm.models.snapshots.ListByResourceGroupWithServiceResponseAsyncRequest request) {
		return this.snapshots().listByResourceGroupWithServiceResponseAsync(request.getResourceGroupName());
	}

	public com.microsoft.azure.management.compute.implementation.SnapshotInner update(com.github.wukong.azurevm.models.snapshots.UpdateRequest request) {
		return this.snapshots().update(request.getResourceGroupName(),request.getSnapshotName(),request.getSnapshot());
	}

	public void delete(com.github.wukong.azurevm.models.snapshots.DeleteRequest request) {
		this.snapshots().delete(request.getResourceGroupName(),request.getSnapshotName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.SnapshotInner> listByResourceGroup(com.github.wukong.azurevm.models.snapshots.ListByResourceGroupRequest request) {
		return this.snapshots().listByResourceGroup(request.getResourceGroupName());
	}

	public com.microsoft.azure.management.compute.implementation.AccessUriInner beginGrantAccess(com.github.wukong.azurevm.models.snapshots.BeginGrantAccessRequest request) {
		return this.snapshots().beginGrantAccess(request.getResourceGroupName(),request.getSnapshotName(),request.getGrantAccessData());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.SnapshotInner>>> listNextWithServiceResponseAsync(com.github.wukong.azurevm.models.snapshots.ListNextWithServiceResponseAsyncRequest request) {
		return this.snapshots().listNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.SnapshotInner>> listByResourceGroupNextAsync(com.github.wukong.azurevm.models.snapshots.ListByResourceGroupNextAsyncRequest request) {
		return this.snapshots().listByResourceGroupNextAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.SnapshotInner> listByResourceGroupNext(com.github.wukong.azurevm.models.snapshots.ListByResourceGroupNextRequest request) {
		return this.snapshots().listByResourceGroupNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.SnapshotInner>> listAsync(com.github.wukong.azurevm.models.snapshots.ListAsyncRequest request) {
		return this.snapshots().listAsync();
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.SnapshotInner>>> listByResourceGroupSinglePageAsync(com.github.wukong.azurevm.models.snapshots.ListByResourceGroupSinglePageAsyncRequest request) {
		return this.snapshots().listByResourceGroupSinglePageAsync(request.getResourceGroupName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.SnapshotInner>>> listByResourceGroupNextSinglePageAsync(com.github.wukong.azurevm.models.snapshots.ListByResourceGroupNextSinglePageAsyncRequest request) {
		return this.snapshots().listByResourceGroupNextSinglePageAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.SnapshotInner getByResourceGroup(com.github.wukong.azurevm.models.snapshots.GetByResourceGroupRequest request) {
		return this.snapshots().getByResourceGroup(request.getResourceGroupName(),request.getSnapshotName());
	}

	public com.microsoft.azure.management.compute.implementation.SnapshotInner createOrUpdate(com.github.wukong.azurevm.models.snapshots.CreateOrUpdateRequest request) {
		return this.snapshots().createOrUpdate(request.getResourceGroupName(),request.getSnapshotName(),request.getSnapshot());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.lang.Void>> deleteWithServiceResponseAsync(com.github.wukong.azurevm.models.snapshots.DeleteWithServiceResponseAsyncRequest request) {
		return this.snapshots().deleteWithServiceResponseAsync(request.getResourceGroupName(),request.getSnapshotName());
	}

	public com.microsoft.azure.management.compute.implementation.AccessUriInner grantAccess(com.github.wukong.azurevm.models.snapshots.GrantAccessRequest request) {
		return this.snapshots().grantAccess(request.getResourceGroupName(),request.getSnapshotName(),request.getGrantAccessData());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.SnapshotInner>>> listSinglePageAsync(com.github.wukong.azurevm.models.snapshots.ListSinglePageAsyncRequest request) {
		return this.snapshots().listSinglePageAsync();
	}

	public rx.Observable<java.lang.Void> deleteAsync(com.github.wukong.azurevm.models.snapshots.DeleteAsyncRequest request) {
		return this.snapshots().deleteAsync(request.getResourceGroupName(),request.getSnapshotName());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.SnapshotInner>> listByResourceGroupAsync(com.github.wukong.azurevm.models.snapshots.ListByResourceGroupAsyncRequest request) {
		return this.snapshots().listByResourceGroupAsync(request.getResourceGroupName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.SnapshotInner> list(com.github.wukong.azurevm.models.snapshots.ListRequest request) {
		return this.snapshots().list();
	}

	public com.microsoft.azure.management.compute.implementation.SnapshotInner beginUpdate(com.github.wukong.azurevm.models.snapshots.BeginUpdateRequest request) {
		return this.snapshots().beginUpdate(request.getResourceGroupName(),request.getSnapshotName(),request.getSnapshot());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.SnapshotInner>>> listWithServiceResponseAsync(com.github.wukong.azurevm.models.snapshots.ListWithServiceResponseAsyncRequest request) {
		return this.snapshots().listWithServiceResponseAsync();
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.SnapshotInner>> listNextAsync(com.github.wukong.azurevm.models.snapshots.ListNextAsyncRequest request) {
		return this.snapshots().listNextAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.SnapshotInner beginCreateOrUpdate(com.github.wukong.azurevm.models.snapshots.BeginCreateOrUpdateRequest request) {
		return this.snapshots().beginCreateOrUpdate(request.getResourceGroupName(),request.getSnapshotName(),request.getSnapshot());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.SnapshotInner>>> listByResourceGroupNextWithServiceResponseAsync(com.github.wukong.azurevm.models.snapshots.ListByResourceGroupNextWithServiceResponseAsyncRequest request) {
		return this.snapshots().listByResourceGroupNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.GalleryInner getByResourceGroup(com.github.wukong.azurevm.models.galleries.GetByResourceGroupRequest request) {
		return this.galleries().getByResourceGroup(request.getResourceGroupName(),request.getGalleryName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.GalleryInner> listNext(com.github.wukong.azurevm.models.galleries.ListNextRequest request) {
		return this.galleries().listNext(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.GalleryInner createOrUpdate(com.github.wukong.azurevm.models.galleries.CreateOrUpdateRequest request) {
		return this.galleries().createOrUpdate(request.getResourceGroupName(),request.getGalleryName(),request.getGallery());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.lang.Void>> deleteWithServiceResponseAsync(com.github.wukong.azurevm.models.galleries.DeleteWithServiceResponseAsyncRequest request) {
		return this.galleries().deleteWithServiceResponseAsync(request.getResourceGroupName(),request.getGalleryName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryInner>>> listNextSinglePageAsync(com.github.wukong.azurevm.models.galleries.ListNextSinglePageAsyncRequest request) {
		return this.galleries().listNextSinglePageAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryInner>>> listByResourceGroupWithServiceResponseAsync(com.github.wukong.azurevm.models.galleries.ListByResourceGroupWithServiceResponseAsyncRequest request) {
		return this.galleries().listByResourceGroupWithServiceResponseAsync(request.getResourceGroupName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryInner>>> listSinglePageAsync(com.github.wukong.azurevm.models.galleries.ListSinglePageAsyncRequest request) {
		return this.galleries().listSinglePageAsync();
	}

	public rx.Observable<java.lang.Void> deleteAsync(com.github.wukong.azurevm.models.galleries.DeleteAsyncRequest request) {
		return this.galleries().deleteAsync(request.getResourceGroupName(),request.getGalleryName());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryInner>> listByResourceGroupAsync(com.github.wukong.azurevm.models.galleries.ListByResourceGroupAsyncRequest request) {
		return this.galleries().listByResourceGroupAsync(request.getResourceGroupName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.GalleryInner> list(com.github.wukong.azurevm.models.galleries.ListRequest request) {
		return this.galleries().list();
	}

	public void delete(com.github.wukong.azurevm.models.galleries.DeleteRequest request) {
		this.galleries().delete(request.getResourceGroupName(),request.getGalleryName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.GalleryInner> listByResourceGroup(com.github.wukong.azurevm.models.galleries.ListByResourceGroupRequest request) {
		return this.galleries().listByResourceGroup(request.getResourceGroupName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryInner>>> listWithServiceResponseAsync(com.github.wukong.azurevm.models.galleries.ListWithServiceResponseAsyncRequest request) {
		return this.galleries().listWithServiceResponseAsync();
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryInner>>> listNextWithServiceResponseAsync(com.github.wukong.azurevm.models.galleries.ListNextWithServiceResponseAsyncRequest request) {
		return this.galleries().listNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryInner>> listNextAsync(com.github.wukong.azurevm.models.galleries.ListNextAsyncRequest request) {
		return this.galleries().listNextAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryInner>> listByResourceGroupNextAsync(com.github.wukong.azurevm.models.galleries.ListByResourceGroupNextAsyncRequest request) {
		return this.galleries().listByResourceGroupNextAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.GalleryInner> listByResourceGroupNext(com.github.wukong.azurevm.models.galleries.ListByResourceGroupNextRequest request) {
		return this.galleries().listByResourceGroupNext(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.GalleryInner beginCreateOrUpdate(com.github.wukong.azurevm.models.galleries.BeginCreateOrUpdateRequest request) {
		return this.galleries().beginCreateOrUpdate(request.getResourceGroupName(),request.getGalleryName(),request.getGallery());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryInner>> listAsync(com.github.wukong.azurevm.models.galleries.ListAsyncRequest request) {
		return this.galleries().listAsync();
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryInner>>> listByResourceGroupNextWithServiceResponseAsync(com.github.wukong.azurevm.models.galleries.ListByResourceGroupNextWithServiceResponseAsyncRequest request) {
		return this.galleries().listByResourceGroupNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryInner>>> listByResourceGroupSinglePageAsync(com.github.wukong.azurevm.models.galleries.ListByResourceGroupSinglePageAsyncRequest request) {
		return this.galleries().listByResourceGroupSinglePageAsync(request.getResourceGroupName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryInner>>> listByResourceGroupNextSinglePageAsync(com.github.wukong.azurevm.models.galleries.ListByResourceGroupNextSinglePageAsyncRequest request) {
		return this.galleries().listByResourceGroupNextSinglePageAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.GalleryImageInner> listByGallery(com.github.wukong.azurevm.models.galleryImages.ListByGalleryRequest request) {
		return this.galleryImages().listByGallery(request.getResourceGroupName(),request.getGalleryName());
	}

	public com.microsoft.azure.management.compute.implementation.GalleryImageInner createOrUpdate(com.github.wukong.azurevm.models.galleryImages.CreateOrUpdateRequest request) {
		return this.galleryImages().createOrUpdate(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName(),request.getGalleryImage());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryImageInner>>> listByGalleryWithServiceResponseAsync(com.github.wukong.azurevm.models.galleryImages.ListByGalleryWithServiceResponseAsyncRequest request) {
		return this.galleryImages().listByGalleryWithServiceResponseAsync(request.getResourceGroupName(),request.getGalleryName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryImageInner>>> listByGalleryNextSinglePageAsync(com.github.wukong.azurevm.models.galleryImages.ListByGalleryNextSinglePageAsyncRequest request) {
		return this.galleryImages().listByGalleryNextSinglePageAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.lang.Void>> deleteWithServiceResponseAsync(com.github.wukong.azurevm.models.galleryImages.DeleteWithServiceResponseAsyncRequest request) {
		return this.galleryImages().deleteWithServiceResponseAsync(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.GalleryImageInner> listByGalleryNext(com.github.wukong.azurevm.models.galleryImages.ListByGalleryNextRequest request) {
		return this.galleryImages().listByGalleryNext(request.getNextPageLink());
	}

	public rx.Observable<java.lang.Void> deleteAsync(com.github.wukong.azurevm.models.galleryImages.DeleteAsyncRequest request) {
		return this.galleryImages().deleteAsync(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryImageInner>>> listByGalleryNextWithServiceResponseAsync(com.github.wukong.azurevm.models.galleryImages.ListByGalleryNextWithServiceResponseAsyncRequest request) {
		return this.galleryImages().listByGalleryNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryImageInner>> listByGalleryNextAsync(com.github.wukong.azurevm.models.galleryImages.ListByGalleryNextAsyncRequest request) {
		return this.galleryImages().listByGalleryNextAsync(request.getNextPageLink());
	}

	public void delete(com.github.wukong.azurevm.models.galleryImages.DeleteRequest request) {
		this.galleryImages().delete(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryImageInner>> listByGalleryAsync(com.github.wukong.azurevm.models.galleryImages.ListByGalleryAsyncRequest request) {
		return this.galleryImages().listByGalleryAsync(request.getResourceGroupName(),request.getGalleryName());
	}

	public com.microsoft.azure.management.compute.implementation.GalleryImageInner get(com.github.wukong.azurevm.models.galleryImages.GetRequest request) {
		return this.galleryImages().get(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryImageInner>>> listByGallerySinglePageAsync(com.github.wukong.azurevm.models.galleryImages.ListByGallerySinglePageAsyncRequest request) {
		return this.galleryImages().listByGallerySinglePageAsync(request.getResourceGroupName(),request.getGalleryName());
	}

	public com.microsoft.azure.management.compute.implementation.GalleryImageInner beginCreateOrUpdate(com.github.wukong.azurevm.models.galleryImages.BeginCreateOrUpdateRequest request) {
		return this.galleryImages().beginCreateOrUpdate(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName(),request.getGalleryImage());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.GalleryImageVersionInner> listByGalleryImage(com.github.wukong.azurevm.models.galleryImageVersions.ListByGalleryImageRequest request) {
		return this.galleryImageVersions().listByGalleryImage(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName());
	}

	public com.microsoft.azure.management.compute.implementation.GalleryImageVersionInner createOrUpdate(com.github.wukong.azurevm.models.galleryImageVersions.CreateOrUpdateRequest request) {
		return this.galleryImageVersions().createOrUpdate(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName(),request.getGalleryImageVersionName(),request.getGalleryImageVersion());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<java.lang.Void>> deleteWithServiceResponseAsync(com.github.wukong.azurevm.models.galleryImageVersions.DeleteWithServiceResponseAsyncRequest request) {
		return this.galleryImageVersions().deleteWithServiceResponseAsync(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName(),request.getGalleryImageVersionName());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryImageVersionInner>> listByGalleryImageNextAsync(com.github.wukong.azurevm.models.galleryImageVersions.ListByGalleryImageNextAsyncRequest request) {
		return this.galleryImageVersions().listByGalleryImageNextAsync(request.getNextPageLink());
	}

	public rx.Observable<java.lang.Void> deleteAsync(com.github.wukong.azurevm.models.galleryImageVersions.DeleteAsyncRequest request) {
		return this.galleryImageVersions().deleteAsync(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName(),request.getGalleryImageVersionName());
	}

	public void delete(com.github.wukong.azurevm.models.galleryImageVersions.DeleteRequest request) {
		this.galleryImageVersions().delete(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName(),request.getGalleryImageVersionName());
	}

	public com.microsoft.azure.PagedList<com.microsoft.azure.management.compute.implementation.GalleryImageVersionInner> listByGalleryImageNext(com.github.wukong.azurevm.models.galleryImageVersions.ListByGalleryImageNextRequest request) {
		return this.galleryImageVersions().listByGalleryImageNext(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryImageVersionInner>>> listByGalleryImageNextWithServiceResponseAsync(com.github.wukong.azurevm.models.galleryImageVersions.ListByGalleryImageNextWithServiceResponseAsyncRequest request) {
		return this.galleryImageVersions().listByGalleryImageNextWithServiceResponseAsync(request.getNextPageLink());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryImageVersionInner>>> listByGalleryImageNextSinglePageAsync(com.github.wukong.azurevm.models.galleryImageVersions.ListByGalleryImageNextSinglePageAsyncRequest request) {
		return this.galleryImageVersions().listByGalleryImageNextSinglePageAsync(request.getNextPageLink());
	}

	public com.microsoft.azure.management.compute.implementation.GalleryImageVersionInner get(com.github.wukong.azurevm.models.galleryImageVersions.GetRequest request) {
		return this.galleryImageVersions().get(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName(),request.getGalleryImageVersionName());
	}

	public rx.Observable<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryImageVersionInner>> listByGalleryImageAsync(com.github.wukong.azurevm.models.galleryImageVersions.ListByGalleryImageAsyncRequest request) {
		return this.galleryImageVersions().listByGalleryImageAsync(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryImageVersionInner>>> listByGalleryImageWithServiceResponseAsync(com.github.wukong.azurevm.models.galleryImageVersions.ListByGalleryImageWithServiceResponseAsyncRequest request) {
		return this.galleryImageVersions().listByGalleryImageWithServiceResponseAsync(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName());
	}

	public com.microsoft.azure.management.compute.implementation.GalleryImageVersionInner beginCreateOrUpdate(com.github.wukong.azurevm.models.galleryImageVersions.BeginCreateOrUpdateRequest request) {
		return this.galleryImageVersions().beginCreateOrUpdate(request.getResourceGroupName(),request.getGalleryName(),request.getGalleryImageName(),request.getGalleryImageVersionName(),request.getGalleryImageVersion());
	}

	public rx.Observable<com.microsoft.rest.ServiceResponse<com.microsoft.azure.Page<com.microsoft.azure.management.compute.implementation.GalleryImageVersionInner>>> listByGalleryImageSinglePageAsync(com.github.wukong.azurevm.models.galleryImageVersions.ListByGalleryImageSinglePageAsyncRequest request) {
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
					CodesTool.generateRequest(file, AbstractAzureRequest.class, method, thisMethod);
				}
			}
		}
	}

}
