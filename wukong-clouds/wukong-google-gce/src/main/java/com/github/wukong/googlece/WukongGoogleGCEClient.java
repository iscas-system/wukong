/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.wukong.googlece;

import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import com.github.kubesys.tool.generators.CodesTool;
import com.github.wukong.googlece.models.AbstractGoogleRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.services.compute.Compute;
import com.google.api.services.compute.ComputeRequest;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * @since 2019.1
 */
public class WukongGoogleGCEClient extends Compute {

	public WukongGoogleGCEClient(HttpTransport transport, JsonFactory jsonFactory,
			HttpRequestInitializer httpRequestInitializer) {
		super(transport, jsonFactory, httpRequestInitializer);
	}
	
	public com.google.api.services.compute.Compute.AcceleratorTypes.Get getAcceleratorTypes(com.github.wukong.googlece.models.acceleratorTypes.GetRequest request) throws Exception {
		return this.acceleratorTypes().get(request.getProject(),request.getZone(),request.getAcceleratorType());
	}

	public com.google.api.services.compute.Compute.AcceleratorTypes.AggregatedList aggregatedListAcceleratorTypes(com.github.wukong.googlece.models.acceleratorTypes.AggregatedListRequest request) throws Exception {
		return this.acceleratorTypes().aggregatedList(request.getProject());
	}

	public com.google.api.services.compute.Compute.AcceleratorTypes.List listAcceleratorTypes(com.github.wukong.googlece.models.acceleratorTypes.ListRequest request) throws Exception {
		return this.acceleratorTypes().list(request.getProject(),request.getZone());
	}

	public com.google.api.services.compute.Compute.Addresses.Get getAddresses(com.github.wukong.googlece.models.addresses.GetRequest request) throws Exception {
		return this.addresses().get(request.getProject(),request.getRegion(),request.getAddress());
	}

