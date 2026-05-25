package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Users;
import com.example.demo.repo.UserRepo;

@RestController
@RequestMapping("/users")
public class UserController {
	private final UserRepo repo;

	public UserController(UserRepo repo) {
		this.repo = repo;
	}

	@GetMapping
	public List<Users> getAllUsers() {
		return repo.findAll();
	}

	@PostMapping
	public Users addUser(@RequestBody Users user) {
		return repo.save(user);
	}
}
