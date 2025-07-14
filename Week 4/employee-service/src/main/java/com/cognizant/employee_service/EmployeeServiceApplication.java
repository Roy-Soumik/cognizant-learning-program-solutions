package com.cognizant.employee_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:employee.xml")
public class EmployeeServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}
}