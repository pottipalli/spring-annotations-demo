package com.myguru;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.myguru.employee")
public class EmployeeConfig {
	
	@Bean
	public Employee employeeBean() {
		return new Employee();
	}

}
