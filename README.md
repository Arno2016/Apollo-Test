# Apollo-Test


1. 创建 src/main/resource/META-INF/app.properties，添加如下内容

```
app.id=test
```

2. 创建 src/main/resource/apollo-env.properties,添加apollo-admin服务端口

```
#local.meta=http://10.168.16.125:8080
dev.meta=http://192.168.62.128:8080
```

3. 启动参数：

```
eg.java xx.jar -Denv=Dev -Dapollo.cluster=feature1
```
