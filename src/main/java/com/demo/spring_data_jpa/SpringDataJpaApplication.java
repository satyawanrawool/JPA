package com.demo.spring_data_jpa;

import com.demo.spring_data_jpa.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

//		s1.setId(101);
//		s1.setName("Rohit");
//		s1.setMarks(85);
//
//		s2.setId(102);
//		s2.setName("Satya");
//		s2.setMarks(88);
//
//		s3.setId(103);
//		s3.setName("Akash");
//		s3.setMarks(95);
//
//		repo.save(s2);
//		repo.save(s3);

//		System.out.println(repo.findAll());
		Optional<Student> s = repo.findById(103);
		System.out.println(s.orElse(new Student()));

		System.out.println(repo.findByName("Rohit"));
	}

}
