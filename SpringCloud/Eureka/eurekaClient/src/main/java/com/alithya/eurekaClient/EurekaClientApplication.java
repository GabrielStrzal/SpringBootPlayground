package com.alithya.eurekaClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableFeignClients
@RestController
public class EurekaClientApplication {

	@Autowired
	private GreetingFeignClient greetingFeignClient;

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}

	@RequestMapping("/get-greeting")
	public String greeting(){
		return greetingFeignClient.greeting();
	}

}
