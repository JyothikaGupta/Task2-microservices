package com.practice.course_details.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int courseId;
    public int studentId;
    public String courseTitle;
    public Boolean courseCompleted;




}
