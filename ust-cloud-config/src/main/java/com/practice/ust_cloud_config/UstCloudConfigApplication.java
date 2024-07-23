package com.practice.ust_cloud_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer

public class UstCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(UstCloudConfigApplication.class, args);
	}

}