package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String greet(HttpServletRequest req) {
		return "Hello from greet method" + req.getSession().getId();
	}
	@GetMapping("/about")
	public String about(HttpServletRequest req) {
		return "Dhruvil"+req.getSession().getId();
	}
}
