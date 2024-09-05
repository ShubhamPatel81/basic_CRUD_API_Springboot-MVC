package com.student_management_system.Student_Management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.student_management_system.Student_Management.entity.Student;
import com.student_management_system.Student_Management.repositry.StudentRepo;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Autowired
	private StudentRepo repositry; 
	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student(0, "Ramesh", "kumar", "ramesh@gmail.com" ); 
//		repositry.save(student1);
//		
//		Student student2  = new Student(1, "Sanjay", "Kumar", "sanjay@gamil.com");
//		repositry.save(student2);
//		 
//		Student student3  = new Student(2, "Sanjay", "Kumar", "sanjay@gamil.com");
//		repositry.save(student3);
	}

}
