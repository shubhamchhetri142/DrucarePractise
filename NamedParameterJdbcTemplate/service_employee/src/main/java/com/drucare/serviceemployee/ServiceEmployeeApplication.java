package com.drucare.serviceemployee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Configuration
@SpringBootApplication
@PropertySource("classpath:application.properties")
public class ServiceEmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceEmployeeApplication.class, args);
	}

}
