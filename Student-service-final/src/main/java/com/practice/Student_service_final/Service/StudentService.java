package com.practice.Student_service_final.Service;

import com.practice.Student_service_final.Model.Student;
import com.practice.Student_service_final.Repository.StudentRepo;
import com.practice.Student_service_final.client.*;
import com.practice.Student_service_final.feign.CertificateClient;
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

    @Autowired
    private CertificateClient client3;

    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }

    public List<Student> getStudent() {
        return studentRepo.findAll();
    }

    public FullResponseCourses getCourses(int studentid) {
        Optional<Student> student = studentRepo.findById(studentid);
        if (student.isEmpty()) {
            // Handle the case where the student is not found, e.g., throw an exception or return a default response
            throw new RuntimeException("Student not found with id: " + studentid);
        }
        Student s = student.get();
        List<Courses> list = client.getcourses(studentid);
        FullResponseCourses fullResponse = new FullResponseCourses();
        fullResponse.setStudentId(s.getStudentId());
        fullResponse.setStudentName(s.getStudentName());
        fullResponse.setCourses(list);
        return fullResponse;
    }

    public boolean getPaymentStatus(int studentid) {
        Payment payment = new Payment();

        // Fetch student details
        Student student = studentRepo.findByStudentId(studentid);

        // Fetch payment status from the client
        boolean isPaymentDone = client2.getPaymentStatus(studentid);

        // Set attributes in the Payment object
        payment.setStudentid(studentid); // Assuming Payment class has a studentId field
        payment.setPaymentdone(isPaymentDone); // Set payment status based on client response

        // Return the populated Payment object
        return isPaymentDone;

    }


    public FullResponse getCertificateByStudentId(int studentId) {
        Optional<Student> certificate = studentRepo.findById(studentId);
        if (certificate.isEmpty()) {
            // Handle the case where the student is not found, e.g., throw an exception or return a default response
            throw new RuntimeException("Student not found with id: " + studentId);
        }
        Student c = certificate.get();
        List<Certificate> list = client3.getCertificatedetailsByStudentId(studentId);
        FullResponse fullResponse = new FullResponse();


        fullResponse.setCertificate(list);

        return fullResponse;

    }
}
