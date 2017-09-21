##该项目是一个简单的SpringCloud demo项目
1. cloud-config-repo 存放配置封建仓库
2. cloud-config-server 获取配置文件的仓库
3. cloud-euraka-server 注册服务
4. cloud-simple-service-use-config 获取用户数据的服务
5. cloud-simple-ui 用户界面服务

## 启动顺序
1. cloud-config-server
2. cloud-euraka-server
3.cloud-simple-service-use-config
4.cloud-simple-ui

## 关于数据库配置文件
因为使用的微服务将数据库配置文件放在远程，
也就是 cloud-config-repo文件夹下面的
*. cloud-config-dev.properties
*. cloud-config-test.properties

1. 因为与你的数据库环境不一致,所以需要修改，建议创建
一个自己的存放数据库配置文件的仓库，然后创建与上面
同名的两个配置文件，名字不能修改，里面的参数可以成
你的数据库的密码用户名等。
2. 修改cloud-config-server\src\main\resources\application.properties下
    spring.cloud.config.server.git.uri为你的存放你在第一步中
    创建的地址，
    spring.cloud.config.server.git.searchPaths修改为你存放
    配置文件的文件夹