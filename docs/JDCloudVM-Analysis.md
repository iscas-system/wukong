## DeleteImage parameterss:

```
- setRegionId = java.lang.String
- setImageId = java.lang.String
```
## DescribeQuotas parameterss:

```
- setRegionId = java.lang.String
- setImageId = java.lang.String
- setFilters = java.util.List<com.jdcloud.sdk.service.common.model.Filter>
- 	addValue = java.lang.String
- 	setOperator = java.lang.String
- 	setValues = java.util.List<java.lang.String>
- 	setName = java.lang.String
- addFilter = com.jdcloud.sdk.service.common.model.Filter
- 	addValue = java.lang.String
- 	setOperator = java.lang.String
- 	setValues = java.util.List<java.lang.String>
- 	setName = java.lang.String
```
## CreateKeypair parameterss:

```
- setRegionId = java.lang.String
- setKeyName = java.lang.String
```
## ModifyInstancePassword parameterss:

```
- setRegionId = java.lang.String
- setInstanceId = java.lang.String
- setPassword = java.lang.String
```
## AttachNetworkInterface parameterss:

```
- setRegionId = java.lang.String
- setAutoDelete = java.lang.Boolean
- setInstanceId = java.lang.String
- setNetworkInterfaceId = java.lang.String
```
## RebootInstance parameterss:

```
- setRegionId = java.lang.String
- setInstanceId = java.lang.String
```
## ModifyInstanceNetworkAttribute parameterss:

```
- setRegionId = java.lang.String
- setInstanceId = java.lang.String
- setNetworks = java.util.List<com.jdcloud.sdk.service.vm.model.InstanceNetworkAttribute>
- 	setAutoDelete = java.lang.Boolean
- 	setNetworkInterfaceId = java.lang.String
- addNetwork = com.jdcloud.sdk.service.vm.model.InstanceNetworkAttribute
- 	setAutoDelete = java.lang.Boolean
- 	setNetworkInterfaceId = java.lang.String
```
## ResizeInstance parameterss:

```
- setRegionId = java.lang.String
- setInstanceId = java.lang.String
- setInstanceType = java.lang.String
```
## AssociateElasticIp parameterss:

```
- setRegionId = java.lang.String
- setInstanceId = java.lang.String
- setElasticIpId = java.lang.String
```
## UnShareImage parameterss:

```
- setRegionId = java.lang.String
- setImageId = java.lang.String
- setPins = java.util.List<java.lang.String>
- addPin = java.lang.String
```
## AttachDisk parameterss:

```
- setDiskId = java.lang.String
- setRegionId = java.lang.String
- setDeviceName = java.lang.String
- setAutoDelete = java.lang.Boolean
- setInstanceId = java.lang.String
```
## CopyImages parameterss:

```
- setRegionId = java.lang.String
- setSourceImageIds = java.util.List<java.lang.String>
- setDestinationRegion = java.lang.String
- addSourceImageId = java.lang.String
```
## DescribeInstanceVncUrl parameterss:

```
- setRegionId = java.lang.String
- setInstanceId = java.lang.String
```
## DescribeImageConstraintsBatch parameterss:

```
- setRegionId = java.lang.String
- setIds = java.util.List<java.lang.String>
- addId = java.lang.String
```
## ShareImage parameterss:

```
- setRegionId = java.lang.String
- setImageId = java.lang.String
- setPins = java.util.List<java.lang.String>
- addPin = java.lang.String
```
## CreateImage parameterss:

