package com.practice.payment_service.Service;

import com.practice.payment_service.Model.Payment;
import com.practice.payment_service.Repository.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class PaymentService {

    @Autowired
    private PaymentRepo paymentRepo;

    public List<Payment> getPaymentDetails() {
        return paymentRepo.findAll();
    }

    public Payment addPaymentDetails(Payment payment) {
        return paymentRepo.save(payment);
    }



    public Payment getPaymentDetailsByStudentid(int studentid) {
        return paymentRepo.findPaymentDetailsByStudentid(studentid);
    }
}
