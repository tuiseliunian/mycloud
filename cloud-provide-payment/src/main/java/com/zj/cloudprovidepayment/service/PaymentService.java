package com.zj.cloudprovidepayment.service;

import com.zj.cloudapicommons.pojos.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {

    int create(Payment payment);

    Payment queryById(@Param("id")long id);
}