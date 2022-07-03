package com.github.danielleziemba.sms;

import com.github.danielleziemba.sms.entity.Student;
import com.github.danielleziemba.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {

		Student student1 = new Student("Danielle", "Ziemba", "dziemba@email.com");
		studentRepository.save(student1);

		Student student2 = new Student("Ramesh", "Fadatare", "ramesh@email.com");
		studentRepository.save(student2);

		Student student3 = new Student("Tony", "Stark", "iamironman@email.com");
		studentRepository.save(student3);

	}

}
