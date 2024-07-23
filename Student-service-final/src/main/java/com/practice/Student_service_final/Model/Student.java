package com.practice.Student_service_final.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SqlResultSetMapping;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Student {
    @Id
    public Long id;
    public String name;
    public String course_enrolled;
    public String course_title;
    public boolean completed;


}
