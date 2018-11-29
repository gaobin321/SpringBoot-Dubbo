项目简介
-----
脚手架框架代码，后续项目迭代代码参考原型

包含的内容
-----
arris-dubbo-api RPC接口层：服务提供者、消费者共同依赖的接口定义
arris-dubbo-common domain层 ：ben 和公共枚举、工具类
arris-dubbo-reposity 持久层 ：mapper mapper.xml
arris-dubbo-service 本地服务层： 基础service
arris-dubbo-rpc RPC接口实现层，提供远程调用的服务实现，也是进程入口
arris-dubbo-web WEB 服务聚合层，服务消费者，对外提供HTTP接口

arris-dubbo-web 与 arris-dubbo-rpc 两个单独打包部署，不同的Jar包。
arris-dubbo-web module功能同 wenba-arris-dubbo-web 项目
https://github.com/gaobin321/SpringBoot-Dubbo-Web.git

使用方式
-----

后期会将框架结构制作成Maven archetype，方便快速自动生成新的迭代项目代码
