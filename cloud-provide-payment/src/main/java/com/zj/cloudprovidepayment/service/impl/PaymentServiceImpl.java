package com.zj.cloudprovidepayment.service.impl;

import com.zj.cloudapicommons.pojos.Payment;
import com.zj.cloudprovidepayment.dao.PaymentDao;
import com.zj.cloudprovidepayment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment queryById(long id) {
        return paymentDao.queryById(id);
    }
}