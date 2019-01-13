## DescribeDisasterRecoverGroupQuota parameterss:

```
```
## RenewHosts parameterss:

```
- setHostChargePrepaid = com.tencentcloudapi.cvm.v20170312.models.ChargePrepaid
- 	setRenewFlag = java.lang.String
- 	setPeriod = java.lang.Integer
- setHostIds = java.lang.String[]
```
## RenewInstances parameterss:

```
- setInstanceIds = java.lang.String[]
- setInstanceChargePrepaid = com.tencentcloudapi.cvm.v20170312.models.InstanceChargePrepaid
- 	setRenewFlag = java.lang.String
- 	setPeriod = java.lang.Integer
- setRenewPortableDataDisk = java.lang.Boolean
```
## StopInstances parameterss:

```
- setInstanceIds = java.lang.String[]
- setForceStop = java.lang.Boolean
- setStopType = java.lang.String
- setStoppedMode = java.lang.String
```
## ModifyKeyPairAttribute parameterss:

```
- setKeyName = java.lang.String
- setDescription = java.lang.String
- setKeyId = java.lang.String
```
## DisassociateSecurityGroups parameterss:

```
- setInstanceIds = java.lang.String[]
- setSecurityGroupIds = java.lang.String[]
```
## ModifyInstancesVpcAttribute parameterss:

```
- setInstanceIds = java.lang.String[]
- setForceStop = java.lang.Boolean
- setVirtualPrivateCloud = com.tencentcloudapi.cvm.v20170312.models.VirtualPrivateCloud
- 	setVpcId = java.lang.String
- 	setSubnetId = java.lang.String
- 	setAsVpcGateway = java.lang.Boolean
- 	setPrivateIpAddresses = java.lang.String[]
```
## DescribeInstanceVncUrl parameterss:

```
- setInstanceId = java.lang.String
```
## DescribeZones parameterss:

```
```
## DeleteDisasterRecoverGroups parameterss:

```
- setDisasterRecoverGroupIds = java.lang.String[]
```
## DisassociateInstancesKeyPairs parameterss:

```
- setInstanceIds = java.lang.String[]
- setKeyIds = java.lang.String[]
- setForceStop = java.lang.Boolean
```
## TerminateInstances parameterss:

```
- setInstanceIds = java.lang.String[]
```
## DeleteImages parameterss:

```
- setImageIds = java.lang.String[]
```
## DescribeHosts parameterss:

```
- setLimit = java.lang.Integer
- setFilters = com.tencentcloudapi.cvm.v20170312.models.Filter[]
- 	setValues = java.lang.String[]
- 	setName = java.lang.String
- setOffset = java.lang.Integer
```
## ModifyInstancesChargeType parameterss:

```
- setInstanceIds = java.lang.String[]
- setInstanceChargeType = java.lang.String
- setInstanceChargePrepaid = com.tencentcloudapi.cvm.v20170312.models.InstanceChargePrepaid
- 	setRenewFlag = java.lang.String
- 	setPeriod = java.lang.Integer
```
## SyncImages parameterss:

```
- setImageIds = java.lang.String[]
- setDestinationRegions = java.lang.String[]
```
## ResetInstancesPassword parameterss:

```
- setInstanceIds = java.lang.String[]
- setForceStop = java.lang.Boolean
- setPassword = java.lang.String
- setUserName = java.lang.String
```
## DescribeImages parameterss:

```
- setImageIds = java.lang.String[]
- setLimit = java.lang.Integer
- setFilters = com.tencentcloudapi.cvm.v20170312.models.Filter[]
- 	setValues = java.lang.String[]
- 	setName = java.lang.String
- setInstanceType = java.lang.String
- setOffset = java.lang.Integer
```
## ImportImage parameterss:

```
- setImageName = java.lang.String
- setImageDescription = java.lang.String
- setDryRun = java.lang.Boolean
- setArchitecture = java.lang.String
- setOsType = java.lang.String
- setOsVersion = java.lang.String
- setImageUrl = java.lang.String
- setForce = java.lang.Boolean
```
## DescribeInstanceTypeConfigs parameterss:

```
- setFilters = com.tencentcloudapi.cvm.v20170312.models.Filter[]
- 	setValues = java.lang.String[]
- 	setName = java.lang.String
```
## InquiryPriceResetInstance parameterss:

