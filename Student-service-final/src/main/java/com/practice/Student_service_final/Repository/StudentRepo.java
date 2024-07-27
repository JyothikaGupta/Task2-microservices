package com.practice.Student_service_final.Repository;

import com.practice.Student_service_final.Model.Student;
import com.practice.Student_service_final.client.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public interface StudentRepo extends JpaRepository<Student, Integer> {



//    @Query("SELECT c FROM Courses c WHERE c.student.id = :studentid")
//    Optional<Courses> findCoursesByStudentid(@Param("studentid") int studentid);


    Student findByStudentId(int studentId);


}


