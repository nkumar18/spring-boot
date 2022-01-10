package in.nareshit.raghu.runner;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.Employee;
import in.nareshit.raghu.repo.EmployeeRepository;
	
@Component
public class DataInertRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;
	
	public void run(String... args) throws Exception {
		Employee emp = new Employee(10, "SAM", 3.3,
				new Date(), new Date(), new Date());
		
		repo.save(emp);

		//https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy 'at time' hh:mm:ss SSS");
		String dte = sdf.format(new Date());
		System.out.println(dte);
		
		System.out.println("DONE");
	}

}