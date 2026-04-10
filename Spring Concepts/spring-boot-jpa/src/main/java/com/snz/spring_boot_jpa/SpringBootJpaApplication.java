package com.snz.spring_boot_jpa;

import com.snz.spring_boot_jpa.dao.StudentDao;
import com.snz.spring_boot_jpa.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
public class SpringBootJpaApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootJpaApplication.class, args);

	}

//	@Bean
//	public CommandLineRunner commandLineRunner(StudentDao studentDao) {
//		return s ->createStudent(studentDao);
//	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDao studentDao) {
		return s ->readStudent(studentDao);
	}

	public void createStudent(StudentDao studentDao){
		System.out.println("Creating student object");
		Student student = new Student("John", "Doe", "abc@gmail.com");

		System.out.println("Saving the student");
		studentDao.save(student);

		System.out.println("Saved Student Id is "+student.getId());
	}

	public void readStudent(StudentDao studentDao){
		System.out.println("Enter student id to find");
		Scanner sc = new Scanner(System.in);
		studentDao.findById(sc.nextInt());
	}

}
