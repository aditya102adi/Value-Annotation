package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private int empId;
	private String empName;
	private double empSalary;
	
	private Department department;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	
	@Autowired
	public Employee(@Value("${Employee.id}") int empId, @Value("${employee.name}") String empName, @Value("${employee.salary}") double empSalary, Department department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.department = department;
	}
	
	public void displayDetails() {
		System.out.println("Employee Id: " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Salary: " + empSalary);
		department.displayDetails();
	}
	
}
