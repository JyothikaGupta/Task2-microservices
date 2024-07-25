package com.practice.Student_service_final.feign;

import com.practice.Student_service_final.client.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(name="payment-service",url="http://localhost:9003/paymentdetails")
public interface PaymentClient {
    @GetMapping("/paymentdetails/{studentid}")

    public Payment getPaymentDetailsByStudentid(@PathVariable int studentid);
}
