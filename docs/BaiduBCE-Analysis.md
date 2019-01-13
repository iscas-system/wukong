## BindInstanceToTags parameterss:

```
- setChangeTags = java.util.List<com.baidubce.services.bcc.model.TagModel>
- 	withTagValue = java.lang.String
- 	setTagKey = java.lang.String
- 	withTagKey = java.lang.String
- 	setTagValue = java.lang.String
- setInstanceId = java.lang.String
- withInstanceId = java.lang.String
- withChangeTags = java.util.List<com.baidubce.services.bcc.model.TagModel>
- 	withTagValue = java.lang.String
- 	setTagKey = java.lang.String
- 	withTagKey = java.lang.String
- 	setTagValue = java.lang.String
- withRequestCredentials = com.baidubce.auth.BceCredentials
- setRequestCredentials = com.baidubce.auth.BceCredentials
```
## AttachVolume parameterss:

```
- setVolumeId = java.lang.String
- setInstanceId = java.lang.String
- withInstanceId = java.lang.String
- withVolumeId = java.lang.String
- withRequestCredentials = com.baidubce.auth.BceCredentials
- setRequestCredentials = com.baidubce.auth.BceCredentials
```
## DeleteImage parameterss:

```
- withImageId = java.lang.String
- withRequestCredentials = com.baidubce.auth.BceCredentials
- setImageId = java.lang.String
- setRequestCredentials = com.baidubce.auth.BceCredentials
```
## GetVolume parameterss:

```
- setVolumeId = java.lang.String
- withVolumeId = java.lang.String
- withRequestCredentials = com.baidubce.auth.BceCredentials
- setRequestCredentials = com.baidubce.auth.BceCredentials
```
## ModifyInstancePassword parameterss:

```
- setInstanceId = java.lang.String
- setAdminPass = java.lang.String
- withInstanceId = java.lang.String
- withAdminPass = java.lang.String
- withRequestCredentials = com.baidubce.auth.BceCredentials
- setRequestCredentials = com.baidubce.auth.BceCredentials
```
## ModifyInstanceAttributes parameterss:

```
- setInstanceId = java.lang.String
- withName = java.lang.String
- withInstanceId = java.lang.String
- withRequestCredentials = com.baidubce.auth.BceCredentials
- setName = java.lang.String
- setRequestCredentials = com.baidubce.auth.BceCredentials
```
## RebootInstance parameterss:

```
- setInstanceId = java.lang.String
- setForceStop = boolean
- withInstanceId = java.lang.String
- withForceStop = boolean
- withRequestCredentials = com.baidubce.auth.BceCredentials
- setRequestCredentials = com.baidubce.auth.BceCredentials
```
## CreateInstance parameterss:

```
- withEphemeralDisks = java.util.List<com.baidubce.services.bcc.model.volume.EphemeralDisk>
- 	setStorageType = java.lang.String
- 	withStorageType = java.lang.String
- 	setSizeInGB = int
- 	setFreeSizeInGB = int
- 	withSizeInGB = int
- setEphemeralDisks = java.util.List<com.baidubce.services.bcc.model.volume.EphemeralDisk>
- 	setStorageType = java.lang.String
- 	withStorageType = java.lang.String
- 	setSizeInGB = int
- 	setFreeSizeInGB = int
- 	withSizeInGB = int
- setLocalDiskSizeInGB = int
- withLocalDiskSizeInGB = int
- setCreateCdsList = java.util.List<com.baidubce.services.bcc.model.CreateCdsModel>
- 	setCdsSizeInGB = int
- 	withCdsSizeInGB = int
- 	setStorageType = java.lang.String
- 	withStorageType = java.lang.String
- 	setSnapshotId = java.lang.String
- 	withSnapshotId = java.lang.String
- withCreateCdsList = java.util.List<com.baidubce.services.bcc.model.CreateCdsModel>
- 	setCdsSizeInGB = int
- 	withCdsSizeInGB = int
- 	setStorageType = java.lang.String
- 	withStorageType = java.lang.String
- 	setSnapshotId = java.lang.String
- 	withSnapshotId = java.lang.String
- setNetworkCapacityInMbps = int
- withNetworkCapacityInMbps = int
- setPurchaseCount = int
- withPurchaseCount = int
- withName = java.lang.String
- setRelationTag = boolean
- withRelationTag = boolean
- setTags = java.util.List<com.baidubce.services.bcc.model.TagModel>
- 	withTagValue = java.lang.String
- 	setTagKey = java.lang.String
- 	withTagKey = java.lang.String
- 	setTagValue = java.lang.String
- withTags = java.util.List<com.baidubce.services.bcc.model.TagModel>
- 	withTagValue = java.lang.String
- 	setTagKey = java.lang.String
- 	withTagKey = java.lang.String
- 	setTagValue = java.lang.String
- withDedicatedHostId = java.lang.String
- setDedicatedHostId = java.lang.String
- withZoneName = java.lang.String
- setZoneName = java.lang.String
- withSubnetId = java.lang.String
- setSubnetId = java.lang.String
- setSecurityGroupId = java.lang.String
- setGpuCard = com.baidubce.services.bcc.model.instance.GpuCardType
- withGpuCard = com.baidubce.services.bcc.model.instance.GpuCardType
- setFpgaCard = com.baidubce.services.bcc.model.instance.FpgaCardType
- withFpgaCard = com.baidubce.services.bcc.model.instance.FpgaCardType
- setCardCount = int
- withCardCount = int
- setClientToken = java.lang.String
- setBilling = com.baidubce.services.bcc.model.Billing
- 	setPaymentTiming = java.lang.String
- 	withReservation = com.baidubce.services.bcc.model.Reservation
- 		withReservationLength = int
- 		withReservationTimeUnit = java.lang.String
- 		setReservationTimeUnit = java.lang.String
- 		setReservationLength = int
- 	withPaymentTiming = java.lang.String
- 	setReservation = com.baidubce.services.bcc.model.Reservation
- 		withReservationLength = int
- 		withReservationTimeUnit = java.lang.String
- 		setReservationTimeUnit = java.lang.String
- 		setReservationLength = int
- setAdminPass = java.lang.String
- withAdminPass = java.lang.String
- withImageId = java.lang.String
- withSecurityGroupId = java.lang.String
- withBilling = com.baidubce.services.bcc.model.Billing
- 	setPaymentTiming = java.lang.String
- 	withReservation = com.baidubce.services.bcc.model.Reservation
- 		withReservationLength = int
- 		withReservationTimeUnit = java.lang.String
- 		setReservationTimeUnit = java.lang.String
- 		setReservationLength = int
- 	withPaymentTiming = java.lang.String
- 	setReservation = com.baidubce.services.bcc.model.Reservation
- 		withReservationLength = int
- 		withReservationTimeUnit = java.lang.String
- 		setReservationTimeUnit = java.lang.String
- 		setReservationLength = int
- withRequestCredentials = com.baidubce.auth.BceCredentials
- withClientToken = java.lang.String
- withInstanceType = java.lang.String
- setInstanceType = java.lang.String
- withCpuCount = int
- setCpuCount = int
- withMemoryCapacityInGB = int
- setMemoryCapacityInGB = int
- setImageId = java.lang.String
- setName = java.lang.String
- setRequestCredentials = com.baidubce.auth.BceCredentials
```
## DeleteSnapshot parameterss:

```
- setSnapshotId = java.lang.String
- withSnapshotId = java.lang.String
- withRequestCredentials = com.baidubce.auth.BceCredentials
- setRequestCredentials = com.baidubce.auth.BceCredentials
```
## ResizeInstance parameterss:

```
- setInstanceId = java.lang.String
- setClientToken = java.lang.String
- withInstanceId = java.lang.String
- withRequestCredentials = com.baidubce.auth.BceCredentials
- withClientToken = java.lang.String
- withCpuCount = int
- setCpuCount = int
- withMemoryCapacityInGB = int
- setMemoryCapacityInGB = int
- setRequestCredentials = com.baidubce.auth.BceCredentials
```
## RollbackVolume parameterss:

```
- setVolumeId = java.lang.String
- setSnapshotId = java.lang.String
- withVolumeId = java.lang.String
- withSnapshotId = java.lang.String
- withRequestCredentials = com.baidubce.auth.BceCredentials
- setRequestCredentials = com.baidubce.auth.BceCredentials
```
## DeleteSecurityGroup parameterss:

```
- setSecurityGroupId = java.lang.String
- withSecurityGroupId = java.lang.String
- withRequestCredentials = com.baidubce.auth.BceCredentials
- setRequestCredentials = com.baidubce.auth.BceCredentials
```
## GetInstanceVnc parameterss:

```
- setInstanceId = java.lang.String
- withInstanceId = java.lang.String
- withRequestCredentials = com.baidubce.auth.BceCredentials
- setRequestCredentials = com.baidubce.auth.BceCredentials
```
## PurchaseReservedVolume parameterss:

```
- setVolumeId = java.lang.String
- setClientToken = java.lang.String
- setBilling = com.baidubce.services.bcc.model.Billing
- 	setPaymentTiming = java.lang.String
- 	withReservation = com.baidubce.services.bcc.model.Reservation
- 		withReservationLength = int
- 		withReservationTimeUnit = java.lang.String
- 		setReservationTimeUnit = java.lang.String
- 		setReservationLength = int
- 	withPaymentTiming = java.lang.String
- 	setReservation = com.baidubce.services.bcc.model.Reservation
- 		withReservationLength = int
- 		withReservationTimeUnit = java.lang.String
- 		setReservationTimeUnit = java.lang.String
- 		setReservationLength = int
- withBilling = com.baidubce.services.bcc.model.Billing
- 	setPaymentTiming = java.lang.String
- 	withReservation = com.baidubce.services.bcc.model.Reservation
- 		withReservationLength = int
- 		withReservationTimeUnit = java.lang.String
- 		setReservationTimeUnit = java.lang.String
- 		setReservationLength = int
- 	withPaymentTiming = java.lang.String
- 	setReservation = com.baidubce.services.bcc.model.Reservation
- 		withReservationLength = int
- 		withReservationTimeUnit = java.lang.String
- 		setReservationTimeUnit = java.lang.String
- 		setReservationLength = int
- withVolumeId = java.lang.String
- withRequestCredentials = com.baidubce.auth.BceCredentials
- withClientToken = java.lang.String
- setRequestCredentials = com.baidubce.auth.BceCredentials
```
## CreateImage parameterss:

```
- setInstanceId = java.lang.String
- setSnapshotId = java.lang.String
- setImageName = java.lang.String
- setClientToken = java.lang.String
- withInstanceId = java.lang.String
- withSnapshotId = java.lang.String
- withImageName = java.lang.String
- withRequestCredentials = com.baidubce.auth.BceCredentials
- withClientToken = java.lang.String
- setRequestCredentials = com.baidubce.auth.BceCredentials
```
## ReleaseVolume parameterss:

```
- setVolumeId = java.lang.String
- withVolumeId = java.lang.String
- withRequestCredentials = com.baidubce.auth.BceCredentials
- setRequestCredentials = com.baidubce.auth.BceCredentials
```
## PurchaseReservedInstance parameterss:

```
- setInstanceId = java.lang.String
- setClientToken = java.lang.String
- setBilling = com.baidubce.services.bcc.model.Billing
- 	setPaymentTiming = java.lang.String
- 	withReservation = com.baidubce.services.bcc.model.Reservation
- 		withReservationLength = int
- 		withReservationTimeUnit = java.lang.String
- 		setReservationTimeUnit = java.lang.String
- 		setReservationLength = int
- 	withPaymentTiming = java.lang.String
- 	setReservation = com.baidubce.services.bcc.model.Reservation
- 		withReservationLength = int
- 		withReservationTimeUnit = java.lang.String
- 		setReservationTimeUnit = java.lang.String
- 		setReservationLength = int
- withInstanceId = java.lang.String
- withBilling = com.baidubce.services.bcc.model.Billing
- 	setPaymentTiming = java.lang.String
- 	withReservation = com.baidubce.services.bcc.model.Reservation
- 		withReservationLength = int
- 		withReservationTimeUnit = java.lang.String
- 		setReservationTimeUnit = java.lang.String
- 		setReservationLength = int
- 	withPaymentTiming = java.lang.String
- 	setReservation = com.baidubce.services.bcc.model.Reservation
- 		withReservationLength = int
- 		withReservationTimeUnit = java.lang.String
- 		setReservationTimeUnit = java.lang.String
- 		setReservationLength = int
- withRequestCredentials = com.baidubce.auth.BceCredentials
- withClientToken = java.lang.String
- setRequestCredentials = com.baidubce.auth.BceCredentials
```
## DetachVolume parameterss:

```
- setVolumeId = java.lang.String
- setInstanceId = java.lang.String
- withInstanceId = java.lang.String
- withVolumeId = java.lang.String
- withRequestCredentials = com.baidubce.auth.BceCredentials
- setRequestCredentials = com.baidubce.auth.BceCredentials
```
## StopInstance parameterss:

```
- setInstanceId = java.lang.String
- setForceStop = boolean
- withInstanceId = java.lang.String
- withForceStop = boolean
- withRequestCredentials = com.baidubce.auth.BceCredentials
- setRequestCredentials = com.baidubce.auth.BceCredentials
```
## GetSnapshot parameterss:

```
- setSnapshotId = java.lang.String
- withSnapshotId = java.lang.String
- withRequestCredentials = com.baidubce.auth.BceCredentials
- setRequestCredentials = com.baidubce.auth.BceCredentials
```
## RebuildInstance parameterss:

```
- setInstanceId = java.lang.String
- setAdminPass = java.lang.String
- withInstanceId = java.lang.String
- withAdminPass = java.lang.String
- withImageId = java.lang.String
- withRequestCredentials = com.baidubce.auth.BceCredentials
- setImageId = java.lang.String
- setRequestCredentials = com.baidubce.auth.BceCredentials
```
## ReleaseInstance parameterss:

```
- setInstanceId = java.lang.String
- withInstanceId = java.lang.String
- withRequestCredentials = com.baidubce.auth.BceCredentials
- setRequestCredentials = com.baidubce.auth.BceCredentials
```
## UnbindInstanceFromTags parameterss:

```
- setChangeTags = java.util.List<com.baidubce.services.bcc.model.TagModel>
- 	withTagValue = java.lang.String
- 	setTagKey = java.lang.String
- 	withTagKey = java.lang.String
- 	setTagValue = java.lang.String
- setInstanceId = java.lang.String
- withInstanceId = java.lang.String
- withChangeTags = java.util.List<com.baidubce.services.bcc.model.TagModel>
- 	withTagValue = java.lang.String
- 	setTagKey = java.lang.String
- 	withTagKey = java.lang.String
- 	setTagValue = java.lang.String
- withRequestCredentials = com.baidubce.auth.BceCredentials
- setRequestCredentials = com.baidubce.auth.BceCredentials
```
## ResizeVolume parameterss:

```
- setVolumeId = java.lang.String
- setNewCdsSizeInGB = int
- setClientToken = java.lang.String
- withVolumeId = java.lang.String
- withNewCdsSizeInGB = int
- withRequestCredentials = com.baidubce.auth.BceCredentials
- withClientToken = java.lang.String
- setRequestCredentials = com.baidubce.auth.BceCredentials
```
## GetInstance parameterss:

```
- setInstanceId = java.lang.String
- withInstanceId = java.lang.String
- withRequestCredentials = com.baidubce.auth.BceCredentials
- setRequestCredentials = com.baidubce.auth.BceCredentials
```
## CreateSecurityGroup parameterss:

```
- withName = java.lang.String
- setDesc = java.lang.String
- withVpcId = java.lang.String
- setVpcId = java.lang.String
- setRules = java.util.List<com.baidubce.services.bcc.model.SecurityGroupRuleModel>
- 	setSecurityGroupId = java.lang.String
- 	setProtocol = java.lang.String
- 	withProtocol = java.lang.String
- 	withSecurityGroupId = java.lang.String
- 	setRemark = java.lang.String
- 	withRemark = java.lang.String
- 	setDirection = java.lang.String
- 	withDirection = java.lang.String
- 	setEthertype = java.lang.String
- 	withEthertype = java.lang.String
- 	setPortRange = java.lang.String
- 	withPortRange = java.lang.String
- 	setSourceGroupId = java.lang.String
- 	withSourceGroupId = java.lang.String
- 	setSourceIp = java.lang.String
- 	withSourceIp = java.lang.String
- 	setDestGroupId = java.lang.String
- 	withDestGroupId = java.lang.String
- 	setDestIp = java.lang.String
- 	withDestIp = java.lang.String
- withRules = java.util.List<com.baidubce.services.bcc.model.SecurityGroupRuleModel>
- 	setSecurityGroupId = java.lang.String
- 	setProtocol = java.lang.String
- 	withProtocol = java.lang.String
- 	withSecurityGroupId = java.lang.String
- 	setRemark = java.lang.String
- 	withRemark = java.lang.String
- 	setDirection = java.lang.String
- 	withDirection = java.lang.String
- 	setEthertype = java.lang.String
- 	withEthertype = java.lang.String
- 	setPortRange = java.lang.String
- 	withPortRange = java.lang.String
- 	setSourceGroupId = java.lang.String
- 	withSourceGroupId = java.lang.String
- 	setSourceIp = java.lang.String
- 	withSourceIp = java.lang.String
- 	setDestGroupId = java.lang.String
- 	withDestGroupId = java.lang.String
- 	setDestIp = java.lang.String
- 	withDestIp = java.lang.String
- setClientToken = java.lang.String
- withDesc = java.lang.String
- withRequestCredentials = com.baidubce.auth.BceCredentials
- withClientToken = java.lang.String
- setName = java.lang.String
- setRequestCredentials = com.baidubce.auth.BceCredentials
```
## AuthorizeSecurityGroupRule parameterss:

