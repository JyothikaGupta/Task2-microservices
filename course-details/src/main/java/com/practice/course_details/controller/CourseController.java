package com.practice.course_details.controller;

import com.practice.course_details.model.Courses;
import com.practice.course_details.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/coursedetails")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/getcoursedetails/{studentid}")
    public ResponseEntity<List<Courses>> getcourses(@PathVariable int studentid){
        return ResponseEntity.ok(courseService.getCourses(studentid));
    }


    @PostMapping("/add")
    public void addCourse(@RequestBody Courses course) {
        courseService.addCourse(course);
    }


}
