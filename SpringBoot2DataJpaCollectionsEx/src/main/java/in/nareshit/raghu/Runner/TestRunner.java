package in.nareshit.raghu.Runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.Repo.EmployeeRepository;
import in.nareshit.raghu.model.Employee;

@Component
public class TestRunner implements CommandLineRunner {
	
	@Autowired
	private EmployeeRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * repo.save(new Employee(10, "Niranjan", 10000.0, Set.of("P1","P2","P3"),
		 * List.of("M1","M2","M3"), Map.of("C1","NIT","C2","ORCL") )
		 * 
		 * );
		 */
		Set<String> s1= new HashSet();
		s1.addAll(Arrays.asList("P1","P2","P3"));
		
		List<String> ls=new ArrayList<>();
		ls.add("M1");
		ls.add("M2");
		ls.add("M3");
		
		Map<String,String> m1 = new HashMap();
		m1.put("C1","NIT");
		m1.put("C2","ORCL");
		repo.save(new Employee(10,"Niranjan",10000.0,s1,ls,m1));
		
	
		System.out.println("DONE");
		
	}

}
