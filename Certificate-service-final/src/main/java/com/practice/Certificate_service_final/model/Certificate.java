package com.practice.Certificate_service_final.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="certificate")

public class Certificate {
    @Id
    public int studentId;
    public int certificateid;

    public String certificateName;
    public String completed;




}
