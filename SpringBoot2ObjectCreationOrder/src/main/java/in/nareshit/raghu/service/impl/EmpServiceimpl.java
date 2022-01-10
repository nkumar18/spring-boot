package in.nareshit.raghu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.repo.EmpRepository;
import in.nareshit.raghu.service.EmployeeService;

@Component
public class EmpServiceimpl implements EmployeeService{
	
	public EmpServiceimpl() {
		System.out.println("EmpService#objet");
	}
	
	@Autowired
	private EmpRepository repo;
	
	public void saveEmp() {
		repo.saveEmp();
		System.out.println("Welcome to the Employee ServiceImpl save method #ServiceObject");
	}

}
