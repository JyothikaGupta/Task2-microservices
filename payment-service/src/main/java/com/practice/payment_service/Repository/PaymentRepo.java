package com.practice.payment_service.Repository;

import com.practice.payment_service.Model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PaymentRepo  extends JpaRepository<Payment,Integer> {
   // public Payment getDetailsPaymentById(int studentid);

    //public Payment findPaymentDetailsByStudentid(int studentid);
    //@Query("SELECT CASE WHEN COUNT(p) > 0 THEN true ELSE false END FROM Payment p WHERE p.paymentDone = true")
    @Query("SELECT CASE WHEN COUNT(p) > 0 THEN true ELSE false END FROM Payment p WHERE p.studentid = ?1 AND p.paymentDone = true")
    public boolean isPaymentDone(int studentid);

}
