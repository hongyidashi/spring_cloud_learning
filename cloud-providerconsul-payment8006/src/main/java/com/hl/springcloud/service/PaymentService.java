package com.hl.springcloud.service;

import com.hl.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Auther: pan
 * @Date: 2020/3/10 14:45
 * @Description:
 */
public interface PaymentService {

    int create(Payment payment);
    Payment getPaymentById(@Param("id") Long id);

}
