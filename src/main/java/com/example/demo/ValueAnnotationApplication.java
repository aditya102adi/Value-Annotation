package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ValueAnnotationApplication {

	public static void main(String[] args) {
		ApplicationContext ioc = SpringApplication.run(ValueAnnotationApplication.class, args);
		
		Department dept = ioc.getBean(Department.class);
		Employee emp = ioc.getBean(Employee.class);
		
		dept.displayDetails();
		emp.displayDetails();
	}

}
