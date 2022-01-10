package in.nareshit.raghu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.repo.StudentRepository;

//@Component
public class TestFindByRunner implements CommandLineRunner {
	@Autowired
	private StudentRepository repo;
	
	public void run(String... args) throws Exception {
		//repo.findByStdCourse("Core Java")
		//repo.findByStdFee(300.0)
		//repo.findByStdIdGreaterThanEqual(10)
		//repo.findByStdFeeGreaterThan(300.0)
		//repo.findByStdIdBetween(11, 15)
		//repo.findByStdNameIsNull()
		//repo.findBystdNamenotnull()
		//repo.findByStdNameLike("S%")//Name start wih S
		//repo.findByStdNameNotLike("___")//Leaving first 3 character
		repo.findByStdIdNotOrderByStdName(14)
				//repo.findByStdIdIn(Arrays.asList(10,14,18,22,12))
				//repo.findByStdIdNotIn(Arrays.asList(10,14,18,22,12))
				//repo.findByStdIdOrStdName(10, "SYED")
				//repo.findByStdIdGreaterThanAndStdNameNotLike(10, "S%")
				//repo.findByStdNameStartingWith("S") // S%
				//repo.findByStdNameEndingWith("U") // %U
				//repo.findByStdNameContaining("Y") //%Y%
				.forEach(System.out::println);
	}

}
