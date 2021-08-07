package com.myguru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class SpringAnnotationsDemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringAnnotationsDemoApplication.class, args);
		//ApplicationContext context = new ClassPathXmlApplicationContext("com/myguru/application.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(Employee.class);
		Employee employee = context.getBean("employeeBean", Employee.class);
		System.out.println("Employee:"+employee);
		
		((AnnotationConfigApplicationContext)context).close();
	}

}
