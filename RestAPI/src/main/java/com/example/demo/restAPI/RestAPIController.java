package com.example.demo.restAPI;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greeting/")
public class RestAPIController {

	@GetMapping()
	public String greetings() {
		return  "Hello World";
	}
}
