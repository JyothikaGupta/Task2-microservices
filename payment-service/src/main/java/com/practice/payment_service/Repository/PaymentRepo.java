package com.practice.payment_service.Repository;

import com.practice.payment_service.Model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo  extends JpaRepository<Payment,Integer> {
   // public Payment getDetailsPaymentById(int studentid);

    public Payment findPaymentDetailsByStudentid(int studentid);
}
