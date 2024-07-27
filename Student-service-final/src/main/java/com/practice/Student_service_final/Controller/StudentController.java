package com.practice.Student_service_final.Controller;


import com.practice.Student_service_final.Model.Student;
import com.practice.Student_service_final.Service.StudentService;
import com.practice.Student_service_final.client.Certificate;
import com.practice.Student_service_final.client.FullResponse;
import com.practice.Student_service_final.client.FullResponseCourses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/getcoursedetails/{studentId}")
    public ResponseEntity<FullResponseCourses> getCourses(@PathVariable int studentId){
        return ResponseEntity.ok(studentService.getCourses(studentId));
    }

    @GetMapping("/paymentstatus/{studentid}")
    public boolean getPaymentStatus(@PathVariable int studentid){
        return studentService.getPaymentStatus(studentid);
    }
    @GetMapping("/getcertificatedetails/{studentId}")
    public ResponseEntity<FullResponse> getCertificatedetailsByStudentId(@PathVariable int studentId) {
        return  ResponseEntity.ok(studentService.getCertificateByStudentId(studentId));
    }




}
