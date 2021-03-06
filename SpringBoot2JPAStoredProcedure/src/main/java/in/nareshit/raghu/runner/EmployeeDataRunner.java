package in.nareshit.raghu.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.Employee;
import in.nareshit.raghu.repo.EmployeeRepository;

//@Component
public class EmployeeDataRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepository repo;
	
	public void run(String... args) throws Exception {
		repo.saveAll(
				Arrays.asList(
					new Employee(10, "A", 2.2, "Lead", "DEV"),
					new Employee(11, "B", 2.3, "MGR", "QA"),
					new Employee(12, "C", 4.2, "Lead", "QA"),
					new Employee(13, "D", 2.8, "MG", "DEV"),
					new Employee(14, "E", 2.6, "SE", "DEV"),
					new Employee(15, "F", 2.0, "SE", "DEV")
				)
				);
		
	}

}