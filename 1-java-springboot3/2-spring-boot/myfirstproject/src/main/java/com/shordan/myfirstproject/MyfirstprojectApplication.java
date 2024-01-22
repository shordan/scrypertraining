package com.shordan.myfirstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyfirstprojectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MyfirstprojectApplication.class, args);
		
		Alien obj = context.getBean(Alien.class);
		obj.code();
	}

}
