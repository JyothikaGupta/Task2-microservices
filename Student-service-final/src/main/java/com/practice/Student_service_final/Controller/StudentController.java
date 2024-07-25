package com.practice.Student_service_final.Controller;


import com.practice.Student_service_final.Model.Student;
import com.practice.Student_service_final.Service.StudentService;
import com.practice.Student_service_final.client.Courses;
import com.practice.Student_service_final.client.FullResponse;
import com.practice.Student_service_final.client.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/studentdetails")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addstudent")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);

    }

    @GetMapping("/getstudent")
    public List<Student> getStudent() {

        return studentService.getStudent();
    }

    @GetMapping("/getcoursedetails/{studentid}")
    public ResponseEntity<FullResponse> getCourses(@PathVariable int studentid){
        return ResponseEntity.ok(studentService.getCourses(studentid));
    }

    @GetMapping("/paymentdetails/{studentid}")
    public FullResponse getPaymentDetailsByStudentid(@PathVariable int studentid){
        return studentService.getPaymentDetailsByStudentid(studentid);

    }



}
