## DeleteImage parameterss:

```
{
	"main":{
		"setImageId":"java.lang.String",
		"setRegionId":"java.lang.String"
	}
}
```
## DescribeQuotas parameterss:

```
{
	"main":{
		"setImageId":"java.lang.String",
		"setRegionId":"java.lang.String",
		"setFilters":[
			"ref1-com.jdcloud.sdk.service.common.model.Filter"
		],
		"addFilter-setValues":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"addFilter-setOperator":"java.lang.String",
		"addFilter-addValue":"java.lang.String",
		"addFilter-setName":"java.lang.String"
	},
	"ref1-com.jdcloud.sdk.service.common.model.Filter":{
		"setValues":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setOperator":"java.lang.String",
		"addValue":"java.lang.String",
		"setName":"java.lang.String"
	}
}
```
## CreateKeypair parameterss:

```
{
	"main":{
		"setKeyName":"java.lang.String",
		"setRegionId":"java.lang.String"
	}
}
```
## ModifyInstancePassword parameterss:

```
{
	"main":{
		"setPassword":"java.lang.String",
		"setInstanceId":"java.lang.String",
		"setRegionId":"java.lang.String"
	}
}
```
## AttachNetworkInterface parameterss:

```
{
	"main":{
		"setAutoDelete":"java.lang.Boolean",
		"setInstanceId":"java.lang.String",
		"setRegionId":"java.lang.String",
		"setNetworkInterfaceId":"java.lang.String"
	}
}
```
## RebootInstance parameterss:

```
{
	"main":{
		"setInstanceId":"java.lang.String",
		"setRegionId":"java.lang.String"
	}
}
```
## ModifyInstanceNetworkAttribute parameterss:

```
{
	"main":{
		"setInstanceId":"java.lang.String",
		"setRegionId":"java.lang.String",
		"addNetwork-setAutoDelete":"java.lang.Boolean",
		"addNetwork-setNetworkInterfaceId":"java.lang.String",
		"setNetworks":[
			"ref1-com.jdcloud.sdk.service.vm.model.InstanceNetworkAttribute"
		]
	},
	"ref1-com.jdcloud.sdk.service.vm.model.InstanceNetworkAttribute":{
		"setAutoDelete":"java.lang.Boolean",
		"setNetworkInterfaceId":"java.lang.String"
	}
}
```
## ResizeInstance parameterss:

```
{
	"main":{
		"setInstanceId":"java.lang.String",
		"setRegionId":"java.lang.String",
		"setInstanceType":"java.lang.String"
	}
}
```
## AssociateElasticIp parameterss:

```
{
	"main":{
		"setInstanceId":"java.lang.String",
		"setRegionId":"java.lang.String",
		"setElasticIpId":"java.lang.String"
	}
}
```
## UnShareImage parameterss:

```
{
	"main":{
		"setPins":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setImageId":"java.lang.String",
		"setRegionId":"java.lang.String",
		"addPin":"java.lang.String"
	}
}
```
## AttachDisk parameterss:

```
{
	"main":{
		"setDiskId":"java.lang.String",
		"setDeviceName":"java.lang.String",
		"setAutoDelete":"java.lang.Boolean",
		"setInstanceId":"java.lang.String",
		"setRegionId":"java.lang.String"
	}
}
```
## CopyImages parameterss:

```
{
	"main":{
		"setRegionId":"java.lang.String",
		"addSourceImageId":"java.lang.String",
		"setSourceImageIds":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setDestinationRegion":"java.lang.String"
	}
}
```
## DescribeInstanceVncUrl parameterss:

```
{
	"main":{
		"setInstanceId":"java.lang.String",
		"setRegionId":"java.lang.String"
	}
}
```
## DescribeImageConstraintsBatch parameterss:

```
{
	"main":{
		"setRegionId":"java.lang.String",
		"setIds":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"addId":"java.lang.String"
	}
}
```
## ShareImage parameterss:

```
{
	"main":{
		"setPins":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setImageId":"java.lang.String",
		"setRegionId":"java.lang.String",
		"addPin":"java.lang.String"
	}
}
```
## CreateImage parameterss:

