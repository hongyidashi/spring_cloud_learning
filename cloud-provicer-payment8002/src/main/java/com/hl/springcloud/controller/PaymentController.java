package com.hl.springcloud.controller;

import com.hl.springcloud.entities.CommonResult;
import com.hl.springcloud.entities.Payment;
import com.hl.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult<Integer> create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("插入结果:" + result);
        if (result > 0) {
            return new CommonResult<>(200, "插入成功", result);
        } else {
            return new CommonResult<>(444, "插入失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment paymentById = paymentService.getPaymentById(id);
        log.info("查找结果如下:" + paymentById);
        if (paymentById != null) {
            return new CommonResult<>(200, "查询成功 ", paymentById);
        } else {
            return new CommonResult<>(444, "没有对应记录，查询id:" + id, null);
        }
    }

}