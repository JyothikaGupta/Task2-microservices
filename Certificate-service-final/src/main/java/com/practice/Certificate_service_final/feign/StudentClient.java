package com.practice.Certificate_service_final.feign;

import com.practice.Certificate_service_final.client.Student;
import com.practice.Certificate_service_final.model.Certificate;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name="Student-service-final",url="http://localhost:8081/studentdetails")
public interface StudentClient {




    @GetMapping("/studentname/{name}")
    public String getStudentName(@PathVariable String name);


    List<Student> findByCompleted(boolean completed);

}
