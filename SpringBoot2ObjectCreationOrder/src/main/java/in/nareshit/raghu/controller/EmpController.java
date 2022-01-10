package in.nareshit.raghu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.service.EmployeeService;

@Component
public class EmpController {
	
	
	
	public EmpController() {
		System.out.println("EmpController#object");

	}

	@Autowired
	private EmployeeService empService;
	
	public void testSave() {
		empService.saveEmp();
		System.out.println("FromController");
	}

}
