package com.hl.springcloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.hl.springcloud.alibaba.myhandler.CoustomerBlockHandler;
import com.hl.springcloud.entities.CommonResult;
import com.hl.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RateLimitController {

    @GetMapping("/byResource")
    @SentinelResource(value = "byResource", blockHandler = "handleException")
    public CommonResult byResource() {
        return new CommonResult(200, "按资源名称限流测试ok", new Payment(2020L, "serial001"));
    }
    public CommonResult handleException(BlockException exception) {
        return new CommonResult(444, exception.getClass().getCanonicalName() + "\t 服务不可用");
    }

    @GetMapping("/rateLimit/CustomerBlockHandler")
    @SentinelResource(value = "coustomerBlockHandler", blockHandlerClass = CoustomerBlockHandler.class,
    blockHandler = "coustomerBlockHandler2")
    public CommonResult coustomerBlockHandler() {
        return new CommonResult(200, "测试客户自定义限流处理方法", new Payment(2020L, "serial002"));
    }
}
