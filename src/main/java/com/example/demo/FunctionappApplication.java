package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FunctionappApplication {

	@GetMapping("/functionapp")
	public String message() {
		return "Hello Om your simple function app is deployed.";
	}
	public static void main(String[] args) {
		SpringApplication.run(FunctionappApplication.class, args);
	}

}
