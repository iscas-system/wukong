## ModifyInstanceAttributes parameterss:

URL: http://[spring application.yml]/vm/ModifyInstanceAttributes

```
{
	"main":{
		"setDescription":"java.lang.String",
		"setInstance":"java.lang.String",
		"setInstanceName":"java.lang.String",
		"setZone":"java.lang.String",
		"setAction":"java.lang.String"
	}
}
```
## ResetInstances parameterss:

URL: http://[spring application.yml]/vm/ResetInstances

```
{
	"main":{
		"setInstances":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setLoginKeyPair":"java.lang.String",
		"setLoginPasswd":"java.lang.String",
		"setNeedNewSID":"java.lang.Integer",
		"setLoginMode":"java.lang.String",
		"setZone":"java.lang.String",
		"setAction":"java.lang.String"
	}
}
```
## DescribeInstances parameterss:

URL: http://[spring application.yml]/vm/DescribeInstances

```
{
	"main":{
		"setOffset":"java.lang.Integer",
		"setInstanceType":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setStatus":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setSearchWord":"java.lang.String",
		"setImageID":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setVerbose":"java.lang.Integer",
		"setLimit":"java.lang.Integer",
		"setTags":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setInstanceClass":"java.lang.Integer",
		"setIsClusterNode":"java.lang.Integer",
		"setOwner":"java.lang.String",
		"setInstances":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setZone":"java.lang.String",
		"setAction":"java.lang.String"
	}
}
```
## RestartInstances parameterss:

URL: http://[spring application.yml]/vm/RestartInstances

```
{
	"main":{
		"setInstances":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setZone":"java.lang.String",
		"setAction":"java.lang.String"
	}
}
```
## RunInstances parameterss:

URL: http://[spring application.yml]/vm/RunInstances

```
{
	"main":{
		"setMemory":"java.lang.Integer",
		"setGpu":"java.lang.Integer",
		"setInstanceType":"java.lang.String",
		"setCPUModel":"java.lang.String",
		"setImageID":"java.lang.String",
		"setCPU":"java.lang.Integer",
		"setInstanceClass":"java.lang.Integer",
		"setInstanceName":"java.lang.String",
		"setLoginKeyPair":"java.lang.String",
		"setLoginPasswd":"java.lang.String",
		"setBillingID":"java.lang.String",
		"setNeedNewSID":"java.lang.Integer",
		"setOSDiskSize":"java.lang.Integer",
		"setCount":"java.lang.Integer",
		"setLoginMode":"java.lang.String",
		"setUserdataFile":"java.lang.String",
		"setVolumes":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setCPUMax":"java.lang.Integer",
		"setUserdataValue":"java.lang.String",
		"setHostname":"java.lang.String",
		"setUIType":"java.lang.String",
		"setNeedUserdata":"java.lang.Integer",
		"setVxNets":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setUserdataType":"java.lang.String",
		"setMemMax":"java.lang.Integer",
		"setUserdataPath":"java.lang.String",
		"setSecurityGroup":"java.lang.String",
		"setZone":"java.lang.String",
		"setAction":"java.lang.String"
	}
}
```
## CeaseInstances parameterss:

URL: http://[spring application.yml]/vm/CeaseInstances

```
{
	"main":{
		"setInstances":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setZone":"java.lang.String",
		"setAction":"java.lang.String"
	}
}
```
## ResizeInstances parameterss:

URL: http://[spring application.yml]/vm/ResizeInstances

```
{
	"main":{
		"setMemory":"java.lang.Integer",
		"setGpu":"java.lang.Integer",
		"setInstanceType":"java.lang.String",
		"setCPUModel":"java.lang.String",
		"setCPU":"java.lang.Integer",
		"setInstances":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setOSDiskSize":"java.lang.Integer",
		"setZone":"java.lang.String",
		"setAction":"java.lang.String"
	}
}
```
## TerminateInstances parameterss:

URL: http://[spring application.yml]/vm/TerminateInstances

```
{
	"main":{
		"setInstances":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setZone":"java.lang.String",
		"setAction":"java.lang.String"
	}
}
```
## DescribeInstanceTypes parameterss:

URL: http://[spring application.yml]/vm/DescribeInstanceTypes

```
{
	"main":{
		"setInstanceTypes":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setZone":"java.lang.String",
		"setAction":"java.lang.String"
	}
}
```
## StartInstances parameterss:

URL: http://[spring application.yml]/vm/StartInstances

```
{
	"main":{
		"setInstances":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setZone":"java.lang.String",
		"setAction":"java.lang.String"
	}
}
```
## StopInstances parameterss:

URL: http://[spring application.yml]/vm/StopInstances

```
{
	"main":{
		"setForce":"java.lang.Integer",
		"setInstances":[
			"java.lang.String0",
			"java.lang.String1"
		],
		"setZone":"java.lang.String",
		"setAction":"java.lang.String"
	}
}
```
