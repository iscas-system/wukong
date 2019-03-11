## CreateOrUpdateAvailabilitySets parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setAvailabilitySetName":"java.lang.String",
		"setParameters-withPlatformFaultDomainCount":"java.lang.Integer",
		"setParameters-withVirtualMachines":[
			"ref1-com.microsoft.azure.SubResource"
		],
		"setParameters-withSku-withName":"java.lang.String",
		"setParameters-withSku-withCapacity":"java.lang.Long",
		"setParameters-withSku-withTier":"java.lang.String",
		"setParameters-withPlatformUpdateDomainCount":"java.lang.Integer",
		"setParameters-withLocation":"java.lang.String",
		"setParameters-withTags":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		}
	},
	"ref1-com.microsoft.azure.SubResource":{
		"withId":"java.lang.String"
	}
}
```
## ListAsyncResourceSkus parameterss:

```
{}
```
## ListPublishersAsyncVirtualMachineImages parameterss:

```
{
	"main":{
		"setLocation":"java.lang.String"
	}
}
```
## BeginUpdateVirtualMachineScaleSets parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setParameters-withPlan-withPublisher":"java.lang.String",
		"setParameters-withPlan-withName":"java.lang.String",
		"setParameters-withPlan-withProduct":"java.lang.String",
		"setParameters-withPlan-withPromotionCode":"java.lang.String",
		"setParameters-withSku-withName":"java.lang.String",
		"setParameters-withSku-withCapacity":"java.lang.Long",
		"setParameters-withSku-withTier":"java.lang.String",
		"setParameters-withIdentity-withUserAssignedIdentities":{
			"java.lang.String0":"ref1-com.microsoft.azure.management.compute.VirtualMachineScaleSetIdentityUserAssignedIdentitiesValue"
		},
		"setParameters-withUpgradePolicy-withRollingUpgradePolicy-withMaxBatchInstancePercent":"java.lang.Integer",
		"setParameters-withUpgradePolicy-withRollingUpgradePolicy-withMaxUnhealthyInstancePercent":"java.lang.Integer",
		"setParameters-withUpgradePolicy-withRollingUpgradePolicy-withMaxUnhealthyUpgradedInstancePercent":"java.lang.Integer",
		"setParameters-withUpgradePolicy-withRollingUpgradePolicy-withPauseTimeBetweenBatches":"java.lang.String",
		"setParameters-withUpgradePolicy-withAutomaticOSUpgrade":"java.lang.Boolean",
		"setParameters-withUpgradePolicy-withAutoOSUpgradePolicy-withDisableAutoRollback":"java.lang.Boolean",
		"setParameters-withVirtualMachineProfile-withStorageProfile-withImageReference-withPublisher":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withStorageProfile-withImageReference-withSku":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withStorageProfile-withImageReference-withOffer":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withStorageProfile-withImageReference-withVersion":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withStorageProfile-withImageReference-withId":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withStorageProfile-withOsDisk-withWriteAcceleratorEnabled":"java.lang.Boolean",
		"setParameters-withVirtualMachineProfile-withStorageProfile-withOsDisk-withImage-withUri":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withStorageProfile-withOsDisk-withVhdContainers":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setParameters-withVirtualMachineProfile-withStorageProfile-withDataDisks":[
			"ref2-com.microsoft.azure.management.compute.VirtualMachineScaleSetDataDisk"
		],
		"setParameters-withVirtualMachineProfile-withOsProfile-withCustomData":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withOsProfile-withWindowsConfiguration-withProvisionVMAgent":"java.lang.Boolean",
		"setParameters-withVirtualMachineProfile-withOsProfile-withWindowsConfiguration-withEnableAutomaticUpdates":"java.lang.Boolean",
		"setParameters-withVirtualMachineProfile-withOsProfile-withWindowsConfiguration-withTimeZone":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withOsProfile-withWindowsConfiguration-withAdditionalUnattendContent":[
			"ref3-com.microsoft.azure.management.compute.AdditionalUnattendContent"
		],
		"setParameters-withVirtualMachineProfile-withOsProfile-withWindowsConfiguration-withWinRM-withListeners":[
			"ref4-com.microsoft.azure.management.compute.WinRMListener"
		],
		"setParameters-withVirtualMachineProfile-withOsProfile-withLinuxConfiguration-withSsh-withPublicKeys":[
			"ref5-com.microsoft.azure.management.compute.SshPublicKey"
		],
		"setParameters-withVirtualMachineProfile-withOsProfile-withLinuxConfiguration-withProvisionVMAgent":"java.lang.Boolean",
		"setParameters-withVirtualMachineProfile-withOsProfile-withLinuxConfiguration-withDisablePasswordAuthentication":"java.lang.Boolean",
		"setParameters-withVirtualMachineProfile-withOsProfile-withSecrets":[
			"ref6-com.microsoft.azure.management.compute.VaultSecretGroup"
		],
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withNetworkInterfaceConfigurations":[
			"ref8-com.microsoft.azure.management.compute.VirtualMachineScaleSetUpdateNetworkConfiguration"
		],
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withNetworkInterfaceConfigurations-withIpConfigurations-withLoadBalancerBackendAddressPools":[
			"ref11-com.microsoft.azure.SubResource"
		],
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withNetworkInterfaceConfigurations-withIpConfigurations-withLoadBalancerInboundNatPools":[
			"ref12-com.microsoft.azure.SubResource"
		],
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withNetworkInterfaceConfigurations-withIpConfigurations-withApplicationSecurityGroups":[
			"ref13-com.microsoft.azure.SubResource"
		],
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withNetworkInterfaceConfigurations-withIpConfigurations-withId":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withNetworkInterfaceConfigurations-withEnableIPForwarding":"java.lang.Boolean",
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withNetworkInterfaceConfigurations-withId":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withDiagnosticsProfile-withBootDiagnostics-withEnabled":"java.lang.Boolean",
		"setParameters-withVirtualMachineProfile-withDiagnosticsProfile-withBootDiagnostics-withStorageUri":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withLicenseType":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withExtensionProfile-withExtensions":[
			"ref14-com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner"
		],
		"setParameters-withOverprovision":"java.lang.Boolean",
		"setParameters-withSinglePlacementGroup":"java.lang.Boolean",
		"setParameters-withTags":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"setVmScaleSetName":"java.lang.String"
	},
	"ref2-com.microsoft.azure.management.compute.VirtualMachineScaleSetDataDisk":{
		"withName":"java.lang.String",
		"withDiskSizeGB":"java.lang.Integer",
		"withWriteAcceleratorEnabled":"java.lang.Boolean",
		"withLun":"int"
	},
	"ref3-com.microsoft.azure.management.compute.AdditionalUnattendContent":{
		"withContent":"java.lang.String"
	},
	"ref4-com.microsoft.azure.management.compute.WinRMListener":{
		"withCertificateUrl":"java.lang.String"
	},
	"ref5-com.microsoft.azure.management.compute.SshPublicKey":{
		"withPath":"java.lang.String",
		"withKeyData":"java.lang.String"
	},
	"ref6-com.microsoft.azure.management.compute.VaultSecretGroup":{
		"withSourceVault-withId":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withOsProfile-withSecrets-withVaultCertificates":[
			"ref7-com.microsoft.azure.management.compute.VaultCertificate"
		]
	},
	"ref7-com.microsoft.azure.management.compute.VaultCertificate":{
		"withCertificateUrl":"java.lang.String",
		"withCertificateStore":"java.lang.String"
	},
	"ref8-com.microsoft.azure.management.compute.VirtualMachineScaleSetUpdateNetworkConfiguration":{
		"withName":"java.lang.String",
		"withPrimary":"java.lang.Boolean",
		"withEnableAcceleratedNetworking":"java.lang.Boolean",
		"withNetworkSecurityGroup-withId":"java.lang.String",
		"withDnsSettings-withDnsServers":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withNetworkInterfaceConfigurations-withIpConfigurations":[
			"ref9-com.microsoft.azure.management.compute.VirtualMachineScaleSetUpdateIPConfiguration"
		]
	},
	"ref9-com.microsoft.azure.management.compute.VirtualMachineScaleSetUpdateIPConfiguration":{
		"withName":"java.lang.String",
		"withPrimary":"java.lang.Boolean",
		"withSubnet-withId":"java.lang.String",
		"withPublicIPAddressConfiguration-withName":"java.lang.String",
		"withPublicIPAddressConfiguration-withDnsSettings-withDomainNameLabel":"java.lang.String",
		"withPublicIPAddressConfiguration-withIdleTimeoutInMinutes":"java.lang.Integer",
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withNetworkInterfaceConfigurations-withIpConfigurations-withApplicationGatewayBackendAddressPools":[
			"ref10-com.microsoft.azure.SubResource"
		]
	},
	"ref10-com.microsoft.azure.SubResource":{
		"withId":"java.lang.String"
	},
	"ref11-com.microsoft.azure.SubResource":{
		"withId":"java.lang.String"
	},
	"ref12-com.microsoft.azure.SubResource":{
		"withId":"java.lang.String"
	},
	"ref13-com.microsoft.azure.SubResource":{
		"withId":"java.lang.String"
	},
	"ref14-com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner":{
		"withForceUpdateTag":"java.lang.String",
		"withPublisher":"java.lang.String",
		"withTypeHandlerVersion":"java.lang.String",
		"withAutoUpgradeMinorVersion":"java.lang.Boolean",
		"withName":"java.lang.String",
		"withType":"java.lang.String"
	}
}
```
## DeleteWithServiceResponseAsyncSnapshots parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setSnapshotName":"java.lang.String"
	}
}
```
## DeleteWithServiceResponseAsyncImages parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setImageName":"java.lang.String"
	}
}
```
## ListAsyncImages parameterss:

```
{}
```
## ListByResourceGroupSinglePageAsyncVirtualMachineScaleSets parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String"
	}
}
```
## ListByResourceGroupWithServiceResponseAsyncAvailabilitySets parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String"
	}
}
```
## ListAsyncDisks parameterss:

```
{}
```
## ListByGalleryNextSinglePageAsyncGalleryImages parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListByResourceGroupAsyncVirtualMachines parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String"
	}
}
```
## BeginCreateOrUpdateImages parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setParameters-withSourceVirtualMachine-withId":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withDiskSizeGB":"java.lang.Integer",
		"setParameters-withStorageProfile-withOsDisk-withManagedDisk-withId":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withSnapshot-withId":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withBlobUri":"java.lang.String",
		"setParameters-withStorageProfile-withDataDisks":[
			"ref1-com.microsoft.azure.management.compute.ImageDataDisk"
		],
		"setParameters-withStorageProfile-withZoneResilient":"java.lang.Boolean",
		"setParameters-withLocation":"java.lang.String",
		"setParameters-withTags":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"setImageName":"java.lang.String"
	},
	"ref1-com.microsoft.azure.management.compute.ImageDataDisk":{
		"withDiskSizeGB":"java.lang.Integer",
		"withManagedDisk-withId":"java.lang.String",
		"withLun":"int",
		"withSnapshot-withId":"java.lang.String",
		"withBlobUri":"java.lang.String"
	}
}
```
## ListNextSinglePageAsyncVirtualMachines parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ExportThrottledRequestsLogAnalytics parameterss:

```
{
	"main":{
		"setLocation":"java.lang.String",
		"setParameters-withBlobContainerSasUri":"java.lang.String",
		"setParameters-withFromTime-withMillis":"long",
		"setParameters-withFromTime-withEra":"int",
		"setParameters-withFromTime-withCenturyOfEra":"int",
		"setParameters-withFromTime-withYearOfEra":"int",
		"setParameters-withFromTime-withYearOfCentury":"int",
		"setParameters-withFromTime-withYear":"int",
		"setParameters-withFromTime-withWeekyear":"int",
		"setParameters-withFromTime-withMonthOfYear":"int",
		"setParameters-withFromTime-withWeekOfWeekyear":"int",
		"setParameters-withFromTime-withDayOfYear":"int",
		"setParameters-withFromTime-withDayOfMonth":"int",
		"setParameters-withFromTime-withDayOfWeek":"int",
		"setParameters-withFromTime-withHourOfDay":"int",
		"setParameters-withFromTime-withMinuteOfHour":"int",
		"setParameters-withFromTime-withSecondOfMinute":"int",
		"setParameters-withFromTime-withMillisOfSecond":"int",
		"setParameters-withFromTime-withMillisOfDay":"int",
		"setParameters-withToTime-withMillis":"long",
		"setParameters-withToTime-withEra":"int",
		"setParameters-withToTime-withCenturyOfEra":"int",
		"setParameters-withToTime-withYearOfEra":"int",
		"setParameters-withToTime-withYearOfCentury":"int",
		"setParameters-withToTime-withYear":"int",
		"setParameters-withToTime-withWeekyear":"int",
		"setParameters-withToTime-withMonthOfYear":"int",
		"setParameters-withToTime-withWeekOfWeekyear":"int",
		"setParameters-withToTime-withDayOfYear":"int",
		"setParameters-withToTime-withDayOfMonth":"int",
		"setParameters-withToTime-withDayOfWeek":"int",
		"setParameters-withToTime-withHourOfDay":"int",
		"setParameters-withToTime-withMinuteOfHour":"int",
		"setParameters-withToTime-withSecondOfMinute":"int",
		"setParameters-withToTime-withMillisOfSecond":"int",
		"setParameters-withToTime-withMillisOfDay":"int",
		"setParameters-withGroupByThrottlePolicy":"java.lang.Boolean",
		"setParameters-withGroupByOperationName":"java.lang.Boolean",
		"setParameters-withGroupByResourceName":"java.lang.Boolean"
	}
}
```
## ListByResourceGroupSnapshots parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String"
	}
}
```
## DeleteGalleryImageVersions parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setGalleryName":"java.lang.String",
		"setGalleryImageVersionName":"java.lang.String",
		"setGalleryImageName":"java.lang.String"
	}
}
```
## GetVirtualMachineRunCommands parameterss:

```
{
	"main":{
		"setLocation":"java.lang.String",
		"setCommandId":"java.lang.String"
	}
}
```
## ListAvailableSizesAsyncVirtualMachines parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmName":"java.lang.String"
	}
}
```
## ListNextAsyncUsages parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListByResourceGroupNextAsyncSnapshots parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListByGalleryImageNextGalleryImageVersions parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListSinglePageAsyncImages parameterss:

```
{}
```
## DeleteSnapshots parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setSnapshotName":"java.lang.String"
	}
}
```
## ListByResourceGroupAsyncImages parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String"
	}
}
```
## ListSkusVirtualMachineScaleSets parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmScaleSetName":"java.lang.String"
	}
}
```
## ListNextWithServiceResponseAsyncVirtualMachines parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## BeginCreateOrUpdateGalleryImages parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setGalleryName":"java.lang.String",
		"setGalleryImage-withDescription":"java.lang.String",
		"setGalleryImage-withIdentifier-withPublisher":"java.lang.String",
		"setGalleryImage-withIdentifier-withSku":"java.lang.String",
		"setGalleryImage-withIdentifier-withOffer":"java.lang.String",
		"setGalleryImage-withEula":"java.lang.String",
		"setGalleryImage-withPrivacyStatementUri":"java.lang.String",
		"setGalleryImage-withReleaseNoteUri":"java.lang.String",
		"setGalleryImage-withEndOfLifeDate-withMillis":"long",
		"setGalleryImage-withEndOfLifeDate-withEra":"int",
		"setGalleryImage-withEndOfLifeDate-withCenturyOfEra":"int",
		"setGalleryImage-withEndOfLifeDate-withYearOfEra":"int",
		"setGalleryImage-withEndOfLifeDate-withYearOfCentury":"int",
		"setGalleryImage-withEndOfLifeDate-withYear":"int",
		"setGalleryImage-withEndOfLifeDate-withWeekyear":"int",
		"setGalleryImage-withEndOfLifeDate-withMonthOfYear":"int",
		"setGalleryImage-withEndOfLifeDate-withWeekOfWeekyear":"int",
		"setGalleryImage-withEndOfLifeDate-withDayOfYear":"int",
		"setGalleryImage-withEndOfLifeDate-withDayOfMonth":"int",
		"setGalleryImage-withEndOfLifeDate-withDayOfWeek":"int",
		"setGalleryImage-withEndOfLifeDate-withHourOfDay":"int",
		"setGalleryImage-withEndOfLifeDate-withMinuteOfHour":"int",
		"setGalleryImage-withEndOfLifeDate-withSecondOfMinute":"int",
		"setGalleryImage-withEndOfLifeDate-withMillisOfSecond":"int",
		"setGalleryImage-withEndOfLifeDate-withMillisOfDay":"int",
		"setGalleryImage-withRecommended-withMemory-withMin":"java.lang.Integer",
		"setGalleryImage-withRecommended-withMemory-withMax":"java.lang.Integer",
		"setGalleryImage-withRecommended-withVCPUs-withMin":"java.lang.Integer",
		"setGalleryImage-withRecommended-withVCPUs-withMax":"java.lang.Integer",
		"setGalleryImage-withDisallowed-withDiskTypes":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setGalleryImage-withPurchasePlan-withPublisher":"java.lang.String",
		"setGalleryImage-withPurchasePlan-withName":"java.lang.String",
		"setGalleryImage-withPurchasePlan-withProduct":"java.lang.String",
		"setGalleryImage-withLocation":"java.lang.String",
		"setGalleryImage-withTags":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"setGalleryImageName":"java.lang.String"
	}
}
```
## ListNextResourceSkus parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## BeginExportRequestRateByIntervalLogAnalytics parameterss:

```
{
	"main":{
		"setLocation":"java.lang.String",
		"setParameters-withBlobContainerSasUri":"java.lang.String",
		"setParameters-withFromTime-withMillis":"long",
		"setParameters-withFromTime-withEra":"int",
		"setParameters-withFromTime-withCenturyOfEra":"int",
		"setParameters-withFromTime-withYearOfEra":"int",
		"setParameters-withFromTime-withYearOfCentury":"int",
		"setParameters-withFromTime-withYear":"int",
		"setParameters-withFromTime-withWeekyear":"int",
		"setParameters-withFromTime-withMonthOfYear":"int",
		"setParameters-withFromTime-withWeekOfWeekyear":"int",
		"setParameters-withFromTime-withDayOfYear":"int",
		"setParameters-withFromTime-withDayOfMonth":"int",
		"setParameters-withFromTime-withDayOfWeek":"int",
		"setParameters-withFromTime-withHourOfDay":"int",
		"setParameters-withFromTime-withMinuteOfHour":"int",
		"setParameters-withFromTime-withSecondOfMinute":"int",
		"setParameters-withFromTime-withMillisOfSecond":"int",
		"setParameters-withFromTime-withMillisOfDay":"int",
		"setParameters-withToTime-withMillis":"long",
		"setParameters-withToTime-withEra":"int",
		"setParameters-withToTime-withCenturyOfEra":"int",
		"setParameters-withToTime-withYearOfEra":"int",
		"setParameters-withToTime-withYearOfCentury":"int",
		"setParameters-withToTime-withYear":"int",
		"setParameters-withToTime-withWeekyear":"int",
		"setParameters-withToTime-withMonthOfYear":"int",
		"setParameters-withToTime-withWeekOfWeekyear":"int",
		"setParameters-withToTime-withDayOfYear":"int",
		"setParameters-withToTime-withDayOfMonth":"int",
		"setParameters-withToTime-withDayOfWeek":"int",
		"setParameters-withToTime-withHourOfDay":"int",
		"setParameters-withToTime-withMinuteOfHour":"int",
		"setParameters-withToTime-withSecondOfMinute":"int",
		"setParameters-withToTime-withMillisOfSecond":"int",
		"setParameters-withToTime-withMillisOfDay":"int",
		"setParameters-withGroupByThrottlePolicy":"java.lang.Boolean",
		"setParameters-withGroupByOperationName":"java.lang.Boolean",
		"setParameters-withGroupByResourceName":"java.lang.Boolean"
	}
}
```
## ListAvailableSizesVirtualMachines parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmName":"java.lang.String"
	}
}
```
## ListByResourceGroupDisks parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String"
	}
}
```
## DeleteWithServiceResponseAsyncDisks parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setDiskName":"java.lang.String"
	}
}
```
## CreateOrUpdateGalleries parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setGallery-withDescription":"java.lang.String",
		"setGallery-withLocation":"java.lang.String",
		"setGallery-withTags":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"setGalleryName":"java.lang.String"
	}
}
```
## DeleteWithServiceResponseAsyncGalleryImages parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setGalleryName":"java.lang.String",
		"setGalleryImageName":"java.lang.String"
	}
}
```
## ListPublishersVirtualMachineImages parameterss:

