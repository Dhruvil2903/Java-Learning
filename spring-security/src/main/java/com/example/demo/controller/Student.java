package com.example.demo.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@AllArgsConstructor

@NoArgsConstructor	
public class Student {

	private int id;
	private String name;
	private String tech;
	
	public Student(int id, String name, String tech) {
	
		this.id = id;
		this.name = name;
		this.tech = tech;
	}
	
	
}
