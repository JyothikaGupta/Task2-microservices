package com.practice.Student_service_final.Service;

import com.practice.Student_service_final.Model.Student;
import com.practice.Student_service_final.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public void addStudent(Student student) {
        studentRepo.save(student);
    }

    public List<Student> getStudent() {
        return studentRepo.findAll();
    }

//    public List<Student> getStudentsByCourseCompletion(boolean completed) {
//        return studentRepo.findByCompleted(completed);
//    }


    public List<Student> findByCompleted(boolean completed) {
        return studentRepo.findByCompleted(completed);
    }

}
