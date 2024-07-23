package com.practice.Student_service_final.Repository;

import com.practice.Student_service_final.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface StudentRepo extends JpaRepository<Student, Long> {
//    List<Student> findByCompleted(boolean completed);
    @Query("SELECT s FROM Student s WHERE s.completed = :completed")
    List<Student> findByCompleted(@Param("completed") boolean completed);

    //List<Student> getStudentsByCourseCompletion(Boolean completed);
}


