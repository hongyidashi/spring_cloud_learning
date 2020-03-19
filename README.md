# springcloud学习

#### 介绍
springcloud学习代码

#### 版本说明
1. springboot版本为 2.2.2.RELEASE
2. springcloud版本为 Hoxton.RELEASE
3. MySQL版本为 8.0.18
4. springcloud-alibaba版本为 2.2.0.RELEASE

## 模块说明
### springcloud部分
   - 公共api:cloud-api-commons
   - 基础模块（用于测试微服是否搭建成功）
       - cloud-comsumer-order80
       - cloud-provicer-payment8002
   - 服务发现与注册-<b>consul</b>
       - cloud-consumer-consul-order80
       - cloud-providerconsul-payment8005
       - cloud-providerconsul-payment8006
   - 负载均衡-<b>Ribbon&Feign</b>
       - cloud-consumer-feign-order80
   - 服务降级和熔断-<b>hystrix</b>
       - cloud-consumer-hystrix-dashboard9001
       - cloud-provider-hystrix-payment8007
   - 消息驱动-<b>Stream</b>
       - cloud-stream-rabbitmq-consumer8802
       - cloud-stream-rabbitmq-consumer8803
       - cloud-stream-rabbitmq-provider8801

### springcloud-alibaba部分
   - 服务注册发现与配置中心-<b>Nacos</b>
       - cloudalibaba-consumer-nacos-Order83
       - cloudalibaba-consumer-nacos-order84
       - cloudalibaba-config-nacos-client3377
       - cloudalibaba-provider-payment9001
       - cloudalibaba-provider-payment9002
   - 流量卫兵-<b>Sentinel</b>
       - cloudalibaba-sentinel-service8401
       - cloudalibaba-provider-payment9003
       - cloudalibaba-provider-payment9004
   - 分布式事务解决-<b>Seata</b>
       - seata-order-service2001
       - seata-storage-service2002
       - seata-account-service2003

#### 使用说明
1.  学习过程中用到的中间件在<b>software</b>里
2.  学习过程中用到的部分SQL在<b>sql</b>中
