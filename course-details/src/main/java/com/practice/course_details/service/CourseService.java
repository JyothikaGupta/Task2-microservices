package com.practice.course_details.service;

import com.practice.course_details.model.Courses;
import com.practice.course_details.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    private CourseRepo repo;
//    public Optional<Courses> getCourses(Long studentid) {
//        return repo.findById(studentid);
//    }

    public void addCourse(Courses course) {
        repo.save(course);
    }
    public List<Courses> getCourses(int studentid){
        return repo.findByStudentId(studentid);
    }
}
