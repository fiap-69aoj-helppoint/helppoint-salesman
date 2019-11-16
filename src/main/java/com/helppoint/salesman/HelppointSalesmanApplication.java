package com.helppoint.salesman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HelppointSalesmanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelppointSalesmanApplication.class, args);
	}


}
