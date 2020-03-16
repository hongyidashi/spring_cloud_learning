package com.hl.springcloud.service.impl;

import com.hl.springcloud.dao.PaymentDao;
import com.hl.springcloud.entities.Payment;
import com.hl.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Auther: pan
 * @Date: 2020/3/10 14:46
 * @Description:
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
