package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		/*
		HOW TO PRINT APPLICATION PROPERTIES FOR DEBUGGING
		ConfigurableApplicationContext cac = SpringApplication.run(DemoApplication.class, args);
		System.out.println("===========================");
		System.out.println(cac.getEnvironment().getProperty("spring.datasource.url"));
		*/
	}

}