```
{
	"main":{
		"setLocation":"java.lang.String"
	}
}
```
## DeleteInstancesVirtualMachineScaleSets parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setInstanceIds":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setVmScaleSetName":"java.lang.String"
	}
}
```
## GetByResourceGroupImages parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setImageName":"java.lang.String"
	}
}
```
## ListAvailableSizesAsyncAvailabilitySets parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setAvailabilitySetName":"java.lang.String"
	}
}
```
## ListSkusNextAsyncVirtualMachineScaleSets parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListAvailableSizesWithServiceResponseAsyncAvailabilitySets parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setAvailabilitySetName":"java.lang.String"
	}
}
```
## ListWithServiceResponseAsyncVirtualMachineScaleSetExtensions parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmScaleSetName":"java.lang.String"
	}
}
```
## BeginUpdateVirtualMachineExtensions parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmName":"java.lang.String",
		"setVmExtensionName":"java.lang.String",
		"setExtensionParameters-withForceUpdateTag":"java.lang.String",
		"setExtensionParameters-withPublisher":"java.lang.String",
		"setExtensionParameters-withTypeHandlerVersion":"java.lang.String",
		"setExtensionParameters-withAutoUpgradeMinorVersion":"java.lang.Boolean",
		"setExtensionParameters-withType":"java.lang.String",
		"setExtensionParameters-withTags":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		}
	}
}
```
## ListSkusWithServiceResponseAsyncVirtualMachineImages parameterss:

```
{
	"main":{
		"setLocation":"java.lang.String",
		"setPublisherName":"java.lang.String",
		"setOffer":"java.lang.String"
	}
}
```
## ListByResourceGroupNextSinglePageAsyncImages parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListVersionsVirtualMachineExtensionImages parameterss:

```
{
	"main":{
		"setLocation":"java.lang.String",
		"setType":"java.lang.String",
		"setPublisherName":"java.lang.String"
	}
}
```
## ListByResourceGroupNextAsyncGalleries parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListByResourceGroupWithServiceResponseAsyncVirtualMachineScaleSets parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String"
	}
}
```
## ListOperations parameterss:

```
{}
```
## CreateOrUpdateVirtualMachines parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmName":"java.lang.String",
		"setParameters-withPlan-withPublisher":"java.lang.String",
		"setParameters-withPlan-withName":"java.lang.String",
		"setParameters-withPlan-withProduct":"java.lang.String",
		"setParameters-withPlan-withPromotionCode":"java.lang.String",
		"setParameters-withStorageProfile-withImageReference-withPublisher":"java.lang.String",
		"setParameters-withStorageProfile-withImageReference-withSku":"java.lang.String",
		"setParameters-withStorageProfile-withImageReference-withOffer":"java.lang.String",
		"setParameters-withStorageProfile-withImageReference-withVersion":"java.lang.String",
		"setParameters-withStorageProfile-withImageReference-withId":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withName":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withDiskSizeGB":"java.lang.Integer",
		"setParameters-withStorageProfile-withOsDisk-withEncryptionSettings-withEnabled":"java.lang.Boolean",
		"setParameters-withStorageProfile-withOsDisk-withEncryptionSettings-withDiskEncryptionKey-withSourceVault-withId":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withEncryptionSettings-withDiskEncryptionKey-withSecretUrl":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withEncryptionSettings-withKeyEncryptionKey-withSourceVault-withId":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withEncryptionSettings-withKeyEncryptionKey-withKeyUrl":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withWriteAcceleratorEnabled":"java.lang.Boolean",
		"setParameters-withStorageProfile-withOsDisk-withImage-withUri":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withManagedDisk-withId":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withVhd-withUri":"java.lang.String",
		"setParameters-withStorageProfile-withDataDisks":[
			"ref1-com.microsoft.azure.management.compute.DataDisk"
		],
		"setParameters-withOsProfile-withCustomData":"java.lang.String",
		"setParameters-withOsProfile-withWindowsConfiguration-withProvisionVMAgent":"java.lang.Boolean",
		"setParameters-withOsProfile-withWindowsConfiguration-withEnableAutomaticUpdates":"java.lang.Boolean",
		"setParameters-withOsProfile-withWindowsConfiguration-withTimeZone":"java.lang.String",
		"setParameters-withOsProfile-withWindowsConfiguration-withAdditionalUnattendContent":[
			"ref2-com.microsoft.azure.management.compute.AdditionalUnattendContent"
		],
		"setParameters-withOsProfile-withWindowsConfiguration-withWinRM-withListeners":[
			"ref3-com.microsoft.azure.management.compute.WinRMListener"
		],
		"setParameters-withOsProfile-withLinuxConfiguration-withSsh-withPublicKeys":[
			"ref4-com.microsoft.azure.management.compute.SshPublicKey"
		],
		"setParameters-withOsProfile-withLinuxConfiguration-withProvisionVMAgent":"java.lang.Boolean",
		"setParameters-withOsProfile-withLinuxConfiguration-withDisablePasswordAuthentication":"java.lang.Boolean",
		"setParameters-withOsProfile-withSecrets":[
			"ref5-com.microsoft.azure.management.compute.VaultSecretGroup"
		],
		"setParameters-withOsProfile-withAdminUsername":"java.lang.String",
		"setParameters-withOsProfile-withAdminPassword":"java.lang.String",
		"setParameters-withOsProfile-withAllowExtensionOperations":"java.lang.Boolean",
		"setParameters-withOsProfile-withComputerName":"java.lang.String",
		"setParameters-withNetworkProfile-withNetworkInterfaces":[
			"ref7-com.microsoft.azure.management.compute.NetworkInterfaceReference"
		],
		"setParameters-withDiagnosticsProfile-withBootDiagnostics-withEnabled":"java.lang.Boolean",
		"setParameters-withDiagnosticsProfile-withBootDiagnostics-withStorageUri":"java.lang.String",
		"setParameters-withAvailabilitySet-withId":"java.lang.String",
		"setParameters-withLicenseType":"java.lang.String",
		"setParameters-withIdentity-withUserAssignedIdentities":{
			"java.lang.String0":"ref8-com.microsoft.azure.management.compute.VirtualMachineIdentityUserAssignedIdentitiesValue"
		},
		"setParameters-withZones":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setParameters-withLocation":"java.lang.String",
		"setParameters-withTags":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		}
	},
	"ref1-com.microsoft.azure.management.compute.DataDisk":{
		"withName":"java.lang.String",
		"withDiskSizeGB":"java.lang.Integer",
		"withWriteAcceleratorEnabled":"java.lang.Boolean",
		"withImage-withUri":"java.lang.String",
		"withManagedDisk-withId":"java.lang.String",
		"withLun":"int",
		"withVhd-withUri":"java.lang.String"
	},
	"ref2-com.microsoft.azure.management.compute.AdditionalUnattendContent":{
		"withContent":"java.lang.String"
	},
	"ref3-com.microsoft.azure.management.compute.WinRMListener":{
		"withCertificateUrl":"java.lang.String"
	},
	"ref4-com.microsoft.azure.management.compute.SshPublicKey":{
		"withPath":"java.lang.String",
		"withKeyData":"java.lang.String"
	},
	"ref5-com.microsoft.azure.management.compute.VaultSecretGroup":{
		"withSourceVault-withId":"java.lang.String",
		"setParameters-withOsProfile-withSecrets-withVaultCertificates":[
			"ref6-com.microsoft.azure.management.compute.VaultCertificate"
		]
	},
	"ref6-com.microsoft.azure.management.compute.VaultCertificate":{
		"withCertificateUrl":"java.lang.String",
		"withCertificateStore":"java.lang.String"
	},
	"ref7-com.microsoft.azure.management.compute.NetworkInterfaceReference":{
		"withPrimary":"java.lang.Boolean",
		"withId":"java.lang.String"
	}
}
```
## DeleteDisks parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setDiskName":"java.lang.String"
	}
}
```
## GetVirtualMachineImages parameterss:

```
{
	"main":{
		"setVersion":"java.lang.String",
		"setLocation":"java.lang.String",
		"setPublisherName":"java.lang.String",
		"setOffer":"java.lang.String",
		"setSkus":"java.lang.String"
	}
}
```
## ListByResourceGroupWithServiceResponseAsyncImages parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String"
	}
}
```
## CreateOrUpdateSnapshots parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setSnapshotName":"java.lang.String",
		"setSnapshot-withCreationData-withImageReference-withId":"java.lang.String",
		"setSnapshot-withCreationData-withImageReference-withLun":"java.lang.Integer",
		"setSnapshot-withCreationData-withStorageAccountId":"java.lang.String",
		"setSnapshot-withCreationData-withSourceUri":"java.lang.String",
		"setSnapshot-withCreationData-withSourceResourceId":"java.lang.String",
		"setSnapshot-withDiskSizeGB":"java.lang.Integer",
		"setSnapshot-withEncryptionSettings-withEnabled":"java.lang.Boolean",
		"setSnapshot-withEncryptionSettings-withDiskEncryptionKey-withSourceVault-withId":"java.lang.String",
		"setSnapshot-withEncryptionSettings-withDiskEncryptionKey-withSecretUrl":"java.lang.String",
		"setSnapshot-withEncryptionSettings-withKeyEncryptionKey-withSourceVault-withId":"java.lang.String",
		"setSnapshot-withEncryptionSettings-withKeyEncryptionKey-withKeyUrl":"java.lang.String",
		"setSnapshot-withLocation":"java.lang.String",
		"setSnapshot-withTags":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		}
	}
}
```
## DeleteAsyncVirtualMachineScaleSetVMs parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmScaleSetName":"java.lang.String",
		"setInstanceId":"java.lang.String"
	}
}
```
## UpdateVirtualMachineExtensions parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmName":"java.lang.String",
		"setVmExtensionName":"java.lang.String",
		"setExtensionParameters-withForceUpdateTag":"java.lang.String",
		"setExtensionParameters-withPublisher":"java.lang.String",
		"setExtensionParameters-withTypeHandlerVersion":"java.lang.String",
		"setExtensionParameters-withAutoUpgradeMinorVersion":"java.lang.Boolean",
		"setExtensionParameters-withType":"java.lang.String",
		"setExtensionParameters-withTags":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		}
	}
}
```
## ListAsyncVirtualMachineRunCommands parameterss:

```
{
	"main":{
		"setLocation":"java.lang.String"
	}
}
```
## DeleteAsyncImages parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setImageName":"java.lang.String"
	}
}
```
## ListOffersWithServiceResponseAsyncVirtualMachineImages parameterss:

```
{
	"main":{
		"setLocation":"java.lang.String",
		"setPublisherName":"java.lang.String"
	}
}
```
## ListByGallerySinglePageAsyncGalleryImages parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setGalleryName":"java.lang.String"
	}
}
```
## CreateOrUpdateVirtualMachineScaleSets parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setParameters-withPlan-withPublisher":"java.lang.String",
		"setParameters-withPlan-withName":"java.lang.String",
		"setParameters-withPlan-withProduct":"java.lang.String",
		"setParameters-withPlan-withPromotionCode":"java.lang.String",
		"setParameters-withPlatformFaultDomainCount":"java.lang.Integer",
		"setParameters-withSku-withName":"java.lang.String",
		"setParameters-withSku-withCapacity":"java.lang.Long",
		"setParameters-withSku-withTier":"java.lang.String",
		"setParameters-withIdentity-withUserAssignedIdentities":{
			"java.lang.String0":"ref1-com.microsoft.azure.management.compute.VirtualMachineScaleSetIdentityUserAssignedIdentitiesValue"
		},
		"setParameters-withZones":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setParameters-withUpgradePolicy-withRollingUpgradePolicy-withMaxBatchInstancePercent":"java.lang.Integer",
		"setParameters-withUpgradePolicy-withRollingUpgradePolicy-withMaxUnhealthyInstancePercent":"java.lang.Integer",
		"setParameters-withUpgradePolicy-withRollingUpgradePolicy-withMaxUnhealthyUpgradedInstancePercent":"java.lang.Integer",
		"setParameters-withUpgradePolicy-withRollingUpgradePolicy-withPauseTimeBetweenBatches":"java.lang.String",
		"setParameters-withUpgradePolicy-withAutomaticOSUpgrade":"java.lang.Boolean",
		"setParameters-withUpgradePolicy-withAutoOSUpgradePolicy-withDisableAutoRollback":"java.lang.Boolean",
		"setParameters-withZoneBalance":"java.lang.Boolean",
		"setParameters-withVirtualMachineProfile-withStorageProfile-withImageReference-withPublisher":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withStorageProfile-withImageReference-withSku":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withStorageProfile-withImageReference-withOffer":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withStorageProfile-withImageReference-withVersion":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withStorageProfile-withImageReference-withId":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withStorageProfile-withOsDisk-withName":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withStorageProfile-withOsDisk-withWriteAcceleratorEnabled":"java.lang.Boolean",
		"setParameters-withVirtualMachineProfile-withStorageProfile-withOsDisk-withImage-withUri":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withStorageProfile-withOsDisk-withVhdContainers":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setParameters-withVirtualMachineProfile-withStorageProfile-withDataDisks":[
			"ref2-com.microsoft.azure.management.compute.VirtualMachineScaleSetDataDisk"
		],
		"setParameters-withVirtualMachineProfile-withOsProfile-withCustomData":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withOsProfile-withWindowsConfiguration-withProvisionVMAgent":"java.lang.Boolean",
		"setParameters-withVirtualMachineProfile-withOsProfile-withWindowsConfiguration-withEnableAutomaticUpdates":"java.lang.Boolean",
		"setParameters-withVirtualMachineProfile-withOsProfile-withWindowsConfiguration-withTimeZone":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withOsProfile-withWindowsConfiguration-withAdditionalUnattendContent":[
			"ref3-com.microsoft.azure.management.compute.AdditionalUnattendContent"
		],
		"setParameters-withVirtualMachineProfile-withOsProfile-withWindowsConfiguration-withWinRM-withListeners":[
			"ref4-com.microsoft.azure.management.compute.WinRMListener"
		],
		"setParameters-withVirtualMachineProfile-withOsProfile-withLinuxConfiguration-withSsh-withPublicKeys":[
			"ref5-com.microsoft.azure.management.compute.SshPublicKey"
		],
		"setParameters-withVirtualMachineProfile-withOsProfile-withLinuxConfiguration-withProvisionVMAgent":"java.lang.Boolean",
		"setParameters-withVirtualMachineProfile-withOsProfile-withLinuxConfiguration-withDisablePasswordAuthentication":"java.lang.Boolean",
		"setParameters-withVirtualMachineProfile-withOsProfile-withSecrets":[
			"ref6-com.microsoft.azure.management.compute.VaultSecretGroup"
		],
		"setParameters-withVirtualMachineProfile-withOsProfile-withAdminUsername":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withOsProfile-withAdminPassword":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withOsProfile-withComputerNamePrefix":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withNetworkInterfaceConfigurations":[
			"ref8-com.microsoft.azure.management.compute.VirtualMachineScaleSetNetworkConfiguration"
		],
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withNetworkInterfaceConfigurations-withIpConfigurations-withApplicationGatewayBackendAddressPools":[
			"ref11-com.microsoft.azure.SubResource"
		],
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withNetworkInterfaceConfigurations-withIpConfigurations-withLoadBalancerBackendAddressPools":[
			"ref12-com.microsoft.azure.SubResource"
		],
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withNetworkInterfaceConfigurations-withIpConfigurations-withLoadBalancerInboundNatPools":[
			"ref13-com.microsoft.azure.SubResource"
		],
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withNetworkInterfaceConfigurations-withIpConfigurations-withApplicationSecurityGroups":[
			"ref14-com.microsoft.azure.SubResource"
		],
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withNetworkInterfaceConfigurations-withIpConfigurations-withId":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withNetworkInterfaceConfigurations-withEnableIPForwarding":"java.lang.Boolean",
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withNetworkInterfaceConfigurations-withId":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withHealthProbe-withId":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withDiagnosticsProfile-withBootDiagnostics-withEnabled":"java.lang.Boolean",
		"setParameters-withVirtualMachineProfile-withDiagnosticsProfile-withBootDiagnostics-withStorageUri":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withLicenseType":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withExtensionProfile-withExtensions":[
			"ref15-com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner"
		],
		"setParameters-withOverprovision":"java.lang.Boolean",
		"setParameters-withSinglePlacementGroup":"java.lang.Boolean",
		"setParameters-withLocation":"java.lang.String",
		"setParameters-withTags":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"setVmScaleSetName":"java.lang.String"
	},
	"ref2-com.microsoft.azure.management.compute.VirtualMachineScaleSetDataDisk":{
		"withName":"java.lang.String",
		"withDiskSizeGB":"java.lang.Integer",
		"withWriteAcceleratorEnabled":"java.lang.Boolean",
		"withLun":"int"
	},
	"ref3-com.microsoft.azure.management.compute.AdditionalUnattendContent":{
		"withContent":"java.lang.String"
	},
	"ref4-com.microsoft.azure.management.compute.WinRMListener":{
		"withCertificateUrl":"java.lang.String"
	},
	"ref5-com.microsoft.azure.management.compute.SshPublicKey":{
		"withPath":"java.lang.String",
		"withKeyData":"java.lang.String"
	},
	"ref6-com.microsoft.azure.management.compute.VaultSecretGroup":{
		"withSourceVault-withId":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withOsProfile-withSecrets-withVaultCertificates":[
			"ref7-com.microsoft.azure.management.compute.VaultCertificate"
		]
	},
	"ref7-com.microsoft.azure.management.compute.VaultCertificate":{
		"withCertificateUrl":"java.lang.String",
		"withCertificateStore":"java.lang.String"
	},
	"ref8-com.microsoft.azure.management.compute.VirtualMachineScaleSetNetworkConfiguration":{
		"withName":"java.lang.String",
		"withPrimary":"java.lang.Boolean",
		"withEnableAcceleratedNetworking":"java.lang.Boolean",
		"withNetworkSecurityGroup-withId":"java.lang.String",
		"withDnsSettings-withDnsServers":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withNetworkInterfaceConfigurations-withIpConfigurations":[
			"ref9-com.microsoft.azure.management.compute.VirtualMachineScaleSetIPConfiguration"
		]
	},
	"ref9-com.microsoft.azure.management.compute.VirtualMachineScaleSetIPConfiguration":{
		"withName":"java.lang.String",
		"withPrimary":"java.lang.Boolean",
		"withSubnet-withId":"java.lang.String",
		"withPublicIPAddressConfiguration-withName":"java.lang.String",
		"withPublicIPAddressConfiguration-withDnsSettings-withDomainNameLabel":"java.lang.String",
		"withPublicIPAddressConfiguration-withIdleTimeoutInMinutes":"java.lang.Integer",
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withNetworkInterfaceConfigurations-withIpConfigurations-withPublicIPAddressConfiguration-withIpTags":[
			"ref10-com.microsoft.azure.management.compute.VirtualMachineScaleSetIpTag"
		]
	},
	"ref10-com.microsoft.azure.management.compute.VirtualMachineScaleSetIpTag":{
		"withIpTagType":"java.lang.String",
		"withTag":"java.lang.String"
	},
	"ref11-com.microsoft.azure.SubResource":{
		"withId":"java.lang.String"
	},
	"ref12-com.microsoft.azure.SubResource":{
		"withId":"java.lang.String"
	},
	"ref13-com.microsoft.azure.SubResource":{
		"withId":"java.lang.String"
	},
	"ref14-com.microsoft.azure.SubResource":{
		"withId":"java.lang.String"
	},
	"ref15-com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner":{
		"withForceUpdateTag":"java.lang.String",
		"withPublisher":"java.lang.String",
		"withTypeHandlerVersion":"java.lang.String",
		"withAutoUpgradeMinorVersion":"java.lang.Boolean",
		"withName":"java.lang.String",
		"withType":"java.lang.String"
	}
}
```
## BeginCreateOrUpdateSnapshots parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setSnapshotName":"java.lang.String",
		"setSnapshot-withCreationData-withImageReference-withId":"java.lang.String",
		"setSnapshot-withCreationData-withImageReference-withLun":"java.lang.Integer",
		"setSnapshot-withCreationData-withStorageAccountId":"java.lang.String",
		"setSnapshot-withCreationData-withSourceUri":"java.lang.String",
		"setSnapshot-withCreationData-withSourceResourceId":"java.lang.String",
		"setSnapshot-withDiskSizeGB":"java.lang.Integer",
		"setSnapshot-withEncryptionSettings-withEnabled":"java.lang.Boolean",
		"setSnapshot-withEncryptionSettings-withDiskEncryptionKey-withSourceVault-withId":"java.lang.String",
		"setSnapshot-withEncryptionSettings-withDiskEncryptionKey-withSecretUrl":"java.lang.String",
		"setSnapshot-withEncryptionSettings-withKeyEncryptionKey-withSourceVault-withId":"java.lang.String",
		"setSnapshot-withEncryptionSettings-withKeyEncryptionKey-withKeyUrl":"java.lang.String",
		"setSnapshot-withLocation":"java.lang.String",
		"setSnapshot-withTags":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		}
	}
}
```
## ListByGalleryGalleryImages parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setGalleryName":"java.lang.String"
	}
}
```
## UpdateAvailabilitySets parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setAvailabilitySetName":"java.lang.String",
		"setParameters-withPlatformFaultDomainCount":"java.lang.Integer",
		"setParameters-withVirtualMachines":[
			"ref1-com.microsoft.azure.SubResource"
		],
		"setParameters-withSku-withName":"java.lang.String",
		"setParameters-withSku-withCapacity":"java.lang.Long",
		"setParameters-withSku-withTier":"java.lang.String",
		"setParameters-withPlatformUpdateDomainCount":"java.lang.Integer",
		"setParameters-withTags":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		}
	},
	"ref1-com.microsoft.azure.SubResource":{
		"withId":"java.lang.String"
	}
}
```
## GetGalleryImageVersions parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setGalleryName":"java.lang.String",
		"setGalleryImageVersionName":"java.lang.String",
		"setGalleryImageName":"java.lang.String"
	}
}
```
## ListWithServiceResponseAsyncVirtualMachineSizes parameterss:

```
{
	"main":{
		"setLocation":"java.lang.String"
	}
}
```
## ListAvailableSizesAvailabilitySets parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setAvailabilitySetName":"java.lang.String"
	}
}
```
## DeleteWithServiceResponseAsyncVirtualMachineScaleSetExtensions parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmScaleSetName":"java.lang.String",
		"setVmssExtensionName":"java.lang.String"
	}
}
```
## ListByGalleryImageNextWithServiceResponseAsyncGalleryImageVersions parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListAsyncVirtualMachineImages parameterss:

```
{
	"main":{
		"setLocation":"java.lang.String",
		"setPublisherName":"java.lang.String",
		"setOffer":"java.lang.String",
		"setSkus":"java.lang.String"
	}
}
```
## ListByResourceGroupImages parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String"
	}
}
```
## UpdateImages parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setParameters-withSourceVirtualMachine-withId":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withDiskSizeGB":"java.lang.Integer",
		"setParameters-withStorageProfile-withOsDisk-withManagedDisk-withId":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withSnapshot-withId":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withBlobUri":"java.lang.String",
		"setParameters-withStorageProfile-withDataDisks":[
			"ref1-com.microsoft.azure.management.compute.ImageDataDisk"
		],
		"setParameters-withStorageProfile-withZoneResilient":"java.lang.Boolean",
		"setParameters-withTags":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"setImageName":"java.lang.String"
	},
	"ref1-com.microsoft.azure.management.compute.ImageDataDisk":{
		"withDiskSizeGB":"java.lang.Integer",
		"withManagedDisk-withId":"java.lang.String",
		"withLun":"int",
		"withSnapshot-withId":"java.lang.String",
		"withBlobUri":"java.lang.String"
	}
}
```
## ListByResourceGroupVirtualMachines parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String"
	}
}
```
## CreateOrUpdateDisks parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setDisk-withZones":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setDisk-withCreationData-withImageReference-withId":"java.lang.String",
		"setDisk-withCreationData-withImageReference-withLun":"java.lang.Integer",
		"setDisk-withCreationData-withStorageAccountId":"java.lang.String",
		"setDisk-withCreationData-withSourceUri":"java.lang.String",
		"setDisk-withCreationData-withSourceResourceId":"java.lang.String",
		"setDisk-withDiskSizeGB":"java.lang.Integer",
		"setDisk-withEncryptionSettings-withEnabled":"java.lang.Boolean",
		"setDisk-withEncryptionSettings-withDiskEncryptionKey-withSourceVault-withId":"java.lang.String",
		"setDisk-withEncryptionSettings-withDiskEncryptionKey-withSecretUrl":"java.lang.String",
		"setDisk-withEncryptionSettings-withKeyEncryptionKey-withSourceVault-withId":"java.lang.String",
		"setDisk-withEncryptionSettings-withKeyEncryptionKey-withKeyUrl":"java.lang.String",
		"setDisk-withLocation":"java.lang.String",
		"setDisk-withTags":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"setDiskName":"java.lang.String"
	}
}
```
## ListNextVirtualMachineScaleSetExtensions parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListNextSinglePageAsyncVirtualMachineScaleSetExtensions parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListSnapshots parameterss:

```
{}
```
## ListNextAsyncImages parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## UpdateSnapshots parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setSnapshotName":"java.lang.String",
		"setSnapshot-withTags":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"setSnapshot-withDiskSizeGB":"java.lang.Integer",
		"setSnapshot-withEncryptionSettings-withEnabled":"java.lang.Boolean",
		"setSnapshot-withEncryptionSettings-withDiskEncryptionKey-withSourceVault-withId":"java.lang.String",
		"setSnapshot-withEncryptionSettings-withDiskEncryptionKey-withSecretUrl":"java.lang.String",
		"setSnapshot-withEncryptionSettings-withKeyEncryptionKey-withSourceVault-withId":"java.lang.String",
		"setSnapshot-withEncryptionSettings-withKeyEncryptionKey-withKeyUrl":"java.lang.String"
	}
}
```
## ListTypesVirtualMachineExtensionImages parameterss:

```
{
	"main":{
		"setLocation":"java.lang.String",
		"setPublisherName":"java.lang.String"
	}
}
```
## UpdateVirtualMachines parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmName":"java.lang.String",
		"setParameters-withPlan-withPublisher":"java.lang.String",
		"setParameters-withPlan-withName":"java.lang.String",
		"setParameters-withPlan-withProduct":"java.lang.String",
		"setParameters-withPlan-withPromotionCode":"java.lang.String",
		"setParameters-withStorageProfile-withImageReference-withPublisher":"java.lang.String",
		"setParameters-withStorageProfile-withImageReference-withSku":"java.lang.String",
		"setParameters-withStorageProfile-withImageReference-withOffer":"java.lang.String",
		"setParameters-withStorageProfile-withImageReference-withVersion":"java.lang.String",
		"setParameters-withStorageProfile-withImageReference-withId":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withName":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withDiskSizeGB":"java.lang.Integer",
		"setParameters-withStorageProfile-withOsDisk-withEncryptionSettings-withEnabled":"java.lang.Boolean",
		"setParameters-withStorageProfile-withOsDisk-withEncryptionSettings-withDiskEncryptionKey-withSourceVault-withId":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withEncryptionSettings-withDiskEncryptionKey-withSecretUrl":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withEncryptionSettings-withKeyEncryptionKey-withSourceVault-withId":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withEncryptionSettings-withKeyEncryptionKey-withKeyUrl":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withWriteAcceleratorEnabled":"java.lang.Boolean",
		"setParameters-withStorageProfile-withOsDisk-withImage-withUri":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withManagedDisk-withId":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withVhd-withUri":"java.lang.String",
		"setParameters-withStorageProfile-withDataDisks":[
			"ref1-com.microsoft.azure.management.compute.DataDisk"
		],
		"setParameters-withOsProfile-withCustomData":"java.lang.String",
		"setParameters-withOsProfile-withWindowsConfiguration-withProvisionVMAgent":"java.lang.Boolean",
		"setParameters-withOsProfile-withWindowsConfiguration-withEnableAutomaticUpdates":"java.lang.Boolean",
		"setParameters-withOsProfile-withWindowsConfiguration-withTimeZone":"java.lang.String",
		"setParameters-withOsProfile-withWindowsConfiguration-withAdditionalUnattendContent":[
			"ref2-com.microsoft.azure.management.compute.AdditionalUnattendContent"
		],
		"setParameters-withOsProfile-withWindowsConfiguration-withWinRM-withListeners":[
			"ref3-com.microsoft.azure.management.compute.WinRMListener"
		],
		"setParameters-withOsProfile-withLinuxConfiguration-withSsh-withPublicKeys":[
			"ref4-com.microsoft.azure.management.compute.SshPublicKey"
		],
		"setParameters-withOsProfile-withLinuxConfiguration-withProvisionVMAgent":"java.lang.Boolean",
		"setParameters-withOsProfile-withLinuxConfiguration-withDisablePasswordAuthentication":"java.lang.Boolean",
		"setParameters-withOsProfile-withSecrets":[
			"ref5-com.microsoft.azure.management.compute.VaultSecretGroup"
		],
		"setParameters-withOsProfile-withAdminUsername":"java.lang.String",
		"setParameters-withOsProfile-withAdminPassword":"java.lang.String",
		"setParameters-withOsProfile-withAllowExtensionOperations":"java.lang.Boolean",
		"setParameters-withOsProfile-withComputerName":"java.lang.String",
		"setParameters-withNetworkProfile-withNetworkInterfaces":[
			"ref7-com.microsoft.azure.management.compute.NetworkInterfaceReference"
		],
		"setParameters-withDiagnosticsProfile-withBootDiagnostics-withEnabled":"java.lang.Boolean",
		"setParameters-withDiagnosticsProfile-withBootDiagnostics-withStorageUri":"java.lang.String",
		"setParameters-withAvailabilitySet-withId":"java.lang.String",
		"setParameters-withLicenseType":"java.lang.String",
		"setParameters-withIdentity-withUserAssignedIdentities":{
			"java.lang.String0":"ref8-com.microsoft.azure.management.compute.VirtualMachineIdentityUserAssignedIdentitiesValue"
		},
		"setParameters-withZones":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setParameters-withTags":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		}
	},
	"ref1-com.microsoft.azure.management.compute.DataDisk":{
		"withName":"java.lang.String",
		"withDiskSizeGB":"java.lang.Integer",
		"withWriteAcceleratorEnabled":"java.lang.Boolean",
		"withImage-withUri":"java.lang.String",
		"withManagedDisk-withId":"java.lang.String",
		"withLun":"int",
		"withVhd-withUri":"java.lang.String"
	},
	"ref2-com.microsoft.azure.management.compute.AdditionalUnattendContent":{
		"withContent":"java.lang.String"
	},
	"ref3-com.microsoft.azure.management.compute.WinRMListener":{
		"withCertificateUrl":"java.lang.String"
	},
	"ref4-com.microsoft.azure.management.compute.SshPublicKey":{
		"withPath":"java.lang.String",
		"withKeyData":"java.lang.String"
	},
	"ref5-com.microsoft.azure.management.compute.VaultSecretGroup":{
		"withSourceVault-withId":"java.lang.String",
		"setParameters-withOsProfile-withSecrets-withVaultCertificates":[
			"ref6-com.microsoft.azure.management.compute.VaultCertificate"
		]
	},
	"ref6-com.microsoft.azure.management.compute.VaultCertificate":{
		"withCertificateUrl":"java.lang.String",
		"withCertificateStore":"java.lang.String"
	},
	"ref7-com.microsoft.azure.management.compute.NetworkInterfaceReference":{
		"withPrimary":"java.lang.Boolean",
		"withId":"java.lang.String"
	}
}
```
## ListNextSinglePageAsyncVirtualMachineScaleSets parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## GetByResourceGroupVirtualMachineScaleSets parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmScaleSetName":"java.lang.String"
	}
}
```
## DeleteVirtualMachineScaleSets parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmScaleSetName":"java.lang.String"
	}
}
```
## BeginCreateOrUpdateGalleryImageVersions parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setGalleryName":"java.lang.String",
		"setGalleryImageVersion-withPublishingProfile-withEndOfLifeDate-withMillis":"long",
		"setGalleryImageVersion-withPublishingProfile-withEndOfLifeDate-withEra":"int",
		"setGalleryImageVersion-withPublishingProfile-withEndOfLifeDate-withCenturyOfEra":"int",
		"setGalleryImageVersion-withPublishingProfile-withEndOfLifeDate-withYearOfEra":"int",
		"setGalleryImageVersion-withPublishingProfile-withEndOfLifeDate-withYearOfCentury":"int",
		"setGalleryImageVersion-withPublishingProfile-withEndOfLifeDate-withYear":"int",
		"setGalleryImageVersion-withPublishingProfile-withEndOfLifeDate-withWeekyear":"int",
		"setGalleryImageVersion-withPublishingProfile-withEndOfLifeDate-withMonthOfYear":"int",
		"setGalleryImageVersion-withPublishingProfile-withEndOfLifeDate-withWeekOfWeekyear":"int",
		"setGalleryImageVersion-withPublishingProfile-withEndOfLifeDate-withDayOfYear":"int",
		"setGalleryImageVersion-withPublishingProfile-withEndOfLifeDate-withDayOfMonth":"int",
		"setGalleryImageVersion-withPublishingProfile-withEndOfLifeDate-withDayOfWeek":"int",
		"setGalleryImageVersion-withPublishingProfile-withEndOfLifeDate-withHourOfDay":"int",
		"setGalleryImageVersion-withPublishingProfile-withEndOfLifeDate-withMinuteOfHour":"int",
		"setGalleryImageVersion-withPublishingProfile-withEndOfLifeDate-withSecondOfMinute":"int",
		"setGalleryImageVersion-withPublishingProfile-withEndOfLifeDate-withMillisOfSecond":"int",
		"setGalleryImageVersion-withPublishingProfile-withEndOfLifeDate-withMillisOfDay":"int",
		"setGalleryImageVersion-withPublishingProfile-withReplicaCount":"java.lang.Integer",
		"setGalleryImageVersion-withPublishingProfile-withExcludeFromLatest":"java.lang.Boolean",
		"setGalleryImageVersion-withPublishingProfile-withTargetRegions":[
			"ref1-com.microsoft.azure.management.compute.TargetRegion"
		],
		"setGalleryImageVersion-withPublishingProfile-withSource-withManagedImage-withId":"java.lang.String",
		"setGalleryImageVersion-withLocation":"java.lang.String",
		"setGalleryImageVersion-withTags":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"setGalleryImageVersionName":"java.lang.String",
		"setGalleryImageName":"java.lang.String"
	},
	"ref1-com.microsoft.azure.management.compute.TargetRegion":{
		"withName":"java.lang.String",
		"withRegionalReplicaCount":"java.lang.Integer"
	}
}
```
## ListWithServiceResponseAsyncOperations parameterss:

```
{}
```
## ListByResourceGroupNextGalleries parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## BeginCreateOrUpdateVirtualMachineScaleSetExtensions parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setExtensionParameters-withForceUpdateTag":"java.lang.String",
		"setExtensionParameters-withPublisher":"java.lang.String",
		"setExtensionParameters-withTypeHandlerVersion":"java.lang.String",
		"setExtensionParameters-withAutoUpgradeMinorVersion":"java.lang.Boolean",
		"setExtensionParameters-withName":"java.lang.String",
		"setExtensionParameters-withType":"java.lang.String",
		"setVmScaleSetName":"java.lang.String",
		"setVmssExtensionName":"java.lang.String"
	}
}
```
## ListNextWithServiceResponseAsyncVirtualMachineRunCommands parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## DeleteWithServiceResponseAsyncGalleries parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setGalleryName":"java.lang.String"
	}
}
```
## ListSinglePageAsyncResourceSkus parameterss:

```
{}
```
## ListDisks parameterss:

```
{}
```
## GetVirtualMachineScaleSetExtensions parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmScaleSetName":"java.lang.String",
		"setVmssExtensionName":"java.lang.String"
	}
}
```
## ListSinglePageAsyncGalleries parameterss:

```
{}
```
## ListAsyncVirtualMachineScaleSets parameterss:

```
{}
```
## ListNextImages parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListByResourceGroupNextWithServiceResponseAsyncVirtualMachines parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## GetGalleryImages parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setGalleryName":"java.lang.String",
		"setGalleryImageName":"java.lang.String"
	}
}
```
## ListByResourceGroupAvailabilitySets parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String"
	}
}
```
## ListByGalleryAsyncGalleryImages parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setGalleryName":"java.lang.String"
	}
}
```
## ForceRecoveryServiceFabricPlatformUpdateDomainWalkVirtualMachineScaleSets parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmScaleSetName":"java.lang.String",
		"setPlatformUpdateDomain":"int"
	}
}
```
## ListNextSinglePageAsyncResourceSkus parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListNextAsyncDisks parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListUsages parameterss:

```
{
	"main":{
		"setLocation":"java.lang.String"
	}
}
```
## ListTypesAsyncVirtualMachineExtensionImages parameterss:

```
{
	"main":{
		"setLocation":"java.lang.String",
		"setPublisherName":"java.lang.String"
	}
}
```
## GetByResourceGroupVirtualMachines parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmName":"java.lang.String"
	}
}
```
## UpdateDisks parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setDisk-withTags":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"setDisk-withDiskSizeGB":"java.lang.Integer",
		"setDisk-withEncryptionSettings-withEnabled":"java.lang.Boolean",
		"setDisk-withEncryptionSettings-withDiskEncryptionKey-withSourceVault-withId":"java.lang.String",
		"setDisk-withEncryptionSettings-withDiskEncryptionKey-withSecretUrl":"java.lang.String",
		"setDisk-withEncryptionSettings-withKeyEncryptionKey-withSourceVault-withId":"java.lang.String",
		"setDisk-withEncryptionSettings-withKeyEncryptionKey-withKeyUrl":"java.lang.String",
		"setDiskName":"java.lang.String"
	}
}
```
## ListByResourceGroupNextSinglePageAsyncDisks parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListWithServiceResponseAsyncDisks parameterss:

```
{}
```
## ListByResourceGroupAsyncDisks parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String"
	}
}
```
## ListNextSinglePageAsyncImages parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListByResourceGroupNextWithServiceResponseAsyncVirtualMachineScaleSets parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListByResourceGroupNextSinglePageAsyncVirtualMachineScaleSets parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListByResourceGroupAsyncVirtualMachineScaleSets parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String"
	}
}
```
## CreateOrUpdateImages parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setParameters-withSourceVirtualMachine-withId":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withDiskSizeGB":"java.lang.Integer",
		"setParameters-withStorageProfile-withOsDisk-withManagedDisk-withId":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withSnapshot-withId":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withBlobUri":"java.lang.String",
		"setParameters-withStorageProfile-withDataDisks":[
			"ref1-com.microsoft.azure.management.compute.ImageDataDisk"
		],
		"setParameters-withStorageProfile-withZoneResilient":"java.lang.Boolean",
		"setParameters-withLocation":"java.lang.String",
		"setParameters-withTags":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"setImageName":"java.lang.String"
	},
	"ref1-com.microsoft.azure.management.compute.ImageDataDisk":{
		"withDiskSizeGB":"java.lang.Integer",
		"withManagedDisk-withId":"java.lang.String",
		"withLun":"int",
		"withSnapshot-withId":"java.lang.String",
		"withBlobUri":"java.lang.String"
	}
}
```
## ListByResourceGroupSinglePageAsyncSnapshots parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String"
	}
}
```
## ListPublishersWithServiceResponseAsyncVirtualMachineImages parameterss:

