package com.zj.cloudprovidepayment.controller;

import com.zj.cloudapicommons.pojos.CommonResult;
import com.zj.cloudapicommons.pojos.Payment;
import com.zj.cloudprovidepayment.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    public CommonResult<Integer> create(@RequestBody Payment dept) {
        int i = paymentService.create(dept);
        log.info("***************插入成功*******" + i);
        if (i > 0) {
            return new CommonResult<Integer>(200, "插入数据库成功", i);
        } else {
            return new CommonResult<Integer>(444, "插入数据库失败", null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> queryById(@PathVariable("id") Long id) {
        Payment payment = paymentService.queryById(id);
        log.info("***************查询成功*********" + payment);
        if (payment != null) {
            return new CommonResult<Payment>(200, "查询成功", payment);
        } else {
            return new CommonResult<Payment>(444, "查询失败", null);
        }
    }

}
