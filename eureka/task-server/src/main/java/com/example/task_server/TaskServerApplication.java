package com.example.task_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TaskServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskServerApplication.class,
				args);
	}
}
