## 该项目是一个简单的SpringCloud demo项目
1. cloud-config-repo 存放配置文件仓库
2. cloud-config-server 获取配置文件的服务
3. cloud-euraka-server 注册服务
4. cloud-simple-service-use-config 获取用户数据的服务
5. cloud-simple-ui 用户界面服务

## 启动顺序
1. cloud-config-server
2. cloud-euraka-server
3. cloud-simple-service-use-config
4. cloud-simple-ui

## 初始化数据库
本项目使用的是mysql，将仓库根目录下面的init.sql在MySQL中选择
任一数据库执行，配置配置文件的时候配置成该数据库就行

## 关于数据库配置文件
因为使用的微服务将数据库配置文件放在远程，
也就是本仓库的 cloud-config-repo文件夹下面的
* cloud-config-dev.properties(dev环境的配置文件)
* cloud-config-test.properties(测试环境的配置文件)

1. 因为与你数据库环境不一致,所以需要创建
    一个自己的存放数据库配置文件的仓库，在仓库下面创建一个文件夹，然后创建与上面
    同名的两个配置文件，文件名不能修改，里面的参数写成
    你的数据库的密码，用户名，链接等。
2. 修改项目下文件夹cloud-config-server\src\main\resources\application.properties下
    spring.cloud.config.server.git.uri=你的存放你在第一步中
    创建的仓库地址，
    spring.cloud.config.server.git.searchPaths=第一步创建的文件夹名称
    