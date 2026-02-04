package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Department {
	
	private int deptId;
	private String deptName;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public Department(@Value("${department.id}") int deptId, @Value("${department.name}") String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	
	public void displayDetails() {
		System.out.println("Department Id: " + deptId);
		System.out.println("Department Name: " + deptName);
	}
	
}
