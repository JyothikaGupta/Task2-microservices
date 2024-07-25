package com.practice.Student_service_final.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class FullResponse {

    private int studentId;
    private String studentName;
//    private List<String> courses;
    private List<Courses> courses;
    private Payment payment;

}
