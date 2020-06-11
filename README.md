# WuKong

##  1. Backgroud

  We plan to use an automated method for generating adapters of service-based generic-API for hybrid clouds
  
  - [Case studies](https://ieeexplore.ieee.org/document/8705827): Yuanjia Xu, Heng Wu, Haijun Li, Yuewen Wu, Shijun Qin, Tianze Huang:
Wukong: Heuristic-Based Framework for Generating Generic-API for JointCloud. SOSE 2019


##  2. Usage

### 2.1 command

```
java -jar wukong-1.0.0-SNAPSHOT-jar-with-dependencies.jar jdkinfo.conf
```

- the jar can be get from   https://github.com/pdos-lab/Wukong/releases/download/v1.0.0/wukong-1.0.0-SNAPSHOT-jar-with-dependencies.jar
- the file can be get from  https://github.com/pdos-lab/Wukong/tree/master/conf

then you can see the output

### 2.2 Http proxy

##  3. Analysis

We describe the [operations](docs/Operations.md).suppoted by the system mentioned below.
Then, we give the parameters of each system in detail.


TABLE I: The list of supported System for VM service

|  Country  |   Type    |   Name    |  Offical  |  Version  |      Document       |
| :-------: | :-------: | :-------: | :-------: | :-------: |      :-------:      |
|  USA      |     VM    |   Amazon    |    Yes    |   aws-java-sdk-ec2(1.11.799692)                       | [AWS](https://docs.aws.amazon.com/zh_cn/AmazonECS/latest/developerguide/logging-using-cloudtrail.html)                    |
|  USA      |     VM    |   Azure     |    Yes    |   [azure](https://github.com/Azure/azure-sdk-for-java.git)(1.34.0)                                    | [Azure](https://docs.azure.cn/zh-cn/virtual-machines/linux/quick-create-portal?toc=%2Fvirtual-machines%2Flinux%2Ftoc.json)|
|  USA      |     VM    |   Google    |    Yes    |   [google-api-services-compute](https://github.com/google/apis-client-generator.git)(v1-rev235-1.25.0）   | [Google](https://cloud.google.com/compute/docs/reference/rest/v1/)  |
|  China    |     VM    |   Aliyun    |    Yes    |   aliyun-java-sdk-ecs(4.17.8)                      | [aliyun](https://help.aliyun.com/document_detail/25484.html)        |
|  China    |     VM    |   Tencent   |    Yes    |   tencentcloud-sdk-java(3.0.112)                   | [Tencent](https://intl.cloud.tencent.com/product/api)               |


**Node that the value of "No" in column "Support" just means the related APIs
of target system does not satisfy our assumptions, we should reengineer the APIs**

Deprecated

|  Country  |   Type    |   Name    |  Offical  |  Version  |      Document       |
| :-------: | :-------: | :-------: | :-------: | :-------: |      :-------:      |
|  USA      |     VM    |   OpenStack |    No     |   openstack4j(3.2.0）                                                      | [OpenStack](https://docs.openstack.org/api-quick-start/)            |
|  China    |     VM    |   Baidu     |    Yes    |   bce-java-sdk(0.10.87)                            | [baidu](https://cloud.baidu.com/doc/BCC/API.html)                   |
|  China    |     VM    |   JD        |    Yes    |   vm(1.2.5)                                        | [JD](https://docs.jdcloud.com/cn/virtual-machines/product-overview) |
|  China    |     VM    |   Qingcloud |    Yes    |   qingcloud-sdk-java(1.1.0)                        | [QingCloud](https://www.qingcloud.com/products/instances/)          |

