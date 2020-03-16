package com.hl.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: pan
 * @Date: 2020/3/10 12:02
 * @Description: 主启动类
 */
@SpringBootApplication
@MapperScan(basePackages = "com.hl.springcloud.dao")
public class PaymentMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class, args);
    }
}
