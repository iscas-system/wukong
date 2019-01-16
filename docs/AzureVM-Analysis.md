## CreateOrUpdateAvailabilitySets parameterss:

```
- setResourceGroupName = java.lang.String
- setAvailabilitySetName = java.lang.String
- setParameters = com.microsoft.azure.management.compute.implementation.AvailabilitySetInner
- 	withPlatformFaultDomainCount = java.lang.Integer
- 	withVirtualMachines = java.util.List<com.microsoft.azure.SubResource>
- 		withId = java.lang.String
- 	withSku = com.microsoft.azure.management.compute.Sku
- 		withName = java.lang.String
- 		withTier = java.lang.String
- 		withCapacity = java.lang.Long
- 	withPlatformUpdateDomainCount = java.lang.Integer
- 	withLocation = java.lang.String
- 	withTags = java.util.Map<java.lang.String, java.lang.String>
```
## ListAsyncResourceSkus parameterss:

```
```
## ListPublishersAsyncVirtualMachineImages parameterss:

```
- setLocation = java.lang.String
```
## BeginUpdateVirtualMachineScaleSets parameterss:

```
- setResourceGroupName = java.lang.String
- setParameters = com.microsoft.azure.management.compute.VirtualMachineScaleSetUpdate
- 	withSku = com.microsoft.azure.management.compute.Sku
- 		withName = java.lang.String
- 		withTier = java.lang.String
- 		withCapacity = java.lang.Long
- 	withPlan = com.microsoft.azure.management.compute.Plan
- 		withName = java.lang.String
- 		withPublisher = java.lang.String
- 		withProduct = java.lang.String
- 		withPromotionCode = java.lang.String
- 	withIdentity = com.microsoft.azure.management.compute.VirtualMachineScaleSetIdentity
- 		withType = com.microsoft.azure.management.compute.ResourceIdentityType
- 		withUserAssignedIdentities = java.util.Map<java.lang.String, com.microsoft.azure.management.compute.VirtualMachineScaleSetIdentityUserAssignedIdentitiesValue>
- 	withUpgradePolicy = com.microsoft.azure.management.compute.UpgradePolicy
- 		withRollingUpgradePolicy = com.microsoft.azure.management.compute.RollingUpgradePolicy
- 			withMaxBatchInstancePercent = java.lang.Integer
- 			withMaxUnhealthyInstancePercent = java.lang.Integer
- 			withMaxUnhealthyUpgradedInstancePercent = java.lang.Integer
- 			withPauseTimeBetweenBatches = java.lang.String
- 		withAutomaticOSUpgrade = java.lang.Boolean
- 		withAutoOSUpgradePolicy = com.microsoft.azure.management.compute.AutoOSUpgradePolicy
- 			withDisableAutoRollback = java.lang.Boolean
- 		withMode = com.microsoft.azure.management.compute.UpgradeMode
- 	withVirtualMachineProfile = com.microsoft.azure.management.compute.VirtualMachineScaleSetUpdateVMProfile
- 		withStorageProfile = com.microsoft.azure.management.compute.VirtualMachineScaleSetUpdateStorageProfile
- 			withImageReference = com.microsoft.azure.management.compute.ImageReference
- 				withSku = java.lang.String
- 				withPublisher = java.lang.String
- 				withOffer = java.lang.String
- 				withVersion = java.lang.String
- 				withId = java.lang.String
- 			withOsDisk = com.microsoft.azure.management.compute.VirtualMachineScaleSetUpdateOSDisk
- 				withCaching = com.microsoft.azure.management.compute.CachingTypes
- 				withWriteAcceleratorEnabled = java.lang.Boolean
- 				withImage = com.microsoft.azure.management.compute.VirtualHardDisk
- 					withUri = java.lang.String
- 				withVhdContainers = java.util.List<java.lang.String>
- 				withManagedDisk = com.microsoft.azure.management.compute.VirtualMachineScaleSetManagedDiskParameters
- 					withStorageAccountType = com.microsoft.azure.management.compute.StorageAccountTypes
- 			withDataDisks = java.util.List<com.microsoft.azure.management.compute.VirtualMachineScaleSetDataDisk>
- 				withName = java.lang.String
- 				withDiskSizeGB = java.lang.Integer
- 				withLun = int
- 				withCreateOption = com.microsoft.azure.management.compute.DiskCreateOptionTypes
- 				withCaching = com.microsoft.azure.management.compute.CachingTypes
- 				withWriteAcceleratorEnabled = java.lang.Boolean
- 				withManagedDisk = com.microsoft.azure.management.compute.VirtualMachineScaleSetManagedDiskParameters
- 					withStorageAccountType = com.microsoft.azure.management.compute.StorageAccountTypes
- 		withOsProfile = com.microsoft.azure.management.compute.VirtualMachineScaleSetUpdateOSProfile
- 			withLinuxConfiguration = com.microsoft.azure.management.compute.LinuxConfiguration
- 				withProvisionVMAgent = java.lang.Boolean
- 				withDisablePasswordAuthentication = java.lang.Boolean
- 				withSsh = com.microsoft.azure.management.compute.SshConfiguration
- 					withPublicKeys = java.util.List<com.microsoft.azure.management.compute.SshPublicKey>
- 						withPath = java.lang.String
- 						withKeyData = java.lang.String
- 			withCustomData = java.lang.String
- 			withWindowsConfiguration = com.microsoft.azure.management.compute.WindowsConfiguration
- 				withProvisionVMAgent = java.lang.Boolean
- 				withEnableAutomaticUpdates = java.lang.Boolean
- 				withTimeZone = java.lang.String
- 				withWinRM = com.microsoft.azure.management.compute.WinRMConfiguration
- 					withListeners = java.util.List<com.microsoft.azure.management.compute.WinRMListener>
- 						withCertificateUrl = java.lang.String
- 						withProtocol = com.microsoft.azure.management.compute.ProtocolTypes
- 				withAdditionalUnattendContent = java.util.List<com.microsoft.azure.management.compute.AdditionalUnattendContent>
- 					withPassName = com.microsoft.azure.management.compute.PassNames
- 					withComponentName = com.microsoft.azure.management.compute.ComponentNames
- 					withSettingName = com.microsoft.azure.management.compute.SettingNames
- 					withContent = java.lang.String
- 			withSecrets = java.util.List<com.microsoft.azure.management.compute.VaultSecretGroup>
- 				withSourceVault = com.microsoft.azure.SubResource
- 					withId = java.lang.String
- 				withVaultCertificates = java.util.List<com.microsoft.azure.management.compute.VaultCertificate>
- 					withCertificateUrl = java.lang.String
- 					withCertificateStore = java.lang.String
- 		withNetworkProfile = com.microsoft.azure.management.compute.VirtualMachineScaleSetUpdateNetworkProfile
- 			withNetworkInterfaceConfigurations = java.util.List<com.microsoft.azure.management.compute.VirtualMachineScaleSetUpdateNetworkConfiguration>
- 				withName = java.lang.String
- 				withPrimary = java.lang.Boolean
- 				withEnableAcceleratedNetworking = java.lang.Boolean
- 				withNetworkSecurityGroup = com.microsoft.azure.SubResource
- 					withId = java.lang.String
- 				withDnsSettings = com.microsoft.azure.management.compute.VirtualMachineScaleSetNetworkConfigurationDnsSettings
- 					withDnsServers = java.util.List<java.lang.String>
- 				withIpConfigurations = java.util.List<com.microsoft.azure.management.compute.VirtualMachineScaleSetUpdateIPConfiguration>
- 					withName = java.lang.String
- 					withPrimary = java.lang.Boolean
- 					withSubnet = com.microsoft.azure.management.compute.ApiEntityReference
- 						withId = java.lang.String
- 					withPublicIPAddressConfiguration = com.microsoft.azure.management.compute.VirtualMachineScaleSetUpdatePublicIPAddressConfiguration
- 						withName = java.lang.String
- 						withDnsSettings = com.microsoft.azure.management.compute.VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettings
- 							withDomainNameLabel = java.lang.String
- 						withIdleTimeoutInMinutes = java.lang.Integer
- 					withPrivateIPAddressVersion = com.microsoft.azure.management.compute.IPVersion
- 					withApplicationGatewayBackendAddressPools = java.util.List<com.microsoft.azure.SubResource>
- 						withId = java.lang.String
- 					withLoadBalancerBackendAddressPools = java.util.List<com.microsoft.azure.SubResource>
- 						withId = java.lang.String
- 					withLoadBalancerInboundNatPools = java.util.List<com.microsoft.azure.SubResource>
- 						withId = java.lang.String
- 					withApplicationSecurityGroups = java.util.List<com.microsoft.azure.SubResource>
- 						withId = java.lang.String
- 					withId = java.lang.String
- 				withEnableIPForwarding = java.lang.Boolean
- 				withId = java.lang.String
- 		withDiagnosticsProfile = com.microsoft.azure.management.compute.DiagnosticsProfile
- 			withBootDiagnostics = com.microsoft.azure.management.compute.BootDiagnostics
- 				withEnabled = java.lang.Boolean
- 				withStorageUri = java.lang.String
- 		withLicenseType = java.lang.String
- 		withExtensionProfile = com.microsoft.azure.management.compute.VirtualMachineScaleSetExtensionProfile
- 			withExtensions = java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner>
- 				withName = java.lang.String
- 				withForceUpdateTag = java.lang.String
- 				withPublisher = java.lang.String
- 				withTypeHandlerVersion = java.lang.String
- 				withAutoUpgradeMinorVersion = java.lang.Boolean
- 				withSettings = java.lang.Object
- 				withProtectedSettings = java.lang.Object
- 				withType = java.lang.String
- 	withOverprovision = java.lang.Boolean
- 	withSinglePlacementGroup = java.lang.Boolean
- 	withTags = java.util.Map<java.lang.String, java.lang.String>
- setVmScaleSetName = java.lang.String
```
## DeleteWithServiceResponseAsyncSnapshots parameterss:

```
- setResourceGroupName = java.lang.String
- setSnapshotName = java.lang.String
```
## DeleteWithServiceResponseAsyncImages parameterss:

```
- setImageName = java.lang.String
- setResourceGroupName = java.lang.String
```
## ListAsyncImages parameterss:

```
```
## ListByResourceGroupSinglePageAsyncVirtualMachineScaleSets parameterss:

```
- setResourceGroupName = java.lang.String
```
## ListByResourceGroupWithServiceResponseAsyncAvailabilitySets parameterss:

```
- setResourceGroupName = java.lang.String
```
## ListAsyncDisks parameterss:

```
```
## ListByGalleryNextSinglePageAsyncGalleryImages parameterss:

```
- setNextPageLink = java.lang.String
```
## ListByResourceGroupAsyncVirtualMachines parameterss:

```
- setResourceGroupName = java.lang.String
```
## BeginCreateOrUpdateImages parameterss:

```
- setImageName = java.lang.String
- setResourceGroupName = java.lang.String
- setParameters = com.microsoft.azure.management.compute.implementation.ImageInner
- 	withSourceVirtualMachine = com.microsoft.azure.SubResource
- 		withId = java.lang.String
- 	withStorageProfile = com.microsoft.azure.management.compute.ImageStorageProfile
- 		withOsDisk = com.microsoft.azure.management.compute.ImageOSDisk
- 			withOsType = com.microsoft.azure.management.compute.OperatingSystemTypes
- 			withDiskSizeGB = java.lang.Integer
- 			withOsState = com.microsoft.azure.management.compute.OperatingSystemStateTypes
- 			withCaching = com.microsoft.azure.management.compute.CachingTypes
- 			withStorageAccountType = com.microsoft.azure.management.compute.StorageAccountTypes
- 			withManagedDisk = com.microsoft.azure.SubResource
- 				withId = java.lang.String
- 			withSnapshot = com.microsoft.azure.SubResource
- 				withId = java.lang.String
- 			withBlobUri = java.lang.String
- 		withDataDisks = java.util.List<com.microsoft.azure.management.compute.ImageDataDisk>
- 			withDiskSizeGB = java.lang.Integer
- 			withLun = int
- 			withCaching = com.microsoft.azure.management.compute.CachingTypes
- 			withStorageAccountType = com.microsoft.azure.management.compute.StorageAccountTypes
- 			withManagedDisk = com.microsoft.azure.SubResource
- 				withId = java.lang.String
- 			withSnapshot = com.microsoft.azure.SubResource
- 				withId = java.lang.String
- 			withBlobUri = java.lang.String
- 		withZoneResilient = java.lang.Boolean
- 	withLocation = java.lang.String
- 	withTags = java.util.Map<java.lang.String, java.lang.String>
```
## ListNextSinglePageAsyncVirtualMachines parameterss:

```
- setNextPageLink = java.lang.String
```
## ExportThrottledRequestsLogAnalytics parameterss:

```
- setLocation = java.lang.String
- setParameters = com.microsoft.azure.management.compute.ThrottledRequestsInput
- 	withFromTime = org.joda.time.DateTime
- 		withChronology = org.joda.time.Chronology
- 			withZone = org.joda.time.DateTimeZone
- 		withMillis = long
- 		withZone = org.joda.time.DateTimeZone
- 		withZoneRetainFields = org.joda.time.DateTimeZone
- 		withFields = org.joda.time.ReadablePartial
- 		withEra = int
- 		withCenturyOfEra = int
- 		withYearOfEra = int
- 		withYearOfCentury = int
- 		withYear = int
- 		withWeekyear = int
- 		withMonthOfYear = int
- 		withWeekOfWeekyear = int
- 		withDayOfYear = int
- 		withDayOfMonth = int
- 		withDayOfWeek = int
- 		withHourOfDay = int
- 		withMinuteOfHour = int
- 		withSecondOfMinute = int
- 		withMillisOfSecond = int
- 		withMillisOfDay = int
- 	withToTime = org.joda.time.DateTime
- 		withChronology = org.joda.time.Chronology
- 			withZone = org.joda.time.DateTimeZone
- 		withMillis = long
- 		withZone = org.joda.time.DateTimeZone
- 		withZoneRetainFields = org.joda.time.DateTimeZone
- 		withFields = org.joda.time.ReadablePartial
- 		withEra = int
- 		withCenturyOfEra = int
- 		withYearOfEra = int
- 		withYearOfCentury = int
- 		withYear = int
- 		withWeekyear = int
- 		withMonthOfYear = int
- 		withWeekOfWeekyear = int
- 		withDayOfYear = int
- 		withDayOfMonth = int
- 		withDayOfWeek = int
- 		withHourOfDay = int
- 		withMinuteOfHour = int
- 		withSecondOfMinute = int
- 		withMillisOfSecond = int
- 		withMillisOfDay = int
- 	withGroupByThrottlePolicy = java.lang.Boolean
- 	withGroupByOperationName = java.lang.Boolean
- 	withGroupByResourceName = java.lang.Boolean
- 	withBlobContainerSasUri = java.lang.String
```
## ListByResourceGroupSnapshots parameterss:

```
- setResourceGroupName = java.lang.String
```
## DeleteGalleryImageVersions parameterss:

```
- setResourceGroupName = java.lang.String
- setGalleryName = java.lang.String
- setGalleryImageName = java.lang.String
- setGalleryImageVersionName = java.lang.String
```
## GetVirtualMachineRunCommands parameterss:

```
- setLocation = java.lang.String
- setCommandId = java.lang.String
```
## ListAvailableSizesAsyncVirtualMachines parameterss:

```
- setResourceGroupName = java.lang.String
- setVmName = java.lang.String
```
## ListNextAsyncUsages parameterss:

```
- setNextPageLink = java.lang.String
```
## ListByResourceGroupNextAsyncSnapshots parameterss:

```
- setNextPageLink = java.lang.String
```
## ListByGalleryImageNextGalleryImageVersions parameterss:

```
- setNextPageLink = java.lang.String
```
## ListSinglePageAsyncImages parameterss:

```
```
## DeleteSnapshots parameterss:

```
- setResourceGroupName = java.lang.String
- setSnapshotName = java.lang.String
```
## ListByResourceGroupAsyncImages parameterss:

```
- setResourceGroupName = java.lang.String
```
## ListSkusVirtualMachineScaleSets parameterss:

```
- setResourceGroupName = java.lang.String
- setVmScaleSetName = java.lang.String
```
## ListNextWithServiceResponseAsyncVirtualMachines parameterss:

```
- setNextPageLink = java.lang.String
```
## BeginCreateOrUpdateGalleryImages parameterss:

```
- setResourceGroupName = java.lang.String
- setGalleryName = java.lang.String
- setGalleryImageName = java.lang.String
- setGalleryImage = com.microsoft.azure.management.compute.implementation.GalleryImageInner
- 	withIdentifier = com.microsoft.azure.management.compute.GalleryImageIdentifier
- 		withSku = java.lang.String
- 		withPublisher = java.lang.String
- 		withOffer = java.lang.String
- 	withOsType = com.microsoft.azure.management.compute.OperatingSystemTypes
- 	withDescription = java.lang.String
- 	withEula = java.lang.String
- 	withPrivacyStatementUri = java.lang.String
- 	withReleaseNoteUri = java.lang.String
- 	withOsState = com.microsoft.azure.management.compute.OperatingSystemStateTypes
- 	withRecommended = com.microsoft.azure.management.compute.RecommendedMachineConfiguration
- 		withVCPUs = com.microsoft.azure.management.compute.ResourceRange
- 			withMin = java.lang.Integer
- 			withMax = java.lang.Integer
- 		withMemory = com.microsoft.azure.management.compute.ResourceRange
- 			withMin = java.lang.Integer
- 			withMax = java.lang.Integer
- 	withEndOfLifeDate = org.joda.time.DateTime
- 		withChronology = org.joda.time.Chronology
- 			withZone = org.joda.time.DateTimeZone
- 		withMillis = long
- 		withZone = org.joda.time.DateTimeZone
- 		withZoneRetainFields = org.joda.time.DateTimeZone
- 		withFields = org.joda.time.ReadablePartial
- 		withEra = int
- 		withCenturyOfEra = int
- 		withYearOfEra = int
- 		withYearOfCentury = int
- 		withYear = int
- 		withWeekyear = int
- 		withMonthOfYear = int
- 		withWeekOfWeekyear = int
- 		withDayOfYear = int
- 		withDayOfMonth = int
- 		withDayOfWeek = int
- 		withHourOfDay = int
- 		withMinuteOfHour = int
- 		withSecondOfMinute = int
- 		withMillisOfSecond = int
- 		withMillisOfDay = int
- 	withDisallowed = com.microsoft.azure.management.compute.Disallowed
- 		withDiskTypes = java.util.List<java.lang.String>
- 	withPurchasePlan = com.microsoft.azure.management.compute.ImagePurchasePlan
- 		withName = java.lang.String
- 		withPublisher = java.lang.String
- 		withProduct = java.lang.String
- 	withLocation = java.lang.String
- 	withTags = java.util.Map<java.lang.String, java.lang.String>
```
## ListNextResourceSkus parameterss:

```
- setNextPageLink = java.lang.String
```
## BeginExportRequestRateByIntervalLogAnalytics parameterss:

