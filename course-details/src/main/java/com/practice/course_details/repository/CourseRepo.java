package com.practice.course_details.repository;

import com.practice.course_details.model.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepo extends JpaRepository<Courses,Integer> {
    List<Courses> findByStudentId(int studentId);
}
