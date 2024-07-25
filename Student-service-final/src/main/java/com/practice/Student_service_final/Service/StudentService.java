package com.practice.Student_service_final.Service;

import com.practice.Student_service_final.Model.Student;
import com.practice.Student_service_final.Repository.StudentRepo;
import com.practice.Student_service_final.client.Courses;
import com.practice.Student_service_final.client.FullResponse;
import com.practice.Student_service_final.client.Payment;
import com.practice.Student_service_final.feign.CourseClient;
import com.practice.Student_service_final.feign.PaymentClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private CourseClient client;
    @Autowired
    private PaymentClient client2;

    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }

    public List<Student> getStudent() {
        return studentRepo.findAll();
    }

    public FullResponse getCourses(int studentid) {
        Optional<Student> student = studentRepo.findById(studentid);
        if (student.isEmpty()) {
            // Handle the case where the student is not found, e.g., throw an exception or return a default response
            throw new RuntimeException("Student not found with id: " + studentid);
        }

        Student s = student.get();
        System.out.println("student"+s);
        List<Courses> list = client.getcourses(studentid);
        System.out.print("list"+list);

        FullResponse fullResponse = new FullResponse();
        fullResponse.setStudentId(s.getStudentId());
        fullResponse.setStudentName(s.getStudentName());
        fullResponse.setCourses(list);

        return fullResponse;
    }

    public FullResponse getPaymentDetailsByStudentid(int studentid) {
        Student s1=studentRepo.findByStudentId(studentid);
        Payment list=client2.getPaymentDetailsByStudentid(studentid);
        FullResponse res=new FullResponse();
        res.setStudentId(s1.getStudentId());
        res.setStudentName(s1.getStudentName());

        res.setPayment(list);
        return res;
    }

}
