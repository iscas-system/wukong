## ModifySnapshotAttribute parameterss:

```
- setSnapshotId = java.lang.String
- withSnapshotId = java.lang.String
- setAttribute = java.lang.String
- withAttribute = com.amazonaws.services.ec2.model.SnapshotAttributeName
- setGroupNames = java.util.Collection<java.lang.String>
- withGroupNames = java.lang.String[]
```
## DescribeSpotDatafeedSubscription parameterss:

```
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## ModifyHosts parameterss:

```
- setAutoPlacement = java.lang.String
- withAutoPlacement = java.lang.String
- setHostIds = java.util.Collection<java.lang.String>
- withHostIds = java.lang.String[]
```
## DescribeSnapshots parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## CreateNatGateway parameterss:

```
- setClientToken = java.lang.String
- withClientToken = java.lang.String
- setAllocationId = java.lang.String
- setSubnetId = java.lang.String
- withSubnetId = java.lang.String
- withAllocationId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeVpcEndpointConnections parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## ResetInstanceAttribute parameterss:

```
- setInstanceId = java.lang.String
- withInstanceId = java.lang.String
- setAttribute = java.lang.String
- withAttribute = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## PurchaseReservedInstancesOffering parameterss:

```
- setInstanceCount = java.lang.Integer
- withInstanceCount = java.lang.Integer
- setLimitPrice = com.amazonaws.services.ec2.model.ReservedInstanceLimitPrice
- 	setCurrencyCode = com.amazonaws.services.ec2.model.CurrencyCodeValues
- 	withCurrencyCode = com.amazonaws.services.ec2.model.CurrencyCodeValues
- 	setAmount = java.lang.Double
- 	withAmount = java.lang.Double
- withLimitPrice = com.amazonaws.services.ec2.model.ReservedInstanceLimitPrice
- 	setCurrencyCode = com.amazonaws.services.ec2.model.CurrencyCodeValues
- 	withCurrencyCode = com.amazonaws.services.ec2.model.CurrencyCodeValues
- 	setAmount = java.lang.Double
- 	withAmount = java.lang.Double
- setReservedInstancesOfferingId = java.lang.String
- withReservedInstancesOfferingId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## ResetSnapshotAttribute parameterss:

```
- setSnapshotId = java.lang.String
- withSnapshotId = java.lang.String
- setAttribute = java.lang.String
- withAttribute = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## CreateClientVpnEndpoint parameterss:

```
- setClientToken = java.lang.String
- withClientToken = java.lang.String
- setDescription = java.lang.String
- withDescription = java.lang.String
- setClientCidrBlock = java.lang.String
- withClientCidrBlock = java.lang.String
- setServerCertificateArn = java.lang.String
- withServerCertificateArn = java.lang.String
- setAuthenticationOptions = java.util.Collection<com.amazonaws.services.ec2.model.ClientVpnAuthenticationRequest>
- 	setType = java.lang.String
- 	withType = com.amazonaws.services.ec2.model.ClientVpnAuthenticationType
- 	setActiveDirectory = com.amazonaws.services.ec2.model.DirectoryServiceAuthenticationRequest
- 		withDirectoryId = java.lang.String
- 		setDirectoryId = java.lang.String
- 	withActiveDirectory = com.amazonaws.services.ec2.model.DirectoryServiceAuthenticationRequest
- 		withDirectoryId = java.lang.String
- 		setDirectoryId = java.lang.String
- 	setMutualAuthentication = com.amazonaws.services.ec2.model.CertificateAuthenticationRequest
- 		setClientRootCertificateChainArn = java.lang.String
- 		withClientRootCertificateChainArn = java.lang.String
- 	withMutualAuthentication = com.amazonaws.services.ec2.model.CertificateAuthenticationRequest
- 		setClientRootCertificateChainArn = java.lang.String
- 		withClientRootCertificateChainArn = java.lang.String
- withAuthenticationOptions = com.amazonaws.services.ec2.model.ClientVpnAuthenticationRequest[]
- 	setType = java.lang.String
- 	withType = com.amazonaws.services.ec2.model.ClientVpnAuthenticationType
- 	setActiveDirectory = com.amazonaws.services.ec2.model.DirectoryServiceAuthenticationRequest
- 		withDirectoryId = java.lang.String
- 		setDirectoryId = java.lang.String
- 	withActiveDirectory = com.amazonaws.services.ec2.model.DirectoryServiceAuthenticationRequest
- 		withDirectoryId = java.lang.String
- 		setDirectoryId = java.lang.String
- 	setMutualAuthentication = com.amazonaws.services.ec2.model.CertificateAuthenticationRequest
- 		setClientRootCertificateChainArn = java.lang.String
- 		withClientRootCertificateChainArn = java.lang.String
- 	withMutualAuthentication = com.amazonaws.services.ec2.model.CertificateAuthenticationRequest
- 		setClientRootCertificateChainArn = java.lang.String
- 		withClientRootCertificateChainArn = java.lang.String
```
## RevokeSecurityGroupEgress parameterss:

```
- setGroupId = java.lang.String
- withGroupId = java.lang.String
- setIpPermissions = java.util.Collection<com.amazonaws.services.ec2.model.IpPermission>
- 	setFromPort = java.lang.Integer
- 	withFromPort = java.lang.Integer
- 	setIpProtocol = java.lang.String
- 	withIpProtocol = java.lang.String
- 	setToPort = java.lang.Integer
- 	withToPort = java.lang.Integer
- 	setPrefixListIds = java.util.Collection<com.amazonaws.services.ec2.model.PrefixListId>
- 		setDescription = java.lang.String
- 		withDescription = java.lang.String
- 		setPrefixListId = java.lang.String
- 		withPrefixListId = java.lang.String
- 	withPrefixListIds = com.amazonaws.services.ec2.model.PrefixListId[]
- 		setDescription = java.lang.String
- 		withDescription = java.lang.String
- 		setPrefixListId = java.lang.String
- 		withPrefixListId = java.lang.String
```
## DescribeSpotPriceHistory parameterss:

```
- setAvailabilityZone = java.lang.String
- withAvailabilityZone = java.lang.String
- setEndTime = java.util.Date
- 	setDate = int
- 	setHours = int
- 	setMinutes = int
- 	setMonth = int
- 	setSeconds = int
- 	setYear = int
- 	setTime = long
- withEndTime = java.util.Date
- 	setDate = int
- 	setHours = int
- 	setMinutes = int
- 	setMonth = int
- 	setSeconds = int
- 	setYear = int
- 	setTime = long
- setInstanceTypes = java.util.Collection<java.lang.String>
- setProductDescriptions = java.util.Collection<java.lang.String>
- withProductDescriptions = java.lang.String[]
```
## CreateDefaultVpc parameterss:

```
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## CreateVpcPeeringConnection parameterss:

```
- setVpcId = java.lang.String
- withVpcId = java.lang.String
- setPeerOwnerId = java.lang.String
- withPeerOwnerId = java.lang.String
- setPeerVpcId = java.lang.String
- withPeerVpcId = java.lang.String
- setPeerRegion = java.lang.String
- withPeerRegion = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeHosts parameterss:

```
- setMaxResults = java.lang.Integer
- withMaxResults = java.lang.Integer
- setNextToken = java.lang.String
- withNextToken = java.lang.String
- setFilter = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## PurchaseScheduledInstances parameterss:

```
- setClientToken = java.lang.String
- withClientToken = java.lang.String
- setPurchaseRequests = java.util.Collection<com.amazonaws.services.ec2.model.PurchaseRequest>
- 	setInstanceCount = java.lang.Integer
- 	withInstanceCount = java.lang.Integer
- 	setPurchaseToken = java.lang.String
- 	withPurchaseToken = java.lang.String
- withPurchaseRequests = com.amazonaws.services.ec2.model.PurchaseRequest[]
```
## CopyFpgaImage parameterss:

```
- setClientToken = java.lang.String
- withClientToken = java.lang.String
- setDescription = java.lang.String
- withDescription = java.lang.String
- setSourceFpgaImageId = java.lang.String
- withName = java.lang.String
- withSourceFpgaImageId = java.lang.String
- setSourceRegion = java.lang.String
- withSourceRegion = java.lang.String
- setName = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeIdentityIdFormat parameterss:

```
- setResource = java.lang.String
- withResource = java.lang.String
- setPrincipalArn = java.lang.String
- withPrincipalArn = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DeleteFlowLogs parameterss:

```
- setFlowLogIds = java.util.Collection<java.lang.String>
- withFlowLogIds = java.lang.String[]
```
## DeleteTransitGatewayRouteTable parameterss:

```
- setTransitGatewayRouteTableId = java.lang.String
- withTransitGatewayRouteTableId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## CreateDefaultSubnet parameterss:

```
- setAvailabilityZone = java.lang.String
- withAvailabilityZone = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeInstances parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## DescribeTransitGatewayAttachments parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## CreateReservedInstancesListing parameterss:

```
- setClientToken = java.lang.String
- withClientToken = java.lang.String
- setInstanceCount = java.lang.Integer
- withInstanceCount = java.lang.Integer
- setPriceSchedules = java.util.Collection<com.amazonaws.services.ec2.model.PriceScheduleSpecification>
- 	setCurrencyCode = java.lang.String
- 	withCurrencyCode = com.amazonaws.services.ec2.model.CurrencyCodeValues
- 	setPrice = java.lang.Double
- 	withPrice = java.lang.Double
- 	setTerm = java.lang.Long
- 	withTerm = java.lang.Long
- withPriceSchedules = com.amazonaws.services.ec2.model.PriceScheduleSpecification[]
```
## DescribeSecurityGroupReferences parameterss:

```
- setGroupId = java.util.Collection<java.lang.String>
- withGroupId = java.lang.String[]
```
## DescribeDhcpOptions parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## AttachVolume parameterss:

```
- setInstanceId = java.lang.String
- withInstanceId = java.lang.String
- withDevice = java.lang.String
- setDevice = java.lang.String
- setVolumeId = java.lang.String
- withVolumeId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## CreateVpcEndpointServiceConfiguration parameterss:

```
- setClientToken = java.lang.String
- withClientToken = java.lang.String
- setAcceptanceRequired = java.lang.Boolean
- withAcceptanceRequired = java.lang.Boolean
- setNetworkLoadBalancerArns = java.util.Collection<java.lang.String>
- withNetworkLoadBalancerArns = java.lang.String[]
```
## ModifyReservedInstances parameterss:

```
- withTargetConfigurations = com.amazonaws.services.ec2.model.ReservedInstancesConfiguration[]
- 	setAvailabilityZone = java.lang.String
- 	withAvailabilityZone = java.lang.String
- 	setInstanceType = com.amazonaws.services.ec2.model.InstanceType
- 	withInstanceType = java.lang.String
- 	setInstanceCount = java.lang.Integer
- 	withInstanceCount = java.lang.Integer
- 	setPlatform = java.lang.String
- 	withPlatform = java.lang.String
- 	setScope = java.lang.String
- 	withScope = com.amazonaws.services.ec2.model.Scope
```
## AllocateHosts parameterss:

```
- setAutoPlacement = java.lang.String
- withAutoPlacement = com.amazonaws.services.ec2.model.AutoPlacement
- setAvailabilityZone = java.lang.String
- withAvailabilityZone = java.lang.String
- setClientToken = java.lang.String
- withClientToken = java.lang.String
- setInstanceType = java.lang.String
- withInstanceType = java.lang.String
- setQuantity = java.lang.Integer
- withQuantity = java.lang.Integer
- setTagSpecifications = java.util.Collection<com.amazonaws.services.ec2.model.TagSpecification>
- 	setResourceType = java.lang.String
- 	withResourceType = java.lang.String
- 	setTags = java.util.Collection<com.amazonaws.services.ec2.model.Tag>
- 		withValue = java.lang.String
- 		setKey = java.lang.String
- 		withKey = java.lang.String
- 		setValue = java.lang.String
- 	withTags = com.amazonaws.services.ec2.model.Tag[]
- 		withValue = java.lang.String
- 		setKey = java.lang.String
- 		withKey = java.lang.String
- 		setValue = java.lang.String
```
## CreateTransitGatewayVpcAttachment parameterss:

```
- setTagSpecifications = java.util.Collection<com.amazonaws.services.ec2.model.TagSpecification>
- 	setResourceType = java.lang.String
- 	withResourceType = java.lang.String
- 	setTags = java.util.Collection<com.amazonaws.services.ec2.model.Tag>
- 		withValue = java.lang.String
- 		setKey = java.lang.String
- 		withKey = java.lang.String
- 		setValue = java.lang.String
- 	withTags = com.amazonaws.services.ec2.model.Tag[]
- 		withValue = java.lang.String
- 		setKey = java.lang.String
- 		withKey = java.lang.String
- 		setValue = java.lang.String
```
## DeleteNetworkInterface parameterss:

```
- setNetworkInterfaceId = java.lang.String
- withNetworkInterfaceId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## GetConsoleScreenshot parameterss:

```
- setInstanceId = java.lang.String
- withInstanceId = java.lang.String
- setWakeUp = java.lang.Boolean
- withWakeUp = java.lang.Boolean
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## CreateClientVpnRoute parameterss:

```
- setClientVpnEndpointId = java.lang.String
- withClientVpnEndpointId = java.lang.String
- setDescription = java.lang.String
- withDescription = java.lang.String
- setDestinationCidrBlock = java.lang.String
- withDestinationCidrBlock = java.lang.String
- setTargetVpcSubnetId = java.lang.String
- withTargetVpcSubnetId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## AssignPrivateIpAddresses parameterss:

```
- setNetworkInterfaceId = java.lang.String
- withNetworkInterfaceId = java.lang.String
- setAllowReassignment = java.lang.Boolean
- withAllowReassignment = java.lang.Boolean
- setPrivateIpAddresses = java.util.Collection<java.lang.String>
- withPrivateIpAddresses = java.lang.String[]
```
## DeleteSnapshot parameterss:

```
- setSnapshotId = java.lang.String
- withSnapshotId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## ModifyVpcPeeringConnectionOptions parameterss:

```
- setVpcPeeringConnectionId = java.lang.String
- withVpcPeeringConnectionId = java.lang.String
- setAccepterPeeringConnectionOptions = com.amazonaws.services.ec2.model.PeeringConnectionOptionsRequest
- 	setAllowDnsResolutionFromRemoteVpc = java.lang.Boolean
- 	withAllowDnsResolutionFromRemoteVpc = java.lang.Boolean
- 	setAllowEgressFromLocalClassicLinkToRemoteVpc = java.lang.Boolean
- 	withAllowEgressFromLocalClassicLinkToRemoteVpc = java.lang.Boolean
- 	setAllowEgressFromLocalVpcToRemoteClassicLink = java.lang.Boolean
- 	withAllowEgressFromLocalVpcToRemoteClassicLink = java.lang.Boolean
- withAccepterPeeringConnectionOptions = com.amazonaws.services.ec2.model.PeeringConnectionOptionsRequest
- 	setAllowDnsResolutionFromRemoteVpc = java.lang.Boolean
- 	withAllowDnsResolutionFromRemoteVpc = java.lang.Boolean
- 	setAllowEgressFromLocalClassicLinkToRemoteVpc = java.lang.Boolean
- 	withAllowEgressFromLocalClassicLinkToRemoteVpc = java.lang.Boolean
- 	setAllowEgressFromLocalVpcToRemoteClassicLink = java.lang.Boolean
- 	withAllowEgressFromLocalVpcToRemoteClassicLink = java.lang.Boolean
- setRequesterPeeringConnectionOptions = com.amazonaws.services.ec2.model.PeeringConnectionOptionsRequest
- 	setAllowDnsResolutionFromRemoteVpc = java.lang.Boolean
- 	withAllowDnsResolutionFromRemoteVpc = java.lang.Boolean
- 	setAllowEgressFromLocalClassicLinkToRemoteVpc = java.lang.Boolean
- 	withAllowEgressFromLocalClassicLinkToRemoteVpc = java.lang.Boolean
- 	setAllowEgressFromLocalVpcToRemoteClassicLink = java.lang.Boolean
- 	withAllowEgressFromLocalVpcToRemoteClassicLink = java.lang.Boolean
- withRequesterPeeringConnectionOptions = com.amazonaws.services.ec2.model.PeeringConnectionOptionsRequest
- 	setAllowDnsResolutionFromRemoteVpc = java.lang.Boolean
- 	withAllowDnsResolutionFromRemoteVpc = java.lang.Boolean
- 	setAllowEgressFromLocalClassicLinkToRemoteVpc = java.lang.Boolean
- 	withAllowEgressFromLocalClassicLinkToRemoteVpc = java.lang.Boolean
- 	setAllowEgressFromLocalVpcToRemoteClassicLink = java.lang.Boolean
- 	withAllowEgressFromLocalVpcToRemoteClassicLink = java.lang.Boolean
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DeleteSecurityGroup parameterss:

```
- setGroupId = java.lang.String
- withGroupId = java.lang.String
- setGroupName = java.lang.String
- withGroupName = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## ModifyVpcEndpointServicePermissions parameterss:

```
- setServiceId = java.lang.String
- withServiceId = java.lang.String
- setAddAllowedPrincipals = java.util.Collection<java.lang.String>
- withAddAllowedPrincipals = java.lang.String[]
```
## AllocateAddress parameterss:

```
- setDomain = java.lang.String
- withDomain = java.lang.String
- setAddress = java.lang.String
- withAddress = java.lang.String
- setPublicIpv4Pool = java.lang.String
- withPublicIpv4Pool = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## ResetFpgaImageAttribute parameterss:

```
- setFpgaImageId = java.lang.String
- withFpgaImageId = java.lang.String
- setAttribute = java.lang.String
- withAttribute = com.amazonaws.services.ec2.model.ResetFpgaImageAttributeName
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DeleteFpgaImage parameterss:

```
- setFpgaImageId = java.lang.String
- withFpgaImageId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeVolumeAttribute parameterss:

```
- setVolumeId = java.lang.String
- withVolumeId = java.lang.String
- setAttribute = java.lang.String
- withAttribute = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## ConfirmProductInstance parameterss:

```
- setInstanceId = java.lang.String
- withInstanceId = java.lang.String
- setProductCode = java.lang.String
- withProductCode = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DeleteInternetGateway parameterss:

```
- setInternetGatewayId = java.lang.String
- withInternetGatewayId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeImportSnapshotTasks parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## DescribeInstanceCreditSpecifications parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## ReportInstanceStatus parameterss:

```
- setDescription = java.lang.String
- withDescription = java.lang.String
- setEndTime = java.util.Date
- 	setDate = int
- 	setHours = int
- 	setMinutes = int
- 	setMonth = int
- 	setSeconds = int
- 	setYear = int
- 	setTime = long
- withEndTime = java.util.Date
- 	setDate = int
- 	setHours = int
- 	setMinutes = int
- 	setMonth = int
- 	setSeconds = int
- 	setYear = int
- 	setTime = long
- setStartTime = java.util.Date
- 	setDate = int
- 	setHours = int
- 	setMinutes = int
- 	setMonth = int
- 	setSeconds = int
- 	setYear = int
- 	setTime = long
- withStartTime = java.util.Date
- 	setDate = int
- 	setHours = int
- 	setMinutes = int
- 	setMonth = int
- 	setSeconds = int
- 	setYear = int
- 	setTime = long
- setInstances = java.util.Collection<java.lang.String>
- withInstances = java.lang.String[]
```
## RevokeSecurityGroupIngress parameterss:

```
- setGroupId = java.lang.String
- withGroupId = java.lang.String
- setIpPermissions = java.util.Collection<com.amazonaws.services.ec2.model.IpPermission>
- 	setFromPort = java.lang.Integer
- 	withFromPort = java.lang.Integer
- 	setIpProtocol = java.lang.String
- 	withIpProtocol = java.lang.String
- 	setToPort = java.lang.Integer
- 	withToPort = java.lang.Integer
- 	setPrefixListIds = java.util.Collection<com.amazonaws.services.ec2.model.PrefixListId>
- 		setDescription = java.lang.String
- 		withDescription = java.lang.String
- 		setPrefixListId = java.lang.String
- 		withPrefixListId = java.lang.String
- 	withPrefixListIds = com.amazonaws.services.ec2.model.PrefixListId[]
- 		setDescription = java.lang.String
- 		withDescription = java.lang.String
- 		setPrefixListId = java.lang.String
- 		withPrefixListId = java.lang.String
```
## CreateCapacityReservation parameterss:

```
- setAvailabilityZone = java.lang.String
- withAvailabilityZone = java.lang.String
- setClientToken = java.lang.String
- withClientToken = java.lang.String
- setInstanceType = java.lang.String
- withInstanceType = java.lang.String
- setTagSpecifications = java.util.Collection<com.amazonaws.services.ec2.model.TagSpecification>
- 	setResourceType = java.lang.String
- 	withResourceType = java.lang.String
- 	setTags = java.util.Collection<com.amazonaws.services.ec2.model.Tag>
- 		withValue = java.lang.String
- 		setKey = java.lang.String
- 		withKey = java.lang.String
- 		setValue = java.lang.String
- 	withTags = com.amazonaws.services.ec2.model.Tag[]
- 		withValue = java.lang.String
- 		setKey = java.lang.String
- 		withKey = java.lang.String
- 		setValue = java.lang.String
```
## EnableVpcClassicLink parameterss:

```
- setVpcId = java.lang.String
- withVpcId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## ModifyInstanceAttribute parameterss:

```
- setInstanceType = java.lang.String
- withInstanceType = java.lang.String
- setInstanceId = java.lang.String
- withInstanceId = java.lang.String
- setGroups = java.util.Collection<java.lang.String>
- withGroups = java.lang.String[]
```
## DeleteVpnConnectionRoute parameterss:

```
- setDestinationCidrBlock = java.lang.String
- withDestinationCidrBlock = java.lang.String
- setVpnConnectionId = java.lang.String
- withVpnConnectionId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeSecurityGroups parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## ModifySubnetAttribute parameterss:

```
- setSubnetId = java.lang.String
- withSubnetId = java.lang.String
- setAssignIpv6AddressOnCreation = java.lang.Boolean
- withAssignIpv6AddressOnCreation = java.lang.Boolean
- setMapPublicIpOnLaunch = java.lang.Boolean
- withMapPublicIpOnLaunch = java.lang.Boolean
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## ModifyFleet parameterss:

```
- setExcessCapacityTerminationPolicy = java.lang.String
- withExcessCapacityTerminationPolicy = java.lang.String
- setTargetCapacitySpecification = com.amazonaws.services.ec2.model.TargetCapacitySpecificationRequest
- 	setTotalTargetCapacity = java.lang.Integer
- 	withTotalTargetCapacity = java.lang.Integer
- 	setOnDemandTargetCapacity = java.lang.Integer
- 	withOnDemandTargetCapacity = java.lang.Integer
- 	setSpotTargetCapacity = java.lang.Integer
- 	withSpotTargetCapacity = java.lang.Integer
- 	setDefaultTargetCapacityType = java.lang.String
- 	withDefaultTargetCapacityType = java.lang.String
- withTargetCapacitySpecification = com.amazonaws.services.ec2.model.TargetCapacitySpecificationRequest
- 	setTotalTargetCapacity = java.lang.Integer
- 	withTotalTargetCapacity = java.lang.Integer
- 	setOnDemandTargetCapacity = java.lang.Integer
- 	withOnDemandTargetCapacity = java.lang.Integer
- 	setSpotTargetCapacity = java.lang.Integer
- 	withSpotTargetCapacity = java.lang.Integer
- 	setDefaultTargetCapacityType = java.lang.String
- 	withDefaultTargetCapacityType = java.lang.String
- setFleetId = java.lang.String
- withFleetId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## CancelSpotFleetRequests parameterss:

```
- setSpotFleetRequestIds = java.util.Collection<java.lang.String>
- withSpotFleetRequestIds = java.lang.String[]
```
## DescribeIdFormat parameterss:

```
- setResource = java.lang.String
- withResource = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## GetPasswordData parameterss:

```
- setInstanceId = java.lang.String
- withInstanceId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DisableVpcClassicLink parameterss:

```
- setVpcId = java.lang.String
- withVpcId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## ModifyVolumeAttribute parameterss:

```
- setVolumeId = java.lang.String
- withVolumeId = java.lang.String
- withAutoEnableIO = java.lang.Boolean
- setAutoEnableIO = java.lang.Boolean
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeSubnets parameterss:

```
- setSubnetIds = java.util.Collection<java.lang.String>
- withSubnetIds = java.lang.String[]
```
## AssociateClientVpnTargetNetwork parameterss:

```
- setClientVpnEndpointId = java.lang.String
- withClientVpnEndpointId = java.lang.String
- setSubnetId = java.lang.String
- withSubnetId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## CreateEgressOnlyInternetGateway parameterss:

```
- setClientToken = java.lang.String
- withClientToken = java.lang.String
- setVpcId = java.lang.String
- withVpcId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## CreateDhcpOptions parameterss:

```
- setDhcpConfigurations = java.util.Collection<com.amazonaws.services.ec2.model.DhcpConfiguration>
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## DescribeFlowLogs parameterss:

```
- setFlowLogIds = java.util.Collection<java.lang.String>
- withFlowLogIds = java.lang.String[]
```
## DeleteVpcEndpointConnectionNotifications parameterss:

```
- setConnectionNotificationIds = java.util.Collection<java.lang.String>
- withConnectionNotificationIds = java.lang.String[]
```
## DescribeFpgaImages parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## RunInstances parameterss:

```
- setClientToken = java.lang.String
- withClientToken = java.lang.String
- setInstanceType = com.amazonaws.services.ec2.model.InstanceType
- withInstanceType = com.amazonaws.services.ec2.model.InstanceType
- setTagSpecifications = java.util.Collection<com.amazonaws.services.ec2.model.TagSpecification>
- 	setResourceType = java.lang.String
- 	withResourceType = java.lang.String
- 	setTags = java.util.Collection<com.amazonaws.services.ec2.model.Tag>
- 		withValue = java.lang.String
- 		setKey = java.lang.String
- 		withKey = java.lang.String
- 		setValue = java.lang.String
- 	withTags = com.amazonaws.services.ec2.model.Tag[]
- 		withValue = java.lang.String
- 		setKey = java.lang.String
- 		withKey = java.lang.String
- 		setValue = java.lang.String
```
## CreateLaunchTemplateVersion parameterss:

```
- setClientToken = java.lang.String
- withClientToken = java.lang.String
- setLaunchTemplateId = java.lang.String
- withLaunchTemplateId = java.lang.String
- setSourceVersion = java.lang.String
- withSourceVersion = java.lang.String
- setLaunchTemplateName = java.lang.String
- withLaunchTemplateName = java.lang.String
- setVersionDescription = java.lang.String
- withVersionDescription = java.lang.String
- setLaunchTemplateData = com.amazonaws.services.ec2.model.RequestLaunchTemplateData
- 	setInstanceType = java.lang.String
- 	withInstanceType = java.lang.String
- 	setTagSpecifications = java.util.Collection<com.amazonaws.services.ec2.model.LaunchTemplateTagSpecificationRequest>
- 		setResourceType = java.lang.String
- 		withResourceType = com.amazonaws.services.ec2.model.ResourceType
- 		setTags = java.util.Collection<com.amazonaws.services.ec2.model.Tag>
- 			withValue = java.lang.String
- 			setKey = java.lang.String
- 			withKey = java.lang.String
- 			setValue = java.lang.String
- 		withTags = com.amazonaws.services.ec2.model.Tag[]
- 			withValue = java.lang.String
- 			setKey = java.lang.String
- 			withKey = java.lang.String
- 			setValue = java.lang.String
```
## DescribeVpcPeeringConnections parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## DescribeCapacityReservations parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## DeleteClientVpnRoute parameterss:

```
- setClientVpnEndpointId = java.lang.String
- withClientVpnEndpointId = java.lang.String
- setDestinationCidrBlock = java.lang.String
- withDestinationCidrBlock = java.lang.String
- setTargetVpcSubnetId = java.lang.String
- withTargetVpcSubnetId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeVpcEndpointServicePermissions parameterss:

```
- setServiceId = java.lang.String
- withServiceId = java.lang.String
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## CancelSpotInstanceRequests parameterss:

```
- setSpotInstanceRequestIds = java.util.Collection<java.lang.String>
- withSpotInstanceRequestIds = java.lang.String[]
```
## DescribeHostReservationOfferings parameterss:

```
- setMaxResults = java.lang.Integer
- withMaxResults = java.lang.Integer
- setNextToken = java.lang.String
- withNextToken = java.lang.String
- setFilter = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## ModifyVpcEndpointConnectionNotification parameterss:

```
- setConnectionNotificationArn = java.lang.String
- withConnectionNotificationArn = java.lang.String
- setConnectionEvents = java.util.Collection<java.lang.String>
- withConnectionEvents = java.lang.String[]
```
## AssociateDhcpOptions parameterss:

```
- setVpcId = java.lang.String
- withVpcId = java.lang.String
- setDhcpOptionsId = java.lang.String
- withDhcpOptionsId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## ReplaceNetworkAclEntry parameterss:

```
- withIpv6CidrBlock = java.lang.String
- setCidrBlock = java.lang.String
- setIpv6CidrBlock = java.lang.String
- withCidrBlock = java.lang.String
- withIcmpTypeCode = com.amazonaws.services.ec2.model.IcmpTypeCode
- 	setType = java.lang.Integer
- 	withType = java.lang.Integer
- 	withCode = java.lang.Integer
- 	setCode = java.lang.Integer
- setNetworkAclId = java.lang.String
- withNetworkAclId = java.lang.String
- setPortRange = com.amazonaws.services.ec2.model.PortRange
- 	setFrom = java.lang.Integer
- 	withFrom = java.lang.Integer
- 	setTo = java.lang.Integer
- 	withTo = java.lang.Integer
- withPortRange = com.amazonaws.services.ec2.model.PortRange
- 	setFrom = java.lang.Integer
- 	withFrom = java.lang.Integer
- 	setTo = java.lang.Integer
- 	withTo = java.lang.Integer
- setProtocol = java.lang.String
- withProtocol = java.lang.String
- setRuleAction = com.amazonaws.services.ec2.model.RuleAction
- withRuleAction = com.amazonaws.services.ec2.model.RuleAction
- setRuleNumber = java.lang.Integer
- withRuleNumber = java.lang.Integer
- setEgress = java.lang.Boolean
- withEgress = java.lang.Boolean
- setIcmpTypeCode = com.amazonaws.services.ec2.model.IcmpTypeCode
- 	setType = java.lang.Integer
- 	withType = java.lang.Integer
- 	withCode = java.lang.Integer
- 	setCode = java.lang.Integer
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeFleets parameterss:

```
- setFleetIds = java.util.Collection<java.lang.String>
- withFleetIds = java.lang.String[]
```
## DescribeVpcEndpoints parameterss:

```
- setVpcEndpointIds = java.util.Collection<java.lang.String>
- withVpcEndpointIds = java.lang.String[]
```
## DescribeStaleSecurityGroups parameterss:

```
- setVpcId = java.lang.String
- withVpcId = java.lang.String
- setMaxResults = java.lang.Integer
- withMaxResults = java.lang.Integer
- setNextToken = java.lang.String
- withNextToken = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## CreateVpnConnectionRoute parameterss:

```
- setDestinationCidrBlock = java.lang.String
- withDestinationCidrBlock = java.lang.String
- setVpnConnectionId = java.lang.String
- withVpnConnectionId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeClientVpnAuthorizationRules parameterss:

```
- setClientVpnEndpointId = java.lang.String
- withClientVpnEndpointId = java.lang.String
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## RevokeClientVpnIngress parameterss:

```
- setClientVpnEndpointId = java.lang.String
- withClientVpnEndpointId = java.lang.String
- setTargetNetworkCidr = java.lang.String
- withTargetNetworkCidr = java.lang.String
- setAccessGroupId = java.lang.String
- withAccessGroupId = java.lang.String
- setRevokeAllGroups = java.lang.Boolean
- withRevokeAllGroups = java.lang.Boolean
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeVpcClassicLinkDnsSupport parameterss:

```
- setMaxResults = java.lang.Integer
- withMaxResults = java.lang.Integer
- setNextToken = java.lang.String
- withNextToken = java.lang.String
- setVpcIds = java.util.Collection<java.lang.String>
- withVpcIds = java.lang.String[]
```
## UpdateSecurityGroupRuleDescriptionsEgress parameterss:

```
- setGroupId = java.lang.String
- withGroupId = java.lang.String
- setIpPermissions = java.util.Collection<com.amazonaws.services.ec2.model.IpPermission>
- 	setFromPort = java.lang.Integer
- 	withFromPort = java.lang.Integer
- 	setIpProtocol = java.lang.String
- 	withIpProtocol = java.lang.String
- 	setToPort = java.lang.Integer
- 	withToPort = java.lang.Integer
- 	setPrefixListIds = java.util.Collection<com.amazonaws.services.ec2.model.PrefixListId>
- 		setDescription = java.lang.String
- 		withDescription = java.lang.String
- 		setPrefixListId = java.lang.String
- 		withPrefixListId = java.lang.String
- 	withPrefixListIds = com.amazonaws.services.ec2.model.PrefixListId[]
- 		setDescription = java.lang.String
- 		withDescription = java.lang.String
- 		setPrefixListId = java.lang.String
- 		withPrefixListId = java.lang.String
```
## ModifyInstanceCreditSpecification parameterss:

```
- setClientToken = java.lang.String
- withClientToken = java.lang.String
- setInstanceCreditSpecifications = java.util.Collection<com.amazonaws.services.ec2.model.InstanceCreditSpecificationRequest>
- 	setInstanceId = java.lang.String
- 	withInstanceId = java.lang.String
- 	setCpuCredits = java.lang.String
- 	withCpuCredits = java.lang.String
- withInstanceCreditSpecifications = com.amazonaws.services.ec2.model.InstanceCreditSpecificationRequest[]
```
## RunScheduledInstances parameterss:

```
- setClientToken = java.lang.String
- withClientToken = java.lang.String
- setInstanceCount = java.lang.Integer
- withInstanceCount = java.lang.Integer
- setLaunchSpecification = com.amazonaws.services.ec2.model.ScheduledInstancesLaunchSpecification
- 	setInstanceType = java.lang.String
- 	withInstanceType = java.lang.String
- 	setSecurityGroupIds = java.util.Collection<java.lang.String>
- 	withSecurityGroupIds = java.lang.String[]
```
## ReplaceRoute parameterss:

```
- setVpcPeeringConnectionId = java.lang.String
- withVpcPeeringConnectionId = java.lang.String
- setNetworkInterfaceId = java.lang.String
- withNetworkInterfaceId = java.lang.String
- setRouteTableId = java.lang.String
- withRouteTableId = java.lang.String
- setInstanceId = java.lang.String
- withInstanceId = java.lang.String
- setDestinationCidrBlock = java.lang.String
- withDestinationCidrBlock = java.lang.String
- setGatewayId = java.lang.String
- setDestinationIpv6CidrBlock = java.lang.String
- withDestinationIpv6CidrBlock = java.lang.String
- setEgressOnlyInternetGatewayId = java.lang.String
- withEgressOnlyInternetGatewayId = java.lang.String
- withGatewayId = java.lang.String
- setNatGatewayId = java.lang.String
- withNatGatewayId = java.lang.String
- setTransitGatewayId = java.lang.String
- withTransitGatewayId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DeleteNatGateway parameterss:

```
- setNatGatewayId = java.lang.String
- withNatGatewayId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribePlacementGroups parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## CreateSpotDatafeedSubscription parameterss:

```
- setPrefix = java.lang.String
- withPrefix = java.lang.String
- withBucket = java.lang.String
- setBucket = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## ProvisionByoipCidr parameterss:

```
- setCidr = java.lang.String
- withCidr = java.lang.String
- setDescription = java.lang.String
- withDescription = java.lang.String
- setCidrAuthorizationContext = com.amazonaws.services.ec2.model.CidrAuthorizationContext
- 	withMessage = java.lang.String
- 	setSignature = java.lang.String
- 	setMessage = java.lang.String
- 	withSignature = java.lang.String
- withCidrAuthorizationContext = com.amazonaws.services.ec2.model.CidrAuthorizationContext
- 	withMessage = java.lang.String
- 	setSignature = java.lang.String
- 	setMessage = java.lang.String
- 	withSignature = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeReservedInstancesOfferings parameterss:

```
- setAvailabilityZone = java.lang.String
- withAvailabilityZone = java.lang.String
- setInstanceType = java.lang.String
- withInstanceType = com.amazonaws.services.ec2.model.InstanceType
- setInstanceTenancy = com.amazonaws.services.ec2.model.Tenancy
- withInstanceTenancy = java.lang.String
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## DisassociateClientVpnTargetNetwork parameterss:

```
- setClientVpnEndpointId = java.lang.String
- withClientVpnEndpointId = java.lang.String
- setAssociationId = java.lang.String
- withAssociationId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## CreateTransitGateway parameterss:

```
- setTagSpecifications = java.util.Collection<com.amazonaws.services.ec2.model.TagSpecification>
- 	setResourceType = java.lang.String
- 	withResourceType = java.lang.String
- 	setTags = java.util.Collection<com.amazonaws.services.ec2.model.Tag>
- 		withValue = java.lang.String
- 		setKey = java.lang.String
- 		withKey = java.lang.String
- 		setValue = java.lang.String
- 	withTags = com.amazonaws.services.ec2.model.Tag[]
- 		withValue = java.lang.String
- 		setKey = java.lang.String
- 		withKey = java.lang.String
- 		setValue = java.lang.String
```
## CancelBundleTask parameterss:

```
- setBundleId = java.lang.String
- withBundleId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DetachVpnGateway parameterss:

```
- setVpcId = java.lang.String
- withVpcId = java.lang.String
- setVpnGatewayId = java.lang.String
- withVpnGatewayId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DisableVpcClassicLinkDnsSupport parameterss:

```
- setVpcId = java.lang.String
- withVpcId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeSpotFleetInstances parameterss:

```
- setMaxResults = java.lang.Integer
- withMaxResults = java.lang.Integer
- setNextToken = java.lang.String
- withNextToken = java.lang.String
- setSpotFleetRequestId = java.lang.String
- withSpotFleetRequestId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeFpgaImageAttribute parameterss:

```
- setFpgaImageId = java.lang.String
- withFpgaImageId = java.lang.String
- setAttribute = java.lang.String
- withAttribute = com.amazonaws.services.ec2.model.FpgaImageAttributeName
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeFleetInstances parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## UpdateSecurityGroupRuleDescriptionsIngress parameterss:

```
- setGroupId = java.lang.String
- withGroupId = java.lang.String
- setIpPermissions = java.util.Collection<com.amazonaws.services.ec2.model.IpPermission>
- 	setFromPort = java.lang.Integer
- 	withFromPort = java.lang.Integer
- 	setIpProtocol = java.lang.String
- 	withIpProtocol = java.lang.String
- 	setToPort = java.lang.Integer
- 	withToPort = java.lang.Integer
- 	setPrefixListIds = java.util.Collection<com.amazonaws.services.ec2.model.PrefixListId>
- 		setDescription = java.lang.String
- 		withDescription = java.lang.String
- 		setPrefixListId = java.lang.String
- 		withPrefixListId = java.lang.String
- 	withPrefixListIds = com.amazonaws.services.ec2.model.PrefixListId[]
- 		setDescription = java.lang.String
- 		withDescription = java.lang.String
- 		setPrefixListId = java.lang.String
- 		withPrefixListId = java.lang.String
```
## ReplaceIamInstanceProfileAssociation parameterss:

```
- setIamInstanceProfile = com.amazonaws.services.ec2.model.IamInstanceProfileSpecification
- 	withName = java.lang.String
- 	withArn = java.lang.String
- 	setArn = java.lang.String
- 	setName = java.lang.String
- withIamInstanceProfile = com.amazonaws.services.ec2.model.IamInstanceProfileSpecification
- 	withName = java.lang.String
- 	withArn = java.lang.String
- 	setArn = java.lang.String
- 	setName = java.lang.String
- setAssociationId = java.lang.String
- withAssociationId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DisassociateIamInstanceProfile parameterss:

```
- setAssociationId = java.lang.String
- withAssociationId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## RebootInstances parameterss:

```
- setInstanceIds = java.util.Collection<java.lang.String>
- withInstanceIds = java.lang.String[]
```
## DescribeAggregateIdFormat parameterss:

```
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DetachClassicLinkVpc parameterss:

```
- setVpcId = java.lang.String
- withVpcId = java.lang.String
- setInstanceId = java.lang.String
- withInstanceId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## ModifyFpgaImageAttribute parameterss:

```
- setDescription = java.lang.String
- withDescription = java.lang.String
- withName = java.lang.String
- setFpgaImageId = java.lang.String
- withFpgaImageId = java.lang.String
- setAttribute = java.lang.String
- withAttribute = com.amazonaws.services.ec2.model.FpgaImageAttributeName
- setOperationType = java.lang.String
- withOperationType = com.amazonaws.services.ec2.model.OperationType
- setUserIds = java.util.Collection<java.lang.String>
- withUserIds = java.lang.String[]
```
## DescribeVpcs parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## GetReservedInstancesExchangeQuote parameterss:

```
- withTargetConfigurations = com.amazonaws.services.ec2.model.TargetConfigurationRequest[]
```
## MoveAddressToVpc parameterss:

```
- setPublicIp = java.lang.String
- withPublicIp = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeAddresses parameterss:

```
- withAllocationIds = java.lang.String[]
```
## DescribeTransitGatewayVpcAttachments parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## AuthorizeClientVpnIngress parameterss:

```
- setClientVpnEndpointId = java.lang.String
- withClientVpnEndpointId = java.lang.String
- setTargetNetworkCidr = java.lang.String
- withTargetNetworkCidr = java.lang.String
- setAccessGroupId = java.lang.String
- withAccessGroupId = java.lang.String
- setAuthorizeAllGroups = java.lang.Boolean
- withAuthorizeAllGroups = java.lang.Boolean
- setDescription = java.lang.String
- withDescription = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## StartInstances parameterss:

```
- setInstanceIds = java.util.Collection<java.lang.String>
- withInstanceIds = java.lang.String[]
```
## ModifyCapacityReservation parameterss:

```
- setCapacityReservationId = java.lang.String
- withCapacityReservationId = java.lang.String
- setInstanceCount = java.lang.Integer
- withInstanceCount = java.lang.Integer
- setEndDate = java.util.Date
- 	setDate = int
- 	setHours = int
- 	setMinutes = int
- 	setMonth = int
- 	setSeconds = int
- 	setYear = int
- 	setTime = long
- withEndDate = java.util.Date
- 	setDate = int
- 	setHours = int
- 	setMinutes = int
- 	setMonth = int
- 	setSeconds = int
- 	setYear = int
- 	setTime = long
- setEndDateType = java.lang.String
- withEndDateType = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## CreateSubnet parameterss:

```
- setAvailabilityZone = java.lang.String
- withAvailabilityZone = java.lang.String
- setVpcId = java.lang.String
- withVpcId = java.lang.String
- withIpv6CidrBlock = java.lang.String
- setCidrBlock = java.lang.String
- setIpv6CidrBlock = java.lang.String
- withCidrBlock = java.lang.String
- setAvailabilityZoneId = java.lang.String
- withAvailabilityZoneId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## CreateTransitGatewayRoute parameterss:

```
- withTransitGatewayAttachmentId = java.lang.String
- setTransitGatewayAttachmentId = java.lang.String
- setTransitGatewayRouteTableId = java.lang.String
- withTransitGatewayRouteTableId = java.lang.String
- withBlackhole = java.lang.Boolean
- setDestinationCidrBlock = java.lang.String
- withDestinationCidrBlock = java.lang.String
- setBlackhole = java.lang.Boolean
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DisassociateAddress parameterss:

```
- setPublicIp = java.lang.String
- withPublicIp = java.lang.String
- setAssociationId = java.lang.String
- withAssociationId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DeleteLaunchTemplateVersions parameterss:

```
- setLaunchTemplateId = java.lang.String
- withLaunchTemplateId = java.lang.String
- setLaunchTemplateName = java.lang.String
- withLaunchTemplateName = java.lang.String
- setVersions = java.util.Collection<java.lang.String>
- withVersions = java.lang.String[]
```
## RestoreAddressToClassic parameterss:

```
- setPublicIp = java.lang.String
- withPublicIp = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## AcceptVpcEndpointConnections parameterss:

```
- setServiceId = java.lang.String
- withServiceId = java.lang.String
- setVpcEndpointIds = java.util.Collection<java.lang.String>
- withVpcEndpointIds = java.lang.String[]
```
## DescribeScheduledInstances parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## DeprovisionByoipCidr parameterss:

```
- setCidr = java.lang.String
- withCidr = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeIamInstanceProfileAssociations parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## ImportInstance parameterss:

```
- setDescription = java.lang.String
- withDescription = java.lang.String
- setDiskImages = java.util.Collection<com.amazonaws.services.ec2.model.DiskImage>
- 	setDescription = java.lang.String
- 	withDescription = java.lang.String
- 	setImage = com.amazonaws.services.ec2.model.DiskImageDetail
- 		withBytes = java.lang.Long
- 		setFormat = java.lang.String
- 		setBytes = java.lang.Long
- 		withFormat = com.amazonaws.services.ec2.model.DiskImageFormat
- 		setImportManifestUrl = java.lang.String
- 		withImportManifestUrl = java.lang.String
- 	withImage = com.amazonaws.services.ec2.model.DiskImageDetail
- 		withBytes = java.lang.Long
- 		setFormat = java.lang.String
- 		setBytes = java.lang.Long
- 		withFormat = com.amazonaws.services.ec2.model.DiskImageFormat
- 		setImportManifestUrl = java.lang.String
- 		withImportManifestUrl = java.lang.String
- 	setVolume = com.amazonaws.services.ec2.model.VolumeDetail
- 		withSize = java.lang.Long
- 		setSize = java.lang.Long
- 	withVolume = com.amazonaws.services.ec2.model.VolumeDetail
- 		withSize = java.lang.Long
- 		setSize = java.lang.Long
- withDiskImages = com.amazonaws.services.ec2.model.DiskImage[]
- 	setDescription = java.lang.String
- 	withDescription = java.lang.String
- 	setImage = com.amazonaws.services.ec2.model.DiskImageDetail
- 		withBytes = java.lang.Long
- 		setFormat = java.lang.String
- 		setBytes = java.lang.Long
- 		withFormat = com.amazonaws.services.ec2.model.DiskImageFormat
- 		setImportManifestUrl = java.lang.String
- 		withImportManifestUrl = java.lang.String
- 	withImage = com.amazonaws.services.ec2.model.DiskImageDetail
- 		withBytes = java.lang.Long
- 		setFormat = java.lang.String
- 		setBytes = java.lang.Long
- 		withFormat = com.amazonaws.services.ec2.model.DiskImageFormat
- 		setImportManifestUrl = java.lang.String
- 		withImportManifestUrl = java.lang.String
- 	setVolume = com.amazonaws.services.ec2.model.VolumeDetail
- 		withSize = java.lang.Long
- 		setSize = java.lang.Long
- 	withVolume = com.amazonaws.services.ec2.model.VolumeDetail
- 		withSize = java.lang.Long
- 		setSize = java.lang.Long
```
## DeleteRoute parameterss:

```
- setRouteTableId = java.lang.String
- withRouteTableId = java.lang.String
- setDestinationCidrBlock = java.lang.String
- withDestinationCidrBlock = java.lang.String
- setDestinationIpv6CidrBlock = java.lang.String
- withDestinationIpv6CidrBlock = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeElasticGpus parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## BundleInstance parameterss:

```
- setInstanceId = java.lang.String
- withInstanceId = java.lang.String
- setStorage = com.amazonaws.services.ec2.model.Storage
- 	setS3 = com.amazonaws.services.ec2.model.S3Storage
- 		setPrefix = java.lang.String
- 		withPrefix = java.lang.String
- 		withBucket = java.lang.String
- 		setBucket = java.lang.String
- 		setUploadPolicy = java.lang.String
- 		withUploadPolicy = java.lang.String
- 		setUploadPolicySignature = java.lang.String
- 		withUploadPolicySignature = java.lang.String
- 		setAWSAccessKeyId = java.lang.String
- 		withAWSAccessKeyId = java.lang.String
- 	withS3 = com.amazonaws.services.ec2.model.S3Storage
- 		setPrefix = java.lang.String
- 		withPrefix = java.lang.String
- 		withBucket = java.lang.String
- 		setBucket = java.lang.String
- 		setUploadPolicy = java.lang.String
- 		withUploadPolicy = java.lang.String
- 		setUploadPolicySignature = java.lang.String
- 		withUploadPolicySignature = java.lang.String
- 		setAWSAccessKeyId = java.lang.String
- 		withAWSAccessKeyId = java.lang.String
- withStorage = com.amazonaws.services.ec2.model.Storage
- 	setS3 = com.amazonaws.services.ec2.model.S3Storage
- 		setPrefix = java.lang.String
- 		withPrefix = java.lang.String
- 		withBucket = java.lang.String
- 		setBucket = java.lang.String
- 		setUploadPolicy = java.lang.String
- 		withUploadPolicy = java.lang.String
- 		setUploadPolicySignature = java.lang.String
- 		withUploadPolicySignature = java.lang.String
- 		setAWSAccessKeyId = java.lang.String
- 		withAWSAccessKeyId = java.lang.String
- 	withS3 = com.amazonaws.services.ec2.model.S3Storage
- 		setPrefix = java.lang.String
- 		withPrefix = java.lang.String
- 		withBucket = java.lang.String
- 		setBucket = java.lang.String
- 		setUploadPolicy = java.lang.String
- 		withUploadPolicy = java.lang.String
- 		setUploadPolicySignature = java.lang.String
- 		withUploadPolicySignature = java.lang.String
- 		setAWSAccessKeyId = java.lang.String
- 		withAWSAccessKeyId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DeletePlacementGroup parameterss:

```
- setGroupName = java.lang.String
- withGroupName = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeClientVpnTargetNetworks parameterss:

```
- setClientVpnEndpointId = java.lang.String
- withClientVpnEndpointId = java.lang.String
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## DisassociateVpcCidrBlock parameterss:

```
- setAssociationId = java.lang.String
- withAssociationId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DisableVgwRoutePropagation parameterss:

```
- setRouteTableId = java.lang.String
- withRouteTableId = java.lang.String
- setGatewayId = java.lang.String
- withGatewayId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## CreateNetworkAclEntry parameterss:

```
- withIpv6CidrBlock = java.lang.String
- setCidrBlock = java.lang.String
- setIpv6CidrBlock = java.lang.String
- withCidrBlock = java.lang.String
- withIcmpTypeCode = com.amazonaws.services.ec2.model.IcmpTypeCode
- 	setType = java.lang.Integer
- 	withType = java.lang.Integer
- 	withCode = java.lang.Integer
- 	setCode = java.lang.Integer
- setNetworkAclId = java.lang.String
- withNetworkAclId = java.lang.String
- setPortRange = com.amazonaws.services.ec2.model.PortRange
- 	setFrom = java.lang.Integer
- 	withFrom = java.lang.Integer
- 	setTo = java.lang.Integer
- 	withTo = java.lang.Integer
- withPortRange = com.amazonaws.services.ec2.model.PortRange
- 	setFrom = java.lang.Integer
- 	withFrom = java.lang.Integer
- 	setTo = java.lang.Integer
- 	withTo = java.lang.Integer
- setProtocol = java.lang.String
- withProtocol = java.lang.String
- setRuleAction = com.amazonaws.services.ec2.model.RuleAction
- withRuleAction = com.amazonaws.services.ec2.model.RuleAction
- setRuleNumber = java.lang.Integer
- withRuleNumber = java.lang.Integer
- setEgress = java.lang.Boolean
- withEgress = java.lang.Boolean
- setIcmpTypeCode = com.amazonaws.services.ec2.model.IcmpTypeCode
- 	setType = java.lang.Integer
- 	withType = java.lang.Integer
- 	withCode = java.lang.Integer
- 	setCode = java.lang.Integer
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## AuthorizeSecurityGroupIngress parameterss:

```
- setGroupId = java.lang.String
- withGroupId = java.lang.String
- setIpPermissions = java.util.Collection<com.amazonaws.services.ec2.model.IpPermission>
- 	setFromPort = java.lang.Integer
- 	withFromPort = java.lang.Integer
- 	setIpProtocol = java.lang.String
- 	withIpProtocol = java.lang.String
- 	setToPort = java.lang.Integer
- 	withToPort = java.lang.Integer
- 	setPrefixListIds = java.util.Collection<com.amazonaws.services.ec2.model.PrefixListId>
- 		setDescription = java.lang.String
- 		withDescription = java.lang.String
- 		setPrefixListId = java.lang.String
- 		withPrefixListId = java.lang.String
- 	withPrefixListIds = com.amazonaws.services.ec2.model.PrefixListId[]
- 		setDescription = java.lang.String
- 		withDescription = java.lang.String
- 		setPrefixListId = java.lang.String
- 		withPrefixListId = java.lang.String
```
## DeleteCustomerGateway parameterss:

```
- setCustomerGatewayId = java.lang.String
- withCustomerGatewayId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## CreateFlowLogs parameterss:

```
- setClientToken = java.lang.String
- withClientToken = java.lang.String
- setDeliverLogsPermissionArn = java.lang.String
- withDeliverLogsPermissionArn = java.lang.String
- setLogGroupName = java.lang.String
- withLogGroupName = java.lang.String
- setResourceIds = java.util.Collection<java.lang.String>
- withResourceIds = java.lang.String[]
```
## ModifyClientVpnEndpoint parameterss:

```
- setClientVpnEndpointId = java.lang.String
- withClientVpnEndpointId = java.lang.String
- setDescription = java.lang.String
- withDescription = java.lang.String
- setServerCertificateArn = java.lang.String
- withServerCertificateArn = java.lang.String
- setConnectionLogOptions = com.amazonaws.services.ec2.model.ConnectionLogOptions
- 	setEnabled = java.lang.Boolean
- 	withEnabled = java.lang.Boolean
- 	setCloudwatchLogGroup = java.lang.String
- 	withCloudwatchLogGroup = java.lang.String
- 	setCloudwatchLogStream = java.lang.String
- 	withCloudwatchLogStream = java.lang.String
- withConnectionLogOptions = com.amazonaws.services.ec2.model.ConnectionLogOptions
- 	setEnabled = java.lang.Boolean
- 	withEnabled = java.lang.Boolean
- 	setCloudwatchLogGroup = java.lang.String
- 	withCloudwatchLogGroup = java.lang.String
- 	setCloudwatchLogStream = java.lang.String
- 	withCloudwatchLogStream = java.lang.String
- setDnsServers = com.amazonaws.services.ec2.model.DnsServersOptionsModifyStructure
- 	setEnabled = java.lang.Boolean
- 	withEnabled = java.lang.Boolean
- 	setCustomDnsServers = java.util.Collection<java.lang.String>
- 	withCustomDnsServers = java.lang.String[]
```
## DescribeNetworkInterfaceAttribute parameterss:

```
- setNetworkInterfaceId = java.lang.String
- withNetworkInterfaceId = java.lang.String
- setAttribute = java.lang.String
- withAttribute = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## CancelCapacityReservation parameterss:

```
- setCapacityReservationId = java.lang.String
- withCapacityReservationId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeConversionTasks parameterss:

```
- setConversionTaskIds = java.util.Collection<java.lang.String>
- withConversionTaskIds = java.lang.String[]
```
## DescribeClientVpnConnections parameterss:

```
- setClientVpnEndpointId = java.lang.String
- withClientVpnEndpointId = java.lang.String
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## DescribeCustomerGateways parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## DescribeSpotFleetRequests parameterss:

```
- setSpotFleetRequestIds = java.util.Collection<java.lang.String>
- withSpotFleetRequestIds = java.lang.String[]
```
## ModifySpotFleetRequest parameterss:

```
- setExcessCapacityTerminationPolicy = java.lang.String
- withExcessCapacityTerminationPolicy = java.lang.String
- setSpotFleetRequestId = java.lang.String
- withSpotFleetRequestId = java.lang.String
- setTargetCapacity = java.lang.Integer
- withTargetCapacity = java.lang.Integer
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## CreateFleet parameterss:

```
- setClientToken = java.lang.String
- withClientToken = java.lang.String
- setTagSpecifications = java.util.Collection<com.amazonaws.services.ec2.model.TagSpecification>
- 	setResourceType = java.lang.String
- 	withResourceType = java.lang.String
- 	setTags = java.util.Collection<com.amazonaws.services.ec2.model.Tag>
- 		withValue = java.lang.String
- 		setKey = java.lang.String
- 		withKey = java.lang.String
- 		setValue = java.lang.String
- 	withTags = com.amazonaws.services.ec2.model.Tag[]
- 		withValue = java.lang.String
- 		setKey = java.lang.String
- 		withKey = java.lang.String
- 		setValue = java.lang.String
```
## DeleteClientVpnEndpoint parameterss:

```
- setClientVpnEndpointId = java.lang.String
- withClientVpnEndpointId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## ModifyTransitGatewayVpcAttachment parameterss:

```
- withTransitGatewayAttachmentId = java.lang.String
- setTransitGatewayAttachmentId = java.lang.String
- setOptions = com.amazonaws.services.ec2.model.ModifyTransitGatewayVpcAttachmentRequestOptions
- 	withDnsSupport = com.amazonaws.services.ec2.model.DnsSupportValue
- 	setIpv6Support = java.lang.String
- 	withIpv6Support = java.lang.String
- 	setDnsSupport = java.lang.String
- withOptions = com.amazonaws.services.ec2.model.ModifyTransitGatewayVpcAttachmentRequestOptions
- 	withDnsSupport = com.amazonaws.services.ec2.model.DnsSupportValue
- 	setIpv6Support = java.lang.String
- 	withIpv6Support = java.lang.String
- 	setDnsSupport = java.lang.String
- setAddSubnetIds = java.util.Collection<java.lang.String>
- withAddSubnetIds = java.lang.String[]
```
## DescribeNetworkInterfacePermissions parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## DescribeVolumesModifications parameterss:

```
- withVolumeIds = java.lang.String[]
```
## DetachInternetGateway parameterss:

```
- setVpcId = java.lang.String
- withVpcId = java.lang.String
- setInternetGatewayId = java.lang.String
- withInternetGatewayId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DeleteVpc parameterss:

```
- setVpcId = java.lang.String
- withVpcId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## RequestSpotFleet parameterss:

```
- setSpotFleetRequestConfig = com.amazonaws.services.ec2.model.SpotFleetRequestConfigData
- 	setClientToken = java.lang.String
- 	withClientToken = java.lang.String
- 	setExcessCapacityTerminationPolicy = com.amazonaws.services.ec2.model.ExcessCapacityTerminationPolicy
- 	withExcessCapacityTerminationPolicy = com.amazonaws.services.ec2.model.ExcessCapacityTerminationPolicy
- 	setType = com.amazonaws.services.ec2.model.FleetType
- 	withType = com.amazonaws.services.ec2.model.FleetType
- 	setLaunchTemplateConfigs = java.util.Collection<com.amazonaws.services.ec2.model.LaunchTemplateConfig>
- 		setLaunchTemplateSpecification = com.amazonaws.services.ec2.model.FleetLaunchTemplateSpecification
- 			setLaunchTemplateId = java.lang.String
- 			withLaunchTemplateId = java.lang.String
- 			setLaunchTemplateName = java.lang.String
- 			withLaunchTemplateName = java.lang.String
- 			setVersion = java.lang.String
- 			withVersion = java.lang.String
- 		withLaunchTemplateSpecification = com.amazonaws.services.ec2.model.FleetLaunchTemplateSpecification
- 			setLaunchTemplateId = java.lang.String
- 			withLaunchTemplateId = java.lang.String
- 			setLaunchTemplateName = java.lang.String
- 			withLaunchTemplateName = java.lang.String
- 			setVersion = java.lang.String
- 			withVersion = java.lang.String
- 		setOverrides = java.util.Collection<com.amazonaws.services.ec2.model.LaunchTemplateOverrides>
- 			setAvailabilityZone = java.lang.String
- 			withAvailabilityZone = java.lang.String
- 			setInstanceType = java.lang.String
- 			withInstanceType = java.lang.String
- 			setSubnetId = java.lang.String
- 			withSubnetId = java.lang.String
- 			setSpotPrice = java.lang.String
- 			withSpotPrice = java.lang.String
- 			setWeightedCapacity = java.lang.Double
- 			withWeightedCapacity = java.lang.Double
- 			withPriority = java.lang.Double
- 			setPriority = java.lang.Double
- 		withOverrides = com.amazonaws.services.ec2.model.LaunchTemplateOverrides[]
- 			setAvailabilityZone = java.lang.String
- 			withAvailabilityZone = java.lang.String
- 			setInstanceType = java.lang.String
- 			withInstanceType = java.lang.String
- 			setSubnetId = java.lang.String
- 			withSubnetId = java.lang.String
- 			setSpotPrice = java.lang.String
- 			withSpotPrice = java.lang.String
- 			setWeightedCapacity = java.lang.Double
- 			withWeightedCapacity = java.lang.Double
- 			withPriority = java.lang.Double
- 			setPriority = java.lang.Double
```
## StopInstances parameterss:

```
- withForce = java.lang.Boolean
- setForce = java.lang.Boolean
- setInstanceIds = java.util.Collection<java.lang.String>
- withInstanceIds = java.lang.String[]
```
## EnableTransitGatewayRouteTablePropagation parameterss:

```
- withTransitGatewayAttachmentId = java.lang.String
- setTransitGatewayAttachmentId = java.lang.String
- setTransitGatewayRouteTableId = java.lang.String
- withTransitGatewayRouteTableId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeExportTasks parameterss:

```
- setExportTaskIds = java.util.Collection<java.lang.String>
- withExportTaskIds = java.lang.String[]
```
## CreateRouteTable parameterss:

```
- setVpcId = java.lang.String
- withVpcId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## AssociateAddress parameterss:

```
- setNetworkInterfaceId = java.lang.String
- withNetworkInterfaceId = java.lang.String
- setAllocationId = java.lang.String
- withAllowReassociation = java.lang.Boolean
- setPrivateIpAddress = java.lang.String
- withPrivateIpAddress = java.lang.String
- withAllocationId = java.lang.String
- setInstanceId = java.lang.String
- withInstanceId = java.lang.String
- setPublicIp = java.lang.String
- withPublicIp = java.lang.String
- setAllowReassociation = java.lang.Boolean
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## CreateCustomerGateway parameterss:

```
- setPublicIp = java.lang.String
- withPublicIp = java.lang.String
- setBgpAsn = java.lang.Integer
- withBgpAsn = java.lang.Integer
- setType = java.lang.String
- withType = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeReservedInstancesListings parameterss:

```
- setReservedInstancesListingId = java.lang.String
- withReservedInstancesListingId = java.lang.String
- setReservedInstancesId = java.lang.String
- withReservedInstancesId = java.lang.String
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## DescribePublicIpv4Pools parameterss:

```
- setMaxResults = java.lang.Integer
- withMaxResults = java.lang.Integer
- setNextToken = java.lang.String
- withNextToken = java.lang.String
- setPoolIds = java.util.Collection<java.lang.String>
- withPoolIds = java.lang.String[]
```
## DescribeTags parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## DeleteEgressOnlyInternetGateway parameterss:

```
- setEgressOnlyInternetGatewayId = java.lang.String
- withEgressOnlyInternetGatewayId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DeleteDhcpOptions parameterss:

```
- setDhcpOptionsId = java.lang.String
- withDhcpOptionsId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeImages parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## AuthorizeSecurityGroupEgress parameterss:

```
- setGroupId = java.lang.String
- withGroupId = java.lang.String
- setIpPermissions = java.util.Collection<com.amazonaws.services.ec2.model.IpPermission>
- 	setFromPort = java.lang.Integer
- 	withFromPort = java.lang.Integer
- 	setIpProtocol = java.lang.String
- 	withIpProtocol = java.lang.String
- 	setToPort = java.lang.Integer
- 	withToPort = java.lang.Integer
- 	setPrefixListIds = java.util.Collection<com.amazonaws.services.ec2.model.PrefixListId>
- 		setDescription = java.lang.String
- 		withDescription = java.lang.String
- 		setPrefixListId = java.lang.String
- 		withPrefixListId = java.lang.String
- 	withPrefixListIds = com.amazonaws.services.ec2.model.PrefixListId[]
- 		setDescription = java.lang.String
- 		withDescription = java.lang.String
- 		setPrefixListId = java.lang.String
- 		withPrefixListId = java.lang.String
```
## ImportImage parameterss:

```
- setClientToken = java.lang.String
- withClientToken = java.lang.String
- setDescription = java.lang.String
- withDescription = java.lang.String
- setEncrypted = java.lang.Boolean
- withEncrypted = java.lang.Boolean
- setKmsKeyId = java.lang.String
- withKmsKeyId = java.lang.String
- setArchitecture = java.lang.String
- withArchitecture = java.lang.String
- setClientData = com.amazonaws.services.ec2.model.ClientData
- 	setComment = java.lang.String
- 	withComment = java.lang.String
- 	setUploadEnd = java.util.Date
- 		setDate = int
- 		setHours = int
- 		setMinutes = int
- 		setMonth = int
- 		setSeconds = int
- 		setYear = int
- 		setTime = long
- 	withUploadEnd = java.util.Date
- 		setDate = int
- 		setHours = int
- 		setMinutes = int
- 		setMonth = int
- 		setSeconds = int
- 		setYear = int
- 		setTime = long
- 	setUploadSize = java.lang.Double
- 	withUploadSize = java.lang.Double
- 	setUploadStart = java.util.Date
- 		setDate = int
- 		setHours = int
- 		setMinutes = int
- 		setMonth = int
- 		setSeconds = int
- 		setYear = int
- 		setTime = long
- 	withUploadStart = java.util.Date
- 		setDate = int
- 		setHours = int
- 		setMinutes = int
- 		setMonth = int
- 		setSeconds = int
- 		setYear = int
- 		setTime = long
- withClientData = com.amazonaws.services.ec2.model.ClientData
- 	setComment = java.lang.String
- 	withComment = java.lang.String
- 	setUploadEnd = java.util.Date
- 		setDate = int
- 		setHours = int
- 		setMinutes = int
- 		setMonth = int
- 		setSeconds = int
- 		setYear = int
- 		setTime = long
- 	withUploadEnd = java.util.Date
- 		setDate = int
- 		setHours = int
- 		setMinutes = int
- 		setMonth = int
- 		setSeconds = int
- 		setYear = int
- 		setTime = long
- 	setUploadSize = java.lang.Double
- 	withUploadSize = java.lang.Double
- 	setUploadStart = java.util.Date
- 		setDate = int
- 		setHours = int
- 		setMinutes = int
- 		setMonth = int
- 		setSeconds = int
- 		setYear = int
- 		setTime = long
- 	withUploadStart = java.util.Date
- 		setDate = int
- 		setHours = int
- 		setMinutes = int
- 		setMonth = int
- 		setSeconds = int
- 		setYear = int
- 		setTime = long
- setDiskContainers = java.util.Collection<com.amazonaws.services.ec2.model.ImageDiskContainer>
- 	setDescription = java.lang.String
- 	withDescription = java.lang.String
- 	setSnapshotId = java.lang.String
- 	withSnapshotId = java.lang.String
- 	setDeviceName = java.lang.String
- 	withDeviceName = java.lang.String
- 	setFormat = java.lang.String
- 	withFormat = java.lang.String
- 	withUserBucket = com.amazonaws.services.ec2.model.UserBucket
- 		setS3Bucket = java.lang.String
- 		withS3Bucket = java.lang.String
- 		withS3Key = java.lang.String
- 		setS3Key = java.lang.String
- 	setUrl = java.lang.String
- 	withUrl = java.lang.String
- 	setUserBucket = com.amazonaws.services.ec2.model.UserBucket
- 		setS3Bucket = java.lang.String
- 		withS3Bucket = java.lang.String
- 		withS3Key = java.lang.String
- 		setS3Key = java.lang.String
- withDiskContainers = com.amazonaws.services.ec2.model.ImageDiskContainer[]
```
## RejectVpcEndpointConnections parameterss:

```
- setServiceId = java.lang.String
- withServiceId = java.lang.String
- setVpcEndpointIds = java.util.Collection<java.lang.String>
- withVpcEndpointIds = java.lang.String[]
```
## DeleteVpcPeeringConnection parameterss:

```
- setVpcPeeringConnectionId = java.lang.String
- withVpcPeeringConnectionId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## ModifyVpcEndpointServiceConfiguration parameterss:

```
- setServiceId = java.lang.String
- withServiceId = java.lang.String
- setAcceptanceRequired = java.lang.Boolean
- withAcceptanceRequired = java.lang.Boolean
- withRemoveNetworkLoadBalancerArns = java.lang.String[]
```
## ReleaseAddress parameterss:

```
- setAllocationId = java.lang.String
- withAllocationId = java.lang.String
- setPublicIp = java.lang.String
- withPublicIp = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## GetTransitGatewayAttachmentPropagations parameterss:

```
- withTransitGatewayAttachmentId = java.lang.String
- setTransitGatewayAttachmentId = java.lang.String
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## ResetNetworkInterfaceAttribute parameterss:

```
- setNetworkInterfaceId = java.lang.String
- withNetworkInterfaceId = java.lang.String
- setSourceDestCheck = java.lang.String
- withSourceDestCheck = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## CopyImage parameterss:

```
- setClientToken = java.lang.String
- withClientToken = java.lang.String
- setDescription = java.lang.String
- withDescription = java.lang.String
- withName = java.lang.String
- setSourceRegion = java.lang.String
- withSourceRegion = java.lang.String
- setEncrypted = java.lang.Boolean
- withEncrypted = java.lang.Boolean
- setKmsKeyId = java.lang.String
- withKmsKeyId = java.lang.String
- setSourceImageId = java.lang.String
- withSourceImageId = java.lang.String
- setName = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## CreateVpc parameterss:

```
- setAmazonProvidedIpv6CidrBlock = java.lang.Boolean
- setCidrBlock = java.lang.String
- withAmazonProvidedIpv6CidrBlock = java.lang.Boolean
- withCidrBlock = java.lang.String
- setInstanceTenancy = com.amazonaws.services.ec2.model.Tenancy
- withInstanceTenancy = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeHostReservations parameterss:

```
- setMaxResults = java.lang.Integer
- withMaxResults = java.lang.Integer
- setNextToken = java.lang.String
- withNextToken = java.lang.String
- setFilter = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## CreateTags parameterss:

```
- setResources = java.util.Collection<java.lang.String>
- withResources = java.lang.String[]
```
## DeleteNetworkAcl parameterss:

```
- setNetworkAclId = java.lang.String
- withNetworkAclId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## CreateSnapshot parameterss:

```
- setTagSpecifications = java.util.Collection<com.amazonaws.services.ec2.model.TagSpecification>
- 	setResourceType = java.lang.String
- 	withResourceType = java.lang.String
- 	setTags = java.util.Collection<com.amazonaws.services.ec2.model.Tag>
- 		withValue = java.lang.String
- 		setKey = java.lang.String
- 		withKey = java.lang.String
- 		setValue = java.lang.String
- 	withTags = com.amazonaws.services.ec2.model.Tag[]
- 		withValue = java.lang.String
- 		setKey = java.lang.String
- 		withKey = java.lang.String
- 		setValue = java.lang.String
```
## DescribeClientVpnEndpoints parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## ImportVolume parameterss:

```
- setAvailabilityZone = java.lang.String
- withAvailabilityZone = java.lang.String
- setDescription = java.lang.String
- withDescription = java.lang.String
- setImage = com.amazonaws.services.ec2.model.DiskImageDetail
- 	withBytes = java.lang.Long
- 	setFormat = java.lang.String
- 	setBytes = java.lang.Long
- 	withFormat = com.amazonaws.services.ec2.model.DiskImageFormat
- 	setImportManifestUrl = java.lang.String
- 	withImportManifestUrl = java.lang.String
- withImage = com.amazonaws.services.ec2.model.DiskImageDetail
- 	withBytes = java.lang.Long
- 	setFormat = java.lang.String
- 	setBytes = java.lang.Long
- 	withFormat = com.amazonaws.services.ec2.model.DiskImageFormat
- 	setImportManifestUrl = java.lang.String
- 	withImportManifestUrl = java.lang.String
- setVolume = com.amazonaws.services.ec2.model.VolumeDetail
- 	withSize = java.lang.Long
- 	setSize = java.lang.Long
- withVolume = com.amazonaws.services.ec2.model.VolumeDetail
- 	withSize = java.lang.Long
- 	setSize = java.lang.Long
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DeleteKeyPair parameterss:

```
- withKeyName = java.lang.String
- setKeyName = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeImageAttribute parameterss:

```
- setImageId = java.lang.String
- withImageId = java.lang.String
- setAttribute = java.lang.String
- withAttribute = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## ModifyVpcTenancy parameterss:

```
- setVpcId = java.lang.String
- withVpcId = java.lang.String
- setInstanceTenancy = java.lang.String
- withInstanceTenancy = com.amazonaws.services.ec2.model.VpcTenancy
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DeleteVpnGateway parameterss:

```
- setVpnGatewayId = java.lang.String
- withVpnGatewayId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## SearchTransitGatewayRoutes parameterss:

```
- setTransitGatewayRouteTableId = java.lang.String
- withTransitGatewayRouteTableId = java.lang.String
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## UnassignPrivateIpAddresses parameterss:

```
- setNetworkInterfaceId = java.lang.String
- withNetworkInterfaceId = java.lang.String
- setPrivateIpAddresses = java.util.Collection<java.lang.String>
- withPrivateIpAddresses = java.lang.String[]
```
## DeleteFleets parameterss:

```
- setTerminateInstances = java.lang.Boolean
- withTerminateInstances = java.lang.Boolean
- setFleetIds = java.util.Collection<java.lang.String>
- withFleetIds = java.lang.String[]
```
## CreateTransitGatewayRouteTable parameterss:

```
- setTagSpecifications = java.util.Collection<com.amazonaws.services.ec2.model.TagSpecification>
- 	setResourceType = java.lang.String
- 	withResourceType = java.lang.String
- 	setTags = java.util.Collection<com.amazonaws.services.ec2.model.Tag>
- 		withValue = java.lang.String
- 		setKey = java.lang.String
- 		withKey = java.lang.String
- 		setValue = java.lang.String
- 	withTags = com.amazonaws.services.ec2.model.Tag[]
- 		withValue = java.lang.String
- 		setKey = java.lang.String
- 		withKey = java.lang.String
- 		setValue = java.lang.String
```
## DescribeImportImageTasks parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## DisableTransitGatewayRouteTablePropagation parameterss:

```
- withTransitGatewayAttachmentId = java.lang.String
- setTransitGatewayAttachmentId = java.lang.String
- setTransitGatewayRouteTableId = java.lang.String
- withTransitGatewayRouteTableId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## AssociateVpcCidrBlock parameterss:

```
- setVpcId = java.lang.String
- withVpcId = java.lang.String
- setAmazonProvidedIpv6CidrBlock = java.lang.Boolean
- setCidrBlock = java.lang.String
- withAmazonProvidedIpv6CidrBlock = java.lang.Boolean
- withCidrBlock = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## ExportClientVpnClientCertificateRevocationList parameterss:

```
- setClientVpnEndpointId = java.lang.String
- withClientVpnEndpointId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## ImportKeyPair parameterss:

```
- withKeyName = java.lang.String
- setKeyName = java.lang.String
- withPublicKeyMaterial = java.lang.String
- setPublicKeyMaterial = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## AcceptVpcPeeringConnection parameterss:

```
- setVpcPeeringConnectionId = java.lang.String
- withVpcPeeringConnectionId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## AssociateTransitGatewayRouteTable parameterss:

```
- withTransitGatewayAttachmentId = java.lang.String
- setTransitGatewayAttachmentId = java.lang.String
- setTransitGatewayRouteTableId = java.lang.String
- withTransitGatewayRouteTableId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DeleteLaunchTemplate parameterss:

```
- setLaunchTemplateId = java.lang.String
- withLaunchTemplateId = java.lang.String
- setLaunchTemplateName = java.lang.String
- withLaunchTemplateName = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeVpnConnections parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## ModifyVpcEndpoint parameterss:

```
- setVpcEndpointId = java.lang.String
- setPolicyDocument = java.lang.String
- withPolicyDocument = java.lang.String
- setPrivateDnsEnabled = java.lang.Boolean
- withPrivateDnsEnabled = java.lang.Boolean
- withVpcEndpointId = java.lang.String
- setResetPolicy = java.lang.Boolean
- withResetPolicy = java.lang.Boolean
- setAddRouteTableIds = java.util.Collection<java.lang.String>
- withAddRouteTableIds = java.lang.String[]
```
## TerminateClientVpnConnections parameterss:

```
- setClientVpnEndpointId = java.lang.String
- withClientVpnEndpointId = java.lang.String
- setConnectionId = java.lang.String
- withConnectionId = java.lang.String
- setUsername = java.lang.String
- withUsername = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## CreateImage parameterss:

```
- setInstanceId = java.lang.String
- withInstanceId = java.lang.String
- setDescription = java.lang.String
- withDescription = java.lang.String
- withName = java.lang.String
- setBlockDeviceMappings = java.util.Collection<com.amazonaws.services.ec2.model.BlockDeviceMapping>
- 	setDeviceName = java.lang.String
- 	withDeviceName = java.lang.String
- 	setEbs = com.amazonaws.services.ec2.model.EbsBlockDevice
- 		setEncrypted = java.lang.Boolean
- 		withEncrypted = java.lang.Boolean
- 		setKmsKeyId = java.lang.String
- 		withKmsKeyId = java.lang.String
- 		setIops = java.lang.Integer
- 		withIops = java.lang.Integer
- 		setSnapshotId = java.lang.String
- 		withSnapshotId = java.lang.String
- 		setVolumeType = com.amazonaws.services.ec2.model.VolumeType
- 		withVolumeType = java.lang.String
- 		setVolumeSize = java.lang.Integer
- 		withVolumeSize = java.lang.Integer
- 		setDeleteOnTermination = java.lang.Boolean
- 		withDeleteOnTermination = java.lang.Boolean
- 	withEbs = com.amazonaws.services.ec2.model.EbsBlockDevice
- 		setEncrypted = java.lang.Boolean
- 		withEncrypted = java.lang.Boolean
- 		setKmsKeyId = java.lang.String
- 		withKmsKeyId = java.lang.String
- 		setIops = java.lang.Integer
- 		withIops = java.lang.Integer
- 		setSnapshotId = java.lang.String
- 		withSnapshotId = java.lang.String
- 		setVolumeType = com.amazonaws.services.ec2.model.VolumeType
- 		withVolumeType = java.lang.String
- 		setVolumeSize = java.lang.Integer
- 		withVolumeSize = java.lang.Integer
- 		setDeleteOnTermination = java.lang.Boolean
- 		withDeleteOnTermination = java.lang.Boolean
- 	setNoDevice = java.lang.String
- 	withNoDevice = java.lang.String
- 	setVirtualName = java.lang.String
- 	withVirtualName = java.lang.String
- withBlockDeviceMappings = com.amazonaws.services.ec2.model.BlockDeviceMapping[]
```
## CancelImportTask parameterss:

```
- setCancelReason = java.lang.String
- withCancelReason = java.lang.String
- setImportTaskId = java.lang.String
- withImportTaskId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## CancelConversionTask parameterss:

```
- setConversionTaskId = java.lang.String
- withConversionTaskId = java.lang.String
- withReasonMessage = java.lang.String
- setReasonMessage = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeInstanceAttribute parameterss:

```
- setInstanceId = java.lang.String
- withInstanceId = java.lang.String
- setAttribute = java.lang.String
- withAttribute = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeSpotFleetRequestHistory parameterss:

```
- setMaxResults = java.lang.Integer
- withMaxResults = java.lang.Integer
- setNextToken = java.lang.String
- withNextToken = java.lang.String
- setEventType = java.lang.String
- withEventType = com.amazonaws.services.ec2.model.EventType
- setStartTime = java.util.Date
- 	setDate = int
- 	setHours = int
- 	setMinutes = int
- 	setMonth = int
- 	setSeconds = int
- 	setYear = int
- 	setTime = long
- withStartTime = java.util.Date
- 	setDate = int
- 	setHours = int
- 	setMinutes = int
- 	setMonth = int
- 	setSeconds = int
- 	setYear = int
- 	setTime = long
- setSpotFleetRequestId = java.lang.String
- withSpotFleetRequestId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## ModifyImageAttribute parameterss:

```
- setDescription = java.lang.String
- withDescription = java.lang.String
- setImageId = java.lang.String
- withImageId = java.lang.String
- setAttribute = java.lang.String
- withAttribute = java.lang.String
- setOperationType = com.amazonaws.services.ec2.model.OperationType
- withOperationType = java.lang.String
- setUserIds = java.util.Collection<java.lang.String>
- withUserIds = java.lang.String[]
```
## DescribeInstanceStatus parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## AcceptTransitGatewayVpcAttachment parameterss:

```
- withTransitGatewayAttachmentId = java.lang.String
- setTransitGatewayAttachmentId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## CreateVpcEndpoint parameterss:

```
- setClientToken = java.lang.String
- withClientToken = java.lang.String
- setVpcId = java.lang.String
- withVpcId = java.lang.String
- setSecurityGroupIds = java.util.Collection<java.lang.String>
- withSecurityGroupIds = java.lang.String[]
```
## DeleteTransitGatewayRoute parameterss:

```
- setTransitGatewayRouteTableId = java.lang.String
- withTransitGatewayRouteTableId = java.lang.String
- setDestinationCidrBlock = java.lang.String
- withDestinationCidrBlock = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeNatGateways parameterss:

```
- setMaxResults = java.lang.Integer
- withMaxResults = java.lang.Integer
- setNextToken = java.lang.String
- withNextToken = java.lang.String
- setFilter = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## RejectTransitGatewayVpcAttachment parameterss:

```
- withTransitGatewayAttachmentId = java.lang.String
- setTransitGatewayAttachmentId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## ModifyVolume parameterss:

```
- setVolumeId = java.lang.String
- withVolumeId = java.lang.String
- setIops = java.lang.Integer
- withIops = java.lang.Integer
- withSize = java.lang.Integer
- setVolumeType = java.lang.String
- withVolumeType = java.lang.String
- setSize = java.lang.Integer
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## AssociateIamInstanceProfile parameterss:

```
- setIamInstanceProfile = com.amazonaws.services.ec2.model.IamInstanceProfileSpecification
- 	withName = java.lang.String
- 	withArn = java.lang.String
- 	setArn = java.lang.String
- 	setName = java.lang.String
- withIamInstanceProfile = com.amazonaws.services.ec2.model.IamInstanceProfileSpecification
- 	withName = java.lang.String
- 	withArn = java.lang.String
- 	setArn = java.lang.String
- 	setName = java.lang.String
- setInstanceId = java.lang.String
- withInstanceId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## ResetImageAttribute parameterss:

```
- setImageId = java.lang.String
- withImageId = java.lang.String
- setAttribute = java.lang.String
- withAttribute = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeVpcAttribute parameterss:

```
- setVpcId = java.lang.String
- withVpcId = java.lang.String
- setAttribute = java.lang.String
- withAttribute = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## CreateVpnConnection parameterss:

```
- setVpnGatewayId = java.lang.String
- withVpnGatewayId = java.lang.String
- setType = java.lang.String
- withType = java.lang.String
- setOptions = com.amazonaws.services.ec2.model.VpnConnectionOptionsSpecification
- 	setStaticRoutesOnly = java.lang.Boolean
- 	withStaticRoutesOnly = java.lang.Boolean
- 	setTunnelOptions = java.util.Collection<com.amazonaws.services.ec2.model.VpnTunnelOptionsSpecification>
- 		withTunnelInsideCidr = java.lang.String
- 		setPreSharedKey = java.lang.String
- 		withPreSharedKey = java.lang.String
- 		setTunnelInsideCidr = java.lang.String
- 	withTunnelOptions = com.amazonaws.services.ec2.model.VpnTunnelOptionsSpecification[]
- 		withTunnelInsideCidr = java.lang.String
- 		setPreSharedKey = java.lang.String
- 		withPreSharedKey = java.lang.String
- 		setTunnelInsideCidr = java.lang.String
```
## RejectVpcPeeringConnection parameterss:

```
- setVpcPeeringConnectionId = java.lang.String
- withVpcPeeringConnectionId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeVolumes parameterss:

```
- withVolumeIds = java.lang.String[]
```
## DeleteVpnConnection parameterss:

```
- setVpnConnectionId = java.lang.String
- withVpnConnectionId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeFleetHistory parameterss:

```
- setMaxResults = java.lang.Integer
- withMaxResults = java.lang.Integer
- setNextToken = java.lang.String
- withNextToken = java.lang.String
- setEventType = java.lang.String
- withEventType = java.lang.String
- setFleetId = java.lang.String
- withFleetId = java.lang.String
- setStartTime = java.util.Date
- 	setDate = int
- 	setHours = int
- 	setMinutes = int
- 	setMonth = int
- 	setSeconds = int
- 	setYear = int
- 	setTime = long
- withStartTime = java.util.Date
- 	setDate = int
- 	setHours = int
- 	setMinutes = int
- 	setMonth = int
- 	setSeconds = int
- 	setYear = int
- 	setTime = long
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## AttachVpnGateway parameterss:

```
- setVpcId = java.lang.String
- withVpcId = java.lang.String
- setVpnGatewayId = java.lang.String
- withVpnGatewayId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## CreateSecurityGroup parameterss:

```
- setVpcId = java.lang.String
- withVpcId = java.lang.String
- setDescription = java.lang.String
- withDescription = java.lang.String
- setGroupName = java.lang.String
- withGroupName = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## ExportTransitGatewayRoutes parameterss:

```
- setTransitGatewayRouteTableId = java.lang.String
- withTransitGatewayRouteTableId = java.lang.String
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## DeleteTags parameterss:

```
- setResources = java.util.Collection<java.lang.String>
- withResources = java.lang.String[]
```
## ReleaseHosts parameterss:

```
- setHostIds = java.util.Collection<java.lang.String>
- withHostIds = java.lang.String[]
```
## CreateVolume parameterss:

```
- setAvailabilityZone = java.lang.String
- withAvailabilityZone = java.lang.String
- setTagSpecifications = java.util.Collection<com.amazonaws.services.ec2.model.TagSpecification>
- 	setResourceType = java.lang.String
- 	withResourceType = java.lang.String
- 	setTags = java.util.Collection<com.amazonaws.services.ec2.model.Tag>
- 		withValue = java.lang.String
- 		setKey = java.lang.String
- 		withKey = java.lang.String
- 		setValue = java.lang.String
- 	withTags = com.amazonaws.services.ec2.model.Tag[]
- 		withValue = java.lang.String
- 		setKey = java.lang.String
- 		withKey = java.lang.String
- 		setValue = java.lang.String
```
## CreateLaunchTemplate parameterss:

```
- setClientToken = java.lang.String
- withClientToken = java.lang.String
- setLaunchTemplateName = java.lang.String
- withLaunchTemplateName = java.lang.String
- setVersionDescription = java.lang.String
- withVersionDescription = java.lang.String
- setLaunchTemplateData = com.amazonaws.services.ec2.model.RequestLaunchTemplateData
- 	setInstanceType = java.lang.String
- 	withInstanceType = java.lang.String
- 	setTagSpecifications = java.util.Collection<com.amazonaws.services.ec2.model.LaunchTemplateTagSpecificationRequest>
- 		setResourceType = java.lang.String
- 		withResourceType = com.amazonaws.services.ec2.model.ResourceType
- 		setTags = java.util.Collection<com.amazonaws.services.ec2.model.Tag>
- 			withValue = java.lang.String
- 			setKey = java.lang.String
- 			withKey = java.lang.String
- 			setValue = java.lang.String
- 		withTags = com.amazonaws.services.ec2.model.Tag[]
- 			withValue = java.lang.String
- 			setKey = java.lang.String
- 			withKey = java.lang.String
- 			setValue = java.lang.String
```
## ModifyLaunchTemplate parameterss:

```
- setClientToken = java.lang.String
- withClientToken = java.lang.String
- setLaunchTemplateId = java.lang.String
- withLaunchTemplateId = java.lang.String
- setLaunchTemplateName = java.lang.String
- withLaunchTemplateName = java.lang.String
- setDefaultVersion = java.lang.String
- withDefaultVersion = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## ReplaceRouteTableAssociation parameterss:

```
- setRouteTableId = java.lang.String
- withRouteTableId = java.lang.String
- setAssociationId = java.lang.String
- withAssociationId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## GetTransitGatewayRouteTablePropagations parameterss:

```
- setTransitGatewayRouteTableId = java.lang.String
- withTransitGatewayRouteTableId = java.lang.String
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## PurchaseHostReservation parameterss:

```
- setClientToken = java.lang.String
- withClientToken = java.lang.String
- setOfferingId = java.lang.String
- withOfferingId = java.lang.String
- setHostIdSet = java.util.Collection<java.lang.String>
- withHostIdSet = java.lang.String[]
```
## CreateNetworkInterfacePermission parameterss:

```
- setNetworkInterfaceId = java.lang.String
- withNetworkInterfaceId = java.lang.String
- withAwsAccountId = java.lang.String
- withAwsService = java.lang.String
- withPermission = com.amazonaws.services.ec2.model.InterfacePermissionType
- setAwsAccountId = java.lang.String
- setAwsService = java.lang.String
- setPermission = com.amazonaws.services.ec2.model.InterfacePermissionType
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## ModifyVpcAttribute parameterss:

```
- setVpcId = java.lang.String
- withVpcId = java.lang.String
- setEnableDnsHostnames = java.lang.Boolean
- withEnableDnsHostnames = java.lang.Boolean
- setEnableDnsSupport = java.lang.Boolean
- withEnableDnsSupport = java.lang.Boolean
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DeleteSpotDatafeedSubscription parameterss:

```
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## CreateVpcEndpointConnectionNotification parameterss:

```
- setServiceId = java.lang.String
- withServiceId = java.lang.String
- setClientToken = java.lang.String
- withClientToken = java.lang.String
- setVpcEndpointId = java.lang.String
- setConnectionNotificationArn = java.lang.String
- withConnectionNotificationArn = java.lang.String
- setConnectionEvents = java.util.Collection<java.lang.String>
- withConnectionEvents = java.lang.String[]
```
## DeleteSubnet parameterss:

```
- setSubnetId = java.lang.String
- withSubnetId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## CopySnapshot parameterss:

```
- setDescription = java.lang.String
- withDescription = java.lang.String
- setSourceRegion = java.lang.String
- withSourceRegion = java.lang.String
- setEncrypted = java.lang.Boolean
- withEncrypted = java.lang.Boolean
- setKmsKeyId = java.lang.String
- withKmsKeyId = java.lang.String
- setDestinationRegion = java.lang.String
- withDestinationRegion = java.lang.String
- setPresignedUrl = java.lang.String
- withPresignedUrl = java.lang.String
- setSourceSnapshotId = java.lang.String
- withSourceSnapshotId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeVpcEndpointServiceConfigurations parameterss:

```
- setServiceIds = java.util.Collection<java.lang.String>
- withServiceIds = java.lang.String[]
```
## DeleteVolume parameterss:

```
- setVolumeId = java.lang.String
- withVolumeId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeReservedInstances parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## DescribeTransitGatewayRouteTables parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## DescribeLaunchTemplates parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## DescribeVpcEndpointServices parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## TerminateInstances parameterss:

```
- setInstanceIds = java.util.Collection<java.lang.String>
- withInstanceIds = java.lang.String[]
```
## ExportClientVpnClientConfiguration parameterss:

```
- setClientVpnEndpointId = java.lang.String
- withClientVpnEndpointId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeAvailabilityZones parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## DescribeNetworkAcls parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## DescribeAccountAttributes parameterss:

```
- setAttributeNames = java.util.Collection<java.lang.String>
- withAttributeNames = com.amazonaws.services.ec2.model.AccountAttributeName[]
```
## AdvertiseByoipCidr parameterss:

```
- setCidr = java.lang.String
- withCidr = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## CreateNetworkAcl parameterss:

```
- setVpcId = java.lang.String
- withVpcId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribePrincipalIdFormat parameterss:

```
- setResources = java.util.Collection<java.lang.String>
- withResources = java.lang.String[]
```
## EnableVgwRoutePropagation parameterss:

```
- setRouteTableId = java.lang.String
- withRouteTableId = java.lang.String
- setGatewayId = java.lang.String
- withGatewayId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeVpcEndpointConnectionNotifications parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## GetConsoleOutput parameterss:

```
- setInstanceId = java.lang.String
- withInstanceId = java.lang.String
- withLatest = java.lang.Boolean
- setLatest = java.lang.Boolean
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeRouteTables parameterss:

```
- setRouteTableIds = java.util.Collection<java.lang.String>
- withRouteTableIds = java.lang.String[]
```
## WithdrawByoipCidr parameterss:

```
- setCidr = java.lang.String
- withCidr = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## CancelExportTask parameterss:

```
- setExportTaskId = java.lang.String
- withExportTaskId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DeleteTransitGateway parameterss:

```
- setTransitGatewayId = java.lang.String
- withTransitGatewayId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## ReplaceTransitGatewayRoute parameterss:

```
- withTransitGatewayAttachmentId = java.lang.String
- setTransitGatewayAttachmentId = java.lang.String
- setTransitGatewayRouteTableId = java.lang.String
- withTransitGatewayRouteTableId = java.lang.String
- withBlackhole = java.lang.Boolean
- setDestinationCidrBlock = java.lang.String
- withDestinationCidrBlock = java.lang.String
- setBlackhole = java.lang.Boolean
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeKeyPairs parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## AcceptReservedInstancesExchangeQuote parameterss:

```
- withTargetConfigurations = com.amazonaws.services.ec2.model.TargetConfigurationRequest[]
```
## AssociateRouteTable parameterss:

```
- setSubnetId = java.lang.String
- withSubnetId = java.lang.String
- setRouteTableId = java.lang.String
- withRouteTableId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## UnmonitorInstances parameterss:

```
- setInstanceIds = java.util.Collection<java.lang.String>
- withInstanceIds = java.lang.String[]
```
## CreateFpgaImage parameterss:

```
- setClientToken = java.lang.String
- withClientToken = java.lang.String
- setDescription = java.lang.String
- withDescription = java.lang.String
- withName = java.lang.String
- setInputStorageLocation = com.amazonaws.services.ec2.model.StorageLocation
- 	withBucket = java.lang.String
- 	setBucket = java.lang.String
- 	setKey = java.lang.String
- 	withKey = java.lang.String
- withInputStorageLocation = com.amazonaws.services.ec2.model.StorageLocation
- 	withBucket = java.lang.String
- 	setBucket = java.lang.String
- 	setKey = java.lang.String
- 	withKey = java.lang.String
- setLogsStorageLocation = com.amazonaws.services.ec2.model.StorageLocation
- 	withBucket = java.lang.String
- 	setBucket = java.lang.String
- 	setKey = java.lang.String
- 	withKey = java.lang.String
- withLogsStorageLocation = com.amazonaws.services.ec2.model.StorageLocation
- 	withBucket = java.lang.String
- 	setBucket = java.lang.String
- 	setKey = java.lang.String
- 	withKey = java.lang.String
- setName = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DeleteNetworkAclEntry parameterss:

```
- setNetworkAclId = java.lang.String
- withNetworkAclId = java.lang.String
- setRuleNumber = java.lang.Integer
- withRuleNumber = java.lang.Integer
- setEgress = java.lang.Boolean
- withEgress = java.lang.Boolean
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## ImportClientVpnClientCertificateRevocationList parameterss:

```
- setClientVpnEndpointId = java.lang.String
- withClientVpnEndpointId = java.lang.String
- setCertificateRevocationList = java.lang.String
- withCertificateRevocationList = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## AssignIpv6Addresses parameterss:

```
- setIpv6AddressCount = java.lang.Integer
- withIpv6AddressCount = java.lang.Integer
- setIpv6Addresses = java.util.Collection<java.lang.String>
- withIpv6Addresses = java.lang.String[]
```
## ApplySecurityGroupsToClientVpnTargetNetwork parameterss:

```
- setClientVpnEndpointId = java.lang.String
- withClientVpnEndpointId = java.lang.String
- setVpcId = java.lang.String
- withVpcId = java.lang.String
- setSecurityGroupIds = java.util.Collection<java.lang.String>
- withSecurityGroupIds = java.lang.String[]
```
## DescribeTransitGateways parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## GetTransitGatewayRouteTableAssociations parameterss:

```
- setTransitGatewayRouteTableId = java.lang.String
- withTransitGatewayRouteTableId = java.lang.String
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## CreatePlacementGroup parameterss:

```
- setGroupName = java.lang.String
- withGroupName = java.lang.String
- setPartitionCount = java.lang.Integer
- setStrategy = java.lang.String
- withStrategy = java.lang.String
- withPartitionCount = java.lang.Integer
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DeleteVpcEndpoints parameterss:

```
- setVpcEndpointIds = java.util.Collection<java.lang.String>
- withVpcEndpointIds = java.lang.String[]
```
## DeregisterImage parameterss:

```
- setImageId = java.lang.String
- withImageId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## UnassignIpv6Addresses parameterss:

```
- setIpv6Addresses = java.util.Collection<java.lang.String>
- withIpv6Addresses = java.lang.String[]
```
## GetLaunchTemplateData parameterss:

```
- setInstanceId = java.lang.String
- withInstanceId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeSpotInstanceRequests parameterss:

```
- setSpotInstanceRequestIds = java.util.Collection<java.lang.String>
- withSpotInstanceRequestIds = java.lang.String[]
```
## AttachNetworkInterface parameterss:

```
- setNetworkInterfaceId = java.lang.String
- withNetworkInterfaceId = java.lang.String
- setInstanceId = java.lang.String
- withInstanceId = java.lang.String
- setDeviceIndex = java.lang.Integer
- withDeviceIndex = java.lang.Integer
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DeleteVpcEndpointServiceConfigurations parameterss:

```
- setServiceIds = java.util.Collection<java.lang.String>
- withServiceIds = java.lang.String[]
```
## DescribeInternetGateways parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## CreateRoute parameterss:

```
- setVpcPeeringConnectionId = java.lang.String
- withVpcPeeringConnectionId = java.lang.String
- setNetworkInterfaceId = java.lang.String
- withNetworkInterfaceId = java.lang.String
- setRouteTableId = java.lang.String
- withRouteTableId = java.lang.String
- setInstanceId = java.lang.String
- withInstanceId = java.lang.String
- setDestinationCidrBlock = java.lang.String
- withDestinationCidrBlock = java.lang.String
- setGatewayId = java.lang.String
- setDestinationIpv6CidrBlock = java.lang.String
- withDestinationIpv6CidrBlock = java.lang.String
- setEgressOnlyInternetGatewayId = java.lang.String
- withEgressOnlyInternetGatewayId = java.lang.String
- withGatewayId = java.lang.String
- setNatGatewayId = java.lang.String
- withNatGatewayId = java.lang.String
- setTransitGatewayId = java.lang.String
- withTransitGatewayId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## ModifyIdentityIdFormat parameterss:

```
- setResource = java.lang.String
- withResource = java.lang.String
- setPrincipalArn = java.lang.String
- withPrincipalArn = java.lang.String
- setUseLongIds = java.lang.Boolean
- withUseLongIds = java.lang.Boolean
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeVolumeStatus parameterss:

```
- withVolumeIds = java.lang.String[]
```
## CreateInstanceExportTask parameterss:

```
- setInstanceId = java.lang.String
- withInstanceId = java.lang.String
- setDescription = java.lang.String
- withDescription = java.lang.String
- setExportToS3Task = com.amazonaws.services.ec2.model.ExportToS3TaskSpecification
- 	setS3Bucket = java.lang.String
- 	withS3Bucket = java.lang.String
- 	setContainerFormat = java.lang.String
- 	withContainerFormat = java.lang.String
- 	setDiskImageFormat = com.amazonaws.services.ec2.model.DiskImageFormat
- 	withDiskImageFormat = com.amazonaws.services.ec2.model.DiskImageFormat
- 	setS3Prefix = java.lang.String
- 	withS3Prefix = java.lang.String
- withExportToS3Task = com.amazonaws.services.ec2.model.ExportToS3TaskSpecification
- 	setS3Bucket = java.lang.String
- 	withS3Bucket = java.lang.String
- 	setContainerFormat = java.lang.String
- 	withContainerFormat = java.lang.String
- 	setDiskImageFormat = com.amazonaws.services.ec2.model.DiskImageFormat
- 	withDiskImageFormat = com.amazonaws.services.ec2.model.DiskImageFormat
- 	setS3Prefix = java.lang.String
- 	withS3Prefix = java.lang.String
- setTargetEnvironment = com.amazonaws.services.ec2.model.ExportEnvironment
- withTargetEnvironment = com.amazonaws.services.ec2.model.ExportEnvironment
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeByoipCidrs parameterss:

```
- setMaxResults = java.lang.Integer
- withMaxResults = java.lang.Integer
- setNextToken = java.lang.String
- withNextToken = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## EnableVolumeIO parameterss:

```
- setVolumeId = java.lang.String
- withVolumeId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## ModifyIdFormat parameterss:

```
- setResource = java.lang.String
- withResource = java.lang.String
- setUseLongIds = java.lang.Boolean
- withUseLongIds = java.lang.Boolean
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DeleteRouteTable parameterss:

```
- setRouteTableId = java.lang.String
- withRouteTableId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## AttachInternetGateway parameterss:

```
- setVpcId = java.lang.String
- withVpcId = java.lang.String
- setInternetGatewayId = java.lang.String
- withInternetGatewayId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribePrefixLists parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## GetHostReservationPurchasePreview parameterss:

```
- setOfferingId = java.lang.String
- withOfferingId = java.lang.String
- setHostIdSet = java.util.Collection<java.lang.String>
- withHostIdSet = java.lang.String[]
```
## CreateInternetGateway parameterss:

```
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeReservedInstancesModifications parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## RegisterImage parameterss:

```
- setDescription = java.lang.String
- withDescription = java.lang.String
- withName = java.lang.String
- setBlockDeviceMappings = java.util.Collection<com.amazonaws.services.ec2.model.BlockDeviceMapping>
- 	setDeviceName = java.lang.String
- 	withDeviceName = java.lang.String
- 	setEbs = com.amazonaws.services.ec2.model.EbsBlockDevice
- 		setEncrypted = java.lang.Boolean
- 		withEncrypted = java.lang.Boolean
- 		setKmsKeyId = java.lang.String
- 		withKmsKeyId = java.lang.String
- 		setIops = java.lang.Integer
- 		withIops = java.lang.Integer
- 		setSnapshotId = java.lang.String
- 		withSnapshotId = java.lang.String
- 		setVolumeType = com.amazonaws.services.ec2.model.VolumeType
- 		withVolumeType = java.lang.String
- 		setVolumeSize = java.lang.Integer
- 		withVolumeSize = java.lang.Integer
- 		setDeleteOnTermination = java.lang.Boolean
- 		withDeleteOnTermination = java.lang.Boolean
- 	withEbs = com.amazonaws.services.ec2.model.EbsBlockDevice
- 		setEncrypted = java.lang.Boolean
- 		withEncrypted = java.lang.Boolean
- 		setKmsKeyId = java.lang.String
- 		withKmsKeyId = java.lang.String
- 		setIops = java.lang.Integer
- 		withIops = java.lang.Integer
- 		setSnapshotId = java.lang.String
- 		withSnapshotId = java.lang.String
- 		setVolumeType = com.amazonaws.services.ec2.model.VolumeType
- 		withVolumeType = java.lang.String
- 		setVolumeSize = java.lang.Integer
- 		withVolumeSize = java.lang.Integer
- 		setDeleteOnTermination = java.lang.Boolean
- 		withDeleteOnTermination = java.lang.Boolean
- 	setNoDevice = java.lang.String
- 	withNoDevice = java.lang.String
- 	setVirtualName = java.lang.String
- 	withVirtualName = java.lang.String
- withBlockDeviceMappings = com.amazonaws.services.ec2.model.BlockDeviceMapping[]
```
## ModifyInstancePlacement parameterss:

```
- setInstanceId = java.lang.String
- withInstanceId = java.lang.String
- setGroupName = java.lang.String
- withGroupName = java.lang.String
- setTenancy = java.lang.String
- withTenancy = java.lang.String
- setAffinity = com.amazonaws.services.ec2.model.Affinity
- withAffinity = java.lang.String
- setHostId = java.lang.String
- withHostId = java.lang.String
- setPartitionNumber = java.lang.Integer
- withPartitionNumber = java.lang.Integer
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## AssociateSubnetCidrBlock parameterss:

```
- setSubnetId = java.lang.String
- withIpv6CidrBlock = java.lang.String
- withSubnetId = java.lang.String
- setIpv6CidrBlock = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeRegions parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## DescribeSnapshotAttribute parameterss:

```
- setSnapshotId = java.lang.String
- withSnapshotId = java.lang.String
- setAttribute = java.lang.String
- withAttribute = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeClassicLinkInstances parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## DescribeMovingAddresses parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## DeleteTransitGatewayVpcAttachment parameterss:

```
- withTransitGatewayAttachmentId = java.lang.String
- setTransitGatewayAttachmentId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DescribeBundleTasks parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## DescribeScheduledInstanceAvailability parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## ImportSnapshot parameterss:

```
- setClientToken = java.lang.String
- withClientToken = java.lang.String
- setDescription = java.lang.String
- withDescription = java.lang.String
- setEncrypted = java.lang.Boolean
- withEncrypted = java.lang.Boolean
- setKmsKeyId = java.lang.String
- withKmsKeyId = java.lang.String
- setClientData = com.amazonaws.services.ec2.model.ClientData
- 	setComment = java.lang.String
- 	withComment = java.lang.String
- 	setUploadEnd = java.util.Date
- 		setDate = int
- 		setHours = int
- 		setMinutes = int
- 		setMonth = int
- 		setSeconds = int
- 		setYear = int
- 		setTime = long
- 	withUploadEnd = java.util.Date
- 		setDate = int
- 		setHours = int
- 		setMinutes = int
- 		setMonth = int
- 		setSeconds = int
- 		setYear = int
- 		setTime = long
- 	setUploadSize = java.lang.Double
- 	withUploadSize = java.lang.Double
- 	setUploadStart = java.util.Date
- 		setDate = int
- 		setHours = int
- 		setMinutes = int
- 		setMonth = int
- 		setSeconds = int
- 		setYear = int
- 		setTime = long
- 	withUploadStart = java.util.Date
- 		setDate = int
- 		setHours = int
- 		setMinutes = int
- 		setMonth = int
- 		setSeconds = int
- 		setYear = int
- 		setTime = long
- withClientData = com.amazonaws.services.ec2.model.ClientData
- 	setComment = java.lang.String
- 	withComment = java.lang.String
- 	setUploadEnd = java.util.Date
- 		setDate = int
- 		setHours = int
- 		setMinutes = int
- 		setMonth = int
- 		setSeconds = int
- 		setYear = int
- 		setTime = long
- 	withUploadEnd = java.util.Date
- 		setDate = int
- 		setHours = int
- 		setMinutes = int
- 		setMonth = int
- 		setSeconds = int
- 		setYear = int
- 		setTime = long
- 	setUploadSize = java.lang.Double
- 	withUploadSize = java.lang.Double
- 	setUploadStart = java.util.Date
- 		setDate = int
- 		setHours = int
- 		setMinutes = int
- 		setMonth = int
- 		setSeconds = int
- 		setYear = int
- 		setTime = long
- 	withUploadStart = java.util.Date
- 		setDate = int
- 		setHours = int
- 		setMinutes = int
- 		setMonth = int
- 		setSeconds = int
- 		setYear = int
- 		setTime = long
- withDiskContainer = com.amazonaws.services.ec2.model.SnapshotDiskContainer
- 	setDescription = java.lang.String
- 	withDescription = java.lang.String
- 	setFormat = java.lang.String
- 	withFormat = java.lang.String
- 	withUserBucket = com.amazonaws.services.ec2.model.UserBucket
- 		setS3Bucket = java.lang.String
- 		withS3Bucket = java.lang.String
- 		withS3Key = java.lang.String
- 		setS3Key = java.lang.String
- 	setUrl = java.lang.String
- 	withUrl = java.lang.String
- 	setUserBucket = com.amazonaws.services.ec2.model.UserBucket
- 		setS3Bucket = java.lang.String
- 		withS3Bucket = java.lang.String
- 		withS3Key = java.lang.String
- 		setS3Key = java.lang.String
- setDiskContainer = com.amazonaws.services.ec2.model.SnapshotDiskContainer
- 	setDescription = java.lang.String
- 	withDescription = java.lang.String
- 	setFormat = java.lang.String
- 	withFormat = java.lang.String
- 	withUserBucket = com.amazonaws.services.ec2.model.UserBucket
- 		setS3Bucket = java.lang.String
- 		withS3Bucket = java.lang.String
- 		withS3Key = java.lang.String
- 		setS3Key = java.lang.String
- 	setUrl = java.lang.String
- 	withUrl = java.lang.String
- 	setUserBucket = com.amazonaws.services.ec2.model.UserBucket
- 		setS3Bucket = java.lang.String
- 		withS3Bucket = java.lang.String
- 		withS3Key = java.lang.String
- 		setS3Key = java.lang.String
- setRoleName = java.lang.String
- withRoleName = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## CreateNetworkInterface parameterss:

```
- setIpv6AddressCount = java.lang.Integer
- withIpv6AddressCount = java.lang.Integer
- setIpv6Addresses = java.util.Collection<com.amazonaws.services.ec2.model.InstanceIpv6Address>
- 	setIpv6Address = java.lang.String
- 	withIpv6Address = java.lang.String
- withIpv6Addresses = com.amazonaws.services.ec2.model.InstanceIpv6Address[]
```
## DescribeVpnGateways parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## DetachVolume parameterss:

```
- setInstanceId = java.lang.String
- withInstanceId = java.lang.String
- withDevice = java.lang.String
- setDevice = java.lang.String
- setVolumeId = java.lang.String
- withVolumeId = java.lang.String
- withForce = java.lang.Boolean
- setForce = java.lang.Boolean
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DeleteNetworkInterfacePermission parameterss:

```
- withForce = java.lang.Boolean
- setNetworkInterfacePermissionId = java.lang.String
- withNetworkInterfacePermissionId = java.lang.String
- setForce = java.lang.Boolean
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## EnableVpcClassicLinkDnsSupport parameterss:

```
- setVpcId = java.lang.String
- withVpcId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## ReplaceNetworkAclAssociation parameterss:

```
- setNetworkAclId = java.lang.String
- withNetworkAclId = java.lang.String
- setAssociationId = java.lang.String
- withAssociationId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## RequestSpotInstances parameterss:

```
- setClientToken = java.lang.String
- withClientToken = java.lang.String
- setType = com.amazonaws.services.ec2.model.SpotInstanceType
- withType = com.amazonaws.services.ec2.model.SpotInstanceType
- setInstanceCount = java.lang.Integer
- withInstanceCount = java.lang.Integer
- setValidFrom = java.util.Date
- 	setDate = int
- 	setHours = int
- 	setMinutes = int
- 	setMonth = int
- 	setSeconds = int
- 	setYear = int
- 	setTime = long
- withValidFrom = java.util.Date
- 	setDate = int
- 	setHours = int
- 	setMinutes = int
- 	setMonth = int
- 	setSeconds = int
- 	setYear = int
- 	setTime = long
- setValidUntil = java.util.Date
- 	setDate = int
- 	setHours = int
- 	setMinutes = int
- 	setMonth = int
- 	setSeconds = int
- 	setYear = int
- 	setTime = long
- withValidUntil = java.util.Date
- 	setDate = int
- 	setHours = int
- 	setMinutes = int
- 	setMonth = int
- 	setSeconds = int
- 	setYear = int
- 	setTime = long
- setLaunchSpecification = com.amazonaws.services.ec2.model.LaunchSpecification
- 	setInstanceType = java.lang.String
- 	withInstanceType = com.amazonaws.services.ec2.model.InstanceType
- 	setSubnetId = java.lang.String
- 	withSubnetId = java.lang.String
- 	setIamInstanceProfile = com.amazonaws.services.ec2.model.IamInstanceProfileSpecification
- 		withName = java.lang.String
- 		withArn = java.lang.String
- 		setArn = java.lang.String
- 		setName = java.lang.String
- 	withIamInstanceProfile = com.amazonaws.services.ec2.model.IamInstanceProfileSpecification
- 		withName = java.lang.String
- 		withArn = java.lang.String
- 		setArn = java.lang.String
- 		setName = java.lang.String
- 	withKeyName = java.lang.String
- 	setKeyName = java.lang.String
- 	setEbsOptimized = java.lang.Boolean
- 	withEbsOptimized = java.lang.Boolean
- 	setBlockDeviceMappings = java.util.Collection<com.amazonaws.services.ec2.model.BlockDeviceMapping>
- 		setDeviceName = java.lang.String
- 		withDeviceName = java.lang.String
- 		setEbs = com.amazonaws.services.ec2.model.EbsBlockDevice
- 			setEncrypted = java.lang.Boolean
- 			withEncrypted = java.lang.Boolean
- 			setKmsKeyId = java.lang.String
- 			withKmsKeyId = java.lang.String
- 			setIops = java.lang.Integer
- 			withIops = java.lang.Integer
- 			setSnapshotId = java.lang.String
- 			withSnapshotId = java.lang.String
- 			setVolumeType = com.amazonaws.services.ec2.model.VolumeType
- 			withVolumeType = java.lang.String
- 			setVolumeSize = java.lang.Integer
- 			withVolumeSize = java.lang.Integer
- 			setDeleteOnTermination = java.lang.Boolean
- 			withDeleteOnTermination = java.lang.Boolean
- 		withEbs = com.amazonaws.services.ec2.model.EbsBlockDevice
- 			setEncrypted = java.lang.Boolean
- 			withEncrypted = java.lang.Boolean
- 			setKmsKeyId = java.lang.String
- 			withKmsKeyId = java.lang.String
- 			setIops = java.lang.Integer
- 			withIops = java.lang.Integer
- 			setSnapshotId = java.lang.String
- 			withSnapshotId = java.lang.String
- 			setVolumeType = com.amazonaws.services.ec2.model.VolumeType
- 			withVolumeType = java.lang.String
- 			setVolumeSize = java.lang.Integer
- 			withVolumeSize = java.lang.Integer
- 			setDeleteOnTermination = java.lang.Boolean
- 			withDeleteOnTermination = java.lang.Boolean
- 		setNoDevice = java.lang.String
- 		withNoDevice = java.lang.String
- 		setVirtualName = java.lang.String
- 		withVirtualName = java.lang.String
- 	withBlockDeviceMappings = com.amazonaws.services.ec2.model.BlockDeviceMapping[]
```
## DescribeVpcClassicLink parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## DescribeNetworkInterfaces parameterss:

```
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## DescribeLaunchTemplateVersions parameterss:

```
- setLaunchTemplateId = java.lang.String
- withLaunchTemplateId = java.lang.String
- setLaunchTemplateName = java.lang.String
- withLaunchTemplateName = java.lang.String
- setVersions = java.util.Collection<java.lang.String>
- withVersions = java.lang.String[]
```
## DetachNetworkInterface parameterss:

```
- withForce = java.lang.Boolean
- setForce = java.lang.Boolean
- setAttachmentId = java.lang.String
- withAttachmentId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## ModifyNetworkInterfaceAttribute parameterss:

```
- setNetworkInterfaceId = java.lang.String
- withNetworkInterfaceId = java.lang.String
- setGroups = java.util.Collection<java.lang.String>
- withGroups = java.lang.String[]
```
## DisassociateTransitGatewayRouteTable parameterss:

```
- withTransitGatewayAttachmentId = java.lang.String
- setTransitGatewayAttachmentId = java.lang.String
- setTransitGatewayRouteTableId = java.lang.String
- withTransitGatewayRouteTableId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## ModifyInstanceCapacityReservationAttributes parameterss:

```
- setInstanceId = java.lang.String
- withInstanceId = java.lang.String
- setCapacityReservationSpecification = com.amazonaws.services.ec2.model.CapacityReservationSpecification
- 	setCapacityReservationPreference = java.lang.String
- 	withCapacityReservationPreference = java.lang.String
- 	setCapacityReservationTarget = com.amazonaws.services.ec2.model.CapacityReservationTarget
- 		setCapacityReservationId = java.lang.String
- 		withCapacityReservationId = java.lang.String
- 	withCapacityReservationTarget = com.amazonaws.services.ec2.model.CapacityReservationTarget
- 		setCapacityReservationId = java.lang.String
- 		withCapacityReservationId = java.lang.String
- withCapacityReservationSpecification = com.amazonaws.services.ec2.model.CapacityReservationSpecification
- 	setCapacityReservationPreference = java.lang.String
- 	withCapacityReservationPreference = java.lang.String
- 	setCapacityReservationTarget = com.amazonaws.services.ec2.model.CapacityReservationTarget
- 		setCapacityReservationId = java.lang.String
- 		withCapacityReservationId = java.lang.String
- 	withCapacityReservationTarget = com.amazonaws.services.ec2.model.CapacityReservationTarget
- 		setCapacityReservationId = java.lang.String
- 		withCapacityReservationId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## CreateKeyPair parameterss:

```
- withKeyName = java.lang.String
- setKeyName = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DisassociateRouteTable parameterss:

```
- setAssociationId = java.lang.String
- withAssociationId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## AttachClassicLinkVpc parameterss:

```
- setVpcId = java.lang.String
- withVpcId = java.lang.String
- setInstanceId = java.lang.String
- withInstanceId = java.lang.String
- setGroups = java.util.Collection<java.lang.String>
- withGroups = java.lang.String[]
```
## DescribeEgressOnlyInternetGateways parameterss:

```
- setMaxResults = java.lang.Integer
- withMaxResults = java.lang.Integer
- setNextToken = java.lang.String
- withNextToken = java.lang.String
- setEgressOnlyInternetGatewayIds = java.util.Collection<java.lang.String>
- withEgressOnlyInternetGatewayIds = java.lang.String[]
```
## DescribeClientVpnRoutes parameterss:

```
- setClientVpnEndpointId = java.lang.String
- withClientVpnEndpointId = java.lang.String
- setFilters = java.util.Collection<com.amazonaws.services.ec2.model.Filter>
- 	withName = java.lang.String
- 	setValues = java.util.Collection<java.lang.String>
- 	withValues = java.lang.String[]
```
## CancelReservedInstancesListing parameterss:

```
- setReservedInstancesListingId = java.lang.String
- withReservedInstancesListingId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## DisassociateSubnetCidrBlock parameterss:

```
- setAssociationId = java.lang.String
- withAssociationId = java.lang.String
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
## MonitorInstances parameterss:

```
- setInstanceIds = java.util.Collection<java.lang.String>
- withInstanceIds = java.lang.String[]
```
## CreateVpnGateway parameterss:

```
- setAvailabilityZone = java.lang.String
- withAvailabilityZone = java.lang.String
- setType = java.lang.String
- withType = com.amazonaws.services.ec2.model.GatewayType
- withAmazonSideAsn = java.lang.Long
- setAmazonSideAsn = java.lang.Long
- setRequestCredentials = com.amazonaws.auth.AWSCredentials
- setRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- withRequestCredentialsProvider = com.amazonaws.auth.AWSCredentialsProvider
- setRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- withRequestMetricCollector = com.amazonaws.metrics.RequestMetricCollector
- setGeneralProgressListener = com.amazonaws.event.ProgressListener
- withGeneralProgressListener = com.amazonaws.event.ProgressListener
- setSdkRequestTimeout = int
- withSdkRequestTimeout = int
- setSdkClientExecutionTimeout = int
- withSdkClientExecutionTimeout = int
```
