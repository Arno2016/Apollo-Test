# Apollo-Test


服务端部署：https://github.com/ctripcorp/apollo/wiki/分布式部署指南

源码：https://github.com/ctripcorp/apollo

客户端：

1. pom文件，从源码编译上传到仓库

```
<dependency>
    <groupId>com.ctrip.framework.apollo</groupId>
    <artifactId>apollo-client</artifactId>
    <version>1.3.0-SNAPSHOT</version>
</dependency>
```


2. 创建 src/main/resource/META-INF/app.properties，添加如下内容

```
app.id=test
```

3. 创建 src/main/resource/apollo-env.properties,添加apollo-configservice服务端口

```
#local.meta=http://10.168.16.125:8080
dev.meta=http://192.168.62.128:8080
```

4. 启动参数：

```
eg.java xx.jar -Denv=Dev -Dapollo.cluster=feature1
```
