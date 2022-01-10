package in.nareshit.raghu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.controller.EmpController;

@Component
public class TestRunner implements CommandLineRunner {
	
	@Autowired
	private EmpController empcontroller;

	@Override
	public void run(String... args) throws Exception {
		empcontroller.testSave();
		
	}

}
