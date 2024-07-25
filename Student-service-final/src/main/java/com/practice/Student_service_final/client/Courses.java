package com.practice.Student_service_final.client;

import com.practice.Student_service_final.Model.Student;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Courses {
    public int courseId;
    public int studentId;
    public String courseTitle;
    public Boolean courseCompleted;

}
