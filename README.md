# WuKong

##  1. Backgroud

  We plan to use a heuristic-based method for generating adapters of service-based generic-API for hybrid clouds
  
  - [Wukong@SOSE19](): [Heuristic-Based Framework for Generating Generic-API for JointCloud](https://ieeexplore.ieee.org/document/8705827)

##  2. Analysis

We describe the [operations](docs/Operations.md).suppoted by the system mentioned below.
Then, we give the parameters of each system in detail.


TABLE I: The list of supported System

|  Country  |   Type    |   Name    |  Offical  |  Version  |
| :-------: | :-------: | :-------: | :-------: | :-------: |
|  America  |     VM    |   Amazon  |    Yes    |   -                             |
|  America  |     VM    |   Azure   |    Yes    |  -                              |
|  America  |     VM    |   Google  |    Yes    |  -                              |
|  China    |     VM    |   Baidu   |    Yes    |   -                             |
|  China    |     VM    |   Aliyun  |    Yes    |  aliyun-java-sdk-ecs(4.16.7)    |
|  China    |     VM    |   Tencent |    Yes    |   -                             |
|  China    |     VM    |   JD      |    Yes    |   -                             |
|  China    |     VM    | Qingcloud |    Yes    |    qingcloud-sdk-java(1.1.0)    |


**Node that the value of "No" in column "Support" just means the related APIs
of target system does not satisfy our assumptions, we should reengineer the APIs**


### Clouds
1. [Amazon EC2](docs/AmazonEc2-Analysis.md)
2. [Azure VM](docs/AzureVM-Analysis.md)
3. [Google GCE](docs/GoogleCCE-Analysis.md)
4. [Aliyun ECS](docs/AliyunECS-Analysis.md)
5. [Tencent VM](docs/TencentVM-Analysis.md)
6. [Baidu BCE](docs/BaiduBCE-Analysis.md)
7. [JDCloud VM](docs/JDCloudVM-Analysis.md)
8. [Qingcloud VM](docs/QingcloudVM-Analysis.md)


##  3. JSON 

### VM
1. [Amazon EC2](docs/AmazonEc2-json.md)
2. [Azure VM](docs/AzureVM-json.md)
3. [Google GCE](docs/GoogleCCE-json.md)
4. [Aliyun ECS](docs/AliyunECS-json.md)
5. [Tencent VM](docs/TencentVM-json.md)
6. [Baidu BCE](docs/BaiduBCE-json.md)
7. [JDCloud VM](docs/JDCloudVM-json.md)
8. [Qingcloud VM](docs/QingcloudVM-json.md)
