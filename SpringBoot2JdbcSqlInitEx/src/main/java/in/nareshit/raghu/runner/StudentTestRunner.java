package in.nareshit.raghu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.Student;
import in.nareshit.raghu.repo.StudentRepository;

@Component
public class StudentTestRunner implements CommandLineRunner{

	@Autowired
	private StudentRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("FROM RUNNER...");
		repo.saveStudent(new Student(12,"Amrit",700.0));
		repo.saveStudent(new Student(13,"Karthik",800.0));
		repo.saveStudent(new Student(14,"Mayur",900.0));
		repo.saveStudent(new Student(15,"Sanvi",1000.0));
		
		System.out.println("--------------------------");
		repo.getAllStudent().forEach(System.out::println);
		
	    int count=repo.updateStudent(new Student(12,"sonu",800.0));
	    System.out.println("UPDATED ROWS=>" + count);
       

		count = repo.deleteStudent(14);
		System.out.println("DELETED ROWS=>" + count);
		
		System.out.println("****************************");
		
		Student s=repo.getOneStudentById(13);
		
		System.out.println(s);
		
		System.out.println("--------------------------");
		repo.getAllStudent().forEach(System.out::println);
	}

}
