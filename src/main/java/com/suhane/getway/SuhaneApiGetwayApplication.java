package com.suhane.getway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SuhaneApiGetwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuhaneApiGetwayApplication.class, args);
	}

}
