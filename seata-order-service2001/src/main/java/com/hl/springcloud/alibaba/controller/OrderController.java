package com.hl.springcloud.alibaba.controller;

import com.hl.springcloud.alibaba.domain.CommonResult;
import com.hl.springcloud.alibaba.domain.Order;
import com.hl.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建完成");
    }



}
