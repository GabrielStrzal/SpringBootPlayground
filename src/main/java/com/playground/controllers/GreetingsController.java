package com.playground.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
	
	@RequestMapping("/")
    String greetings(@RequestParam(value="name", defaultValue="World") String name) {
        return "Hello " + name;
    }

}
