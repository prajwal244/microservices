package com.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;







@SpringBootApplication
@EnableEurekaClient

public class SpringGateway01Application {


	public static void main(String[] args) {
		SpringApplication.run(SpringGateway01Application.class, args);
	}
}
