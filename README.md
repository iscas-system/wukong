# WuKong

##  Analysis

We describe the [operations](docs/Operations.md).suppoted by the system mentioned below.
Then, we give the parameters of each system in detail.


TABLE I: The list of supported System

|  Country  |   Type    |   Name    |  Offical  |  Support  |
| :-------: | :-------: | :-------: | :-------: | :-------: |
|  ---      | Container | Kubernetes|    No     |    Yes    |
|  ---      | Container | OpenShift |    No     |    Yes    |
|  ---      | Container |   Docker  |    No     |    Yes    |
|  America  |     VM    |   Amazon  |    Yes    |    Yes    |
|  America  |     VM    |   Azure   |    Yes    |  **No**   |
|  America  |     VM    |   Google  |    Yes    |  **No**   |
|  China    |     VM    |   Aliyun  |    Yes    |    Yes    |
|  China    |     VM    |   Tencent |    Yes    |    Yes    |
|  China    |     VM    |   Baidu   |    Yes    |    Yes    |
|  China    |     VM    |   JD      |    Yes    |    Yes    |
|  ---      |     VM    | OpenStack |    No     |    Yes    |
|  ---      |     VM    |   VMWare  |    No     |  **No**   |


**Node that the value of "No" in column "Support" just means the related APIs
of target system does not satisfy our assumptions, we should reengineer the APIs**


### Container

1. [Kubernetes](docs/Kubernetes-Analysis.md)
2. [OpenShift](docs/OpenShift-Analysis.md)
3. Docker/Swarm
4. [Amazon ECS](docs/AmazonEcs-Analysis.md)

### VM
1. [Amazon EC2](docs/AmazonEc2-Analysis.md)
2. [Azure VM](docs/AzureVM-Analysis.md)
3. [Google GCE](docs/GoogleCCE-Analysis.md)
4. [Aliyun ECS](docs/AliyunECS-Analysis.md)
5. [Tencent VM](docs/TencentVM-Analysis.md)
6. [Baidu BCE](docs/BaiduBCE-Analysis.md)
7. [JDCloud VM](docs/JDCloudVM-Analysis.md)
