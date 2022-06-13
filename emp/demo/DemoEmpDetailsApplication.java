package com.emp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.emp.demo.Controller.EmpController;

@SpringBootApplication
public class DemoEmpDetailsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(DemoEmpDetailsApplication.class, args);
		context.getBean(EmpController.class);
	}

}
