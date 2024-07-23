package com.practice.Certificate_service_final.client;


import com.practice.Certificate_service_final.model.Certificate;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="student")
public class Student {
    @Id
    public Long id;
    public String name;
    public String course_enrolled;
    public String course_title;
    public boolean completed;


    public Student(Long id, String name, String course_title) {
        this.id = id;
        this.name = name;
        this.course_title = course_title;
    }
}
