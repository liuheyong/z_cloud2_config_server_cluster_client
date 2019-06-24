/{application}/{profile}[/{label}]
/{application}-{profile}.yml
/{label}/{application}-{profile}.yml
/{application}-{profile}.properties
/{label}/{application}-{profile}.properties

上面的url会映射{application}-{profile}.properties对应的配置文件，
其中{label}对应Git上不同的分支，默认为master。我们可以尝试构造不同的url来访问不同的配置内容，
比如，要访问master分支，config-client应用的dev环境，就可以访问这个
url：http://localhost:1201/config-client/dev/master


重要:::client项目的配置文件名称必须是bootstrap.properties或者bootstrap.yml


项目启动示范步骤：
启动z_cloud2_discover2 z_cloud2_config_server_cluster z_cloud2_config_server_cluster_client
访问 http://localhost:8146/cloud2/from 返回Git仓库中配置文件属性值