```
- setLocation = java.lang.String
- setParameters = com.microsoft.azure.management.compute.RequestRateByIntervalInput
- 	withIntervalLength = com.microsoft.azure.management.compute.IntervalInMins
- 	withFromTime = org.joda.time.DateTime
- 		withChronology = org.joda.time.Chronology
- 			withZone = org.joda.time.DateTimeZone
- 		withMillis = long
- 		withZone = org.joda.time.DateTimeZone
- 		withZoneRetainFields = org.joda.time.DateTimeZone
- 		withFields = org.joda.time.ReadablePartial
- 		withEra = int
- 		withCenturyOfEra = int
- 		withYearOfEra = int
- 		withYearOfCentury = int
- 		withYear = int
- 		withWeekyear = int
- 		withMonthOfYear = int
- 		withWeekOfWeekyear = int
- 		withDayOfYear = int
- 		withDayOfMonth = int
- 		withDayOfWeek = int
- 		withHourOfDay = int
- 		withMinuteOfHour = int
- 		withSecondOfMinute = int
- 		withMillisOfSecond = int
- 		withMillisOfDay = int
- 	withToTime = org.joda.time.DateTime
- 		withChronology = org.joda.time.Chronology
- 			withZone = org.joda.time.DateTimeZone
- 		withMillis = long
- 		withZone = org.joda.time.DateTimeZone
- 		withZoneRetainFields = org.joda.time.DateTimeZone
- 		withFields = org.joda.time.ReadablePartial
- 		withEra = int
- 		withCenturyOfEra = int
- 		withYearOfEra = int
- 		withYearOfCentury = int
- 		withYear = int
- 		withWeekyear = int
- 		withMonthOfYear = int
- 		withWeekOfWeekyear = int
- 		withDayOfYear = int
- 		withDayOfMonth = int
- 		withDayOfWeek = int
- 		withHourOfDay = int
- 		withMinuteOfHour = int
- 		withSecondOfMinute = int
- 		withMillisOfSecond = int
- 		withMillisOfDay = int
- 	withGroupByThrottlePolicy = java.lang.Boolean
- 	withGroupByOperationName = java.lang.Boolean
- 	withGroupByResourceName = java.lang.Boolean
- 	withBlobContainerSasUri = java.lang.String
```
## ListAvailableSizesVirtualMachines parameterss:

```
- setResourceGroupName = java.lang.String
- setVmName = java.lang.String
```
## ListByResourceGroupDisks parameterss:

```
- setResourceGroupName = java.lang.String
```
## DeleteWithServiceResponseAsyncDisks parameterss:

```
- setResourceGroupName = java.lang.String
- setDiskName = java.lang.String
```
## CreateOrUpdateGalleries parameterss:

```
- setResourceGroupName = java.lang.String
- setGalleryName = java.lang.String
- setGallery = com.microsoft.azure.management.compute.implementation.GalleryInner
- 	withIdentifier = com.microsoft.azure.management.compute.GalleryIdentifier
- 	withDescription = java.lang.String
- 	withLocation = java.lang.String
- 	withTags = java.util.Map<java.lang.String, java.lang.String>
```
## DeleteWithServiceResponseAsyncGalleryImages parameterss:

```
- setResourceGroupName = java.lang.String
- setGalleryName = java.lang.String
- setGalleryImageName = java.lang.String
```
## ListPublishersVirtualMachineImages parameterss:

```
- setLocation = java.lang.String
```
## DeleteInstancesVirtualMachineScaleSets parameterss:

```
- setResourceGroupName = java.lang.String
- setInstanceIds = java.util.List<java.lang.String>
- setVmScaleSetName = java.lang.String
```
## GetByResourceGroupImages parameterss:

```
- setImageName = java.lang.String
- setResourceGroupName = java.lang.String
```
## ListAvailableSizesAsyncAvailabilitySets parameterss:

```
- setResourceGroupName = java.lang.String
- setAvailabilitySetName = java.lang.String
```
## ListSkusNextAsyncVirtualMachineScaleSets parameterss:

```
- setNextPageLink = java.lang.String
```
## ListAvailableSizesWithServiceResponseAsyncAvailabilitySets parameterss:

```
- setResourceGroupName = java.lang.String
- setAvailabilitySetName = java.lang.String
```
## ListWithServiceResponseAsyncVirtualMachineScaleSetExtensions parameterss:

```
- setResourceGroupName = java.lang.String
- setVmScaleSetName = java.lang.String
```
## BeginUpdateVirtualMachineExtensions parameterss:

```
- setResourceGroupName = java.lang.String
- setVmName = java.lang.String
- setVmExtensionName = java.lang.String
- setExtensionParameters = com.microsoft.azure.management.compute.VirtualMachineExtensionUpdate
- 	withForceUpdateTag = java.lang.String
- 	withPublisher = java.lang.String
- 	withTypeHandlerVersion = java.lang.String
- 	withAutoUpgradeMinorVersion = java.lang.Boolean
- 	withSettings = java.lang.Object
- 	withProtectedSettings = java.lang.Object
- 	withType = java.lang.String
- 	withTags = java.util.Map<java.lang.String, java.lang.String>
```
## ListSkusWithServiceResponseAsyncVirtualMachineImages parameterss:

```
- setLocation = java.lang.String
- setOffer = java.lang.String
- setPublisherName = java.lang.String
```
## ListByResourceGroupNextSinglePageAsyncImages parameterss:

```
- setNextPageLink = java.lang.String
```
## ListVersionsVirtualMachineExtensionImages parameterss:

```
- setLocation = java.lang.String
- setType = java.lang.String
- setPublisherName = java.lang.String
```
## ListByResourceGroupNextAsyncGalleries parameterss:

```
- setNextPageLink = java.lang.String
```
## ListByResourceGroupWithServiceResponseAsyncVirtualMachineScaleSets parameterss:

```
- setResourceGroupName = java.lang.String
```
## ListOperations parameterss:

```
```
## CreateOrUpdateVirtualMachines parameterss:

```
- setResourceGroupName = java.lang.String
- setVmName = java.lang.String
- setParameters = com.microsoft.azure.management.compute.implementation.VirtualMachineInner
- 	withPlan = com.microsoft.azure.management.compute.Plan
- 		withName = java.lang.String
- 		withPublisher = java.lang.String
- 		withProduct = java.lang.String
- 		withPromotionCode = java.lang.String
- 	withStorageProfile = com.microsoft.azure.management.compute.StorageProfile
- 		withImageReference = com.microsoft.azure.management.compute.ImageReference
- 			withSku = java.lang.String
- 			withPublisher = java.lang.String
- 			withOffer = java.lang.String
- 			withVersion = java.lang.String
- 			withId = java.lang.String
- 		withOsDisk = com.microsoft.azure.management.compute.OSDisk
- 			withName = java.lang.String
- 			withEncryptionSettings = com.microsoft.azure.management.compute.DiskEncryptionSettings
- 				withEnabled = java.lang.Boolean
- 				withDiskEncryptionKey = com.microsoft.azure.management.compute.KeyVaultSecretReference
- 					withSourceVault = com.microsoft.azure.SubResource
- 						withId = java.lang.String
- 					withSecretUrl = java.lang.String
- 				withKeyEncryptionKey = com.microsoft.azure.management.compute.KeyVaultKeyReference
- 					withSourceVault = com.microsoft.azure.SubResource
- 						withId = java.lang.String
- 					withKeyUrl = java.lang.String
- 			withOsType = com.microsoft.azure.management.compute.OperatingSystemTypes
- 			withDiskSizeGB = java.lang.Integer
- 			withCreateOption = com.microsoft.azure.management.compute.DiskCreateOptionTypes
- 			withCaching = com.microsoft.azure.management.compute.CachingTypes
- 			withWriteAcceleratorEnabled = java.lang.Boolean
- 			withImage = com.microsoft.azure.management.compute.VirtualHardDisk
- 				withUri = java.lang.String
- 			withManagedDisk = com.microsoft.azure.management.compute.ManagedDiskParameters
- 				withStorageAccountType = com.microsoft.azure.management.compute.StorageAccountTypes
- 				withId = java.lang.String
- 			withVhd = com.microsoft.azure.management.compute.VirtualHardDisk
- 				withUri = java.lang.String
- 		withDataDisks = java.util.List<com.microsoft.azure.management.compute.DataDisk>
- 			withName = java.lang.String
- 			withDiskSizeGB = java.lang.Integer
- 			withLun = int
- 			withCreateOption = com.microsoft.azure.management.compute.DiskCreateOptionTypes
- 			withCaching = com.microsoft.azure.management.compute.CachingTypes
- 			withWriteAcceleratorEnabled = java.lang.Boolean
- 			withImage = com.microsoft.azure.management.compute.VirtualHardDisk
- 				withUri = java.lang.String
- 			withManagedDisk = com.microsoft.azure.management.compute.ManagedDiskParameters
- 				withStorageAccountType = com.microsoft.azure.management.compute.StorageAccountTypes
- 				withId = java.lang.String
- 			withVhd = com.microsoft.azure.management.compute.VirtualHardDisk
- 				withUri = java.lang.String
- 	withHardwareProfile = com.microsoft.azure.management.compute.HardwareProfile
- 		withVmSize = com.microsoft.azure.management.compute.VirtualMachineSizeTypes
- 	withOsProfile = com.microsoft.azure.management.compute.OSProfile
- 		withLinuxConfiguration = com.microsoft.azure.management.compute.LinuxConfiguration
- 			withProvisionVMAgent = java.lang.Boolean
- 			withDisablePasswordAuthentication = java.lang.Boolean
- 			withSsh = com.microsoft.azure.management.compute.SshConfiguration
- 				withPublicKeys = java.util.List<com.microsoft.azure.management.compute.SshPublicKey>
- 					withPath = java.lang.String
- 					withKeyData = java.lang.String
- 		withCustomData = java.lang.String
- 		withWindowsConfiguration = com.microsoft.azure.management.compute.WindowsConfiguration
- 			withProvisionVMAgent = java.lang.Boolean
- 			withEnableAutomaticUpdates = java.lang.Boolean
- 			withTimeZone = java.lang.String
- 			withWinRM = com.microsoft.azure.management.compute.WinRMConfiguration
- 				withListeners = java.util.List<com.microsoft.azure.management.compute.WinRMListener>
- 					withCertificateUrl = java.lang.String
- 					withProtocol = com.microsoft.azure.management.compute.ProtocolTypes
- 			withAdditionalUnattendContent = java.util.List<com.microsoft.azure.management.compute.AdditionalUnattendContent>
- 				withPassName = com.microsoft.azure.management.compute.PassNames
- 				withComponentName = com.microsoft.azure.management.compute.ComponentNames
- 				withSettingName = com.microsoft.azure.management.compute.SettingNames
- 				withContent = java.lang.String
- 		withSecrets = java.util.List<com.microsoft.azure.management.compute.VaultSecretGroup>
- 			withSourceVault = com.microsoft.azure.SubResource
- 				withId = java.lang.String
- 			withVaultCertificates = java.util.List<com.microsoft.azure.management.compute.VaultCertificate>
- 				withCertificateUrl = java.lang.String
- 				withCertificateStore = java.lang.String
- 		withComputerName = java.lang.String
- 		withAllowExtensionOperations = java.lang.Boolean
- 		withAdminUsername = java.lang.String
- 		withAdminPassword = java.lang.String
- 	withNetworkProfile = com.microsoft.azure.management.compute.NetworkProfile
- 		withNetworkInterfaces = java.util.List<com.microsoft.azure.management.compute.NetworkInterfaceReference>
- 			withPrimary = java.lang.Boolean
- 			withId = java.lang.String
- 	withDiagnosticsProfile = com.microsoft.azure.management.compute.DiagnosticsProfile
- 		withBootDiagnostics = com.microsoft.azure.management.compute.BootDiagnostics
- 			withEnabled = java.lang.Boolean
- 			withStorageUri = java.lang.String
- 	withLicenseType = java.lang.String
- 	withAvailabilitySet = com.microsoft.azure.SubResource
- 		withId = java.lang.String
- 	withIdentity = com.microsoft.azure.management.compute.VirtualMachineIdentity
- 		withType = com.microsoft.azure.management.compute.ResourceIdentityType
- 		withUserAssignedIdentities = java.util.Map<java.lang.String, com.microsoft.azure.management.compute.VirtualMachineIdentityUserAssignedIdentitiesValue>
- 	withZones = java.util.List<java.lang.String>
- 	withLocation = java.lang.String
- 	withTags = java.util.Map<java.lang.String, java.lang.String>
```
## DeleteDisks parameterss:

```
- setResourceGroupName = java.lang.String
- setDiskName = java.lang.String
```
## GetVirtualMachineImages parameterss:

```
- setVersion = java.lang.String
- setLocation = java.lang.String
- setOffer = java.lang.String
- setPublisherName = java.lang.String
- setSkus = java.lang.String
```
## ListByResourceGroupWithServiceResponseAsyncImages parameterss:

```
- setResourceGroupName = java.lang.String
```
## CreateOrUpdateSnapshots parameterss:

```
- setResourceGroupName = java.lang.String
- setSnapshotName = java.lang.String
- setSnapshot = com.microsoft.azure.management.compute.implementation.SnapshotInner
- 	withSku = com.microsoft.azure.management.compute.SnapshotSku
- 		withName = com.microsoft.azure.management.compute.SnapshotStorageAccountTypes
- 	withCreationData = com.microsoft.azure.management.compute.CreationData
- 		withImageReference = com.microsoft.azure.management.compute.ImageDiskReference
- 			withId = java.lang.String
- 			withLun = java.lang.Integer
- 		withCreateOption = com.microsoft.azure.management.compute.DiskCreateOption
- 		withSourceUri = java.lang.String
- 		withSourceResourceId = java.lang.String
- 		withStorageAccountId = java.lang.String
- 	withEncryptionSettings = com.microsoft.azure.management.compute.EncryptionSettings
- 		withEnabled = java.lang.Boolean
- 		withDiskEncryptionKey = com.microsoft.azure.management.compute.KeyVaultAndSecretReference
- 			withSourceVault = com.microsoft.azure.management.compute.SourceVault
- 				withId = java.lang.String
- 			withSecretUrl = java.lang.String
- 		withKeyEncryptionKey = com.microsoft.azure.management.compute.KeyVaultAndKeyReference
- 			withSourceVault = com.microsoft.azure.management.compute.SourceVault
- 				withId = java.lang.String
- 			withKeyUrl = java.lang.String
- 	withOsType = com.microsoft.azure.management.compute.OperatingSystemTypes
- 	withDiskSizeGB = java.lang.Integer
- 	withLocation = java.lang.String
- 	withTags = java.util.Map<java.lang.String, java.lang.String>
```
## DeleteAsyncVirtualMachineScaleSetVMs parameterss:

```
- setResourceGroupName = java.lang.String
- setVmScaleSetName = java.lang.String
- setInstanceId = java.lang.String
```
## UpdateVirtualMachineExtensions parameterss:

```
- setResourceGroupName = java.lang.String
- setVmName = java.lang.String
- setVmExtensionName = java.lang.String
- setExtensionParameters = com.microsoft.azure.management.compute.VirtualMachineExtensionUpdate
- 	withForceUpdateTag = java.lang.String
- 	withPublisher = java.lang.String
- 	withTypeHandlerVersion = java.lang.String
- 	withAutoUpgradeMinorVersion = java.lang.Boolean
- 	withSettings = java.lang.Object
- 	withProtectedSettings = java.lang.Object
- 	withType = java.lang.String
- 	withTags = java.util.Map<java.lang.String, java.lang.String>
```
## ListAsyncVirtualMachineRunCommands parameterss:

```
- setLocation = java.lang.String
```
## DeleteAsyncImages parameterss:

```
- setImageName = java.lang.String
- setResourceGroupName = java.lang.String
```
## ListOffersWithServiceResponseAsyncVirtualMachineImages parameterss:

```
- setLocation = java.lang.String
- setPublisherName = java.lang.String
```
## ListByGallerySinglePageAsyncGalleryImages parameterss:

```
- setResourceGroupName = java.lang.String
- setGalleryName = java.lang.String
```
## CreateOrUpdateVirtualMachineScaleSets parameterss:

