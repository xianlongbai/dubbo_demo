## springboot+zookeeper+dubbo的简单搭建使用
### dubbo架构说明
![](https://github.com/xianlongbai/boot_dubbo_zk/blob/master/dubbo%E6%9E%B6%E6%9E%84.png)
#### 各节点作用：
* Provider：暴露服务的服务提供方，或者直白点说就是服务生产者
* Consumer：调用远程服务的服务消费方，也就是服务消费者
* Registry：服务注册与发现的注册中心,也就是利用了zookeeper
* Monitor：统计服务的调用次数和调用时间的监控中心
* Container：服务（生产者）运行容器
### 项目搭建说明
* 该项目dubbo-consumer和dubbo-provider分别为服务消费端和服务生产端，注册中心为zookeeper
* 我使用的这个版本springboot默认对dubbo不支持,所以为了使用dubbo.xml的方式进行整合（springboot2.x应该已经支持dubbo了）
* dubbo.xml的配置方式有两种，自动扫描+注解(推荐)，xml方式配置：需要每个服务在xml中配置，比较麻烦
   

### dubbo-admin服务管理平台的安装
1.	去https://github.com/apache/incubator-dubbo下载对应的dubbo-admin源码包
2.	编译admin源码包：mvn clean package -DskipTests
3.	将编译好的war包塞到tomcat中解压，解压完成后修改dubbo.properties配置项
4.	重新启动tomcat即可
5.  注意对应各种版本
    * tomcat  7.x
    * jdk     1.7.x
    * zookeeper   3.4.10
6.  已经编译好一个dubbo-admin-2.5.4.war,放在项目路径下


