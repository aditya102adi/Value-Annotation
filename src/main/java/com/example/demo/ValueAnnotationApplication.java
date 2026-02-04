package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ValueAnnotationApplication {

	public static void main(String[] args) {
		ApplicationContext ioc = SpringApplication.run(ValueAnnotationApplication.class, args);
		
		Employee emp = ioc.getBean(Employee.class);
		emp.displayDetails();
		
	}

}