```
- setInstanceId = java.lang.String
- setImageId = java.lang.String
- setSystemDisk = com.tencentcloudapi.cvm.v20170312.models.SystemDisk
- 	setDiskType = java.lang.String
- 	setDiskId = java.lang.String
- 	setDiskSize = java.lang.Integer
- setLoginSettings = com.tencentcloudapi.cvm.v20170312.models.LoginSettings
- 	setKeyIds = java.lang.String[]
- 	setPassword = java.lang.String
- 	setKeepImageLogin = java.lang.String
- setEnhancedService = com.tencentcloudapi.cvm.v20170312.models.EnhancedService
- 	setSecurityService = com.tencentcloudapi.cvm.v20170312.models.RunSecurityServiceEnabled
- 		setEnabled = java.lang.Boolean
- 	setMonitorService = com.tencentcloudapi.cvm.v20170312.models.RunMonitorServiceEnabled
- 		setEnabled = java.lang.Boolean
```
## DescribeInstanceInternetBandwidthConfigs parameterss:

```
- setInstanceId = java.lang.String
```
## RebootInstances parameterss:

```
- setInstanceIds = java.lang.String[]
- setForceReboot = java.lang.Boolean
```
## AssociateSecurityGroups parameterss:

```
- setInstanceIds = java.lang.String[]
- setSecurityGroupIds = java.lang.String[]
```
## DescribeDisasterRecoverGroups parameterss:

```
- setLimit = java.lang.Integer
- setDisasterRecoverGroupIds = java.lang.String[]
- setName = java.lang.String
- setOffset = java.lang.Integer
```
## AssociateInstancesKeyPairs parameterss:

```
- setInstanceIds = java.lang.String[]
- setKeyIds = java.lang.String[]
- setForceStop = java.lang.Boolean
```
## InquiryPriceModifyInstancesChargeType parameterss:

```
- setInstanceIds = java.lang.String[]
- setInstanceChargeType = java.lang.String
- setInstanceChargePrepaid = com.tencentcloudapi.cvm.v20170312.models.InstanceChargePrepaid
- 	setRenewFlag = java.lang.String
- 	setPeriod = java.lang.Integer
```
## ModifyDisasterRecoverGroupAttribute parameterss:

```
- setDisasterRecoverGroupId = java.lang.String
- setName = java.lang.String
```
## ResetInstancesInternetMaxBandwidth parameterss:

```
- setInstanceIds = java.lang.String[]
- setInternetAccessible = com.tencentcloudapi.cvm.v20170312.models.InternetAccessible
- 	setInternetChargeType = java.lang.String
- 	setInternetMaxBandwidthOut = java.lang.Integer
- 	setPublicIpAssigned = java.lang.Boolean
- setStartTime = java.lang.String
- setEndTime = java.lang.String
```
## DescribeInstances parameterss:

```
- setInstanceIds = java.lang.String[]
- setLimit = java.lang.Integer
- setFilters = com.tencentcloudapi.cvm.v20170312.models.Filter[]
- 	setValues = java.lang.String[]
- 	setName = java.lang.String
- setOffset = java.lang.Integer
```
## DescribeKeyPairs parameterss:

```
- setKeyIds = java.lang.String[]
- setLimit = java.lang.Integer
- setFilters = com.tencentcloudapi.cvm.v20170312.models.Filter[]
- 	setValues = java.lang.String[]
- 	setName = java.lang.String
- setOffset = java.lang.Integer
```
## DescribeInstanceFamilyConfigs parameterss:

```
```
## InquiryPriceRunInstances parameterss:

