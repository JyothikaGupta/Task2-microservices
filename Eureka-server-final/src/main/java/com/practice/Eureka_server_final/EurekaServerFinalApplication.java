package com.practice.Eureka_server_final;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication

@EnableEurekaServer

public class EurekaServerFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerFinalApplication.class, args);
	}

}
