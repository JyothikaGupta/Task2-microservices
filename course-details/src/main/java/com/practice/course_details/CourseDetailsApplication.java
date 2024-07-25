package com.practice.course_details;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication

public class CourseDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseDetailsApplication.class, args);
	}

}
