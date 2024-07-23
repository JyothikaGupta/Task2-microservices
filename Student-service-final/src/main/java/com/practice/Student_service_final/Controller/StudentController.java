package com.practice.Student_service_final.Controller;


import com.practice.Student_service_final.Model.Student;
import com.practice.Student_service_final.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studentdetails")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addstudent")
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);

    }

    @GetMapping("getstudent")
    public List<Student> getStudent() {
        return studentService.getStudent();
    }



    @GetMapping("/getCompleted")
    List<Student> findByCompleted(@RequestParam boolean completed){
        return studentService.findByCompleted(completed);
    }




}
