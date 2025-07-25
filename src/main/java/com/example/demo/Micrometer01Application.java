package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Micrometer01Application {

	@GetMapping("/msg")
	public String getMsg() {
		return "good morning";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Micrometer01Application.class, args);
	}

}