```
{
	"main":{
		"setInstanceId":"java.lang.String",
		"setRegionId":"java.lang.String",
		"setDescription":"java.lang.String",
		"setDataDisks":[
			"ref1-com.jdcloud.sdk.service.vm.model.InstanceDiskAttachmentSpec"
		],
		"addDataDisk-setDeviceName":"java.lang.String",
		"addDataDisk-setAutoDelete":"java.lang.Boolean",
		"addDataDisk-setDiskCategory":"java.lang.String",
		"addDataDisk-setCloudDiskSpec-setCharge-setChargeMode":"java.lang.String",
		"addDataDisk-setCloudDiskSpec-setCharge-setChargeUnit":"java.lang.String",
		"addDataDisk-setCloudDiskSpec-setCharge-setChargeDuration":"java.lang.Integer",
		"addDataDisk-setCloudDiskSpec-setDescription":"java.lang.String",
		"addDataDisk-setCloudDiskSpec-setAz":"java.lang.String",
		"addDataDisk-setCloudDiskSpec-setDiskType":"java.lang.String",
		"addDataDisk-setCloudDiskSpec-setDiskSizeGB":"java.lang.Integer",
		"addDataDisk-setCloudDiskSpec-setSnapshotId":"java.lang.String",
		"addDataDisk-setCloudDiskSpec-setName":"java.lang.String",
		"addDataDisk-setNoDevice":"java.lang.Boolean",
		"setName":"java.lang.String"
	},
	"ref1-com.jdcloud.sdk.service.vm.model.InstanceDiskAttachmentSpec":{
		"setDeviceName":"java.lang.String",
		"setAutoDelete":"java.lang.Boolean",
		"setDiskCategory":"java.lang.String",
		"setCloudDiskSpec-setCharge-setChargeMode":"java.lang.String",
		"setCloudDiskSpec-setCharge-setChargeUnit":"java.lang.String",
		"setCloudDiskSpec-setCharge-setChargeDuration":"java.lang.Integer",
		"setCloudDiskSpec-setDescription":"java.lang.String",
		"setCloudDiskSpec-setAz":"java.lang.String",
		"setCloudDiskSpec-setDiskType":"java.lang.String",
		"setCloudDiskSpec-setDiskSizeGB":"java.lang.Integer",
		"setCloudDiskSpec-setSnapshotId":"java.lang.String",
		"setCloudDiskSpec-setName":"java.lang.String",
		"setNoDevice":"java.lang.Boolean"
	}
}
```
## DescribeImageConstraints parameterss:

```
{
	"main":{
		"setImageId":"java.lang.String",
		"setRegionId":"java.lang.String"
	}
}
```
## DetachDisk parameterss:

```
{
	"main":{
		"setDiskId":"java.lang.String",
		"setInstanceId":"java.lang.String",
		"setRegionId":"java.lang.String",
		"setForce":"java.lang.Boolean"
	}
}
```
## ModifyImageAttribute parameterss:

```
{
	"main":{
		"setImageId":"java.lang.String",
		"setRegionId":"java.lang.String",
		"setDescription":"java.lang.String",
		"setName":"java.lang.String"
	}
}
```
## DescribeInstanceStatus parameterss:

```
{
	"main":{
		"setRegionId":"java.lang.String",
		"setPageNumber":"java.lang.Integer",
		"setPageSize":"java.lang.Integer",
		"setFilters":[
			"ref1-com.jdcloud.sdk.service.common.model.Filter"
		],
		"addFilter-setValues":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"addFilter-setOperator":"java.lang.String",
		"addFilter-addValue":"java.lang.String",
		"addFilter-setName":"java.lang.String"
	},
	"ref1-com.jdcloud.sdk.service.common.model.Filter":{
		"setValues":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setOperator":"java.lang.String",
		"addValue":"java.lang.String",
		"setName":"java.lang.String"
	}
}
```
## DescribeImages parameterss:

```
{
	"main":{
		"setRegionId":"java.lang.String",
		"setImageSource":"java.lang.String",
		"setPageNumber":"java.lang.Integer",
		"setPageSize":"java.lang.Integer",
		"setPlatform":"java.lang.String",
		"setIds":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setRootDeviceType":"java.lang.String",
		"setStatus":"java.lang.String",
		"addId":"java.lang.String"
	}
}
```
## StopInstance parameterss:

```
{
	"main":{
		"setInstanceId":"java.lang.String",
		"setRegionId":"java.lang.String"
	}
}
```
## ImportKeypair parameterss:

```
{
	"main":{
		"setKeyName":"java.lang.String",
		"setRegionId":"java.lang.String",
		"setPublicKey":"java.lang.String"
	}
}
```
## ModifyInstanceAttribute parameterss:

```
{
	"main":{
		"setInstanceId":"java.lang.String",
		"setRegionId":"java.lang.String",
		"setDescription":"java.lang.String",
		"setName":"java.lang.String"
	}
}
```
## RebuildInstance parameterss:

```
{
	"main":{
		"setPassword":"java.lang.String",
		"setKeyNames":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"addKeyName":"java.lang.String",
		"setInstanceId":"java.lang.String",
		"setImageId":"java.lang.String",
		"setRegionId":"java.lang.String"
	}
}
```
## DescribeKeypairs parameterss:

```
{
	"main":{
		"setRegionId":"java.lang.String",
		"setPageNumber":"java.lang.Integer",
		"setPageSize":"java.lang.Integer",
		"setFilters":[
			"ref1-com.jdcloud.sdk.service.common.model.Filter"
		],
		"addFilter-setValues":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"addFilter-setOperator":"java.lang.String",
		"addFilter-addValue":"java.lang.String",
		"addFilter-setName":"java.lang.String"
	},
	"ref1-com.jdcloud.sdk.service.common.model.Filter":{
		"setValues":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setOperator":"java.lang.String",
		"addValue":"java.lang.String",
		"setName":"java.lang.String"
	}
}
```
## ModifyInstanceDiskAttribute parameterss:

```
{
	"main":{
		"setInstanceId":"java.lang.String",
		"setRegionId":"java.lang.String",
		"setDataDisks":[
			"ref1-com.jdcloud.sdk.service.vm.model.InstanceDiskAttribute"
		],
		"addDataDisk-setDiskId":"java.lang.String",
		"addDataDisk-setAutoDelete":"java.lang.Boolean"
	},
	"ref1-com.jdcloud.sdk.service.vm.model.InstanceDiskAttribute":{
		"setDiskId":"java.lang.String",
		"setAutoDelete":"java.lang.Boolean"
	}
}
```
## DetachNetworkInterface parameterss:

```
{
	"main":{
		"setInstanceId":"java.lang.String",
		"setRegionId":"java.lang.String",
		"setNetworkInterfaceId":"java.lang.String"
	}
}
```
## DeleteKeypair parameterss:

```
{
	"main":{
		"setKeyName":"java.lang.String",
		"setRegionId":"java.lang.String"
	}
}
```
## DescribeInstance parameterss:

```
{
	"main":{
		"setInstanceId":"java.lang.String",
		"setRegionId":"java.lang.String"
	}
}
```
## DescribeImageMembers parameterss:

```
{
	"main":{
		"setImageId":"java.lang.String",
		"setRegionId":"java.lang.String"
	}
}
```
## DescribeInstances parameterss:

```
{
	"main":{
		"setRegionId":"java.lang.String",
		"setPageNumber":"java.lang.Integer",
		"setPageSize":"java.lang.Integer",
		"setFilters":[
			"ref1-com.jdcloud.sdk.service.common.model.Filter"
		],
		"addFilter-setValues":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"addFilter-setOperator":"java.lang.String",
		"addFilter-addValue":"java.lang.String",
		"addFilter-setName":"java.lang.String"
	},
	"ref1-com.jdcloud.sdk.service.common.model.Filter":{
		"setValues":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setOperator":"java.lang.String",
		"addValue":"java.lang.String",
		"setName":"java.lang.String"
	}
}
```
## CreateInstances parameterss:

```
{
	"main":{
		"setRegionId":"java.lang.String",
		"setInstanceSpec-setCharge-setChargeMode":"java.lang.String",
		"setInstanceSpec-setCharge-setChargeUnit":"java.lang.String",
		"setInstanceSpec-setCharge-setChargeDuration":"java.lang.Integer",
		"setInstanceSpec-setPassword":"java.lang.String",
		"setInstanceSpec-setKeyNames":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setInstanceSpec-addKeyName":"java.lang.String",
		"setInstanceSpec-setImageId":"java.lang.String",
		"setInstanceSpec-setDescription":"java.lang.String",
		"setInstanceSpec-setDataDisks":[
			"ref1-com.jdcloud.sdk.service.vm.model.InstanceDiskAttachmentSpec"
		],
		"setInstanceSpec-addDataDisk-setDeviceName":"java.lang.String",
		"setInstanceSpec-addDataDisk-setAutoDelete":"java.lang.Boolean",
		"setInstanceSpec-addDataDisk-setDiskCategory":"java.lang.String",
		"setInstanceSpec-addDataDisk-setCloudDiskSpec-setCharge-setChargeMode":"java.lang.String",
		"setInstanceSpec-addDataDisk-setCloudDiskSpec-setCharge-setChargeUnit":"java.lang.String",
		"setInstanceSpec-addDataDisk-setCloudDiskSpec-setCharge-setChargeDuration":"java.lang.Integer",
		"setInstanceSpec-addDataDisk-setCloudDiskSpec-setDescription":"java.lang.String",
		"setInstanceSpec-addDataDisk-setCloudDiskSpec-setAz":"java.lang.String",
		"setInstanceSpec-addDataDisk-setCloudDiskSpec-setDiskType":"java.lang.String",
		"setInstanceSpec-addDataDisk-setCloudDiskSpec-setDiskSizeGB":"java.lang.Integer",
		"setInstanceSpec-addDataDisk-setCloudDiskSpec-setSnapshotId":"java.lang.String",
		"setInstanceSpec-addDataDisk-setCloudDiskSpec-setName":"java.lang.String",
		"setInstanceSpec-addDataDisk-setNoDevice":"java.lang.Boolean",
		"setInstanceSpec-setInstanceType":"java.lang.String",
		"setInstanceSpec-setAgId":"java.lang.String",
		"setInstanceSpec-setInstanceTemplateId":"java.lang.String",
		"setInstanceSpec-setElasticIp-setBandwidthMbps":"java.lang.Integer",
		"setInstanceSpec-setElasticIp-setProvider":"java.lang.String",
		"setInstanceSpec-setElasticIp-setChargeSpec-setChargeMode":"java.lang.String",
		"setInstanceSpec-setElasticIp-setChargeSpec-setChargeUnit":"java.lang.String",
		"setInstanceSpec-setElasticIp-setChargeSpec-setChargeDuration":"java.lang.Integer",
		"setInstanceSpec-setPrimaryNetworkInterface-setDeviceIndex":"java.lang.Integer",
		"setInstanceSpec-setPrimaryNetworkInterface-setNetworkInterface-setDescription":"java.lang.String",
		"setInstanceSpec-setPrimaryNetworkInterface-setNetworkInterface-setSubnetId":"java.lang.String",
		"setInstanceSpec-setPrimaryNetworkInterface-setNetworkInterface-setNetworkInterfaceName":"java.lang.String",
		"setInstanceSpec-setPrimaryNetworkInterface-setNetworkInterface-setPrimaryIpAddress":"java.lang.String",
		"setInstanceSpec-setPrimaryNetworkInterface-setNetworkInterface-setSecondaryIpAddresses":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setInstanceSpec-setPrimaryNetworkInterface-setNetworkInterface-setSecondaryIpCount":"java.lang.Integer",
		"setInstanceSpec-setPrimaryNetworkInterface-setNetworkInterface-setSecurityGroups":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setInstanceSpec-setPrimaryNetworkInterface-setNetworkInterface-setSanityCheck":"java.lang.Integer",
		"setInstanceSpec-setPrimaryNetworkInterface-setNetworkInterface-addSecondaryIpAddresse":"java.lang.String",
		"setInstanceSpec-setPrimaryNetworkInterface-setNetworkInterface-addSecurityGroup":"java.lang.String",
		"setInstanceSpec-setPrimaryNetworkInterface-setNetworkInterface-setAz":"java.lang.String",
		"setInstanceSpec-setSystemDisk-setDeviceName":"java.lang.String",
		"setInstanceSpec-setSystemDisk-setAutoDelete":"java.lang.Boolean",
		"setInstanceSpec-setSystemDisk-setDiskCategory":"java.lang.String",
		"setInstanceSpec-setSystemDisk-setCloudDiskSpec-setCharge-setChargeMode":"java.lang.String",
		"setInstanceSpec-setSystemDisk-setCloudDiskSpec-setCharge-setChargeUnit":"java.lang.String",
		"setInstanceSpec-setSystemDisk-setCloudDiskSpec-setCharge-setChargeDuration":"java.lang.Integer",
		"setInstanceSpec-setSystemDisk-setCloudDiskSpec-setDescription":"java.lang.String",
		"setInstanceSpec-setSystemDisk-setCloudDiskSpec-setAz":"java.lang.String",
		"setInstanceSpec-setSystemDisk-setCloudDiskSpec-setDiskType":"java.lang.String",
		"setInstanceSpec-setSystemDisk-setCloudDiskSpec-setDiskSizeGB":"java.lang.Integer",
		"setInstanceSpec-setSystemDisk-setCloudDiskSpec-setSnapshotId":"java.lang.String",
		"setInstanceSpec-setSystemDisk-setCloudDiskSpec-setName":"java.lang.String",
		"setInstanceSpec-setSystemDisk-setNoDevice":"java.lang.Boolean",
		"setInstanceSpec-setAz":"java.lang.String",
		"setInstanceSpec-setName":"java.lang.String",
		"setMaxCount":"java.lang.Integer",
		"setClientToken":"java.lang.String"
	},
	"ref1-com.jdcloud.sdk.service.vm.model.InstanceDiskAttachmentSpec":{
		"setDeviceName":"java.lang.String",
		"setAutoDelete":"java.lang.Boolean",
		"setDiskCategory":"java.lang.String",
		"setCloudDiskSpec-setCharge-setChargeMode":"java.lang.String",
		"setCloudDiskSpec-setCharge-setChargeUnit":"java.lang.String",
		"setCloudDiskSpec-setCharge-setChargeDuration":"java.lang.Integer",
		"setCloudDiskSpec-setDescription":"java.lang.String",
		"setCloudDiskSpec-setAz":"java.lang.String",
		"setCloudDiskSpec-setDiskType":"java.lang.String",
		"setCloudDiskSpec-setDiskSizeGB":"java.lang.Integer",
		"setCloudDiskSpec-setSnapshotId":"java.lang.String",
		"setCloudDiskSpec-setName":"java.lang.String",
		"setNoDevice":"java.lang.Boolean"
	}
}
```
## DisassociateElasticIp parameterss:

```
{
	"main":{
		"setInstanceId":"java.lang.String",
		"setRegionId":"java.lang.String",
		"setElasticIpId":"java.lang.String"
	}
}
```
## DescribeInstancePrivateIpAddress parameterss:

```
{
	"main":{
		"setRegionId":"java.lang.String",
		"setPageNumber":"java.lang.Integer",
		"setPageSize":"java.lang.Integer",
		"setFilters":[
			"ref1-com.jdcloud.sdk.service.common.model.Filter"
		],
		"addFilter-setValues":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"addFilter-setOperator":"java.lang.String",
		"addFilter-addValue":"java.lang.String",
		"addFilter-setName":"java.lang.String"
	},
	"ref1-com.jdcloud.sdk.service.common.model.Filter":{
		"setValues":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setOperator":"java.lang.String",
		"addValue":"java.lang.String",
		"setName":"java.lang.String"
	}
}
```
## StartInstance parameterss:

```
{
	"main":{
		"setInstanceId":"java.lang.String",
		"setRegionId":"java.lang.String"
	}
}
```
## DescribeImage parameterss:

```
{
	"main":{
		"setImageId":"java.lang.String",
		"setRegionId":"java.lang.String"
	}
}
```
## DeleteInstance parameterss:

```
{
	"main":{
		"setInstanceId":"java.lang.String",
		"setRegionId":"java.lang.String"
	}
}
```
## DescribeInstanceTypes parameterss:

```
{
	"main":{
		"setRegionId":"java.lang.String",
		"setFilters":[
			"ref1-com.jdcloud.sdk.service.common.model.Filter"
		],
		"addFilter-setValues":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"addFilter-setOperator":"java.lang.String",
		"addFilter-addValue":"java.lang.String",
		"addFilter-setName":"java.lang.String"
	},
	"ref1-com.jdcloud.sdk.service.common.model.Filter":{
		"setValues":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setOperator":"java.lang.String",
		"addValue":"java.lang.String",
		"setName":"java.lang.String"
	}
}
```
