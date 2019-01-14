## ListOffers parameterss:

```
- setPublisherName = java.lang.String
- setLocation = java.lang.String
```
## ListSkusNext parameterss:

```
- setNextPageLink = java.lang.String
```
## Delete parameterss:

```
- setResourceGroupName = java.lang.String
- setImageName = java.lang.String
```
## BeginExportThrottledRequests parameterss:

```
- setParameters = com.microsoft.azure.management.compute.ThrottledRequestsInput
- 	withBlobContainerSasUri = java.lang.String
- 	withFromTime = org.joda.time.DateTime
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
- 		withMillis = long
- 		withZone = org.joda.time.DateTimeZone
- 		withZoneRetainFields = org.joda.time.DateTimeZone
- 		withFields = org.joda.time.ReadablePartial
- 		withChronology = org.joda.time.Chronology
- 			withZone = org.joda.time.DateTimeZone
- 	withToTime = org.joda.time.DateTime
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
- 		withMillis = long
- 		withZone = org.joda.time.DateTimeZone
- 		withZoneRetainFields = org.joda.time.DateTimeZone
- 		withFields = org.joda.time.ReadablePartial
- 		withChronology = org.joda.time.Chronology
- 			withZone = org.joda.time.DateTimeZone
- 	withGroupByThrottlePolicy = java.lang.Boolean
- 	withGroupByOperationName = java.lang.Boolean
- 	withGroupByResourceName = java.lang.Boolean
- setLocation = java.lang.String
```
## ListByGallery parameterss:

```
- setResourceGroupName = java.lang.String
- setGalleryName = java.lang.String
```
## ListSinglePageAsync parameterss:

```
```
## ListSkusWithServiceResponseAsync parameterss:

```
- setResourceGroupName = java.lang.String
- setVmScaleSetName = java.lang.String
```
## ListByGalleryImageAsync parameterss:

```
- setResourceGroupName = java.lang.String
- setGalleryName = java.lang.String
- setGalleryImageName = java.lang.String
```
## ListAsync parameterss:

```
- setPublisherName = java.lang.String
- setOffer = java.lang.String
- setSkus = java.lang.String
- setLocation = java.lang.String
```
## ListPublishersWithServiceResponseAsync parameterss:

```
- setLocation = java.lang.String
```
## Update parameterss:

```
- setResourceGroupName = java.lang.String
- setDiskName = java.lang.String
- setDisk = com.microsoft.azure.management.compute.DiskUpdate
- 	withSku = com.microsoft.azure.management.compute.DiskSku
- 		withName = com.microsoft.azure.management.compute.StorageAccountTypes
- 	withOsType = com.microsoft.azure.management.compute.OperatingSystemTypes
- 	withDiskSizeGB = java.lang.Integer
- 	withEncryptionSettings = com.microsoft.azure.management.compute.EncryptionSettings
- 		withEnabled = java.lang.Boolean
- 		withDiskEncryptionKey = com.microsoft.azure.management.compute.KeyVaultAndSecretReference
- 			withSourceVault = com.microsoft.azure.management.compute.SourceVault
- 				withId = java.lang.String
- 			withSecretUrl = java.lang.String
- 		withKeyEncryptionKey = com.microsoft.azure.management.compute.KeyVaultAndKeyReference
- 			withKeyUrl = java.lang.String
- 			withSourceVault = com.microsoft.azure.management.compute.SourceVault
- 				withId = java.lang.String
- 	withTags = java.util.Map<java.lang.String, java.lang.String>
```
## ListByGalleryNextWithServiceResponseAsync parameterss:

```
- setNextPageLink = java.lang.String
```
## Capture parameterss:

```
- setResourceGroupName = java.lang.String
- setVmName = java.lang.String
- setParameters = com.microsoft.azure.management.compute.VirtualMachineCaptureParameters
- 	withVhdPrefix = java.lang.String
- 	withDestinationContainerName = java.lang.String
- 	withOverwriteVhds = boolean
```
## DeleteInstancesWithServiceResponseAsync parameterss:

```
- setResourceGroupName = java.lang.String
- setVmScaleSetName = java.lang.String
- setInstanceIds = java.util.List<java.lang.String>
```
## ListPublishers parameterss:

```
- setLocation = java.lang.String
```
## ListAvailableSizesWithServiceResponseAsync parameterss:

```
- setResourceGroupName = java.lang.String
- setAvailabilitySetName = java.lang.String
```
## DeleteAsync parameterss:

```
- setResourceGroupName = java.lang.String
- setImageName = java.lang.String
```
## BeginUpdate parameterss:

```
- setResourceGroupName = java.lang.String
- setDiskName = java.lang.String
- setDisk = com.microsoft.azure.management.compute.DiskUpdate
- 	withSku = com.microsoft.azure.management.compute.DiskSku
- 		withName = com.microsoft.azure.management.compute.StorageAccountTypes
- 	withOsType = com.microsoft.azure.management.compute.OperatingSystemTypes
- 	withDiskSizeGB = java.lang.Integer
- 	withEncryptionSettings = com.microsoft.azure.management.compute.EncryptionSettings
- 		withEnabled = java.lang.Boolean
- 		withDiskEncryptionKey = com.microsoft.azure.management.compute.KeyVaultAndSecretReference
- 			withSourceVault = com.microsoft.azure.management.compute.SourceVault
- 				withId = java.lang.String
- 			withSecretUrl = java.lang.String
- 		withKeyEncryptionKey = com.microsoft.azure.management.compute.KeyVaultAndKeyReference
- 			withKeyUrl = java.lang.String
- 			withSourceVault = com.microsoft.azure.management.compute.SourceVault
- 				withId = java.lang.String
- 	withTags = java.util.Map<java.lang.String, java.lang.String>
```
## ListOffersWithServiceResponseAsync parameterss:

```
- setPublisherName = java.lang.String
- setLocation = java.lang.String
```
## CreateOrUpdate parameterss:

```
- setResourceGroupName = java.lang.String
- setVmName = java.lang.String
- setExtensionParameters = com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionInner
- 	withForceUpdateTag = java.lang.String
- 	withPublisher = java.lang.String
- 	withTypeHandlerVersion = java.lang.String
- 	withAutoUpgradeMinorVersion = java.lang.Boolean
- 	withSettings = java.lang.Object
- 	withProtectedSettings = java.lang.Object
- 	withVirtualMachineExtensionType = java.lang.String
- 	withInstanceView = com.microsoft.azure.management.compute.VirtualMachineExtensionInstanceView
- 		withName = java.lang.String
- 		withType = java.lang.String
- 		withTypeHandlerVersion = java.lang.String
- 		withStatuses = java.util.List<com.microsoft.azure.management.compute.InstanceViewStatus>
- 			withTime = org.joda.time.DateTime
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
- 				withMillis = long
- 				withZone = org.joda.time.DateTimeZone
- 				withZoneRetainFields = org.joda.time.DateTimeZone
- 				withFields = org.joda.time.ReadablePartial
- 				withChronology = org.joda.time.Chronology
- 					withZone = org.joda.time.DateTimeZone
- 			withCode = java.lang.String
- 			withLevel = com.microsoft.azure.management.compute.StatusLevelTypes
- 			withDisplayStatus = java.lang.String
- 			withMessage = java.lang.String
- 		withSubstatuses = java.util.List<com.microsoft.azure.management.compute.InstanceViewStatus>
- 			withTime = org.joda.time.DateTime
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
- 				withMillis = long
- 				withZone = org.joda.time.DateTimeZone
- 				withZoneRetainFields = org.joda.time.DateTimeZone
- 				withFields = org.joda.time.ReadablePartial
- 				withChronology = org.joda.time.Chronology
- 					withZone = org.joda.time.DateTimeZone
- 			withCode = java.lang.String
- 			withLevel = com.microsoft.azure.management.compute.StatusLevelTypes
- 			withDisplayStatus = java.lang.String
- 			withMessage = java.lang.String
- 	withLocation = java.lang.String
- 	withTags = java.util.Map<java.lang.String, java.lang.String>
- setVmExtensionName = java.lang.String
```
## ListByResourceGroupAsync parameterss:

```
- setResourceGroupName = java.lang.String
```
## List parameterss:

```
- setLocation = java.lang.String
```
## DeleteInstances parameterss:

```
- setResourceGroupName = java.lang.String
- setVmScaleSetName = java.lang.String
- setInstanceIds = java.util.List<java.lang.String>
```
## ListSkusSinglePageAsync parameterss:

```
- setResourceGroupName = java.lang.String
- setVmScaleSetName = java.lang.String
```
## ListByGalleryImage parameterss:

