/**
 * Copyright (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.wukong.aliyun_ecs;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.auth.AlibabaCloudCredentials;
import com.aliyuncs.auth.AlibabaCloudCredentialsProvider;
import com.aliyuncs.ecs.model.v20140526.CreateVpcRequest;
import com.aliyuncs.profile.IClientProfile;
import com.github.kubesys.tool.searchers.ClassSearcher;

/**
 * @author wuheng@iscas.ac.cn
 * @since  2019.1
 *
 */
public class WukongDefaultAcsClient extends DefaultAcsClient {

	public final static Class<?> CLASSNAME = RpcAcsRequest.class;
	
	public final static String   PACKAGE   = CreateVpcRequest.class
														.getPackage().getName();
	
	public WukongDefaultAcsClient(IClientProfile profile, AlibabaCloudCredentials credentials) {
		super(profile, credentials);
	}

	public WukongDefaultAcsClient(IClientProfile profile, AlibabaCloudCredentialsProvider credentialsProvider) {
		super(profile, credentialsProvider);
	}

	public WukongDefaultAcsClient(IClientProfile profile) {
		super(profile);
	}

	public com.aliyuncs.ecs.model.v20140526.CreateSecurityGroupRequest createSecurityGroupRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateSecurityGroupRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.RedeployInstanceRequest redeployInstanceRequest() {
		return new com.aliyuncs.ecs.model.v20140526.RedeployInstanceRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyUserBusinessBehaviorRequest modifyUserBusinessBehaviorRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyUserBusinessBehaviorRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeLaunchTemplatesRequest describeLaunchTemplatesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeLaunchTemplatesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostTypesRequest describeDedicatedHostTypesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostTypesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyVSwitchAttributeRequest modifyVSwitchAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyVSwitchAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeKeyPairsRequest describeKeyPairsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeKeyPairsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyCommandRequest modifyCommandRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyCommandRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyInstanceDeploymentRequest modifyInstanceDeploymentRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyInstanceDeploymentRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyPhysicalConnectionAttributeRequest modifyPhysicalConnectionAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyPhysicalConnectionAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeEniMonitorDataRequest describeEniMonitorDataRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeEniMonitorDataRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeSnapshotLinksRequest describeSnapshotLinksRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeSnapshotLinksRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfacePermissionsRequest describeNetworkInterfacePermissionsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfacePermissionsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeDeploymentSetsRequest describeDeploymentSetsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeDeploymentSetsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteVpcRequest deleteVpcRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteVpcRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteLaunchTemplateVersionRequest deleteLaunchTemplateVersionRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteLaunchTemplateVersionRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyInstanceAttributeRequest modifyInstanceAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyInstanceAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyImageShareGroupPermissionRequest modifyImageShareGroupPermissionRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyImageShareGroupPermissionRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeSnapshotsRequest describeSnapshotsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeSnapshotsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DetachClassicLinkVpcRequest detachClassicLinkVpcRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DetachClassicLinkVpcRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeactivateRouterInterfaceRequest deactivateRouterInterfaceRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeactivateRouterInterfaceRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeDisksFullStatusRequest describeDisksFullStatusRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeDisksFullStatusRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteDeploymentSetRequest deleteDeploymentSetRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteDeploymentSetRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.EipNotifyPaidRequest eipNotifyPaidRequest() {
		return new com.aliyuncs.ecs.model.v20140526.EipNotifyPaidRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.InvokeCommandRequest invokeCommandRequest() {
		return new com.aliyuncs.ecs.model.v20140526.InvokeCommandRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeEipMonitorDataRequest describeEipMonitorDataRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeEipMonitorDataRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyVirtualBorderRouterAttributeRequest modifyVirtualBorderRouterAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyVirtualBorderRouterAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateNetworkInterfaceRequest createNetworkInterfaceRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateNetworkInterfaceRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfacesRequest describeNetworkInterfacesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfacesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostsRequest describeDedicatedHostsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeRecommendInstanceTypeRequest describeRecommendInstanceTypeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeRecommendInstanceTypeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeAccessPointsRequest describeAccessPointsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeAccessPointsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ImportKeyPairRequest importKeyPairRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ImportKeyPairRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyDedicatedHostAutoReleaseTimeRequest modifyDedicatedHostAutoReleaseTimeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyDedicatedHostAutoReleaseTimeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DetachNetworkInterfaceRequest detachNetworkInterfaceRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DetachNetworkInterfaceRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteAutoSnapshotPolicyRequest deleteAutoSnapshotPolicyRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteAutoSnapshotPolicyRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.RevokeSecurityGroupRequest revokeSecurityGroupRequest() {
		return new com.aliyuncs.ecs.model.v20140526.RevokeSecurityGroupRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeZonesRequest describeZonesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeZonesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyInstanceNetworkSpecRequest modifyInstanceNetworkSpecRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyInstanceNetworkSpecRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyNetworkInterfaceAttributeRequest modifyNetworkInterfaceAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyNetworkInterfaceAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteVSwitchRequest deleteVSwitchRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteVSwitchRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeSecurityGroupsRequest describeSecurityGroupsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeSecurityGroupsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteRouteEntryRequest deleteRouteEntryRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteRouteEntryRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyBandwidthPackageSpecRequest modifyBandwidthPackageSpecRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyBandwidthPackageSpecRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeClustersRequest describeClustersRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeClustersRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ResizeDiskRequest resizeDiskRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ResizeDiskRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyDiskAttributeRequest modifyDiskAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyDiskAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribePhysicalConnectionsRequest describePhysicalConnectionsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribePhysicalConnectionsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.EipFillParamsRequest eipFillParamsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.EipFillParamsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeVRoutersRequest describeVRoutersRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeVRoutersRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateNetworkInterfacePermissionRequest createNetworkInterfacePermissionRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateNetworkInterfacePermissionRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstancesRequest describeInstancesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstancesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateAutoSnapshotPolicyRequest createAutoSnapshotPolicyRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateAutoSnapshotPolicyRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.AuthorizeSecurityGroupEgressRequest authorizeSecurityGroupEgressRequest() {
		return new com.aliyuncs.ecs.model.v20140526.AuthorizeSecurityGroupEgressRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeResourcesModificationRequest describeResourcesModificationRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeResourcesModificationRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceTypesRequest describeInstanceTypesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstanceTypesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.AttachClassicLinkVpcRequest attachClassicLinkVpcRequest() {
		return new com.aliyuncs.ecs.model.v20140526.AttachClassicLinkVpcRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateLaunchTemplateVersionRequest createLaunchTemplateVersionRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateLaunchTemplateVersionRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreatePhysicalConnectionRequest createPhysicalConnectionRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreatePhysicalConnectionRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeVirtualBorderRoutersRequest describeVirtualBorderRoutersRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeVirtualBorderRoutersRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateDeploymentSetRequest createDeploymentSetRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateDeploymentSetRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ConnectRouterInterfaceRequest connectRouterInterfaceRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ConnectRouterInterfaceRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeSnapshotPackageRequest describeSnapshotPackageRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeSnapshotPackageRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.InstallCloudAssistantRequest installCloudAssistantRequest() {
		return new com.aliyuncs.ecs.model.v20140526.InstallCloudAssistantRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ConvertNatPublicIpToEipRequest convertNatPublicIpToEipRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ConvertNatPublicIpToEipRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.EnablePhysicalConnectionRequest enablePhysicalConnectionRequest() {
		return new com.aliyuncs.ecs.model.v20140526.EnablePhysicalConnectionRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeSecurityGroupReferencesRequest describeSecurityGroupReferencesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeSecurityGroupReferencesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteCommandRequest deleteCommandRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteCommandRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CancelAutoSnapshotPolicyRequest cancelAutoSnapshotPolicyRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CancelAutoSnapshotPolicyRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceMonitorDataRequest describeInstanceMonitorDataRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstanceMonitorDataRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeLaunchTemplateVersionsRequest describeLaunchTemplateVersionsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeLaunchTemplateVersionsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateSnapshotRequest createSnapshotRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateSnapshotRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyVRouterAttributeRequest modifyVRouterAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyVRouterAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyImageSharePermissionRequest modifyImageSharePermissionRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyImageSharePermissionRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceTopologyRequest describeInstanceTopologyRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstanceTopologyRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.AssociateHaVipRequest associateHaVipRequest() {
		return new com.aliyuncs.ecs.model.v20140526.AssociateHaVipRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.TerminateVirtualBorderRouterRequest terminateVirtualBorderRouterRequest() {
		return new com.aliyuncs.ecs.model.v20140526.TerminateVirtualBorderRouterRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeNatGatewaysRequest describeNatGatewaysRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeNatGatewaysRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.RemoveTagsRequest removeTagsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.RemoveTagsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifySecurityGroupRuleRequest modifySecurityGroupRuleRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifySecurityGroupRuleRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeResourceByTagsRequest describeResourceByTagsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeResourceByTagsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteForwardEntryRequest deleteForwardEntryRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteForwardEntryRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CopyImageRequest copyImageRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CopyImageRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.RunInstancesRequest runInstancesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.RunInstancesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.UnassociateEipAddressRequest unassociateEipAddressRequest() {
		return new com.aliyuncs.ecs.model.v20140526.UnassociateEipAddressRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.RecoverVirtualBorderRouterRequest recoverVirtualBorderRouterRequest() {
		return new com.aliyuncs.ecs.model.v20140526.RecoverVirtualBorderRouterRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.AddTagsRequest addTagsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.AddTagsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInvocationResultsRequest describeInvocationResultsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInvocationResultsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceVncPasswdRequest describeInstanceVncPasswdRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstanceVncPasswdRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeTaskAttributeRequest describeTaskAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeTaskAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.StartInstanceRequest startInstanceRequest() {
		return new com.aliyuncs.ecs.model.v20140526.StartInstanceRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeTasksRequest describeTasksRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeTasksRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.AllocateEipAddressRequest allocateEipAddressRequest() {
		return new com.aliyuncs.ecs.model.v20140526.AllocateEipAddressRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteNetworkInterfacePermissionRequest deleteNetworkInterfacePermissionRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteNetworkInterfacePermissionRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceRequest describeRenewalPriceRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeRenewalPriceRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateVpcRequest createVpcRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateVpcRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyEipAddressAttributeRequest modifyEipAddressAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyEipAddressAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.UnassociateHaVipRequest unassociateHaVipRequest() {
		return new com.aliyuncs.ecs.model.v20140526.UnassociateHaVipRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifySecurityGroupEgressRuleRequest modifySecurityGroupEgressRuleRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifySecurityGroupEgressRuleRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyInstanceVncPasswdRequest modifyInstanceVncPasswdRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyInstanceVncPasswdRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CancelCopyImageRequest cancelCopyImageRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CancelCopyImageRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.TerminatePhysicalConnectionRequest terminatePhysicalConnectionRequest() {
		return new com.aliyuncs.ecs.model.v20140526.TerminatePhysicalConnectionRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeLimitationRequest describeLimitationRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeLimitationRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteHpcClusterRequest deleteHpcClusterRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteHpcClusterRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceAutoRenewAttributeRequest describeInstanceAutoRenewAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstanceAutoRenewAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeImageSharePermissionRequest describeImageSharePermissionRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeImageSharePermissionRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeCommandsRequest describeCommandsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeCommandsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateDiskRequest createDiskRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateDiskRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CancelSimulatedSystemEventsRequest cancelSimulatedSystemEventsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CancelSimulatedSystemEventsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeImagesRequest describeImagesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeImagesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DetachInstanceRamRoleRequest detachInstanceRamRoleRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DetachInstanceRamRoleRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeForwardTableEntriesRequest describeForwardTableEntriesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeForwardTableEntriesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.AddBandwidthPackageIpsRequest addBandwidthPackageIpsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.AddBandwidthPackageIpsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateInstanceRequest createInstanceRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateInstanceRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyImageAttributeRequest modifyImageAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyImageAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.AssignIpv6AddressesRequest assignIpv6AddressesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.AssignIpv6AddressesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeHaVipsRequest describeHaVipsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeHaVipsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteBandwidthPackageRequest deleteBandwidthPackageRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteBandwidthPackageRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceHistoryEventsRequest describeInstanceHistoryEventsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstanceHistoryEventsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeAutoSnapshotPolicyExRequest describeAutoSnapshotPolicyExRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeAutoSnapshotPolicyExRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ResetDiskRequest resetDiskRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ResetDiskRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostAutoRenewRequest describeDedicatedHostAutoRenewRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostAutoRenewRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ReInitDiskRequest reInitDiskRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ReInitDiskRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyInstanceChargeTypeRequest modifyInstanceChargeTypeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyInstanceChargeTypeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstancePhysicalAttributeRequest describeInstancePhysicalAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstancePhysicalAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeUserDataRequest describeUserDataRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeUserDataRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeBandwidthLimitationRequest describeBandwidthLimitationRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeBandwidthLimitationRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateNatGatewayRequest createNatGatewayRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateNatGatewayRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeClassicLinkInstancesRequest describeClassicLinkInstancesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeClassicLinkInstancesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeRouterInterfacesRequest describeRouterInterfacesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeRouterInterfacesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ReActivateInstancesRequest reActivateInstancesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ReActivateInstancesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.GetInstanceConsoleOutputRequest getInstanceConsoleOutputRequest() {
		return new com.aliyuncs.ecs.model.v20140526.GetInstanceConsoleOutputRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifySecurityGroupPolicyRequest modifySecurityGroupPolicyRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifySecurityGroupPolicyRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyHaVipAttributeRequest modifyHaVipAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyHaVipAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyVpcAttributeRequest modifyVpcAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyVpcAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeRegionsRequest describeRegionsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeRegionsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyDedicatedHostAttributeRequest modifyDedicatedHostAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyDedicatedHostAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeAccountAttributesRequest describeAccountAttributesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeAccountAttributesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyPrepayInstanceSpecRequest modifyPrepayInstanceSpecRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyPrepayInstanceSpecRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ReleaseDedicatedHostRequest releaseDedicatedHostRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ReleaseDedicatedHostRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.RebootInstanceRequest rebootInstanceRequest() {
		return new com.aliyuncs.ecs.model.v20140526.RebootInstanceRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CancelTaskRequest cancelTaskRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CancelTaskRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyInstanceAutoReleaseTimeRequest modifyInstanceAutoReleaseTimeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyInstanceAutoReleaseTimeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteInstanceRequest deleteInstanceRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteInstanceRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeUserBusinessBehaviorRequest describeUserBusinessBehaviorRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeUserBusinessBehaviorRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.GetInstanceScreenshotRequest getInstanceScreenshotRequest() {
		return new com.aliyuncs.ecs.model.v20140526.GetInstanceScreenshotRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateForwardEntryRequest createForwardEntryRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateForwardEntryRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeDisksRequest describeDisksRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeDisksRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.RevokeSecurityGroupEgressRequest revokeSecurityGroupEgressRequest() {
		return new com.aliyuncs.ecs.model.v20140526.RevokeSecurityGroupEgressRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceAttributeRequest describeInstanceAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstanceAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyAutoSnapshotPolicyRequest modifyAutoSnapshotPolicyRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyAutoSnapshotPolicyRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ActivateRouterInterfaceRequest activateRouterInterfaceRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ActivateRouterInterfaceRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyDiskChargeTypeRequest modifyDiskChargeTypeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyDiskChargeTypeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyRouterInterfaceSpecRequest modifyRouterInterfaceSpecRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyRouterInterfaceSpecRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CancelPhysicalConnectionRequest cancelPhysicalConnectionRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CancelPhysicalConnectionRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateHpcClusterRequest createHpcClusterRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateHpcClusterRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeHpcClustersRequest describeHpcClustersRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeHpcClustersRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceTypeFamiliesRequest describeInstanceTypeFamiliesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstanceTypeFamiliesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateVSwitchRequest createVSwitchRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateVSwitchRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.AuthorizeSecurityGroupRequest authorizeSecurityGroupRequest() {
		return new com.aliyuncs.ecs.model.v20140526.AuthorizeSecurityGroupRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyRouterInterfaceAttributeRequest modifyRouterInterfaceAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyRouterInterfaceAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateVirtualBorderRouterRequest createVirtualBorderRouterRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateVirtualBorderRouterRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstancesFullStatusRequest describeInstancesFullStatusRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstancesFullStatusRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeDiskMonitorDataRequest describeDiskMonitorDataRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeDiskMonitorDataRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.AllocateDedicatedHostsRequest allocateDedicatedHostsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.AllocateDedicatedHostsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteLaunchTemplateRequest deleteLaunchTemplateRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteLaunchTemplateRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.RenewDedicatedHostsRequest renewDedicatedHostsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.RenewDedicatedHostsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyDeploymentSetAttributeRequest modifyDeploymentSetAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyDeploymentSetAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteVirtualBorderRouterRequest deleteVirtualBorderRouterRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteVirtualBorderRouterRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeSecurityGroupAttributeRequest describeSecurityGroupAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeSecurityGroupAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeRouteTablesRequest describeRouteTablesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeRouteTablesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateLaunchTemplateRequest createLaunchTemplateRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateLaunchTemplateRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteNatGatewayRequest deleteNatGatewayRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteNatGatewayRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeVSwitchesRequest describeVSwitchesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeVSwitchesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.AttachDiskRequest attachDiskRequest() {
		return new com.aliyuncs.ecs.model.v20140526.AttachDiskRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.AttachKeyPairRequest attachKeyPairRequest() {
		return new com.aliyuncs.ecs.model.v20140526.AttachKeyPairRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceVncUrlRequest describeInstanceVncUrlRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstanceVncUrlRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteSnapshotRequest deleteSnapshotRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteSnapshotRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribePriceRequest describePriceRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribePriceRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.StopInvocationRequest stopInvocationRequest() {
		return new com.aliyuncs.ecs.model.v20140526.StopInvocationRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.RemoveBandwidthPackageIpsRequest removeBandwidthPackageIpsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.RemoveBandwidthPackageIpsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ApplyAutoSnapshotPolicyRequest applyAutoSnapshotPolicyRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ApplyAutoSnapshotPolicyRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeSnapshotMonitorDataRequest describeSnapshotMonitorDataRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeSnapshotMonitorDataRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceRamRoleRequest describeInstanceRamRoleRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstanceRamRoleRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DetachDiskRequest detachDiskRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DetachDiskRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeCloudAssistantStatusRequest describeCloudAssistantStatusRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeCloudAssistantStatusRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteSecurityGroupRequest deleteSecurityGroupRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteSecurityGroupRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ImportImageRequest importImageRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ImportImageRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.StopInstanceRequest stopInstanceRequest() {
		return new com.aliyuncs.ecs.model.v20140526.StopInstanceRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifySnapshotAttributeRequest modifySnapshotAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifySnapshotAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteHaVipRequest deleteHaVipRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteHaVipRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeImageSupportInstanceTypesRequest describeImageSupportInstanceTypesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeImageSupportInstanceTypesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.RenewInstanceRequest renewInstanceRequest() {
		return new com.aliyuncs.ecs.model.v20140526.RenewInstanceRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyInstanceSpecRequest modifyInstanceSpecRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyInstanceSpecRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifySecurityGroupAttributeRequest modifySecurityGroupAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifySecurityGroupAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeEipAddressesRequest describeEipAddressesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeEipAddressesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInvocationsRequest describeInvocationsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInvocationsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.UnassignIpv6AddressesRequest unassignIpv6AddressesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.UnassignIpv6AddressesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DetachKeyPairRequest detachKeyPairRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DetachKeyPairRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyAutoSnapshotPolicyExRequest modifyAutoSnapshotPolicyExRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyAutoSnapshotPolicyExRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyForwardEntryRequest modifyForwardEntryRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyForwardEntryRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeTagsRequest describeTagsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeTagsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.AttachInstanceRamRoleRequest attachInstanceRamRoleRequest() {
		return new com.aliyuncs.ecs.model.v20140526.AttachInstanceRamRoleRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.AssignPrivateIpAddressesRequest assignPrivateIpAddressesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.AssignPrivateIpAddressesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ExportImageRequest exportImageRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ExportImageRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyInstanceVpcAttributeRequest modifyInstanceVpcAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyInstanceVpcAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateRouterInterfaceRequest createRouterInterfaceRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateRouterInterfaceRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ReleasePublicIpAddressRequest releasePublicIpAddressRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ReleasePublicIpAddressRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.EipFillProductRequest eipFillProductRequest() {
		return new com.aliyuncs.ecs.model.v20140526.EipFillProductRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateCommandRequest createCommandRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateCommandRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.JoinResourceGroupRequest joinResourceGroupRequest() {
		return new com.aliyuncs.ecs.model.v20140526.JoinResourceGroupRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateSimulatedSystemEventsRequest createSimulatedSystemEventsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateSimulatedSystemEventsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeSpotPriceHistoryRequest describeSpotPriceHistoryRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeSpotPriceHistoryRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteDiskRequest deleteDiskRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteDiskRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.AllocatePublicIpAddressRequest allocatePublicIpAddressRequest() {
		return new com.aliyuncs.ecs.model.v20140526.AllocatePublicIpAddressRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateRouteEntryRequest createRouteEntryRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateRouteEntryRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeBandwidthPackagesRequest describeBandwidthPackagesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeBandwidthPackagesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateKeyPairRequest createKeyPairRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateKeyPairRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.AttachNetworkInterfaceRequest attachNetworkInterfaceRequest() {
		return new com.aliyuncs.ecs.model.v20140526.AttachNetworkInterfaceRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateHaVipRequest createHaVipRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateHaVipRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ReplaceSystemDiskRequest replaceSystemDiskRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ReplaceSystemDiskRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteNetworkInterfaceRequest deleteNetworkInterfaceRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteNetworkInterfaceRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.CreateImageRequest createImageRequest() {
		return new com.aliyuncs.ecs.model.v20140526.CreateImageRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ReleaseEipAddressRequest releaseEipAddressRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ReleaseEipAddressRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteImageRequest deleteImageRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteImageRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.LeaveSecurityGroupRequest leaveSecurityGroupRequest() {
		return new com.aliyuncs.ecs.model.v20140526.LeaveSecurityGroupRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.UnassignPrivateIpAddressesRequest unassignPrivateIpAddressesRequest() {
		return new com.aliyuncs.ecs.model.v20140526.UnassignPrivateIpAddressesRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteKeyPairsRequest deleteKeyPairsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteKeyPairsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.JoinSecurityGroupRequest joinSecurityGroupRequest() {
		return new com.aliyuncs.ecs.model.v20140526.JoinSecurityGroupRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeSnapshotsUsageRequest describeSnapshotsUsageRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeSnapshotsUsageRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeletePhysicalConnectionRequest deletePhysicalConnectionRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeletePhysicalConnectionRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyInstanceAutoRenewAttributeRequest modifyInstanceAutoRenewAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyInstanceAutoRenewAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyLaunchTemplateDefaultVersionRequest modifyLaunchTemplateDefaultVersionRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyLaunchTemplateDefaultVersionRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeVpcsRequest describeVpcsRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeVpcsRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DeleteRouterInterfaceRequest deleteRouterInterfaceRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DeleteRouterInterfaceRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeVirtualBorderRoutersForPhysicalConnectionRequest describeVirtualBorderRoutersForPhysicalConnectionRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeVirtualBorderRoutersForPhysicalConnectionRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeInstanceStatusRequest describeInstanceStatusRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeInstanceStatusRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeNewProjectEipMonitorDataRequest describeNewProjectEipMonitorDataRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeNewProjectEipMonitorDataRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.DescribeAvailableResourceRequest describeAvailableResourceRequest() {
		return new com.aliyuncs.ecs.model.v20140526.DescribeAvailableResourceRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.AssociateEipAddressRequest associateEipAddressRequest() {
		return new com.aliyuncs.ecs.model.v20140526.AssociateEipAddressRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyDedicatedHostAutoRenewAttributeRequest modifyDedicatedHostAutoRenewAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyDedicatedHostAutoRenewAttributeRequest();
	}

	public com.aliyuncs.ecs.model.v20140526.ModifyHpcClusterAttributeRequest modifyHpcClusterAttributeRequest() {
		return new com.aliyuncs.ecs.model.v20140526.ModifyHpcClusterAttributeRequest();
	}
	
	public static void main(String[] args) throws Exception {
		for (String classname : ClassSearcher.getAllClasses(PACKAGE, false)) {
			String simplename = classname.substring(classname.lastIndexOf(".") + 1);
			String methodname = simplename.substring(0, 1).toLowerCase() + simplename.substring(1);
			System.out.println("\tpublic " + classname + " " + methodname + "() {");
			System.out.println("\t\treturn new " + classname + "();");
			System.out.println("\t}");
			System.out.println();
		}
      	
	}
}
