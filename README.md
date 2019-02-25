    ███████╗██████╗ ██████╗ ██╗███╗   ██╗ ██████╗     ███╗   ██╗██████╗ 
    ██╔════╝██╔══██╗██╔══██╗██║████╗  ██║██╔════╝     ████╗  ██║██╔══██╗
    ███████╗██████╔╝██████╔╝██║██╔██╗ ██║██║  ███╗    ██╔██╗ ██║██████╔╝
    ╚════██║██╔═══╝ ██╔══██╗██║██║╚██╗██║██║   ██║    ██║╚██╗██║██╔══██╗
    ███████║██║     ██║  ██║██║██║ ╚████║╚██████╔╝    ██║ ╚████║██████╔╝
    ╚══════╝╚═╝     ╚═╝  ╚═╝╚═╝╚═╝  ╚═══╝ ╚═════╝     ╚═╝  ╚═══╝╚═════╝ 
    --------------------------------------------------------------------------------------
# **SpringCloud基础教程(demo版)**

[SpringCloud Documentation](https://spring.io/docs)

[SpringCloud中文](https://springcloud.cc/)

该项目是作者在学校SpringCloud时写的demos,主要目的是快速接入SpringCloud，降低学习门槛,代码有问题请提ISSUE

不定期更新

## 1.SpringBoot RestFul实例
Swagger2是一款为SpringBoot RESTFul而生的在线API文档框架
## 2.SpringCloud Eureka服务发现与注册
Eureka是Spring Cloud Netflix微服务套件中的一部分，可以与Springboot构建的微服务很容易的整合起来。
Eureka包含了服务器端和客户端组件。服务器端，也被称作是服务注册中心，用于提供服务的注册与发现。Eureka支持高可用的配置，当集群中有分片出现故障时，Eureka就会转入自动保护模式，它允许分片故障期间继续提供服务的发现和注册，当故障分片恢复正常时，集群中其他分片会把他们的状态再次同步回来。
客户端组件包含服务消费者与服务生产者。在应用程序运行时，Eureka客户端向注册中心注册自身提供的服务并周期性的发送心跳来更新它的服务租约。同时也可以从服务端查询当前注册的服务信息并把他们缓存到本地并周期性的刷新服务状态。
## 3.SpringCloud Ribbon负载均衡配置

## 4.申明式调用Fegin配置

## 5.熔断器Hystrix配置

## 6.Spring Cloud Seluth服务链路追踪

## 7.Spring Cloud Config配置中心

## 8 .Spring Cloud Zuul 网关

## 9.SpringCloud OAuth2

![img](https://spring.io/img/homepage/diagram-distributed-systems.svg)