	public com.google.api.services.compute.Compute.Addresses.Insert insertAddresses(com.github.wukong.googlece.models.addresses.InsertRequest request) throws Exception {
		return this.addresses().insert(request.getProject(),request.getRegion(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Addresses.AggregatedList aggregatedListAddresses(com.github.wukong.googlece.models.addresses.AggregatedListRequest request) throws Exception {
		return this.addresses().aggregatedList(request.getProject());
	}

	public com.google.api.services.compute.Compute.Addresses.List listAddresses(com.github.wukong.googlece.models.addresses.ListRequest request) throws Exception {
		return this.addresses().list(request.getProject(),request.getRegion());
	}

	public com.google.api.services.compute.Compute.Addresses.Delete deleteAddresses(com.github.wukong.googlece.models.addresses.DeleteRequest request) throws Exception {
		return this.addresses().delete(request.getProject(),request.getRegion(),request.getAddress());
	}

	public com.google.api.services.compute.Compute.Autoscalers.Patch patchAutoscalers(com.github.wukong.googlece.models.autoscalers.PatchRequest request) throws Exception {
		return this.autoscalers().patch(request.getProject(),request.getZone(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Autoscalers.Get getAutoscalers(com.github.wukong.googlece.models.autoscalers.GetRequest request) throws Exception {
		return this.autoscalers().get(request.getProject(),request.getZone(),request.getAutoscaler());
	}

	public com.google.api.services.compute.Compute.Autoscalers.Update updateAutoscalers(com.github.wukong.googlece.models.autoscalers.UpdateRequest request) throws Exception {
		return this.autoscalers().update(request.getProject(),request.getZone(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Autoscalers.Insert insertAutoscalers(com.github.wukong.googlece.models.autoscalers.InsertRequest request) throws Exception {
		return this.autoscalers().insert(request.getProject(),request.getZone(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Autoscalers.AggregatedList aggregatedListAutoscalers(com.github.wukong.googlece.models.autoscalers.AggregatedListRequest request) throws Exception {
		return this.autoscalers().aggregatedList(request.getProject());
	}

	public com.google.api.services.compute.Compute.Autoscalers.List listAutoscalers(com.github.wukong.googlece.models.autoscalers.ListRequest request) throws Exception {
		return this.autoscalers().list(request.getProject(),request.getZone());
	}

	public com.google.api.services.compute.Compute.Autoscalers.Delete deleteAutoscalers(com.github.wukong.googlece.models.autoscalers.DeleteRequest request) throws Exception {
		return this.autoscalers().delete(request.getProject(),request.getZone(),request.getAutoscaler());
	}

	public com.google.api.services.compute.Compute.BackendBuckets.Patch patchBackendBuckets(com.github.wukong.googlece.models.backendBuckets.PatchRequest request) throws Exception {
		return this.backendBuckets().patch(request.getProject(),request.getBackendBucket(),request.getContent());
	}

	public com.google.api.services.compute.Compute.BackendBuckets.AddSignedUrlKey addSignedUrlKeyBackendBuckets(com.github.wukong.googlece.models.backendBuckets.AddSignedUrlKeyRequest request) throws Exception {
		return this.backendBuckets().addSignedUrlKey(request.getProject(),request.getBackendBucket(),request.getContent());
	}

	public com.google.api.services.compute.Compute.BackendBuckets.DeleteSignedUrlKey deleteSignedUrlKeyBackendBuckets(com.github.wukong.googlece.models.backendBuckets.DeleteSignedUrlKeyRequest request) throws Exception {
		return this.backendBuckets().deleteSignedUrlKey(request.getProject(),request.getBackendBucket(),request.getKeyName());
	}

	public com.google.api.services.compute.Compute.BackendBuckets.Get getBackendBuckets(com.github.wukong.googlece.models.backendBuckets.GetRequest request) throws Exception {
		return this.backendBuckets().get(request.getProject(),request.getBackendBucket());
	}

	public com.google.api.services.compute.Compute.BackendBuckets.Update updateBackendBuckets(com.github.wukong.googlece.models.backendBuckets.UpdateRequest request) throws Exception {
		return this.backendBuckets().update(request.getProject(),request.getBackendBucket(),request.getContent());
	}

	public com.google.api.services.compute.Compute.BackendBuckets.Insert insertBackendBuckets(com.github.wukong.googlece.models.backendBuckets.InsertRequest request) throws Exception {
		return this.backendBuckets().insert(request.getProject(),request.getContent());
	}

	public com.google.api.services.compute.Compute.BackendBuckets.List listBackendBuckets(com.github.wukong.googlece.models.backendBuckets.ListRequest request) throws Exception {
		return this.backendBuckets().list(request.getProject());
	}

	public com.google.api.services.compute.Compute.BackendBuckets.Delete deleteBackendBuckets(com.github.wukong.googlece.models.backendBuckets.DeleteRequest request) throws Exception {
		return this.backendBuckets().delete(request.getProject(),request.getBackendBucket());
	}

	public com.google.api.services.compute.Compute.BackendServices.Patch patchBackendServices(com.github.wukong.googlece.models.backendServices.PatchRequest request) throws Exception {
		return this.backendServices().patch(request.getProject(),request.getBackendService(),request.getContent());
	}

	public com.google.api.services.compute.Compute.BackendServices.AddSignedUrlKey addSignedUrlKeyBackendServices(com.github.wukong.googlece.models.backendServices.AddSignedUrlKeyRequest request) throws Exception {
		return this.backendServices().addSignedUrlKey(request.getProject(),request.getBackendService(),request.getContent());
	}

	public com.google.api.services.compute.Compute.BackendServices.DeleteSignedUrlKey deleteSignedUrlKeyBackendServices(com.github.wukong.googlece.models.backendServices.DeleteSignedUrlKeyRequest request) throws Exception {
		return this.backendServices().deleteSignedUrlKey(request.getProject(),request.getBackendService(),request.getKeyName());
	}

	public com.google.api.services.compute.Compute.BackendServices.Get getBackendServices(com.github.wukong.googlece.models.backendServices.GetRequest request) throws Exception {
		return this.backendServices().get(request.getProject(),request.getBackendService());
	}

	public com.google.api.services.compute.Compute.BackendServices.SetSecurityPolicy setSecurityPolicyBackendServices(com.github.wukong.googlece.models.backendServices.SetSecurityPolicyRequest request) throws Exception {
		return this.backendServices().setSecurityPolicy(request.getProject(),request.getBackendService(),request.getContent());
	}

	public com.google.api.services.compute.Compute.BackendServices.Update updateBackendServices(com.github.wukong.googlece.models.backendServices.UpdateRequest request) throws Exception {
		return this.backendServices().update(request.getProject(),request.getBackendService(),request.getContent());
	}

	public com.google.api.services.compute.Compute.BackendServices.Insert insertBackendServices(com.github.wukong.googlece.models.backendServices.InsertRequest request) throws Exception {
		return this.backendServices().insert(request.getProject(),request.getContent());
	}

	public com.google.api.services.compute.Compute.BackendServices.AggregatedList aggregatedListBackendServices(com.github.wukong.googlece.models.backendServices.AggregatedListRequest request) throws Exception {
		return this.backendServices().aggregatedList(request.getProject());
	}

	public com.google.api.services.compute.Compute.BackendServices.List listBackendServices(com.github.wukong.googlece.models.backendServices.ListRequest request) throws Exception {
		return this.backendServices().list(request.getProject());
	}

	public com.google.api.services.compute.Compute.BackendServices.Delete deleteBackendServices(com.github.wukong.googlece.models.backendServices.DeleteRequest request) throws Exception {
		return this.backendServices().delete(request.getProject(),request.getBackendService());
	}

	public com.google.api.services.compute.Compute.BackendServices.GetHealth getHealthBackendServices(com.github.wukong.googlece.models.backendServices.GetHealthRequest request) throws Exception {
		return this.backendServices().getHealth(request.getProject(),request.getBackendService(),request.getContent());
	}

	public com.google.api.services.compute.Compute.DiskTypes.Get getDiskTypes(com.github.wukong.googlece.models.diskTypes.GetRequest request) throws Exception {
		return this.diskTypes().get(request.getProject(),request.getZone(),request.getDiskType());
	}

	public com.google.api.services.compute.Compute.DiskTypes.AggregatedList aggregatedListDiskTypes(com.github.wukong.googlece.models.diskTypes.AggregatedListRequest request) throws Exception {
		return this.diskTypes().aggregatedList(request.getProject());
	}

	public com.google.api.services.compute.Compute.DiskTypes.List listDiskTypes(com.github.wukong.googlece.models.diskTypes.ListRequest request) throws Exception {
		return this.diskTypes().list(request.getProject(),request.getZone());
	}

	public com.google.api.services.compute.Compute.Disks.Get getDisks(com.github.wukong.googlece.models.disks.GetRequest request) throws Exception {
		return this.disks().get(request.getProject(),request.getZone(),request.getDisk());
	}

	public com.google.api.services.compute.Compute.Disks.CreateSnapshot createSnapshotDisks(com.github.wukong.googlece.models.disks.CreateSnapshotRequest request) throws Exception {
		return this.disks().createSnapshot(request.getProject(),request.getZone(),request.getDisk(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Disks.Insert insertDisks(com.github.wukong.googlece.models.disks.InsertRequest request) throws Exception {
		return this.disks().insert(request.getProject(),request.getZone(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Disks.Resize resizeDisks(com.github.wukong.googlece.models.disks.ResizeRequest request) throws Exception {
		return this.disks().resize(request.getProject(),request.getZone(),request.getDisk(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Disks.AggregatedList aggregatedListDisks(com.github.wukong.googlece.models.disks.AggregatedListRequest request) throws Exception {
		return this.disks().aggregatedList(request.getProject());
	}

	public com.google.api.services.compute.Compute.Disks.List listDisks(com.github.wukong.googlece.models.disks.ListRequest request) throws Exception {
		return this.disks().list(request.getProject(),request.getZone());
	}

	public com.google.api.services.compute.Compute.Disks.SetLabels setLabelsDisks(com.github.wukong.googlece.models.disks.SetLabelsRequest request) throws Exception {
		return this.disks().setLabels(request.getProject(),request.getZone(),request.getResource(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Disks.Delete deleteDisks(com.github.wukong.googlece.models.disks.DeleteRequest request) throws Exception {
		return this.disks().delete(request.getProject(),request.getZone(),request.getDisk());
	}

	public com.google.api.services.compute.Compute.Firewalls.Patch patchFirewalls(com.github.wukong.googlece.models.firewalls.PatchRequest request) throws Exception {
		return this.firewalls().patch(request.getProject(),request.getFirewall(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Firewalls.Get getFirewalls(com.github.wukong.googlece.models.firewalls.GetRequest request) throws Exception {
		return this.firewalls().get(request.getProject(),request.getFirewall());
	}

	public com.google.api.services.compute.Compute.Firewalls.Update updateFirewalls(com.github.wukong.googlece.models.firewalls.UpdateRequest request) throws Exception {
		return this.firewalls().update(request.getProject(),request.getFirewall(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Firewalls.Insert insertFirewalls(com.github.wukong.googlece.models.firewalls.InsertRequest request) throws Exception {
		return this.firewalls().insert(request.getProject(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Firewalls.List listFirewalls(com.github.wukong.googlece.models.firewalls.ListRequest request) throws Exception {
		return this.firewalls().list(request.getProject());
	}

	public com.google.api.services.compute.Compute.Firewalls.Delete deleteFirewalls(com.github.wukong.googlece.models.firewalls.DeleteRequest request) throws Exception {
		return this.firewalls().delete(request.getProject(),request.getFirewall());
	}

	public com.google.api.services.compute.Compute.ForwardingRules.Get getForwardingRules(com.github.wukong.googlece.models.forwardingRules.GetRequest request) throws Exception {
		return this.forwardingRules().get(request.getProject(),request.getRegion(),request.getForwardingRule());
	}

	public com.google.api.services.compute.Compute.ForwardingRules.Insert insertForwardingRules(com.github.wukong.googlece.models.forwardingRules.InsertRequest request) throws Exception {
		return this.forwardingRules().insert(request.getProject(),request.getRegion(),request.getContent());
	}

	public com.google.api.services.compute.Compute.ForwardingRules.SetTarget setTargetForwardingRules(com.github.wukong.googlece.models.forwardingRules.SetTargetRequest request) throws Exception {
		return this.forwardingRules().setTarget(request.getProject(),request.getRegion(),request.getForwardingRule(),request.getContent());
	}

	public com.google.api.services.compute.Compute.ForwardingRules.AggregatedList aggregatedListForwardingRules(com.github.wukong.googlece.models.forwardingRules.AggregatedListRequest request) throws Exception {
		return this.forwardingRules().aggregatedList(request.getProject());
	}

	public com.google.api.services.compute.Compute.ForwardingRules.List listForwardingRules(com.github.wukong.googlece.models.forwardingRules.ListRequest request) throws Exception {
		return this.forwardingRules().list(request.getProject(),request.getRegion());
	}

	public com.google.api.services.compute.Compute.ForwardingRules.Delete deleteForwardingRules(com.github.wukong.googlece.models.forwardingRules.DeleteRequest request) throws Exception {
		return this.forwardingRules().delete(request.getProject(),request.getRegion(),request.getForwardingRule());
	}

	public com.google.api.services.compute.Compute.GlobalAddresses.Get getGlobalAddresses(com.github.wukong.googlece.models.globalAddresses.GetRequest request) throws Exception {
		return this.globalAddresses().get(request.getProject(),request.getAddress());
	}

	public com.google.api.services.compute.Compute.GlobalAddresses.Insert insertGlobalAddresses(com.github.wukong.googlece.models.globalAddresses.InsertRequest request) throws Exception {
		return this.globalAddresses().insert(request.getProject(),request.getContent());
	}

	public com.google.api.services.compute.Compute.GlobalAddresses.List listGlobalAddresses(com.github.wukong.googlece.models.globalAddresses.ListRequest request) throws Exception {
		return this.globalAddresses().list(request.getProject());
	}

	public com.google.api.services.compute.Compute.GlobalAddresses.Delete deleteGlobalAddresses(com.github.wukong.googlece.models.globalAddresses.DeleteRequest request) throws Exception {
		return this.globalAddresses().delete(request.getProject(),request.getAddress());
	}

	public com.google.api.services.compute.Compute.GlobalForwardingRules.Get getGlobalForwardingRules(com.github.wukong.googlece.models.globalForwardingRules.GetRequest request) throws Exception {
		return this.globalForwardingRules().get(request.getProject(),request.getForwardingRule());
	}

	public com.google.api.services.compute.Compute.GlobalForwardingRules.Insert insertGlobalForwardingRules(com.github.wukong.googlece.models.globalForwardingRules.InsertRequest request) throws Exception {
		return this.globalForwardingRules().insert(request.getProject(),request.getContent());
	}

	public com.google.api.services.compute.Compute.GlobalForwardingRules.SetTarget setTargetGlobalForwardingRules(com.github.wukong.googlece.models.globalForwardingRules.SetTargetRequest request) throws Exception {
		return this.globalForwardingRules().setTarget(request.getProject(),request.getForwardingRule(),request.getContent());
	}

	public com.google.api.services.compute.Compute.GlobalForwardingRules.List listGlobalForwardingRules(com.github.wukong.googlece.models.globalForwardingRules.ListRequest request) throws Exception {
		return this.globalForwardingRules().list(request.getProject());
	}

	public com.google.api.services.compute.Compute.GlobalForwardingRules.Delete deleteGlobalForwardingRules(com.github.wukong.googlece.models.globalForwardingRules.DeleteRequest request) throws Exception {
		return this.globalForwardingRules().delete(request.getProject(),request.getForwardingRule());
	}

	public com.google.api.services.compute.Compute.GlobalOperations.Get getGlobalOperations(com.github.wukong.googlece.models.globalOperations.GetRequest request) throws Exception {
		return this.globalOperations().get(request.getProject(),request.getOperation());
	}

	public com.google.api.services.compute.Compute.GlobalOperations.AggregatedList aggregatedListGlobalOperations(com.github.wukong.googlece.models.globalOperations.AggregatedListRequest request) throws Exception {
		return this.globalOperations().aggregatedList(request.getProject());
	}

	public com.google.api.services.compute.Compute.GlobalOperations.List listGlobalOperations(com.github.wukong.googlece.models.globalOperations.ListRequest request) throws Exception {
		return this.globalOperations().list(request.getProject());
	}

	public com.google.api.services.compute.Compute.GlobalOperations.Delete deleteGlobalOperations(com.github.wukong.googlece.models.globalOperations.DeleteRequest request) throws Exception {
		return this.globalOperations().delete(request.getProject(),request.getOperation());
	}

	public com.google.api.services.compute.Compute.HealthChecks.Patch patchHealthChecks(com.github.wukong.googlece.models.healthChecks.PatchRequest request) throws Exception {
		return this.healthChecks().patch(request.getProject(),request.getHealthCheck(),request.getContent());
	}

	public com.google.api.services.compute.Compute.HealthChecks.Get getHealthChecks(com.github.wukong.googlece.models.healthChecks.GetRequest request) throws Exception {
		return this.healthChecks().get(request.getProject(),request.getHealthCheck());
	}

	public com.google.api.services.compute.Compute.HealthChecks.Update updateHealthChecks(com.github.wukong.googlece.models.healthChecks.UpdateRequest request) throws Exception {
		return this.healthChecks().update(request.getProject(),request.getHealthCheck(),request.getContent());
	}

	public com.google.api.services.compute.Compute.HealthChecks.Insert insertHealthChecks(com.github.wukong.googlece.models.healthChecks.InsertRequest request) throws Exception {
		return this.healthChecks().insert(request.getProject(),request.getContent());
	}

	public com.google.api.services.compute.Compute.HealthChecks.List listHealthChecks(com.github.wukong.googlece.models.healthChecks.ListRequest request) throws Exception {
		return this.healthChecks().list(request.getProject());
	}

	public com.google.api.services.compute.Compute.HealthChecks.Delete deleteHealthChecks(com.github.wukong.googlece.models.healthChecks.DeleteRequest request) throws Exception {
		return this.healthChecks().delete(request.getProject(),request.getHealthCheck());
	}

	public com.google.api.services.compute.Compute.HttpHealthChecks.Patch patchHttpHealthChecks(com.github.wukong.googlece.models.httpHealthChecks.PatchRequest request) throws Exception {
		return this.httpHealthChecks().patch(request.getProject(),request.getHttpHealthCheck(),request.getContent());
	}

	public com.google.api.services.compute.Compute.HttpHealthChecks.Get getHttpHealthChecks(com.github.wukong.googlece.models.httpHealthChecks.GetRequest request) throws Exception {
		return this.httpHealthChecks().get(request.getProject(),request.getHttpHealthCheck());
	}

	public com.google.api.services.compute.Compute.HttpHealthChecks.Update updateHttpHealthChecks(com.github.wukong.googlece.models.httpHealthChecks.UpdateRequest request) throws Exception {
		return this.httpHealthChecks().update(request.getProject(),request.getHttpHealthCheck(),request.getContent());
	}

	public com.google.api.services.compute.Compute.HttpHealthChecks.Insert insertHttpHealthChecks(com.github.wukong.googlece.models.httpHealthChecks.InsertRequest request) throws Exception {
		return this.httpHealthChecks().insert(request.getProject(),request.getContent());
	}

	public com.google.api.services.compute.Compute.HttpHealthChecks.List listHttpHealthChecks(com.github.wukong.googlece.models.httpHealthChecks.ListRequest request) throws Exception {
		return this.httpHealthChecks().list(request.getProject());
	}

	public com.google.api.services.compute.Compute.HttpHealthChecks.Delete deleteHttpHealthChecks(com.github.wukong.googlece.models.httpHealthChecks.DeleteRequest request) throws Exception {
		return this.httpHealthChecks().delete(request.getProject(),request.getHttpHealthCheck());
	}

	public com.google.api.services.compute.Compute.HttpsHealthChecks.Patch patchHttpsHealthChecks(com.github.wukong.googlece.models.httpsHealthChecks.PatchRequest request) throws Exception {
		return this.httpsHealthChecks().patch(request.getProject(),request.getHttpsHealthCheck(),request.getContent());
	}

	public com.google.api.services.compute.Compute.HttpsHealthChecks.Get getHttpsHealthChecks(com.github.wukong.googlece.models.httpsHealthChecks.GetRequest request) throws Exception {
		return this.httpsHealthChecks().get(request.getProject(),request.getHttpsHealthCheck());
	}

	public com.google.api.services.compute.Compute.HttpsHealthChecks.Update updateHttpsHealthChecks(com.github.wukong.googlece.models.httpsHealthChecks.UpdateRequest request) throws Exception {
		return this.httpsHealthChecks().update(request.getProject(),request.getHttpsHealthCheck(),request.getContent());
	}

	public com.google.api.services.compute.Compute.HttpsHealthChecks.Insert insertHttpsHealthChecks(com.github.wukong.googlece.models.httpsHealthChecks.InsertRequest request) throws Exception {
		return this.httpsHealthChecks().insert(request.getProject(),request.getContent());
	}

	public com.google.api.services.compute.Compute.HttpsHealthChecks.List listHttpsHealthChecks(com.github.wukong.googlece.models.httpsHealthChecks.ListRequest request) throws Exception {
		return this.httpsHealthChecks().list(request.getProject());
	}

	public com.google.api.services.compute.Compute.HttpsHealthChecks.Delete deleteHttpsHealthChecks(com.github.wukong.googlece.models.httpsHealthChecks.DeleteRequest request) throws Exception {
		return this.httpsHealthChecks().delete(request.getProject(),request.getHttpsHealthCheck());
	}

	public com.google.api.services.compute.Compute.Images.GetFromFamily getFromFamilyImages(com.github.wukong.googlece.models.images.GetFromFamilyRequest request) throws Exception {
		return this.images().getFromFamily(request.getProject(),request.getFamily());
	}

	public com.google.api.services.compute.Compute.Images.Deprecate deprecateImages(com.github.wukong.googlece.models.images.DeprecateRequest request) throws Exception {
		return this.images().deprecate(request.getProject(),request.getImage(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Images.Get getImages(com.github.wukong.googlece.models.images.GetRequest request) throws Exception {
		return this.images().get(request.getProject(),request.getImage());
	}

	public com.google.api.services.compute.Compute.Images.Insert insertImages(com.github.wukong.googlece.models.images.InsertRequest request) throws Exception {
		return this.images().insert(request.getProject(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Images.List listImages(com.github.wukong.googlece.models.images.ListRequest request) throws Exception {
		return this.images().list(request.getProject());
	}

	public com.google.api.services.compute.Compute.Images.SetLabels setLabelsImages(com.github.wukong.googlece.models.images.SetLabelsRequest request) throws Exception {
		return this.images().setLabels(request.getProject(),request.getResource(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Images.Delete deleteImages(com.github.wukong.googlece.models.images.DeleteRequest request) throws Exception {
		return this.images().delete(request.getProject(),request.getImage());
	}

	public com.google.api.services.compute.Compute.InstanceGroupManagers.SetInstanceTemplate setInstanceTemplateInstanceGroupManagers(com.github.wukong.googlece.models.instanceGroupManagers.SetInstanceTemplateRequest request) throws Exception {
		return this.instanceGroupManagers().setInstanceTemplate(request.getProject(),request.getZone(),request.getInstanceGroupManager(),request.getContent());
	}

	public com.google.api.services.compute.Compute.InstanceGroupManagers.SetTargetPools setTargetPoolsInstanceGroupManagers(com.github.wukong.googlece.models.instanceGroupManagers.SetTargetPoolsRequest request) throws Exception {
		return this.instanceGroupManagers().setTargetPools(request.getProject(),request.getZone(),request.getInstanceGroupManager(),request.getContent());
	}

	public com.google.api.services.compute.Compute.InstanceGroupManagers.RecreateInstances recreateInstancesInstanceGroupManagers(com.github.wukong.googlece.models.instanceGroupManagers.RecreateInstancesRequest request) throws Exception {
		return this.instanceGroupManagers().recreateInstances(request.getProject(),request.getZone(),request.getInstanceGroupManager(),request.getContent());
	}

	public com.google.api.services.compute.Compute.InstanceGroupManagers.Get getInstanceGroupManagers(com.github.wukong.googlece.models.instanceGroupManagers.GetRequest request) throws Exception {
		return this.instanceGroupManagers().get(request.getProject(),request.getZone(),request.getInstanceGroupManager());
	}

	public com.google.api.services.compute.Compute.InstanceGroupManagers.DeleteInstances deleteInstancesInstanceGroupManagers(com.github.wukong.googlece.models.instanceGroupManagers.DeleteInstancesRequest request) throws Exception {
		return this.instanceGroupManagers().deleteInstances(request.getProject(),request.getZone(),request.getInstanceGroupManager(),request.getContent());
	}

	public com.google.api.services.compute.Compute.InstanceGroupManagers.Insert insertInstanceGroupManagers(com.github.wukong.googlece.models.instanceGroupManagers.InsertRequest request) throws Exception {
		return this.instanceGroupManagers().insert(request.getProject(),request.getZone(),request.getContent());
	}

	public com.google.api.services.compute.Compute.InstanceGroupManagers.Resize resizeInstanceGroupManagers(com.github.wukong.googlece.models.instanceGroupManagers.ResizeRequest request) throws Exception {
		return this.instanceGroupManagers().resize(request.getProject(),request.getZone(),request.getInstanceGroupManager(),request.getSize());
	}

	public com.google.api.services.compute.Compute.InstanceGroupManagers.AggregatedList aggregatedListInstanceGroupManagers(com.github.wukong.googlece.models.instanceGroupManagers.AggregatedListRequest request) throws Exception {
		return this.instanceGroupManagers().aggregatedList(request.getProject());
	}

	public com.google.api.services.compute.Compute.InstanceGroupManagers.ListManagedInstances listManagedInstancesInstanceGroupManagers(com.github.wukong.googlece.models.instanceGroupManagers.ListManagedInstancesRequest request) throws Exception {
		return this.instanceGroupManagers().listManagedInstances(request.getProject(),request.getZone(),request.getInstanceGroupManager());
	}

	public com.google.api.services.compute.Compute.InstanceGroupManagers.List listInstanceGroupManagers(com.github.wukong.googlece.models.instanceGroupManagers.ListRequest request) throws Exception {
		return this.instanceGroupManagers().list(request.getProject(),request.getZone());
	}

	public com.google.api.services.compute.Compute.InstanceGroupManagers.AbandonInstances abandonInstancesInstanceGroupManagers(com.github.wukong.googlece.models.instanceGroupManagers.AbandonInstancesRequest request) throws Exception {
		return this.instanceGroupManagers().abandonInstances(request.getProject(),request.getZone(),request.getInstanceGroupManager(),request.getContent());
	}

	public com.google.api.services.compute.Compute.InstanceGroupManagers.Delete deleteInstanceGroupManagers(com.github.wukong.googlece.models.instanceGroupManagers.DeleteRequest request) throws Exception {
		return this.instanceGroupManagers().delete(request.getProject(),request.getZone(),request.getInstanceGroupManager());
	}

	public com.google.api.services.compute.Compute.InstanceGroups.RemoveInstances removeInstancesInstanceGroups(com.github.wukong.googlece.models.instanceGroups.RemoveInstancesRequest request) throws Exception {
		return this.instanceGroups().removeInstances(request.getProject(),request.getZone(),request.getInstanceGroup(),request.getContent());
	}

	public com.google.api.services.compute.Compute.InstanceGroups.ListInstances listInstancesInstanceGroups(com.github.wukong.googlece.models.instanceGroups.ListInstancesRequest request) throws Exception {
		return this.instanceGroups().listInstances(request.getProject(),request.getZone(),request.getInstanceGroup(),request.getContent());
	}

	public com.google.api.services.compute.Compute.InstanceGroups.Get getInstanceGroups(com.github.wukong.googlece.models.instanceGroups.GetRequest request) throws Exception {
		return this.instanceGroups().get(request.getProject(),request.getZone(),request.getInstanceGroup());
	}

	public com.google.api.services.compute.Compute.InstanceGroups.Insert insertInstanceGroups(com.github.wukong.googlece.models.instanceGroups.InsertRequest request) throws Exception {
		return this.instanceGroups().insert(request.getProject(),request.getZone(),request.getContent());
	}

	public com.google.api.services.compute.Compute.InstanceGroups.AggregatedList aggregatedListInstanceGroups(com.github.wukong.googlece.models.instanceGroups.AggregatedListRequest request) throws Exception {
		return this.instanceGroups().aggregatedList(request.getProject());
	}

	public com.google.api.services.compute.Compute.InstanceGroups.SetNamedPorts setNamedPortsInstanceGroups(com.github.wukong.googlece.models.instanceGroups.SetNamedPortsRequest request) throws Exception {
		return this.instanceGroups().setNamedPorts(request.getProject(),request.getZone(),request.getInstanceGroup(),request.getContent());
	}

	public com.google.api.services.compute.Compute.InstanceGroups.List listInstanceGroups(com.github.wukong.googlece.models.instanceGroups.ListRequest request) throws Exception {
		return this.instanceGroups().list(request.getProject(),request.getZone());
	}

	public com.google.api.services.compute.Compute.InstanceGroups.Delete deleteInstanceGroups(com.github.wukong.googlece.models.instanceGroups.DeleteRequest request) throws Exception {
		return this.instanceGroups().delete(request.getProject(),request.getZone(),request.getInstanceGroup());
	}

	public com.google.api.services.compute.Compute.InstanceGroups.AddInstances addInstancesInstanceGroups(com.github.wukong.googlece.models.instanceGroups.AddInstancesRequest request) throws Exception {
		return this.instanceGroups().addInstances(request.getProject(),request.getZone(),request.getInstanceGroup(),request.getContent());
	}

	public com.google.api.services.compute.Compute.InstanceTemplates.Get getInstanceTemplates(com.github.wukong.googlece.models.instanceTemplates.GetRequest request) throws Exception {
		return this.instanceTemplates().get(request.getProject(),request.getInstanceTemplate());
	}

	public com.google.api.services.compute.Compute.InstanceTemplates.Insert insertInstanceTemplates(com.github.wukong.googlece.models.instanceTemplates.InsertRequest request) throws Exception {
		return this.instanceTemplates().insert(request.getProject(),request.getContent());
	}

	public com.google.api.services.compute.Compute.InstanceTemplates.List listInstanceTemplates(com.github.wukong.googlece.models.instanceTemplates.ListRequest request) throws Exception {
		return this.instanceTemplates().list(request.getProject());
	}

	public com.google.api.services.compute.Compute.InstanceTemplates.Delete deleteInstanceTemplates(com.github.wukong.googlece.models.instanceTemplates.DeleteRequest request) throws Exception {
		return this.instanceTemplates().delete(request.getProject(),request.getInstanceTemplate());
	}

	public com.google.api.services.compute.Compute.Instances.UpdateNetworkInterface updateNetworkInterfaceInstances(com.github.wukong.googlece.models.instances.UpdateNetworkInterfaceRequest request) throws Exception {
		return this.instances().updateNetworkInterface(request.getProject(),request.getZone(),request.getInstance(),request.getNetworkInterface(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Instances.GetSerialPortOutput getSerialPortOutputInstances(com.github.wukong.googlece.models.instances.GetSerialPortOutputRequest request) throws Exception {
		return this.instances().getSerialPortOutput(request.getProject(),request.getZone(),request.getInstance());
	}

	public com.google.api.services.compute.Compute.Instances.Insert insertInstances(com.github.wukong.googlece.models.instances.InsertRequest request) throws Exception {
		return this.instances().insert(request.getProject(),request.getZone(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Instances.SetTags setTagsInstances(com.github.wukong.googlece.models.instances.SetTagsRequest request) throws Exception {
		return this.instances().setTags(request.getProject(),request.getZone(),request.getInstance(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Instances.ListReferrers listReferrersInstances(com.github.wukong.googlece.models.instances.ListReferrersRequest request) throws Exception {
		return this.instances().listReferrers(request.getProject(),request.getZone(),request.getInstance());
	}

	public com.google.api.services.compute.Compute.Instances.SetMachineResources setMachineResourcesInstances(com.github.wukong.googlece.models.instances.SetMachineResourcesRequest request) throws Exception {
		return this.instances().setMachineResources(request.getProject(),request.getZone(),request.getInstance(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Instances.StartWithEncryptionKey startWithEncryptionKeyInstances(com.github.wukong.googlece.models.instances.StartWithEncryptionKeyRequest request) throws Exception {
		return this.instances().startWithEncryptionKey(request.getProject(),request.getZone(),request.getInstance(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Instances.Delete deleteInstances(com.github.wukong.googlece.models.instances.DeleteRequest request) throws Exception {
		return this.instances().delete(request.getProject(),request.getZone(),request.getInstance());
	}

	public com.google.api.services.compute.Compute.Instances.Get getInstances(com.github.wukong.googlece.models.instances.GetRequest request) throws Exception {
		return this.instances().get(request.getProject(),request.getZone(),request.getInstance());
	}

	public com.google.api.services.compute.Compute.Instances.AddAccessConfig addAccessConfigInstances(com.github.wukong.googlece.models.instances.AddAccessConfigRequest request) throws Exception {
		return this.instances().addAccessConfig(request.getProject(),request.getZone(),request.getInstance(),request.getNetworkInterface(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Instances.UpdateAccessConfig updateAccessConfigInstances(com.github.wukong.googlece.models.instances.UpdateAccessConfigRequest request) throws Exception {
		return this.instances().updateAccessConfig(request.getProject(),request.getZone(),request.getInstance(),request.getNetworkInterface(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Instances.SetDeletionProtection setDeletionProtectionInstances(com.github.wukong.googlece.models.instances.SetDeletionProtectionRequest request) throws Exception {
		return this.instances().setDeletionProtection(request.getProject(),request.getZone(),request.getResource());
	}

	public com.google.api.services.compute.Compute.Instances.SetServiceAccount setServiceAccountInstances(com.github.wukong.googlece.models.instances.SetServiceAccountRequest request) throws Exception {
		return this.instances().setServiceAccount(request.getProject(),request.getZone(),request.getInstance(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Instances.SetLabels setLabelsInstances(com.github.wukong.googlece.models.instances.SetLabelsRequest request) throws Exception {
		return this.instances().setLabels(request.getProject(),request.getZone(),request.getInstance(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Instances.SetDiskAutoDelete setDiskAutoDeleteInstances(com.github.wukong.googlece.models.instances.SetDiskAutoDeleteRequest request) throws Exception {
		return this.instances().setDiskAutoDelete(request.getProject(),request.getZone(),request.getInstance(),request.getAutoDelete(),request.getDeviceName());
	}

	public com.google.api.services.compute.Compute.Instances.SetMinCpuPlatform setMinCpuPlatformInstances(com.github.wukong.googlece.models.instances.SetMinCpuPlatformRequest request) throws Exception {
		return this.instances().setMinCpuPlatform(request.getProject(),request.getZone(),request.getInstance(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Instances.SetMachineType setMachineTypeInstances(com.github.wukong.googlece.models.instances.SetMachineTypeRequest request) throws Exception {
		return this.instances().setMachineType(request.getProject(),request.getZone(),request.getInstance(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Instances.AttachDisk attachDiskInstances(com.github.wukong.googlece.models.instances.AttachDiskRequest request) throws Exception {
		return this.instances().attachDisk(request.getProject(),request.getZone(),request.getInstance(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Instances.DeleteAccessConfig deleteAccessConfigInstances(com.github.wukong.googlece.models.instances.DeleteAccessConfigRequest request) throws Exception {
		return this.instances().deleteAccessConfig(request.getProject(),request.getZone(),request.getInstance(),request.getAccessConfig(),request.getNetworkInterface());
	}

	public com.google.api.services.compute.Compute.Instances.SetScheduling setSchedulingInstances(com.github.wukong.googlece.models.instances.SetSchedulingRequest request) throws Exception {
		return this.instances().setScheduling(request.getProject(),request.getZone(),request.getInstance(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Instances.Start startInstances(com.github.wukong.googlece.models.instances.StartRequest request) throws Exception {
		return this.instances().start(request.getProject(),request.getZone(),request.getInstance());
	}

	public com.google.api.services.compute.Compute.Instances.List listInstances(com.github.wukong.googlece.models.instances.ListRequest request) throws Exception {
		return this.instances().list(request.getProject(),request.getZone());
	}

	public com.google.api.services.compute.Compute.Instances.DetachDisk detachDiskInstances(com.github.wukong.googlece.models.instances.DetachDiskRequest request) throws Exception {
		return this.instances().detachDisk(request.getProject(),request.getZone(),request.getInstance(),request.getDeviceName());
	}

	public com.google.api.services.compute.Compute.Instances.SetMetadata setMetadataInstances(com.github.wukong.googlece.models.instances.SetMetadataRequest request) throws Exception {
		return this.instances().setMetadata(request.getProject(),request.getZone(),request.getInstance(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Instances.Stop stopInstances(com.github.wukong.googlece.models.instances.StopRequest request) throws Exception {
		return this.instances().stop(request.getProject(),request.getZone(),request.getInstance());
	}

	public com.google.api.services.compute.Compute.Instances.SimulateMaintenanceEvent simulateMaintenanceEventInstances(com.github.wukong.googlece.models.instances.SimulateMaintenanceEventRequest request) throws Exception {
		return this.instances().simulateMaintenanceEvent(request.getProject(),request.getZone(),request.getInstance());
	}

	public com.google.api.services.compute.Compute.Instances.Reset resetInstances(com.github.wukong.googlece.models.instances.ResetRequest request) throws Exception {
		return this.instances().reset(request.getProject(),request.getZone(),request.getInstance());
	}

	public com.google.api.services.compute.Compute.Instances.AggregatedList aggregatedListInstances(com.github.wukong.googlece.models.instances.AggregatedListRequest request) throws Exception {
		return this.instances().aggregatedList(request.getProject());
	}

	public com.google.api.services.compute.Compute.InterconnectAttachments.Patch patchInterconnectAttachments(com.github.wukong.googlece.models.interconnectAttachments.PatchRequest request) throws Exception {
		return this.interconnectAttachments().patch(request.getProject(),request.getRegion(),request.getInterconnectAttachment(),request.getContent());
	}

	public com.google.api.services.compute.Compute.InterconnectAttachments.Get getInterconnectAttachments(com.github.wukong.googlece.models.interconnectAttachments.GetRequest request) throws Exception {
		return this.interconnectAttachments().get(request.getProject(),request.getRegion(),request.getInterconnectAttachment());
	}

	public com.google.api.services.compute.Compute.InterconnectAttachments.Insert insertInterconnectAttachments(com.github.wukong.googlece.models.interconnectAttachments.InsertRequest request) throws Exception {
		return this.interconnectAttachments().insert(request.getProject(),request.getRegion(),request.getContent());
	}

	public com.google.api.services.compute.Compute.InterconnectAttachments.AggregatedList aggregatedListInterconnectAttachments(com.github.wukong.googlece.models.interconnectAttachments.AggregatedListRequest request) throws Exception {
		return this.interconnectAttachments().aggregatedList(request.getProject());
	}

	public com.google.api.services.compute.Compute.InterconnectAttachments.List listInterconnectAttachments(com.github.wukong.googlece.models.interconnectAttachments.ListRequest request) throws Exception {
		return this.interconnectAttachments().list(request.getProject(),request.getRegion());
	}

	public com.google.api.services.compute.Compute.InterconnectAttachments.Delete deleteInterconnectAttachments(com.github.wukong.googlece.models.interconnectAttachments.DeleteRequest request) throws Exception {
		return this.interconnectAttachments().delete(request.getProject(),request.getRegion(),request.getInterconnectAttachment());
	}

	public com.google.api.services.compute.Compute.InterconnectLocations.Get getInterconnectLocations(com.github.wukong.googlece.models.interconnectLocations.GetRequest request) throws Exception {
		return this.interconnectLocations().get(request.getProject(),request.getInterconnectLocation());
	}

	public com.google.api.services.compute.Compute.InterconnectLocations.List listInterconnectLocations(com.github.wukong.googlece.models.interconnectLocations.ListRequest request) throws Exception {
		return this.interconnectLocations().list(request.getProject());
	}

	public com.google.api.services.compute.Compute.Interconnects.Patch patchInterconnects(com.github.wukong.googlece.models.interconnects.PatchRequest request) throws Exception {
		return this.interconnects().patch(request.getProject(),request.getInterconnect(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Interconnects.GetDiagnostics getDiagnosticsInterconnects(com.github.wukong.googlece.models.interconnects.GetDiagnosticsRequest request) throws Exception {
		return this.interconnects().getDiagnostics(request.getProject(),request.getInterconnect());
	}

	public com.google.api.services.compute.Compute.Interconnects.Get getInterconnects(com.github.wukong.googlece.models.interconnects.GetRequest request) throws Exception {
		return this.interconnects().get(request.getProject(),request.getInterconnect());
	}

	public com.google.api.services.compute.Compute.Interconnects.Insert insertInterconnects(com.github.wukong.googlece.models.interconnects.InsertRequest request) throws Exception {
		return this.interconnects().insert(request.getProject(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Interconnects.List listInterconnects(com.github.wukong.googlece.models.interconnects.ListRequest request) throws Exception {
		return this.interconnects().list(request.getProject());
	}

	public com.google.api.services.compute.Compute.Interconnects.Delete deleteInterconnects(com.github.wukong.googlece.models.interconnects.DeleteRequest request) throws Exception {
		return this.interconnects().delete(request.getProject(),request.getInterconnect());
	}

	public com.google.api.services.compute.Compute.LicenseCodes.TestIamPermissions testIamPermissionsLicenseCodes(com.github.wukong.googlece.models.licenseCodes.TestIamPermissionsRequest request) throws Exception {
		return this.licenseCodes().testIamPermissions(request.getProject(),request.getResource(),request.getContent());
	}

	public com.google.api.services.compute.Compute.LicenseCodes.Get getLicenseCodes(com.github.wukong.googlece.models.licenseCodes.GetRequest request) throws Exception {
		return this.licenseCodes().get(request.getProject(),request.getLicenseCode());
	}

	public com.google.api.services.compute.Compute.Licenses.TestIamPermissions testIamPermissionsLicenses(com.github.wukong.googlece.models.licenses.TestIamPermissionsRequest request) throws Exception {
		return this.licenses().testIamPermissions(request.getProject(),request.getResource(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Licenses.Get getLicenses(com.github.wukong.googlece.models.licenses.GetRequest request) throws Exception {
		return this.licenses().get(request.getProject(),request.getLicense());
	}

	public com.google.api.services.compute.Compute.Licenses.Insert insertLicenses(com.github.wukong.googlece.models.licenses.InsertRequest request) throws Exception {
		return this.licenses().insert(request.getProject(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Licenses.List listLicenses(com.github.wukong.googlece.models.licenses.ListRequest request) throws Exception {
		return this.licenses().list(request.getProject());
	}

	public com.google.api.services.compute.Compute.Licenses.Delete deleteLicenses(com.github.wukong.googlece.models.licenses.DeleteRequest request) throws Exception {
		return this.licenses().delete(request.getProject(),request.getLicense());
	}

	public com.google.api.services.compute.Compute.MachineTypes.Get getMachineTypes(com.github.wukong.googlece.models.machineTypes.GetRequest request) throws Exception {
		return this.machineTypes().get(request.getProject(),request.getZone(),request.getMachineType());
	}

	public com.google.api.services.compute.Compute.MachineTypes.AggregatedList aggregatedListMachineTypes(com.github.wukong.googlece.models.machineTypes.AggregatedListRequest request) throws Exception {
		return this.machineTypes().aggregatedList(request.getProject());
	}

	public com.google.api.services.compute.Compute.MachineTypes.List listMachineTypes(com.github.wukong.googlece.models.machineTypes.ListRequest request) throws Exception {
		return this.machineTypes().list(request.getProject(),request.getZone());
	}

	public com.google.api.services.compute.Compute.Networks.Patch patchNetworks(com.github.wukong.googlece.models.networks.PatchRequest request) throws Exception {
		return this.networks().patch(request.getProject(),request.getNetwork(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Networks.RemovePeering removePeeringNetworks(com.github.wukong.googlece.models.networks.RemovePeeringRequest request) throws Exception {
		return this.networks().removePeering(request.getProject(),request.getNetwork(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Networks.Get getNetworks(com.github.wukong.googlece.models.networks.GetRequest request) throws Exception {
		return this.networks().get(request.getProject(),request.getNetwork());
	}

	public com.google.api.services.compute.Compute.Networks.SwitchToCustomMode switchToCustomModeNetworks(com.github.wukong.googlece.models.networks.SwitchToCustomModeRequest request) throws Exception {
		return this.networks().switchToCustomMode(request.getProject(),request.getNetwork());
	}

	public com.google.api.services.compute.Compute.Networks.Insert insertNetworks(com.github.wukong.googlece.models.networks.InsertRequest request) throws Exception {
		return this.networks().insert(request.getProject(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Networks.AddPeering addPeeringNetworks(com.github.wukong.googlece.models.networks.AddPeeringRequest request) throws Exception {
		return this.networks().addPeering(request.getProject(),request.getNetwork(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Networks.List listNetworks(com.github.wukong.googlece.models.networks.ListRequest request) throws Exception {
		return this.networks().list(request.getProject());
	}

	public com.google.api.services.compute.Compute.Networks.Delete deleteNetworks(com.github.wukong.googlece.models.networks.DeleteRequest request) throws Exception {
		return this.networks().delete(request.getProject(),request.getNetwork());
	}

	public com.google.api.services.compute.Compute.NodeGroups.SetNodeTemplate setNodeTemplateNodeGroups(com.github.wukong.googlece.models.nodeGroups.SetNodeTemplateRequest request) throws Exception {
		return this.nodeGroups().setNodeTemplate(request.getProject(),request.getZone(),request.getNodeGroup(),request.getContent());
	}

	public com.google.api.services.compute.Compute.NodeGroups.AddNodes addNodesNodeGroups(com.github.wukong.googlece.models.nodeGroups.AddNodesRequest request) throws Exception {
		return this.nodeGroups().addNodes(request.getProject(),request.getZone(),request.getNodeGroup(),request.getContent());
	}

	public com.google.api.services.compute.Compute.NodeGroups.DeleteNodes deleteNodesNodeGroups(com.github.wukong.googlece.models.nodeGroups.DeleteNodesRequest request) throws Exception {
		return this.nodeGroups().deleteNodes(request.getProject(),request.getZone(),request.getNodeGroup(),request.getContent());
	}

	public com.google.api.services.compute.Compute.NodeGroups.Get getNodeGroups(com.github.wukong.googlece.models.nodeGroups.GetRequest request) throws Exception {
		return this.nodeGroups().get(request.getProject(),request.getZone(),request.getNodeGroup());
	}

	public com.google.api.services.compute.Compute.NodeGroups.Insert insertNodeGroups(com.github.wukong.googlece.models.nodeGroups.InsertRequest request) throws Exception {
		return this.nodeGroups().insert(request.getProject(),request.getZone(),request.getInitialNodeCount(),request.getContent());
	}

	public com.google.api.services.compute.Compute.NodeGroups.AggregatedList aggregatedListNodeGroups(com.github.wukong.googlece.models.nodeGroups.AggregatedListRequest request) throws Exception {
		return this.nodeGroups().aggregatedList(request.getProject());
	}

	public com.google.api.services.compute.Compute.NodeGroups.ListNodes listNodesNodeGroups(com.github.wukong.googlece.models.nodeGroups.ListNodesRequest request) throws Exception {
		return this.nodeGroups().listNodes(request.getProject(),request.getZone(),request.getNodeGroup());
	}

	public com.google.api.services.compute.Compute.NodeGroups.List listNodeGroups(com.github.wukong.googlece.models.nodeGroups.ListRequest request) throws Exception {
		return this.nodeGroups().list(request.getProject(),request.getZone());
	}

	public com.google.api.services.compute.Compute.NodeGroups.Delete deleteNodeGroups(com.github.wukong.googlece.models.nodeGroups.DeleteRequest request) throws Exception {
		return this.nodeGroups().delete(request.getProject(),request.getZone(),request.getNodeGroup());
	}

	public com.google.api.services.compute.Compute.NodeTemplates.Get getNodeTemplates(com.github.wukong.googlece.models.nodeTemplates.GetRequest request) throws Exception {
		return this.nodeTemplates().get(request.getProject(),request.getRegion(),request.getNodeTemplate());
	}

	public com.google.api.services.compute.Compute.NodeTemplates.Insert insertNodeTemplates(com.github.wukong.googlece.models.nodeTemplates.InsertRequest request) throws Exception {
		return this.nodeTemplates().insert(request.getProject(),request.getRegion(),request.getContent());
	}

	public com.google.api.services.compute.Compute.NodeTemplates.AggregatedList aggregatedListNodeTemplates(com.github.wukong.googlece.models.nodeTemplates.AggregatedListRequest request) throws Exception {
		return this.nodeTemplates().aggregatedList(request.getProject());
	}

	public com.google.api.services.compute.Compute.NodeTemplates.List listNodeTemplates(com.github.wukong.googlece.models.nodeTemplates.ListRequest request) throws Exception {
		return this.nodeTemplates().list(request.getProject(),request.getRegion());
	}

	public com.google.api.services.compute.Compute.NodeTemplates.Delete deleteNodeTemplates(com.github.wukong.googlece.models.nodeTemplates.DeleteRequest request) throws Exception {
		return this.nodeTemplates().delete(request.getProject(),request.getRegion(),request.getNodeTemplate());
	}

	public com.google.api.services.compute.Compute.NodeTypes.Get getNodeTypes(com.github.wukong.googlece.models.nodeTypes.GetRequest request) throws Exception {
		return this.nodeTypes().get(request.getProject(),request.getZone(),request.getNodeType());
	}

	public com.google.api.services.compute.Compute.NodeTypes.AggregatedList aggregatedListNodeTypes(com.github.wukong.googlece.models.nodeTypes.AggregatedListRequest request) throws Exception {
		return this.nodeTypes().aggregatedList(request.getProject());
	}

	public com.google.api.services.compute.Compute.NodeTypes.List listNodeTypes(com.github.wukong.googlece.models.nodeTypes.ListRequest request) throws Exception {
		return this.nodeTypes().list(request.getProject(),request.getZone());
	}

	public com.google.api.services.compute.Compute.Projects.GetXpnHost getXpnHostProjects(com.github.wukong.googlece.models.projects.GetXpnHostRequest request) throws Exception {
		return this.projects().getXpnHost(request.getProject());
	}

	public com.google.api.services.compute.Compute.Projects.SetCommonInstanceMetadata setCommonInstanceMetadataProjects(com.github.wukong.googlece.models.projects.SetCommonInstanceMetadataRequest request) throws Exception {
		return this.projects().setCommonInstanceMetadata(request.getProject(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Projects.SetUsageExportBucket setUsageExportBucketProjects(com.github.wukong.googlece.models.projects.SetUsageExportBucketRequest request) throws Exception {
		return this.projects().setUsageExportBucket(request.getProject(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Projects.EnableXpnResource enableXpnResourceProjects(com.github.wukong.googlece.models.projects.EnableXpnResourceRequest request) throws Exception {
		return this.projects().enableXpnResource(request.getProject(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Projects.DisableXpnHost disableXpnHostProjects(com.github.wukong.googlece.models.projects.DisableXpnHostRequest request) throws Exception {
		return this.projects().disableXpnHost(request.getProject());
	}

	public com.google.api.services.compute.Compute.Projects.EnableXpnHost enableXpnHostProjects(com.github.wukong.googlece.models.projects.EnableXpnHostRequest request) throws Exception {
		return this.projects().enableXpnHost(request.getProject());
	}

	public com.google.api.services.compute.Compute.Projects.MoveDisk moveDiskProjects(com.github.wukong.googlece.models.projects.MoveDiskRequest request) throws Exception {
		return this.projects().moveDisk(request.getProject(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Projects.MoveInstance moveInstanceProjects(com.github.wukong.googlece.models.projects.MoveInstanceRequest request) throws Exception {
		return this.projects().moveInstance(request.getProject(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Projects.ListXpnHosts listXpnHostsProjects(com.github.wukong.googlece.models.projects.ListXpnHostsRequest request) throws Exception {
		return this.projects().listXpnHosts(request.getProject(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Projects.GetXpnResources getXpnResourcesProjects(com.github.wukong.googlece.models.projects.GetXpnResourcesRequest request) throws Exception {
		return this.projects().getXpnResources(request.getProject());
	}

	public com.google.api.services.compute.Compute.Projects.Get getProjects(com.github.wukong.googlece.models.projects.GetRequest request) throws Exception {
		return this.projects().get(request.getProject());
	}

	public com.google.api.services.compute.Compute.Projects.SetDefaultNetworkTier setDefaultNetworkTierProjects(com.github.wukong.googlece.models.projects.SetDefaultNetworkTierRequest request) throws Exception {
		return this.projects().setDefaultNetworkTier(request.getProject(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Projects.DisableXpnResource disableXpnResourceProjects(com.github.wukong.googlece.models.projects.DisableXpnResourceRequest request) throws Exception {
		return this.projects().disableXpnResource(request.getProject(),request.getContent());
	}

	public com.google.api.services.compute.Compute.RegionAutoscalers.Patch patchRegionAutoscalers(com.github.wukong.googlece.models.regionAutoscalers.PatchRequest request) throws Exception {
		return this.regionAutoscalers().patch(request.getProject(),request.getRegion(),request.getContent());
	}

	public com.google.api.services.compute.Compute.RegionAutoscalers.Get getRegionAutoscalers(com.github.wukong.googlece.models.regionAutoscalers.GetRequest request) throws Exception {
		return this.regionAutoscalers().get(request.getProject(),request.getRegion(),request.getAutoscaler());
	}

	public com.google.api.services.compute.Compute.RegionAutoscalers.Update updateRegionAutoscalers(com.github.wukong.googlece.models.regionAutoscalers.UpdateRequest request) throws Exception {
		return this.regionAutoscalers().update(request.getProject(),request.getRegion(),request.getContent());
	}

	public com.google.api.services.compute.Compute.RegionAutoscalers.Insert insertRegionAutoscalers(com.github.wukong.googlece.models.regionAutoscalers.InsertRequest request) throws Exception {
		return this.regionAutoscalers().insert(request.getProject(),request.getRegion(),request.getContent());
	}

	public com.google.api.services.compute.Compute.RegionAutoscalers.List listRegionAutoscalers(com.github.wukong.googlece.models.regionAutoscalers.ListRequest request) throws Exception {
		return this.regionAutoscalers().list(request.getProject(),request.getRegion());
	}

	public com.google.api.services.compute.Compute.RegionAutoscalers.Delete deleteRegionAutoscalers(com.github.wukong.googlece.models.regionAutoscalers.DeleteRequest request) throws Exception {
		return this.regionAutoscalers().delete(request.getProject(),request.getRegion(),request.getAutoscaler());
	}

	public com.google.api.services.compute.Compute.RegionBackendServices.Patch patchRegionBackendServices(com.github.wukong.googlece.models.regionBackendServices.PatchRequest request) throws Exception {
		return this.regionBackendServices().patch(request.getProject(),request.getRegion(),request.getBackendService(),request.getContent());
	}

	public com.google.api.services.compute.Compute.RegionBackendServices.Get getRegionBackendServices(com.github.wukong.googlece.models.regionBackendServices.GetRequest request) throws Exception {
		return this.regionBackendServices().get(request.getProject(),request.getRegion(),request.getBackendService());
	}

	public com.google.api.services.compute.Compute.RegionBackendServices.Update updateRegionBackendServices(com.github.wukong.googlece.models.regionBackendServices.UpdateRequest request) throws Exception {
		return this.regionBackendServices().update(request.getProject(),request.getRegion(),request.getBackendService(),request.getContent());
	}

	public com.google.api.services.compute.Compute.RegionBackendServices.Insert insertRegionBackendServices(com.github.wukong.googlece.models.regionBackendServices.InsertRequest request) throws Exception {
		return this.regionBackendServices().insert(request.getProject(),request.getRegion(),request.getContent());
	}

	public com.google.api.services.compute.Compute.RegionBackendServices.List listRegionBackendServices(com.github.wukong.googlece.models.regionBackendServices.ListRequest request) throws Exception {
		return this.regionBackendServices().list(request.getProject(),request.getRegion());
	}

	public com.google.api.services.compute.Compute.RegionBackendServices.Delete deleteRegionBackendServices(com.github.wukong.googlece.models.regionBackendServices.DeleteRequest request) throws Exception {
		return this.regionBackendServices().delete(request.getProject(),request.getRegion(),request.getBackendService());
	}

	public com.google.api.services.compute.Compute.RegionBackendServices.GetHealth getHealthRegionBackendServices(com.github.wukong.googlece.models.regionBackendServices.GetHealthRequest request) throws Exception {
		return this.regionBackendServices().getHealth(request.getProject(),request.getRegion(),request.getBackendService(),request.getContent());
	}

	public com.google.api.services.compute.Compute.RegionCommitments.Get getRegionCommitments(com.github.wukong.googlece.models.regionCommitments.GetRequest request) throws Exception {
		return this.regionCommitments().get(request.getProject(),request.getRegion(),request.getCommitment());
	}

	public com.google.api.services.compute.Compute.RegionCommitments.Insert insertRegionCommitments(com.github.wukong.googlece.models.regionCommitments.InsertRequest request) throws Exception {
		return this.regionCommitments().insert(request.getProject(),request.getRegion(),request.getContent());
	}

	public com.google.api.services.compute.Compute.RegionCommitments.AggregatedList aggregatedListRegionCommitments(com.github.wukong.googlece.models.regionCommitments.AggregatedListRequest request) throws Exception {
		return this.regionCommitments().aggregatedList(request.getProject());
	}

	public com.google.api.services.compute.Compute.RegionCommitments.List listRegionCommitments(com.github.wukong.googlece.models.regionCommitments.ListRequest request) throws Exception {
		return this.regionCommitments().list(request.getProject(),request.getRegion());
	}

	public com.google.api.services.compute.Compute.RegionDiskTypes.Get getRegionDiskTypes(com.github.wukong.googlece.models.regionDiskTypes.GetRequest request) throws Exception {
		return this.regionDiskTypes().get(request.getProject(),request.getRegion(),request.getDiskType());
	}

	public com.google.api.services.compute.Compute.RegionDiskTypes.List listRegionDiskTypes(com.github.wukong.googlece.models.regionDiskTypes.ListRequest request) throws Exception {
		return this.regionDiskTypes().list(request.getProject(),request.getRegion());
	}

	public com.google.api.services.compute.Compute.RegionDisks.TestIamPermissions testIamPermissionsRegionDisks(com.github.wukong.googlece.models.regionDisks.TestIamPermissionsRequest request) throws Exception {
		return this.regionDisks().testIamPermissions(request.getProject(),request.getRegion(),request.getResource(),request.getContent());
	}

	public com.google.api.services.compute.Compute.RegionDisks.Get getRegionDisks(com.github.wukong.googlece.models.regionDisks.GetRequest request) throws Exception {
		return this.regionDisks().get(request.getProject(),request.getRegion(),request.getDisk());
	}

	public com.google.api.services.compute.Compute.RegionDisks.CreateSnapshot createSnapshotRegionDisks(com.github.wukong.googlece.models.regionDisks.CreateSnapshotRequest request) throws Exception {
		return this.regionDisks().createSnapshot(request.getProject(),request.getRegion(),request.getDisk(),request.getContent());
	}

	public com.google.api.services.compute.Compute.RegionDisks.Insert insertRegionDisks(com.github.wukong.googlece.models.regionDisks.InsertRequest request) throws Exception {
		return this.regionDisks().insert(request.getProject(),request.getRegion(),request.getContent());
	}

	public com.google.api.services.compute.Compute.RegionDisks.Resize resizeRegionDisks(com.github.wukong.googlece.models.regionDisks.ResizeRequest request) throws Exception {
		return this.regionDisks().resize(request.getProject(),request.getRegion(),request.getDisk(),request.getContent());
	}

	public com.google.api.services.compute.Compute.RegionDisks.List listRegionDisks(com.github.wukong.googlece.models.regionDisks.ListRequest request) throws Exception {
		return this.regionDisks().list(request.getProject(),request.getRegion());
	}

	public com.google.api.services.compute.Compute.RegionDisks.SetLabels setLabelsRegionDisks(com.github.wukong.googlece.models.regionDisks.SetLabelsRequest request) throws Exception {
		return this.regionDisks().setLabels(request.getProject(),request.getRegion(),request.getResource(),request.getContent());
	}

	public com.google.api.services.compute.Compute.RegionDisks.Delete deleteRegionDisks(com.github.wukong.googlece.models.regionDisks.DeleteRequest request) throws Exception {
		return this.regionDisks().delete(request.getProject(),request.getRegion(),request.getDisk());
	}

	public com.google.api.services.compute.Compute.RegionInstanceGroupManagers.SetInstanceTemplate setInstanceTemplateRegionInstanceGroupManagers(com.github.wukong.googlece.models.regionInstanceGroupManagers.SetInstanceTemplateRequest request) throws Exception {
		return this.regionInstanceGroupManagers().setInstanceTemplate(request.getProject(),request.getRegion(),request.getInstanceGroupManager(),request.getContent());
	}

	public com.google.api.services.compute.Compute.RegionInstanceGroupManagers.SetTargetPools setTargetPoolsRegionInstanceGroupManagers(com.github.wukong.googlece.models.regionInstanceGroupManagers.SetTargetPoolsRequest request) throws Exception {
		return this.regionInstanceGroupManagers().setTargetPools(request.getProject(),request.getRegion(),request.getInstanceGroupManager(),request.getContent());
	}

	public com.google.api.services.compute.Compute.RegionInstanceGroupManagers.RecreateInstances recreateInstancesRegionInstanceGroupManagers(com.github.wukong.googlece.models.regionInstanceGroupManagers.RecreateInstancesRequest request) throws Exception {
		return this.regionInstanceGroupManagers().recreateInstances(request.getProject(),request.getRegion(),request.getInstanceGroupManager(),request.getContent());
	}

	public com.google.api.services.compute.Compute.RegionInstanceGroupManagers.Get getRegionInstanceGroupManagers(com.github.wukong.googlece.models.regionInstanceGroupManagers.GetRequest request) throws Exception {
		return this.regionInstanceGroupManagers().get(request.getProject(),request.getRegion(),request.getInstanceGroupManager());
	}

	public com.google.api.services.compute.Compute.RegionInstanceGroupManagers.DeleteInstances deleteInstancesRegionInstanceGroupManagers(com.github.wukong.googlece.models.regionInstanceGroupManagers.DeleteInstancesRequest request) throws Exception {
		return this.regionInstanceGroupManagers().deleteInstances(request.getProject(),request.getRegion(),request.getInstanceGroupManager(),request.getContent());
	}

	public com.google.api.services.compute.Compute.RegionInstanceGroupManagers.Insert insertRegionInstanceGroupManagers(com.github.wukong.googlece.models.regionInstanceGroupManagers.InsertRequest request) throws Exception {
		return this.regionInstanceGroupManagers().insert(request.getProject(),request.getRegion(),request.getContent());
	}

	public com.google.api.services.compute.Compute.RegionInstanceGroupManagers.Resize resizeRegionInstanceGroupManagers(com.github.wukong.googlece.models.regionInstanceGroupManagers.ResizeRequest request) throws Exception {
		return this.regionInstanceGroupManagers().resize(request.getProject(),request.getRegion(),request.getInstanceGroupManager(),request.getSize());
	}

	public com.google.api.services.compute.Compute.RegionInstanceGroupManagers.ListManagedInstances listManagedInstancesRegionInstanceGroupManagers(com.github.wukong.googlece.models.regionInstanceGroupManagers.ListManagedInstancesRequest request) throws Exception {
		return this.regionInstanceGroupManagers().listManagedInstances(request.getProject(),request.getRegion(),request.getInstanceGroupManager());
	}

	public com.google.api.services.compute.Compute.RegionInstanceGroupManagers.List listRegionInstanceGroupManagers(com.github.wukong.googlece.models.regionInstanceGroupManagers.ListRequest request) throws Exception {
		return this.regionInstanceGroupManagers().list(request.getProject(),request.getRegion());
	}

	public com.google.api.services.compute.Compute.RegionInstanceGroupManagers.AbandonInstances abandonInstancesRegionInstanceGroupManagers(com.github.wukong.googlece.models.regionInstanceGroupManagers.AbandonInstancesRequest request) throws Exception {
		return this.regionInstanceGroupManagers().abandonInstances(request.getProject(),request.getRegion(),request.getInstanceGroupManager(),request.getContent());
	}

	public com.google.api.services.compute.Compute.RegionInstanceGroupManagers.Delete deleteRegionInstanceGroupManagers(com.github.wukong.googlece.models.regionInstanceGroupManagers.DeleteRequest request) throws Exception {
		return this.regionInstanceGroupManagers().delete(request.getProject(),request.getRegion(),request.getInstanceGroupManager());
	}

	public com.google.api.services.compute.Compute.RegionInstanceGroups.ListInstances listInstancesRegionInstanceGroups(com.github.wukong.googlece.models.regionInstanceGroups.ListInstancesRequest request) throws Exception {
		return this.regionInstanceGroups().listInstances(request.getProject(),request.getRegion(),request.getInstanceGroup(),request.getContent());
	}

	public com.google.api.services.compute.Compute.RegionInstanceGroups.Get getRegionInstanceGroups(com.github.wukong.googlece.models.regionInstanceGroups.GetRequest request) throws Exception {
		return this.regionInstanceGroups().get(request.getProject(),request.getRegion(),request.getInstanceGroup());
	}

	public com.google.api.services.compute.Compute.RegionInstanceGroups.SetNamedPorts setNamedPortsRegionInstanceGroups(com.github.wukong.googlece.models.regionInstanceGroups.SetNamedPortsRequest request) throws Exception {
		return this.regionInstanceGroups().setNamedPorts(request.getProject(),request.getRegion(),request.getInstanceGroup(),request.getContent());
	}

	public com.google.api.services.compute.Compute.RegionInstanceGroups.List listRegionInstanceGroups(com.github.wukong.googlece.models.regionInstanceGroups.ListRequest request) throws Exception {
		return this.regionInstanceGroups().list(request.getProject(),request.getRegion());
	}

	public com.google.api.services.compute.Compute.RegionOperations.Get getRegionOperations(com.github.wukong.googlece.models.regionOperations.GetRequest request) throws Exception {
		return this.regionOperations().get(request.getProject(),request.getRegion(),request.getOperation());
	}

	public com.google.api.services.compute.Compute.RegionOperations.List listRegionOperations(com.github.wukong.googlece.models.regionOperations.ListRequest request) throws Exception {
		return this.regionOperations().list(request.getProject(),request.getRegion());
	}

	public com.google.api.services.compute.Compute.RegionOperations.Delete deleteRegionOperations(com.github.wukong.googlece.models.regionOperations.DeleteRequest request) throws Exception {
		return this.regionOperations().delete(request.getProject(),request.getRegion(),request.getOperation());
	}

	public com.google.api.services.compute.Compute.Regions.Get getRegions(com.github.wukong.googlece.models.regions.GetRequest request) throws Exception {
		return this.regions().get(request.getProject(),request.getRegion());
	}

	public com.google.api.services.compute.Compute.Regions.List listRegions(com.github.wukong.googlece.models.regions.ListRequest request) throws Exception {
		return this.regions().list(request.getProject());
	}

	public com.google.api.services.compute.Compute.Routers.Patch patchRouters(com.github.wukong.googlece.models.routers.PatchRequest request) throws Exception {
		return this.routers().patch(request.getProject(),request.getRegion(),request.getRouter(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Routers.Preview previewRouters(com.github.wukong.googlece.models.routers.PreviewRequest request) throws Exception {
		return this.routers().preview(request.getProject(),request.getRegion(),request.getRouter(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Routers.Get getRouters(com.github.wukong.googlece.models.routers.GetRequest request) throws Exception {
		return this.routers().get(request.getProject(),request.getRegion(),request.getRouter());
	}

	public com.google.api.services.compute.Compute.Routers.Update updateRouters(com.github.wukong.googlece.models.routers.UpdateRequest request) throws Exception {
		return this.routers().update(request.getProject(),request.getRegion(),request.getRouter(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Routers.Insert insertRouters(com.github.wukong.googlece.models.routers.InsertRequest request) throws Exception {
		return this.routers().insert(request.getProject(),request.getRegion(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Routers.AggregatedList aggregatedListRouters(com.github.wukong.googlece.models.routers.AggregatedListRequest request) throws Exception {
		return this.routers().aggregatedList(request.getProject());
	}

	public com.google.api.services.compute.Compute.Routers.GetRouterStatus getRouterStatusRouters(com.github.wukong.googlece.models.routers.GetRouterStatusRequest request) throws Exception {
		return this.routers().getRouterStatus(request.getProject(),request.getRegion(),request.getRouter());
	}

	public com.google.api.services.compute.Compute.Routers.List listRouters(com.github.wukong.googlece.models.routers.ListRequest request) throws Exception {
		return this.routers().list(request.getProject(),request.getRegion());
	}

	public com.google.api.services.compute.Compute.Routers.GetNatMappingInfo getNatMappingInfoRouters(com.github.wukong.googlece.models.routers.GetNatMappingInfoRequest request) throws Exception {
		return this.routers().getNatMappingInfo(request.getProject(),request.getRegion(),request.getRouter());
	}

	public com.google.api.services.compute.Compute.Routers.Delete deleteRouters(com.github.wukong.googlece.models.routers.DeleteRequest request) throws Exception {
		return this.routers().delete(request.getProject(),request.getRegion(),request.getRouter());
	}

	public com.google.api.services.compute.Compute.Routes.Get getRoutes(com.github.wukong.googlece.models.routes.GetRequest request) throws Exception {
		return this.routes().get(request.getProject(),request.getRoute());
	}

	public com.google.api.services.compute.Compute.Routes.Insert insertRoutes(com.github.wukong.googlece.models.routes.InsertRequest request) throws Exception {
		return this.routes().insert(request.getProject(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Routes.List listRoutes(com.github.wukong.googlece.models.routes.ListRequest request) throws Exception {
		return this.routes().list(request.getProject());
	}

	public com.google.api.services.compute.Compute.Routes.Delete deleteRoutes(com.github.wukong.googlece.models.routes.DeleteRequest request) throws Exception {
		return this.routes().delete(request.getProject(),request.getRoute());
	}

	public com.google.api.services.compute.Compute.SecurityPolicies.Patch patchSecurityPolicies(com.github.wukong.googlece.models.securityPolicies.PatchRequest request) throws Exception {
		return this.securityPolicies().patch(request.getProject(),request.getSecurityPolicy(),request.getContent());
	}

	public com.google.api.services.compute.Compute.SecurityPolicies.PatchRule patchRuleSecurityPolicies(com.github.wukong.googlece.models.securityPolicies.PatchRuleRequest request) throws Exception {
		return this.securityPolicies().patchRule(request.getProject(),request.getSecurityPolicy(),request.getContent());
	}

	public com.google.api.services.compute.Compute.SecurityPolicies.AddRule addRuleSecurityPolicies(com.github.wukong.googlece.models.securityPolicies.AddRuleRequest request) throws Exception {
		return this.securityPolicies().addRule(request.getProject(),request.getSecurityPolicy(),request.getContent());
	}

	public com.google.api.services.compute.Compute.SecurityPolicies.GetRule getRuleSecurityPolicies(com.github.wukong.googlece.models.securityPolicies.GetRuleRequest request) throws Exception {
		return this.securityPolicies().getRule(request.getProject(),request.getSecurityPolicy());
	}

	public com.google.api.services.compute.Compute.SecurityPolicies.Get getSecurityPolicies(com.github.wukong.googlece.models.securityPolicies.GetRequest request) throws Exception {
		return this.securityPolicies().get(request.getProject(),request.getSecurityPolicy());
	}

	public com.google.api.services.compute.Compute.SecurityPolicies.Insert insertSecurityPolicies(com.github.wukong.googlece.models.securityPolicies.InsertRequest request) throws Exception {
		return this.securityPolicies().insert(request.getProject(),request.getContent());
	}

	public com.google.api.services.compute.Compute.SecurityPolicies.RemoveRule removeRuleSecurityPolicies(com.github.wukong.googlece.models.securityPolicies.RemoveRuleRequest request) throws Exception {
		return this.securityPolicies().removeRule(request.getProject(),request.getSecurityPolicy());
	}

	public com.google.api.services.compute.Compute.SecurityPolicies.List listSecurityPolicies(com.github.wukong.googlece.models.securityPolicies.ListRequest request) throws Exception {
		return this.securityPolicies().list(request.getProject());
	}

	public com.google.api.services.compute.Compute.SecurityPolicies.Delete deleteSecurityPolicies(com.github.wukong.googlece.models.securityPolicies.DeleteRequest request) throws Exception {
		return this.securityPolicies().delete(request.getProject(),request.getSecurityPolicy());
	}

	public com.google.api.services.compute.Compute.Snapshots.Get getSnapshots(com.github.wukong.googlece.models.snapshots.GetRequest request) throws Exception {
		return this.snapshots().get(request.getProject(),request.getSnapshot());
	}

	public com.google.api.services.compute.Compute.Snapshots.List listSnapshots(com.github.wukong.googlece.models.snapshots.ListRequest request) throws Exception {
		return this.snapshots().list(request.getProject());
	}

	public com.google.api.services.compute.Compute.Snapshots.SetLabels setLabelsSnapshots(com.github.wukong.googlece.models.snapshots.SetLabelsRequest request) throws Exception {
		return this.snapshots().setLabels(request.getProject(),request.getResource(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Snapshots.Delete deleteSnapshots(com.github.wukong.googlece.models.snapshots.DeleteRequest request) throws Exception {
		return this.snapshots().delete(request.getProject(),request.getSnapshot());
	}

	public com.google.api.services.compute.Compute.SslCertificates.Get getSslCertificates(com.github.wukong.googlece.models.sslCertificates.GetRequest request) throws Exception {
		return this.sslCertificates().get(request.getProject(),request.getSslCertificate());
	}

	public com.google.api.services.compute.Compute.SslCertificates.Insert insertSslCertificates(com.github.wukong.googlece.models.sslCertificates.InsertRequest request) throws Exception {
		return this.sslCertificates().insert(request.getProject(),request.getContent());
	}

	public com.google.api.services.compute.Compute.SslCertificates.List listSslCertificates(com.github.wukong.googlece.models.sslCertificates.ListRequest request) throws Exception {
		return this.sslCertificates().list(request.getProject());
	}

	public com.google.api.services.compute.Compute.SslCertificates.Delete deleteSslCertificates(com.github.wukong.googlece.models.sslCertificates.DeleteRequest request) throws Exception {
		return this.sslCertificates().delete(request.getProject(),request.getSslCertificate());
	}

	public com.google.api.services.compute.Compute.SslPolicies.Patch patchSslPolicies(com.github.wukong.googlece.models.sslPolicies.PatchRequest request) throws Exception {
		return this.sslPolicies().patch(request.getProject(),request.getSslPolicy(),request.getContent());
	}

	public com.google.api.services.compute.Compute.SslPolicies.ListAvailableFeatures listAvailableFeaturesSslPolicies(com.github.wukong.googlece.models.sslPolicies.ListAvailableFeaturesRequest request) throws Exception {
		return this.sslPolicies().listAvailableFeatures(request.getProject());
	}

	public com.google.api.services.compute.Compute.SslPolicies.Get getSslPolicies(com.github.wukong.googlece.models.sslPolicies.GetRequest request) throws Exception {
		return this.sslPolicies().get(request.getProject(),request.getSslPolicy());
	}

	public com.google.api.services.compute.Compute.SslPolicies.Insert insertSslPolicies(com.github.wukong.googlece.models.sslPolicies.InsertRequest request) throws Exception {
		return this.sslPolicies().insert(request.getProject(),request.getContent());
	}

	public com.google.api.services.compute.Compute.SslPolicies.List listSslPolicies(com.github.wukong.googlece.models.sslPolicies.ListRequest request) throws Exception {
		return this.sslPolicies().list(request.getProject());
	}

	public com.google.api.services.compute.Compute.SslPolicies.Delete deleteSslPolicies(com.github.wukong.googlece.models.sslPolicies.DeleteRequest request) throws Exception {
		return this.sslPolicies().delete(request.getProject(),request.getSslPolicy());
	}

	public com.google.api.services.compute.Compute.Subnetworks.Patch patchSubnetworks(com.github.wukong.googlece.models.subnetworks.PatchRequest request) throws Exception {
		return this.subnetworks().patch(request.getProject(),request.getRegion(),request.getSubnetwork(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Subnetworks.ListUsable listUsableSubnetworks(com.github.wukong.googlece.models.subnetworks.ListUsableRequest request) throws Exception {
		return this.subnetworks().listUsable(request.getProject());
	}

	public com.google.api.services.compute.Compute.Subnetworks.SetPrivateIpGoogleAccess setPrivateIpGoogleAccessSubnetworks(com.github.wukong.googlece.models.subnetworks.SetPrivateIpGoogleAccessRequest request) throws Exception {
		return this.subnetworks().setPrivateIpGoogleAccess(request.getProject(),request.getRegion(),request.getSubnetwork(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Subnetworks.Get getSubnetworks(com.github.wukong.googlece.models.subnetworks.GetRequest request) throws Exception {
		return this.subnetworks().get(request.getProject(),request.getRegion(),request.getSubnetwork());
	}

	public com.google.api.services.compute.Compute.Subnetworks.Insert insertSubnetworks(com.github.wukong.googlece.models.subnetworks.InsertRequest request) throws Exception {
		return this.subnetworks().insert(request.getProject(),request.getRegion(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Subnetworks.AggregatedList aggregatedListSubnetworks(com.github.wukong.googlece.models.subnetworks.AggregatedListRequest request) throws Exception {
		return this.subnetworks().aggregatedList(request.getProject());
	}

	public com.google.api.services.compute.Compute.Subnetworks.ExpandIpCidrRange expandIpCidrRangeSubnetworks(com.github.wukong.googlece.models.subnetworks.ExpandIpCidrRangeRequest request) throws Exception {
		return this.subnetworks().expandIpCidrRange(request.getProject(),request.getRegion(),request.getSubnetwork(),request.getContent());
	}

	public com.google.api.services.compute.Compute.Subnetworks.List listSubnetworks(com.github.wukong.googlece.models.subnetworks.ListRequest request) throws Exception {
		return this.subnetworks().list(request.getProject(),request.getRegion());
	}

	public com.google.api.services.compute.Compute.Subnetworks.Delete deleteSubnetworks(com.github.wukong.googlece.models.subnetworks.DeleteRequest request) throws Exception {
		return this.subnetworks().delete(request.getProject(),request.getRegion(),request.getSubnetwork());
	}

	public com.google.api.services.compute.Compute.TargetHttpProxies.SetUrlMap setUrlMapTargetHttpProxies(com.github.wukong.googlece.models.targetHttpProxies.SetUrlMapRequest request) throws Exception {
		return this.targetHttpProxies().setUrlMap(request.getProject(),request.getTargetHttpProxy(),request.getContent());
	}

	public com.google.api.services.compute.Compute.TargetHttpProxies.Get getTargetHttpProxies(com.github.wukong.googlece.models.targetHttpProxies.GetRequest request) throws Exception {
		return this.targetHttpProxies().get(request.getProject(),request.getTargetHttpProxy());
	}

	public com.google.api.services.compute.Compute.TargetHttpProxies.Insert insertTargetHttpProxies(com.github.wukong.googlece.models.targetHttpProxies.InsertRequest request) throws Exception {
		return this.targetHttpProxies().insert(request.getProject(),request.getContent());
	}

	public com.google.api.services.compute.Compute.TargetHttpProxies.List listTargetHttpProxies(com.github.wukong.googlece.models.targetHttpProxies.ListRequest request) throws Exception {
		return this.targetHttpProxies().list(request.getProject());
	}

	public com.google.api.services.compute.Compute.TargetHttpProxies.Delete deleteTargetHttpProxies(com.github.wukong.googlece.models.targetHttpProxies.DeleteRequest request) throws Exception {
		return this.targetHttpProxies().delete(request.getProject(),request.getTargetHttpProxy());
	}

	public com.google.api.services.compute.Compute.TargetHttpsProxies.SetUrlMap setUrlMapTargetHttpsProxies(com.github.wukong.googlece.models.targetHttpsProxies.SetUrlMapRequest request) throws Exception {
		return this.targetHttpsProxies().setUrlMap(request.getProject(),request.getTargetHttpsProxy(),request.getContent());
	}

	public com.google.api.services.compute.Compute.TargetHttpsProxies.SetSslCertificates setSslCertificatesTargetHttpsProxies(com.github.wukong.googlece.models.targetHttpsProxies.SetSslCertificatesRequest request) throws Exception {
		return this.targetHttpsProxies().setSslCertificates(request.getProject(),request.getTargetHttpsProxy(),request.getContent());
	}

	public com.google.api.services.compute.Compute.TargetHttpsProxies.SetSslPolicy setSslPolicyTargetHttpsProxies(com.github.wukong.googlece.models.targetHttpsProxies.SetSslPolicyRequest request) throws Exception {
		return this.targetHttpsProxies().setSslPolicy(request.getProject(),request.getTargetHttpsProxy(),request.getContent());
	}

	public com.google.api.services.compute.Compute.TargetHttpsProxies.Get getTargetHttpsProxies(com.github.wukong.googlece.models.targetHttpsProxies.GetRequest request) throws Exception {
		return this.targetHttpsProxies().get(request.getProject(),request.getTargetHttpsProxy());
	}

	public com.google.api.services.compute.Compute.TargetHttpsProxies.Insert insertTargetHttpsProxies(com.github.wukong.googlece.models.targetHttpsProxies.InsertRequest request) throws Exception {
		return this.targetHttpsProxies().insert(request.getProject(),request.getContent());
	}

	public com.google.api.services.compute.Compute.TargetHttpsProxies.List listTargetHttpsProxies(com.github.wukong.googlece.models.targetHttpsProxies.ListRequest request) throws Exception {
		return this.targetHttpsProxies().list(request.getProject());
	}

	public com.google.api.services.compute.Compute.TargetHttpsProxies.Delete deleteTargetHttpsProxies(com.github.wukong.googlece.models.targetHttpsProxies.DeleteRequest request) throws Exception {
		return this.targetHttpsProxies().delete(request.getProject(),request.getTargetHttpsProxy());
	}

	public com.google.api.services.compute.Compute.TargetHttpsProxies.SetQuicOverride setQuicOverrideTargetHttpsProxies(com.github.wukong.googlece.models.targetHttpsProxies.SetQuicOverrideRequest request) throws Exception {
		return this.targetHttpsProxies().setQuicOverride(request.getProject(),request.getTargetHttpsProxy(),request.getContent());
	}

	public com.google.api.services.compute.Compute.TargetInstances.Get getTargetInstances(com.github.wukong.googlece.models.targetInstances.GetRequest request) throws Exception {
		return this.targetInstances().get(request.getProject(),request.getZone(),request.getTargetInstance());
	}

	public com.google.api.services.compute.Compute.TargetInstances.Insert insertTargetInstances(com.github.wukong.googlece.models.targetInstances.InsertRequest request) throws Exception {
		return this.targetInstances().insert(request.getProject(),request.getZone(),request.getContent());
	}

	public com.google.api.services.compute.Compute.TargetInstances.AggregatedList aggregatedListTargetInstances(com.github.wukong.googlece.models.targetInstances.AggregatedListRequest request) throws Exception {
		return this.targetInstances().aggregatedList(request.getProject());
	}

	public com.google.api.services.compute.Compute.TargetInstances.List listTargetInstances(com.github.wukong.googlece.models.targetInstances.ListRequest request) throws Exception {
		return this.targetInstances().list(request.getProject(),request.getZone());
	}

	public com.google.api.services.compute.Compute.TargetInstances.Delete deleteTargetInstances(com.github.wukong.googlece.models.targetInstances.DeleteRequest request) throws Exception {
		return this.targetInstances().delete(request.getProject(),request.getZone(),request.getTargetInstance());
	}

	public com.google.api.services.compute.Compute.TargetPools.RemoveHealthCheck removeHealthCheckTargetPools(com.github.wukong.googlece.models.targetPools.RemoveHealthCheckRequest request) throws Exception {
		return this.targetPools().removeHealthCheck(request.getProject(),request.getRegion(),request.getTargetPool(),request.getContent());
	}

	public com.google.api.services.compute.Compute.TargetPools.AddInstance addInstanceTargetPools(com.github.wukong.googlece.models.targetPools.AddInstanceRequest request) throws Exception {
		return this.targetPools().addInstance(request.getProject(),request.getRegion(),request.getTargetPool(),request.getContent());
	}

	public com.google.api.services.compute.Compute.TargetPools.RemoveInstance removeInstanceTargetPools(com.github.wukong.googlece.models.targetPools.RemoveInstanceRequest request) throws Exception {
		return this.targetPools().removeInstance(request.getProject(),request.getRegion(),request.getTargetPool(),request.getContent());
	}

	public com.google.api.services.compute.Compute.TargetPools.Get getTargetPools(com.github.wukong.googlece.models.targetPools.GetRequest request) throws Exception {
		return this.targetPools().get(request.getProject(),request.getRegion(),request.getTargetPool());
	}

	public com.google.api.services.compute.Compute.TargetPools.SetBackup setBackupTargetPools(com.github.wukong.googlece.models.targetPools.SetBackupRequest request) throws Exception {
		return this.targetPools().setBackup(request.getProject(),request.getRegion(),request.getTargetPool(),request.getContent());
	}

	public com.google.api.services.compute.Compute.TargetPools.Insert insertTargetPools(com.github.wukong.googlece.models.targetPools.InsertRequest request) throws Exception {
		return this.targetPools().insert(request.getProject(),request.getRegion(),request.getContent());
	}

	public com.google.api.services.compute.Compute.TargetPools.AddHealthCheck addHealthCheckTargetPools(com.github.wukong.googlece.models.targetPools.AddHealthCheckRequest request) throws Exception {
		return this.targetPools().addHealthCheck(request.getProject(),request.getRegion(),request.getTargetPool(),request.getContent());
	}

	public com.google.api.services.compute.Compute.TargetPools.AggregatedList aggregatedListTargetPools(com.github.wukong.googlece.models.targetPools.AggregatedListRequest request) throws Exception {
		return this.targetPools().aggregatedList(request.getProject());
	}

	public com.google.api.services.compute.Compute.TargetPools.List listTargetPools(com.github.wukong.googlece.models.targetPools.ListRequest request) throws Exception {
		return this.targetPools().list(request.getProject(),request.getRegion());
	}

	public com.google.api.services.compute.Compute.TargetPools.Delete deleteTargetPools(com.github.wukong.googlece.models.targetPools.DeleteRequest request) throws Exception {
		return this.targetPools().delete(request.getProject(),request.getRegion(),request.getTargetPool());
	}

	public com.google.api.services.compute.Compute.TargetPools.GetHealth getHealthTargetPools(com.github.wukong.googlece.models.targetPools.GetHealthRequest request) throws Exception {
		return this.targetPools().getHealth(request.getProject(),request.getRegion(),request.getTargetPool(),request.getContent());
	}

	public com.google.api.services.compute.Compute.TargetSslProxies.SetSslCertificates setSslCertificatesTargetSslProxies(com.github.wukong.googlece.models.targetSslProxies.SetSslCertificatesRequest request) throws Exception {
		return this.targetSslProxies().setSslCertificates(request.getProject(),request.getTargetSslProxy(),request.getContent());
	}

	public com.google.api.services.compute.Compute.TargetSslProxies.SetBackendService setBackendServiceTargetSslProxies(com.github.wukong.googlece.models.targetSslProxies.SetBackendServiceRequest request) throws Exception {
		return this.targetSslProxies().setBackendService(request.getProject(),request.getTargetSslProxy(),request.getContent());
	}

	public com.google.api.services.compute.Compute.TargetSslProxies.SetSslPolicy setSslPolicyTargetSslProxies(com.github.wukong.googlece.models.targetSslProxies.SetSslPolicyRequest request) throws Exception {
		return this.targetSslProxies().setSslPolicy(request.getProject(),request.getTargetSslProxy(),request.getContent());
	}

	public com.google.api.services.compute.Compute.TargetSslProxies.Get getTargetSslProxies(com.github.wukong.googlece.models.targetSslProxies.GetRequest request) throws Exception {
		return this.targetSslProxies().get(request.getProject(),request.getTargetSslProxy());
	}

	public com.google.api.services.compute.Compute.TargetSslProxies.Insert insertTargetSslProxies(com.github.wukong.googlece.models.targetSslProxies.InsertRequest request) throws Exception {
		return this.targetSslProxies().insert(request.getProject(),request.getContent());
	}

	public com.google.api.services.compute.Compute.TargetSslProxies.SetProxyHeader setProxyHeaderTargetSslProxies(com.github.wukong.googlece.models.targetSslProxies.SetProxyHeaderRequest request) throws Exception {
		return this.targetSslProxies().setProxyHeader(request.getProject(),request.getTargetSslProxy(),request.getContent());
	}

	public com.google.api.services.compute.Compute.TargetSslProxies.List listTargetSslProxies(com.github.wukong.googlece.models.targetSslProxies.ListRequest request) throws Exception {
		return this.targetSslProxies().list(request.getProject());
	}

	public com.google.api.services.compute.Compute.TargetSslProxies.Delete deleteTargetSslProxies(com.github.wukong.googlece.models.targetSslProxies.DeleteRequest request) throws Exception {
		return this.targetSslProxies().delete(request.getProject(),request.getTargetSslProxy());
	}

	public com.google.api.services.compute.Compute.TargetTcpProxies.SetBackendService setBackendServiceTargetTcpProxies(com.github.wukong.googlece.models.targetTcpProxies.SetBackendServiceRequest request) throws Exception {
		return this.targetTcpProxies().setBackendService(request.getProject(),request.getTargetTcpProxy(),request.getContent());
	}

	public com.google.api.services.compute.Compute.TargetTcpProxies.Get getTargetTcpProxies(com.github.wukong.googlece.models.targetTcpProxies.GetRequest request) throws Exception {
		return this.targetTcpProxies().get(request.getProject(),request.getTargetTcpProxy());
	}

	public com.google.api.services.compute.Compute.TargetTcpProxies.Insert insertTargetTcpProxies(com.github.wukong.googlece.models.targetTcpProxies.InsertRequest request) throws Exception {
		return this.targetTcpProxies().insert(request.getProject(),request.getContent());
	}

	public com.google.api.services.compute.Compute.TargetTcpProxies.SetProxyHeader setProxyHeaderTargetTcpProxies(com.github.wukong.googlece.models.targetTcpProxies.SetProxyHeaderRequest request) throws Exception {
		return this.targetTcpProxies().setProxyHeader(request.getProject(),request.getTargetTcpProxy(),request.getContent());
	}

	public com.google.api.services.compute.Compute.TargetTcpProxies.List listTargetTcpProxies(com.github.wukong.googlece.models.targetTcpProxies.ListRequest request) throws Exception {
		return this.targetTcpProxies().list(request.getProject());
	}

	public com.google.api.services.compute.Compute.TargetTcpProxies.Delete deleteTargetTcpProxies(com.github.wukong.googlece.models.targetTcpProxies.DeleteRequest request) throws Exception {
		return this.targetTcpProxies().delete(request.getProject(),request.getTargetTcpProxy());
	}

	public com.google.api.services.compute.Compute.TargetVpnGateways.Get getTargetVpnGateways(com.github.wukong.googlece.models.targetVpnGateways.GetRequest request) throws Exception {
		return this.targetVpnGateways().get(request.getProject(),request.getRegion(),request.getTargetVpnGateway());
	}

	public com.google.api.services.compute.Compute.TargetVpnGateways.Insert insertTargetVpnGateways(com.github.wukong.googlece.models.targetVpnGateways.InsertRequest request) throws Exception {
		return this.targetVpnGateways().insert(request.getProject(),request.getRegion(),request.getContent());
	}

	public com.google.api.services.compute.Compute.TargetVpnGateways.AggregatedList aggregatedListTargetVpnGateways(com.github.wukong.googlece.models.targetVpnGateways.AggregatedListRequest request) throws Exception {
		return this.targetVpnGateways().aggregatedList(request.getProject());
	}

	public com.google.api.services.compute.Compute.TargetVpnGateways.List listTargetVpnGateways(com.github.wukong.googlece.models.targetVpnGateways.ListRequest request) throws Exception {
		return this.targetVpnGateways().list(request.getProject(),request.getRegion());
	}

	public com.google.api.services.compute.Compute.TargetVpnGateways.Delete deleteTargetVpnGateways(com.github.wukong.googlece.models.targetVpnGateways.DeleteRequest request) throws Exception {
		return this.targetVpnGateways().delete(request.getProject(),request.getRegion(),request.getTargetVpnGateway());
	}

	public com.google.api.services.compute.Compute.UrlMaps.Patch patchUrlMaps(com.github.wukong.googlece.models.urlMaps.PatchRequest request) throws Exception {
		return this.urlMaps().patch(request.getProject(),request.getUrlMap(),request.getContent());
	}

	public com.google.api.services.compute.Compute.UrlMaps.InvalidateCache invalidateCacheUrlMaps(com.github.wukong.googlece.models.urlMaps.InvalidateCacheRequest request) throws Exception {
		return this.urlMaps().invalidateCache(request.getProject(),request.getUrlMap(),request.getContent());
	}

	public com.google.api.services.compute.Compute.UrlMaps.Get getUrlMaps(com.github.wukong.googlece.models.urlMaps.GetRequest request) throws Exception {
		return this.urlMaps().get(request.getProject(),request.getUrlMap());
	}

	public com.google.api.services.compute.Compute.UrlMaps.Update updateUrlMaps(com.github.wukong.googlece.models.urlMaps.UpdateRequest request) throws Exception {
		return this.urlMaps().update(request.getProject(),request.getUrlMap(),request.getContent());
	}

	public com.google.api.services.compute.Compute.UrlMaps.Insert insertUrlMaps(com.github.wukong.googlece.models.urlMaps.InsertRequest request) throws Exception {
		return this.urlMaps().insert(request.getProject(),request.getContent());
	}

	public com.google.api.services.compute.Compute.UrlMaps.List listUrlMaps(com.github.wukong.googlece.models.urlMaps.ListRequest request) throws Exception {
		return this.urlMaps().list(request.getProject());
	}

	public com.google.api.services.compute.Compute.UrlMaps.Delete deleteUrlMaps(com.github.wukong.googlece.models.urlMaps.DeleteRequest request) throws Exception {
		return this.urlMaps().delete(request.getProject(),request.getUrlMap());
	}

	public com.google.api.services.compute.Compute.UrlMaps.Validate validateUrlMaps(com.github.wukong.googlece.models.urlMaps.ValidateRequest request) throws Exception {
		return this.urlMaps().validate(request.getProject(),request.getUrlMap(),request.getContent());
	}

	public com.google.api.services.compute.Compute.VpnTunnels.Get getVpnTunnels(com.github.wukong.googlece.models.vpnTunnels.GetRequest request) throws Exception {
		return this.vpnTunnels().get(request.getProject(),request.getRegion(),request.getVpnTunnel());
	}

	public com.google.api.services.compute.Compute.VpnTunnels.Insert insertVpnTunnels(com.github.wukong.googlece.models.vpnTunnels.InsertRequest request) throws Exception {
		return this.vpnTunnels().insert(request.getProject(),request.getRegion(),request.getContent());
	}

	public com.google.api.services.compute.Compute.VpnTunnels.AggregatedList aggregatedListVpnTunnels(com.github.wukong.googlece.models.vpnTunnels.AggregatedListRequest request) throws Exception {
		return this.vpnTunnels().aggregatedList(request.getProject());
	}

	public com.google.api.services.compute.Compute.VpnTunnels.List listVpnTunnels(com.github.wukong.googlece.models.vpnTunnels.ListRequest request) throws Exception {
		return this.vpnTunnels().list(request.getProject(),request.getRegion());
	}

	public com.google.api.services.compute.Compute.VpnTunnels.Delete deleteVpnTunnels(com.github.wukong.googlece.models.vpnTunnels.DeleteRequest request) throws Exception {
		return this.vpnTunnels().delete(request.getProject(),request.getRegion(),request.getVpnTunnel());
	}

	public com.google.api.services.compute.Compute.ZoneOperations.Get getZoneOperations(com.github.wukong.googlece.models.zoneOperations.GetRequest request) throws Exception {
		return this.zoneOperations().get(request.getProject(),request.getZone(),request.getOperation());
	}

	public com.google.api.services.compute.Compute.ZoneOperations.List listZoneOperations(com.github.wukong.googlece.models.zoneOperations.ListRequest request) throws Exception {
		return this.zoneOperations().list(request.getProject(),request.getZone());
	}

	public com.google.api.services.compute.Compute.ZoneOperations.Delete deleteZoneOperations(com.github.wukong.googlece.models.zoneOperations.DeleteRequest request) throws Exception {
		return this.zoneOperations().delete(request.getProject(),request.getZone(),request.getOperation());
	}

	public com.google.api.services.compute.Compute.Zones.Get getZones(com.github.wukong.googlece.models.zones.GetRequest request) throws Exception {
		return this.zones().get(request.getProject(),request.getZone());
	}

	public com.google.api.services.compute.Compute.Zones.List listZones(com.github.wukong.googlece.models.zones.ListRequest request) throws Exception {
		return this.zones().list(request.getProject());
	}

	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName(WukongGoogleGCEClient.class.getName());
		for (Method method : clazz.getMethods()) {
				String targetPkg = method.getReturnType().getName();
				String pkgName = Compute.class.getPackage().getName();
				if (targetPkg.startsWith(pkgName)
						&& (method.getParameterCount() == 0)) {
					Class<?> objcls = method.getReturnType();
					Map<String, Method> map = new HashMap<String, Method>();
					for (Method om : objcls.getMethods()) {
						if (om.getReturnType().getSuperclass() != null 
								&& om.getReturnType().getSuperclass().getName()
								.startsWith(ComputeRequest.class.getName())
								|| om.getReturnType().getSimpleName().startsWith("List")) {
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
						File file = new File(CodesTool.getBase(AbstractGoogleRequest.class), method.getName());
						if (!file.exists()) {
							file.mkdirs();
						}
						CodesTool.generateRequest(file, AbstractGoogleRequest.class, method, thisMethod, true, 2);
					}
				}
				
		}
	}

}