```
- setResourceGroupName = java.lang.String
- setParameters = com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner
- 	withPlatformFaultDomainCount = java.lang.Integer
- 	withSku = com.microsoft.azure.management.compute.Sku
- 		withName = java.lang.String
- 		withTier = java.lang.String
- 		withCapacity = java.lang.Long
- 	withPlan = com.microsoft.azure.management.compute.Plan
- 		withName = java.lang.String
- 		withPublisher = java.lang.String
- 		withProduct = java.lang.String
- 		withPromotionCode = java.lang.String
- 	withIdentity = com.microsoft.azure.management.compute.VirtualMachineScaleSetIdentity
- 		withType = com.microsoft.azure.management.compute.ResourceIdentityType
- 		withUserAssignedIdentities = java.util.Map<java.lang.String, com.microsoft.azure.management.compute.VirtualMachineScaleSetIdentityUserAssignedIdentitiesValue>
- 	withZones = java.util.List<java.lang.String>
- 	withUpgradePolicy = com.microsoft.azure.management.compute.UpgradePolicy
- 		withRollingUpgradePolicy = com.microsoft.azure.management.compute.RollingUpgradePolicy
- 			withMaxBatchInstancePercent = java.lang.Integer
- 			withMaxUnhealthyInstancePercent = java.lang.Integer
- 			withMaxUnhealthyUpgradedInstancePercent = java.lang.Integer
- 			withPauseTimeBetweenBatches = java.lang.String
- 		withAutomaticOSUpgrade = java.lang.Boolean
- 		withAutoOSUpgradePolicy = com.microsoft.azure.management.compute.AutoOSUpgradePolicy
- 			withDisableAutoRollback = java.lang.Boolean
- 		withMode = com.microsoft.azure.management.compute.UpgradeMode
- 	withVirtualMachineProfile = com.microsoft.azure.management.compute.VirtualMachineScaleSetVMProfile
- 		withStorageProfile = com.microsoft.azure.management.compute.VirtualMachineScaleSetStorageProfile
- 			withImageReference = com.microsoft.azure.management.compute.ImageReference
- 				withSku = java.lang.String
- 				withPublisher = java.lang.String
- 				withOffer = java.lang.String
- 				withVersion = java.lang.String
- 				withId = java.lang.String
- 			withOsDisk = com.microsoft.azure.management.compute.VirtualMachineScaleSetOSDisk
- 				withName = java.lang.String
- 				withOsType = com.microsoft.azure.management.compute.OperatingSystemTypes
- 				withCreateOption = com.microsoft.azure.management.compute.DiskCreateOptionTypes
- 				withCaching = com.microsoft.azure.management.compute.CachingTypes
- 				withWriteAcceleratorEnabled = java.lang.Boolean
- 				withImage = com.microsoft.azure.management.compute.VirtualHardDisk
- 					withUri = java.lang.String
- 				withVhdContainers = java.util.List<java.lang.String>
- 				withManagedDisk = com.microsoft.azure.management.compute.VirtualMachineScaleSetManagedDiskParameters
- 					withStorageAccountType = com.microsoft.azure.management.compute.StorageAccountTypes
- 			withDataDisks = java.util.List<com.microsoft.azure.management.compute.VirtualMachineScaleSetDataDisk>
- 				withName = java.lang.String
- 				withDiskSizeGB = java.lang.Integer
- 				withLun = int
- 				withCreateOption = com.microsoft.azure.management.compute.DiskCreateOptionTypes
- 				withCaching = com.microsoft.azure.management.compute.CachingTypes
- 				withWriteAcceleratorEnabled = java.lang.Boolean
- 				withManagedDisk = com.microsoft.azure.management.compute.VirtualMachineScaleSetManagedDiskParameters
- 					withStorageAccountType = com.microsoft.azure.management.compute.StorageAccountTypes
- 		withOsProfile = com.microsoft.azure.management.compute.VirtualMachineScaleSetOSProfile
- 			withLinuxConfiguration = com.microsoft.azure.management.compute.LinuxConfiguration
- 				withProvisionVMAgent = java.lang.Boolean
- 				withDisablePasswordAuthentication = java.lang.Boolean
- 				withSsh = com.microsoft.azure.management.compute.SshConfiguration
- 					withPublicKeys = java.util.List<com.microsoft.azure.management.compute.SshPublicKey>
- 						withPath = java.lang.String
- 						withKeyData = java.lang.String
- 			withCustomData = java.lang.String
- 			withWindowsConfiguration = com.microsoft.azure.management.compute.WindowsConfiguration
- 				withProvisionVMAgent = java.lang.Boolean
- 				withEnableAutomaticUpdates = java.lang.Boolean
- 				withTimeZone = java.lang.String
- 				withWinRM = com.microsoft.azure.management.compute.WinRMConfiguration
- 					withListeners = java.util.List<com.microsoft.azure.management.compute.WinRMListener>
- 						withCertificateUrl = java.lang.String
- 						withProtocol = com.microsoft.azure.management.compute.ProtocolTypes
- 				withAdditionalUnattendContent = java.util.List<com.microsoft.azure.management.compute.AdditionalUnattendContent>
- 					withPassName = com.microsoft.azure.management.compute.PassNames
- 					withComponentName = com.microsoft.azure.management.compute.ComponentNames
- 					withSettingName = com.microsoft.azure.management.compute.SettingNames
- 					withContent = java.lang.String
- 			withSecrets = java.util.List<com.microsoft.azure.management.compute.VaultSecretGroup>
- 				withSourceVault = com.microsoft.azure.SubResource
- 					withId = java.lang.String
- 				withVaultCertificates = java.util.List<com.microsoft.azure.management.compute.VaultCertificate>
- 					withCertificateUrl = java.lang.String
- 					withCertificateStore = java.lang.String
- 			withAdminUsername = java.lang.String
- 			withAdminPassword = java.lang.String
- 			withComputerNamePrefix = java.lang.String
- 		withNetworkProfile = com.microsoft.azure.management.compute.VirtualMachineScaleSetNetworkProfile
- 			withNetworkInterfaceConfigurations = java.util.List<com.microsoft.azure.management.compute.VirtualMachineScaleSetNetworkConfiguration>
- 				withName = java.lang.String
- 				withPrimary = java.lang.Boolean
- 				withEnableAcceleratedNetworking = java.lang.Boolean
- 				withNetworkSecurityGroup = com.microsoft.azure.SubResource
- 					withId = java.lang.String
- 				withDnsSettings = com.microsoft.azure.management.compute.VirtualMachineScaleSetNetworkConfigurationDnsSettings
- 					withDnsServers = java.util.List<java.lang.String>
- 				withIpConfigurations = java.util.List<com.microsoft.azure.management.compute.VirtualMachineScaleSetIPConfiguration>
- 					withName = java.lang.String
- 					withPrimary = java.lang.Boolean
- 					withSubnet = com.microsoft.azure.management.compute.ApiEntityReference
- 						withId = java.lang.String
- 					withPublicIPAddressConfiguration = com.microsoft.azure.management.compute.VirtualMachineScaleSetPublicIPAddressConfiguration
- 						withName = java.lang.String
- 						withDnsSettings = com.microsoft.azure.management.compute.VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettings
- 							withDomainNameLabel = java.lang.String
- 						withIdleTimeoutInMinutes = java.lang.Integer
- 						withIpTags = java.util.List<com.microsoft.azure.management.compute.VirtualMachineScaleSetIpTag>
- 							withIpTagType = java.lang.String
- 							withTag = java.lang.String
- 					withPrivateIPAddressVersion = com.microsoft.azure.management.compute.IPVersion
- 					withApplicationGatewayBackendAddressPools = java.util.List<com.microsoft.azure.SubResource>
- 						withId = java.lang.String
- 					withLoadBalancerBackendAddressPools = java.util.List<com.microsoft.azure.SubResource>
- 						withId = java.lang.String
- 					withLoadBalancerInboundNatPools = java.util.List<com.microsoft.azure.SubResource>
- 						withId = java.lang.String
- 					withApplicationSecurityGroups = java.util.List<com.microsoft.azure.SubResource>
- 						withId = java.lang.String
- 					withId = java.lang.String
- 				withEnableIPForwarding = java.lang.Boolean
- 				withId = java.lang.String
- 			withHealthProbe = com.microsoft.azure.management.compute.ApiEntityReference
- 				withId = java.lang.String
- 		withDiagnosticsProfile = com.microsoft.azure.management.compute.DiagnosticsProfile
- 			withBootDiagnostics = com.microsoft.azure.management.compute.BootDiagnostics
- 				withEnabled = java.lang.Boolean
- 				withStorageUri = java.lang.String
- 		withLicenseType = java.lang.String
- 		withExtensionProfile = com.microsoft.azure.management.compute.VirtualMachineScaleSetExtensionProfile
- 			withExtensions = java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner>
- 				withName = java.lang.String
- 				withForceUpdateTag = java.lang.String
- 				withPublisher = java.lang.String
- 				withTypeHandlerVersion = java.lang.String
- 				withAutoUpgradeMinorVersion = java.lang.Boolean
- 				withSettings = java.lang.Object
- 				withProtectedSettings = java.lang.Object
- 				withType = java.lang.String
- 		withPriority = com.microsoft.azure.management.compute.VirtualMachinePriorityTypes
- 		withEvictionPolicy = com.microsoft.azure.management.compute.VirtualMachineEvictionPolicyTypes
- 	withOverprovision = java.lang.Boolean
- 	withSinglePlacementGroup = java.lang.Boolean
- 	withZoneBalance = java.lang.Boolean
- 	withLocation = java.lang.String
- 	withTags = java.util.Map<java.lang.String, java.lang.String>
- setVmScaleSetName = java.lang.String
```
## BeginCreateOrUpdateSnapshots parameterss:

```
- setResourceGroupName = java.lang.String
- setSnapshotName = java.lang.String
- setSnapshot = com.microsoft.azure.management.compute.implementation.SnapshotInner
- 	withSku = com.microsoft.azure.management.compute.SnapshotSku
- 		withName = com.microsoft.azure.management.compute.SnapshotStorageAccountTypes
- 	withCreationData = com.microsoft.azure.management.compute.CreationData
- 		withImageReference = com.microsoft.azure.management.compute.ImageDiskReference
- 			withId = java.lang.String
- 			withLun = java.lang.Integer
- 		withCreateOption = com.microsoft.azure.management.compute.DiskCreateOption
- 		withSourceUri = java.lang.String
- 		withSourceResourceId = java.lang.String
- 		withStorageAccountId = java.lang.String
- 	withEncryptionSettings = com.microsoft.azure.management.compute.EncryptionSettings
- 		withEnabled = java.lang.Boolean
- 		withDiskEncryptionKey = com.microsoft.azure.management.compute.KeyVaultAndSecretReference
- 			withSourceVault = com.microsoft.azure.management.compute.SourceVault
- 				withId = java.lang.String
- 			withSecretUrl = java.lang.String
- 		withKeyEncryptionKey = com.microsoft.azure.management.compute.KeyVaultAndKeyReference
- 			withSourceVault = com.microsoft.azure.management.compute.SourceVault
- 				withId = java.lang.String
- 			withKeyUrl = java.lang.String
- 	withOsType = com.microsoft.azure.management.compute.OperatingSystemTypes
- 	withDiskSizeGB = java.lang.Integer
- 	withLocation = java.lang.String
- 	withTags = java.util.Map<java.lang.String, java.lang.String>
```
## ListByGalleryGalleryImages parameterss:

```
- setResourceGroupName = java.lang.String
- setGalleryName = java.lang.String
```
## UpdateAvailabilitySets parameterss:

```
- setResourceGroupName = java.lang.String
- setAvailabilitySetName = java.lang.String
- setParameters = com.microsoft.azure.management.compute.AvailabilitySetUpdate
- 	withPlatformFaultDomainCount = java.lang.Integer
- 	withVirtualMachines = java.util.List<com.microsoft.azure.SubResource>
- 		withId = java.lang.String
- 	withSku = com.microsoft.azure.management.compute.Sku
- 		withName = java.lang.String
- 		withTier = java.lang.String
- 		withCapacity = java.lang.Long
- 	withPlatformUpdateDomainCount = java.lang.Integer
- 	withTags = java.util.Map<java.lang.String, java.lang.String>
```
## GetGalleryImageVersions parameterss:

```
- setResourceGroupName = java.lang.String
- setGalleryName = java.lang.String
- setGalleryImageName = java.lang.String
- setGalleryImageVersionName = java.lang.String
```
## ListWithServiceResponseAsyncVirtualMachineSizes parameterss:

```
- setLocation = java.lang.String
```
## ListAvailableSizesAvailabilitySets parameterss:

```
- setResourceGroupName = java.lang.String
- setAvailabilitySetName = java.lang.String
```
## DeleteWithServiceResponseAsyncVirtualMachineScaleSetExtensions parameterss:

```
- setResourceGroupName = java.lang.String
- setVmScaleSetName = java.lang.String
- setVmssExtensionName = java.lang.String
```
## ListByGalleryImageNextWithServiceResponseAsyncGalleryImageVersions parameterss:

```
- setNextPageLink = java.lang.String
```
## ListAsyncVirtualMachineImages parameterss:

```
- setLocation = java.lang.String
- setOffer = java.lang.String
- setPublisherName = java.lang.String
- setSkus = java.lang.String
```
## ListByResourceGroupImages parameterss:

```
- setResourceGroupName = java.lang.String
```
## UpdateImages parameterss:

```
- setImageName = java.lang.String
- setResourceGroupName = java.lang.String
- setParameters = com.microsoft.azure.management.compute.ImageUpdate
- 	withSourceVirtualMachine = com.microsoft.azure.SubResource
- 		withId = java.lang.String
- 	withStorageProfile = com.microsoft.azure.management.compute.ImageStorageProfile
- 		withOsDisk = com.microsoft.azure.management.compute.ImageOSDisk
- 			withOsType = com.microsoft.azure.management.compute.OperatingSystemTypes
- 			withDiskSizeGB = java.lang.Integer
- 			withOsState = com.microsoft.azure.management.compute.OperatingSystemStateTypes
- 			withCaching = com.microsoft.azure.management.compute.CachingTypes
- 			withStorageAccountType = com.microsoft.azure.management.compute.StorageAccountTypes
- 			withManagedDisk = com.microsoft.azure.SubResource
- 				withId = java.lang.String
- 			withSnapshot = com.microsoft.azure.SubResource
- 				withId = java.lang.String
- 			withBlobUri = java.lang.String
- 		withDataDisks = java.util.List<com.microsoft.azure.management.compute.ImageDataDisk>
- 			withDiskSizeGB = java.lang.Integer
- 			withLun = int
- 			withCaching = com.microsoft.azure.management.compute.CachingTypes
- 			withStorageAccountType = com.microsoft.azure.management.compute.StorageAccountTypes
- 			withManagedDisk = com.microsoft.azure.SubResource
- 				withId = java.lang.String
- 			withSnapshot = com.microsoft.azure.SubResource
- 				withId = java.lang.String
- 			withBlobUri = java.lang.String
- 		withZoneResilient = java.lang.Boolean
- 	withTags = java.util.Map<java.lang.String, java.lang.String>
```
## ListByResourceGroupVirtualMachines parameterss:

```
- setResourceGroupName = java.lang.String
```
## CreateOrUpdateDisks parameterss:

```
- setResourceGroupName = java.lang.String
- setDiskName = java.lang.String
- setDisk = com.microsoft.azure.management.compute.implementation.DiskInner
- 	withSku = com.microsoft.azure.management.compute.DiskSku
- 		withName = com.microsoft.azure.management.compute.StorageAccountTypes
- 	withZones = java.util.List<java.lang.String>
- 	withCreationData = com.microsoft.azure.management.compute.CreationData
- 		withImageReference = com.microsoft.azure.management.compute.ImageDiskReference
- 			withId = java.lang.String
- 			withLun = java.lang.Integer
- 		withCreateOption = com.microsoft.azure.management.compute.DiskCreateOption
- 		withSourceUri = java.lang.String
- 		withSourceResourceId = java.lang.String
- 		withStorageAccountId = java.lang.String
- 	withEncryptionSettings = com.microsoft.azure.management.compute.EncryptionSettings
- 		withEnabled = java.lang.Boolean
- 		withDiskEncryptionKey = com.microsoft.azure.management.compute.KeyVaultAndSecretReference
- 			withSourceVault = com.microsoft.azure.management.compute.SourceVault
- 				withId = java.lang.String
- 			withSecretUrl = java.lang.String
- 		withKeyEncryptionKey = com.microsoft.azure.management.compute.KeyVaultAndKeyReference
- 			withSourceVault = com.microsoft.azure.management.compute.SourceVault
- 				withId = java.lang.String
- 			withKeyUrl = java.lang.String
- 	withOsType = com.microsoft.azure.management.compute.OperatingSystemTypes
- 	withDiskSizeGB = java.lang.Integer
- 	withLocation = java.lang.String
- 	withTags = java.util.Map<java.lang.String, java.lang.String>
```
## ListNextVirtualMachineScaleSetExtensions parameterss:

```
- setNextPageLink = java.lang.String
```
## ListNextSinglePageAsyncVirtualMachineScaleSetExtensions parameterss:

```
- setNextPageLink = java.lang.String
```
## ListSnapshots parameterss:

```
```
## ListNextAsyncImages parameterss:

```
- setNextPageLink = java.lang.String
```
## UpdateSnapshots parameterss:

```
- setResourceGroupName = java.lang.String
- setSnapshotName = java.lang.String
- setSnapshot = com.microsoft.azure.management.compute.SnapshotUpdate
- 	withSku = com.microsoft.azure.management.compute.SnapshotSku
- 		withName = com.microsoft.azure.management.compute.SnapshotStorageAccountTypes
- 	withTags = java.util.Map<java.lang.String, java.lang.String>
- 	withEncryptionSettings = com.microsoft.azure.management.compute.EncryptionSettings
- 		withEnabled = java.lang.Boolean
- 		withDiskEncryptionKey = com.microsoft.azure.management.compute.KeyVaultAndSecretReference
- 			withSourceVault = com.microsoft.azure.management.compute.SourceVault
- 				withId = java.lang.String
- 			withSecretUrl = java.lang.String
- 		withKeyEncryptionKey = com.microsoft.azure.management.compute.KeyVaultAndKeyReference
- 			withSourceVault = com.microsoft.azure.management.compute.SourceVault
- 				withId = java.lang.String
- 			withKeyUrl = java.lang.String
- 	withOsType = com.microsoft.azure.management.compute.OperatingSystemTypes
- 	withDiskSizeGB = java.lang.Integer
```
## ListTypesVirtualMachineExtensionImages parameterss:

```
- setLocation = java.lang.String
- setPublisherName = java.lang.String
```
## UpdateVirtualMachines parameterss:

```
- setResourceGroupName = java.lang.String
- setVmName = java.lang.String
- setParameters = com.microsoft.azure.management.compute.VirtualMachineUpdate
- 	withPlan = com.microsoft.azure.management.compute.Plan
- 		withName = java.lang.String
- 		withPublisher = java.lang.String
- 		withProduct = java.lang.String
- 		withPromotionCode = java.lang.String
- 	withStorageProfile = com.microsoft.azure.management.compute.StorageProfile
- 		withImageReference = com.microsoft.azure.management.compute.ImageReference
- 			withSku = java.lang.String
- 			withPublisher = java.lang.String
- 			withOffer = java.lang.String
- 			withVersion = java.lang.String
- 			withId = java.lang.String
- 		withOsDisk = com.microsoft.azure.management.compute.OSDisk
- 			withName = java.lang.String
- 			withEncryptionSettings = com.microsoft.azure.management.compute.DiskEncryptionSettings
- 				withEnabled = java.lang.Boolean
- 				withDiskEncryptionKey = com.microsoft.azure.management.compute.KeyVaultSecretReference
- 					withSourceVault = com.microsoft.azure.SubResource
- 						withId = java.lang.String
- 					withSecretUrl = java.lang.String
- 				withKeyEncryptionKey = com.microsoft.azure.management.compute.KeyVaultKeyReference
- 					withSourceVault = com.microsoft.azure.SubResource
- 						withId = java.lang.String
- 					withKeyUrl = java.lang.String
- 			withOsType = com.microsoft.azure.management.compute.OperatingSystemTypes
- 			withDiskSizeGB = java.lang.Integer
- 			withCreateOption = com.microsoft.azure.management.compute.DiskCreateOptionTypes
- 			withCaching = com.microsoft.azure.management.compute.CachingTypes
- 			withWriteAcceleratorEnabled = java.lang.Boolean
- 			withImage = com.microsoft.azure.management.compute.VirtualHardDisk
- 				withUri = java.lang.String
- 			withManagedDisk = com.microsoft.azure.management.compute.ManagedDiskParameters
- 				withStorageAccountType = com.microsoft.azure.management.compute.StorageAccountTypes
- 				withId = java.lang.String
- 			withVhd = com.microsoft.azure.management.compute.VirtualHardDisk
- 				withUri = java.lang.String
- 		withDataDisks = java.util.List<com.microsoft.azure.management.compute.DataDisk>
- 			withName = java.lang.String
- 			withDiskSizeGB = java.lang.Integer
- 			withLun = int
- 			withCreateOption = com.microsoft.azure.management.compute.DiskCreateOptionTypes
- 			withCaching = com.microsoft.azure.management.compute.CachingTypes
- 			withWriteAcceleratorEnabled = java.lang.Boolean
- 			withImage = com.microsoft.azure.management.compute.VirtualHardDisk
- 				withUri = java.lang.String
- 			withManagedDisk = com.microsoft.azure.management.compute.ManagedDiskParameters
- 				withStorageAccountType = com.microsoft.azure.management.compute.StorageAccountTypes
- 				withId = java.lang.String
- 			withVhd = com.microsoft.azure.management.compute.VirtualHardDisk
- 				withUri = java.lang.String
- 	withHardwareProfile = com.microsoft.azure.management.compute.HardwareProfile
- 		withVmSize = com.microsoft.azure.management.compute.VirtualMachineSizeTypes
- 	withOsProfile = com.microsoft.azure.management.compute.OSProfile
- 		withLinuxConfiguration = com.microsoft.azure.management.compute.LinuxConfiguration
- 			withProvisionVMAgent = java.lang.Boolean
- 			withDisablePasswordAuthentication = java.lang.Boolean
- 			withSsh = com.microsoft.azure.management.compute.SshConfiguration
- 				withPublicKeys = java.util.List<com.microsoft.azure.management.compute.SshPublicKey>
- 					withPath = java.lang.String
- 					withKeyData = java.lang.String
- 		withCustomData = java.lang.String
- 		withWindowsConfiguration = com.microsoft.azure.management.compute.WindowsConfiguration
- 			withProvisionVMAgent = java.lang.Boolean
- 			withEnableAutomaticUpdates = java.lang.Boolean
- 			withTimeZone = java.lang.String
- 			withWinRM = com.microsoft.azure.management.compute.WinRMConfiguration
- 				withListeners = java.util.List<com.microsoft.azure.management.compute.WinRMListener>
- 					withCertificateUrl = java.lang.String
- 					withProtocol = com.microsoft.azure.management.compute.ProtocolTypes
- 			withAdditionalUnattendContent = java.util.List<com.microsoft.azure.management.compute.AdditionalUnattendContent>
- 				withPassName = com.microsoft.azure.management.compute.PassNames
- 				withComponentName = com.microsoft.azure.management.compute.ComponentNames
- 				withSettingName = com.microsoft.azure.management.compute.SettingNames
- 				withContent = java.lang.String
- 		withSecrets = java.util.List<com.microsoft.azure.management.compute.VaultSecretGroup>
- 			withSourceVault = com.microsoft.azure.SubResource
- 				withId = java.lang.String
- 			withVaultCertificates = java.util.List<com.microsoft.azure.management.compute.VaultCertificate>
- 				withCertificateUrl = java.lang.String
- 				withCertificateStore = java.lang.String
- 		withComputerName = java.lang.String
- 		withAllowExtensionOperations = java.lang.Boolean
- 		withAdminUsername = java.lang.String
- 		withAdminPassword = java.lang.String
- 	withNetworkProfile = com.microsoft.azure.management.compute.NetworkProfile
- 		withNetworkInterfaces = java.util.List<com.microsoft.azure.management.compute.NetworkInterfaceReference>
- 			withPrimary = java.lang.Boolean
- 			withId = java.lang.String
- 	withDiagnosticsProfile = com.microsoft.azure.management.compute.DiagnosticsProfile
- 		withBootDiagnostics = com.microsoft.azure.management.compute.BootDiagnostics
- 			withEnabled = java.lang.Boolean
- 			withStorageUri = java.lang.String
- 	withLicenseType = java.lang.String
- 	withAvailabilitySet = com.microsoft.azure.SubResource
- 		withId = java.lang.String
- 	withIdentity = com.microsoft.azure.management.compute.VirtualMachineIdentity
- 		withType = com.microsoft.azure.management.compute.ResourceIdentityType
- 		withUserAssignedIdentities = java.util.Map<java.lang.String, com.microsoft.azure.management.compute.VirtualMachineIdentityUserAssignedIdentitiesValue>
- 	withZones = java.util.List<java.lang.String>
- 	withTags = java.util.Map<java.lang.String, java.lang.String>
```
## ListNextSinglePageAsyncVirtualMachineScaleSets parameterss:

```
- setNextPageLink = java.lang.String
```
## GetByResourceGroupVirtualMachineScaleSets parameterss:

```
- setResourceGroupName = java.lang.String
- setVmScaleSetName = java.lang.String
```
## DeleteVirtualMachineScaleSets parameterss:

```
- setResourceGroupName = java.lang.String
- setVmScaleSetName = java.lang.String
```
## BeginCreateOrUpdateGalleryImageVersions parameterss:

```
- setResourceGroupName = java.lang.String
- setGalleryName = java.lang.String
- setGalleryImageName = java.lang.String
- setGalleryImageVersionName = java.lang.String
- setGalleryImageVersion = com.microsoft.azure.management.compute.implementation.GalleryImageVersionInner
- 	withPublishingProfile = com.microsoft.azure.management.compute.GalleryImageVersionPublishingProfile
- 		withEndOfLifeDate = org.joda.time.DateTime
- 			withChronology = org.joda.time.Chronology
- 				withZone = org.joda.time.DateTimeZone
- 			withMillis = long
- 			withZone = org.joda.time.DateTimeZone
- 			withZoneRetainFields = org.joda.time.DateTimeZone
- 			withFields = org.joda.time.ReadablePartial
- 			withEra = int
- 			withCenturyOfEra = int
- 			withYearOfEra = int
- 			withYearOfCentury = int
- 			withYear = int
- 			withWeekyear = int
- 			withMonthOfYear = int
- 			withWeekOfWeekyear = int
- 			withDayOfYear = int
- 			withDayOfMonth = int
- 			withDayOfWeek = int
- 			withHourOfDay = int
- 			withMinuteOfHour = int
- 			withSecondOfMinute = int
- 			withMillisOfSecond = int
- 			withMillisOfDay = int
- 		withReplicaCount = java.lang.Integer
- 		withExcludeFromLatest = java.lang.Boolean
- 		withSource = com.microsoft.azure.management.compute.GalleryArtifactSource
- 			withManagedImage = com.microsoft.azure.management.compute.ManagedArtifact
- 				withId = java.lang.String
- 		withTargetRegions = java.util.List<com.microsoft.azure.management.compute.TargetRegion>
- 			withName = java.lang.String
- 			withRegionalReplicaCount = java.lang.Integer
- 	withLocation = java.lang.String
- 	withTags = java.util.Map<java.lang.String, java.lang.String>
```
## ListWithServiceResponseAsyncOperations parameterss:

```
```
## ListByResourceGroupNextGalleries parameterss:

```
- setNextPageLink = java.lang.String
```
## BeginCreateOrUpdateVirtualMachineScaleSetExtensions parameterss:

```
- setResourceGroupName = java.lang.String
- setExtensionParameters = com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner
- 	withName = java.lang.String
- 	withForceUpdateTag = java.lang.String
- 	withPublisher = java.lang.String
- 	withTypeHandlerVersion = java.lang.String
- 	withAutoUpgradeMinorVersion = java.lang.Boolean
- 	withSettings = java.lang.Object
- 	withProtectedSettings = java.lang.Object
- 	withType = java.lang.String
- setVmScaleSetName = java.lang.String
- setVmssExtensionName = java.lang.String
```
## ListNextWithServiceResponseAsyncVirtualMachineRunCommands parameterss:

```
- setNextPageLink = java.lang.String
```
## DeleteWithServiceResponseAsyncGalleries parameterss:

```
- setResourceGroupName = java.lang.String
- setGalleryName = java.lang.String
```
## ListSinglePageAsyncResourceSkus parameterss:

```
```
## ListDisks parameterss:

```
```
## GetVirtualMachineScaleSetExtensions parameterss:

```
- setResourceGroupName = java.lang.String
- setVmScaleSetName = java.lang.String
- setVmssExtensionName = java.lang.String
```
## ListSinglePageAsyncGalleries parameterss:

```
```
## ListAsyncVirtualMachineScaleSets parameterss:

```
```
## ListNextImages parameterss:

```
- setNextPageLink = java.lang.String
```
## ListByResourceGroupNextWithServiceResponseAsyncVirtualMachines parameterss:

```
- setNextPageLink = java.lang.String
```
## GetGalleryImages parameterss:

```
- setResourceGroupName = java.lang.String
- setGalleryName = java.lang.String
- setGalleryImageName = java.lang.String
```
## ListByResourceGroupAvailabilitySets parameterss:

```
- setResourceGroupName = java.lang.String
```
## ListByGalleryAsyncGalleryImages parameterss:

```
- setResourceGroupName = java.lang.String
- setGalleryName = java.lang.String
```
## ForceRecoveryServiceFabricPlatformUpdateDomainWalkVirtualMachineScaleSets parameterss:

```
- setResourceGroupName = java.lang.String
- setPlatformUpdateDomain = int
- setVmScaleSetName = java.lang.String
```
## ListNextSinglePageAsyncResourceSkus parameterss:

```
- setNextPageLink = java.lang.String
```
## ListNextAsyncDisks parameterss:

```
- setNextPageLink = java.lang.String
```
## ListUsages parameterss:

```
- setLocation = java.lang.String
```
## ListTypesAsyncVirtualMachineExtensionImages parameterss:

```
- setLocation = java.lang.String
- setPublisherName = java.lang.String
```
## GetByResourceGroupVirtualMachines parameterss:

```
- setResourceGroupName = java.lang.String
- setVmName = java.lang.String
```
## UpdateDisks parameterss:

```
- setResourceGroupName = java.lang.String
- setDiskName = java.lang.String
- setDisk = com.microsoft.azure.management.compute.DiskUpdate
- 	withSku = com.microsoft.azure.management.compute.DiskSku
- 		withName = com.microsoft.azure.management.compute.StorageAccountTypes
- 	withTags = java.util.Map<java.lang.String, java.lang.String>
- 	withEncryptionSettings = com.microsoft.azure.management.compute.EncryptionSettings
- 		withEnabled = java.lang.Boolean
- 		withDiskEncryptionKey = com.microsoft.azure.management.compute.KeyVaultAndSecretReference
- 			withSourceVault = com.microsoft.azure.management.compute.SourceVault
- 				withId = java.lang.String
- 			withSecretUrl = java.lang.String
- 		withKeyEncryptionKey = com.microsoft.azure.management.compute.KeyVaultAndKeyReference
- 			withSourceVault = com.microsoft.azure.management.compute.SourceVault
- 				withId = java.lang.String
- 			withKeyUrl = java.lang.String
- 	withOsType = com.microsoft.azure.management.compute.OperatingSystemTypes
- 	withDiskSizeGB = java.lang.Integer
```
## ListByResourceGroupNextSinglePageAsyncDisks parameterss:

```
- setNextPageLink = java.lang.String
```
## ListWithServiceResponseAsyncDisks parameterss:

```
```
## ListByResourceGroupAsyncDisks parameterss:

```
- setResourceGroupName = java.lang.String
```
## ListNextSinglePageAsyncImages parameterss:

```
- setNextPageLink = java.lang.String
```
## ListByResourceGroupNextWithServiceResponseAsyncVirtualMachineScaleSets parameterss:

```
- setNextPageLink = java.lang.String
```
## ListByResourceGroupNextSinglePageAsyncVirtualMachineScaleSets parameterss:

```
- setNextPageLink = java.lang.String
```
## ListByResourceGroupAsyncVirtualMachineScaleSets parameterss:

```
- setResourceGroupName = java.lang.String
```
## CreateOrUpdateImages parameterss:

```
- setImageName = java.lang.String
- setResourceGroupName = java.lang.String
- setParameters = com.microsoft.azure.management.compute.implementation.ImageInner
- 	withSourceVirtualMachine = com.microsoft.azure.SubResource
- 		withId = java.lang.String
- 	withStorageProfile = com.microsoft.azure.management.compute.ImageStorageProfile
- 		withOsDisk = com.microsoft.azure.management.compute.ImageOSDisk
- 			withOsType = com.microsoft.azure.management.compute.OperatingSystemTypes
- 			withDiskSizeGB = java.lang.Integer
- 			withOsState = com.microsoft.azure.management.compute.OperatingSystemStateTypes
- 			withCaching = com.microsoft.azure.management.compute.CachingTypes
- 			withStorageAccountType = com.microsoft.azure.management.compute.StorageAccountTypes
- 			withManagedDisk = com.microsoft.azure.SubResource
- 				withId = java.lang.String
- 			withSnapshot = com.microsoft.azure.SubResource
- 				withId = java.lang.String
- 			withBlobUri = java.lang.String
- 		withDataDisks = java.util.List<com.microsoft.azure.management.compute.ImageDataDisk>
- 			withDiskSizeGB = java.lang.Integer
- 			withLun = int
- 			withCaching = com.microsoft.azure.management.compute.CachingTypes
- 			withStorageAccountType = com.microsoft.azure.management.compute.StorageAccountTypes
- 			withManagedDisk = com.microsoft.azure.SubResource
- 				withId = java.lang.String
- 			withSnapshot = com.microsoft.azure.SubResource
- 				withId = java.lang.String
- 			withBlobUri = java.lang.String
- 		withZoneResilient = java.lang.Boolean
- 	withLocation = java.lang.String
- 	withTags = java.util.Map<java.lang.String, java.lang.String>
```
## ListByResourceGroupSinglePageAsyncSnapshots parameterss:

```
- setResourceGroupName = java.lang.String
```
## ListPublishersWithServiceResponseAsyncVirtualMachineImages parameterss:

```
- setLocation = java.lang.String
```
## ListNextSinglePageAsyncVirtualMachineRunCommands parameterss:

```
- setNextPageLink = java.lang.String
```
## ListNextSinglePageAsyncGalleries parameterss:

```
- setNextPageLink = java.lang.String
```
## ListByResourceGroupGalleries parameterss:

```
- setResourceGroupName = java.lang.String
```
## ListByGalleryWithServiceResponseAsyncGalleryImages parameterss:

```
- setResourceGroupName = java.lang.String
- setGalleryName = java.lang.String
```
## BeginCreateOrUpdateVirtualMachineScaleSets parameterss:

```
- setResourceGroupName = java.lang.String
- setParameters = com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetInner
- 	withPlatformFaultDomainCount = java.lang.Integer
- 	withSku = com.microsoft.azure.management.compute.Sku
- 		withName = java.lang.String
- 		withTier = java.lang.String
- 		withCapacity = java.lang.Long
- 	withPlan = com.microsoft.azure.management.compute.Plan
- 		withName = java.lang.String
- 		withPublisher = java.lang.String
- 		withProduct = java.lang.String
- 		withPromotionCode = java.lang.String
- 	withIdentity = com.microsoft.azure.management.compute.VirtualMachineScaleSetIdentity
- 		withType = com.microsoft.azure.management.compute.ResourceIdentityType
- 		withUserAssignedIdentities = java.util.Map<java.lang.String, com.microsoft.azure.management.compute.VirtualMachineScaleSetIdentityUserAssignedIdentitiesValue>
- 	withZones = java.util.List<java.lang.String>
- 	withUpgradePolicy = com.microsoft.azure.management.compute.UpgradePolicy
- 		withRollingUpgradePolicy = com.microsoft.azure.management.compute.RollingUpgradePolicy
- 			withMaxBatchInstancePercent = java.lang.Integer
- 			withMaxUnhealthyInstancePercent = java.lang.Integer
- 			withMaxUnhealthyUpgradedInstancePercent = java.lang.Integer
- 			withPauseTimeBetweenBatches = java.lang.String
- 		withAutomaticOSUpgrade = java.lang.Boolean
- 		withAutoOSUpgradePolicy = com.microsoft.azure.management.compute.AutoOSUpgradePolicy
- 			withDisableAutoRollback = java.lang.Boolean
- 		withMode = com.microsoft.azure.management.compute.UpgradeMode
- 	withVirtualMachineProfile = com.microsoft.azure.management.compute.VirtualMachineScaleSetVMProfile
- 		withStorageProfile = com.microsoft.azure.management.compute.VirtualMachineScaleSetStorageProfile
- 			withImageReference = com.microsoft.azure.management.compute.ImageReference
- 				withSku = java.lang.String
- 				withPublisher = java.lang.String
- 				withOffer = java.lang.String
- 				withVersion = java.lang.String
- 				withId = java.lang.String
- 			withOsDisk = com.microsoft.azure.management.compute.VirtualMachineScaleSetOSDisk
- 				withName = java.lang.String
- 				withOsType = com.microsoft.azure.management.compute.OperatingSystemTypes
- 				withCreateOption = com.microsoft.azure.management.compute.DiskCreateOptionTypes
- 				withCaching = com.microsoft.azure.management.compute.CachingTypes
- 				withWriteAcceleratorEnabled = java.lang.Boolean
- 				withImage = com.microsoft.azure.management.compute.VirtualHardDisk
- 					withUri = java.lang.String
- 				withVhdContainers = java.util.List<java.lang.String>
- 				withManagedDisk = com.microsoft.azure.management.compute.VirtualMachineScaleSetManagedDiskParameters
- 					withStorageAccountType = com.microsoft.azure.management.compute.StorageAccountTypes
- 			withDataDisks = java.util.List<com.microsoft.azure.management.compute.VirtualMachineScaleSetDataDisk>
- 				withName = java.lang.String
- 				withDiskSizeGB = java.lang.Integer
- 				withLun = int
- 				withCreateOption = com.microsoft.azure.management.compute.DiskCreateOptionTypes
- 				withCaching = com.microsoft.azure.management.compute.CachingTypes
- 				withWriteAcceleratorEnabled = java.lang.Boolean
- 				withManagedDisk = com.microsoft.azure.management.compute.VirtualMachineScaleSetManagedDiskParameters
- 					withStorageAccountType = com.microsoft.azure.management.compute.StorageAccountTypes
- 		withOsProfile = com.microsoft.azure.management.compute.VirtualMachineScaleSetOSProfile
- 			withLinuxConfiguration = com.microsoft.azure.management.compute.LinuxConfiguration
- 				withProvisionVMAgent = java.lang.Boolean
- 				withDisablePasswordAuthentication = java.lang.Boolean
- 				withSsh = com.microsoft.azure.management.compute.SshConfiguration
- 					withPublicKeys = java.util.List<com.microsoft.azure.management.compute.SshPublicKey>
- 						withPath = java.lang.String
- 						withKeyData = java.lang.String
- 			withCustomData = java.lang.String
- 			withWindowsConfiguration = com.microsoft.azure.management.compute.WindowsConfiguration
- 				withProvisionVMAgent = java.lang.Boolean
- 				withEnableAutomaticUpdates = java.lang.Boolean
- 				withTimeZone = java.lang.String
- 				withWinRM = com.microsoft.azure.management.compute.WinRMConfiguration
- 					withListeners = java.util.List<com.microsoft.azure.management.compute.WinRMListener>
- 						withCertificateUrl = java.lang.String
- 						withProtocol = com.microsoft.azure.management.compute.ProtocolTypes
- 				withAdditionalUnattendContent = java.util.List<com.microsoft.azure.management.compute.AdditionalUnattendContent>
- 					withPassName = com.microsoft.azure.management.compute.PassNames
- 					withComponentName = com.microsoft.azure.management.compute.ComponentNames
- 					withSettingName = com.microsoft.azure.management.compute.SettingNames
- 					withContent = java.lang.String
- 			withSecrets = java.util.List<com.microsoft.azure.management.compute.VaultSecretGroup>
- 				withSourceVault = com.microsoft.azure.SubResource
- 					withId = java.lang.String
- 				withVaultCertificates = java.util.List<com.microsoft.azure.management.compute.VaultCertificate>
- 					withCertificateUrl = java.lang.String
- 					withCertificateStore = java.lang.String
- 			withAdminUsername = java.lang.String
- 			withAdminPassword = java.lang.String
- 			withComputerNamePrefix = java.lang.String
- 		withNetworkProfile = com.microsoft.azure.management.compute.VirtualMachineScaleSetNetworkProfile
- 			withNetworkInterfaceConfigurations = java.util.List<com.microsoft.azure.management.compute.VirtualMachineScaleSetNetworkConfiguration>
- 				withName = java.lang.String
- 				withPrimary = java.lang.Boolean
- 				withEnableAcceleratedNetworking = java.lang.Boolean
- 				withNetworkSecurityGroup = com.microsoft.azure.SubResource
- 					withId = java.lang.String
- 				withDnsSettings = com.microsoft.azure.management.compute.VirtualMachineScaleSetNetworkConfigurationDnsSettings
- 					withDnsServers = java.util.List<java.lang.String>
- 				withIpConfigurations = java.util.List<com.microsoft.azure.management.compute.VirtualMachineScaleSetIPConfiguration>
- 					withName = java.lang.String
- 					withPrimary = java.lang.Boolean
- 					withSubnet = com.microsoft.azure.management.compute.ApiEntityReference
- 						withId = java.lang.String
- 					withPublicIPAddressConfiguration = com.microsoft.azure.management.compute.VirtualMachineScaleSetPublicIPAddressConfiguration
- 						withName = java.lang.String
- 						withDnsSettings = com.microsoft.azure.management.compute.VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettings
- 							withDomainNameLabel = java.lang.String
- 						withIdleTimeoutInMinutes = java.lang.Integer
- 						withIpTags = java.util.List<com.microsoft.azure.management.compute.VirtualMachineScaleSetIpTag>
- 							withIpTagType = java.lang.String
- 							withTag = java.lang.String
- 					withPrivateIPAddressVersion = com.microsoft.azure.management.compute.IPVersion
- 					withApplicationGatewayBackendAddressPools = java.util.List<com.microsoft.azure.SubResource>
- 						withId = java.lang.String
- 					withLoadBalancerBackendAddressPools = java.util.List<com.microsoft.azure.SubResource>
- 						withId = java.lang.String
- 					withLoadBalancerInboundNatPools = java.util.List<com.microsoft.azure.SubResource>
- 						withId = java.lang.String
- 					withApplicationSecurityGroups = java.util.List<com.microsoft.azure.SubResource>
- 						withId = java.lang.String
- 					withId = java.lang.String
- 				withEnableIPForwarding = java.lang.Boolean
- 				withId = java.lang.String
- 			withHealthProbe = com.microsoft.azure.management.compute.ApiEntityReference
- 				withId = java.lang.String
- 		withDiagnosticsProfile = com.microsoft.azure.management.compute.DiagnosticsProfile
- 			withBootDiagnostics = com.microsoft.azure.management.compute.BootDiagnostics
- 				withEnabled = java.lang.Boolean
- 				withStorageUri = java.lang.String
- 		withLicenseType = java.lang.String
- 		withExtensionProfile = com.microsoft.azure.management.compute.VirtualMachineScaleSetExtensionProfile
- 			withExtensions = java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner>
- 				withName = java.lang.String
- 				withForceUpdateTag = java.lang.String
- 				withPublisher = java.lang.String
- 				withTypeHandlerVersion = java.lang.String
- 				withAutoUpgradeMinorVersion = java.lang.Boolean
- 				withSettings = java.lang.Object
- 				withProtectedSettings = java.lang.Object
- 				withType = java.lang.String
- 		withPriority = com.microsoft.azure.management.compute.VirtualMachinePriorityTypes
- 		withEvictionPolicy = com.microsoft.azure.management.compute.VirtualMachineEvictionPolicyTypes
- 	withOverprovision = java.lang.Boolean
- 	withSinglePlacementGroup = java.lang.Boolean
- 	withZoneBalance = java.lang.Boolean
- 	withLocation = java.lang.String
- 	withTags = java.util.Map<java.lang.String, java.lang.String>
- setVmScaleSetName = java.lang.String
```
## DeleteAsyncVirtualMachineScaleSetExtensions parameterss:

```
- setResourceGroupName = java.lang.String
- setVmScaleSetName = java.lang.String
- setVmssExtensionName = java.lang.String
```
## ListNextGalleries parameterss:

```
- setNextPageLink = java.lang.String
```
## UpdateVirtualMachineScaleSets parameterss:

```
- setResourceGroupName = java.lang.String
- setParameters = com.microsoft.azure.management.compute.VirtualMachineScaleSetUpdate
- 	withSku = com.microsoft.azure.management.compute.Sku
- 		withName = java.lang.String
- 		withTier = java.lang.String
- 		withCapacity = java.lang.Long
- 	withPlan = com.microsoft.azure.management.compute.Plan
- 		withName = java.lang.String
- 		withPublisher = java.lang.String
- 		withProduct = java.lang.String
- 		withPromotionCode = java.lang.String
- 	withIdentity = com.microsoft.azure.management.compute.VirtualMachineScaleSetIdentity
- 		withType = com.microsoft.azure.management.compute.ResourceIdentityType
- 		withUserAssignedIdentities = java.util.Map<java.lang.String, com.microsoft.azure.management.compute.VirtualMachineScaleSetIdentityUserAssignedIdentitiesValue>
- 	withUpgradePolicy = com.microsoft.azure.management.compute.UpgradePolicy
- 		withRollingUpgradePolicy = com.microsoft.azure.management.compute.RollingUpgradePolicy
- 			withMaxBatchInstancePercent = java.lang.Integer
- 			withMaxUnhealthyInstancePercent = java.lang.Integer
- 			withMaxUnhealthyUpgradedInstancePercent = java.lang.Integer
- 			withPauseTimeBetweenBatches = java.lang.String
- 		withAutomaticOSUpgrade = java.lang.Boolean
- 		withAutoOSUpgradePolicy = com.microsoft.azure.management.compute.AutoOSUpgradePolicy
- 			withDisableAutoRollback = java.lang.Boolean
- 		withMode = com.microsoft.azure.management.compute.UpgradeMode
- 	withVirtualMachineProfile = com.microsoft.azure.management.compute.VirtualMachineScaleSetUpdateVMProfile
- 		withStorageProfile = com.microsoft.azure.management.compute.VirtualMachineScaleSetUpdateStorageProfile
- 			withImageReference = com.microsoft.azure.management.compute.ImageReference
- 				withSku = java.lang.String
- 				withPublisher = java.lang.String
- 				withOffer = java.lang.String
- 				withVersion = java.lang.String
- 				withId = java.lang.String
- 			withOsDisk = com.microsoft.azure.management.compute.VirtualMachineScaleSetUpdateOSDisk
- 				withCaching = com.microsoft.azure.management.compute.CachingTypes
- 				withWriteAcceleratorEnabled = java.lang.Boolean
- 				withImage = com.microsoft.azure.management.compute.VirtualHardDisk
- 					withUri = java.lang.String
- 				withVhdContainers = java.util.List<java.lang.String>
- 				withManagedDisk = com.microsoft.azure.management.compute.VirtualMachineScaleSetManagedDiskParameters
- 					withStorageAccountType = com.microsoft.azure.management.compute.StorageAccountTypes
- 			withDataDisks = java.util.List<com.microsoft.azure.management.compute.VirtualMachineScaleSetDataDisk>
- 				withName = java.lang.String
- 				withDiskSizeGB = java.lang.Integer
- 				withLun = int
- 				withCreateOption = com.microsoft.azure.management.compute.DiskCreateOptionTypes
- 				withCaching = com.microsoft.azure.management.compute.CachingTypes
- 				withWriteAcceleratorEnabled = java.lang.Boolean
- 				withManagedDisk = com.microsoft.azure.management.compute.VirtualMachineScaleSetManagedDiskParameters
- 					withStorageAccountType = com.microsoft.azure.management.compute.StorageAccountTypes
- 		withOsProfile = com.microsoft.azure.management.compute.VirtualMachineScaleSetUpdateOSProfile
- 			withLinuxConfiguration = com.microsoft.azure.management.compute.LinuxConfiguration
- 				withProvisionVMAgent = java.lang.Boolean
- 				withDisablePasswordAuthentication = java.lang.Boolean
- 				withSsh = com.microsoft.azure.management.compute.SshConfiguration
- 					withPublicKeys = java.util.List<com.microsoft.azure.management.compute.SshPublicKey>
- 						withPath = java.lang.String
- 						withKeyData = java.lang.String
- 			withCustomData = java.lang.String
- 			withWindowsConfiguration = com.microsoft.azure.management.compute.WindowsConfiguration
- 				withProvisionVMAgent = java.lang.Boolean
- 				withEnableAutomaticUpdates = java.lang.Boolean
- 				withTimeZone = java.lang.String
- 				withWinRM = com.microsoft.azure.management.compute.WinRMConfiguration
- 					withListeners = java.util.List<com.microsoft.azure.management.compute.WinRMListener>
- 						withCertificateUrl = java.lang.String
- 						withProtocol = com.microsoft.azure.management.compute.ProtocolTypes
- 				withAdditionalUnattendContent = java.util.List<com.microsoft.azure.management.compute.AdditionalUnattendContent>
- 					withPassName = com.microsoft.azure.management.compute.PassNames
- 					withComponentName = com.microsoft.azure.management.compute.ComponentNames
- 					withSettingName = com.microsoft.azure.management.compute.SettingNames
- 					withContent = java.lang.String
- 			withSecrets = java.util.List<com.microsoft.azure.management.compute.VaultSecretGroup>
- 				withSourceVault = com.microsoft.azure.SubResource
- 					withId = java.lang.String
- 				withVaultCertificates = java.util.List<com.microsoft.azure.management.compute.VaultCertificate>
- 					withCertificateUrl = java.lang.String
- 					withCertificateStore = java.lang.String
- 		withNetworkProfile = com.microsoft.azure.management.compute.VirtualMachineScaleSetUpdateNetworkProfile
- 			withNetworkInterfaceConfigurations = java.util.List<com.microsoft.azure.management.compute.VirtualMachineScaleSetUpdateNetworkConfiguration>
- 				withName = java.lang.String
- 				withPrimary = java.lang.Boolean
- 				withEnableAcceleratedNetworking = java.lang.Boolean
- 				withNetworkSecurityGroup = com.microsoft.azure.SubResource
- 					withId = java.lang.String
- 				withDnsSettings = com.microsoft.azure.management.compute.VirtualMachineScaleSetNetworkConfigurationDnsSettings
- 					withDnsServers = java.util.List<java.lang.String>
- 				withIpConfigurations = java.util.List<com.microsoft.azure.management.compute.VirtualMachineScaleSetUpdateIPConfiguration>
- 					withName = java.lang.String
- 					withPrimary = java.lang.Boolean
- 					withSubnet = com.microsoft.azure.management.compute.ApiEntityReference
- 						withId = java.lang.String
- 					withPublicIPAddressConfiguration = com.microsoft.azure.management.compute.VirtualMachineScaleSetUpdatePublicIPAddressConfiguration
- 						withName = java.lang.String
- 						withDnsSettings = com.microsoft.azure.management.compute.VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettings
- 							withDomainNameLabel = java.lang.String
- 						withIdleTimeoutInMinutes = java.lang.Integer
- 					withPrivateIPAddressVersion = com.microsoft.azure.management.compute.IPVersion
- 					withApplicationGatewayBackendAddressPools = java.util.List<com.microsoft.azure.SubResource>
- 						withId = java.lang.String
- 					withLoadBalancerBackendAddressPools = java.util.List<com.microsoft.azure.SubResource>
- 						withId = java.lang.String
- 					withLoadBalancerInboundNatPools = java.util.List<com.microsoft.azure.SubResource>
- 						withId = java.lang.String
- 					withApplicationSecurityGroups = java.util.List<com.microsoft.azure.SubResource>
- 						withId = java.lang.String
- 					withId = java.lang.String
- 				withEnableIPForwarding = java.lang.Boolean
- 				withId = java.lang.String
- 		withDiagnosticsProfile = com.microsoft.azure.management.compute.DiagnosticsProfile
- 			withBootDiagnostics = com.microsoft.azure.management.compute.BootDiagnostics
- 				withEnabled = java.lang.Boolean
- 				withStorageUri = java.lang.String
- 		withLicenseType = java.lang.String
- 		withExtensionProfile = com.microsoft.azure.management.compute.VirtualMachineScaleSetExtensionProfile
- 			withExtensions = java.util.List<com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner>
- 				withName = java.lang.String
- 				withForceUpdateTag = java.lang.String
- 				withPublisher = java.lang.String
- 				withTypeHandlerVersion = java.lang.String
- 				withAutoUpgradeMinorVersion = java.lang.Boolean
- 				withSettings = java.lang.Object
- 				withProtectedSettings = java.lang.Object
- 				withType = java.lang.String
- 	withOverprovision = java.lang.Boolean
- 	withSinglePlacementGroup = java.lang.Boolean
- 	withTags = java.util.Map<java.lang.String, java.lang.String>
- setVmScaleSetName = java.lang.String
```
## ListByResourceGroupNextWithServiceResponseAsyncSnapshots parameterss:

```
- setNextPageLink = java.lang.String
```
## CreateOrUpdateVirtualMachineExtensions parameterss:

```
- setResourceGroupName = java.lang.String
- setVmName = java.lang.String
- setVmExtensionName = java.lang.String
- setExtensionParameters = com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionInner
- 	withForceUpdateTag = java.lang.String
- 	withPublisher = java.lang.String
- 	withVirtualMachineExtensionType = java.lang.String
- 	withTypeHandlerVersion = java.lang.String
- 	withAutoUpgradeMinorVersion = java.lang.Boolean
- 	withSettings = java.lang.Object
- 	withProtectedSettings = java.lang.Object
- 	withInstanceView = com.microsoft.azure.management.compute.VirtualMachineExtensionInstanceView
- 		withName = java.lang.String
- 		withTypeHandlerVersion = java.lang.String
- 		withStatuses = java.util.List<com.microsoft.azure.management.compute.InstanceViewStatus>
- 			withTime = org.joda.time.DateTime
- 				withChronology = org.joda.time.Chronology
- 					withZone = org.joda.time.DateTimeZone
- 				withMillis = long
- 				withZone = org.joda.time.DateTimeZone
- 				withZoneRetainFields = org.joda.time.DateTimeZone
- 				withFields = org.joda.time.ReadablePartial
- 				withEra = int
- 				withCenturyOfEra = int
- 				withYearOfEra = int
- 				withYearOfCentury = int
- 				withYear = int
- 				withWeekyear = int
- 				withMonthOfYear = int
- 				withWeekOfWeekyear = int
- 				withDayOfYear = int
- 				withDayOfMonth = int
- 				withDayOfWeek = int
- 				withHourOfDay = int
- 				withMinuteOfHour = int
- 				withSecondOfMinute = int
- 				withMillisOfSecond = int
- 				withMillisOfDay = int
- 			withLevel = com.microsoft.azure.management.compute.StatusLevelTypes
- 			withMessage = java.lang.String
- 			withDisplayStatus = java.lang.String
- 			withCode = java.lang.String
- 		withType = java.lang.String
- 		withSubstatuses = java.util.List<com.microsoft.azure.management.compute.InstanceViewStatus>
- 			withTime = org.joda.time.DateTime
- 				withChronology = org.joda.time.Chronology
- 					withZone = org.joda.time.DateTimeZone
- 				withMillis = long
- 				withZone = org.joda.time.DateTimeZone
- 				withZoneRetainFields = org.joda.time.DateTimeZone
- 				withFields = org.joda.time.ReadablePartial
- 				withEra = int
- 				withCenturyOfEra = int
- 				withYearOfEra = int
- 				withYearOfCentury = int
- 				withYear = int
- 				withWeekyear = int
- 				withMonthOfYear = int
- 				withWeekOfWeekyear = int
- 				withDayOfYear = int
- 				withDayOfMonth = int
- 				withDayOfWeek = int
- 				withHourOfDay = int
- 				withMinuteOfHour = int
- 				withSecondOfMinute = int
- 				withMillisOfSecond = int
- 				withMillisOfDay = int
- 			withLevel = com.microsoft.azure.management.compute.StatusLevelTypes
- 			withMessage = java.lang.String
- 			withDisplayStatus = java.lang.String
- 			withCode = java.lang.String
- 	withLocation = java.lang.String
- 	withTags = java.util.Map<java.lang.String, java.lang.String>
```
## CreateOrUpdateGalleryImageVersions parameterss:

```
- setResourceGroupName = java.lang.String
- setGalleryName = java.lang.String
- setGalleryImageName = java.lang.String
- setGalleryImageVersionName = java.lang.String
- setGalleryImageVersion = com.microsoft.azure.management.compute.implementation.GalleryImageVersionInner
- 	withPublishingProfile = com.microsoft.azure.management.compute.GalleryImageVersionPublishingProfile
- 		withEndOfLifeDate = org.joda.time.DateTime
- 			withChronology = org.joda.time.Chronology
- 				withZone = org.joda.time.DateTimeZone
- 			withMillis = long
- 			withZone = org.joda.time.DateTimeZone
- 			withZoneRetainFields = org.joda.time.DateTimeZone
- 			withFields = org.joda.time.ReadablePartial
- 			withEra = int
- 			withCenturyOfEra = int
- 			withYearOfEra = int
- 			withYearOfCentury = int
- 			withYear = int
- 			withWeekyear = int
- 			withMonthOfYear = int
- 			withWeekOfWeekyear = int
- 			withDayOfYear = int
- 			withDayOfMonth = int
- 			withDayOfWeek = int
- 			withHourOfDay = int
- 			withMinuteOfHour = int
- 			withSecondOfMinute = int
- 			withMillisOfSecond = int
- 			withMillisOfDay = int
- 		withReplicaCount = java.lang.Integer
- 		withExcludeFromLatest = java.lang.Boolean
- 		withSource = com.microsoft.azure.management.compute.GalleryArtifactSource
- 			withManagedImage = com.microsoft.azure.management.compute.ManagedArtifact
- 				withId = java.lang.String
- 		withTargetRegions = java.util.List<com.microsoft.azure.management.compute.TargetRegion>
- 			withName = java.lang.String
- 			withRegionalReplicaCount = java.lang.Integer
- 	withLocation = java.lang.String
- 	withTags = java.util.Map<java.lang.String, java.lang.String>
```
## ListAsyncVirtualMachineScaleSetExtensions parameterss:

```
- setResourceGroupName = java.lang.String
- setVmScaleSetName = java.lang.String
```
## ListByResourceGroupWithServiceResponseAsyncSnapshots parameterss:

```
- setResourceGroupName = java.lang.String
```
## ListSinglePageAsyncVirtualMachineRunCommands parameterss:

```
- setLocation = java.lang.String
```
## ListWithServiceResponseAsyncVirtualMachines parameterss:

```
```
## ListNextWithServiceResponseAsyncVirtualMachineScaleSets parameterss:

```
- setNextPageLink = java.lang.String
```
## ListNextWithServiceResponseAsyncDisks parameterss:

```
- setNextPageLink = java.lang.String
```
## ListAsyncVirtualMachineSizes parameterss:

```
- setLocation = java.lang.String
```
## ListNextAsyncVirtualMachineScaleSets parameterss:

```
- setNextPageLink = java.lang.String
```
## GetByResourceGroupGalleries parameterss:

```
- setResourceGroupName = java.lang.String
- setGalleryName = java.lang.String
```
## ListNextSinglePageAsyncVirtualMachineScaleSetVMs parameterss:

```
- setNextPageLink = java.lang.String
```
## ListByResourceGroupSinglePageAsyncDisks parameterss:

```
- setResourceGroupName = java.lang.String
```
## ListByResourceGroupNextSinglePageAsyncGalleries parameterss:

```
- setNextPageLink = java.lang.String
```
## ListByGalleryImageGalleryImageVersions parameterss:

```
- setResourceGroupName = java.lang.String
- setGalleryName = java.lang.String
- setGalleryImageName = java.lang.String
```
## ListByGalleryNextWithServiceResponseAsyncGalleryImages parameterss:

```
- setNextPageLink = java.lang.String
```
## DeleteAsyncVirtualMachines parameterss:

```
- setResourceGroupName = java.lang.String
- setVmName = java.lang.String
```
## ListByResourceGroupNextDisks parameterss:

```
- setNextPageLink = java.lang.String
```
## ListByResourceGroupAsyncGalleries parameterss:

```
- setResourceGroupName = java.lang.String
```
## ListAsyncSnapshots parameterss:

```
```
## DeleteAsyncAvailabilitySets parameterss:

```
- setResourceGroupName = java.lang.String
- setAvailabilitySetName = java.lang.String
```
## ListWithServiceResponseAsyncVirtualMachineExtensions parameterss:

```
- setResourceGroupName = java.lang.String
- setVmName = java.lang.String
```
## ListNextSinglePageAsyncUsages parameterss:

```
- setNextPageLink = java.lang.String
```
## GetVirtualMachineScaleSetVMs parameterss:

```
- setResourceGroupName = java.lang.String
- setVmScaleSetName = java.lang.String
- setInstanceId = java.lang.String
```
## ListAsyncOperations parameterss:

```
```
## ListByResourceGroupNextImages parameterss:

```
- setNextPageLink = java.lang.String
```
## ListByResourceGroupNextWithServiceResponseAsyncDisks parameterss:

```
- setNextPageLink = java.lang.String
```
## ListByResourceGroupAsyncSnapshots parameterss:

```
- setResourceGroupName = java.lang.String
```
## GetByResourceGroupDisks parameterss:

```
- setResourceGroupName = java.lang.String
- setDiskName = java.lang.String
```
## DeleteVirtualMachines parameterss:

```
- setResourceGroupName = java.lang.String
- setVmName = java.lang.String
```
## ListByResourceGroupNextAsyncVirtualMachines parameterss:

```
- setNextPageLink = java.lang.String
```
## ListByResourceGroupNextAsyncVirtualMachineScaleSets parameterss:

```
- setNextPageLink = java.lang.String
```
## ListSinglePageAsyncVirtualMachineScaleSetVMs parameterss:

```
- setResourceGroupName = java.lang.String
- setVirtualMachineScaleSetName = java.lang.String
```
## ListGalleries parameterss:

```
```
## ListVirtualMachineImages parameterss:

```
- setLocation = java.lang.String
- setOffer = java.lang.String
- setPublisherName = java.lang.String
- setSkus = java.lang.String
```
## ListByResourceGroupWithServiceResponseAsyncVirtualMachines parameterss:

```
- setResourceGroupName = java.lang.String
```
## BeginGrantAccessSnapshots parameterss:

```
- setResourceGroupName = java.lang.String
- setGrantAccessData = com.microsoft.azure.management.compute.GrantAccessData
- 	withDurationInSeconds = int
- 	withAccess = com.microsoft.azure.management.compute.AccessLevel
- setSnapshotName = java.lang.String
```
## ListWithServiceResponseAsyncVirtualMachineScaleSets parameterss:

```
```
## ListSkusNextVirtualMachineScaleSets parameterss:

```
- setNextPageLink = java.lang.String
```
## ListByGalleryImageNextAsyncGalleryImageVersions parameterss:

```
- setNextPageLink = java.lang.String
```
## DeleteImages parameterss:

```
- setImageName = java.lang.String
- setResourceGroupName = java.lang.String
```
## ListByGalleryNextGalleryImages parameterss:

```
- setNextPageLink = java.lang.String
```
## BeginUpdateVirtualMachines parameterss:

```
- setResourceGroupName = java.lang.String
- setVmName = java.lang.String
- setParameters = com.microsoft.azure.management.compute.VirtualMachineUpdate
- 	withPlan = com.microsoft.azure.management.compute.Plan
- 		withName = java.lang.String
- 		withPublisher = java.lang.String
- 		withProduct = java.lang.String
- 		withPromotionCode = java.lang.String
- 	withStorageProfile = com.microsoft.azure.management.compute.StorageProfile
- 		withImageReference = com.microsoft.azure.management.compute.ImageReference
- 			withSku = java.lang.String
- 			withPublisher = java.lang.String
- 			withOffer = java.lang.String
- 			withVersion = java.lang.String
- 			withId = java.lang.String
- 		withOsDisk = com.microsoft.azure.management.compute.OSDisk
- 			withName = java.lang.String
- 			withEncryptionSettings = com.microsoft.azure.management.compute.DiskEncryptionSettings
- 				withEnabled = java.lang.Boolean
- 				withDiskEncryptionKey = com.microsoft.azure.management.compute.KeyVaultSecretReference
- 					withSourceVault = com.microsoft.azure.SubResource
- 						withId = java.lang.String
- 					withSecretUrl = java.lang.String
- 				withKeyEncryptionKey = com.microsoft.azure.management.compute.KeyVaultKeyReference
- 					withSourceVault = com.microsoft.azure.SubResource
- 						withId = java.lang.String
- 					withKeyUrl = java.lang.String
- 			withOsType = com.microsoft.azure.management.compute.OperatingSystemTypes
- 			withDiskSizeGB = java.lang.Integer
- 			withCreateOption = com.microsoft.azure.management.compute.DiskCreateOptionTypes
- 			withCaching = com.microsoft.azure.management.compute.CachingTypes
- 			withWriteAcceleratorEnabled = java.lang.Boolean
- 			withImage = com.microsoft.azure.management.compute.VirtualHardDisk
- 				withUri = java.lang.String
- 			withManagedDisk = com.microsoft.azure.management.compute.ManagedDiskParameters
- 				withStorageAccountType = com.microsoft.azure.management.compute.StorageAccountTypes
- 				withId = java.lang.String
- 			withVhd = com.microsoft.azure.management.compute.VirtualHardDisk
- 				withUri = java.lang.String
- 		withDataDisks = java.util.List<com.microsoft.azure.management.compute.DataDisk>
- 			withName = java.lang.String
- 			withDiskSizeGB = java.lang.Integer
- 			withLun = int
- 			withCreateOption = com.microsoft.azure.management.compute.DiskCreateOptionTypes
- 			withCaching = com.microsoft.azure.management.compute.CachingTypes
- 			withWriteAcceleratorEnabled = java.lang.Boolean
- 			withImage = com.microsoft.azure.management.compute.VirtualHardDisk
- 				withUri = java.lang.String
- 			withManagedDisk = com.microsoft.azure.management.compute.ManagedDiskParameters
- 				withStorageAccountType = com.microsoft.azure.management.compute.StorageAccountTypes
- 				withId = java.lang.String
- 			withVhd = com.microsoft.azure.management.compute.VirtualHardDisk
- 				withUri = java.lang.String
- 	withHardwareProfile = com.microsoft.azure.management.compute.HardwareProfile
- 		withVmSize = com.microsoft.azure.management.compute.VirtualMachineSizeTypes
- 	withOsProfile = com.microsoft.azure.management.compute.OSProfile
- 		withLinuxConfiguration = com.microsoft.azure.management.compute.LinuxConfiguration
- 			withProvisionVMAgent = java.lang.Boolean
- 			withDisablePasswordAuthentication = java.lang.Boolean
- 			withSsh = com.microsoft.azure.management.compute.SshConfiguration
- 				withPublicKeys = java.util.List<com.microsoft.azure.management.compute.SshPublicKey>
- 					withPath = java.lang.String
- 					withKeyData = java.lang.String
- 		withCustomData = java.lang.String
- 		withWindowsConfiguration = com.microsoft.azure.management.compute.WindowsConfiguration
- 			withProvisionVMAgent = java.lang.Boolean
- 			withEnableAutomaticUpdates = java.lang.Boolean
- 			withTimeZone = java.lang.String
- 			withWinRM = com.microsoft.azure.management.compute.WinRMConfiguration
- 				withListeners = java.util.List<com.microsoft.azure.management.compute.WinRMListener>
- 					withCertificateUrl = java.lang.String
- 					withProtocol = com.microsoft.azure.management.compute.ProtocolTypes
- 			withAdditionalUnattendContent = java.util.List<com.microsoft.azure.management.compute.AdditionalUnattendContent>
- 				withPassName = com.microsoft.azure.management.compute.PassNames
- 				withComponentName = com.microsoft.azure.management.compute.ComponentNames
- 				withSettingName = com.microsoft.azure.management.compute.SettingNames
- 				withContent = java.lang.String
- 		withSecrets = java.util.List<com.microsoft.azure.management.compute.VaultSecretGroup>
- 			withSourceVault = com.microsoft.azure.SubResource
- 				withId = java.lang.String
- 			withVaultCertificates = java.util.List<com.microsoft.azure.management.compute.VaultCertificate>
- 				withCertificateUrl = java.lang.String
- 				withCertificateStore = java.lang.String
- 		withComputerName = java.lang.String
- 		withAllowExtensionOperations = java.lang.Boolean
- 		withAdminUsername = java.lang.String
- 		withAdminPassword = java.lang.String
- 	withNetworkProfile = com.microsoft.azure.management.compute.NetworkProfile
- 		withNetworkInterfaces = java.util.List<com.microsoft.azure.management.compute.NetworkInterfaceReference>
- 			withPrimary = java.lang.Boolean
- 			withId = java.lang.String
- 	withDiagnosticsProfile = com.microsoft.azure.management.compute.DiagnosticsProfile
- 		withBootDiagnostics = com.microsoft.azure.management.compute.BootDiagnostics
- 			withEnabled = java.lang.Boolean
- 			withStorageUri = java.lang.String
- 	withLicenseType = java.lang.String
- 	withAvailabilitySet = com.microsoft.azure.SubResource
- 		withId = java.lang.String
- 	withIdentity = com.microsoft.azure.management.compute.VirtualMachineIdentity
- 		withType = com.microsoft.azure.management.compute.ResourceIdentityType
- 		withUserAssignedIdentities = java.util.Map<java.lang.String, com.microsoft.azure.management.compute.VirtualMachineIdentityUserAssignedIdentitiesValue>
- 	withZones = java.util.List<java.lang.String>
- 	withTags = java.util.Map<java.lang.String, java.lang.String>
```
## ListNextWithServiceResponseAsyncGalleries parameterss:

```
- setNextPageLink = java.lang.String
```
## ListByResourceGroupSinglePageAsyncGalleries parameterss:

```
- setResourceGroupName = java.lang.String
```
## DeleteInstancesWithServiceResponseAsyncVirtualMachineScaleSets parameterss:

```
- setResourceGroupName = java.lang.String
- setInstanceIds = java.util.List<java.lang.String>
- setVmScaleSetName = java.lang.String
```
## ListWithServiceResponseAsyncUsages parameterss:

```
- setLocation = java.lang.String
```
## ListTypesWithServiceResponseAsyncVirtualMachineExtensionImages parameterss:

```
- setLocation = java.lang.String
- setPublisherName = java.lang.String
```
## ListWithServiceResponseAsyncGalleries parameterss:

```
```
## ListByResourceGroupNextSnapshots parameterss:

```
- setNextPageLink = java.lang.String
```
## ListByResourceGroupVirtualMachineScaleSets parameterss:

```
- setResourceGroupName = java.lang.String
```
## DeleteWithServiceResponseAsyncVirtualMachineScaleSets parameterss:

```
- setResourceGroupName = java.lang.String
- setVmScaleSetName = java.lang.String
```
## ListSkusSinglePageAsyncVirtualMachineScaleSets parameterss:

```
- setResourceGroupName = java.lang.String
- setVmScaleSetName = java.lang.String
```
## DeleteInstancesAsyncVirtualMachineScaleSets parameterss:

```
- setResourceGroupName = java.lang.String
- setInstanceIds = java.util.List<java.lang.String>
- setVmScaleSetName = java.lang.String
```
## ListResourceSkus parameterss:

```
```
## ListVirtualMachineSizes parameterss:

```
- setLocation = java.lang.String
```
## ListSinglePageAsyncVirtualMachineScaleSetExtensions parameterss:

```
- setResourceGroupName = java.lang.String
- setVmScaleSetName = java.lang.String
```
## ListVersionsAsyncVirtualMachineExtensionImages parameterss:

```
- setLocation = java.lang.String
- setType = java.lang.String
- setPublisherName = java.lang.String
```
## ListSkusWithServiceResponseAsyncVirtualMachineScaleSets parameterss:

```
- setResourceGroupName = java.lang.String
- setVmScaleSetName = java.lang.String
```
## DeleteAsyncVirtualMachineExtensions parameterss:

```
- setResourceGroupName = java.lang.String
- setVmName = java.lang.String
- setVmExtensionName = java.lang.String
```
## DeleteWithServiceResponseAsyncVirtualMachineExtensions parameterss:

```
- setResourceGroupName = java.lang.String
- setVmName = java.lang.String
- setVmExtensionName = java.lang.String
```
## ListAsyncVirtualMachineScaleSetVMs parameterss:

```
- setResourceGroupName = java.lang.String
- setVirtualMachineScaleSetName = java.lang.String
```
## GetVirtualMachineExtensions parameterss:

```
- setResourceGroupName = java.lang.String
- setVmName = java.lang.String
- setVmExtensionName = java.lang.String
```
## ListByResourceGroupNextVirtualMachineScaleSets parameterss:

```
- setNextPageLink = java.lang.String
```
## DeleteWithServiceResponseAsyncVirtualMachines parameterss:

```
- setResourceGroupName = java.lang.String
- setVmName = java.lang.String
```
## GetInstanceViewVirtualMachineScaleSets parameterss:

```
- setResourceGroupName = java.lang.String
- setVmScaleSetName = java.lang.String
```
## ListByResourceGroupNextAsyncImages parameterss:

```
- setNextPageLink = java.lang.String
```
## ListAsyncVirtualMachines parameterss:

```
```
## DeleteAsyncGalleries parameterss:

```
- setResourceGroupName = java.lang.String
- setGalleryName = java.lang.String
```
## BeginCreateOrUpdateGalleries parameterss:

```
- setResourceGroupName = java.lang.String
- setGalleryName = java.lang.String
- setGallery = com.microsoft.azure.management.compute.implementation.GalleryInner
- 	withIdentifier = com.microsoft.azure.management.compute.GalleryIdentifier
- 	withDescription = java.lang.String
- 	withLocation = java.lang.String
- 	withTags = java.util.Map<java.lang.String, java.lang.String>
```
## ListNextWithServiceResponseAsyncVirtualMachineScaleSetVMs parameterss:

```
- setNextPageLink = java.lang.String
```
## ListByGalleryImageNextSinglePageAsyncGalleryImageVersions parameterss:

```
- setNextPageLink = java.lang.String
```
## GetByResourceGroupAvailabilitySets parameterss:

```
- setResourceGroupName = java.lang.String
- setAvailabilitySetName = java.lang.String
```
## ListWithServiceResponseAsyncImages parameterss:

```
```
## DeleteAvailabilitySets parameterss:

```
- setResourceGroupName = java.lang.String
- setAvailabilitySetName = java.lang.String
```
## DeleteWithServiceResponseAsyncAvailabilitySets parameterss:

```
- setResourceGroupName = java.lang.String
- setAvailabilitySetName = java.lang.String
```
## ListSkusAsyncVirtualMachineScaleSets parameterss:

```
- setResourceGroupName = java.lang.String
- setVmScaleSetName = java.lang.String
```
## CaptureVirtualMachines parameterss:

```
- setResourceGroupName = java.lang.String
- setVmName = java.lang.String
- setParameters = com.microsoft.azure.management.compute.VirtualMachineCaptureParameters
- 	withDestinationContainerName = java.lang.String
- 	withVhdPrefix = java.lang.String
- 	withOverwriteVhds = boolean
```
## ListNextAsyncVirtualMachineScaleSetVMs parameterss:

```
- setNextPageLink = java.lang.String
```
## ListNextWithServiceResponseAsyncSnapshots parameterss:

```
- setNextPageLink = java.lang.String
```
## BeginUpdateSnapshots parameterss:

```
- setResourceGroupName = java.lang.String
- setSnapshotName = java.lang.String
- setSnapshot = com.microsoft.azure.management.compute.SnapshotUpdate
- 	withSku = com.microsoft.azure.management.compute.SnapshotSku
- 		withName = com.microsoft.azure.management.compute.SnapshotStorageAccountTypes
- 	withTags = java.util.Map<java.lang.String, java.lang.String>
- 	withEncryptionSettings = com.microsoft.azure.management.compute.EncryptionSettings
- 		withEnabled = java.lang.Boolean
- 		withDiskEncryptionKey = com.microsoft.azure.management.compute.KeyVaultAndSecretReference
- 			withSourceVault = com.microsoft.azure.management.compute.SourceVault
- 				withId = java.lang.String
- 			withSecretUrl = java.lang.String
- 		withKeyEncryptionKey = com.microsoft.azure.management.compute.KeyVaultAndKeyReference
- 			withSourceVault = com.microsoft.azure.management.compute.SourceVault
- 				withId = java.lang.String
- 			withKeyUrl = java.lang.String
- 	withOsType = com.microsoft.azure.management.compute.OperatingSystemTypes
- 	withDiskSizeGB = java.lang.Integer
```
## BeginGrantAccessDisks parameterss:

```
- setResourceGroupName = java.lang.String
- setDiskName = java.lang.String
- setGrantAccessData = com.microsoft.azure.management.compute.GrantAccessData
- 	withDurationInSeconds = int
- 	withAccess = com.microsoft.azure.management.compute.AccessLevel
```
## ListByGalleryImageSinglePageAsyncGalleryImageVersions parameterss:

```
- setResourceGroupName = java.lang.String
- setGalleryName = java.lang.String
- setGalleryImageName = java.lang.String
```
## ListVersionsWithServiceResponseAsyncVirtualMachineExtensionImages parameterss:

```
- setLocation = java.lang.String
- setType = java.lang.String
- setPublisherName = java.lang.String
```
## BeginCreateOrUpdateVirtualMachineExtensions parameterss:

```
- setResourceGroupName = java.lang.String
- setVmName = java.lang.String
- setVmExtensionName = java.lang.String
- setExtensionParameters = com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionInner
- 	withForceUpdateTag = java.lang.String
- 	withPublisher = java.lang.String
- 	withVirtualMachineExtensionType = java.lang.String
- 	withTypeHandlerVersion = java.lang.String
- 	withAutoUpgradeMinorVersion = java.lang.Boolean
- 	withSettings = java.lang.Object
- 	withProtectedSettings = java.lang.Object
- 	withInstanceView = com.microsoft.azure.management.compute.VirtualMachineExtensionInstanceView
- 		withName = java.lang.String
- 		withTypeHandlerVersion = java.lang.String
- 		withStatuses = java.util.List<com.microsoft.azure.management.compute.InstanceViewStatus>
- 			withTime = org.joda.time.DateTime
- 				withChronology = org.joda.time.Chronology
- 					withZone = org.joda.time.DateTimeZone
- 				withMillis = long
- 				withZone = org.joda.time.DateTimeZone
- 				withZoneRetainFields = org.joda.time.DateTimeZone
- 				withFields = org.joda.time.ReadablePartial
- 				withEra = int
- 				withCenturyOfEra = int
- 				withYearOfEra = int
- 				withYearOfCentury = int
- 				withYear = int
- 				withWeekyear = int
- 				withMonthOfYear = int
- 				withWeekOfWeekyear = int
- 				withDayOfYear = int
- 				withDayOfMonth = int
- 				withDayOfWeek = int
- 				withHourOfDay = int
- 				withMinuteOfHour = int
- 				withSecondOfMinute = int
- 				withMillisOfSecond = int
- 				withMillisOfDay = int
- 			withLevel = com.microsoft.azure.management.compute.StatusLevelTypes
- 			withMessage = java.lang.String
- 			withDisplayStatus = java.lang.String
- 			withCode = java.lang.String
- 		withType = java.lang.String
- 		withSubstatuses = java.util.List<com.microsoft.azure.management.compute.InstanceViewStatus>
- 			withTime = org.joda.time.DateTime
- 				withChronology = org.joda.time.Chronology
- 					withZone = org.joda.time.DateTimeZone
- 				withMillis = long
- 				withZone = org.joda.time.DateTimeZone
- 				withZoneRetainFields = org.joda.time.DateTimeZone
- 				withFields = org.joda.time.ReadablePartial
- 				withEra = int
- 				withCenturyOfEra = int
- 				withYearOfEra = int
- 				withYearOfCentury = int
- 				withYear = int
- 				withWeekyear = int
- 				withMonthOfYear = int
- 				withWeekOfWeekyear = int
- 				withDayOfYear = int
- 				withDayOfMonth = int
- 				withDayOfWeek = int
- 				withHourOfDay = int
- 				withMinuteOfHour = int
- 				withSecondOfMinute = int
- 				withMillisOfSecond = int
- 				withMillisOfDay = int
- 			withLevel = com.microsoft.azure.management.compute.StatusLevelTypes
- 			withMessage = java.lang.String
- 			withDisplayStatus = java.lang.String
- 			withCode = java.lang.String
- 	withLocation = java.lang.String
- 	withTags = java.util.Map<java.lang.String, java.lang.String>
```
## ListNextAsyncVirtualMachineScaleSetExtensions parameterss:

```
- setNextPageLink = java.lang.String
```
## BeginExportThrottledRequestsLogAnalytics parameterss:

```
- setLocation = java.lang.String
- setParameters = com.microsoft.azure.management.compute.ThrottledRequestsInput
- 	withFromTime = org.joda.time.DateTime
- 		withChronology = org.joda.time.Chronology
- 			withZone = org.joda.time.DateTimeZone
- 		withMillis = long
- 		withZone = org.joda.time.DateTimeZone
- 		withZoneRetainFields = org.joda.time.DateTimeZone
- 		withFields = org.joda.time.ReadablePartial
- 		withEra = int
- 		withCenturyOfEra = int
- 		withYearOfEra = int
- 		withYearOfCentury = int
- 		withYear = int
- 		withWeekyear = int
- 		withMonthOfYear = int
- 		withWeekOfWeekyear = int
- 		withDayOfYear = int
- 		withDayOfMonth = int
- 		withDayOfWeek = int
- 		withHourOfDay = int
- 		withMinuteOfHour = int
- 		withSecondOfMinute = int
- 		withMillisOfSecond = int
- 		withMillisOfDay = int
- 	withToTime = org.joda.time.DateTime
- 		withChronology = org.joda.time.Chronology
- 			withZone = org.joda.time.DateTimeZone
- 		withMillis = long
- 		withZone = org.joda.time.DateTimeZone
- 		withZoneRetainFields = org.joda.time.DateTimeZone
- 		withFields = org.joda.time.ReadablePartial
- 		withEra = int
- 		withCenturyOfEra = int
- 		withYearOfEra = int
- 		withYearOfCentury = int
- 		withYear = int
- 		withWeekyear = int
- 		withMonthOfYear = int
- 		withWeekOfWeekyear = int
- 		withDayOfYear = int
- 		withDayOfMonth = int
- 		withDayOfWeek = int
- 		withHourOfDay = int
- 		withMinuteOfHour = int
- 		withSecondOfMinute = int
- 		withMillisOfSecond = int
- 		withMillisOfDay = int
- 	withGroupByThrottlePolicy = java.lang.Boolean
- 	withGroupByOperationName = java.lang.Boolean
- 	withGroupByResourceName = java.lang.Boolean
- 	withBlobContainerSasUri = java.lang.String
```
## ListNextDisks parameterss:

```
- setNextPageLink = java.lang.String
```
## GetVirtualMachineExtensionImages parameterss:

```
- setVersion = java.lang.String
- setLocation = java.lang.String
- setType = java.lang.String
- setPublisherName = java.lang.String
```
## ListSinglePageAsyncVirtualMachineScaleSets parameterss:

```
```
## GrantAccessSnapshots parameterss:

```
- setResourceGroupName = java.lang.String
- setGrantAccessData = com.microsoft.azure.management.compute.GrantAccessData
- 	withDurationInSeconds = int
- 	withAccess = com.microsoft.azure.management.compute.AccessLevel
- setSnapshotName = java.lang.String
```
## ListNextWithServiceResponseAsyncUsages parameterss:

```
- setNextPageLink = java.lang.String
```
## ListNextAsyncGalleries parameterss:

```
- setNextPageLink = java.lang.String
```
## DeleteAsyncDisks parameterss:

```
- setResourceGroupName = java.lang.String
- setDiskName = java.lang.String
```
## ListNextWithServiceResponseAsyncVirtualMachineScaleSetExtensions parameterss:

```
- setNextPageLink = java.lang.String
```
## ListSkusNextSinglePageAsyncVirtualMachineScaleSets parameterss:

```
- setNextPageLink = java.lang.String
```
## ListByGalleryNextAsyncGalleryImages parameterss:

```
- setNextPageLink = java.lang.String
```
## BeginCreateOrUpdateDisks parameterss:

```
- setResourceGroupName = java.lang.String
- setDiskName = java.lang.String
- setDisk = com.microsoft.azure.management.compute.implementation.DiskInner
- 	withSku = com.microsoft.azure.management.compute.DiskSku
- 		withName = com.microsoft.azure.management.compute.StorageAccountTypes
- 	withZones = java.util.List<java.lang.String>
- 	withCreationData = com.microsoft.azure.management.compute.CreationData
- 		withImageReference = com.microsoft.azure.management.compute.ImageDiskReference
- 			withId = java.lang.String
- 			withLun = java.lang.Integer
- 		withCreateOption = com.microsoft.azure.management.compute.DiskCreateOption
- 		withSourceUri = java.lang.String
- 		withSourceResourceId = java.lang.String
- 		withStorageAccountId = java.lang.String
- 	withEncryptionSettings = com.microsoft.azure.management.compute.EncryptionSettings
- 		withEnabled = java.lang.Boolean
- 		withDiskEncryptionKey = com.microsoft.azure.management.compute.KeyVaultAndSecretReference
- 			withSourceVault = com.microsoft.azure.management.compute.SourceVault
- 				withId = java.lang.String
- 			withSecretUrl = java.lang.String
- 		withKeyEncryptionKey = com.microsoft.azure.management.compute.KeyVaultAndKeyReference
- 			withSourceVault = com.microsoft.azure.management.compute.SourceVault
- 				withId = java.lang.String
- 			withKeyUrl = java.lang.String
- 	withOsType = com.microsoft.azure.management.compute.OperatingSystemTypes
- 	withDiskSizeGB = java.lang.Integer
- 	withLocation = java.lang.String
- 	withTags = java.util.Map<java.lang.String, java.lang.String>
```
## ListSkusNextWithServiceResponseAsyncVirtualMachineScaleSets parameterss:

```
- setNextPageLink = java.lang.String
```
## ListNextWithServiceResponseAsyncResourceSkus parameterss:

```
- setNextPageLink = java.lang.String
```
## ListNextVirtualMachines parameterss:

```
- setNextPageLink = java.lang.String
```
## ListNextAsyncSnapshots parameterss:

```
- setNextPageLink = java.lang.String
```
## ListWithServiceResponseAsyncVirtualMachineImages parameterss:

```
- setLocation = java.lang.String
- setOffer = java.lang.String
- setPublisherName = java.lang.String
- setSkus = java.lang.String
```
## ListByResourceGroupNextWithServiceResponseAsyncImages parameterss:

```
- setNextPageLink = java.lang.String
```
## ListSinglePageAsyncDisks parameterss:

```
```
## ListByResourceGroupSinglePageAsyncVirtualMachines parameterss:

```
- setResourceGroupName = java.lang.String
```
## ListByResourceGroupNextAsyncDisks parameterss:

```
- setNextPageLink = java.lang.String
```
## ListByResourceGroupAsyncAvailabilitySets parameterss:

```
- setResourceGroupName = java.lang.String
```
## GrantAccessDisks parameterss:

```
- setResourceGroupName = java.lang.String
- setDiskName = java.lang.String
- setGrantAccessData = com.microsoft.azure.management.compute.GrantAccessData
- 	withDurationInSeconds = int
- 	withAccess = com.microsoft.azure.management.compute.AccessLevel
```
## ListAsyncGalleries parameterss:

```
```
## CreateOrUpdateGalleryImages parameterss:

```
- setResourceGroupName = java.lang.String
- setGalleryName = java.lang.String
- setGalleryImageName = java.lang.String
- setGalleryImage = com.microsoft.azure.management.compute.implementation.GalleryImageInner
- 	withIdentifier = com.microsoft.azure.management.compute.GalleryImageIdentifier
- 		withSku = java.lang.String
- 		withPublisher = java.lang.String
- 		withOffer = java.lang.String
- 	withOsType = com.microsoft.azure.management.compute.OperatingSystemTypes
- 	withDescription = java.lang.String
- 	withEula = java.lang.String
- 	withPrivacyStatementUri = java.lang.String
- 	withReleaseNoteUri = java.lang.String
- 	withOsState = com.microsoft.azure.management.compute.OperatingSystemStateTypes
- 	withRecommended = com.microsoft.azure.management.compute.RecommendedMachineConfiguration
- 		withVCPUs = com.microsoft.azure.management.compute.ResourceRange
- 			withMin = java.lang.Integer
- 			withMax = java.lang.Integer
- 		withMemory = com.microsoft.azure.management.compute.ResourceRange
- 			withMin = java.lang.Integer
- 			withMax = java.lang.Integer
- 	withEndOfLifeDate = org.joda.time.DateTime
- 		withChronology = org.joda.time.Chronology
- 			withZone = org.joda.time.DateTimeZone
- 		withMillis = long
- 		withZone = org.joda.time.DateTimeZone
- 		withZoneRetainFields = org.joda.time.DateTimeZone
- 		withFields = org.joda.time.ReadablePartial
- 		withEra = int
- 		withCenturyOfEra = int
- 		withYearOfEra = int
- 		withYearOfCentury = int
- 		withYear = int
- 		withWeekyear = int
- 		withMonthOfYear = int
- 		withWeekOfWeekyear = int
- 		withDayOfYear = int
- 		withDayOfMonth = int
- 		withDayOfWeek = int
- 		withHourOfDay = int
- 		withMinuteOfHour = int
- 		withSecondOfMinute = int
- 		withMillisOfSecond = int
- 		withMillisOfDay = int
- 	withDisallowed = com.microsoft.azure.management.compute.Disallowed
- 		withDiskTypes = java.util.List<java.lang.String>
- 	withPurchasePlan = com.microsoft.azure.management.compute.ImagePurchasePlan
- 		withName = java.lang.String
- 		withPublisher = java.lang.String
- 		withProduct = java.lang.String
- 	withLocation = java.lang.String
- 	withTags = java.util.Map<java.lang.String, java.lang.String>
```
## ListOffersVirtualMachineImages parameterss:

```
- setLocation = java.lang.String
- setPublisherName = java.lang.String
```
## BeginCaptureVirtualMachines parameterss:

```
- setResourceGroupName = java.lang.String
- setVmName = java.lang.String
- setParameters = com.microsoft.azure.management.compute.VirtualMachineCaptureParameters
- 	withDestinationContainerName = java.lang.String
- 	withVhdPrefix = java.lang.String
- 	withOverwriteVhds = boolean
```
## ListNextAsyncResourceSkus parameterss:

```
- setNextPageLink = java.lang.String
```
## ListByResourceGroupNextVirtualMachines parameterss:

```
- setNextPageLink = java.lang.String
```
## CreateOrUpdateVirtualMachineScaleSetExtensions parameterss:

```
- setResourceGroupName = java.lang.String
- setExtensionParameters = com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetExtensionInner
- 	withName = java.lang.String
- 	withForceUpdateTag = java.lang.String
- 	withPublisher = java.lang.String
- 	withTypeHandlerVersion = java.lang.String
- 	withAutoUpgradeMinorVersion = java.lang.Boolean
- 	withSettings = java.lang.Object
- 	withProtectedSettings = java.lang.Object
- 	withType = java.lang.String
- setVmScaleSetName = java.lang.String
- setVmssExtensionName = java.lang.String
```
## DeleteVirtualMachineScaleSetExtensions parameterss:

```
- setResourceGroupName = java.lang.String
- setVmScaleSetName = java.lang.String
- setVmssExtensionName = java.lang.String
```
## ListSkusVirtualMachineImages parameterss:

```
- setLocation = java.lang.String
- setOffer = java.lang.String
- setPublisherName = java.lang.String
```
## ListVirtualMachineScaleSetExtensions parameterss:

```
- setResourceGroupName = java.lang.String
- setVmScaleSetName = java.lang.String
```
## UpdateVirtualMachineScaleSetVMs parameterss:

```
- setResourceGroupName = java.lang.String
- setParameters = com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInner
- 	withPlan = com.microsoft.azure.management.compute.Plan
- 		withName = java.lang.String
- 		withPublisher = java.lang.String
- 		withProduct = java.lang.String
- 		withPromotionCode = java.lang.String
- 	withStorageProfile = com.microsoft.azure.management.compute.StorageProfile
- 		withImageReference = com.microsoft.azure.management.compute.ImageReference
- 			withSku = java.lang.String
- 			withPublisher = java.lang.String
- 			withOffer = java.lang.String
- 			withVersion = java.lang.String
- 			withId = java.lang.String
- 		withOsDisk = com.microsoft.azure.management.compute.OSDisk
- 			withName = java.lang.String
- 			withEncryptionSettings = com.microsoft.azure.management.compute.DiskEncryptionSettings
- 				withEnabled = java.lang.Boolean
- 				withDiskEncryptionKey = com.microsoft.azure.management.compute.KeyVaultSecretReference
- 					withSourceVault = com.microsoft.azure.SubResource
- 						withId = java.lang.String
- 					withSecretUrl = java.lang.String
- 				withKeyEncryptionKey = com.microsoft.azure.management.compute.KeyVaultKeyReference
- 					withSourceVault = com.microsoft.azure.SubResource
- 						withId = java.lang.String
- 					withKeyUrl = java.lang.String
- 			withOsType = com.microsoft.azure.management.compute.OperatingSystemTypes
- 			withDiskSizeGB = java.lang.Integer
- 			withCreateOption = com.microsoft.azure.management.compute.DiskCreateOptionTypes
- 			withCaching = com.microsoft.azure.management.compute.CachingTypes
- 			withWriteAcceleratorEnabled = java.lang.Boolean
- 			withImage = com.microsoft.azure.management.compute.VirtualHardDisk
- 				withUri = java.lang.String
- 			withManagedDisk = com.microsoft.azure.management.compute.ManagedDiskParameters
- 				withStorageAccountType = com.microsoft.azure.management.compute.StorageAccountTypes
- 				withId = java.lang.String
- 			withVhd = com.microsoft.azure.management.compute.VirtualHardDisk
- 				withUri = java.lang.String
- 		withDataDisks = java.util.List<com.microsoft.azure.management.compute.DataDisk>
- 			withName = java.lang.String
- 			withDiskSizeGB = java.lang.Integer
- 			withLun = int
- 			withCreateOption = com.microsoft.azure.management.compute.DiskCreateOptionTypes
- 			withCaching = com.microsoft.azure.management.compute.CachingTypes
- 			withWriteAcceleratorEnabled = java.lang.Boolean
- 			withImage = com.microsoft.azure.management.compute.VirtualHardDisk
- 				withUri = java.lang.String
- 			withManagedDisk = com.microsoft.azure.management.compute.ManagedDiskParameters
- 				withStorageAccountType = com.microsoft.azure.management.compute.StorageAccountTypes
- 				withId = java.lang.String
- 			withVhd = com.microsoft.azure.management.compute.VirtualHardDisk
- 				withUri = java.lang.String
- 	withHardwareProfile = com.microsoft.azure.management.compute.HardwareProfile
- 		withVmSize = com.microsoft.azure.management.compute.VirtualMachineSizeTypes
- 	withOsProfile = com.microsoft.azure.management.compute.OSProfile
- 		withLinuxConfiguration = com.microsoft.azure.management.compute.LinuxConfiguration
- 			withProvisionVMAgent = java.lang.Boolean
- 			withDisablePasswordAuthentication = java.lang.Boolean
- 			withSsh = com.microsoft.azure.management.compute.SshConfiguration
- 				withPublicKeys = java.util.List<com.microsoft.azure.management.compute.SshPublicKey>
- 					withPath = java.lang.String
- 					withKeyData = java.lang.String
- 		withCustomData = java.lang.String
- 		withWindowsConfiguration = com.microsoft.azure.management.compute.WindowsConfiguration
- 			withProvisionVMAgent = java.lang.Boolean
- 			withEnableAutomaticUpdates = java.lang.Boolean
- 			withTimeZone = java.lang.String
- 			withWinRM = com.microsoft.azure.management.compute.WinRMConfiguration
- 				withListeners = java.util.List<com.microsoft.azure.management.compute.WinRMListener>
- 					withCertificateUrl = java.lang.String
- 					withProtocol = com.microsoft.azure.management.compute.ProtocolTypes
- 			withAdditionalUnattendContent = java.util.List<com.microsoft.azure.management.compute.AdditionalUnattendContent>
- 				withPassName = com.microsoft.azure.management.compute.PassNames
- 				withComponentName = com.microsoft.azure.management.compute.ComponentNames
- 				withSettingName = com.microsoft.azure.management.compute.SettingNames
- 				withContent = java.lang.String
- 		withSecrets = java.util.List<com.microsoft.azure.management.compute.VaultSecretGroup>
- 			withSourceVault = com.microsoft.azure.SubResource
- 				withId = java.lang.String
- 			withVaultCertificates = java.util.List<com.microsoft.azure.management.compute.VaultCertificate>
- 				withCertificateUrl = java.lang.String
- 				withCertificateStore = java.lang.String
- 		withComputerName = java.lang.String
- 		withAllowExtensionOperations = java.lang.Boolean
- 		withAdminUsername = java.lang.String
- 		withAdminPassword = java.lang.String
- 	withNetworkProfile = com.microsoft.azure.management.compute.NetworkProfile
- 		withNetworkInterfaces = java.util.List<com.microsoft.azure.management.compute.NetworkInterfaceReference>
- 			withPrimary = java.lang.Boolean
- 			withId = java.lang.String
- 	withDiagnosticsProfile = com.microsoft.azure.management.compute.DiagnosticsProfile
- 		withBootDiagnostics = com.microsoft.azure.management.compute.BootDiagnostics
- 			withEnabled = java.lang.Boolean
- 			withStorageUri = java.lang.String
- 	withLicenseType = java.lang.String
- 	withAvailabilitySet = com.microsoft.azure.SubResource
- 		withId = java.lang.String
- 	withLocation = java.lang.String
- 	withTags = java.util.Map<java.lang.String, java.lang.String>
- setVmScaleSetName = java.lang.String
- setInstanceId = java.lang.String
```
## GetInstanceViewVirtualMachineScaleSetVMs parameterss:

```
- setResourceGroupName = java.lang.String
- setVmScaleSetName = java.lang.String
- setInstanceId = java.lang.String
```
## ListByGalleryImageAsyncGalleryImageVersions parameterss:

```
- setResourceGroupName = java.lang.String
- setGalleryName = java.lang.String
- setGalleryImageName = java.lang.String
```
## ListWithServiceResponseAsyncVirtualMachineRunCommands parameterss:

```
- setLocation = java.lang.String
```
## DeleteVirtualMachineExtensions parameterss:

```
- setResourceGroupName = java.lang.String
- setVmName = java.lang.String
- setVmExtensionName = java.lang.String
```
## DeleteWithServiceResponseAsyncVirtualMachineScaleSetVMs parameterss:

```
- setResourceGroupName = java.lang.String
- setVmScaleSetName = java.lang.String
- setInstanceId = java.lang.String
```
## ListOffersAsyncVirtualMachineImages parameterss:

```
- setLocation = java.lang.String
- setPublisherName = java.lang.String
```
## ListVirtualMachineScaleSetVMs parameterss:

```
- setResourceGroupName = java.lang.String
- setVirtualMachineScaleSetName = java.lang.String
```
## DeleteAsyncSnapshots parameterss:

```
- setResourceGroupName = java.lang.String
- setSnapshotName = java.lang.String
```
## ListByGalleryImageWithServiceResponseAsyncGalleryImageVersions parameterss:

```
- setResourceGroupName = java.lang.String
- setGalleryName = java.lang.String
- setGalleryImageName = java.lang.String
```
## DeleteGalleryImages parameterss:

```
- setResourceGroupName = java.lang.String
- setGalleryName = java.lang.String
- setGalleryImageName = java.lang.String
```
## ListNextSinglePageAsyncDisks parameterss:

```
- setNextPageLink = java.lang.String
```
## ListByResourceGroupWithServiceResponseAsyncDisks parameterss:

```
- setResourceGroupName = java.lang.String
```
## ListVirtualMachineScaleSets parameterss:

```
```
## ListNextWithServiceResponseAsyncImages parameterss:

```
- setNextPageLink = java.lang.String
```
## ListByResourceGroupWithServiceResponseAsyncGalleries parameterss:

```
- setResourceGroupName = java.lang.String
```
## ListNextVirtualMachineScaleSetVMs parameterss:

```
- setNextPageLink = java.lang.String
```
## ListAsyncUsages parameterss:

```
- setLocation = java.lang.String
```
## ListWithServiceResponseAsyncSnapshots parameterss:

```
```
## DeleteWithServiceResponseAsyncGalleryImageVersions parameterss:

```
- setResourceGroupName = java.lang.String
- setGalleryName = java.lang.String
- setGalleryImageName = java.lang.String
- setGalleryImageVersionName = java.lang.String
```
## ListSinglePageAsyncSnapshots parameterss:

```
```
## ListImages parameterss:

```
```
## ListWithServiceResponseAsyncVirtualMachineScaleSetVMs parameterss:

```
- setResourceGroupName = java.lang.String
- setVirtualMachineScaleSetName = java.lang.String
```
## BeginUpdateDisks parameterss:

```
- setResourceGroupName = java.lang.String
- setDiskName = java.lang.String
- setDisk = com.microsoft.azure.management.compute.DiskUpdate
- 	withSku = com.microsoft.azure.management.compute.DiskSku
- 		withName = com.microsoft.azure.management.compute.StorageAccountTypes
- 	withTags = java.util.Map<java.lang.String, java.lang.String>
- 	withEncryptionSettings = com.microsoft.azure.management.compute.EncryptionSettings
- 		withEnabled = java.lang.Boolean
- 		withDiskEncryptionKey = com.microsoft.azure.management.compute.KeyVaultAndSecretReference
- 			withSourceVault = com.microsoft.azure.management.compute.SourceVault
- 				withId = java.lang.String
- 			withSecretUrl = java.lang.String
- 		withKeyEncryptionKey = com.microsoft.azure.management.compute.KeyVaultAndKeyReference
- 			withSourceVault = com.microsoft.azure.management.compute.SourceVault
- 				withId = java.lang.String
- 			withKeyUrl = java.lang.String
- 	withOsType = com.microsoft.azure.management.compute.OperatingSystemTypes
- 	withDiskSizeGB = java.lang.Integer
```
## ListByResourceGroupSinglePageAsyncImages parameterss:

```
- setResourceGroupName = java.lang.String
```
## DeleteAsyncVirtualMachineScaleSets parameterss:

```
- setResourceGroupName = java.lang.String
- setVmScaleSetName = java.lang.String
```
## ListNextAsyncVirtualMachineRunCommands parameterss:

```
- setNextPageLink = java.lang.String
```
## DeleteGalleries parameterss:

