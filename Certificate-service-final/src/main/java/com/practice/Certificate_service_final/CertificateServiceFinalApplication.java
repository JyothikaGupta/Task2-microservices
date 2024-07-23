package com.practice.Certificate_service_final;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "com.practice.Certificate_service_final")
@EnableFeignClients



public class CertificateServiceFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CertificateServiceFinalApplication.class, args);
	}

}
