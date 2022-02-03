package com.cognizant.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class DoctorportalApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorportalApiGatewayApplication.class, args);
	}

}
