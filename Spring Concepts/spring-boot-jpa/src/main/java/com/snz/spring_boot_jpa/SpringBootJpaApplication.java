package com.snz.spring_boot_jpa;

import com.snz.spring_boot_jpa.dao.StudentDao;
import com.snz.spring_boot_jpa.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SpringBootJpaApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootJpaApplication.class, args);

	}

//	@Order(1)
//	@Bean
//	public CommandLineRunner commandLineRunner1(StudentDao studentDao) {
//		return s ->createStudent(studentDao);
//	}

//	@Bean
//	public CommandLineRunner commandLineRunner(StudentDao studentDao) {
//		return s ->readStudent(studentDao);
//	}

//	@Order(2)
//	@Bean
//	public CommandLineRunner commandLineRunner(StudentDao studentDao) {
//		return s -> {
//			findAll(studentDao);
//		};
//	}

//	@Order(3)
	@Bean
	public CommandLineRunner commandLineRunner2(StudentDao studentDao) {
		return s -> {
//			findByLastName(studentDao);
//			update(studentDao);
//			delete(studentDao);
			deleteAll(studentDao);
		};
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

	public void findAll(StudentDao studentDao){
		for(Student student : studentDao.findAll()){
			System.out.println(student);
		}
	}

	public void findByLastName(StudentDao studentDao){
		System.out.println("Enter last name to find");
		Scanner sc = new Scanner(System.in);
		List<Student> list = studentDao.findByLastName(sc.next());
		for (Student student : list) {
			System.out.println(student);
		}
	}

	public void update(StudentDao studentDao) {
		Student student = studentDao.findById(1);
		student.setLast_name("Mn");
		studentDao.update(student);
		System.out.println("Updated student: " + student);
	}

	public void delete(StudentDao studentDao) {
		System.out.println("Enter student id to delete");
		Scanner sc = new Scanner(System.in);
		studentDao.delete(sc.nextInt());
	}

	public void deleteAll(StudentDao studentDao) {
		System.out.println("Deleting all students");
		studentDao.deleteAll();
	}
}
