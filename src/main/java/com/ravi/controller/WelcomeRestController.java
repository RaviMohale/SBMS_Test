package com.ravi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		
		return "welcome to linux";
	}
	
	@GetMapping("/greet")
	public String greetMsg() {
		return  "hi good morning";
	}

}
