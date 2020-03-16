package com.hl.springcloud.dao;

import com.hl.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Auther: pan
 * @Date: 2020/3/10 14:23
 * @Description: Dao
 */
@Mapper
public interface PaymentDao {

    int create(Payment payment);
    Payment getPaymentById(@Param("id") Long id);

}