```
- setSecurityGroupIds = java.lang.String[]
- setPlacement = com.tencentcloudapi.cvm.v20170312.models.Placement
- 	setZone = java.lang.String
- 	setProjectId = java.lang.Integer
- 	setHostIds = java.lang.String[]
- setClientToken = java.lang.String
- setImageId = java.lang.String
- setInstanceType = java.lang.String
- setInstanceChargeType = java.lang.String
- setInstanceChargePrepaid = com.tencentcloudapi.cvm.v20170312.models.InstanceChargePrepaid
- 	setRenewFlag = java.lang.String
- 	setPeriod = java.lang.Integer
- setSystemDisk = com.tencentcloudapi.cvm.v20170312.models.SystemDisk
- 	setDiskType = java.lang.String
- 	setDiskId = java.lang.String
- 	setDiskSize = java.lang.Integer
- setLoginSettings = com.tencentcloudapi.cvm.v20170312.models.LoginSettings
- 	setKeyIds = java.lang.String[]
- 	setPassword = java.lang.String
- 	setKeepImageLogin = java.lang.String
- setEnhancedService = com.tencentcloudapi.cvm.v20170312.models.EnhancedService
- 	setSecurityService = com.tencentcloudapi.cvm.v20170312.models.RunSecurityServiceEnabled
- 		setEnabled = java.lang.Boolean
- 	setMonitorService = com.tencentcloudapi.cvm.v20170312.models.RunMonitorServiceEnabled
- 		setEnabled = java.lang.Boolean
- setInternetAccessible = com.tencentcloudapi.cvm.v20170312.models.InternetAccessible
- 	setInternetChargeType = java.lang.String
- 	setInternetMaxBandwidthOut = java.lang.Integer
- 	setPublicIpAssigned = java.lang.Boolean
- setDataDisks = com.tencentcloudapi.cvm.v20170312.models.DataDisk[]
- 	setDiskType = java.lang.String
- 	setDiskId = java.lang.String
- 	setDiskSize = java.lang.Integer
- 	setDeleteWithInstance = java.lang.Boolean
- setVirtualPrivateCloud = com.tencentcloudapi.cvm.v20170312.models.VirtualPrivateCloud
- 	setVpcId = java.lang.String
- 	setSubnetId = java.lang.String
- 	setAsVpcGateway = java.lang.Boolean
- 	setPrivateIpAddresses = java.lang.String[]
- setInstanceCount = java.lang.Integer
- setInstanceName = java.lang.String
- setHostName = java.lang.String
- setTagSpecification = com.tencentcloudapi.cvm.v20170312.models.TagSpecification[]
- 	setResourceType = java.lang.String
- 	setTags = com.tencentcloudapi.cvm.v20170312.models.Tag[]
- 		setKey = java.lang.String
- 		setValue = java.lang.String
- setInstanceMarketOptions = com.tencentcloudapi.cvm.v20170312.models.InstanceMarketOptionsRequest
- 	setSpotOptions = com.tencentcloudapi.cvm.v20170312.models.SpotMarketOptions
- 		setMaxPrice = java.lang.String
- 		setSpotInstanceType = java.lang.String
- 	setMarketType = java.lang.String
```
## InquiryPriceResetInstancesType parameterss:

```
- setInstanceIds = java.lang.String[]
- setForceStop = java.lang.Boolean
- setInstanceType = java.lang.String
```
## StartInstances parameterss:

```
- setInstanceIds = java.lang.String[]
```
## ModifyInstancesAttribute parameterss:

```
- setInstanceIds = java.lang.String[]
- setInstanceName = java.lang.String
- setSecurityGroups = java.lang.String[]
```
## DescribeInstancesStatus parameterss:

```
- setInstanceIds = java.lang.String[]
- setLimit = java.lang.Integer
- setOffset = java.lang.Integer
```
## AllocateHosts parameterss:

```
- setPlacement = com.tencentcloudapi.cvm.v20170312.models.Placement
- 	setZone = java.lang.String
- 	setProjectId = java.lang.Integer
- 	setHostIds = java.lang.String[]
- setClientToken = java.lang.String
- setHostChargePrepaid = com.tencentcloudapi.cvm.v20170312.models.ChargePrepaid
- 	setRenewFlag = java.lang.String
- 	setPeriod = java.lang.Integer
- setHostChargeType = java.lang.String
- setHostType = java.lang.String
- setHostCount = java.lang.Integer
```
## InquiryPriceResetInstancesInternetMaxBandwidth parameterss:

```
- setInstanceIds = java.lang.String[]
- setInternetAccessible = com.tencentcloudapi.cvm.v20170312.models.InternetAccessible
- 	setInternetChargeType = java.lang.String
- 	setInternetMaxBandwidthOut = java.lang.Integer
- 	setPublicIpAssigned = java.lang.Boolean
- setStartTime = java.lang.String
- setEndTime = java.lang.String
```
## ModifyImageSharePermission parameterss:

```
- setImageId = java.lang.String
- setAccountIds = java.lang.String[]
- setPermission = java.lang.String
```
## DescribeZoneInstanceConfigInfos parameterss:

```
- setFilters = com.tencentcloudapi.cvm.v20170312.models.Filter[]
- 	setValues = java.lang.String[]
- 	setName = java.lang.String
```
## ModifyInstancesRenewFlag parameterss:

```
- setInstanceIds = java.lang.String[]
- setRenewFlag = java.lang.String
```
## DeleteKeyPairs parameterss:

```
- setKeyIds = java.lang.String[]
```
## DescribeImageSharePermission parameterss:

```
- setImageId = java.lang.String
```
## ImportKeyPair parameterss:

```
- setKeyName = java.lang.String
- setProjectId = java.lang.Integer
- setPublicKey = java.lang.String
```
## ResetInstance parameterss:

```
- setInstanceId = java.lang.String
- setImageId = java.lang.String
- setSystemDisk = com.tencentcloudapi.cvm.v20170312.models.SystemDisk
- 	setDiskType = java.lang.String
- 	setDiskId = java.lang.String
- 	setDiskSize = java.lang.Integer
- setLoginSettings = com.tencentcloudapi.cvm.v20170312.models.LoginSettings
- 	setKeyIds = java.lang.String[]
- 	setPassword = java.lang.String
- 	setKeepImageLogin = java.lang.String
- setEnhancedService = com.tencentcloudapi.cvm.v20170312.models.EnhancedService
- 	setSecurityService = com.tencentcloudapi.cvm.v20170312.models.RunSecurityServiceEnabled
- 		setEnabled = java.lang.Boolean
- 	setMonitorService = com.tencentcloudapi.cvm.v20170312.models.RunMonitorServiceEnabled
- 		setEnabled = java.lang.Boolean
```
## DescribeImageQuota parameterss:

```
```
## DescribeRegions parameterss:

```
```
## CreateImage parameterss:

```
- setImageName = java.lang.String
- setInstanceId = java.lang.String
- setImageDescription = java.lang.String
- setForcePoweroff = java.lang.String
- setSysprep = java.lang.String
- setReboot = java.lang.String
- setDataDiskIds = java.lang.String[]
- setSnapshotIds = java.lang.String[]
- setDryRun = java.lang.Boolean
```
## DescribeInternetChargeTypeConfigs parameterss:

```
```
## ResizeInstanceDisks parameterss:

```
- setInstanceId = java.lang.String
- setForceStop = java.lang.Boolean
- setDataDisks = com.tencentcloudapi.cvm.v20170312.models.DataDisk[]
- 	setDiskType = java.lang.String
- 	setDiskId = java.lang.String
- 	setDiskSize = java.lang.Integer
- 	setDeleteWithInstance = java.lang.Boolean
```
## ModifyImageAttribute parameterss:

```
- setImageName = java.lang.String
- setImageDescription = java.lang.String
- setImageId = java.lang.String
```
## ModifyHostsAttribute parameterss:

```
- setHostName = java.lang.String
- setHostIds = java.lang.String[]
- setRenewFlag = java.lang.String
```
## ModifyInstancesProject parameterss:

```
- setProjectId = java.lang.Integer
- setInstanceIds = java.lang.String[]
```
## CreateDisasterRecoverGroup parameterss:

```
- setType = java.lang.String
- setClientToken = java.lang.String
- setName = java.lang.String
```
## ResetInstancesType parameterss:

```
- setInstanceIds = java.lang.String[]
- setForceStop = java.lang.Boolean
- setInstanceType = java.lang.String
```
## InquiryPriceRenewInstances parameterss:

```
- setDryRun = java.lang.Boolean
- setInstanceIds = java.lang.String[]
- setInstanceChargePrepaid = com.tencentcloudapi.cvm.v20170312.models.InstanceChargePrepaid
- 	setRenewFlag = java.lang.String
- 	setPeriod = java.lang.Integer
- setRenewPortableDataDisk = java.lang.Boolean
```
## DescribeImportImageOs parameterss:

```
```
## CreateKeyPair parameterss:

```
- setKeyName = java.lang.String
- setProjectId = java.lang.Integer
```
## InquiryPriceResizeInstanceDisks parameterss:

```
- setInstanceId = java.lang.String
- setForceStop = java.lang.Boolean
- setDataDisks = com.tencentcloudapi.cvm.v20170312.models.DataDisk[]
- 	setDiskType = java.lang.String
- 	setDiskId = java.lang.String
- 	setDiskSize = java.lang.Integer
- 	setDeleteWithInstance = java.lang.Boolean
```
## RunInstances parameterss:

```
- setSecurityGroupIds = java.lang.String[]
- setPlacement = com.tencentcloudapi.cvm.v20170312.models.Placement
- 	setZone = java.lang.String
- 	setProjectId = java.lang.Integer
- 	setHostIds = java.lang.String[]
- setClientToken = java.lang.String
- setImageId = java.lang.String
- setInstanceType = java.lang.String
- setDisasterRecoverGroupIds = java.lang.String[]
- setInstanceChargeType = java.lang.String
- setInstanceChargePrepaid = com.tencentcloudapi.cvm.v20170312.models.InstanceChargePrepaid
- 	setRenewFlag = java.lang.String
- 	setPeriod = java.lang.Integer
- setSystemDisk = com.tencentcloudapi.cvm.v20170312.models.SystemDisk
- 	setDiskType = java.lang.String
- 	setDiskId = java.lang.String
- 	setDiskSize = java.lang.Integer
- setLoginSettings = com.tencentcloudapi.cvm.v20170312.models.LoginSettings
- 	setKeyIds = java.lang.String[]
- 	setPassword = java.lang.String
- 	setKeepImageLogin = java.lang.String
- setEnhancedService = com.tencentcloudapi.cvm.v20170312.models.EnhancedService
- 	setSecurityService = com.tencentcloudapi.cvm.v20170312.models.RunSecurityServiceEnabled
- 		setEnabled = java.lang.Boolean
- 	setMonitorService = com.tencentcloudapi.cvm.v20170312.models.RunMonitorServiceEnabled
- 		setEnabled = java.lang.Boolean
- setInternetAccessible = com.tencentcloudapi.cvm.v20170312.models.InternetAccessible
- 	setInternetChargeType = java.lang.String
- 	setInternetMaxBandwidthOut = java.lang.Integer
- 	setPublicIpAssigned = java.lang.Boolean
- setDataDisks = com.tencentcloudapi.cvm.v20170312.models.DataDisk[]
- 	setDiskType = java.lang.String
- 	setDiskId = java.lang.String
- 	setDiskSize = java.lang.Integer
- 	setDeleteWithInstance = java.lang.Boolean
- setVirtualPrivateCloud = com.tencentcloudapi.cvm.v20170312.models.VirtualPrivateCloud
- 	setVpcId = java.lang.String
- 	setSubnetId = java.lang.String
- 	setAsVpcGateway = java.lang.Boolean
- 	setPrivateIpAddresses = java.lang.String[]
- setInstanceCount = java.lang.Integer
- setInstanceName = java.lang.String
- setHostName = java.lang.String
- setTagSpecification = com.tencentcloudapi.cvm.v20170312.models.TagSpecification[]
- 	setResourceType = java.lang.String
- 	setTags = com.tencentcloudapi.cvm.v20170312.models.Tag[]
- 		setKey = java.lang.String
- 		setValue = java.lang.String
- setInstanceMarketOptions = com.tencentcloudapi.cvm.v20170312.models.InstanceMarketOptionsRequest
- 	setSpotOptions = com.tencentcloudapi.cvm.v20170312.models.SpotMarketOptions
- 		setMaxPrice = java.lang.String
- 		setSpotInstanceType = java.lang.String
- 	setMarketType = java.lang.String
- setActionTimer = com.tencentcloudapi.cvm.v20170312.models.ActionTimer
- 	setExternals = com.tencentcloudapi.cvm.v20170312.models.Externals
- 		setReleaseAddress = java.lang.Boolean
- 		setUnsupportNetworks = java.lang.String[]
- 		setStorageBlockAttr = com.tencentcloudapi.cvm.v20170312.models.StorageBlock
- 			setType = java.lang.String
- 			setMinSize = java.lang.Integer
- 			setMaxSize = java.lang.Integer
- 	setTimerAction = java.lang.String
- 	setActionTime = java.lang.String
- setUserData = java.lang.String
```