```
- setSecurityGroupId = java.lang.String
- setRule = com.baidubce.services.bcc.model.SecurityGroupRuleModel
- 	setSecurityGroupId = java.lang.String
- 	setProtocol = java.lang.String
- 	withProtocol = java.lang.String
- 	withSecurityGroupId = java.lang.String
- 	setRemark = java.lang.String
- 	withRemark = java.lang.String
- 	setDirection = java.lang.String
- 	withDirection = java.lang.String
- 	setEthertype = java.lang.String
- 	withEthertype = java.lang.String
- 	setPortRange = java.lang.String
- 	withPortRange = java.lang.String
- 	setSourceGroupId = java.lang.String
- 	withSourceGroupId = java.lang.String
- 	setSourceIp = java.lang.String
- 	withSourceIp = java.lang.String
- 	setDestGroupId = java.lang.String
- 	withDestGroupId = java.lang.String
- 	setDestIp = java.lang.String
- 	withDestIp = java.lang.String
- withRule = com.baidubce.services.bcc.model.SecurityGroupRuleModel
- 	setSecurityGroupId = java.lang.String
- 	setProtocol = java.lang.String
- 	withProtocol = java.lang.String
- 	withSecurityGroupId = java.lang.String
- 	setRemark = java.lang.String
- 	withRemark = java.lang.String
- 	setDirection = java.lang.String
- 	withDirection = java.lang.String
- 	setEthertype = java.lang.String
- 	withEthertype = java.lang.String
- 	setPortRange = java.lang.String
- 	withPortRange = java.lang.String
- 	setSourceGroupId = java.lang.String
- 	withSourceGroupId = java.lang.String
- 	setSourceIp = java.lang.String
- 	withSourceIp = java.lang.String
- 	setDestGroupId = java.lang.String
- 	withDestGroupId = java.lang.String
- 	setDestIp = java.lang.String
- 	withDestIp = java.lang.String
- setClientToken = java.lang.String
- withSecurityGroupId = java.lang.String
- withRequestCredentials = com.baidubce.auth.BceCredentials
- withClientToken = java.lang.String
- setRequestCredentials = com.baidubce.auth.BceCredentials
```
## BindInstanceToSecurityGroup parameterss:

```
- setInstanceId = java.lang.String
- setSecurityGroupId = java.lang.String
- withInstanceId = java.lang.String
- withSecurityGroupId = java.lang.String
- withRequestCredentials = com.baidubce.auth.BceCredentials
- setRequestCredentials = com.baidubce.auth.BceCredentials
```
## GetImage parameterss:

```
- withImageId = java.lang.String
- withRequestCredentials = com.baidubce.auth.BceCredentials
- setImageId = java.lang.String
- setRequestCredentials = com.baidubce.auth.BceCredentials
```
## UnbindInstanceFromSecurityGroup parameterss:

```
- setInstanceId = java.lang.String
- setSecurityGroupId = java.lang.String
- withInstanceId = java.lang.String
- withSecurityGroupId = java.lang.String
- withRequestCredentials = com.baidubce.auth.BceCredentials
- setRequestCredentials = com.baidubce.auth.BceCredentials
```
## CreateVolume parameterss:

```
- setCdsSizeInGB = int
- withCdsSizeInGB = int
- setStorageType = java.lang.String
- withStorageType = java.lang.String
- setSnapshotId = java.lang.String
- setPurchaseCount = int
- withPurchaseCount = int
- withZoneName = java.lang.String
- setZoneName = java.lang.String
- setClientToken = java.lang.String
- setBilling = com.baidubce.services.bcc.model.Billing
- 	setPaymentTiming = java.lang.String
- 	withReservation = com.baidubce.services.bcc.model.Reservation
- 		withReservationLength = int
- 		withReservationTimeUnit = java.lang.String
- 		setReservationTimeUnit = java.lang.String
- 		setReservationLength = int
- 	withPaymentTiming = java.lang.String
- 	setReservation = com.baidubce.services.bcc.model.Reservation
- 		withReservationLength = int
- 		withReservationTimeUnit = java.lang.String
- 		setReservationTimeUnit = java.lang.String
- 		setReservationLength = int
- withBilling = com.baidubce.services.bcc.model.Billing
- 	setPaymentTiming = java.lang.String
- 	withReservation = com.baidubce.services.bcc.model.Reservation
- 		withReservationLength = int
- 		withReservationTimeUnit = java.lang.String
- 		setReservationTimeUnit = java.lang.String
- 		setReservationLength = int
- 	withPaymentTiming = java.lang.String
- 	setReservation = com.baidubce.services.bcc.model.Reservation
- 		withReservationLength = int
- 		withReservationTimeUnit = java.lang.String
- 		setReservationTimeUnit = java.lang.String
- 		setReservationLength = int
- withSnapshotId = java.lang.String
- withRequestCredentials = com.baidubce.auth.BceCredentials
- withClientToken = java.lang.String
- setRequestCredentials = com.baidubce.auth.BceCredentials
```
## RevokeSecurityGroupRule parameterss:

```
- setSecurityGroupId = java.lang.String
- setRule = com.baidubce.services.bcc.model.SecurityGroupRuleModel
- 	setSecurityGroupId = java.lang.String
- 	setProtocol = java.lang.String
- 	withProtocol = java.lang.String
- 	withSecurityGroupId = java.lang.String
- 	setRemark = java.lang.String
- 	withRemark = java.lang.String
- 	setDirection = java.lang.String
- 	withDirection = java.lang.String
- 	setEthertype = java.lang.String
- 	withEthertype = java.lang.String
- 	setPortRange = java.lang.String
- 	withPortRange = java.lang.String
- 	setSourceGroupId = java.lang.String
- 	withSourceGroupId = java.lang.String
- 	setSourceIp = java.lang.String
- 	withSourceIp = java.lang.String
- 	setDestGroupId = java.lang.String
- 	withDestGroupId = java.lang.String
- 	setDestIp = java.lang.String
- 	withDestIp = java.lang.String
- withRule = com.baidubce.services.bcc.model.SecurityGroupRuleModel
- 	setSecurityGroupId = java.lang.String
- 	setProtocol = java.lang.String
- 	withProtocol = java.lang.String
- 	withSecurityGroupId = java.lang.String
- 	setRemark = java.lang.String
- 	withRemark = java.lang.String
- 	setDirection = java.lang.String
- 	withDirection = java.lang.String
- 	setEthertype = java.lang.String
- 	withEthertype = java.lang.String
- 	setPortRange = java.lang.String
- 	withPortRange = java.lang.String
- 	setSourceGroupId = java.lang.String
- 	withSourceGroupId = java.lang.String
- 	setSourceIp = java.lang.String
- 	withSourceIp = java.lang.String
- 	setDestGroupId = java.lang.String
- 	withDestGroupId = java.lang.String
- 	setDestIp = java.lang.String
- 	withDestIp = java.lang.String
- setClientToken = java.lang.String
- withSecurityGroupId = java.lang.String
- withRequestCredentials = com.baidubce.auth.BceCredentials
- withClientToken = java.lang.String
- setRequestCredentials = com.baidubce.auth.BceCredentials
```
## StartInstance parameterss:

```
- setInstanceId = java.lang.String
- withInstanceId = java.lang.String
- withRequestCredentials = com.baidubce.auth.BceCredentials
- setRequestCredentials = com.baidubce.auth.BceCredentials
```
## CreateSnapshot parameterss:

```
- setVolumeId = java.lang.String
- setSnapshotName = java.lang.String
- setDesc = java.lang.String
- setClientToken = java.lang.String
- withVolumeId = java.lang.String
- withSnapshotName = java.lang.String
- withDesc = java.lang.String
- withRequestCredentials = com.baidubce.auth.BceCredentials
- withClientToken = java.lang.String
- setRequestCredentials = com.baidubce.auth.BceCredentials
```
