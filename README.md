# WuKong

##  1. Backgroud

  We plan to use an automated method for generating adapters of service-based generic-API for hybrid clouds
  
  - [Case studies](https://ieeexplore.ieee.org/document/8705827): Yuanjia Xu, Heng Wu, Haijun Li, Yuewen Wu, Shijun Qin, Tianze Huang:
Wukong: Heuristic-Based Framework for Generating Generic-API for JointCloud. SOSE 2019
  - [Design](https://ieeexplore.ieee.org/document/9284174): Lei HUA, Ting Tang, Heng WU, He LIU, Wenbo ZHANG. A framework to support multi-cloud collaboration. IEEE Services 2020


##  2. Usage

### 2.1 Quick Start

```
cd core
mvn clean install -DskipTests

cd generator
mvn clean install -DskipTests
java -jar targets/wukong-generator-[version]-jar-with-dependencies.jar [1 or 2 or 3 or 4]
```

## 3. Document

- [API](docs/api.md)

##  4. Analysis

We describe the [operations](docs/Operations.md).suppoted by the system mentioned below.
Then, we give the parameters of each system in detail.


TABLE I: The list of supported System for VM service

|  Country  |   Type    |   Name    |  Offical  |  Version  |      Document       |
| :-------: | :-------: | :-------: | :-------: | :-------: |      :-------:      |
|  China    |     VM    |   Baidu     |    Yes    |   [bce-java-sdk(0.10.136)](core/conf/vm/baidu-bce.json)                           | [baidu](https://cloud.baidu.com/doc/BCC/API.html)                   |
|  China    |     VM    |   Aliyun    |    Yes    |   [aliyun-java-sdk-ecs(4.21.0)](core/conf/vm/aliyun-ecs.json)                     | [aliyun](https://help.aliyun.com/document_detail/25484.html)        |
|  China    |     VM    |   Tencent   |    Yes    |   [tencentcloud-sdk-java(3.1.157)](core/conf/vm/tencent-cvm)                       | [Tencent](https://intl.cloud.tencent.com/product/api)               |
|  China    |     VM    |   JD        |    Yes    |   [vm(1.3.4)](core/conf/vm/jdcloud-vm.json)                                        | [JD](https://docs.jdcloud.com/cn/virtual-machines/product-overview) |

TABLE II: The list of supported System for Kubernetes service

|  Country  |   Type    |   Name    |  Offical  |  Version  |      Document       |
| :-------: | :-------: | :-------: | :-------: | :-------: |      :-------:      |
|  China    |     VM    |   Aliyun    |    Yes    |   aliyun-java-sdk-cs(4.8.0)                      | [aliyun](https://help.aliyun.com/product/85222.html)        |


**Node that the value of "No" in column "Support" just means the related APIs
of target system does not satisfy our assumptions, we should reengineer the APIs**

Deprecated

|  Country  |   Type    |   Name    |  Offical  |  Version  |      Document       |
| :-------: | :-------: | :-------: | :-------: | :-------: |      :-------:      |
|  USA      |     VM    |   OpenStack |    No     |   openstack4j(3.2.0）                                                      | [OpenStack](https://docs.openstack.org/api-quick-start/)            |
|  China    |     VM    |   Qingcloud |    Yes    |   qingcloud-sdk-java(1.1.0)                        | [QingCloud](https://www.qingcloud.com/products/instances/)          |
|  USA      |     VM    |   Amazon    |    Yes    |   aws-java-sdk-ec2(1.11.799692)                       | [AWS](https://docs.aws.amazon.com/zh_cn/AmazonECS/latest/developerguide/logging-using-cloudtrail.html)                    |
|  USA      |     VM    |   Azure     |    Yes    |   [azure](https://github.com/Azure/azure-sdk-for-java.git)(1.34.0)                                    | [Azure](https://docs.azure.cn/zh-cn/virtual-machines/linux/quick-create-portal?toc=%2Fvirtual-machines%2Flinux%2Ftoc.json)|
|  USA      |     VM    |   Google    |    Yes    |   [google-api-services-compute](https://github.com/google/apis-client-generator.git)(v1-rev235-1.25.0）   | [Google](https://cloud.google.com/compute/docs/reference/rest/v1/)  |
