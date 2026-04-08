package com.snz.chapter2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.snz.chapter2.example2")
public class Chapter2Application {

	public static void main(String[] args) {

		SpringApplication.run(Chapter2Application.class, args);
	}

}
