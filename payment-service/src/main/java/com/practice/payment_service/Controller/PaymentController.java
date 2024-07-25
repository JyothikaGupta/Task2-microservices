package com.practice.payment_service.Controller;

import com.practice.payment_service.Model.Payment;
import com.practice.payment_service.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/paymentdetails")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @GetMapping("/getpaymentdetails")

    public List<Payment> getPaymentDetails() {
        return paymentService.getPaymentDetails();
    }

    @PostMapping("/addpaymentdetails")
    public Payment addPaymentDetails(@RequestBody Payment payment) {
        return paymentService.addPaymentDetails(payment);
    }
    @GetMapping("/paymentdetails/{studentid}")
    public Payment getPaymentDetailsByStudentid(@PathVariable int studentid){
        return paymentService.getPaymentDetailsByStudentid(studentid);

    }




}
