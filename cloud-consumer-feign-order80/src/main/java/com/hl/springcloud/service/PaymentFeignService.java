package com.hl.springcloud.service;

import com.hl.springcloud.entities.CommonResult;
import com.hl.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Auther: panhongtong
 * @Date: 2020/3/11 16:45
 * @Description:
 */
@Component
@FeignClient(value = "consul-provider-payment")
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

}
