package com.strzal.backendproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BackendProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendProductApplication.class, args);
	}


	@GetMapping
	@RequestMapping("/echo/{name}")
	public String getEcho(@PathVariable("name") String name){
		return "hello " + name;
	}


	@GetMapping
	@RequestMapping("/product/{name}")
	public Product getProduct(@PathVariable("name") String name){
		return new Product(name, 10);
	}

}