```
- setRegionId = java.lang.String
- setInstanceId = java.lang.String
- setDescription = java.lang.String
- addDataDisk = com.jdcloud.sdk.service.vm.model.InstanceDiskAttachmentSpec
- 	setDeviceName = java.lang.String
- 	setAutoDelete = java.lang.Boolean
- 	setCloudDiskSpec = com.jdcloud.sdk.service.disk.model.DiskSpec
- 		setDescription = java.lang.String
- 		setAz = java.lang.String
- 		setDiskType = java.lang.String
- 		setDiskSizeGB = java.lang.Integer
- 		setSnapshotId = java.lang.String
- 		setCharge = com.jdcloud.sdk.service.charge.model.ChargeSpec
- 			setChargeMode = java.lang.String
- 			setChargeUnit = java.lang.String
- 			setChargeDuration = java.lang.Integer
- 		setName = java.lang.String
- 	setNoDevice = java.lang.Boolean
- 	setDiskCategory = java.lang.String
- setDataDisks = java.util.List<com.jdcloud.sdk.service.vm.model.InstanceDiskAttachmentSpec>
- 	setDeviceName = java.lang.String
- 	setAutoDelete = java.lang.Boolean
- 	setCloudDiskSpec = com.jdcloud.sdk.service.disk.model.DiskSpec
- 		setDescription = java.lang.String
- 		setAz = java.lang.String
- 		setDiskType = java.lang.String
- 		setDiskSizeGB = java.lang.Integer
- 		setSnapshotId = java.lang.String
- 		setCharge = com.jdcloud.sdk.service.charge.model.ChargeSpec
- 			setChargeMode = java.lang.String
- 			setChargeUnit = java.lang.String
- 			setChargeDuration = java.lang.Integer
- 		setName = java.lang.String
- 	setNoDevice = java.lang.Boolean
- 	setDiskCategory = java.lang.String
- setName = java.lang.String
```
## DescribeImageConstraints parameterss:

```
- setRegionId = java.lang.String
- setImageId = java.lang.String
```
## DetachDisk parameterss:

```
- setDiskId = java.lang.String
- setRegionId = java.lang.String
- setInstanceId = java.lang.String
- setForce = java.lang.Boolean
```
## ModifyImageAttribute parameterss:

```
- setRegionId = java.lang.String
- setImageId = java.lang.String
- setDescription = java.lang.String
- setName = java.lang.String
```
## DescribeInstanceStatus parameterss:

```
- setRegionId = java.lang.String
- setPageNumber = java.lang.Integer
- setPageSize = java.lang.Integer
- setFilters = java.util.List<com.jdcloud.sdk.service.common.model.Filter>
- 	addValue = java.lang.String
- 	setOperator = java.lang.String
- 	setValues = java.util.List<java.lang.String>
- 	setName = java.lang.String
- addFilter = com.jdcloud.sdk.service.common.model.Filter
- 	addValue = java.lang.String
- 	setOperator = java.lang.String
- 	setValues = java.util.List<java.lang.String>
- 	setName = java.lang.String
```
## DescribeImages parameterss:

```
- setRegionId = java.lang.String
- setImageSource = java.lang.String
- setPageNumber = java.lang.Integer
- setPageSize = java.lang.Integer
- setPlatform = java.lang.String
- setIds = java.util.List<java.lang.String>
- setRootDeviceType = java.lang.String
- setStatus = java.lang.String
- addId = java.lang.String
```
## StopInstance parameterss:

```
- setRegionId = java.lang.String
- setInstanceId = java.lang.String
```
## ImportKeypair parameterss:

```
- setRegionId = java.lang.String
- setKeyName = java.lang.String
- setPublicKey = java.lang.String
```
## ModifyInstanceAttribute parameterss:

```
- setRegionId = java.lang.String
- setInstanceId = java.lang.String
- setDescription = java.lang.String
- setName = java.lang.String
```
## RebuildInstance parameterss:

```
- setRegionId = java.lang.String
- setInstanceId = java.lang.String
- setPassword = java.lang.String
- setKeyNames = java.util.List<java.lang.String>
- addKeyName = java.lang.String
- setImageId = java.lang.String
```
## DescribeKeypairs parameterss:

```
- setRegionId = java.lang.String
- setPageNumber = java.lang.Integer
- setPageSize = java.lang.Integer
- setFilters = java.util.List<com.jdcloud.sdk.service.common.model.Filter>
- 	addValue = java.lang.String
- 	setOperator = java.lang.String
- 	setValues = java.util.List<java.lang.String>
- 	setName = java.lang.String
- addFilter = com.jdcloud.sdk.service.common.model.Filter
- 	addValue = java.lang.String
- 	setOperator = java.lang.String
- 	setValues = java.util.List<java.lang.String>
- 	setName = java.lang.String
```
## ModifyInstanceDiskAttribute parameterss:

```
- setRegionId = java.lang.String
- setInstanceId = java.lang.String
- addDataDisk = com.jdcloud.sdk.service.vm.model.InstanceDiskAttribute
- 	setDiskId = java.lang.String
- 	setAutoDelete = java.lang.Boolean
- setDataDisks = java.util.List<com.jdcloud.sdk.service.vm.model.InstanceDiskAttribute>
- 	setDiskId = java.lang.String
- 	setAutoDelete = java.lang.Boolean
```
## DetachNetworkInterface parameterss:

```
- setRegionId = java.lang.String
- setInstanceId = java.lang.String
- setNetworkInterfaceId = java.lang.String
```
## DeleteKeypair parameterss:

```
- setRegionId = java.lang.String
- setKeyName = java.lang.String
```
## DescribeInstance parameterss:

```
- setRegionId = java.lang.String
- setInstanceId = java.lang.String
```
## DescribeImageMembers parameterss:

```
- setRegionId = java.lang.String
- setImageId = java.lang.String
```
## DescribeInstances parameterss:

```
- setRegionId = java.lang.String
- setPageNumber = java.lang.Integer
- setPageSize = java.lang.Integer
- setFilters = java.util.List<com.jdcloud.sdk.service.common.model.Filter>
- 	addValue = java.lang.String
- 	setOperator = java.lang.String
- 	setValues = java.util.List<java.lang.String>
- 	setName = java.lang.String
- addFilter = com.jdcloud.sdk.service.common.model.Filter
- 	addValue = java.lang.String
- 	setOperator = java.lang.String
- 	setValues = java.util.List<java.lang.String>
- 	setName = java.lang.String
```
## CreateInstances parameterss:

```
- setRegionId = java.lang.String
- setInstanceSpec = com.jdcloud.sdk.service.vm.model.InstanceSpec
- 	setPassword = java.lang.String
- 	setKeyNames = java.util.List<java.lang.String>
- 	addKeyName = java.lang.String
- 	setImageId = java.lang.String
- 	setDescription = java.lang.String
- 	setInstanceType = java.lang.String
- 	addDataDisk = com.jdcloud.sdk.service.vm.model.InstanceDiskAttachmentSpec
- 		setDeviceName = java.lang.String
- 		setAutoDelete = java.lang.Boolean
- 		setCloudDiskSpec = com.jdcloud.sdk.service.disk.model.DiskSpec
- 			setDescription = java.lang.String
- 			setAz = java.lang.String
- 			setDiskType = java.lang.String
- 			setDiskSizeGB = java.lang.Integer
- 			setSnapshotId = java.lang.String
- 			setCharge = com.jdcloud.sdk.service.charge.model.ChargeSpec
- 				setChargeMode = java.lang.String
- 				setChargeUnit = java.lang.String
- 				setChargeDuration = java.lang.Integer
- 			setName = java.lang.String
- 		setNoDevice = java.lang.Boolean
- 		setDiskCategory = java.lang.String
- 	setDataDisks = java.util.List<com.jdcloud.sdk.service.vm.model.InstanceDiskAttachmentSpec>
- 		setDeviceName = java.lang.String
- 		setAutoDelete = java.lang.Boolean
- 		setCloudDiskSpec = com.jdcloud.sdk.service.disk.model.DiskSpec
- 			setDescription = java.lang.String
- 			setAz = java.lang.String
- 			setDiskType = java.lang.String
- 			setDiskSizeGB = java.lang.Integer
- 			setSnapshotId = java.lang.String
- 			setCharge = com.jdcloud.sdk.service.charge.model.ChargeSpec
- 				setChargeMode = java.lang.String
- 				setChargeUnit = java.lang.String
- 				setChargeDuration = java.lang.Integer
- 			setName = java.lang.String
- 		setNoDevice = java.lang.Boolean
- 		setDiskCategory = java.lang.String
- 	setAz = java.lang.String
- 	setCharge = com.jdcloud.sdk.service.charge.model.ChargeSpec
- 		setChargeMode = java.lang.String
- 		setChargeUnit = java.lang.String
- 		setChargeDuration = java.lang.Integer
- 	setElasticIp = com.jdcloud.sdk.service.vpc.model.ElasticIpSpec
- 		setProvider = java.lang.String
- 		setChargeSpec = com.jdcloud.sdk.service.charge.model.ChargeSpec
- 			setChargeMode = java.lang.String
- 			setChargeUnit = java.lang.String
- 			setChargeDuration = java.lang.Integer
- 		setBandwidthMbps = java.lang.Integer
- 	setPrimaryNetworkInterface = com.jdcloud.sdk.service.vm.model.InstanceNetworkInterfaceAttachmentSpec
- 		setDeviceIndex = java.lang.Integer
- 		setNetworkInterface = com.jdcloud.sdk.service.vpc.model.NetworkInterfaceSpec
- 			setDescription = java.lang.String
- 			setAz = java.lang.String
- 			setSubnetId = java.lang.String
- 			setNetworkInterfaceName = java.lang.String
- 			setPrimaryIpAddress = java.lang.String
- 			setSecondaryIpAddresses = java.util.List<java.lang.String>
- 			setSecondaryIpCount = java.lang.Integer
- 			setSecurityGroups = java.util.List<java.lang.String>
- 			setSanityCheck = java.lang.Integer
- 			addSecondaryIpAddresse = java.lang.String
- 			addSecurityGroup = java.lang.String
- 	setSystemDisk = com.jdcloud.sdk.service.vm.model.InstanceDiskAttachmentSpec
- 		setDeviceName = java.lang.String
- 		setAutoDelete = java.lang.Boolean
- 		setCloudDiskSpec = com.jdcloud.sdk.service.disk.model.DiskSpec
- 			setDescription = java.lang.String
- 			setAz = java.lang.String
- 			setDiskType = java.lang.String
- 			setDiskSizeGB = java.lang.Integer
- 			setSnapshotId = java.lang.String
- 			setCharge = com.jdcloud.sdk.service.charge.model.ChargeSpec
- 				setChargeMode = java.lang.String
- 				setChargeUnit = java.lang.String
- 				setChargeDuration = java.lang.Integer
- 			setName = java.lang.String
- 		setNoDevice = java.lang.Boolean
- 		setDiskCategory = java.lang.String
- 	setAgId = java.lang.String
- 	setInstanceTemplateId = java.lang.String
- 	setName = java.lang.String
- setMaxCount = java.lang.Integer
- setClientToken = java.lang.String
```
## DisassociateElasticIp parameterss:

```
- setRegionId = java.lang.String
- setInstanceId = java.lang.String
- setElasticIpId = java.lang.String
```
## DescribeInstancePrivateIpAddress parameterss:

```
- setRegionId = java.lang.String
- setPageNumber = java.lang.Integer
- setPageSize = java.lang.Integer
- setFilters = java.util.List<com.jdcloud.sdk.service.common.model.Filter>
- 	addValue = java.lang.String
- 	setOperator = java.lang.String
- 	setValues = java.util.List<java.lang.String>
- 	setName = java.lang.String
- addFilter = com.jdcloud.sdk.service.common.model.Filter
- 	addValue = java.lang.String
- 	setOperator = java.lang.String
- 	setValues = java.util.List<java.lang.String>
- 	setName = java.lang.String
```
## StartInstance parameterss:

```
- setRegionId = java.lang.String
- setInstanceId = java.lang.String
```
## DescribeImage parameterss:

```
- setRegionId = java.lang.String
- setImageId = java.lang.String
```
## DeleteInstance parameterss:

```
- setRegionId = java.lang.String
- setInstanceId = java.lang.String
```
## DescribeInstanceTypes parameterss:

```
- setRegionId = java.lang.String
- setFilters = java.util.List<com.jdcloud.sdk.service.common.model.Filter>
- 	addValue = java.lang.String
- 	setOperator = java.lang.String
- 	setValues = java.util.List<java.lang.String>
- 	setName = java.lang.String
- addFilter = com.jdcloud.sdk.service.common.model.Filter
- 	addValue = java.lang.String
- 	setOperator = java.lang.String
- 	setValues = java.util.List<java.lang.String>
- 	setName = java.lang.String
```
