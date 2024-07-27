package com.practice.Student_service_final.feign;


import com.practice.Student_service_final.client.Courses;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@FeignClient(name="course-details",url="http://localhost:9001/coursedetails")
public interface CourseClient {

    @GetMapping("/getcoursedetails/{studentId}")
    public List<Courses> getcourses(@PathVariable int studentId);
}
