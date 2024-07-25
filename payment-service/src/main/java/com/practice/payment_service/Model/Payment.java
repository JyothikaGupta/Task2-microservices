package com.practice.payment_service.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Payment {
    @Id
    public int paymentid;
    public int studentid;
    public boolean paymentdone;


}
