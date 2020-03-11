/**
 * Copyright (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.wukong.aliyunvm;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.auth.AlibabaCloudCredentials;
import com.aliyuncs.auth.AlibabaCloudCredentialsProvider;
import com.aliyuncs.ecs.model.v20140526.CreateVpcRequest;
import com.aliyuncs.profile.IClientProfile;

import io.github.wukong.core.anas.ClassesInPackageAnalyzer;

/**
 * @author wuheng@iscas.ac.cn
 * @since 2019.1
 *
 */
public class WukongAliyunVMClient extends DefaultAcsClient {

	public final static Class<?> CLASSNAME = RpcAcsRequest.class;

	public final static String PACKAGE = CreateVpcRequest.class.getPackage().getName();

	public WukongAliyunVMClient(IClientProfile profile, AlibabaCloudCredentials credentials) {
		super(profile, credentials);
	}

	public WukongAliyunVMClient(IClientProfile profile, AlibabaCloudCredentialsProvider credentialsProvider) {
		super(profile, credentialsProvider);
	}

	public WukongAliyunVMClient(IClientProfile profile) {
		super(profile);
	}

	public com.aliyuncs.ecs.model.v20140526.AddBandwidthPackageIpsResponse addBandwidthPackageIpsResponse() {
		return new com.aliyuncs.ecs.model.v20140526.AddBandwidthPackageIpsResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribePriceRequest describePriceRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribePriceRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.JoinSecurityGroupResponse joinSecurityGroupResponse() {
		return new com.aliyuncs.ecs.model.v20140526.JoinSecurityGroupResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateSimulatedSystemEventsResponse createSimulatedSystemEventsResponse() {
		return new com.aliyuncs.ecs.model.v20140526.CreateSimulatedSystemEventsResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.AssociateEipAddressResponse associateEipAddressResponse() {
		return new com.aliyuncs.ecs.model.v20140526.AssociateEipAddressResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteVpcRequest deleteVpcRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteVpcRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteInstanceResponse deleteInstanceResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteInstanceResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateAutoProvisioningGroupResponse createAutoProvisioningGroupResponse() {
		return new com.aliyuncs.ecs.model.v20140526.CreateAutoProvisioningGroupResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.AttachNetworkInterfaceResponse attachNetworkInterfaceResponse() {
		return new com.aliyuncs.ecs.model.v20140526.AttachNetworkInterfaceResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteRouteEntryResponse deleteRouteEntryResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteRouteEntryResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateHaVipResponse createHaVipResponse() {
		return new com.aliyuncs.ecs.model.v20140526.CreateHaVipResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ResizeDiskResponse resizeDiskResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ResizeDiskResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyRouterInterfaceSpecRequest modifyRouterInterfaceSpecRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyRouterInterfaceSpecRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostAutoRenewResponse describeDedicatedHostAutoRenewResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostAutoRenewResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateStorageSetResponse createStorageSetResponse() {
		return new com.aliyuncs.ecs.model.v20140526.CreateStorageSetResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateInstanceResponse createInstanceResponse() {
		return new com.aliyuncs.ecs.model.v20140526.CreateInstanceResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeResourcesModificationResponse describeResourcesModificationResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeResourcesModificationResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.PurchaseReservedInstancesOfferingRequest purchaseReservedInstancesOfferingRequest() {
		return new com.aliyuncs.ecs.model.v20140526.PurchaseReservedInstancesOfferingRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeClustersRequest describeClustersRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeClustersRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.AttachClassicLinkVpcResponse attachClassicLinkVpcResponse() {
		return new com.aliyuncs.ecs.model.v20140526.AttachClassicLinkVpcResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateNatGatewayRequest createNatGatewayRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateNatGatewayRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeletePhysicalConnectionResponse deletePhysicalConnectionResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DeletePhysicalConnectionResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateAutoSnapshotPolicyResponse createAutoSnapshotPolicyResponse() {
		return new com.aliyuncs.ecs.model.v20140526.CreateAutoSnapshotPolicyResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse describeRenewalPriceResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeSecurityGroupsResponse describeSecurityGroupsResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeSecurityGroupsResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeDiskMonitorDataResponse describeDiskMonitorDataResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeDiskMonitorDataResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteVpcResponse deleteVpcResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteVpcResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeSecurityGroupReferencesResponse describeSecurityGroupReferencesResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeSecurityGroupReferencesResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyCommandResponse modifyCommandResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyCommandResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifySecurityGroupAttributeResponse modifySecurityGroupAttributeResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifySecurityGroupAttributeResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateDemandResponse createDemandResponse() {
		return new com.aliyuncs.ecs.model.v20140526.CreateDemandResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.CancelAutoSnapshotPolicyResponse cancelAutoSnapshotPolicyResponse() {
		return new com.aliyuncs.ecs.model.v20140526.CancelAutoSnapshotPolicyResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyHaVipAttributeResponse modifyHaVipAttributeResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyHaVipAttributeResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyLaunchTemplateDefaultVersionResponse modifyLaunchTemplateDefaultVersionResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyLaunchTemplateDefaultVersionResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeAvailableResourceRequest describeAvailableResourceRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeAvailableResourceRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ConnectRouterInterfaceRequest connectRouterInterfaceRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ConnectRouterInterfaceRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeBandwidthPackagesResponse describeBandwidthPackagesResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeBandwidthPackagesResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.RecoverVirtualBorderRouterResponse recoverVirtualBorderRouterResponse() {
		return new com.aliyuncs.ecs.model.v20140526.RecoverVirtualBorderRouterResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DetachDiskRequest detachDiskRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DetachDiskRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.AttachDiskRequest attachDiskRequest() {
		return new com.aliyuncs.ecs.model.v20140526.AttachDiskRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.RemoveTagsRequest removeTagsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.RemoveTagsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ResetDiskRequest resetDiskRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ResetDiskRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyHpcClusterAttributeResponse modifyHpcClusterAttributeResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyHpcClusterAttributeResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateKeyPairRequest createKeyPairRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateKeyPairRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceMonitorDataResponse describeInstanceMonitorDataResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstanceMonitorDataResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.AllocatePublicIpAddressRequest allocatePublicIpAddressRequest() {
		return new com.aliyuncs.ecs.model.v20140526.AllocatePublicIpAddressRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyAutoSnapshotPolicyResponse modifyAutoSnapshotPolicyResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyAutoSnapshotPolicyResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyInstanceChargeTypeResponse modifyInstanceChargeTypeResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyInstanceChargeTypeResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.RebootInstanceResponse rebootInstanceResponse() {
		return new com.aliyuncs.ecs.model.v20140526.RebootInstanceResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteKeyPairsRequest deleteKeyPairsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteKeyPairsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.AttachKeyPairResponse attachKeyPairResponse() {
		return new com.aliyuncs.ecs.model.v20140526.AttachKeyPairResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeLimitationRequest describeLimitationRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeLimitationRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifySnapshotAttributeRequest modifySnapshotAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifySnapshotAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ReleaseDedicatedHostRequest releaseDedicatedHostRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ReleaseDedicatedHostRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.EipFillParamsResponse eipFillParamsResponse() {
		return new com.aliyuncs.ecs.model.v20140526.EipFillParamsResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyInstanceAutoRenewAttributeRequest modifyInstanceAutoRenewAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyInstanceAutoRenewAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceAutoRenewAttributeRequest describeInstanceAutoRenewAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstanceAutoRenewAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.StartInstanceResponse startInstanceResponse() {
		return new com.aliyuncs.ecs.model.v20140526.StartInstanceResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteHaVipResponse deleteHaVipResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteHaVipResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyAutoSnapshotPolicyExRequest modifyAutoSnapshotPolicyExRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyAutoSnapshotPolicyExRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostsRequest describeDedicatedHostsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInvocationResultsRequest describeInvocationResultsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInvocationResultsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceAttributeResponse describeInstanceAttributeResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstanceAttributeResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.RenewDedicatedHostsRequest renewDedicatedHostsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.RenewDedicatedHostsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.AcceptInquiredSystemEventRequest acceptInquiredSystemEventRequest() {
		return new com.aliyuncs.ecs.model.v20140526.AcceptInquiredSystemEventRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ApplyAutoSnapshotPolicyRequest applyAutoSnapshotPolicyRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ApplyAutoSnapshotPolicyRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateAutoSnapshotPolicyRequest createAutoSnapshotPolicyRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateAutoSnapshotPolicyRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteNatGatewayRequest deleteNatGatewayRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteNatGatewayRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeSpotPriceHistoryResponse describeSpotPriceHistoryResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeSpotPriceHistoryResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.UnassociateEipAddressResponse unassociateEipAddressResponse() {
		return new com.aliyuncs.ecs.model.v20140526.UnassociateEipAddressResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeImageSharePermissionResponse describeImageSharePermissionResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeImageSharePermissionResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateRouteEntryRequest createRouteEntryRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateRouteEntryRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifySecurityGroupAttributeRequest modifySecurityGroupAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifySecurityGroupAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.UntagResourcesResponse untagResourcesResponse() {
		return new com.aliyuncs.ecs.model.v20140526.UntagResourcesResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeDisksFullStatusResponse describeDisksFullStatusResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeDisksFullStatusResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostsResponse describeDedicatedHostsResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostsResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceStatusRequest describeInstanceStatusRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstanceStatusRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeVRoutersResponse describeVRoutersResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeVRoutersResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteCommandRequest deleteCommandRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteCommandRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteInstancesRequest deleteInstancesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteInstancesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyDiskAttributeRequest modifyDiskAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyDiskAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteNetworkInterfacePermissionRequest deleteNetworkInterfacePermissionRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteNetworkInterfacePermissionRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeAutoProvisioningGroupInstancesRequest describeAutoProvisioningGroupInstancesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeAutoProvisioningGroupInstancesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeVirtualBorderRoutersResponse describeVirtualBorderRoutersResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeVirtualBorderRoutersResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ConnectRouterInterfaceResponse connectRouterInterfaceResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ConnectRouterInterfaceResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyInstanceMaintenanceAttributesResponse modifyInstanceMaintenanceAttributesResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyInstanceMaintenanceAttributesResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ImportSnapshotResponse importSnapshotResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ImportSnapshotResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeVSwitchesRequest describeVSwitchesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeVSwitchesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeNewProjectEipMonitorDataRequest describeNewProjectEipMonitorDataRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeNewProjectEipMonitorDataRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateRouterInterfaceResponse createRouterInterfaceResponse() {
		return new com.aliyuncs.ecs.model.v20140526.CreateRouterInterfaceResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.StopInvocationRequest stopInvocationRequest() {
		return new com.aliyuncs.ecs.model.v20140526.StopInvocationRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.AssociateHaVipResponse associateHaVipResponse() {
		return new com.aliyuncs.ecs.model.v20140526.AssociateHaVipResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeAvailableResourceResponse describeAvailableResourceResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeAvailableResourceResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeSnapshotsResponse describeSnapshotsResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeSnapshotsResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyDedicatedHostAttributeResponse modifyDedicatedHostAttributeResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyDedicatedHostAttributeResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyDedicatedHostAutoReleaseTimeRequest modifyDedicatedHostAutoReleaseTimeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyDedicatedHostAutoReleaseTimeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DetachNetworkInterfaceRequest detachNetworkInterfaceRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DetachNetworkInterfaceRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceTypeFamiliesRequest describeInstanceTypeFamiliesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstanceTypeFamiliesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateDiskResponse createDiskResponse() {
		return new com.aliyuncs.ecs.model.v20140526.CreateDiskResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.JoinResourceGroupRequest joinResourceGroupRequest() {
		return new com.aliyuncs.ecs.model.v20140526.JoinResourceGroupRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateDeploymentSetRequest createDeploymentSetRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateDeploymentSetRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeSpotPriceHistoryRequest describeSpotPriceHistoryRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeSpotPriceHistoryRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.UnassignPrivateIpAddressesRequest unassignPrivateIpAddressesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.UnassignPrivateIpAddressesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifySecurityGroupEgressRuleRequest modifySecurityGroupEgressRuleRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifySecurityGroupEgressRuleRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeSnapshotPackageRequest describeSnapshotPackageRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeSnapshotPackageRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.AttachClassicLinkVpcRequest attachClassicLinkVpcRequest() {
		return new com.aliyuncs.ecs.model.v20140526.AttachClassicLinkVpcRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyDemandResponse modifyDemandResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyDemandResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.CancelTaskRequest cancelTaskRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CancelTaskRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeLaunchTemplatesRequest describeLaunchTemplatesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeLaunchTemplatesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteNatGatewayResponse deleteNatGatewayResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteNatGatewayResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteAutoSnapshotPolicyRequest deleteAutoSnapshotPolicyRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteAutoSnapshotPolicyRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CancelSimulatedSystemEventsRequest cancelSimulatedSystemEventsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CancelSimulatedSystemEventsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.AddTagsRequest addTagsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.AddTagsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyInstanceAttributeResponse modifyInstanceAttributeResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyInstanceAttributeResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeBandwidthPackagesRequest describeBandwidthPackagesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeBandwidthPackagesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeTaskAttributeRequest describeTaskAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeTaskAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeRouteTablesResponse describeRouteTablesResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeRouteTablesResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeUserDataRequest describeUserDataRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeUserDataRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateNetworkInterfaceResponse createNetworkInterfaceResponse() {
		return new com.aliyuncs.ecs.model.v20140526.CreateNetworkInterfaceResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeHpcClustersRequest describeHpcClustersRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeHpcClustersRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteDiskResponse deleteDiskResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteDiskResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceTopologyResponse describeInstanceTopologyResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstanceTopologyResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ActivateRouterInterfaceRequest activateRouterInterfaceRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ActivateRouterInterfaceRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DetachKeyPairRequest detachKeyPairRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DetachKeyPairRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeactivateRouterInterfaceResponse deactivateRouterInterfaceResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DeactivateRouterInterfaceResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ImportKeyPairResponse importKeyPairResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ImportKeyPairResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.UnassociateHaVipResponse unassociateHaVipResponse() {
		return new com.aliyuncs.ecs.model.v20140526.UnassociateHaVipResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteStorageSetRequest deleteStorageSetRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteStorageSetRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeSecurityGroupAttributeRequest describeSecurityGroupAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeSecurityGroupAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ReleaseEipAddressResponse releaseEipAddressResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ReleaseEipAddressResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteSnapshotResponse deleteSnapshotResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteSnapshotResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteStorageSetResponse deleteStorageSetResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteStorageSetResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DetachClassicLinkVpcResponse detachClassicLinkVpcResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DetachClassicLinkVpcResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyInstanceVncPasswdRequest modifyInstanceVncPasswdRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyInstanceVncPasswdRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteVSwitchRequest deleteVSwitchRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteVSwitchRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeEipMonitorDataResponse describeEipMonitorDataResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeEipMonitorDataResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyImageAttributeResponse modifyImageAttributeResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyImageAttributeResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateVSwitchRequest createVSwitchRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateVSwitchRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.EipFillProductResponse eipFillProductResponse() {
		return new com.aliyuncs.ecs.model.v20140526.EipFillProductResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstancesFullStatusResponse describeInstancesFullStatusResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstancesFullStatusResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeCommandsRequest describeCommandsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeCommandsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyDedicatedHostAutoRenewAttributeResponse modifyDedicatedHostAutoRenewAttributeResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyDedicatedHostAutoRenewAttributeResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceRamRoleRequest describeInstanceRamRoleRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstanceRamRoleRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteHpcClusterResponse deleteHpcClusterResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteHpcClusterResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeHpcClustersResponse describeHpcClustersResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeHpcClustersResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyVSwitchAttributeResponse modifyVSwitchAttributeResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyVSwitchAttributeResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstancesRequest describeInstancesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstancesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.RedeployInstanceResponse redeployInstanceResponse() {
		return new com.aliyuncs.ecs.model.v20140526.RedeployInstanceResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeSecurityGroupAttributeResponse describeSecurityGroupAttributeResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeSecurityGroupAttributeResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DeactivateRouterInterfaceRequest deactivateRouterInterfaceRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeactivateRouterInterfaceRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CopyImageResponse copyImageResponse() {
		return new com.aliyuncs.ecs.model.v20140526.CopyImageResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeForwardTableEntriesResponse describeForwardTableEntriesResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeForwardTableEntriesResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeVpcsRequest describeVpcsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeVpcsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteImageRequest deleteImageRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteImageRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyDemandRequest modifyDemandRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyDemandRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeAccountAttributesRequest describeAccountAttributesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeAccountAttributesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeRecommendInstanceTypeRequest describeRecommendInstanceTypeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeRecommendInstanceTypeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteLaunchTemplateVersionResponse deleteLaunchTemplateVersionResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteLaunchTemplateVersionResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.CancelPhysicalConnectionResponse cancelPhysicalConnectionResponse() {
		return new com.aliyuncs.ecs.model.v20140526.CancelPhysicalConnectionResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.TagResourcesRequest tagResourcesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.TagResourcesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateDeploymentSetResponse createDeploymentSetResponse() {
		return new com.aliyuncs.ecs.model.v20140526.CreateDeploymentSetResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeAccountAttributesResponse describeAccountAttributesResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeAccountAttributesResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateRouteEntryResponse createRouteEntryResponse() {
		return new com.aliyuncs.ecs.model.v20140526.CreateRouteEntryResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyPhysicalConnectionAttributeResponse modifyPhysicalConnectionAttributeResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyPhysicalConnectionAttributeResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeAutoProvisioningGroupsRequest describeAutoProvisioningGroupsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeAutoProvisioningGroupsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeEniMonitorDataResponse describeEniMonitorDataResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeEniMonitorDataResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeTasksRequest describeTasksRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeTasksRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateForwardEntryRequest createForwardEntryRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateForwardEntryRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceHistoryEventsResponse describeInstanceHistoryEventsResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstanceHistoryEventsResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyInstanceChargeTypeRequest modifyInstanceChargeTypeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyInstanceChargeTypeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceTypesResponse describeInstanceTypesResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstanceTypesResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteAutoProvisioningGroupRequest deleteAutoProvisioningGroupRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteAutoProvisioningGroupRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyInstanceAutoReleaseTimeRequest modifyInstanceAutoReleaseTimeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyInstanceAutoReleaseTimeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.TerminatePhysicalConnectionRequest terminatePhysicalConnectionRequest() {
		return new com.aliyuncs.ecs.model.v20140526.TerminatePhysicalConnectionRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ImportSnapshotRequest importSnapshotRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ImportSnapshotRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeRegionsResponse describeRegionsResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeRegionsResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateVirtualBorderRouterRequest createVirtualBorderRouterRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateVirtualBorderRouterRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeNewProjectEipMonitorDataResponse describeNewProjectEipMonitorDataResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeNewProjectEipMonitorDataResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.RemoveTagsResponse removeTagsResponse() {
		return new com.aliyuncs.ecs.model.v20140526.RemoveTagsResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateVpcResponse createVpcResponse() {
		return new com.aliyuncs.ecs.model.v20140526.CreateVpcResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteCommandResponse deleteCommandResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteCommandResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeResourceByTagsResponse describeResourceByTagsResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeResourceByTagsResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteDeploymentSetRequest deleteDeploymentSetRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteDeploymentSetRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.EnablePhysicalConnectionResponse enablePhysicalConnectionResponse() {
		return new com.aliyuncs.ecs.model.v20140526.EnablePhysicalConnectionResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeAutoSnapshotPolicyExRequest describeAutoSnapshotPolicyExRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeAutoSnapshotPolicyExRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeAccessPointsRequest describeAccessPointsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeAccessPointsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeRegionsRequest describeRegionsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeRegionsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyVRouterAttributeResponse modifyVRouterAttributeResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyVRouterAttributeResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.LeaveSecurityGroupRequest leaveSecurityGroupRequest() {
		return new com.aliyuncs.ecs.model.v20140526.LeaveSecurityGroupRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyDiskChargeTypeRequest modifyDiskChargeTypeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyDiskChargeTypeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteDemandRequest deleteDemandRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteDemandRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyReservedInstanceAttributeRequest modifyReservedInstanceAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyReservedInstanceAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyNetworkInterfaceAttributeResponse modifyNetworkInterfaceAttributeResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyNetworkInterfaceAttributeResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateDemandRequest createDemandRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateDemandRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyInstanceMaintenanceAttributesRequest modifyInstanceMaintenanceAttributesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyInstanceMaintenanceAttributesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.TerminatePhysicalConnectionResponse terminatePhysicalConnectionResponse() {
		return new com.aliyuncs.ecs.model.v20140526.TerminatePhysicalConnectionResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeDemandsResponse describeDemandsResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeDemandsResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ReInitDiskResponse reInitDiskResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ReInitDiskResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.JoinSecurityGroupRequest joinSecurityGroupRequest() {
		return new com.aliyuncs.ecs.model.v20140526.JoinSecurityGroupRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateStorageSetRequest createStorageSetRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateStorageSetRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribePhysicalConnectionsRequest describePhysicalConnectionsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribePhysicalConnectionsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DetachClassicLinkVpcRequest detachClassicLinkVpcRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DetachClassicLinkVpcRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyPrepayInstanceSpecResponse modifyPrepayInstanceSpecResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyPrepayInstanceSpecResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyStorageSetAttributeResponse modifyStorageSetAttributeResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyStorageSetAttributeResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeBandwidthLimitationResponse describeBandwidthLimitationResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeBandwidthLimitationResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ConvertNatPublicIpToEipResponse convertNatPublicIpToEipResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ConvertNatPublicIpToEipResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.GetInstanceConsoleOutputResponse getInstanceConsoleOutputResponse() {
		return new com.aliyuncs.ecs.model.v20140526.GetInstanceConsoleOutputResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateLaunchTemplateResponse createLaunchTemplateResponse() {
		return new com.aliyuncs.ecs.model.v20140526.CreateLaunchTemplateResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ReportInstancesStatusResponse reportInstancesStatusResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ReportInstancesStatusResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeImageSupportInstanceTypesRequest describeImageSupportInstanceTypesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeImageSupportInstanceTypesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyAutoSnapshotPolicyExResponse modifyAutoSnapshotPolicyExResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyAutoSnapshotPolicyExResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeAccessPointsResponse describeAccessPointsResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeAccessPointsResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeSecurityGroupsRequest describeSecurityGroupsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeSecurityGroupsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeZonesResponse describeZonesResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeZonesResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyImageAttributeRequest modifyImageAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyImageAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteSecurityGroupRequest deleteSecurityGroupRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteSecurityGroupRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceVncPasswdRequest describeInstanceVncPasswdRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstanceVncPasswdRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeStorageSetDetailsRequest describeStorageSetDetailsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeStorageSetDetailsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.RedeployInstanceRequest redeployInstanceRequest() {
		return new com.aliyuncs.ecs.model.v20140526.RedeployInstanceRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteLaunchTemplateVersionRequest deleteLaunchTemplateVersionRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteLaunchTemplateVersionRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeAutoProvisioningGroupInstancesResponse describeAutoProvisioningGroupInstancesResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeAutoProvisioningGroupInstancesResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeSnapshotLinksRequest describeSnapshotLinksRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeSnapshotLinksRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.UntagResourcesRequest untagResourcesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.UntagResourcesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ListTagResourcesRequest listTagResourcesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ListTagResourcesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceStatusResponse describeInstanceStatusResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstanceStatusResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeDisksRequest describeDisksRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeDisksRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CopyImageRequest copyImageRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CopyImageRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyImageSharePermissionRequest modifyImageSharePermissionRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyImageSharePermissionRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyInstanceAutoReleaseTimeResponse modifyInstanceAutoReleaseTimeResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyInstanceAutoReleaseTimeResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyInstanceSpecResponse modifyInstanceSpecResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyInstanceSpecResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DetachDiskResponse detachDiskResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DetachDiskResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeTagsResponse describeTagsResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeTagsResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ResetDiskResponse resetDiskResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ResetDiskResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.RunCommandResponse runCommandResponse() {
		return new com.aliyuncs.ecs.model.v20140526.RunCommandResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeHaVipsRequest describeHaVipsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeHaVipsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateImageResponse createImageResponse() {
		return new com.aliyuncs.ecs.model.v20140526.CreateImageResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyImageSharePermissionResponse modifyImageSharePermissionResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyImageSharePermissionResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeVirtualBorderRoutersRequest describeVirtualBorderRoutersRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeVirtualBorderRoutersRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyInstanceDeploymentRequest modifyInstanceDeploymentRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyInstanceDeploymentRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ReleasePublicIpAddressRequest releasePublicIpAddressRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ReleasePublicIpAddressRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ApplyAutoSnapshotPolicyResponse applyAutoSnapshotPolicyResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ApplyAutoSnapshotPolicyResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.RenewDedicatedHostsResponse renewDedicatedHostsResponse() {
		return new com.aliyuncs.ecs.model.v20140526.RenewDedicatedHostsResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeAutoSnapshotPolicyExResponse describeAutoSnapshotPolicyExResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeAutoSnapshotPolicyExResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeSnapshotsUsageResponse describeSnapshotsUsageResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeSnapshotsUsageResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribePriceResponse describePriceResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribePriceResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateImageRequest createImageRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateImageRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyDiskAttributeResponse modifyDiskAttributeResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyDiskAttributeResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeDisksFullStatusRequest describeDisksFullStatusRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeDisksFullStatusRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyInstanceDeploymentResponse modifyInstanceDeploymentResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyInstanceDeploymentResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceMaintenanceAttributesRequest describeInstanceMaintenanceAttributesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstanceMaintenanceAttributesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse describeInstancesResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ExportSnapshotRequest exportSnapshotRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ExportSnapshotRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeNatGatewaysRequest describeNatGatewaysRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeNatGatewaysRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyHaVipAttributeRequest modifyHaVipAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyHaVipAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateVirtualBorderRouterResponse createVirtualBorderRouterResponse() {
		return new com.aliyuncs.ecs.model.v20140526.CreateVirtualBorderRouterResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyInstanceAttributeRequest modifyInstanceAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyInstanceAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.StopInstanceRequest stopInstanceRequest() {
		return new com.aliyuncs.ecs.model.v20140526.StopInstanceRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ReInitDiskRequest reInitDiskRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ReInitDiskRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeBandwidthLimitationRequest describeBandwidthLimitationRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeBandwidthLimitationRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeForwardTableEntriesRequest describeForwardTableEntriesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeForwardTableEntriesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.RebootInstanceRequest rebootInstanceRequest() {
		return new com.aliyuncs.ecs.model.v20140526.RebootInstanceRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateLaunchTemplateVersionResponse createLaunchTemplateVersionResponse() {
		return new com.aliyuncs.ecs.model.v20140526.CreateLaunchTemplateVersionResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyReservedInstanceAttributeResponse modifyReservedInstanceAttributeResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyReservedInstanceAttributeResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.TerminateVirtualBorderRouterResponse terminateVirtualBorderRouterResponse() {
		return new com.aliyuncs.ecs.model.v20140526.TerminateVirtualBorderRouterResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInvocationsResponse describeInvocationsResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInvocationsResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteHaVipRequest deleteHaVipRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteHaVipRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.LeaveSecurityGroupResponse leaveSecurityGroupResponse() {
		return new com.aliyuncs.ecs.model.v20140526.LeaveSecurityGroupResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeCommandsResponse describeCommandsResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeCommandsResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeVRoutersRequest describeVRoutersRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeVRoutersRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteVirtualBorderRouterRequest deleteVirtualBorderRouterRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteVirtualBorderRouterRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.AuthorizeSecurityGroupEgressResponse authorizeSecurityGroupEgressResponse() {
		return new com.aliyuncs.ecs.model.v20140526.AuthorizeSecurityGroupEgressResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteBandwidthPackageRequest deleteBandwidthPackageRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteBandwidthPackageRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyHpcClusterAttributeRequest modifyHpcClusterAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyHpcClusterAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CancelAutoSnapshotPolicyRequest cancelAutoSnapshotPolicyRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CancelAutoSnapshotPolicyRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.UnassociateHaVipRequest unassociateHaVipRequest() {
		return new com.aliyuncs.ecs.model.v20140526.UnassociateHaVipRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.RecoverVirtualBorderRouterRequest recoverVirtualBorderRouterRequest() {
		return new com.aliyuncs.ecs.model.v20140526.RecoverVirtualBorderRouterRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateVpcRequest createVpcRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateVpcRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeZonesRequest describeZonesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeZonesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateInstanceRequest createInstanceRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateInstanceRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeAutoProvisioningGroupHistoryResponse describeAutoProvisioningGroupHistoryResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeAutoProvisioningGroupHistoryResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyVpcAttributeResponse modifyVpcAttributeResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyVpcAttributeResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.AttachInstanceRamRoleRequest attachInstanceRamRoleRequest() {
		return new com.aliyuncs.ecs.model.v20140526.AttachInstanceRamRoleRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeLaunchTemplateVersionsRequest describeLaunchTemplateVersionsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeLaunchTemplateVersionsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyVirtualBorderRouterAttributeRequest modifyVirtualBorderRouterAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyVirtualBorderRouterAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceVncUrlResponse describeInstanceVncUrlResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstanceVncUrlResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceMonitorDataRequest describeInstanceMonitorDataRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstanceMonitorDataRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeEipAddressesRequest describeEipAddressesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeEipAddressesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ImportImageResponse importImageResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ImportImageResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.AddBandwidthPackageIpsRequest addBandwidthPackageIpsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.AddBandwidthPackageIpsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DetachNetworkInterfaceResponse detachNetworkInterfaceResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DetachNetworkInterfaceResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.RunInstancesResponse runInstancesResponse() {
		return new com.aliyuncs.ecs.model.v20140526.RunInstancesResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.RevokeSecurityGroupResponse revokeSecurityGroupResponse() {
		return new com.aliyuncs.ecs.model.v20140526.RevokeSecurityGroupResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.AllocateDedicatedHostsRequest allocateDedicatedHostsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.AllocateDedicatedHostsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ReportInstancesStatusRequest reportInstancesStatusRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ReportInstancesStatusRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteInstanceRequest deleteInstanceRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteInstanceRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifySecurityGroupRuleRequest modifySecurityGroupRuleRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifySecurityGroupRuleRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreatePhysicalConnectionResponse createPhysicalConnectionResponse() {
		return new com.aliyuncs.ecs.model.v20140526.CreatePhysicalConnectionResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyPrepayInstanceSpecRequest modifyPrepayInstanceSpecRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyPrepayInstanceSpecRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyDedicatedHostAutoRenewAttributeRequest modifyDedicatedHostAutoRenewAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyDedicatedHostAutoRenewAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceTypesRequest describeInstanceTypesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstanceTypesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyInstanceSpecRequest modifyInstanceSpecRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyInstanceSpecRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteForwardEntryResponse deleteForwardEntryResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteForwardEntryResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.RevokeSecurityGroupEgressResponse revokeSecurityGroupEgressResponse() {
		return new com.aliyuncs.ecs.model.v20140526.RevokeSecurityGroupEgressResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateSnapshotResponse createSnapshotResponse() {
		return new com.aliyuncs.ecs.model.v20140526.CreateSnapshotResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ListTagResourcesResponse listTagResourcesResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ListTagResourcesResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyReservedInstancesRequest modifyReservedInstancesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyReservedInstancesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyRouterInterfaceAttributeResponse modifyRouterInterfaceAttributeResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyRouterInterfaceAttributeResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeDemandsRequest describeDemandsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeDemandsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeKeyPairsRequest describeKeyPairsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeKeyPairsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateLaunchTemplateVersionRequest createLaunchTemplateVersionRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateLaunchTemplateVersionRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteDiskRequest deleteDiskRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteDiskRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.AssociateHaVipRequest associateHaVipRequest() {
		return new com.aliyuncs.ecs.model.v20140526.AssociateHaVipRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeRouteTablesRequest describeRouteTablesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeRouteTablesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceHistoryEventsRequest describeInstanceHistoryEventsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstanceHistoryEventsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyForwardEntryResponse modifyForwardEntryResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyForwardEntryResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.AcceptInquiredSystemEventResponse acceptInquiredSystemEventResponse() {
		return new com.aliyuncs.ecs.model.v20140526.AcceptInquiredSystemEventResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeTagsRequest describeTagsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeTagsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyVirtualBorderRouterAttributeResponse modifyVirtualBorderRouterAttributeResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyVirtualBorderRouterAttributeResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyNetworkInterfaceAttributeRequest modifyNetworkInterfaceAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyNetworkInterfaceAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeImagesRequest describeImagesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeImagesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfacePermissionsResponse describeNetworkInterfacePermissionsResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfacePermissionsResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.UnassignIpv6AddressesResponse unassignIpv6AddressesResponse() {
		return new com.aliyuncs.ecs.model.v20140526.UnassignIpv6AddressesResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.StopInvocationResponse stopInvocationResponse() {
		return new com.aliyuncs.ecs.model.v20140526.StopInvocationResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateLaunchTemplateRequest createLaunchTemplateRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateLaunchTemplateRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeAutoProvisioningGroupHistoryRequest describeAutoProvisioningGroupHistoryRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeAutoProvisioningGroupHistoryRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.RunInstancesRequest runInstancesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.RunInstancesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.InvokeCommandResponse invokeCommandResponse() {
		return new com.aliyuncs.ecs.model.v20140526.InvokeCommandResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.AllocateEipAddressRequest allocateEipAddressRequest() {
		return new com.aliyuncs.ecs.model.v20140526.AllocateEipAddressRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.JoinResourceGroupResponse joinResourceGroupResponse() {
		return new com.aliyuncs.ecs.model.v20140526.JoinResourceGroupResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteRouteEntryRequest deleteRouteEntryRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteRouteEntryRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstancesFullStatusRequest describeInstancesFullStatusRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstancesFullStatusRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteHpcClusterRequest deleteHpcClusterRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteHpcClusterRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceVncUrlRequest describeInstanceVncUrlRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstanceVncUrlRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.AddTagsResponse addTagsResponse() {
		return new com.aliyuncs.ecs.model.v20140526.AddTagsResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyInstanceVncPasswdResponse modifyInstanceVncPasswdResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyInstanceVncPasswdResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteKeyPairsResponse deleteKeyPairsResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteKeyPairsResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyBandwidthPackageSpecResponse modifyBandwidthPackageSpecResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyBandwidthPackageSpecResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeVirtualBorderRoutersForPhysicalConnectionResponse describeVirtualBorderRoutersForPhysicalConnectionResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeVirtualBorderRoutersForPhysicalConnectionResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeImageSharePermissionRequest describeImageSharePermissionRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeImageSharePermissionRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.StopInstanceResponse stopInstanceResponse() {
		return new com.aliyuncs.ecs.model.v20140526.StopInstanceResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateNatGatewayResponse createNatGatewayResponse() {
		return new com.aliyuncs.ecs.model.v20140526.CreateNatGatewayResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeHaVipsResponse describeHaVipsResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeHaVipsResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.AllocateDedicatedHostsResponse allocateDedicatedHostsResponse() {
		return new com.aliyuncs.ecs.model.v20140526.AllocateDedicatedHostsResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.EipNotifyPaidRequest eipNotifyPaidRequest() {
		return new com.aliyuncs.ecs.model.v20140526.EipNotifyPaidRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteVirtualBorderRouterResponse deleteVirtualBorderRouterResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteVirtualBorderRouterResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyPhysicalConnectionAttributeRequest modifyPhysicalConnectionAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyPhysicalConnectionAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeSnapshotsUsageRequest describeSnapshotsUsageRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeSnapshotsUsageRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeSecurityGroupReferencesRequest describeSecurityGroupReferencesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeSecurityGroupReferencesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CancelPhysicalConnectionRequest cancelPhysicalConnectionRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CancelPhysicalConnectionRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeUserBusinessBehaviorResponse describeUserBusinessBehaviorResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeUserBusinessBehaviorResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteRouterInterfaceResponse deleteRouterInterfaceResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteRouterInterfaceResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.RedeployDedicatedHostResponse redeployDedicatedHostResponse() {
		return new com.aliyuncs.ecs.model.v20140526.RedeployDedicatedHostResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyReservedInstancesResponse modifyReservedInstancesResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyReservedInstancesResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.InstallCloudAssistantRequest installCloudAssistantRequest() {
		return new com.aliyuncs.ecs.model.v20140526.InstallCloudAssistantRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeCloudAssistantStatusResponse describeCloudAssistantStatusResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeCloudAssistantStatusResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeDeploymentSetsRequest describeDeploymentSetsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeDeploymentSetsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CancelCopyImageRequest cancelCopyImageRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CancelCopyImageRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DetachKeyPairResponse detachKeyPairResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DetachKeyPairResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeAutoProvisioningGroupsResponse describeAutoProvisioningGroupsResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeAutoProvisioningGroupsResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.RenewInstanceResponse renewInstanceResponse() {
		return new com.aliyuncs.ecs.model.v20140526.RenewInstanceResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ActivateRouterInterfaceResponse activateRouterInterfaceResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ActivateRouterInterfaceResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribePhysicalConnectionsResponse describePhysicalConnectionsResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribePhysicalConnectionsResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyImageShareGroupPermissionRequest modifyImageShareGroupPermissionRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyImageShareGroupPermissionRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyVSwitchAttributeRequest modifyVSwitchAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyVSwitchAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyDedicatedHostAutoReleaseTimeResponse modifyDedicatedHostAutoReleaseTimeResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyDedicatedHostAutoReleaseTimeResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateForwardEntryResponse createForwardEntryResponse() {
		return new com.aliyuncs.ecs.model.v20140526.CreateForwardEntryResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeSnapshotMonitorDataRequest describeSnapshotMonitorDataRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeSnapshotMonitorDataRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ReActivateInstancesResponse reActivateInstancesResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ReActivateInstancesResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyCommandRequest modifyCommandRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyCommandRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateNetworkInterfacePermissionResponse createNetworkInterfacePermissionResponse() {
		return new com.aliyuncs.ecs.model.v20140526.CreateNetworkInterfacePermissionResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.CancelSimulatedSystemEventsResponse cancelSimulatedSystemEventsResponse() {
		return new com.aliyuncs.ecs.model.v20140526.CancelSimulatedSystemEventsResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ReleasePublicIpAddressResponse releasePublicIpAddressResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ReleasePublicIpAddressResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifySecurityGroupEgressRuleResponse modifySecurityGroupEgressRuleResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifySecurityGroupEgressRuleResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifySecurityGroupPolicyRequest modifySecurityGroupPolicyRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifySecurityGroupPolicyRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeDeploymentSetsResponse describeDeploymentSetsResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeDeploymentSetsResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.RenewInstanceRequest renewInstanceRequest() {
		return new com.aliyuncs.ecs.model.v20140526.RenewInstanceRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceAttributeRequest describeInstanceAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstanceAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateKeyPairResponse createKeyPairResponse() {
		return new com.aliyuncs.ecs.model.v20140526.CreateKeyPairResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ImportImageRequest importImageRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ImportImageRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ReActivateInstancesRequest reActivateInstancesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ReActivateInstancesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ReleaseDedicatedHostResponse releaseDedicatedHostResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ReleaseDedicatedHostResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.GetInstanceScreenshotRequest getInstanceScreenshotRequest() {
		return new com.aliyuncs.ecs.model.v20140526.GetInstanceScreenshotRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyAutoProvisioningGroupRequest modifyAutoProvisioningGroupRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyAutoProvisioningGroupRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeRouterInterfacesResponse describeRouterInterfacesResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeRouterInterfacesResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.AttachInstanceRamRoleResponse attachInstanceRamRoleResponse() {
		return new com.aliyuncs.ecs.model.v20140526.AttachInstanceRamRoleResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteDeploymentSetResponse deleteDeploymentSetResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteDeploymentSetResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.UnassignIpv6AddressesRequest unassignIpv6AddressesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.UnassignIpv6AddressesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceRamRoleResponse describeInstanceRamRoleResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstanceRamRoleResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.GetInstanceScreenshotResponse getInstanceScreenshotResponse() {
		return new com.aliyuncs.ecs.model.v20140526.GetInstanceScreenshotResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ExportSnapshotResponse exportSnapshotResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ExportSnapshotResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyForwardEntryRequest modifyForwardEntryRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyForwardEntryRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.AllocatePublicIpAddressResponse allocatePublicIpAddressResponse() {
		return new com.aliyuncs.ecs.model.v20140526.AllocatePublicIpAddressResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyUserBusinessBehaviorRequest modifyUserBusinessBehaviorRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyUserBusinessBehaviorRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeEipMonitorDataRequest describeEipMonitorDataRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeEipMonitorDataRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.AssociateEipAddressRequest associateEipAddressRequest() {
		return new com.aliyuncs.ecs.model.v20140526.AssociateEipAddressRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyVRouterAttributeRequest modifyVRouterAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyVRouterAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInvocationResultsResponse describeInvocationResultsResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInvocationResultsResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeStorageSetDetailsResponse describeStorageSetDetailsResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeStorageSetDetailsResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeSnapshotLinksResponse describeSnapshotLinksResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeSnapshotLinksResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyDeploymentSetAttributeResponse modifyDeploymentSetAttributeResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyDeploymentSetAttributeResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyRouterInterfaceSpecResponse modifyRouterInterfaceSpecResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyRouterInterfaceSpecResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyStorageSetAttributeRequest modifyStorageSetAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyStorageSetAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.EipNotifyPaidResponse eipNotifyPaidResponse() {
		return new com.aliyuncs.ecs.model.v20140526.EipNotifyPaidResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeUserBusinessBehaviorRequest describeUserBusinessBehaviorRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeUserBusinessBehaviorRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteAutoProvisioningGroupResponse deleteAutoProvisioningGroupResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteAutoProvisioningGroupResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.AttachDiskResponse attachDiskResponse() {
		return new com.aliyuncs.ecs.model.v20140526.AttachDiskResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ReleaseEipAddressRequest releaseEipAddressRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ReleaseEipAddressRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ImportKeyPairRequest importKeyPairRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ImportKeyPairRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyVpcAttributeRequest modifyVpcAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyVpcAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.AuthorizeSecurityGroupResponse authorizeSecurityGroupResponse() {
		return new com.aliyuncs.ecs.model.v20140526.AuthorizeSecurityGroupResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.AssignPrivateIpAddressesResponse assignPrivateIpAddressesResponse() {
		return new com.aliyuncs.ecs.model.v20140526.AssignPrivateIpAddressesResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceTopologyRequest describeInstanceTopologyRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstanceTopologyRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceVncPasswdResponse describeInstanceVncPasswdResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstanceVncPasswdResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.CancelCopyImageResponse cancelCopyImageResponse() {
		return new com.aliyuncs.ecs.model.v20140526.CancelCopyImageResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyUserBusinessBehaviorResponse modifyUserBusinessBehaviorResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyUserBusinessBehaviorResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyImageShareGroupPermissionResponse modifyImageShareGroupPermissionResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyImageShareGroupPermissionResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyInstanceNetworkSpecResponse modifyInstanceNetworkSpecResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyInstanceNetworkSpecResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ReplaceSystemDiskResponse replaceSystemDiskResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ReplaceSystemDiskResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeResourceByTagsRequest describeResourceByTagsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeResourceByTagsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeTaskAttributeResponse describeTaskAttributeResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeTaskAttributeResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceRequest describeRenewalPriceRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateNetworkInterfaceRequest createNetworkInterfaceRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateNetworkInterfaceRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyLaunchTemplateDefaultVersionRequest modifyLaunchTemplateDefaultVersionRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyLaunchTemplateDefaultVersionRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.AuthorizeSecurityGroupEgressRequest authorizeSecurityGroupEgressRequest() {
		return new com.aliyuncs.ecs.model.v20140526.AuthorizeSecurityGroupEgressRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceAutoRenewAttributeResponse describeInstanceAutoRenewAttributeResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstanceAutoRenewAttributeResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyInstanceAutoRenewAttributeResponse modifyInstanceAutoRenewAttributeResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyInstanceAutoRenewAttributeResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.RedeployDedicatedHostRequest redeployDedicatedHostRequest() {
		return new com.aliyuncs.ecs.model.v20140526.RedeployDedicatedHostRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeDisksResponse describeDisksResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeDisksResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.UnassignPrivateIpAddressesResponse unassignPrivateIpAddressesResponse() {
		return new com.aliyuncs.ecs.model.v20140526.UnassignPrivateIpAddressesResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyInstanceNetworkSpecRequest modifyInstanceNetworkSpecRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyInstanceNetworkSpecRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.UnassociateEipAddressRequest unassociateEipAddressRequest() {
		return new com.aliyuncs.ecs.model.v20140526.UnassociateEipAddressRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeReservedInstancesResponse describeReservedInstancesResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeReservedInstancesResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyRouterInterfaceAttributeRequest modifyRouterInterfaceAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyRouterInterfaceAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.EnablePhysicalConnectionRequest enablePhysicalConnectionRequest() {
		return new com.aliyuncs.ecs.model.v20140526.EnablePhysicalConnectionRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeEniMonitorDataRequest describeEniMonitorDataRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeEniMonitorDataRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateCommandResponse createCommandResponse() {
		return new com.aliyuncs.ecs.model.v20140526.CreateCommandResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeRouterInterfacesRequest describeRouterInterfacesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeRouterInterfacesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeClassicLinkInstancesRequest describeClassicLinkInstancesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeClassicLinkInstancesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostTypesResponse describeDedicatedHostTypesResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostTypesResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteNetworkInterfacePermissionResponse deleteNetworkInterfacePermissionResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteNetworkInterfacePermissionResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyDiskSpecResponse modifyDiskSpecResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyDiskSpecResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeCloudAssistantStatusRequest describeCloudAssistantStatusRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeCloudAssistantStatusRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateSecurityGroupResponse createSecurityGroupResponse() {
		return new com.aliyuncs.ecs.model.v20140526.CreateSecurityGroupResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeSnapshotsRequest describeSnapshotsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeSnapshotsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeKeyPairsResponse describeKeyPairsResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeKeyPairsResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.EipFillProductRequest eipFillProductRequest() {
		return new com.aliyuncs.ecs.model.v20140526.EipFillProductRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateSimulatedSystemEventsRequest createSimulatedSystemEventsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateSimulatedSystemEventsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreatePhysicalConnectionRequest createPhysicalConnectionRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreatePhysicalConnectionRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.AuthorizeSecurityGroupRequest authorizeSecurityGroupRequest() {
		return new com.aliyuncs.ecs.model.v20140526.AuthorizeSecurityGroupRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyDiskChargeTypeResponse modifyDiskChargeTypeResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyDiskChargeTypeResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfacesResponse describeNetworkInterfacesResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfacesResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteVSwitchResponse deleteVSwitchResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteVSwitchResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DeletePhysicalConnectionRequest deletePhysicalConnectionRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeletePhysicalConnectionRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteLaunchTemplateResponse deleteLaunchTemplateResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteLaunchTemplateResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeNatGatewaysResponse describeNatGatewaysResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeNatGatewaysResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.AssignPrivateIpAddressesRequest assignPrivateIpAddressesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.AssignPrivateIpAddressesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeVpcsResponse describeVpcsResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeVpcsResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DetachInstanceRamRoleRequest detachInstanceRamRoleRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DetachInstanceRamRoleRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.InvokeCommandRequest invokeCommandRequest() {
		return new com.aliyuncs.ecs.model.v20140526.InvokeCommandRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.EipFillParamsRequest eipFillParamsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.EipFillParamsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ExportImageRequest exportImageRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ExportImageRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteImageResponse deleteImageResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteImageResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateHpcClusterRequest createHpcClusterRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateHpcClusterRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteRouterInterfaceRequest deleteRouterInterfaceRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteRouterInterfaceRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CancelTaskResponse cancelTaskResponse() {
		return new com.aliyuncs.ecs.model.v20140526.CancelTaskResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateSnapshotRequest createSnapshotRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateSnapshotRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeTasksResponse describeTasksResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeTasksResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeResourcesModificationRequest describeResourcesModificationRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeResourcesModificationRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DetachInstanceRamRoleResponse detachInstanceRamRoleResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DetachInstanceRamRoleResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifySnapshotAttributeResponse modifySnapshotAttributeResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifySnapshotAttributeResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyBandwidthPackageSpecRequest modifyBandwidthPackageSpecRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyBandwidthPackageSpecRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateAutoProvisioningGroupRequest createAutoProvisioningGroupRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateAutoProvisioningGroupRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.AssignIpv6AddressesResponse assignIpv6AddressesResponse() {
		return new com.aliyuncs.ecs.model.v20140526.AssignIpv6AddressesResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeImageSupportInstanceTypesResponse describeImageSupportInstanceTypesResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeImageSupportInstanceTypesResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.StartInstanceRequest startInstanceRequest() {
		return new com.aliyuncs.ecs.model.v20140526.StartInstanceRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeLaunchTemplateVersionsResponse describeLaunchTemplateVersionsResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeLaunchTemplateVersionsResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ConvertNatPublicIpToEipRequest convertNatPublicIpToEipRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ConvertNatPublicIpToEipRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.RevokeSecurityGroupRequest revokeSecurityGroupRequest() {
		return new com.aliyuncs.ecs.model.v20140526.RevokeSecurityGroupRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeSnapshotPackageResponse describeSnapshotPackageResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeSnapshotPackageResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeVirtualBorderRoutersForPhysicalConnectionRequest describeVirtualBorderRoutersForPhysicalConnectionRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeVirtualBorderRoutersForPhysicalConnectionRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ReplaceSystemDiskRequest replaceSystemDiskRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ReplaceSystemDiskRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteInstancesResponse deleteInstancesResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteInstancesResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeLimitationResponse describeLimitationResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeLimitationResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.RemoveBandwidthPackageIpsResponse removeBandwidthPackageIpsResponse() {
		return new com.aliyuncs.ecs.model.v20140526.RemoveBandwidthPackageIpsResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.TerminateVirtualBorderRouterRequest terminateVirtualBorderRouterRequest() {
		return new com.aliyuncs.ecs.model.v20140526.TerminateVirtualBorderRouterRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.AssignIpv6AddressesRequest assignIpv6AddressesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.AssignIpv6AddressesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeClustersResponse describeClustersResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeClustersResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ExportImageResponse exportImageResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ExportImageResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeImagesResponse describeImagesResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeImagesResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeRecommendInstanceTypeResponse describeRecommendInstanceTypeResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeRecommendInstanceTypeResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeStorageSetsRequest describeStorageSetsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeStorageSetsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.RemoveBandwidthPackageIpsRequest removeBandwidthPackageIpsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.RemoveBandwidthPackageIpsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeStorageSetsResponse describeStorageSetsResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeStorageSetsResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.PurchaseReservedInstancesOfferingResponse purchaseReservedInstancesOfferingResponse() {
		return new com.aliyuncs.ecs.model.v20140526.PurchaseReservedInstancesOfferingResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeVSwitchesResponse describeVSwitchesResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeVSwitchesResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteBandwidthPackageResponse deleteBandwidthPackageResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteBandwidthPackageResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateHpcClusterResponse createHpcClusterResponse() {
		return new com.aliyuncs.ecs.model.v20140526.CreateHpcClusterResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteSecurityGroupResponse deleteSecurityGroupResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteSecurityGroupResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeLaunchTemplatesResponse describeLaunchTemplatesResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeLaunchTemplatesResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfacesRequest describeNetworkInterfacesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfacesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyDeploymentSetAttributeRequest modifyDeploymentSetAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyDeploymentSetAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeClassicLinkInstancesResponse describeClassicLinkInstancesResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeClassicLinkInstancesResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ResizeDiskRequest resizeDiskRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ResizeDiskRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateNetworkInterfacePermissionRequest createNetworkInterfacePermissionRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateNetworkInterfacePermissionRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateHaVipRequest createHaVipRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateHaVipRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateVSwitchResponse createVSwitchResponse() {
		return new com.aliyuncs.ecs.model.v20140526.CreateVSwitchResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyDiskSpecRequest modifyDiskSpecRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyDiskSpecRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyAutoProvisioningGroupResponse modifyAutoProvisioningGroupResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyAutoProvisioningGroupResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeReservedInstancesRequest describeReservedInstancesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeReservedInstancesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeEipAddressesResponse describeEipAddressesResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeEipAddressesResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifySecurityGroupRuleResponse modifySecurityGroupRuleResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifySecurityGroupRuleResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteDemandResponse deleteDemandResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteDemandResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfacePermissionsRequest describeNetworkInterfacePermissionsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfacePermissionsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyEipAddressAttributeResponse modifyEipAddressAttributeResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyEipAddressAttributeResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyInstanceVpcAttributeResponse modifyInstanceVpcAttributeResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyInstanceVpcAttributeResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.AllocateEipAddressResponse allocateEipAddressResponse() {
		return new com.aliyuncs.ecs.model.v20140526.AllocateEipAddressResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateCommandRequest createCommandRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateCommandRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeUserDataResponse describeUserDataResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeUserDataResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.AttachKeyPairRequest attachKeyPairRequest() {
		return new com.aliyuncs.ecs.model.v20140526.AttachKeyPairRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateSecurityGroupRequest createSecurityGroupRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateSecurityGroupRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyAutoSnapshotPolicyRequest modifyAutoSnapshotPolicyRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyAutoSnapshotPolicyRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInvocationsRequest describeInvocationsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInvocationsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteAutoSnapshotPolicyResponse deleteAutoSnapshotPolicyResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteAutoSnapshotPolicyResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifySecurityGroupPolicyResponse modifySecurityGroupPolicyResponse() {
		return new com.aliyuncs.ecs.model.v20140526.ModifySecurityGroupPolicyResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostAutoRenewRequest describeDedicatedHostAutoRenewRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostAutoRenewRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteForwardEntryRequest deleteForwardEntryRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteForwardEntryRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyInstanceVpcAttributeRequest modifyInstanceVpcAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyInstanceVpcAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.RevokeSecurityGroupEgressRequest revokeSecurityGroupEgressRequest() {
		return new com.aliyuncs.ecs.model.v20140526.RevokeSecurityGroupEgressRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostTypesRequest describeDedicatedHostTypesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostTypesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.InstallCloudAssistantResponse installCloudAssistantResponse() {
		return new com.aliyuncs.ecs.model.v20140526.InstallCloudAssistantResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.TagResourcesResponse tagResourcesResponse() {
		return new com.aliyuncs.ecs.model.v20140526.TagResourcesResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyDedicatedHostAttributeRequest modifyDedicatedHostAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyDedicatedHostAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyEipAddressAttributeRequest modifyEipAddressAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyEipAddressAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateRouterInterfaceRequest createRouterInterfaceRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateRouterInterfaceRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteLaunchTemplateRequest deleteLaunchTemplateRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteLaunchTemplateRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.AttachNetworkInterfaceRequest attachNetworkInterfaceRequest() {
		return new com.aliyuncs.ecs.model.v20140526.AttachNetworkInterfaceRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.GetInstanceConsoleOutputRequest getInstanceConsoleOutputRequest() {
		return new com.aliyuncs.ecs.model.v20140526.GetInstanceConsoleOutputRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateDiskRequest createDiskRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateDiskRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.RunCommandRequest runCommandRequest() {
		return new com.aliyuncs.ecs.model.v20140526.RunCommandRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeDiskMonitorDataRequest describeDiskMonitorDataRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeDiskMonitorDataRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceTypeFamiliesResponse describeInstanceTypeFamiliesResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstanceTypeFamiliesResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteNetworkInterfaceResponse deleteNetworkInterfaceResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteNetworkInterfaceResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeSnapshotMonitorDataResponse describeSnapshotMonitorDataResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeSnapshotMonitorDataResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceMaintenanceAttributesResponse describeInstanceMaintenanceAttributesResponse() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstanceMaintenanceAttributesResponse();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteSnapshotRequest deleteSnapshotRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteSnapshotRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteNetworkInterfaceRequest deleteNetworkInterfaceRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteNetworkInterfaceRequest();
	}

	public static void main(String[] args) throws Exception {
		for (String classname : ClassesInPackageAnalyzer.getAllClasses(PACKAGE, false)) {
			String simplename = classname.substring(classname.lastIndexOf(".") + 1);
			String methodname = simplename.substring(0, 1).toLowerCase() + simplename.substring(1);
			System.out.println("\tpublic " + classname + " " + methodname + "() {");
			System.out.println("\t\treturn new " + classname + "();");
			System.out.println("\t}");
			System.out.println();
		}

	}
}
