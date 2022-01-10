package in.nareshit.raghu.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.Student;
import in.nareshit.raghu.repo.StudentRepository;

//@Component
public class StudentDataInsertRunner implements CommandLineRunner {
	@Autowired
	private StudentRepository repo;
	
	public void run(String... args) throws Exception {
		repo.saveAll(Arrays.asList(
					new Student(10, "SAM", 300.0, "Core Java"),
					new Student(11, "RAM", 400.0, "Core Java"),
					new Student(12, "SYED", 500.0, "Adv Java"),
					new Student(13, "AJAY", 400.0, "Adv Java"),
					new Student(14, "JAI", 300.0, "MS"),
					new Student(15, "KUMAR", 600.0, "BOOT"),
					new Student(16, "SANJU", 400.0, "BOOT")
				));
		
		repo.findAll()
		.forEach(System.out::println);
		;
	}

}
