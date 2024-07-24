package com.practice.Student_service_final;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication


public class StudentServiceFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentServiceFinalApplication.class, args);
	}

}
