package io.github.wukong.aliyun_ecs;

/**
 * Copyright (2019, ) Institute of Software, Chinese Academy of Sciences
 */

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
public class WukongDefaultAcsClient extends DefaultAcsClient {

	public final static Class<?> CLASSNAME = RpcAcsRequest.class;

	public final static String PACKAGE = CreateVpcRequest.class.getPackage().getName();

	public WukongDefaultAcsClient(IClientProfile profile, AlibabaCloudCredentials credentials) {
		super(profile, credentials);
	}

	public WukongDefaultAcsClient(IClientProfile profile, AlibabaCloudCredentialsProvider credentialsProvider) {
		super(profile, credentialsProvider);
	}

	public WukongDefaultAcsClient(IClientProfile profile) {
		super(profile);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribePriceResponse describePriceRequest(com.aliyuncs.ecs.model.v20140526.DescribePriceRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteVpcResponse deleteVpcRequest(com.aliyuncs.ecs.model.v20140526.DeleteVpcRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyRouterInterfaceSpecResponse modifyRouterInterfaceSpecRequest(com.aliyuncs.ecs.model.v20140526.ModifyRouterInterfaceSpecRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.PurchaseReservedInstancesOfferingResponse purchaseReservedInstancesOfferingRequest(com.aliyuncs.ecs.model.v20140526.PurchaseReservedInstancesOfferingRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeClustersResponse describeClustersRequest(com.aliyuncs.ecs.model.v20140526.DescribeClustersRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.CreateNatGatewayResponse createNatGatewayRequest(com.aliyuncs.ecs.model.v20140526.CreateNatGatewayRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeAvailableResourceResponse describeAvailableResourceRequest(com.aliyuncs.ecs.model.v20140526.DescribeAvailableResourceRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ConnectRouterInterfaceResponse connectRouterInterfaceRequest(com.aliyuncs.ecs.model.v20140526.ConnectRouterInterfaceRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DetachDiskResponse detachDiskRequest(com.aliyuncs.ecs.model.v20140526.DetachDiskRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.AttachDiskResponse attachDiskRequest(com.aliyuncs.ecs.model.v20140526.AttachDiskRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.RemoveTagsResponse removeTagsRequest(com.aliyuncs.ecs.model.v20140526.RemoveTagsRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ResetDiskResponse resetDiskRequest(com.aliyuncs.ecs.model.v20140526.ResetDiskRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.CreateKeyPairResponse createKeyPairRequest(com.aliyuncs.ecs.model.v20140526.CreateKeyPairRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.AllocatePublicIpAddressResponse allocatePublicIpAddressRequest(com.aliyuncs.ecs.model.v20140526.AllocatePublicIpAddressRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteKeyPairsResponse deleteKeyPairsRequest(com.aliyuncs.ecs.model.v20140526.DeleteKeyPairsRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeLimitationResponse describeLimitationRequest(com.aliyuncs.ecs.model.v20140526.DescribeLimitationRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifySnapshotAttributeResponse modifySnapshotAttributeRequest(com.aliyuncs.ecs.model.v20140526.ModifySnapshotAttributeRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ReleaseDedicatedHostResponse releaseDedicatedHostRequest(com.aliyuncs.ecs.model.v20140526.ReleaseDedicatedHostRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyInstanceAutoRenewAttributeResponse modifyInstanceAutoRenewAttributeRequest(com.aliyuncs.ecs.model.v20140526.ModifyInstanceAutoRenewAttributeRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceAutoRenewAttributeResponse describeInstanceAutoRenewAttributeRequest(com.aliyuncs.ecs.model.v20140526.DescribeInstanceAutoRenewAttributeRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyAutoSnapshotPolicyExResponse modifyAutoSnapshotPolicyExRequest(com.aliyuncs.ecs.model.v20140526.ModifyAutoSnapshotPolicyExRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostsResponse describeDedicatedHostsRequest(com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostsRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInvocationResultsResponse describeInvocationResultsRequest(com.aliyuncs.ecs.model.v20140526.DescribeInvocationResultsRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.RenewDedicatedHostsResponse renewDedicatedHostsRequest(com.aliyuncs.ecs.model.v20140526.RenewDedicatedHostsRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.AcceptInquiredSystemEventResponse acceptInquiredSystemEventRequest(com.aliyuncs.ecs.model.v20140526.AcceptInquiredSystemEventRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ApplyAutoSnapshotPolicyResponse applyAutoSnapshotPolicyRequest(com.aliyuncs.ecs.model.v20140526.ApplyAutoSnapshotPolicyRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.CreateAutoSnapshotPolicyResponse createAutoSnapshotPolicyRequest(com.aliyuncs.ecs.model.v20140526.CreateAutoSnapshotPolicyRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteNatGatewayResponse deleteNatGatewayRequest(com.aliyuncs.ecs.model.v20140526.DeleteNatGatewayRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.CreateRouteEntryResponse createRouteEntryRequest(com.aliyuncs.ecs.model.v20140526.CreateRouteEntryRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifySecurityGroupAttributeResponse modifySecurityGroupAttributeRequest(com.aliyuncs.ecs.model.v20140526.ModifySecurityGroupAttributeRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceStatusResponse describeInstanceStatusRequest(com.aliyuncs.ecs.model.v20140526.DescribeInstanceStatusRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteCommandResponse deleteCommandRequest(com.aliyuncs.ecs.model.v20140526.DeleteCommandRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteInstancesResponse deleteInstancesRequest(com.aliyuncs.ecs.model.v20140526.DeleteInstancesRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyDiskAttributeResponse modifyDiskAttributeRequest(com.aliyuncs.ecs.model.v20140526.ModifyDiskAttributeRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteNetworkInterfacePermissionResponse deleteNetworkInterfacePermissionRequest(com.aliyuncs.ecs.model.v20140526.DeleteNetworkInterfacePermissionRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeAutoProvisioningGroupInstancesResponse describeAutoProvisioningGroupInstancesRequest(com.aliyuncs.ecs.model.v20140526.DescribeAutoProvisioningGroupInstancesRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeVSwitchesResponse describeVSwitchesRequest(com.aliyuncs.ecs.model.v20140526.DescribeVSwitchesRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeNewProjectEipMonitorDataResponse describeNewProjectEipMonitorDataRequest(com.aliyuncs.ecs.model.v20140526.DescribeNewProjectEipMonitorDataRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.StopInvocationResponse stopInvocationRequest(com.aliyuncs.ecs.model.v20140526.StopInvocationRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyDedicatedHostAutoReleaseTimeResponse modifyDedicatedHostAutoReleaseTimeRequest(com.aliyuncs.ecs.model.v20140526.ModifyDedicatedHostAutoReleaseTimeRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DetachNetworkInterfaceResponse detachNetworkInterfaceRequest(com.aliyuncs.ecs.model.v20140526.DetachNetworkInterfaceRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceTypeFamiliesResponse describeInstanceTypeFamiliesRequest(com.aliyuncs.ecs.model.v20140526.DescribeInstanceTypeFamiliesRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.JoinResourceGroupResponse joinResourceGroupRequest(com.aliyuncs.ecs.model.v20140526.JoinResourceGroupRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.CreateDeploymentSetResponse createDeploymentSetRequest(com.aliyuncs.ecs.model.v20140526.CreateDeploymentSetRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeSpotPriceHistoryResponse describeSpotPriceHistoryRequest(com.aliyuncs.ecs.model.v20140526.DescribeSpotPriceHistoryRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.UnassignPrivateIpAddressesResponse unassignPrivateIpAddressesRequest(com.aliyuncs.ecs.model.v20140526.UnassignPrivateIpAddressesRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifySecurityGroupEgressRuleResponse modifySecurityGroupEgressRuleRequest(com.aliyuncs.ecs.model.v20140526.ModifySecurityGroupEgressRuleRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeSnapshotPackageResponse describeSnapshotPackageRequest(com.aliyuncs.ecs.model.v20140526.DescribeSnapshotPackageRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.AttachClassicLinkVpcResponse attachClassicLinkVpcRequest(com.aliyuncs.ecs.model.v20140526.AttachClassicLinkVpcRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.CancelTaskResponse cancelTaskRequest(com.aliyuncs.ecs.model.v20140526.CancelTaskRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeLaunchTemplatesResponse describeLaunchTemplatesRequest(com.aliyuncs.ecs.model.v20140526.DescribeLaunchTemplatesRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteAutoSnapshotPolicyResponse deleteAutoSnapshotPolicyRequest(com.aliyuncs.ecs.model.v20140526.DeleteAutoSnapshotPolicyRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.CancelSimulatedSystemEventsResponse cancelSimulatedSystemEventsRequest(com.aliyuncs.ecs.model.v20140526.CancelSimulatedSystemEventsRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.AddTagsResponse addTagsRequest(com.aliyuncs.ecs.model.v20140526.AddTagsRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeBandwidthPackagesResponse describeBandwidthPackagesRequest(com.aliyuncs.ecs.model.v20140526.DescribeBandwidthPackagesRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeTaskAttributeResponse describeTaskAttributeRequest(com.aliyuncs.ecs.model.v20140526.DescribeTaskAttributeRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeUserDataResponse describeUserDataRequest(com.aliyuncs.ecs.model.v20140526.DescribeUserDataRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeHpcClustersResponse describeHpcClustersRequest(com.aliyuncs.ecs.model.v20140526.DescribeHpcClustersRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ActivateRouterInterfaceResponse activateRouterInterfaceRequest(com.aliyuncs.ecs.model.v20140526.ActivateRouterInterfaceRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DetachKeyPairResponse detachKeyPairRequest(com.aliyuncs.ecs.model.v20140526.DetachKeyPairRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteStorageSetResponse deleteStorageSetRequest(com.aliyuncs.ecs.model.v20140526.DeleteStorageSetRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeSecurityGroupAttributeResponse describeSecurityGroupAttributeRequest(com.aliyuncs.ecs.model.v20140526.DescribeSecurityGroupAttributeRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyInstanceVncPasswdResponse modifyInstanceVncPasswdRequest(com.aliyuncs.ecs.model.v20140526.ModifyInstanceVncPasswdRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteVSwitchResponse deleteVSwitchRequest(com.aliyuncs.ecs.model.v20140526.DeleteVSwitchRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.CreateVSwitchResponse createVSwitchRequest(com.aliyuncs.ecs.model.v20140526.CreateVSwitchRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeCommandsResponse describeCommandsRequest(com.aliyuncs.ecs.model.v20140526.DescribeCommandsRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceRamRoleResponse describeInstanceRamRoleRequest(com.aliyuncs.ecs.model.v20140526.DescribeInstanceRamRoleRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse describeInstancesRequest(com.aliyuncs.ecs.model.v20140526.DescribeInstancesRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DeactivateRouterInterfaceResponse deactivateRouterInterfaceRequest(com.aliyuncs.ecs.model.v20140526.DeactivateRouterInterfaceRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeVpcsResponse describeVpcsRequest(com.aliyuncs.ecs.model.v20140526.DescribeVpcsRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteImageResponse deleteImageRequest(com.aliyuncs.ecs.model.v20140526.DeleteImageRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyDemandResponse modifyDemandRequest(com.aliyuncs.ecs.model.v20140526.ModifyDemandRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeAccountAttributesResponse describeAccountAttributesRequest(com.aliyuncs.ecs.model.v20140526.DescribeAccountAttributesRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeRecommendInstanceTypeResponse describeRecommendInstanceTypeRequest(com.aliyuncs.ecs.model.v20140526.DescribeRecommendInstanceTypeRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.TagResourcesResponse tagResourcesRequest(com.aliyuncs.ecs.model.v20140526.TagResourcesRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeAutoProvisioningGroupsResponse describeAutoProvisioningGroupsRequest(com.aliyuncs.ecs.model.v20140526.DescribeAutoProvisioningGroupsRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeTasksResponse describeTasksRequest(com.aliyuncs.ecs.model.v20140526.DescribeTasksRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.CreateForwardEntryResponse createForwardEntryRequest(com.aliyuncs.ecs.model.v20140526.CreateForwardEntryRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyInstanceChargeTypeResponse modifyInstanceChargeTypeRequest(com.aliyuncs.ecs.model.v20140526.ModifyInstanceChargeTypeRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteAutoProvisioningGroupResponse deleteAutoProvisioningGroupRequest(com.aliyuncs.ecs.model.v20140526.DeleteAutoProvisioningGroupRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyInstanceAutoReleaseTimeResponse modifyInstanceAutoReleaseTimeRequest(com.aliyuncs.ecs.model.v20140526.ModifyInstanceAutoReleaseTimeRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.TerminatePhysicalConnectionResponse terminatePhysicalConnectionRequest(com.aliyuncs.ecs.model.v20140526.TerminatePhysicalConnectionRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ImportSnapshotResponse importSnapshotRequest(com.aliyuncs.ecs.model.v20140526.ImportSnapshotRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.CreateVirtualBorderRouterResponse createVirtualBorderRouterRequest(com.aliyuncs.ecs.model.v20140526.CreateVirtualBorderRouterRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteDeploymentSetResponse deleteDeploymentSetRequest(com.aliyuncs.ecs.model.v20140526.DeleteDeploymentSetRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeAutoSnapshotPolicyExResponse describeAutoSnapshotPolicyExRequest(com.aliyuncs.ecs.model.v20140526.DescribeAutoSnapshotPolicyExRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeAccessPointsResponse describeAccessPointsRequest(com.aliyuncs.ecs.model.v20140526.DescribeAccessPointsRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeRegionsResponse describeRegionsRequest(com.aliyuncs.ecs.model.v20140526.DescribeRegionsRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.LeaveSecurityGroupResponse leaveSecurityGroupRequest(com.aliyuncs.ecs.model.v20140526.LeaveSecurityGroupRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyDiskChargeTypeResponse modifyDiskChargeTypeRequest(com.aliyuncs.ecs.model.v20140526.ModifyDiskChargeTypeRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteDemandResponse deleteDemandRequest(com.aliyuncs.ecs.model.v20140526.DeleteDemandRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyReservedInstanceAttributeResponse modifyReservedInstanceAttributeRequest(com.aliyuncs.ecs.model.v20140526.ModifyReservedInstanceAttributeRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.CreateDemandResponse createDemandRequest(com.aliyuncs.ecs.model.v20140526.CreateDemandRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyInstanceMaintenanceAttributesResponse modifyInstanceMaintenanceAttributesRequest(com.aliyuncs.ecs.model.v20140526.ModifyInstanceMaintenanceAttributesRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.JoinSecurityGroupResponse joinSecurityGroupRequest(com.aliyuncs.ecs.model.v20140526.JoinSecurityGroupRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.CreateStorageSetResponse createStorageSetRequest(com.aliyuncs.ecs.model.v20140526.CreateStorageSetRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribePhysicalConnectionsResponse describePhysicalConnectionsRequest(com.aliyuncs.ecs.model.v20140526.DescribePhysicalConnectionsRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DetachClassicLinkVpcResponse detachClassicLinkVpcRequest(com.aliyuncs.ecs.model.v20140526.DetachClassicLinkVpcRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeImageSupportInstanceTypesResponse describeImageSupportInstanceTypesRequest(com.aliyuncs.ecs.model.v20140526.DescribeImageSupportInstanceTypesRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeSecurityGroupsResponse describeSecurityGroupsRequest(com.aliyuncs.ecs.model.v20140526.DescribeSecurityGroupsRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyImageAttributeResponse modifyImageAttributeRequest(com.aliyuncs.ecs.model.v20140526.ModifyImageAttributeRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteSecurityGroupResponse deleteSecurityGroupRequest(com.aliyuncs.ecs.model.v20140526.DeleteSecurityGroupRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceVncPasswdResponse describeInstanceVncPasswdRequest(com.aliyuncs.ecs.model.v20140526.DescribeInstanceVncPasswdRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeStorageSetDetailsResponse describeStorageSetDetailsRequest(com.aliyuncs.ecs.model.v20140526.DescribeStorageSetDetailsRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.RedeployInstanceResponse redeployInstanceRequest(com.aliyuncs.ecs.model.v20140526.RedeployInstanceRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteLaunchTemplateVersionResponse deleteLaunchTemplateVersionRequest(com.aliyuncs.ecs.model.v20140526.DeleteLaunchTemplateVersionRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeSnapshotLinksResponse describeSnapshotLinksRequest(com.aliyuncs.ecs.model.v20140526.DescribeSnapshotLinksRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.UntagResourcesResponse untagResourcesRequest(com.aliyuncs.ecs.model.v20140526.UntagResourcesRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ListTagResourcesResponse listTagResourcesRequest(com.aliyuncs.ecs.model.v20140526.ListTagResourcesRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeDisksResponse describeDisksRequest(com.aliyuncs.ecs.model.v20140526.DescribeDisksRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.CopyImageResponse copyImageRequest(com.aliyuncs.ecs.model.v20140526.CopyImageRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyImageSharePermissionResponse modifyImageSharePermissionRequest(com.aliyuncs.ecs.model.v20140526.ModifyImageSharePermissionRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeHaVipsResponse describeHaVipsRequest(com.aliyuncs.ecs.model.v20140526.DescribeHaVipsRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeVirtualBorderRoutersResponse describeVirtualBorderRoutersRequest(com.aliyuncs.ecs.model.v20140526.DescribeVirtualBorderRoutersRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyInstanceDeploymentResponse modifyInstanceDeploymentRequest(com.aliyuncs.ecs.model.v20140526.ModifyInstanceDeploymentRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ReleasePublicIpAddressResponse releasePublicIpAddressRequest(com.aliyuncs.ecs.model.v20140526.ReleasePublicIpAddressRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.CreateImageResponse createImageRequest(com.aliyuncs.ecs.model.v20140526.CreateImageRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeDisksFullStatusResponse describeDisksFullStatusRequest(com.aliyuncs.ecs.model.v20140526.DescribeDisksFullStatusRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceMaintenanceAttributesResponse describeInstanceMaintenanceAttributesRequest(com.aliyuncs.ecs.model.v20140526.DescribeInstanceMaintenanceAttributesRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ExportSnapshotResponse exportSnapshotRequest(com.aliyuncs.ecs.model.v20140526.ExportSnapshotRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeNatGatewaysResponse describeNatGatewaysRequest(com.aliyuncs.ecs.model.v20140526.DescribeNatGatewaysRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyHaVipAttributeResponse modifyHaVipAttributeRequest(com.aliyuncs.ecs.model.v20140526.ModifyHaVipAttributeRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyInstanceAttributeResponse modifyInstanceAttributeRequest(com.aliyuncs.ecs.model.v20140526.ModifyInstanceAttributeRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.StopInstanceResponse stopInstanceRequest(com.aliyuncs.ecs.model.v20140526.StopInstanceRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ReInitDiskResponse reInitDiskRequest(com.aliyuncs.ecs.model.v20140526.ReInitDiskRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeBandwidthLimitationResponse describeBandwidthLimitationRequest(com.aliyuncs.ecs.model.v20140526.DescribeBandwidthLimitationRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeForwardTableEntriesResponse describeForwardTableEntriesRequest(com.aliyuncs.ecs.model.v20140526.DescribeForwardTableEntriesRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.RebootInstanceResponse rebootInstanceRequest(com.aliyuncs.ecs.model.v20140526.RebootInstanceRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteHaVipResponse deleteHaVipRequest(com.aliyuncs.ecs.model.v20140526.DeleteHaVipRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeVRoutersResponse describeVRoutersRequest(com.aliyuncs.ecs.model.v20140526.DescribeVRoutersRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteVirtualBorderRouterResponse deleteVirtualBorderRouterRequest(com.aliyuncs.ecs.model.v20140526.DeleteVirtualBorderRouterRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteBandwidthPackageResponse deleteBandwidthPackageRequest(com.aliyuncs.ecs.model.v20140526.DeleteBandwidthPackageRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyHpcClusterAttributeResponse modifyHpcClusterAttributeRequest(com.aliyuncs.ecs.model.v20140526.ModifyHpcClusterAttributeRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.CancelAutoSnapshotPolicyResponse cancelAutoSnapshotPolicyRequest(com.aliyuncs.ecs.model.v20140526.CancelAutoSnapshotPolicyRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.UnassociateHaVipResponse unassociateHaVipRequest(com.aliyuncs.ecs.model.v20140526.UnassociateHaVipRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.RecoverVirtualBorderRouterResponse recoverVirtualBorderRouterRequest(com.aliyuncs.ecs.model.v20140526.RecoverVirtualBorderRouterRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.CreateVpcResponse createVpcRequest(com.aliyuncs.ecs.model.v20140526.CreateVpcRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeZonesResponse describeZonesRequest(com.aliyuncs.ecs.model.v20140526.DescribeZonesRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.CreateInstanceResponse createInstanceRequest(com.aliyuncs.ecs.model.v20140526.CreateInstanceRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.AttachInstanceRamRoleResponse attachInstanceRamRoleRequest(com.aliyuncs.ecs.model.v20140526.AttachInstanceRamRoleRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeLaunchTemplateVersionsResponse describeLaunchTemplateVersionsRequest(com.aliyuncs.ecs.model.v20140526.DescribeLaunchTemplateVersionsRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyVirtualBorderRouterAttributeResponse modifyVirtualBorderRouterAttributeRequest(com.aliyuncs.ecs.model.v20140526.ModifyVirtualBorderRouterAttributeRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceMonitorDataResponse describeInstanceMonitorDataRequest(com.aliyuncs.ecs.model.v20140526.DescribeInstanceMonitorDataRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeEipAddressesResponse describeEipAddressesRequest(com.aliyuncs.ecs.model.v20140526.DescribeEipAddressesRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.AddBandwidthPackageIpsResponse addBandwidthPackageIpsRequest(com.aliyuncs.ecs.model.v20140526.AddBandwidthPackageIpsRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.AllocateDedicatedHostsResponse allocateDedicatedHostsRequest(com.aliyuncs.ecs.model.v20140526.AllocateDedicatedHostsRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ReportInstancesStatusResponse reportInstancesStatusRequest(com.aliyuncs.ecs.model.v20140526.ReportInstancesStatusRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteInstanceResponse deleteInstanceRequest(com.aliyuncs.ecs.model.v20140526.DeleteInstanceRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifySecurityGroupRuleResponse modifySecurityGroupRuleRequest(com.aliyuncs.ecs.model.v20140526.ModifySecurityGroupRuleRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyPrepayInstanceSpecResponse modifyPrepayInstanceSpecRequest(com.aliyuncs.ecs.model.v20140526.ModifyPrepayInstanceSpecRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyDedicatedHostAutoRenewAttributeResponse modifyDedicatedHostAutoRenewAttributeRequest(com.aliyuncs.ecs.model.v20140526.ModifyDedicatedHostAutoRenewAttributeRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceTypesResponse describeInstanceTypesRequest(com.aliyuncs.ecs.model.v20140526.DescribeInstanceTypesRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyInstanceSpecResponse modifyInstanceSpecRequest(com.aliyuncs.ecs.model.v20140526.ModifyInstanceSpecRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyReservedInstancesResponse modifyReservedInstancesRequest(com.aliyuncs.ecs.model.v20140526.ModifyReservedInstancesRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeDemandsResponse describeDemandsRequest(com.aliyuncs.ecs.model.v20140526.DescribeDemandsRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeKeyPairsResponse describeKeyPairsRequest(com.aliyuncs.ecs.model.v20140526.DescribeKeyPairsRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.CreateLaunchTemplateVersionResponse createLaunchTemplateVersionRequest(com.aliyuncs.ecs.model.v20140526.CreateLaunchTemplateVersionRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteDiskResponse deleteDiskRequest(com.aliyuncs.ecs.model.v20140526.DeleteDiskRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.AssociateHaVipResponse associateHaVipRequest(com.aliyuncs.ecs.model.v20140526.AssociateHaVipRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeRouteTablesResponse describeRouteTablesRequest(com.aliyuncs.ecs.model.v20140526.DescribeRouteTablesRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceHistoryEventsResponse describeInstanceHistoryEventsRequest(com.aliyuncs.ecs.model.v20140526.DescribeInstanceHistoryEventsRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeTagsResponse describeTagsRequest(com.aliyuncs.ecs.model.v20140526.DescribeTagsRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyNetworkInterfaceAttributeResponse modifyNetworkInterfaceAttributeRequest(com.aliyuncs.ecs.model.v20140526.ModifyNetworkInterfaceAttributeRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeImagesResponse describeImagesRequest(com.aliyuncs.ecs.model.v20140526.DescribeImagesRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.CreateLaunchTemplateResponse createLaunchTemplateRequest(com.aliyuncs.ecs.model.v20140526.CreateLaunchTemplateRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeAutoProvisioningGroupHistoryResponse describeAutoProvisioningGroupHistoryRequest(com.aliyuncs.ecs.model.v20140526.DescribeAutoProvisioningGroupHistoryRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.RunInstancesResponse runInstancesRequest(com.aliyuncs.ecs.model.v20140526.RunInstancesRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.AllocateEipAddressResponse allocateEipAddressRequest(com.aliyuncs.ecs.model.v20140526.AllocateEipAddressRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteRouteEntryResponse deleteRouteEntryRequest(com.aliyuncs.ecs.model.v20140526.DeleteRouteEntryRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstancesFullStatusResponse describeInstancesFullStatusRequest(com.aliyuncs.ecs.model.v20140526.DescribeInstancesFullStatusRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteHpcClusterResponse deleteHpcClusterRequest(com.aliyuncs.ecs.model.v20140526.DeleteHpcClusterRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceVncUrlResponse describeInstanceVncUrlRequest(com.aliyuncs.ecs.model.v20140526.DescribeInstanceVncUrlRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeImageSharePermissionResponse describeImageSharePermissionRequest(com.aliyuncs.ecs.model.v20140526.DescribeImageSharePermissionRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.EipNotifyPaidResponse eipNotifyPaidRequest(com.aliyuncs.ecs.model.v20140526.EipNotifyPaidRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyPhysicalConnectionAttributeResponse modifyPhysicalConnectionAttributeRequest(com.aliyuncs.ecs.model.v20140526.ModifyPhysicalConnectionAttributeRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeSnapshotsUsageResponse describeSnapshotsUsageRequest(com.aliyuncs.ecs.model.v20140526.DescribeSnapshotsUsageRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeSecurityGroupReferencesResponse describeSecurityGroupReferencesRequest(com.aliyuncs.ecs.model.v20140526.DescribeSecurityGroupReferencesRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.CancelPhysicalConnectionResponse cancelPhysicalConnectionRequest(com.aliyuncs.ecs.model.v20140526.CancelPhysicalConnectionRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.InstallCloudAssistantResponse installCloudAssistantRequest(com.aliyuncs.ecs.model.v20140526.InstallCloudAssistantRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeDeploymentSetsResponse describeDeploymentSetsRequest(com.aliyuncs.ecs.model.v20140526.DescribeDeploymentSetsRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.CancelCopyImageResponse cancelCopyImageRequest(com.aliyuncs.ecs.model.v20140526.CancelCopyImageRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyImageShareGroupPermissionResponse modifyImageShareGroupPermissionRequest(com.aliyuncs.ecs.model.v20140526.ModifyImageShareGroupPermissionRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyVSwitchAttributeResponse modifyVSwitchAttributeRequest(com.aliyuncs.ecs.model.v20140526.ModifyVSwitchAttributeRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeSnapshotMonitorDataResponse describeSnapshotMonitorDataRequest(com.aliyuncs.ecs.model.v20140526.DescribeSnapshotMonitorDataRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyCommandResponse modifyCommandRequest(com.aliyuncs.ecs.model.v20140526.ModifyCommandRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifySecurityGroupPolicyResponse modifySecurityGroupPolicyRequest(com.aliyuncs.ecs.model.v20140526.ModifySecurityGroupPolicyRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.RenewInstanceResponse renewInstanceRequest(com.aliyuncs.ecs.model.v20140526.RenewInstanceRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceAttributeResponse describeInstanceAttributeRequest(com.aliyuncs.ecs.model.v20140526.DescribeInstanceAttributeRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ImportImageResponse importImageRequest(com.aliyuncs.ecs.model.v20140526.ImportImageRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ReActivateInstancesResponse reActivateInstancesRequest(com.aliyuncs.ecs.model.v20140526.ReActivateInstancesRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.GetInstanceScreenshotResponse getInstanceScreenshotRequest(com.aliyuncs.ecs.model.v20140526.GetInstanceScreenshotRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyAutoProvisioningGroupResponse modifyAutoProvisioningGroupRequest(com.aliyuncs.ecs.model.v20140526.ModifyAutoProvisioningGroupRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.UnassignIpv6AddressesResponse unassignIpv6AddressesRequest(com.aliyuncs.ecs.model.v20140526.UnassignIpv6AddressesRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyForwardEntryResponse modifyForwardEntryRequest(com.aliyuncs.ecs.model.v20140526.ModifyForwardEntryRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyUserBusinessBehaviorResponse modifyUserBusinessBehaviorRequest(com.aliyuncs.ecs.model.v20140526.ModifyUserBusinessBehaviorRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeEipMonitorDataResponse describeEipMonitorDataRequest(com.aliyuncs.ecs.model.v20140526.DescribeEipMonitorDataRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.AssociateEipAddressResponse associateEipAddressRequest(com.aliyuncs.ecs.model.v20140526.AssociateEipAddressRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyVRouterAttributeResponse modifyVRouterAttributeRequest(com.aliyuncs.ecs.model.v20140526.ModifyVRouterAttributeRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyStorageSetAttributeResponse modifyStorageSetAttributeRequest(com.aliyuncs.ecs.model.v20140526.ModifyStorageSetAttributeRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeUserBusinessBehaviorResponse describeUserBusinessBehaviorRequest(com.aliyuncs.ecs.model.v20140526.DescribeUserBusinessBehaviorRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ReleaseEipAddressResponse releaseEipAddressRequest(com.aliyuncs.ecs.model.v20140526.ReleaseEipAddressRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ImportKeyPairResponse importKeyPairRequest(com.aliyuncs.ecs.model.v20140526.ImportKeyPairRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyVpcAttributeResponse modifyVpcAttributeRequest(com.aliyuncs.ecs.model.v20140526.ModifyVpcAttributeRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceTopologyResponse describeInstanceTopologyRequest(com.aliyuncs.ecs.model.v20140526.DescribeInstanceTopologyRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeResourceByTagsResponse describeResourceByTagsRequest(com.aliyuncs.ecs.model.v20140526.DescribeResourceByTagsRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceResponse describeRenewalPriceRequest(com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.CreateNetworkInterfaceResponse createNetworkInterfaceRequest(com.aliyuncs.ecs.model.v20140526.CreateNetworkInterfaceRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyLaunchTemplateDefaultVersionResponse modifyLaunchTemplateDefaultVersionRequest(com.aliyuncs.ecs.model.v20140526.ModifyLaunchTemplateDefaultVersionRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.AuthorizeSecurityGroupEgressResponse authorizeSecurityGroupEgressRequest(com.aliyuncs.ecs.model.v20140526.AuthorizeSecurityGroupEgressRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.RedeployDedicatedHostResponse redeployDedicatedHostRequest(com.aliyuncs.ecs.model.v20140526.RedeployDedicatedHostRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyInstanceNetworkSpecResponse modifyInstanceNetworkSpecRequest(com.aliyuncs.ecs.model.v20140526.ModifyInstanceNetworkSpecRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.UnassociateEipAddressResponse unassociateEipAddressRequest(com.aliyuncs.ecs.model.v20140526.UnassociateEipAddressRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyRouterInterfaceAttributeResponse modifyRouterInterfaceAttributeRequest(com.aliyuncs.ecs.model.v20140526.ModifyRouterInterfaceAttributeRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.EnablePhysicalConnectionResponse enablePhysicalConnectionRequest(com.aliyuncs.ecs.model.v20140526.EnablePhysicalConnectionRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeEniMonitorDataResponse describeEniMonitorDataRequest(com.aliyuncs.ecs.model.v20140526.DescribeEniMonitorDataRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeRouterInterfacesResponse describeRouterInterfacesRequest(com.aliyuncs.ecs.model.v20140526.DescribeRouterInterfacesRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeClassicLinkInstancesResponse describeClassicLinkInstancesRequest(com.aliyuncs.ecs.model.v20140526.DescribeClassicLinkInstancesRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeCloudAssistantStatusResponse describeCloudAssistantStatusRequest(com.aliyuncs.ecs.model.v20140526.DescribeCloudAssistantStatusRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeSnapshotsResponse describeSnapshotsRequest(com.aliyuncs.ecs.model.v20140526.DescribeSnapshotsRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.EipFillProductResponse eipFillProductRequest(com.aliyuncs.ecs.model.v20140526.EipFillProductRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.CreateSimulatedSystemEventsResponse createSimulatedSystemEventsRequest(com.aliyuncs.ecs.model.v20140526.CreateSimulatedSystemEventsRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.CreatePhysicalConnectionResponse createPhysicalConnectionRequest(com.aliyuncs.ecs.model.v20140526.CreatePhysicalConnectionRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.AuthorizeSecurityGroupResponse authorizeSecurityGroupRequest(com.aliyuncs.ecs.model.v20140526.AuthorizeSecurityGroupRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DeletePhysicalConnectionResponse deletePhysicalConnectionRequest(com.aliyuncs.ecs.model.v20140526.DeletePhysicalConnectionRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.AssignPrivateIpAddressesResponse assignPrivateIpAddressesRequest(com.aliyuncs.ecs.model.v20140526.AssignPrivateIpAddressesRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DetachInstanceRamRoleResponse detachInstanceRamRoleRequest(com.aliyuncs.ecs.model.v20140526.DetachInstanceRamRoleRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.InvokeCommandResponse invokeCommandRequest(com.aliyuncs.ecs.model.v20140526.InvokeCommandRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.EipFillParamsResponse eipFillParamsRequest(com.aliyuncs.ecs.model.v20140526.EipFillParamsRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ExportImageResponse exportImageRequest(com.aliyuncs.ecs.model.v20140526.ExportImageRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.CreateHpcClusterResponse createHpcClusterRequest(com.aliyuncs.ecs.model.v20140526.CreateHpcClusterRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteRouterInterfaceResponse deleteRouterInterfaceRequest(com.aliyuncs.ecs.model.v20140526.DeleteRouterInterfaceRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.CreateSnapshotResponse createSnapshotRequest(com.aliyuncs.ecs.model.v20140526.CreateSnapshotRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeResourcesModificationResponse describeResourcesModificationRequest(com.aliyuncs.ecs.model.v20140526.DescribeResourcesModificationRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyBandwidthPackageSpecResponse modifyBandwidthPackageSpecRequest(com.aliyuncs.ecs.model.v20140526.ModifyBandwidthPackageSpecRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.CreateAutoProvisioningGroupResponse createAutoProvisioningGroupRequest(com.aliyuncs.ecs.model.v20140526.CreateAutoProvisioningGroupRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.StartInstanceResponse startInstanceRequest(com.aliyuncs.ecs.model.v20140526.StartInstanceRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ConvertNatPublicIpToEipResponse convertNatPublicIpToEipRequest(com.aliyuncs.ecs.model.v20140526.ConvertNatPublicIpToEipRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.RevokeSecurityGroupResponse revokeSecurityGroupRequest(com.aliyuncs.ecs.model.v20140526.RevokeSecurityGroupRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeVirtualBorderRoutersForPhysicalConnectionResponse describeVirtualBorderRoutersForPhysicalConnectionRequest(com.aliyuncs.ecs.model.v20140526.DescribeVirtualBorderRoutersForPhysicalConnectionRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ReplaceSystemDiskResponse replaceSystemDiskRequest(com.aliyuncs.ecs.model.v20140526.ReplaceSystemDiskRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.TerminateVirtualBorderRouterResponse terminateVirtualBorderRouterRequest(com.aliyuncs.ecs.model.v20140526.TerminateVirtualBorderRouterRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.AssignIpv6AddressesResponse assignIpv6AddressesRequest(com.aliyuncs.ecs.model.v20140526.AssignIpv6AddressesRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeStorageSetsResponse describeStorageSetsRequest(com.aliyuncs.ecs.model.v20140526.DescribeStorageSetsRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.RemoveBandwidthPackageIpsResponse removeBandwidthPackageIpsRequest(com.aliyuncs.ecs.model.v20140526.RemoveBandwidthPackageIpsRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfacesResponse describeNetworkInterfacesRequest(com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfacesRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyDeploymentSetAttributeResponse modifyDeploymentSetAttributeRequest(com.aliyuncs.ecs.model.v20140526.ModifyDeploymentSetAttributeRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ResizeDiskResponse resizeDiskRequest(com.aliyuncs.ecs.model.v20140526.ResizeDiskRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.CreateNetworkInterfacePermissionResponse createNetworkInterfacePermissionRequest(com.aliyuncs.ecs.model.v20140526.CreateNetworkInterfacePermissionRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.CreateHaVipResponse createHaVipRequest(com.aliyuncs.ecs.model.v20140526.CreateHaVipRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyDiskSpecResponse modifyDiskSpecRequest(com.aliyuncs.ecs.model.v20140526.ModifyDiskSpecRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeReservedInstancesResponse describeReservedInstancesRequest(com.aliyuncs.ecs.model.v20140526.DescribeReservedInstancesRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfacePermissionsResponse describeNetworkInterfacePermissionsRequest(com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfacePermissionsRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.CreateCommandResponse createCommandRequest(com.aliyuncs.ecs.model.v20140526.CreateCommandRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.AttachKeyPairResponse attachKeyPairRequest(com.aliyuncs.ecs.model.v20140526.AttachKeyPairRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.CreateSecurityGroupResponse createSecurityGroupRequest(com.aliyuncs.ecs.model.v20140526.CreateSecurityGroupRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyAutoSnapshotPolicyResponse modifyAutoSnapshotPolicyRequest(com.aliyuncs.ecs.model.v20140526.ModifyAutoSnapshotPolicyRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInvocationsResponse describeInvocationsRequest(com.aliyuncs.ecs.model.v20140526.DescribeInvocationsRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostAutoRenewResponse describeDedicatedHostAutoRenewRequest(com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostAutoRenewRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteForwardEntryResponse deleteForwardEntryRequest(com.aliyuncs.ecs.model.v20140526.DeleteForwardEntryRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyInstanceVpcAttributeResponse modifyInstanceVpcAttributeRequest(com.aliyuncs.ecs.model.v20140526.ModifyInstanceVpcAttributeRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.RevokeSecurityGroupEgressResponse revokeSecurityGroupEgressRequest(com.aliyuncs.ecs.model.v20140526.RevokeSecurityGroupEgressRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostTypesResponse describeDedicatedHostTypesRequest(com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostTypesRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyDedicatedHostAttributeResponse modifyDedicatedHostAttributeRequest(com.aliyuncs.ecs.model.v20140526.ModifyDedicatedHostAttributeRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyEipAddressAttributeResponse modifyEipAddressAttributeRequest(com.aliyuncs.ecs.model.v20140526.ModifyEipAddressAttributeRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.CreateRouterInterfaceResponse createRouterInterfaceRequest(com.aliyuncs.ecs.model.v20140526.CreateRouterInterfaceRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteLaunchTemplateResponse deleteLaunchTemplateRequest(com.aliyuncs.ecs.model.v20140526.DeleteLaunchTemplateRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.AttachNetworkInterfaceResponse attachNetworkInterfaceRequest(com.aliyuncs.ecs.model.v20140526.AttachNetworkInterfaceRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.GetInstanceConsoleOutputResponse getInstanceConsoleOutputRequest(com.aliyuncs.ecs.model.v20140526.GetInstanceConsoleOutputRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.CreateDiskResponse createDiskRequest(com.aliyuncs.ecs.model.v20140526.CreateDiskRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.RunCommandResponse runCommandRequest(com.aliyuncs.ecs.model.v20140526.RunCommandRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeDiskMonitorDataResponse describeDiskMonitorDataRequest(com.aliyuncs.ecs.model.v20140526.DescribeDiskMonitorDataRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteSnapshotResponse deleteSnapshotRequest(com.aliyuncs.ecs.model.v20140526.DeleteSnapshotRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteNetworkInterfaceResponse deleteNetworkInterfaceRequest(com.aliyuncs.ecs.model.v20140526.DeleteNetworkInterfaceRequest req) throws Exception {
		return getAcsResponse(req);
	}

	public static void main(String[] args) throws Exception {
		for (String classname : ClassesInPackageAnalyzer.getAllClasses(PACKAGE, false)) {
			String simplename = classname.substring(classname.lastIndexOf(".") + 1);
			String methodname = simplename.substring(0, 1).toLowerCase() + simplename.substring(1);
			if (methodname.endsWith("Response")) {
				continue;
			}
			System.out.println("\tpublic " + classname.replaceAll("Request", "Response") + " " + methodname + "(" + classname + " req) throws Exception {");
			System.out.println("\t\treturn getAcsResponse(req);");
			System.out.println("\t}");
			System.out.println();
		}

	}
}
