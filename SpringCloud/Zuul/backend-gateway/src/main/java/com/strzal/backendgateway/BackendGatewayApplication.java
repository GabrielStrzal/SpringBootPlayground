package com.strzal.backendgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class BackendGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendGatewayApplication.class, args);
	}

}
