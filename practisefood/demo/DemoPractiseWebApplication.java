package com.practisefood.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.practisefood.demo.Contoller.ControllerDemo;
@PropertySource("classpath:application.properties")
@Configuration
@SpringBootApplication
public class DemoPractiseWebApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(DemoPractiseWebApplication.class, args);
		context.getBean(ControllerDemo.class);
	}

}
