package com.practice.Student_service_final.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Payment {
    public int paymentid;
    public int studentid;
    public boolean paymentdone;
}