```
- setResourceGroupName = java.lang.String
- setGalleryName = java.lang.String
```
## ListByResourceGroupNextSinglePageAsyncSnapshots parameterss:

```
- setNextPageLink = java.lang.String
```
## GetLatestVirtualMachineScaleSetRollingUpgrades parameterss:

```
- setResourceGroupName = java.lang.String
- setVmScaleSetName = java.lang.String
```
## DeleteVirtualMachineScaleSetVMs parameterss:

```
- setResourceGroupName = java.lang.String
- setVmScaleSetName = java.lang.String
- setInstanceId = java.lang.String
```
## DeleteAsyncGalleryImages parameterss:

```
- setResourceGroupName = java.lang.String
- setGalleryName = java.lang.String
- setGalleryImageName = java.lang.String
```
## ListAvailableSizesWithServiceResponseAsyncVirtualMachines parameterss:

```
- setResourceGroupName = java.lang.String
- setVmName = java.lang.String
```
## ListWithServiceResponseAsyncResourceSkus parameterss:

```
```
## ListSinglePageAsyncUsages parameterss:

```
- setLocation = java.lang.String
```
## BeginUpdateImages parameterss:

```
- setImageName = java.lang.String
- setResourceGroupName = java.lang.String
- setParameters = com.microsoft.azure.management.compute.ImageUpdate
- 	withSourceVirtualMachine = com.microsoft.azure.SubResource
- 		withId = java.lang.String
- 	withStorageProfile = com.microsoft.azure.management.compute.ImageStorageProfile
- 		withOsDisk = com.microsoft.azure.management.compute.ImageOSDisk
- 			withOsType = com.microsoft.azure.management.compute.OperatingSystemTypes
- 			withDiskSizeGB = java.lang.Integer
- 			withOsState = com.microsoft.azure.management.compute.OperatingSystemStateTypes
- 			withCaching = com.microsoft.azure.management.compute.CachingTypes
- 			withStorageAccountType = com.microsoft.azure.management.compute.StorageAccountTypes
- 			withManagedDisk = com.microsoft.azure.SubResource
- 				withId = java.lang.String
- 			withSnapshot = com.microsoft.azure.SubResource
- 				withId = java.lang.String
- 			withBlobUri = java.lang.String
- 		withDataDisks = java.util.List<com.microsoft.azure.management.compute.ImageDataDisk>
- 			withDiskSizeGB = java.lang.Integer
- 			withLun = int
- 			withCaching = com.microsoft.azure.management.compute.CachingTypes
- 			withStorageAccountType = com.microsoft.azure.management.compute.StorageAccountTypes
- 			withManagedDisk = com.microsoft.azure.SubResource
- 				withId = java.lang.String
- 			withSnapshot = com.microsoft.azure.SubResource
- 				withId = java.lang.String
- 			withBlobUri = java.lang.String
- 		withZoneResilient = java.lang.Boolean
- 	withTags = java.util.Map<java.lang.String, java.lang.String>
```
## ListNextVirtualMachineRunCommands parameterss:

```
- setNextPageLink = java.lang.String
```
## ListSinglePageAsyncVirtualMachines parameterss:

```
```
## ListNextAsyncVirtualMachines parameterss:

```
- setNextPageLink = java.lang.String
```
## DeleteAsyncGalleryImageVersions parameterss:

```
- setResourceGroupName = java.lang.String
- setGalleryName = java.lang.String
- setGalleryImageName = java.lang.String
- setGalleryImageVersionName = java.lang.String
```
## ListSkusAsyncVirtualMachineImages parameterss:

```
- setLocation = java.lang.String
- setOffer = java.lang.String
- setPublisherName = java.lang.String
```
## ListNextUsages parameterss:

```
- setNextPageLink = java.lang.String
```
## ListByResourceGroupNextSinglePageAsyncVirtualMachines parameterss:

```
- setNextPageLink = java.lang.String
```
## ListNextSinglePageAsyncSnapshots parameterss:

```
- setNextPageLink = java.lang.String
```
## GetByResourceGroupSnapshots parameterss:

```
- setResourceGroupName = java.lang.String
- setSnapshotName = java.lang.String
```
## BeginCreateOrUpdateVirtualMachines parameterss:

```
- setResourceGroupName = java.lang.String
- setVmName = java.lang.String
- setParameters = com.microsoft.azure.management.compute.implementation.VirtualMachineInner
- 	withPlan = com.microsoft.azure.management.compute.Plan
- 		withName = java.lang.String
- 		withPublisher = java.lang.String
- 		withProduct = java.lang.String
- 		withPromotionCode = java.lang.String
- 	withStorageProfile = com.microsoft.azure.management.compute.StorageProfile
- 		withImageReference = com.microsoft.azure.management.compute.ImageReference
- 			withSku = java.lang.String
- 			withPublisher = java.lang.String
- 			withOffer = java.lang.String
- 			withVersion = java.lang.String
- 			withId = java.lang.String
- 		withOsDisk = com.microsoft.azure.management.compute.OSDisk
- 			withName = java.lang.String
- 			withEncryptionSettings = com.microsoft.azure.management.compute.DiskEncryptionSettings
- 				withEnabled = java.lang.Boolean
- 				withDiskEncryptionKey = com.microsoft.azure.management.compute.KeyVaultSecretReference
- 					withSourceVault = com.microsoft.azure.SubResource
- 						withId = java.lang.String
- 					withSecretUrl = java.lang.String
- 				withKeyEncryptionKey = com.microsoft.azure.management.compute.KeyVaultKeyReference
- 					withSourceVault = com.microsoft.azure.SubResource
- 						withId = java.lang.String
- 					withKeyUrl = java.lang.String
- 			withOsType = com.microsoft.azure.management.compute.OperatingSystemTypes
- 			withDiskSizeGB = java.lang.Integer
- 			withCreateOption = com.microsoft.azure.management.compute.DiskCreateOptionTypes
- 			withCaching = com.microsoft.azure.management.compute.CachingTypes
- 			withWriteAcceleratorEnabled = java.lang.Boolean
- 			withImage = com.microsoft.azure.management.compute.VirtualHardDisk
- 				withUri = java.lang.String
- 			withManagedDisk = com.microsoft.azure.management.compute.ManagedDiskParameters
- 				withStorageAccountType = com.microsoft.azure.management.compute.StorageAccountTypes
- 				withId = java.lang.String
- 			withVhd = com.microsoft.azure.management.compute.VirtualHardDisk
- 				withUri = java.lang.String
- 		withDataDisks = java.util.List<com.microsoft.azure.management.compute.DataDisk>
- 			withName = java.lang.String
- 			withDiskSizeGB = java.lang.Integer
- 			withLun = int
- 			withCreateOption = com.microsoft.azure.management.compute.DiskCreateOptionTypes
- 			withCaching = com.microsoft.azure.management.compute.CachingTypes
- 			withWriteAcceleratorEnabled = java.lang.Boolean
- 			withImage = com.microsoft.azure.management.compute.VirtualHardDisk
- 				withUri = java.lang.String
- 			withManagedDisk = com.microsoft.azure.management.compute.ManagedDiskParameters
- 				withStorageAccountType = com.microsoft.azure.management.compute.StorageAccountTypes
- 				withId = java.lang.String
- 			withVhd = com.microsoft.azure.management.compute.VirtualHardDisk
- 				withUri = java.lang.String
- 	withHardwareProfile = com.microsoft.azure.management.compute.HardwareProfile
- 		withVmSize = com.microsoft.azure.management.compute.VirtualMachineSizeTypes
- 	withOsProfile = com.microsoft.azure.management.compute.OSProfile
- 		withLinuxConfiguration = com.microsoft.azure.management.compute.LinuxConfiguration
- 			withProvisionVMAgent = java.lang.Boolean
- 			withDisablePasswordAuthentication = java.lang.Boolean
- 			withSsh = com.microsoft.azure.management.compute.SshConfiguration
- 				withPublicKeys = java.util.List<com.microsoft.azure.management.compute.SshPublicKey>
- 					withPath = java.lang.String
- 					withKeyData = java.lang.String
- 		withCustomData = java.lang.String
- 		withWindowsConfiguration = com.microsoft.azure.management.compute.WindowsConfiguration
- 			withProvisionVMAgent = java.lang.Boolean
- 			withEnableAutomaticUpdates = java.lang.Boolean
- 			withTimeZone = java.lang.String
- 			withWinRM = com.microsoft.azure.management.compute.WinRMConfiguration
- 				withListeners = java.util.List<com.microsoft.azure.management.compute.WinRMListener>
- 					withCertificateUrl = java.lang.String
- 					withProtocol = com.microsoft.azure.management.compute.ProtocolTypes
- 			withAdditionalUnattendContent = java.util.List<com.microsoft.azure.management.compute.AdditionalUnattendContent>
- 				withPassName = com.microsoft.azure.management.compute.PassNames
- 				withComponentName = com.microsoft.azure.management.compute.ComponentNames
- 				withSettingName = com.microsoft.azure.management.compute.SettingNames
- 				withContent = java.lang.String
- 		withSecrets = java.util.List<com.microsoft.azure.management.compute.VaultSecretGroup>
- 			withSourceVault = com.microsoft.azure.SubResource
- 				withId = java.lang.String
- 			withVaultCertificates = java.util.List<com.microsoft.azure.management.compute.VaultCertificate>
- 				withCertificateUrl = java.lang.String
- 				withCertificateStore = java.lang.String
- 		withComputerName = java.lang.String
- 		withAllowExtensionOperations = java.lang.Boolean
- 		withAdminUsername = java.lang.String
- 		withAdminPassword = java.lang.String
- 	withNetworkProfile = com.microsoft.azure.management.compute.NetworkProfile
- 		withNetworkInterfaces = java.util.List<com.microsoft.azure.management.compute.NetworkInterfaceReference>
- 			withPrimary = java.lang.Boolean
- 			withId = java.lang.String
- 	withDiagnosticsProfile = com.microsoft.azure.management.compute.DiagnosticsProfile
- 		withBootDiagnostics = com.microsoft.azure.management.compute.BootDiagnostics
- 			withEnabled = java.lang.Boolean
- 			withStorageUri = java.lang.String
- 	withLicenseType = java.lang.String
- 	withAvailabilitySet = com.microsoft.azure.SubResource
- 		withId = java.lang.String
- 	withIdentity = com.microsoft.azure.management.compute.VirtualMachineIdentity
- 		withType = com.microsoft.azure.management.compute.ResourceIdentityType
- 		withUserAssignedIdentities = java.util.Map<java.lang.String, com.microsoft.azure.management.compute.VirtualMachineIdentityUserAssignedIdentitiesValue>
- 	withZones = java.util.List<java.lang.String>
- 	withLocation = java.lang.String
- 	withTags = java.util.Map<java.lang.String, java.lang.String>
```
## ListVirtualMachineRunCommands parameterss:

```
- setLocation = java.lang.String
```
## ListVirtualMachines parameterss:

```
```
## ListAsyncVirtualMachineExtensions parameterss:

```
- setResourceGroupName = java.lang.String
- setVmName = java.lang.String
```
## ListNextVirtualMachineScaleSets parameterss:

```
- setNextPageLink = java.lang.String
```
## ListByResourceGroupNextWithServiceResponseAsyncGalleries parameterss:

```
- setNextPageLink = java.lang.String
```
## ListVirtualMachineExtensions parameterss:

```
- setResourceGroupName = java.lang.String
- setVmName = java.lang.String
```
## BeginUpdateVirtualMachineScaleSetVMs parameterss:

```
- setResourceGroupName = java.lang.String
- setParameters = com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInner
- 	withPlan = com.microsoft.azure.management.compute.Plan
- 		withName = java.lang.String
- 		withPublisher = java.lang.String
- 		withProduct = java.lang.String
- 		withPromotionCode = java.lang.String
- 	withStorageProfile = com.microsoft.azure.management.compute.StorageProfile
- 		withImageReference = com.microsoft.azure.management.compute.ImageReference
- 			withSku = java.lang.String
- 			withPublisher = java.lang.String
- 			withOffer = java.lang.String
- 			withVersion = java.lang.String
- 			withId = java.lang.String
- 		withOsDisk = com.microsoft.azure.management.compute.OSDisk
- 			withName = java.lang.String
- 			withEncryptionSettings = com.microsoft.azure.management.compute.DiskEncryptionSettings
- 				withEnabled = java.lang.Boolean
- 				withDiskEncryptionKey = com.microsoft.azure.management.compute.KeyVaultSecretReference
- 					withSourceVault = com.microsoft.azure.SubResource
- 						withId = java.lang.String
- 					withSecretUrl = java.lang.String
- 				withKeyEncryptionKey = com.microsoft.azure.management.compute.KeyVaultKeyReference
- 					withSourceVault = com.microsoft.azure.SubResource
- 						withId = java.lang.String
- 					withKeyUrl = java.lang.String
- 			withOsType = com.microsoft.azure.management.compute.OperatingSystemTypes
- 			withDiskSizeGB = java.lang.Integer
- 			withCreateOption = com.microsoft.azure.management.compute.DiskCreateOptionTypes
- 			withCaching = com.microsoft.azure.management.compute.CachingTypes
- 			withWriteAcceleratorEnabled = java.lang.Boolean
- 			withImage = com.microsoft.azure.management.compute.VirtualHardDisk
- 				withUri = java.lang.String
- 			withManagedDisk = com.microsoft.azure.management.compute.ManagedDiskParameters
- 				withStorageAccountType = com.microsoft.azure.management.compute.StorageAccountTypes
- 				withId = java.lang.String
- 			withVhd = com.microsoft.azure.management.compute.VirtualHardDisk
- 				withUri = java.lang.String
- 		withDataDisks = java.util.List<com.microsoft.azure.management.compute.DataDisk>
- 			withName = java.lang.String
- 			withDiskSizeGB = java.lang.Integer
- 			withLun = int
- 			withCreateOption = com.microsoft.azure.management.compute.DiskCreateOptionTypes
- 			withCaching = com.microsoft.azure.management.compute.CachingTypes
- 			withWriteAcceleratorEnabled = java.lang.Boolean
- 			withImage = com.microsoft.azure.management.compute.VirtualHardDisk
- 				withUri = java.lang.String
- 			withManagedDisk = com.microsoft.azure.management.compute.ManagedDiskParameters
- 				withStorageAccountType = com.microsoft.azure.management.compute.StorageAccountTypes
- 				withId = java.lang.String
- 			withVhd = com.microsoft.azure.management.compute.VirtualHardDisk
- 				withUri = java.lang.String
- 	withHardwareProfile = com.microsoft.azure.management.compute.HardwareProfile
- 		withVmSize = com.microsoft.azure.management.compute.VirtualMachineSizeTypes
- 	withOsProfile = com.microsoft.azure.management.compute.OSProfile
- 		withLinuxConfiguration = com.microsoft.azure.management.compute.LinuxConfiguration
- 			withProvisionVMAgent = java.lang.Boolean
- 			withDisablePasswordAuthentication = java.lang.Boolean
- 			withSsh = com.microsoft.azure.management.compute.SshConfiguration
- 				withPublicKeys = java.util.List<com.microsoft.azure.management.compute.SshPublicKey>
- 					withPath = java.lang.String
- 					withKeyData = java.lang.String
- 		withCustomData = java.lang.String
- 		withWindowsConfiguration = com.microsoft.azure.management.compute.WindowsConfiguration
- 			withProvisionVMAgent = java.lang.Boolean
- 			withEnableAutomaticUpdates = java.lang.Boolean
- 			withTimeZone = java.lang.String
- 			withWinRM = com.microsoft.azure.management.compute.WinRMConfiguration
- 				withListeners = java.util.List<com.microsoft.azure.management.compute.WinRMListener>
- 					withCertificateUrl = java.lang.String
- 					withProtocol = com.microsoft.azure.management.compute.ProtocolTypes
- 			withAdditionalUnattendContent = java.util.List<com.microsoft.azure.management.compute.AdditionalUnattendContent>
- 				withPassName = com.microsoft.azure.management.compute.PassNames
- 				withComponentName = com.microsoft.azure.management.compute.ComponentNames
- 				withSettingName = com.microsoft.azure.management.compute.SettingNames
- 				withContent = java.lang.String
- 		withSecrets = java.util.List<com.microsoft.azure.management.compute.VaultSecretGroup>
- 			withSourceVault = com.microsoft.azure.SubResource
- 				withId = java.lang.String
- 			withVaultCertificates = java.util.List<com.microsoft.azure.management.compute.VaultCertificate>
- 				withCertificateUrl = java.lang.String
- 				withCertificateStore = java.lang.String
- 		withComputerName = java.lang.String
- 		withAllowExtensionOperations = java.lang.Boolean
- 		withAdminUsername = java.lang.String
- 		withAdminPassword = java.lang.String
- 	withNetworkProfile = com.microsoft.azure.management.compute.NetworkProfile
- 		withNetworkInterfaces = java.util.List<com.microsoft.azure.management.compute.NetworkInterfaceReference>
- 			withPrimary = java.lang.Boolean
- 			withId = java.lang.String
- 	withDiagnosticsProfile = com.microsoft.azure.management.compute.DiagnosticsProfile
- 		withBootDiagnostics = com.microsoft.azure.management.compute.BootDiagnostics
- 			withEnabled = java.lang.Boolean
- 			withStorageUri = java.lang.String
- 	withLicenseType = java.lang.String
- 	withAvailabilitySet = com.microsoft.azure.SubResource
- 		withId = java.lang.String
- 	withLocation = java.lang.String
- 	withTags = java.util.Map<java.lang.String, java.lang.String>
- setVmScaleSetName = java.lang.String
- setInstanceId = java.lang.String
```
## ExportRequestRateByIntervalLogAnalytics parameterss:

```
- setLocation = java.lang.String
- setParameters = com.microsoft.azure.management.compute.RequestRateByIntervalInput
- 	withIntervalLength = com.microsoft.azure.management.compute.IntervalInMins
- 	withFromTime = org.joda.time.DateTime
- 		withChronology = org.joda.time.Chronology
- 			withZone = org.joda.time.DateTimeZone
- 		withMillis = long
- 		withZone = org.joda.time.DateTimeZone
- 		withZoneRetainFields = org.joda.time.DateTimeZone
- 		withFields = org.joda.time.ReadablePartial
- 		withEra = int
- 		withCenturyOfEra = int
- 		withYearOfEra = int
- 		withYearOfCentury = int
- 		withYear = int
- 		withWeekyear = int
- 		withMonthOfYear = int
- 		withWeekOfWeekyear = int
- 		withDayOfYear = int
- 		withDayOfMonth = int
- 		withDayOfWeek = int
- 		withHourOfDay = int
- 		withMinuteOfHour = int
- 		withSecondOfMinute = int
- 		withMillisOfSecond = int
- 		withMillisOfDay = int
- 	withToTime = org.joda.time.DateTime
- 		withChronology = org.joda.time.Chronology
- 			withZone = org.joda.time.DateTimeZone
- 		withMillis = long
- 		withZone = org.joda.time.DateTimeZone
- 		withZoneRetainFields = org.joda.time.DateTimeZone
- 		withFields = org.joda.time.ReadablePartial
- 		withEra = int
- 		withCenturyOfEra = int
- 		withYearOfEra = int
- 		withYearOfCentury = int
- 		withYear = int
- 		withWeekyear = int
- 		withMonthOfYear = int
- 		withWeekOfWeekyear = int
- 		withDayOfYear = int
- 		withDayOfMonth = int
- 		withDayOfWeek = int
- 		withHourOfDay = int
- 		withMinuteOfHour = int
- 		withSecondOfMinute = int
- 		withMillisOfSecond = int
- 		withMillisOfDay = int
- 	withGroupByThrottlePolicy = java.lang.Boolean
- 	withGroupByOperationName = java.lang.Boolean
- 	withGroupByResourceName = java.lang.Boolean
- 	withBlobContainerSasUri = java.lang.String
```
## ListNextSnapshots parameterss:

```
- setNextPageLink = java.lang.String
```