```
{
	"main":{
		"setLocation":"java.lang.String"
	}
}
```
## ListNextSinglePageAsyncVirtualMachineRunCommands parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListNextSinglePageAsyncGalleries parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListByResourceGroupGalleries parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String"
	}
}
```
## ListByGalleryWithServiceResponseAsyncGalleryImages parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setGalleryName":"java.lang.String"
	}
}
```
## BeginCreateOrUpdateVirtualMachineScaleSets parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setParameters-withPlan-withPublisher":"java.lang.String",
		"setParameters-withPlan-withName":"java.lang.String",
		"setParameters-withPlan-withProduct":"java.lang.String",
		"setParameters-withPlan-withPromotionCode":"java.lang.String",
		"setParameters-withPlatformFaultDomainCount":"java.lang.Integer",
		"setParameters-withSku-withName":"java.lang.String",
		"setParameters-withSku-withCapacity":"java.lang.Long",
		"setParameters-withSku-withTier":"java.lang.String",
		"setParameters-withIdentity-withUserAssignedIdentities":{
			"java.lang.String0":"ref1-com.microsoft.azure.management.compute.VirtualMachineScaleSetIdentityUserAssignedIdentitiesValue"
		},
		"setParameters-withZones":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setParameters-withUpgradePolicy-withRollingUpgradePolicy-withMaxBatchInstancePercent":"java.lang.Integer",
		"setParameters-withUpgradePolicy-withRollingUpgradePolicy-withMaxUnhealthyInstancePercent":"java.lang.Integer",
		"setParameters-withUpgradePolicy-withRollingUpgradePolicy-withMaxUnhealthyUpgradedInstancePercent":"java.lang.Integer",
		"setParameters-withUpgradePolicy-withRollingUpgradePolicy-withPauseTimeBetweenBatches":"java.lang.String",
		"setParameters-withUpgradePolicy-withAutomaticOSUpgrade":"java.lang.Boolean",
		"setParameters-withUpgradePolicy-withAutoOSUpgradePolicy-withDisableAutoRollback":"java.lang.Boolean",
		"setParameters-withZoneBalance":"java.lang.Boolean",
		"setParameters-withVirtualMachineProfile-withStorageProfile-withImageReference-withPublisher":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withStorageProfile-withImageReference-withSku":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withStorageProfile-withImageReference-withOffer":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withStorageProfile-withImageReference-withVersion":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withStorageProfile-withImageReference-withId":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withStorageProfile-withOsDisk-withName":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withStorageProfile-withOsDisk-withWriteAcceleratorEnabled":"java.lang.Boolean",
		"setParameters-withVirtualMachineProfile-withStorageProfile-withOsDisk-withImage-withUri":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withStorageProfile-withOsDisk-withVhdContainers":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setParameters-withVirtualMachineProfile-withStorageProfile-withDataDisks":[
			"ref2-com.microsoft.azure.management.compute.VirtualMachineScaleSetDataDisk"
		],
		"setParameters-withVirtualMachineProfile-withOsProfile-withCustomData":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withOsProfile-withWindowsConfiguration-withProvisionVMAgent":"java.lang.Boolean",
		"setParameters-withVirtualMachineProfile-withOsProfile-withWindowsConfiguration-withEnableAutomaticUpdates":"java.lang.Boolean",
		"setParameters-withVirtualMachineProfile-withOsProfile-withWindowsConfiguration-withTimeZone":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withOsProfile-withWindowsConfiguration-withAdditionalUnattendContent":[
			"ref3-com.microsoft.azure.management.compute.AdditionalUnattendContent"
		],
		"setParameters-withVirtualMachineProfile-withOsProfile-withWindowsConfiguration-withWinRM-withListeners":[
			"ref4-com.microsoft.azure.management.compute.WinRMListener"
		],
		"setParameters-withVirtualMachineProfile-withOsProfile-withLinuxConfiguration-withSsh-withPublicKeys":[
			"ref5-com.microsoft.azure.management.compute.SshPublicKey"
		],
		"setParameters-withVirtualMachineProfile-withOsProfile-withLinuxConfiguration-withProvisionVMAgent":"java.lang.Boolean",
		"setParameters-withVirtualMachineProfile-withOsProfile-withLinuxConfiguration-withDisablePasswordAuthentication":"java.lang.Boolean",
		"setParameters-withVirtualMachineProfile-withOsProfile-withSecrets":[
			"ref6-com.microsoft.azure.management.compute.VaultSecretGroup"
		],
		"setParameters-withVirtualMachineProfile-withOsProfile-withAdminUsername":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withOsProfile-withAdminPassword":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withOsProfile-withComputerNamePrefix":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withNetworkInterfaceConfigurations":[
			"ref8-com.microsoft.azure.management.compute.VirtualMachineScaleSetNetworkConfiguration"
		],
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withNetworkInterfaceConfigurations-withIpConfigurations-withApplicationGatewayBackendAddressPools":[
			"ref11-com.microsoft.azure.SubResource"
		],
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withNetworkInterfaceConfigurations-withIpConfigurations-withLoadBalancerBackendAddressPools":[
			"ref12-com.microsoft.azure.SubResource"
		],
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withNetworkInterfaceConfigurations-withIpConfigurations-withLoadBalancerInboundNatPools":[
			"ref13-com.microsoft.azure.SubResource"
		],
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withNetworkInterfaceConfigurations-withIpConfigurations-withApplicationSecurityGroups":[
			"ref14-com.microsoft.azure.SubResource"
		],
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withNetworkInterfaceConfigurations-withIpConfigurations-withId":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withNetworkInterfaceConfigurations-withEnableIPForwarding":"java.lang.Boolean",
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withNetworkInterfaceConfigurations-withId":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withHealthProbe-withId":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withDiagnosticsProfile-withBootDiagnostics-withEnabled":"java.lang.Boolean",
		"setParameters-withVirtualMachineProfile-withDiagnosticsProfile-withBootDiagnostics-withStorageUri":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withLicenseType":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withExtensionProfile-withExtensions":[
			"ref15-com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner"
		],
		"setParameters-withOverprovision":"java.lang.Boolean",
		"setParameters-withSinglePlacementGroup":"java.lang.Boolean",
		"setParameters-withLocation":"java.lang.String",
		"setParameters-withTags":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"setVmScaleSetName":"java.lang.String"
	},
	"ref2-com.microsoft.azure.management.compute.VirtualMachineScaleSetDataDisk":{
		"withName":"java.lang.String",
		"withDiskSizeGB":"java.lang.Integer",
		"withWriteAcceleratorEnabled":"java.lang.Boolean",
		"withLun":"int"
	},
	"ref3-com.microsoft.azure.management.compute.AdditionalUnattendContent":{
		"withContent":"java.lang.String"
	},
	"ref4-com.microsoft.azure.management.compute.WinRMListener":{
		"withCertificateUrl":"java.lang.String"
	},
	"ref5-com.microsoft.azure.management.compute.SshPublicKey":{
		"withPath":"java.lang.String",
		"withKeyData":"java.lang.String"
	},
	"ref6-com.microsoft.azure.management.compute.VaultSecretGroup":{
		"withSourceVault-withId":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withOsProfile-withSecrets-withVaultCertificates":[
			"ref7-com.microsoft.azure.management.compute.VaultCertificate"
		]
	},
	"ref7-com.microsoft.azure.management.compute.VaultCertificate":{
		"withCertificateUrl":"java.lang.String",
		"withCertificateStore":"java.lang.String"
	},
	"ref8-com.microsoft.azure.management.compute.VirtualMachineScaleSetNetworkConfiguration":{
		"withName":"java.lang.String",
		"withPrimary":"java.lang.Boolean",
		"withEnableAcceleratedNetworking":"java.lang.Boolean",
		"withNetworkSecurityGroup-withId":"java.lang.String",
		"withDnsSettings-withDnsServers":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withNetworkInterfaceConfigurations-withIpConfigurations":[
			"ref9-com.microsoft.azure.management.compute.VirtualMachineScaleSetIPConfiguration"
		]
	},
	"ref9-com.microsoft.azure.management.compute.VirtualMachineScaleSetIPConfiguration":{
		"withName":"java.lang.String",
		"withPrimary":"java.lang.Boolean",
		"withSubnet-withId":"java.lang.String",
		"withPublicIPAddressConfiguration-withName":"java.lang.String",
		"withPublicIPAddressConfiguration-withDnsSettings-withDomainNameLabel":"java.lang.String",
		"withPublicIPAddressConfiguration-withIdleTimeoutInMinutes":"java.lang.Integer",
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withNetworkInterfaceConfigurations-withIpConfigurations-withPublicIPAddressConfiguration-withIpTags":[
			"ref10-com.microsoft.azure.management.compute.VirtualMachineScaleSetIpTag"
		]
	},
	"ref10-com.microsoft.azure.management.compute.VirtualMachineScaleSetIpTag":{
		"withIpTagType":"java.lang.String",
		"withTag":"java.lang.String"
	},
	"ref11-com.microsoft.azure.SubResource":{
		"withId":"java.lang.String"
	},
	"ref12-com.microsoft.azure.SubResource":{
		"withId":"java.lang.String"
	},
	"ref13-com.microsoft.azure.SubResource":{
		"withId":"java.lang.String"
	},
	"ref14-com.microsoft.azure.SubResource":{
		"withId":"java.lang.String"
	},
	"ref15-com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner":{
		"withForceUpdateTag":"java.lang.String",
		"withPublisher":"java.lang.String",
		"withTypeHandlerVersion":"java.lang.String",
		"withAutoUpgradeMinorVersion":"java.lang.Boolean",
		"withName":"java.lang.String",
		"withType":"java.lang.String"
	}
}
```
## DeleteAsyncVirtualMachineScaleSetExtensions parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmScaleSetName":"java.lang.String",
		"setVmssExtensionName":"java.lang.String"
	}
}
```
## ListNextGalleries parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## UpdateVirtualMachineScaleSets parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setParameters-withPlan-withPublisher":"java.lang.String",
		"setParameters-withPlan-withName":"java.lang.String",
		"setParameters-withPlan-withProduct":"java.lang.String",
		"setParameters-withPlan-withPromotionCode":"java.lang.String",
		"setParameters-withSku-withName":"java.lang.String",
		"setParameters-withSku-withCapacity":"java.lang.Long",
		"setParameters-withSku-withTier":"java.lang.String",
		"setParameters-withIdentity-withUserAssignedIdentities":{
			"java.lang.String0":"ref1-com.microsoft.azure.management.compute.VirtualMachineScaleSetIdentityUserAssignedIdentitiesValue"
		},
		"setParameters-withUpgradePolicy-withRollingUpgradePolicy-withMaxBatchInstancePercent":"java.lang.Integer",
		"setParameters-withUpgradePolicy-withRollingUpgradePolicy-withMaxUnhealthyInstancePercent":"java.lang.Integer",
		"setParameters-withUpgradePolicy-withRollingUpgradePolicy-withMaxUnhealthyUpgradedInstancePercent":"java.lang.Integer",
		"setParameters-withUpgradePolicy-withRollingUpgradePolicy-withPauseTimeBetweenBatches":"java.lang.String",
		"setParameters-withUpgradePolicy-withAutomaticOSUpgrade":"java.lang.Boolean",
		"setParameters-withUpgradePolicy-withAutoOSUpgradePolicy-withDisableAutoRollback":"java.lang.Boolean",
		"setParameters-withVirtualMachineProfile-withStorageProfile-withImageReference-withPublisher":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withStorageProfile-withImageReference-withSku":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withStorageProfile-withImageReference-withOffer":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withStorageProfile-withImageReference-withVersion":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withStorageProfile-withImageReference-withId":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withStorageProfile-withOsDisk-withWriteAcceleratorEnabled":"java.lang.Boolean",
		"setParameters-withVirtualMachineProfile-withStorageProfile-withOsDisk-withImage-withUri":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withStorageProfile-withOsDisk-withVhdContainers":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setParameters-withVirtualMachineProfile-withStorageProfile-withDataDisks":[
			"ref2-com.microsoft.azure.management.compute.VirtualMachineScaleSetDataDisk"
		],
		"setParameters-withVirtualMachineProfile-withOsProfile-withCustomData":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withOsProfile-withWindowsConfiguration-withProvisionVMAgent":"java.lang.Boolean",
		"setParameters-withVirtualMachineProfile-withOsProfile-withWindowsConfiguration-withEnableAutomaticUpdates":"java.lang.Boolean",
		"setParameters-withVirtualMachineProfile-withOsProfile-withWindowsConfiguration-withTimeZone":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withOsProfile-withWindowsConfiguration-withAdditionalUnattendContent":[
			"ref3-com.microsoft.azure.management.compute.AdditionalUnattendContent"
		],
		"setParameters-withVirtualMachineProfile-withOsProfile-withWindowsConfiguration-withWinRM-withListeners":[
			"ref4-com.microsoft.azure.management.compute.WinRMListener"
		],
		"setParameters-withVirtualMachineProfile-withOsProfile-withLinuxConfiguration-withSsh-withPublicKeys":[
			"ref5-com.microsoft.azure.management.compute.SshPublicKey"
		],
		"setParameters-withVirtualMachineProfile-withOsProfile-withLinuxConfiguration-withProvisionVMAgent":"java.lang.Boolean",
		"setParameters-withVirtualMachineProfile-withOsProfile-withLinuxConfiguration-withDisablePasswordAuthentication":"java.lang.Boolean",
		"setParameters-withVirtualMachineProfile-withOsProfile-withSecrets":[
			"ref6-com.microsoft.azure.management.compute.VaultSecretGroup"
		],
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withNetworkInterfaceConfigurations":[
			"ref8-com.microsoft.azure.management.compute.VirtualMachineScaleSetUpdateNetworkConfiguration"
		],
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withNetworkInterfaceConfigurations-withIpConfigurations-withLoadBalancerBackendAddressPools":[
			"ref11-com.microsoft.azure.SubResource"
		],
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withNetworkInterfaceConfigurations-withIpConfigurations-withLoadBalancerInboundNatPools":[
			"ref12-com.microsoft.azure.SubResource"
		],
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withNetworkInterfaceConfigurations-withIpConfigurations-withApplicationSecurityGroups":[
			"ref13-com.microsoft.azure.SubResource"
		],
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withNetworkInterfaceConfigurations-withIpConfigurations-withId":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withNetworkInterfaceConfigurations-withEnableIPForwarding":"java.lang.Boolean",
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withNetworkInterfaceConfigurations-withId":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withDiagnosticsProfile-withBootDiagnostics-withEnabled":"java.lang.Boolean",
		"setParameters-withVirtualMachineProfile-withDiagnosticsProfile-withBootDiagnostics-withStorageUri":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withLicenseType":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withExtensionProfile-withExtensions":[
			"ref14-com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner"
		],
		"setParameters-withOverprovision":"java.lang.Boolean",
		"setParameters-withSinglePlacementGroup":"java.lang.Boolean",
		"setParameters-withTags":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"setVmScaleSetName":"java.lang.String"
	},
	"ref2-com.microsoft.azure.management.compute.VirtualMachineScaleSetDataDisk":{
		"withName":"java.lang.String",
		"withDiskSizeGB":"java.lang.Integer",
		"withWriteAcceleratorEnabled":"java.lang.Boolean",
		"withLun":"int"
	},
	"ref3-com.microsoft.azure.management.compute.AdditionalUnattendContent":{
		"withContent":"java.lang.String"
	},
	"ref4-com.microsoft.azure.management.compute.WinRMListener":{
		"withCertificateUrl":"java.lang.String"
	},
	"ref5-com.microsoft.azure.management.compute.SshPublicKey":{
		"withPath":"java.lang.String",
		"withKeyData":"java.lang.String"
	},
	"ref6-com.microsoft.azure.management.compute.VaultSecretGroup":{
		"withSourceVault-withId":"java.lang.String",
		"setParameters-withVirtualMachineProfile-withOsProfile-withSecrets-withVaultCertificates":[
			"ref7-com.microsoft.azure.management.compute.VaultCertificate"
		]
	},
	"ref7-com.microsoft.azure.management.compute.VaultCertificate":{
		"withCertificateUrl":"java.lang.String",
		"withCertificateStore":"java.lang.String"
	},
	"ref8-com.microsoft.azure.management.compute.VirtualMachineScaleSetUpdateNetworkConfiguration":{
		"withName":"java.lang.String",
		"withPrimary":"java.lang.Boolean",
		"withEnableAcceleratedNetworking":"java.lang.Boolean",
		"withNetworkSecurityGroup-withId":"java.lang.String",
		"withDnsSettings-withDnsServers":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withNetworkInterfaceConfigurations-withIpConfigurations":[
			"ref9-com.microsoft.azure.management.compute.VirtualMachineScaleSetUpdateIPConfiguration"
		]
	},
	"ref9-com.microsoft.azure.management.compute.VirtualMachineScaleSetUpdateIPConfiguration":{
		"withName":"java.lang.String",
		"withPrimary":"java.lang.Boolean",
		"withSubnet-withId":"java.lang.String",
		"withPublicIPAddressConfiguration-withName":"java.lang.String",
		"withPublicIPAddressConfiguration-withDnsSettings-withDomainNameLabel":"java.lang.String",
		"withPublicIPAddressConfiguration-withIdleTimeoutInMinutes":"java.lang.Integer",
		"setParameters-withVirtualMachineProfile-withNetworkProfile-withNetworkInterfaceConfigurations-withIpConfigurations-withApplicationGatewayBackendAddressPools":[
			"ref10-com.microsoft.azure.SubResource"
		]
	},
	"ref10-com.microsoft.azure.SubResource":{
		"withId":"java.lang.String"
	},
	"ref11-com.microsoft.azure.SubResource":{
		"withId":"java.lang.String"
	},
	"ref12-com.microsoft.azure.SubResource":{
		"withId":"java.lang.String"
	},
	"ref13-com.microsoft.azure.SubResource":{
		"withId":"java.lang.String"
	},
	"ref14-com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner":{
		"withForceUpdateTag":"java.lang.String",
		"withPublisher":"java.lang.String",
		"withTypeHandlerVersion":"java.lang.String",
		"withAutoUpgradeMinorVersion":"java.lang.Boolean",
		"withName":"java.lang.String",
		"withType":"java.lang.String"
	}
}
```
## ListByResourceGroupNextWithServiceResponseAsyncSnapshots parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## CreateOrUpdateVirtualMachineExtensions parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmName":"java.lang.String",
		"setVmExtensionName":"java.lang.String",
		"setExtensionParameters-withForceUpdateTag":"java.lang.String",
		"setExtensionParameters-withPublisher":"java.lang.String",
		"setExtensionParameters-withVirtualMachineExtensionType":"java.lang.String",
		"setExtensionParameters-withTypeHandlerVersion":"java.lang.String",
		"setExtensionParameters-withAutoUpgradeMinorVersion":"java.lang.Boolean",
		"setExtensionParameters-withInstanceView-withTypeHandlerVersion":"java.lang.String",
		"setExtensionParameters-withInstanceView-withName":"java.lang.String",
		"setExtensionParameters-withInstanceView-withStatuses":[
			"ref1-com.microsoft.azure.management.compute.InstanceViewStatus"
		],
		"setExtensionParameters-withInstanceView-withType":"java.lang.String",
		"setExtensionParameters-withInstanceView-withSubstatuses":[
			"ref2-com.microsoft.azure.management.compute.InstanceViewStatus"
		],
		"setExtensionParameters-withLocation":"java.lang.String",
		"setExtensionParameters-withTags":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		}
	},
	"ref1-com.microsoft.azure.management.compute.InstanceViewStatus":{
		"withTime-withMillis":"long",
		"withTime-withEra":"int",
		"withTime-withCenturyOfEra":"int",
		"withTime-withYearOfEra":"int",
		"withTime-withYearOfCentury":"int",
		"withTime-withYear":"int",
		"withTime-withWeekyear":"int",
		"withTime-withMonthOfYear":"int",
		"withTime-withWeekOfWeekyear":"int",
		"withTime-withDayOfYear":"int",
		"withTime-withDayOfMonth":"int",
		"withTime-withDayOfWeek":"int",
		"withTime-withHourOfDay":"int",
		"withTime-withMinuteOfHour":"int",
		"withTime-withSecondOfMinute":"int",
		"withTime-withMillisOfSecond":"int",
		"withTime-withMillisOfDay":"int",
		"withCode":"java.lang.String",
		"withDisplayStatus":"java.lang.String",
		"withMessage":"java.lang.String"
	},
	"ref2-com.microsoft.azure.management.compute.InstanceViewStatus":{
		"withTime-withMillis":"long",
		"withTime-withEra":"int",
		"withTime-withCenturyOfEra":"int",
		"withTime-withYearOfEra":"int",
		"withTime-withYearOfCentury":"int",
		"withTime-withYear":"int",
		"withTime-withWeekyear":"int",
		"withTime-withMonthOfYear":"int",
		"withTime-withWeekOfWeekyear":"int",
		"withTime-withDayOfYear":"int",
		"withTime-withDayOfMonth":"int",
		"withTime-withDayOfWeek":"int",
		"withTime-withHourOfDay":"int",
		"withTime-withMinuteOfHour":"int",
		"withTime-withSecondOfMinute":"int",
		"withTime-withMillisOfSecond":"int",
		"withTime-withMillisOfDay":"int",
		"withCode":"java.lang.String",
		"withDisplayStatus":"java.lang.String",
		"withMessage":"java.lang.String"
	}
}
```
## CreateOrUpdateGalleryImageVersions parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setGalleryName":"java.lang.String",
		"setGalleryImageVersion-withPublishingProfile-withEndOfLifeDate-withMillis":"long",
		"setGalleryImageVersion-withPublishingProfile-withEndOfLifeDate-withEra":"int",
		"setGalleryImageVersion-withPublishingProfile-withEndOfLifeDate-withCenturyOfEra":"int",
		"setGalleryImageVersion-withPublishingProfile-withEndOfLifeDate-withYearOfEra":"int",
		"setGalleryImageVersion-withPublishingProfile-withEndOfLifeDate-withYearOfCentury":"int",
		"setGalleryImageVersion-withPublishingProfile-withEndOfLifeDate-withYear":"int",
		"setGalleryImageVersion-withPublishingProfile-withEndOfLifeDate-withWeekyear":"int",
		"setGalleryImageVersion-withPublishingProfile-withEndOfLifeDate-withMonthOfYear":"int",
		"setGalleryImageVersion-withPublishingProfile-withEndOfLifeDate-withWeekOfWeekyear":"int",
		"setGalleryImageVersion-withPublishingProfile-withEndOfLifeDate-withDayOfYear":"int",
		"setGalleryImageVersion-withPublishingProfile-withEndOfLifeDate-withDayOfMonth":"int",
		"setGalleryImageVersion-withPublishingProfile-withEndOfLifeDate-withDayOfWeek":"int",
		"setGalleryImageVersion-withPublishingProfile-withEndOfLifeDate-withHourOfDay":"int",
		"setGalleryImageVersion-withPublishingProfile-withEndOfLifeDate-withMinuteOfHour":"int",
		"setGalleryImageVersion-withPublishingProfile-withEndOfLifeDate-withSecondOfMinute":"int",
		"setGalleryImageVersion-withPublishingProfile-withEndOfLifeDate-withMillisOfSecond":"int",
		"setGalleryImageVersion-withPublishingProfile-withEndOfLifeDate-withMillisOfDay":"int",
		"setGalleryImageVersion-withPublishingProfile-withReplicaCount":"java.lang.Integer",
		"setGalleryImageVersion-withPublishingProfile-withExcludeFromLatest":"java.lang.Boolean",
		"setGalleryImageVersion-withPublishingProfile-withTargetRegions":[
			"ref1-com.microsoft.azure.management.compute.TargetRegion"
		],
		"setGalleryImageVersion-withPublishingProfile-withSource-withManagedImage-withId":"java.lang.String",
		"setGalleryImageVersion-withLocation":"java.lang.String",
		"setGalleryImageVersion-withTags":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"setGalleryImageVersionName":"java.lang.String",
		"setGalleryImageName":"java.lang.String"
	},
	"ref1-com.microsoft.azure.management.compute.TargetRegion":{
		"withName":"java.lang.String",
		"withRegionalReplicaCount":"java.lang.Integer"
	}
}
```
## ListAsyncVirtualMachineScaleSetExtensions parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmScaleSetName":"java.lang.String"
	}
}
```
## ListByResourceGroupWithServiceResponseAsyncSnapshots parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String"
	}
}
```
## ListSinglePageAsyncVirtualMachineRunCommands parameterss:

```
{
	"main":{
		"setLocation":"java.lang.String"
	}
}
```
## ListWithServiceResponseAsyncVirtualMachines parameterss:

```
{}
```
## ListNextWithServiceResponseAsyncVirtualMachineScaleSets parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListNextWithServiceResponseAsyncDisks parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListAsyncVirtualMachineSizes parameterss:

```
{
	"main":{
		"setLocation":"java.lang.String"
	}
}
```
## ListNextAsyncVirtualMachineScaleSets parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## GetByResourceGroupGalleries parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setGalleryName":"java.lang.String"
	}
}
```
## ListNextSinglePageAsyncVirtualMachineScaleSetVMs parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListByResourceGroupSinglePageAsyncDisks parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String"
	}
}
```
## ListByResourceGroupNextSinglePageAsyncGalleries parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListByGalleryImageGalleryImageVersions parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setGalleryName":"java.lang.String",
		"setGalleryImageName":"java.lang.String"
	}
}
```
## ListByGalleryNextWithServiceResponseAsyncGalleryImages parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## DeleteAsyncVirtualMachines parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmName":"java.lang.String"
	}
}
```
## ListByResourceGroupNextDisks parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListByResourceGroupAsyncGalleries parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String"
	}
}
```
## ListAsyncSnapshots parameterss:

```
{}
```
## DeleteAsyncAvailabilitySets parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setAvailabilitySetName":"java.lang.String"
	}
}
```
## ListWithServiceResponseAsyncVirtualMachineExtensions parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmName":"java.lang.String"
	}
}
```
## ListNextSinglePageAsyncUsages parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## GetVirtualMachineScaleSetVMs parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmScaleSetName":"java.lang.String",
		"setInstanceId":"java.lang.String"
	}
}
```
## ListAsyncOperations parameterss:

```
{}
```
## ListByResourceGroupNextImages parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListByResourceGroupNextWithServiceResponseAsyncDisks parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListByResourceGroupAsyncSnapshots parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String"
	}
}
```
## GetByResourceGroupDisks parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setDiskName":"java.lang.String"
	}
}
```
## DeleteVirtualMachines parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmName":"java.lang.String"
	}
}
```
## ListByResourceGroupNextAsyncVirtualMachines parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListByResourceGroupNextAsyncVirtualMachineScaleSets parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListSinglePageAsyncVirtualMachineScaleSetVMs parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVirtualMachineScaleSetName":"java.lang.String"
	}
}
```
## ListGalleries parameterss:

```
{}
```
## ListVirtualMachineImages parameterss:

```
{
	"main":{
		"setLocation":"java.lang.String",
		"setPublisherName":"java.lang.String",
		"setOffer":"java.lang.String",
		"setSkus":"java.lang.String"
	}
}
```
## ListByResourceGroupWithServiceResponseAsyncVirtualMachines parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String"
	}
}
```
## BeginGrantAccessSnapshots parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setSnapshotName":"java.lang.String",
		"setGrantAccessData-withDurationInSeconds":"int"
	}
}
```
## ListWithServiceResponseAsyncVirtualMachineScaleSets parameterss:

```
{}
```
## ListSkusNextVirtualMachineScaleSets parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListByGalleryImageNextAsyncGalleryImageVersions parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## DeleteImages parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setImageName":"java.lang.String"
	}
}
```
## ListByGalleryNextGalleryImages parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## BeginUpdateVirtualMachines parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmName":"java.lang.String",
		"setParameters-withPlan-withPublisher":"java.lang.String",
		"setParameters-withPlan-withName":"java.lang.String",
		"setParameters-withPlan-withProduct":"java.lang.String",
		"setParameters-withPlan-withPromotionCode":"java.lang.String",
		"setParameters-withStorageProfile-withImageReference-withPublisher":"java.lang.String",
		"setParameters-withStorageProfile-withImageReference-withSku":"java.lang.String",
		"setParameters-withStorageProfile-withImageReference-withOffer":"java.lang.String",
		"setParameters-withStorageProfile-withImageReference-withVersion":"java.lang.String",
		"setParameters-withStorageProfile-withImageReference-withId":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withName":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withDiskSizeGB":"java.lang.Integer",
		"setParameters-withStorageProfile-withOsDisk-withEncryptionSettings-withEnabled":"java.lang.Boolean",
		"setParameters-withStorageProfile-withOsDisk-withEncryptionSettings-withDiskEncryptionKey-withSourceVault-withId":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withEncryptionSettings-withDiskEncryptionKey-withSecretUrl":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withEncryptionSettings-withKeyEncryptionKey-withSourceVault-withId":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withEncryptionSettings-withKeyEncryptionKey-withKeyUrl":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withWriteAcceleratorEnabled":"java.lang.Boolean",
		"setParameters-withStorageProfile-withOsDisk-withImage-withUri":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withManagedDisk-withId":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withVhd-withUri":"java.lang.String",
		"setParameters-withStorageProfile-withDataDisks":[
			"ref1-com.microsoft.azure.management.compute.DataDisk"
		],
		"setParameters-withOsProfile-withCustomData":"java.lang.String",
		"setParameters-withOsProfile-withWindowsConfiguration-withProvisionVMAgent":"java.lang.Boolean",
		"setParameters-withOsProfile-withWindowsConfiguration-withEnableAutomaticUpdates":"java.lang.Boolean",
		"setParameters-withOsProfile-withWindowsConfiguration-withTimeZone":"java.lang.String",
		"setParameters-withOsProfile-withWindowsConfiguration-withAdditionalUnattendContent":[
			"ref2-com.microsoft.azure.management.compute.AdditionalUnattendContent"
		],
		"setParameters-withOsProfile-withWindowsConfiguration-withWinRM-withListeners":[
			"ref3-com.microsoft.azure.management.compute.WinRMListener"
		],
		"setParameters-withOsProfile-withLinuxConfiguration-withSsh-withPublicKeys":[
			"ref4-com.microsoft.azure.management.compute.SshPublicKey"
		],
		"setParameters-withOsProfile-withLinuxConfiguration-withProvisionVMAgent":"java.lang.Boolean",
		"setParameters-withOsProfile-withLinuxConfiguration-withDisablePasswordAuthentication":"java.lang.Boolean",
		"setParameters-withOsProfile-withSecrets":[
			"ref5-com.microsoft.azure.management.compute.VaultSecretGroup"
		],
		"setParameters-withOsProfile-withAdminUsername":"java.lang.String",
		"setParameters-withOsProfile-withAdminPassword":"java.lang.String",
		"setParameters-withOsProfile-withAllowExtensionOperations":"java.lang.Boolean",
		"setParameters-withOsProfile-withComputerName":"java.lang.String",
		"setParameters-withNetworkProfile-withNetworkInterfaces":[
			"ref7-com.microsoft.azure.management.compute.NetworkInterfaceReference"
		],
		"setParameters-withDiagnosticsProfile-withBootDiagnostics-withEnabled":"java.lang.Boolean",
		"setParameters-withDiagnosticsProfile-withBootDiagnostics-withStorageUri":"java.lang.String",
		"setParameters-withAvailabilitySet-withId":"java.lang.String",
		"setParameters-withLicenseType":"java.lang.String",
		"setParameters-withIdentity-withUserAssignedIdentities":{
			"java.lang.String0":"ref8-com.microsoft.azure.management.compute.VirtualMachineIdentityUserAssignedIdentitiesValue"
		},
		"setParameters-withZones":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setParameters-withTags":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		}
	},
	"ref1-com.microsoft.azure.management.compute.DataDisk":{
		"withName":"java.lang.String",
		"withDiskSizeGB":"java.lang.Integer",
		"withWriteAcceleratorEnabled":"java.lang.Boolean",
		"withImage-withUri":"java.lang.String",
		"withManagedDisk-withId":"java.lang.String",
		"withLun":"int",
		"withVhd-withUri":"java.lang.String"
	},
	"ref2-com.microsoft.azure.management.compute.AdditionalUnattendContent":{
		"withContent":"java.lang.String"
	},
	"ref3-com.microsoft.azure.management.compute.WinRMListener":{
		"withCertificateUrl":"java.lang.String"
	},
	"ref4-com.microsoft.azure.management.compute.SshPublicKey":{
		"withPath":"java.lang.String",
		"withKeyData":"java.lang.String"
	},
	"ref5-com.microsoft.azure.management.compute.VaultSecretGroup":{
		"withSourceVault-withId":"java.lang.String",
		"setParameters-withOsProfile-withSecrets-withVaultCertificates":[
			"ref6-com.microsoft.azure.management.compute.VaultCertificate"
		]
	},
	"ref6-com.microsoft.azure.management.compute.VaultCertificate":{
		"withCertificateUrl":"java.lang.String",
		"withCertificateStore":"java.lang.String"
	},
	"ref7-com.microsoft.azure.management.compute.NetworkInterfaceReference":{
		"withPrimary":"java.lang.Boolean",
		"withId":"java.lang.String"
	}
}
```
## ListNextWithServiceResponseAsyncGalleries parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListByResourceGroupSinglePageAsyncGalleries parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String"
	}
}
```
## DeleteInstancesWithServiceResponseAsyncVirtualMachineScaleSets parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setInstanceIds":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setVmScaleSetName":"java.lang.String"
	}
}
```
## ListWithServiceResponseAsyncUsages parameterss:

```
{
	"main":{
		"setLocation":"java.lang.String"
	}
}
```
## ListTypesWithServiceResponseAsyncVirtualMachineExtensionImages parameterss:

```
{
	"main":{
		"setLocation":"java.lang.String",
		"setPublisherName":"java.lang.String"
	}
}
```
## ListWithServiceResponseAsyncGalleries parameterss:

```
{}
```
## ListByResourceGroupNextSnapshots parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListByResourceGroupVirtualMachineScaleSets parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String"
	}
}
```
## DeleteWithServiceResponseAsyncVirtualMachineScaleSets parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmScaleSetName":"java.lang.String"
	}
}
```
## ListSkusSinglePageAsyncVirtualMachineScaleSets parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmScaleSetName":"java.lang.String"
	}
}
```
## DeleteInstancesAsyncVirtualMachineScaleSets parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setInstanceIds":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setVmScaleSetName":"java.lang.String"
	}
}
```
## ListResourceSkus parameterss:

```
{}
```
## ListVirtualMachineSizes parameterss:

```
{
	"main":{
		"setLocation":"java.lang.String"
	}
}
```
## ListSinglePageAsyncVirtualMachineScaleSetExtensions parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmScaleSetName":"java.lang.String"
	}
}
```
## ListVersionsAsyncVirtualMachineExtensionImages parameterss:

```
{
	"main":{
		"setLocation":"java.lang.String",
		"setType":"java.lang.String",
		"setPublisherName":"java.lang.String"
	}
}
```
## ListSkusWithServiceResponseAsyncVirtualMachineScaleSets parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmScaleSetName":"java.lang.String"
	}
}
```
## DeleteAsyncVirtualMachineExtensions parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmName":"java.lang.String",
		"setVmExtensionName":"java.lang.String"
	}
}
```
## DeleteWithServiceResponseAsyncVirtualMachineExtensions parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmName":"java.lang.String",
		"setVmExtensionName":"java.lang.String"
	}
}
```
## ListAsyncVirtualMachineScaleSetVMs parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVirtualMachineScaleSetName":"java.lang.String"
	}
}
```
## GetVirtualMachineExtensions parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmName":"java.lang.String",
		"setVmExtensionName":"java.lang.String"
	}
}
```
## ListByResourceGroupNextVirtualMachineScaleSets parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## DeleteWithServiceResponseAsyncVirtualMachines parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmName":"java.lang.String"
	}
}
```
## GetInstanceViewVirtualMachineScaleSets parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmScaleSetName":"java.lang.String"
	}
}
```
## ListByResourceGroupNextAsyncImages parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListAsyncVirtualMachines parameterss:

```
{}
```
## DeleteAsyncGalleries parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setGalleryName":"java.lang.String"
	}
}
```
## BeginCreateOrUpdateGalleries parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setGallery-withDescription":"java.lang.String",
		"setGallery-withLocation":"java.lang.String",
		"setGallery-withTags":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"setGalleryName":"java.lang.String"
	}
}
```
## ListNextWithServiceResponseAsyncVirtualMachineScaleSetVMs parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListByGalleryImageNextSinglePageAsyncGalleryImageVersions parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## GetByResourceGroupAvailabilitySets parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setAvailabilitySetName":"java.lang.String"
	}
}
```
## ListWithServiceResponseAsyncImages parameterss:

```
{}
```
## DeleteAvailabilitySets parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setAvailabilitySetName":"java.lang.String"
	}
}
```
## DeleteWithServiceResponseAsyncAvailabilitySets parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setAvailabilitySetName":"java.lang.String"
	}
}
```
## ListSkusAsyncVirtualMachineScaleSets parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmScaleSetName":"java.lang.String"
	}
}
```
## CaptureVirtualMachines parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmName":"java.lang.String",
		"setParameters-withOverwriteVhds":"boolean",
		"setParameters-withDestinationContainerName":"java.lang.String",
		"setParameters-withVhdPrefix":"java.lang.String"
	}
}
```
## ListNextAsyncVirtualMachineScaleSetVMs parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListNextWithServiceResponseAsyncSnapshots parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## BeginUpdateSnapshots parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setSnapshotName":"java.lang.String",
		"setSnapshot-withTags":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"setSnapshot-withDiskSizeGB":"java.lang.Integer",
		"setSnapshot-withEncryptionSettings-withEnabled":"java.lang.Boolean",
		"setSnapshot-withEncryptionSettings-withDiskEncryptionKey-withSourceVault-withId":"java.lang.String",
		"setSnapshot-withEncryptionSettings-withDiskEncryptionKey-withSecretUrl":"java.lang.String",
		"setSnapshot-withEncryptionSettings-withKeyEncryptionKey-withSourceVault-withId":"java.lang.String",
		"setSnapshot-withEncryptionSettings-withKeyEncryptionKey-withKeyUrl":"java.lang.String"
	}
}
```
## BeginGrantAccessDisks parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setDiskName":"java.lang.String",
		"setGrantAccessData-withDurationInSeconds":"int"
	}
}
```
## ListByGalleryImageSinglePageAsyncGalleryImageVersions parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setGalleryName":"java.lang.String",
		"setGalleryImageName":"java.lang.String"
	}
}
```
## ListVersionsWithServiceResponseAsyncVirtualMachineExtensionImages parameterss:

```
{
	"main":{
		"setLocation":"java.lang.String",
		"setType":"java.lang.String",
		"setPublisherName":"java.lang.String"
	}
}
```
## BeginCreateOrUpdateVirtualMachineExtensions parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmName":"java.lang.String",
		"setVmExtensionName":"java.lang.String",
		"setExtensionParameters-withForceUpdateTag":"java.lang.String",
		"setExtensionParameters-withPublisher":"java.lang.String",
		"setExtensionParameters-withVirtualMachineExtensionType":"java.lang.String",
		"setExtensionParameters-withTypeHandlerVersion":"java.lang.String",
		"setExtensionParameters-withAutoUpgradeMinorVersion":"java.lang.Boolean",
		"setExtensionParameters-withInstanceView-withTypeHandlerVersion":"java.lang.String",
		"setExtensionParameters-withInstanceView-withName":"java.lang.String",
		"setExtensionParameters-withInstanceView-withStatuses":[
			"ref1-com.microsoft.azure.management.compute.InstanceViewStatus"
		],
		"setExtensionParameters-withInstanceView-withType":"java.lang.String",
		"setExtensionParameters-withInstanceView-withSubstatuses":[
			"ref2-com.microsoft.azure.management.compute.InstanceViewStatus"
		],
		"setExtensionParameters-withLocation":"java.lang.String",
		"setExtensionParameters-withTags":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		}
	},
	"ref1-com.microsoft.azure.management.compute.InstanceViewStatus":{
		"withTime-withMillis":"long",
		"withTime-withEra":"int",
		"withTime-withCenturyOfEra":"int",
		"withTime-withYearOfEra":"int",
		"withTime-withYearOfCentury":"int",
		"withTime-withYear":"int",
		"withTime-withWeekyear":"int",
		"withTime-withMonthOfYear":"int",
		"withTime-withWeekOfWeekyear":"int",
		"withTime-withDayOfYear":"int",
		"withTime-withDayOfMonth":"int",
		"withTime-withDayOfWeek":"int",
		"withTime-withHourOfDay":"int",
		"withTime-withMinuteOfHour":"int",
		"withTime-withSecondOfMinute":"int",
		"withTime-withMillisOfSecond":"int",
		"withTime-withMillisOfDay":"int",
		"withCode":"java.lang.String",
		"withDisplayStatus":"java.lang.String",
		"withMessage":"java.lang.String"
	},
	"ref2-com.microsoft.azure.management.compute.InstanceViewStatus":{
		"withTime-withMillis":"long",
		"withTime-withEra":"int",
		"withTime-withCenturyOfEra":"int",
		"withTime-withYearOfEra":"int",
		"withTime-withYearOfCentury":"int",
		"withTime-withYear":"int",
		"withTime-withWeekyear":"int",
		"withTime-withMonthOfYear":"int",
		"withTime-withWeekOfWeekyear":"int",
		"withTime-withDayOfYear":"int",
		"withTime-withDayOfMonth":"int",
		"withTime-withDayOfWeek":"int",
		"withTime-withHourOfDay":"int",
		"withTime-withMinuteOfHour":"int",
		"withTime-withSecondOfMinute":"int",
		"withTime-withMillisOfSecond":"int",
		"withTime-withMillisOfDay":"int",
		"withCode":"java.lang.String",
		"withDisplayStatus":"java.lang.String",
		"withMessage":"java.lang.String"
	}
}
```
## ListNextAsyncVirtualMachineScaleSetExtensions parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## BeginExportThrottledRequestsLogAnalytics parameterss:

```
{
	"main":{
		"setLocation":"java.lang.String",
		"setParameters-withBlobContainerSasUri":"java.lang.String",
		"setParameters-withFromTime-withMillis":"long",
		"setParameters-withFromTime-withEra":"int",
		"setParameters-withFromTime-withCenturyOfEra":"int",
		"setParameters-withFromTime-withYearOfEra":"int",
		"setParameters-withFromTime-withYearOfCentury":"int",
		"setParameters-withFromTime-withYear":"int",
		"setParameters-withFromTime-withWeekyear":"int",
		"setParameters-withFromTime-withMonthOfYear":"int",
		"setParameters-withFromTime-withWeekOfWeekyear":"int",
		"setParameters-withFromTime-withDayOfYear":"int",
		"setParameters-withFromTime-withDayOfMonth":"int",
		"setParameters-withFromTime-withDayOfWeek":"int",
		"setParameters-withFromTime-withHourOfDay":"int",
		"setParameters-withFromTime-withMinuteOfHour":"int",
		"setParameters-withFromTime-withSecondOfMinute":"int",
		"setParameters-withFromTime-withMillisOfSecond":"int",
		"setParameters-withFromTime-withMillisOfDay":"int",
		"setParameters-withToTime-withMillis":"long",
		"setParameters-withToTime-withEra":"int",
		"setParameters-withToTime-withCenturyOfEra":"int",
		"setParameters-withToTime-withYearOfEra":"int",
		"setParameters-withToTime-withYearOfCentury":"int",
		"setParameters-withToTime-withYear":"int",
		"setParameters-withToTime-withWeekyear":"int",
		"setParameters-withToTime-withMonthOfYear":"int",
		"setParameters-withToTime-withWeekOfWeekyear":"int",
		"setParameters-withToTime-withDayOfYear":"int",
		"setParameters-withToTime-withDayOfMonth":"int",
		"setParameters-withToTime-withDayOfWeek":"int",
		"setParameters-withToTime-withHourOfDay":"int",
		"setParameters-withToTime-withMinuteOfHour":"int",
		"setParameters-withToTime-withSecondOfMinute":"int",
		"setParameters-withToTime-withMillisOfSecond":"int",
		"setParameters-withToTime-withMillisOfDay":"int",
		"setParameters-withGroupByThrottlePolicy":"java.lang.Boolean",
		"setParameters-withGroupByOperationName":"java.lang.Boolean",
		"setParameters-withGroupByResourceName":"java.lang.Boolean"
	}
}
```
## ListNextDisks parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## GetVirtualMachineExtensionImages parameterss:

```
{
	"main":{
		"setVersion":"java.lang.String",
		"setLocation":"java.lang.String",
		"setType":"java.lang.String",
		"setPublisherName":"java.lang.String"
	}
}
```
## ListSinglePageAsyncVirtualMachineScaleSets parameterss:

```
{}
```
## GrantAccessSnapshots parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setSnapshotName":"java.lang.String",
		"setGrantAccessData-withDurationInSeconds":"int"
	}
}
```
## ListNextWithServiceResponseAsyncUsages parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListNextAsyncGalleries parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## DeleteAsyncDisks parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setDiskName":"java.lang.String"
	}
}
```
## ListNextWithServiceResponseAsyncVirtualMachineScaleSetExtensions parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListSkusNextSinglePageAsyncVirtualMachineScaleSets parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListByGalleryNextAsyncGalleryImages parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## BeginCreateOrUpdateDisks parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setDisk-withZones":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setDisk-withCreationData-withImageReference-withId":"java.lang.String",
		"setDisk-withCreationData-withImageReference-withLun":"java.lang.Integer",
		"setDisk-withCreationData-withStorageAccountId":"java.lang.String",
		"setDisk-withCreationData-withSourceUri":"java.lang.String",
		"setDisk-withCreationData-withSourceResourceId":"java.lang.String",
		"setDisk-withDiskSizeGB":"java.lang.Integer",
		"setDisk-withEncryptionSettings-withEnabled":"java.lang.Boolean",
		"setDisk-withEncryptionSettings-withDiskEncryptionKey-withSourceVault-withId":"java.lang.String",
		"setDisk-withEncryptionSettings-withDiskEncryptionKey-withSecretUrl":"java.lang.String",
		"setDisk-withEncryptionSettings-withKeyEncryptionKey-withSourceVault-withId":"java.lang.String",
		"setDisk-withEncryptionSettings-withKeyEncryptionKey-withKeyUrl":"java.lang.String",
		"setDisk-withLocation":"java.lang.String",
		"setDisk-withTags":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"setDiskName":"java.lang.String"
	}
}
```
## ListSkusNextWithServiceResponseAsyncVirtualMachineScaleSets parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListNextWithServiceResponseAsyncResourceSkus parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListNextVirtualMachines parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListNextAsyncSnapshots parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListWithServiceResponseAsyncVirtualMachineImages parameterss:

```
{
	"main":{
		"setLocation":"java.lang.String",
		"setPublisherName":"java.lang.String",
		"setOffer":"java.lang.String",
		"setSkus":"java.lang.String"
	}
}
```
## ListByResourceGroupNextWithServiceResponseAsyncImages parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListSinglePageAsyncDisks parameterss:

```
{}
```
## ListByResourceGroupSinglePageAsyncVirtualMachines parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String"
	}
}
```
## ListByResourceGroupNextAsyncDisks parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListByResourceGroupAsyncAvailabilitySets parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String"
	}
}
```
## GrantAccessDisks parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setDiskName":"java.lang.String",
		"setGrantAccessData-withDurationInSeconds":"int"
	}
}
```
## ListAsyncGalleries parameterss:

```
{}
```
## CreateOrUpdateGalleryImages parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setGalleryName":"java.lang.String",
		"setGalleryImage-withDescription":"java.lang.String",
		"setGalleryImage-withIdentifier-withPublisher":"java.lang.String",
		"setGalleryImage-withIdentifier-withSku":"java.lang.String",
		"setGalleryImage-withIdentifier-withOffer":"java.lang.String",
		"setGalleryImage-withEula":"java.lang.String",
		"setGalleryImage-withPrivacyStatementUri":"java.lang.String",
		"setGalleryImage-withReleaseNoteUri":"java.lang.String",
		"setGalleryImage-withEndOfLifeDate-withMillis":"long",
		"setGalleryImage-withEndOfLifeDate-withEra":"int",
		"setGalleryImage-withEndOfLifeDate-withCenturyOfEra":"int",
		"setGalleryImage-withEndOfLifeDate-withYearOfEra":"int",
		"setGalleryImage-withEndOfLifeDate-withYearOfCentury":"int",
		"setGalleryImage-withEndOfLifeDate-withYear":"int",
		"setGalleryImage-withEndOfLifeDate-withWeekyear":"int",
		"setGalleryImage-withEndOfLifeDate-withMonthOfYear":"int",
		"setGalleryImage-withEndOfLifeDate-withWeekOfWeekyear":"int",
		"setGalleryImage-withEndOfLifeDate-withDayOfYear":"int",
		"setGalleryImage-withEndOfLifeDate-withDayOfMonth":"int",
		"setGalleryImage-withEndOfLifeDate-withDayOfWeek":"int",
		"setGalleryImage-withEndOfLifeDate-withHourOfDay":"int",
		"setGalleryImage-withEndOfLifeDate-withMinuteOfHour":"int",
		"setGalleryImage-withEndOfLifeDate-withSecondOfMinute":"int",
		"setGalleryImage-withEndOfLifeDate-withMillisOfSecond":"int",
		"setGalleryImage-withEndOfLifeDate-withMillisOfDay":"int",
		"setGalleryImage-withRecommended-withMemory-withMin":"java.lang.Integer",
		"setGalleryImage-withRecommended-withMemory-withMax":"java.lang.Integer",
		"setGalleryImage-withRecommended-withVCPUs-withMin":"java.lang.Integer",
		"setGalleryImage-withRecommended-withVCPUs-withMax":"java.lang.Integer",
		"setGalleryImage-withDisallowed-withDiskTypes":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setGalleryImage-withPurchasePlan-withPublisher":"java.lang.String",
		"setGalleryImage-withPurchasePlan-withName":"java.lang.String",
		"setGalleryImage-withPurchasePlan-withProduct":"java.lang.String",
		"setGalleryImage-withLocation":"java.lang.String",
		"setGalleryImage-withTags":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"setGalleryImageName":"java.lang.String"
	}
}
```
## ListOffersVirtualMachineImages parameterss:

```
{
	"main":{
		"setLocation":"java.lang.String",
		"setPublisherName":"java.lang.String"
	}
}
```
## BeginCaptureVirtualMachines parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmName":"java.lang.String",
		"setParameters-withOverwriteVhds":"boolean",
		"setParameters-withDestinationContainerName":"java.lang.String",
		"setParameters-withVhdPrefix":"java.lang.String"
	}
}
```
## ListNextAsyncResourceSkus parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListByResourceGroupNextVirtualMachines parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## CreateOrUpdateVirtualMachineScaleSetExtensions parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setExtensionParameters-withForceUpdateTag":"java.lang.String",
		"setExtensionParameters-withPublisher":"java.lang.String",
		"setExtensionParameters-withTypeHandlerVersion":"java.lang.String",
		"setExtensionParameters-withAutoUpgradeMinorVersion":"java.lang.Boolean",
		"setExtensionParameters-withName":"java.lang.String",
		"setExtensionParameters-withType":"java.lang.String",
		"setVmScaleSetName":"java.lang.String",
		"setVmssExtensionName":"java.lang.String"
	}
}
```
## DeleteVirtualMachineScaleSetExtensions parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmScaleSetName":"java.lang.String",
		"setVmssExtensionName":"java.lang.String"
	}
}
```
## ListSkusVirtualMachineImages parameterss:

```
{
	"main":{
		"setLocation":"java.lang.String",
		"setPublisherName":"java.lang.String",
		"setOffer":"java.lang.String"
	}
}
```
## ListVirtualMachineScaleSetExtensions parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmScaleSetName":"java.lang.String"
	}
}
```
## UpdateVirtualMachineScaleSetVMs parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setParameters-withPlan-withPublisher":"java.lang.String",
		"setParameters-withPlan-withName":"java.lang.String",
		"setParameters-withPlan-withProduct":"java.lang.String",
		"setParameters-withPlan-withPromotionCode":"java.lang.String",
		"setParameters-withStorageProfile-withImageReference-withPublisher":"java.lang.String",
		"setParameters-withStorageProfile-withImageReference-withSku":"java.lang.String",
		"setParameters-withStorageProfile-withImageReference-withOffer":"java.lang.String",
		"setParameters-withStorageProfile-withImageReference-withVersion":"java.lang.String",
		"setParameters-withStorageProfile-withImageReference-withId":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withName":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withDiskSizeGB":"java.lang.Integer",
		"setParameters-withStorageProfile-withOsDisk-withEncryptionSettings-withEnabled":"java.lang.Boolean",
		"setParameters-withStorageProfile-withOsDisk-withEncryptionSettings-withDiskEncryptionKey-withSourceVault-withId":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withEncryptionSettings-withDiskEncryptionKey-withSecretUrl":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withEncryptionSettings-withKeyEncryptionKey-withSourceVault-withId":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withEncryptionSettings-withKeyEncryptionKey-withKeyUrl":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withWriteAcceleratorEnabled":"java.lang.Boolean",
		"setParameters-withStorageProfile-withOsDisk-withImage-withUri":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withManagedDisk-withId":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withVhd-withUri":"java.lang.String",
		"setParameters-withStorageProfile-withDataDisks":[
			"ref1-com.microsoft.azure.management.compute.DataDisk"
		],
		"setParameters-withOsProfile-withCustomData":"java.lang.String",
		"setParameters-withOsProfile-withWindowsConfiguration-withProvisionVMAgent":"java.lang.Boolean",
		"setParameters-withOsProfile-withWindowsConfiguration-withEnableAutomaticUpdates":"java.lang.Boolean",
		"setParameters-withOsProfile-withWindowsConfiguration-withTimeZone":"java.lang.String",
		"setParameters-withOsProfile-withWindowsConfiguration-withAdditionalUnattendContent":[
			"ref2-com.microsoft.azure.management.compute.AdditionalUnattendContent"
		],
		"setParameters-withOsProfile-withWindowsConfiguration-withWinRM-withListeners":[
			"ref3-com.microsoft.azure.management.compute.WinRMListener"
		],
		"setParameters-withOsProfile-withLinuxConfiguration-withSsh-withPublicKeys":[
			"ref4-com.microsoft.azure.management.compute.SshPublicKey"
		],
		"setParameters-withOsProfile-withLinuxConfiguration-withProvisionVMAgent":"java.lang.Boolean",
		"setParameters-withOsProfile-withLinuxConfiguration-withDisablePasswordAuthentication":"java.lang.Boolean",
		"setParameters-withOsProfile-withSecrets":[
			"ref5-com.microsoft.azure.management.compute.VaultSecretGroup"
		],
		"setParameters-withOsProfile-withAdminUsername":"java.lang.String",
		"setParameters-withOsProfile-withAdminPassword":"java.lang.String",
		"setParameters-withOsProfile-withAllowExtensionOperations":"java.lang.Boolean",
		"setParameters-withOsProfile-withComputerName":"java.lang.String",
		"setParameters-withNetworkProfile-withNetworkInterfaces":[
			"ref7-com.microsoft.azure.management.compute.NetworkInterfaceReference"
		],
		"setParameters-withDiagnosticsProfile-withBootDiagnostics-withEnabled":"java.lang.Boolean",
		"setParameters-withDiagnosticsProfile-withBootDiagnostics-withStorageUri":"java.lang.String",
		"setParameters-withAvailabilitySet-withId":"java.lang.String",
		"setParameters-withLicenseType":"java.lang.String",
		"setParameters-withLocation":"java.lang.String",
		"setParameters-withTags":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"setVmScaleSetName":"java.lang.String",
		"setInstanceId":"java.lang.String"
	},
	"ref1-com.microsoft.azure.management.compute.DataDisk":{
		"withName":"java.lang.String",
		"withDiskSizeGB":"java.lang.Integer",
		"withWriteAcceleratorEnabled":"java.lang.Boolean",
		"withImage-withUri":"java.lang.String",
		"withManagedDisk-withId":"java.lang.String",
		"withLun":"int",
		"withVhd-withUri":"java.lang.String"
	},
	"ref2-com.microsoft.azure.management.compute.AdditionalUnattendContent":{
		"withContent":"java.lang.String"
	},
	"ref3-com.microsoft.azure.management.compute.WinRMListener":{
		"withCertificateUrl":"java.lang.String"
	},
	"ref4-com.microsoft.azure.management.compute.SshPublicKey":{
		"withPath":"java.lang.String",
		"withKeyData":"java.lang.String"
	},
	"ref5-com.microsoft.azure.management.compute.VaultSecretGroup":{
		"withSourceVault-withId":"java.lang.String",
		"setParameters-withOsProfile-withSecrets-withVaultCertificates":[
			"ref6-com.microsoft.azure.management.compute.VaultCertificate"
		]
	},
	"ref6-com.microsoft.azure.management.compute.VaultCertificate":{
		"withCertificateUrl":"java.lang.String",
		"withCertificateStore":"java.lang.String"
	},
	"ref7-com.microsoft.azure.management.compute.NetworkInterfaceReference":{
		"withPrimary":"java.lang.Boolean",
		"withId":"java.lang.String"
	}
}
```
## GetInstanceViewVirtualMachineScaleSetVMs parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmScaleSetName":"java.lang.String",
		"setInstanceId":"java.lang.String"
	}
}
```
## ListByGalleryImageAsyncGalleryImageVersions parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setGalleryName":"java.lang.String",
		"setGalleryImageName":"java.lang.String"
	}
}
```
## ListWithServiceResponseAsyncVirtualMachineRunCommands parameterss:

```
{
	"main":{
		"setLocation":"java.lang.String"
	}
}
```
## DeleteVirtualMachineExtensions parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmName":"java.lang.String",
		"setVmExtensionName":"java.lang.String"
	}
}
```
## DeleteWithServiceResponseAsyncVirtualMachineScaleSetVMs parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmScaleSetName":"java.lang.String",
		"setInstanceId":"java.lang.String"
	}
}
```
## ListOffersAsyncVirtualMachineImages parameterss:

```
{
	"main":{
		"setLocation":"java.lang.String",
		"setPublisherName":"java.lang.String"
	}
}
```
## ListVirtualMachineScaleSetVMs parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVirtualMachineScaleSetName":"java.lang.String"
	}
}
```
## DeleteAsyncSnapshots parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setSnapshotName":"java.lang.String"
	}
}
```
## ListByGalleryImageWithServiceResponseAsyncGalleryImageVersions parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setGalleryName":"java.lang.String",
		"setGalleryImageName":"java.lang.String"
	}
}
```
## DeleteGalleryImages parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setGalleryName":"java.lang.String",
		"setGalleryImageName":"java.lang.String"
	}
}
```
## ListNextSinglePageAsyncDisks parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListByResourceGroupWithServiceResponseAsyncDisks parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String"
	}
}
```
## ListVirtualMachineScaleSets parameterss:

```
{}
```
## ListNextWithServiceResponseAsyncImages parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListByResourceGroupWithServiceResponseAsyncGalleries parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String"
	}
}
```
## ListNextVirtualMachineScaleSetVMs parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListAsyncUsages parameterss:

```
{
	"main":{
		"setLocation":"java.lang.String"
	}
}
```
## ListWithServiceResponseAsyncSnapshots parameterss:

```
{}
```
## DeleteWithServiceResponseAsyncGalleryImageVersions parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setGalleryName":"java.lang.String",
		"setGalleryImageVersionName":"java.lang.String",
		"setGalleryImageName":"java.lang.String"
	}
}
```
## ListSinglePageAsyncSnapshots parameterss:

```
{}
```
## ListImages parameterss:

```
{}
```
## ListWithServiceResponseAsyncVirtualMachineScaleSetVMs parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVirtualMachineScaleSetName":"java.lang.String"
	}
}
```
## BeginUpdateDisks parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setDisk-withTags":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"setDisk-withDiskSizeGB":"java.lang.Integer",
		"setDisk-withEncryptionSettings-withEnabled":"java.lang.Boolean",
		"setDisk-withEncryptionSettings-withDiskEncryptionKey-withSourceVault-withId":"java.lang.String",
		"setDisk-withEncryptionSettings-withDiskEncryptionKey-withSecretUrl":"java.lang.String",
		"setDisk-withEncryptionSettings-withKeyEncryptionKey-withSourceVault-withId":"java.lang.String",
		"setDisk-withEncryptionSettings-withKeyEncryptionKey-withKeyUrl":"java.lang.String",
		"setDiskName":"java.lang.String"
	}
}
```
## ListByResourceGroupSinglePageAsyncImages parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String"
	}
}
```
## DeleteAsyncVirtualMachineScaleSets parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmScaleSetName":"java.lang.String"
	}
}
```
## ListNextAsyncVirtualMachineRunCommands parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## DeleteGalleries parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setGalleryName":"java.lang.String"
	}
}
```
## ListByResourceGroupNextSinglePageAsyncSnapshots parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## GetLatestVirtualMachineScaleSetRollingUpgrades parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmScaleSetName":"java.lang.String"
	}
}
```
## DeleteVirtualMachineScaleSetVMs parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmScaleSetName":"java.lang.String",
		"setInstanceId":"java.lang.String"
	}
}
```
## DeleteAsyncGalleryImages parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setGalleryName":"java.lang.String",
		"setGalleryImageName":"java.lang.String"
	}
}
```
## ListAvailableSizesWithServiceResponseAsyncVirtualMachines parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmName":"java.lang.String"
	}
}
```
## ListWithServiceResponseAsyncResourceSkus parameterss:

```
{}
```
## ListSinglePageAsyncUsages parameterss:

```
{
	"main":{
		"setLocation":"java.lang.String"
	}
}
```
## BeginUpdateImages parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setParameters-withSourceVirtualMachine-withId":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withDiskSizeGB":"java.lang.Integer",
		"setParameters-withStorageProfile-withOsDisk-withManagedDisk-withId":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withSnapshot-withId":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withBlobUri":"java.lang.String",
		"setParameters-withStorageProfile-withDataDisks":[
			"ref1-com.microsoft.azure.management.compute.ImageDataDisk"
		],
		"setParameters-withStorageProfile-withZoneResilient":"java.lang.Boolean",
		"setParameters-withTags":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"setImageName":"java.lang.String"
	},
	"ref1-com.microsoft.azure.management.compute.ImageDataDisk":{
		"withDiskSizeGB":"java.lang.Integer",
		"withManagedDisk-withId":"java.lang.String",
		"withLun":"int",
		"withSnapshot-withId":"java.lang.String",
		"withBlobUri":"java.lang.String"
	}
}
```
## ListNextVirtualMachineRunCommands parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListSinglePageAsyncVirtualMachines parameterss:

```
{}
```
## ListNextAsyncVirtualMachines parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## DeleteAsyncGalleryImageVersions parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setGalleryName":"java.lang.String",
		"setGalleryImageVersionName":"java.lang.String",
		"setGalleryImageName":"java.lang.String"
	}
}
```
## ListSkusAsyncVirtualMachineImages parameterss:

```
{
	"main":{
		"setLocation":"java.lang.String",
		"setPublisherName":"java.lang.String",
		"setOffer":"java.lang.String"
	}
}
```
## ListNextUsages parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListByResourceGroupNextSinglePageAsyncVirtualMachines parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListNextSinglePageAsyncSnapshots parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## GetByResourceGroupSnapshots parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setSnapshotName":"java.lang.String"
	}
}
```
## BeginCreateOrUpdateVirtualMachines parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmName":"java.lang.String",
		"setParameters-withPlan-withPublisher":"java.lang.String",
		"setParameters-withPlan-withName":"java.lang.String",
		"setParameters-withPlan-withProduct":"java.lang.String",
		"setParameters-withPlan-withPromotionCode":"java.lang.String",
		"setParameters-withStorageProfile-withImageReference-withPublisher":"java.lang.String",
		"setParameters-withStorageProfile-withImageReference-withSku":"java.lang.String",
		"setParameters-withStorageProfile-withImageReference-withOffer":"java.lang.String",
		"setParameters-withStorageProfile-withImageReference-withVersion":"java.lang.String",
		"setParameters-withStorageProfile-withImageReference-withId":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withName":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withDiskSizeGB":"java.lang.Integer",
		"setParameters-withStorageProfile-withOsDisk-withEncryptionSettings-withEnabled":"java.lang.Boolean",
		"setParameters-withStorageProfile-withOsDisk-withEncryptionSettings-withDiskEncryptionKey-withSourceVault-withId":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withEncryptionSettings-withDiskEncryptionKey-withSecretUrl":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withEncryptionSettings-withKeyEncryptionKey-withSourceVault-withId":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withEncryptionSettings-withKeyEncryptionKey-withKeyUrl":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withWriteAcceleratorEnabled":"java.lang.Boolean",
		"setParameters-withStorageProfile-withOsDisk-withImage-withUri":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withManagedDisk-withId":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withVhd-withUri":"java.lang.String",
		"setParameters-withStorageProfile-withDataDisks":[
			"ref1-com.microsoft.azure.management.compute.DataDisk"
		],
		"setParameters-withOsProfile-withCustomData":"java.lang.String",
		"setParameters-withOsProfile-withWindowsConfiguration-withProvisionVMAgent":"java.lang.Boolean",
		"setParameters-withOsProfile-withWindowsConfiguration-withEnableAutomaticUpdates":"java.lang.Boolean",
		"setParameters-withOsProfile-withWindowsConfiguration-withTimeZone":"java.lang.String",
		"setParameters-withOsProfile-withWindowsConfiguration-withAdditionalUnattendContent":[
			"ref2-com.microsoft.azure.management.compute.AdditionalUnattendContent"
		],
		"setParameters-withOsProfile-withWindowsConfiguration-withWinRM-withListeners":[
			"ref3-com.microsoft.azure.management.compute.WinRMListener"
		],
		"setParameters-withOsProfile-withLinuxConfiguration-withSsh-withPublicKeys":[
			"ref4-com.microsoft.azure.management.compute.SshPublicKey"
		],
		"setParameters-withOsProfile-withLinuxConfiguration-withProvisionVMAgent":"java.lang.Boolean",
		"setParameters-withOsProfile-withLinuxConfiguration-withDisablePasswordAuthentication":"java.lang.Boolean",
		"setParameters-withOsProfile-withSecrets":[
			"ref5-com.microsoft.azure.management.compute.VaultSecretGroup"
		],
		"setParameters-withOsProfile-withAdminUsername":"java.lang.String",
		"setParameters-withOsProfile-withAdminPassword":"java.lang.String",
		"setParameters-withOsProfile-withAllowExtensionOperations":"java.lang.Boolean",
		"setParameters-withOsProfile-withComputerName":"java.lang.String",
		"setParameters-withNetworkProfile-withNetworkInterfaces":[
			"ref7-com.microsoft.azure.management.compute.NetworkInterfaceReference"
		],
		"setParameters-withDiagnosticsProfile-withBootDiagnostics-withEnabled":"java.lang.Boolean",
		"setParameters-withDiagnosticsProfile-withBootDiagnostics-withStorageUri":"java.lang.String",
		"setParameters-withAvailabilitySet-withId":"java.lang.String",
		"setParameters-withLicenseType":"java.lang.String",
		"setParameters-withIdentity-withUserAssignedIdentities":{
			"java.lang.String0":"ref8-com.microsoft.azure.management.compute.VirtualMachineIdentityUserAssignedIdentitiesValue"
		},
		"setParameters-withZones":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setParameters-withLocation":"java.lang.String",
		"setParameters-withTags":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		}
	},
	"ref1-com.microsoft.azure.management.compute.DataDisk":{
		"withName":"java.lang.String",
		"withDiskSizeGB":"java.lang.Integer",
		"withWriteAcceleratorEnabled":"java.lang.Boolean",
		"withImage-withUri":"java.lang.String",
		"withManagedDisk-withId":"java.lang.String",
		"withLun":"int",
		"withVhd-withUri":"java.lang.String"
	},
	"ref2-com.microsoft.azure.management.compute.AdditionalUnattendContent":{
		"withContent":"java.lang.String"
	},
	"ref3-com.microsoft.azure.management.compute.WinRMListener":{
		"withCertificateUrl":"java.lang.String"
	},
	"ref4-com.microsoft.azure.management.compute.SshPublicKey":{
		"withPath":"java.lang.String",
		"withKeyData":"java.lang.String"
	},
	"ref5-com.microsoft.azure.management.compute.VaultSecretGroup":{
		"withSourceVault-withId":"java.lang.String",
		"setParameters-withOsProfile-withSecrets-withVaultCertificates":[
			"ref6-com.microsoft.azure.management.compute.VaultCertificate"
		]
	},
	"ref6-com.microsoft.azure.management.compute.VaultCertificate":{
		"withCertificateUrl":"java.lang.String",
		"withCertificateStore":"java.lang.String"
	},
	"ref7-com.microsoft.azure.management.compute.NetworkInterfaceReference":{
		"withPrimary":"java.lang.Boolean",
		"withId":"java.lang.String"
	}
}
```
## ListVirtualMachineRunCommands parameterss:

```
{
	"main":{
		"setLocation":"java.lang.String"
	}
}
```
## ListVirtualMachines parameterss:

```
{}
```
## ListAsyncVirtualMachineExtensions parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmName":"java.lang.String"
	}
}
```
## ListNextVirtualMachineScaleSets parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListByResourceGroupNextWithServiceResponseAsyncGalleries parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
## ListVirtualMachineExtensions parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setVmName":"java.lang.String"
	}
}
```
## BeginUpdateVirtualMachineScaleSetVMs parameterss:

```
{
	"main":{
		"setResourceGroupName":"java.lang.String",
		"setParameters-withPlan-withPublisher":"java.lang.String",
		"setParameters-withPlan-withName":"java.lang.String",
		"setParameters-withPlan-withProduct":"java.lang.String",
		"setParameters-withPlan-withPromotionCode":"java.lang.String",
		"setParameters-withStorageProfile-withImageReference-withPublisher":"java.lang.String",
		"setParameters-withStorageProfile-withImageReference-withSku":"java.lang.String",
		"setParameters-withStorageProfile-withImageReference-withOffer":"java.lang.String",
		"setParameters-withStorageProfile-withImageReference-withVersion":"java.lang.String",
		"setParameters-withStorageProfile-withImageReference-withId":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withName":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withDiskSizeGB":"java.lang.Integer",
		"setParameters-withStorageProfile-withOsDisk-withEncryptionSettings-withEnabled":"java.lang.Boolean",
		"setParameters-withStorageProfile-withOsDisk-withEncryptionSettings-withDiskEncryptionKey-withSourceVault-withId":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withEncryptionSettings-withDiskEncryptionKey-withSecretUrl":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withEncryptionSettings-withKeyEncryptionKey-withSourceVault-withId":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withEncryptionSettings-withKeyEncryptionKey-withKeyUrl":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withWriteAcceleratorEnabled":"java.lang.Boolean",
		"setParameters-withStorageProfile-withOsDisk-withImage-withUri":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withManagedDisk-withId":"java.lang.String",
		"setParameters-withStorageProfile-withOsDisk-withVhd-withUri":"java.lang.String",
		"setParameters-withStorageProfile-withDataDisks":[
			"ref1-com.microsoft.azure.management.compute.DataDisk"
		],
		"setParameters-withOsProfile-withCustomData":"java.lang.String",
		"setParameters-withOsProfile-withWindowsConfiguration-withProvisionVMAgent":"java.lang.Boolean",
		"setParameters-withOsProfile-withWindowsConfiguration-withEnableAutomaticUpdates":"java.lang.Boolean",
		"setParameters-withOsProfile-withWindowsConfiguration-withTimeZone":"java.lang.String",
		"setParameters-withOsProfile-withWindowsConfiguration-withAdditionalUnattendContent":[
			"ref2-com.microsoft.azure.management.compute.AdditionalUnattendContent"
		],
		"setParameters-withOsProfile-withWindowsConfiguration-withWinRM-withListeners":[
			"ref3-com.microsoft.azure.management.compute.WinRMListener"
		],
		"setParameters-withOsProfile-withLinuxConfiguration-withSsh-withPublicKeys":[
			"ref4-com.microsoft.azure.management.compute.SshPublicKey"
		],
		"setParameters-withOsProfile-withLinuxConfiguration-withProvisionVMAgent":"java.lang.Boolean",
		"setParameters-withOsProfile-withLinuxConfiguration-withDisablePasswordAuthentication":"java.lang.Boolean",
		"setParameters-withOsProfile-withSecrets":[
			"ref5-com.microsoft.azure.management.compute.VaultSecretGroup"
		],
		"setParameters-withOsProfile-withAdminUsername":"java.lang.String",
		"setParameters-withOsProfile-withAdminPassword":"java.lang.String",
		"setParameters-withOsProfile-withAllowExtensionOperations":"java.lang.Boolean",
		"setParameters-withOsProfile-withComputerName":"java.lang.String",
		"setParameters-withNetworkProfile-withNetworkInterfaces":[
			"ref7-com.microsoft.azure.management.compute.NetworkInterfaceReference"
		],
		"setParameters-withDiagnosticsProfile-withBootDiagnostics-withEnabled":"java.lang.Boolean",
		"setParameters-withDiagnosticsProfile-withBootDiagnostics-withStorageUri":"java.lang.String",
		"setParameters-withAvailabilitySet-withId":"java.lang.String",
		"setParameters-withLicenseType":"java.lang.String",
		"setParameters-withLocation":"java.lang.String",
		"setParameters-withTags":{
			"java.lang.String0":"java.lang.String0",
			"java.lang.String1":"java.lang.String1"
		},
		"setVmScaleSetName":"java.lang.String",
		"setInstanceId":"java.lang.String"
	},
	"ref1-com.microsoft.azure.management.compute.DataDisk":{
		"withName":"java.lang.String",
		"withDiskSizeGB":"java.lang.Integer",
		"withWriteAcceleratorEnabled":"java.lang.Boolean",
		"withImage-withUri":"java.lang.String",
		"withManagedDisk-withId":"java.lang.String",
		"withLun":"int",
		"withVhd-withUri":"java.lang.String"
	},
	"ref2-com.microsoft.azure.management.compute.AdditionalUnattendContent":{
		"withContent":"java.lang.String"
	},
	"ref3-com.microsoft.azure.management.compute.WinRMListener":{
		"withCertificateUrl":"java.lang.String"
	},
	"ref4-com.microsoft.azure.management.compute.SshPublicKey":{
		"withPath":"java.lang.String",
		"withKeyData":"java.lang.String"
	},
	"ref5-com.microsoft.azure.management.compute.VaultSecretGroup":{
		"withSourceVault-withId":"java.lang.String",
		"setParameters-withOsProfile-withSecrets-withVaultCertificates":[
			"ref6-com.microsoft.azure.management.compute.VaultCertificate"
		]
	},
	"ref6-com.microsoft.azure.management.compute.VaultCertificate":{
		"withCertificateUrl":"java.lang.String",
		"withCertificateStore":"java.lang.String"
	},
	"ref7-com.microsoft.azure.management.compute.NetworkInterfaceReference":{
		"withPrimary":"java.lang.Boolean",
		"withId":"java.lang.String"
	}
}
```
## ExportRequestRateByIntervalLogAnalytics parameterss:

```
{
	"main":{
		"setLocation":"java.lang.String",
		"setParameters-withBlobContainerSasUri":"java.lang.String",
		"setParameters-withFromTime-withMillis":"long",
		"setParameters-withFromTime-withEra":"int",
		"setParameters-withFromTime-withCenturyOfEra":"int",
		"setParameters-withFromTime-withYearOfEra":"int",
		"setParameters-withFromTime-withYearOfCentury":"int",
		"setParameters-withFromTime-withYear":"int",
		"setParameters-withFromTime-withWeekyear":"int",
		"setParameters-withFromTime-withMonthOfYear":"int",
		"setParameters-withFromTime-withWeekOfWeekyear":"int",
		"setParameters-withFromTime-withDayOfYear":"int",
		"setParameters-withFromTime-withDayOfMonth":"int",
		"setParameters-withFromTime-withDayOfWeek":"int",
		"setParameters-withFromTime-withHourOfDay":"int",
		"setParameters-withFromTime-withMinuteOfHour":"int",
		"setParameters-withFromTime-withSecondOfMinute":"int",
		"setParameters-withFromTime-withMillisOfSecond":"int",
		"setParameters-withFromTime-withMillisOfDay":"int",
		"setParameters-withToTime-withMillis":"long",
		"setParameters-withToTime-withEra":"int",
		"setParameters-withToTime-withCenturyOfEra":"int",
		"setParameters-withToTime-withYearOfEra":"int",
		"setParameters-withToTime-withYearOfCentury":"int",
		"setParameters-withToTime-withYear":"int",
		"setParameters-withToTime-withWeekyear":"int",
		"setParameters-withToTime-withMonthOfYear":"int",
		"setParameters-withToTime-withWeekOfWeekyear":"int",
		"setParameters-withToTime-withDayOfYear":"int",
		"setParameters-withToTime-withDayOfMonth":"int",
		"setParameters-withToTime-withDayOfWeek":"int",
		"setParameters-withToTime-withHourOfDay":"int",
		"setParameters-withToTime-withMinuteOfHour":"int",
		"setParameters-withToTime-withSecondOfMinute":"int",
		"setParameters-withToTime-withMillisOfSecond":"int",
		"setParameters-withToTime-withMillisOfDay":"int",
		"setParameters-withGroupByThrottlePolicy":"java.lang.Boolean",
		"setParameters-withGroupByOperationName":"java.lang.Boolean",
		"setParameters-withGroupByResourceName":"java.lang.Boolean"
	}
}
```
## ListNextSnapshots parameterss:

```
{
	"main":{
		"setNextPageLink":"java.lang.String"
	}
}
```
