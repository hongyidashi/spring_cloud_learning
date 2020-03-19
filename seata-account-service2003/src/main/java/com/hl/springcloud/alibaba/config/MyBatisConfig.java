package com.hl.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.hl.springcloud.alibaba.dao")
public class MyBatisConfig {
}
