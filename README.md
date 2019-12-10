# WuKong

##  1. Backgroud

  We plan to use a heuristic-based method for generating adapters of service-based generic-API for hybrid clouds
  
  - Wukong@SOSE19: [Case studies](https://ieeexplore.ieee.org/document/8705827)
  - Wukong@ATC20: [framework, submitted]

##  2. Analysis

We describe the [operations](docs/Operations.md).suppoted by the system mentioned below.
Then, we give the parameters of each system in detail.


TABLE I: The list of supported System

|  Country  |   Type    |   Name    |  Offical  |  Version  |      Document       |
| :-------: | :-------: | :-------: | :-------: | :-------: |      :-------:      |
|  USA      |     VM    |   Amazon    |    Yes    |   aws-java-sdk-ec2(1.11.668)                       | [AWS](https://docs.aws.amazon.com/zh_cn/AmazonECS/latest/developerguide/logging-using-cloudtrail.html) |
|  USA      |     VM    |   Azure     |    Yes    |   azure(1.28.0)                                    |  [Azure](https://docs.azure.cn/zh-cn/virtual-machines/linux/quick-create-portal?toc=%2Fvirtual-machines%2Flinux%2Ftoc.json)|
|  USA      |     VM    |   Google    |    Yes    |   google-api-services-compute(v1-rev204-1.25.0）   |  |
|  China    |     VM    |   Baidu     |    Yes    |   bce-java-sdk(0.10.78)                            |  |
|  China    |     VM    |   Aliyun    |    Yes    |   aliyun-java-sdk-ecs(4.17.8)                      | [aliyun](https://help.aliyun.com/document_detail/25484.html) |
|  China    |     VM    |   Tencent   |    Yes    |   tencentcloud-sdk-java(3.0.98)                    |  |
|  China    |     VM    |   JD        |    Yes    |   vm(1.2.2)                                        |  |
|  China    |     VM    |   Qingcloud |    Yes    |   qingcloud-sdk-java(1.1.0)                        |  |


**Node that the value of "No" in column "Support" just means the related APIs
of target system does not satisfy our assumptions, we should reengineer the APIs**


