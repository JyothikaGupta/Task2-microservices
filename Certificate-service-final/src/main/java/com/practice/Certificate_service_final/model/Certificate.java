package com.practice.Certificate_service_final.model;


import com.practice.Certificate_service_final.client.Student;
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
    public int certificateid;

    public String certificateName;

    @ManyToOne
    @JoinColumn(name="id")
    private Student student;
    private boolean completed;

}