```
- setResourceGroupName = java.lang.String
- setGalleryName = java.lang.String
- setGalleryImageName = java.lang.String
```
## ExportThrottledRequests parameterss:

```
- setParameters = com.microsoft.azure.management.compute.ThrottledRequestsInput
- 	withBlobContainerSasUri = java.lang.String
- 	withFromTime = org.joda.time.DateTime
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
- 		withMillis = long
- 		withZone = org.joda.time.DateTimeZone
- 		withZoneRetainFields = org.joda.time.DateTimeZone
- 		withFields = org.joda.time.ReadablePartial
- 		withChronology = org.joda.time.Chronology
- 			withZone = org.joda.time.DateTimeZone
- 	withToTime = org.joda.time.DateTime
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
- 		withMillis = long
- 		withZone = org.joda.time.DateTimeZone
- 		withZoneRetainFields = org.joda.time.DateTimeZone
- 		withFields = org.joda.time.ReadablePartial
- 		withChronology = org.joda.time.Chronology
- 			withZone = org.joda.time.DateTimeZone
- 	withGroupByThrottlePolicy = java.lang.Boolean
- 	withGroupByOperationName = java.lang.Boolean
- 	withGroupByResourceName = java.lang.Boolean
- setLocation = java.lang.String
```
## ListVersionsWithServiceResponseAsync parameterss:

```
- setPublisherName = java.lang.String
- setType = java.lang.String
- setLocation = java.lang.String
```
## ListByGalleryImageNextWithServiceResponseAsync parameterss:

```
- setNextPageLink = java.lang.String
```
## ListNextSinglePageAsync parameterss:

```
- setNextPageLink = java.lang.String
```
## ListByGalleryNext parameterss:

```
- setNextPageLink = java.lang.String
```
## GrantAccess parameterss:

```
- setResourceGroupName = java.lang.String
- setDiskName = java.lang.String
- setGrantAccessData = com.microsoft.azure.management.compute.GrantAccessData
- 	withAccess = com.microsoft.azure.management.compute.AccessLevel
- 	withDurationInSeconds = int
```
## ListWithServiceResponseAsync parameterss:

```
- setLocation = java.lang.String
```
## ListTypesAsync parameterss:

```
- setPublisherName = java.lang.String
- setLocation = java.lang.String
```
## ListNextAsync parameterss:

```
- setNextPageLink = java.lang.String
```
## ListByResourceGroupSinglePageAsync parameterss:

```
- setResourceGroupName = java.lang.String
```
## Get parameterss:

```
- setResourceGroupName = java.lang.String
- setGalleryName = java.lang.String
- setGalleryImageName = java.lang.String
- setGalleryImageVersionName = java.lang.String
```
## ListTypes parameterss:

```
- setPublisherName = java.lang.String
- setLocation = java.lang.String
```
## ListByResourceGroupWithServiceResponseAsync parameterss:

```
- setResourceGroupName = java.lang.String
```
## ListByResourceGroup parameterss:

```
- setResourceGroupName = java.lang.String
```
## ListSkusNextAsync parameterss:

```
- setNextPageLink = java.lang.String
```
## GetLatest parameterss:

```
- setResourceGroupName = java.lang.String
- setVmScaleSetName = java.lang.String
```
## ListAvailableSizes parameterss:

```
- setResourceGroupName = java.lang.String
- setAvailabilitySetName = java.lang.String
```
## GetInstanceView parameterss:

```
- setResourceGroupName = java.lang.String
- setVmScaleSetName = java.lang.String
```
## ListByResourceGroupNextSinglePageAsync parameterss:

```
- setNextPageLink = java.lang.String
```
## ListByGalleryImageWithServiceResponseAsync parameterss:

```
- setResourceGroupName = java.lang.String
- setGalleryName = java.lang.String
- setGalleryImageName = java.lang.String
```
## ExportRequestRateByInterval parameterss:

```
- setParameters = com.microsoft.azure.management.compute.RequestRateByIntervalInput
- 	withIntervalLength = com.microsoft.azure.management.compute.IntervalInMins
- 	withBlobContainerSasUri = java.lang.String
- 	withFromTime = org.joda.time.DateTime
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
- 		withMillis = long
- 		withZone = org.joda.time.DateTimeZone
- 		withZoneRetainFields = org.joda.time.DateTimeZone
- 		withFields = org.joda.time.ReadablePartial
- 		withChronology = org.joda.time.Chronology
- 			withZone = org.joda.time.DateTimeZone
- 	withToTime = org.joda.time.DateTime
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
- 		withMillis = long
- 		withZone = org.joda.time.DateTimeZone
- 		withZoneRetainFields = org.joda.time.DateTimeZone
- 		withFields = org.joda.time.ReadablePartial
- 		withChronology = org.joda.time.Chronology
- 			withZone = org.joda.time.DateTimeZone
- 	withGroupByThrottlePolicy = java.lang.Boolean
- 	withGroupByOperationName = java.lang.Boolean
- 	withGroupByResourceName = java.lang.Boolean
- setLocation = java.lang.String
```
## BeginExportRequestRateByInterval parameterss:

```
- setParameters = com.microsoft.azure.management.compute.RequestRateByIntervalInput
- 	withIntervalLength = com.microsoft.azure.management.compute.IntervalInMins
- 	withBlobContainerSasUri = java.lang.String
- 	withFromTime = org.joda.time.DateTime
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
- 		withMillis = long
- 		withZone = org.joda.time.DateTimeZone
- 		withZoneRetainFields = org.joda.time.DateTimeZone
- 		withFields = org.joda.time.ReadablePartial
- 		withChronology = org.joda.time.Chronology
- 			withZone = org.joda.time.DateTimeZone
- 	withToTime = org.joda.time.DateTime
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
- 		withMillis = long
- 		withZone = org.joda.time.DateTimeZone
- 		withZoneRetainFields = org.joda.time.DateTimeZone
- 		withFields = org.joda.time.ReadablePartial
- 		withChronology = org.joda.time.Chronology
- 			withZone = org.joda.time.DateTimeZone
- 	withGroupByThrottlePolicy = java.lang.Boolean
- 	withGroupByOperationName = java.lang.Boolean
- 	withGroupByResourceName = java.lang.Boolean
- setLocation = java.lang.String
```
## ListByGalleryNextAsync parameterss:

```
- setNextPageLink = java.lang.String
```
## ListByGalleryImageNextAsync parameterss:

```
- setNextPageLink = java.lang.String
```
## GetByResourceGroup parameterss:

```
- setResourceGroupName = java.lang.String
- setAvailabilitySetName = java.lang.String
```
## ListByResourceGroupNext parameterss:

```
- setNextPageLink = java.lang.String
```
## BeginCreateOrUpdate parameterss:

```
- setResourceGroupName = java.lang.String
- setVmName = java.lang.String
- setExtensionParameters = com.microsoft.azure.management.compute.implementation.VirtualMachineExtensionInner
- 	withForceUpdateTag = java.lang.String
- 	withPublisher = java.lang.String
- 	withTypeHandlerVersion = java.lang.String
- 	withAutoUpgradeMinorVersion = java.lang.Boolean
- 	withSettings = java.lang.Object
- 	withProtectedSettings = java.lang.Object
- 	withVirtualMachineExtensionType = java.lang.String
- 	withInstanceView = com.microsoft.azure.management.compute.VirtualMachineExtensionInstanceView
- 		withName = java.lang.String
- 		withType = java.lang.String
- 		withTypeHandlerVersion = java.lang.String
- 		withStatuses = java.util.List<com.microsoft.azure.management.compute.InstanceViewStatus>
- 			withTime = org.joda.time.DateTime
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
- 				withMillis = long
- 				withZone = org.joda.time.DateTimeZone
- 				withZoneRetainFields = org.joda.time.DateTimeZone
- 				withFields = org.joda.time.ReadablePartial
- 				withChronology = org.joda.time.Chronology
- 					withZone = org.joda.time.DateTimeZone
- 			withCode = java.lang.String
- 			withLevel = com.microsoft.azure.management.compute.StatusLevelTypes
- 			withDisplayStatus = java.lang.String
- 			withMessage = java.lang.String
- 		withSubstatuses = java.util.List<com.microsoft.azure.management.compute.InstanceViewStatus>
- 			withTime = org.joda.time.DateTime
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
- 				withMillis = long
- 				withZone = org.joda.time.DateTimeZone
- 				withZoneRetainFields = org.joda.time.DateTimeZone
- 				withFields = org.joda.time.ReadablePartial
- 				withChronology = org.joda.time.Chronology
- 					withZone = org.joda.time.DateTimeZone
- 			withCode = java.lang.String
- 			withLevel = com.microsoft.azure.management.compute.StatusLevelTypes
- 			withDisplayStatus = java.lang.String
- 			withMessage = java.lang.String
- 	withLocation = java.lang.String
- 	withTags = java.util.Map<java.lang.String, java.lang.String>
- setVmExtensionName = java.lang.String
```
## ListByResourceGroupNextAsync parameterss:

```
- setNextPageLink = java.lang.String
```
## ListAvailableSizesAsync parameterss:

```
- setResourceGroupName = java.lang.String
- setAvailabilitySetName = java.lang.String
```
## ListSkus parameterss:

```
- setPublisherName = java.lang.String
- setOffer = java.lang.String
- setLocation = java.lang.String
```
## ListByResourceGroupNextWithServiceResponseAsync parameterss:

```
- setNextPageLink = java.lang.String
```
## ListSkusAsync parameterss:

```
- setResourceGroupName = java.lang.String
- setVmScaleSetName = java.lang.String
```
## DeleteInstancesAsync parameterss:

```
- setResourceGroupName = java.lang.String
- setVmScaleSetName = java.lang.String
- setInstanceIds = java.util.List<java.lang.String>
```
## ListNext parameterss:

```
- setNextPageLink = java.lang.String
```
## ListTypesWithServiceResponseAsync parameterss:

```
- setPublisherName = java.lang.String
- setLocation = java.lang.String
```
## ListByGalleryWithServiceResponseAsync parameterss:

```
- setResourceGroupName = java.lang.String
- setGalleryName = java.lang.String
```
## ListByGalleryImageSinglePageAsync parameterss:

```
- setResourceGroupName = java.lang.String
- setGalleryName = java.lang.String
- setGalleryImageName = java.lang.String
```
## ListVersionsAsync parameterss:

```
- setPublisherName = java.lang.String
- setType = java.lang.String
- setLocation = java.lang.String
```
## DeleteWithServiceResponseAsync parameterss:

```
- setResourceGroupName = java.lang.String
- setImageName = java.lang.String
```
## ListVersions parameterss:

```
- setPublisherName = java.lang.String
- setType = java.lang.String
- setLocation = java.lang.String
```
## ListByGalleryAsync parameterss:

```
- setResourceGroupName = java.lang.String
- setGalleryName = java.lang.String
```
## ListSkusNextSinglePageAsync parameterss:

```
- setNextPageLink = java.lang.String
```
## ListPublishersAsync parameterss:

```
- setLocation = java.lang.String
```
## ListOffersAsync parameterss:

```
- setPublisherName = java.lang.String
- setLocation = java.lang.String
```
## BeginCapture parameterss:

```
- setResourceGroupName = java.lang.String
- setVmName = java.lang.String
- setParameters = com.microsoft.azure.management.compute.VirtualMachineCaptureParameters
- 	withVhdPrefix = java.lang.String
- 	withDestinationContainerName = java.lang.String
- 	withOverwriteVhds = boolean
```
## ForceRecoveryServiceFabricPlatformUpdateDomainWalk parameterss:

```
- setResourceGroupName = java.lang.String
- setVmScaleSetName = java.lang.String
- setPlatformUpdateDomain = int
```
## ListSkusNextWithServiceResponseAsync parameterss:

```
- setNextPageLink = java.lang.String
```
## ListByGalleryImageNext parameterss:

```
- setNextPageLink = java.lang.String
```
## ListNextWithServiceResponseAsync parameterss:

```
- setNextPageLink = java.lang.String
```
## ListByGallerySinglePageAsync parameterss:

```
- setResourceGroupName = java.lang.String
- setGalleryName = java.lang.String
```
## ListByGalleryNextSinglePageAsync parameterss:

```
- setNextPageLink = java.lang.String
```
## BeginGrantAccess parameterss:

```
- setResourceGroupName = java.lang.String
- setDiskName = java.lang.String
- setGrantAccessData = com.microsoft.azure.management.compute.GrantAccessData
- 	withAccess = com.microsoft.azure.management.compute.AccessLevel
- 	withDurationInSeconds = int
```
## ListByGalleryImageNextSinglePageAsync parameterss:

```
- setNextPageLink = java.lang.String
```
