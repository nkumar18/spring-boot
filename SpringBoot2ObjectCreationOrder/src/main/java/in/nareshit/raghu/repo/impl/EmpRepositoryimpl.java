package in.nareshit.raghu.repo.impl;

import org.springframework.stereotype.Component;

import in.nareshit.raghu.repo.EmpRepository;

@Component
public class EmpRepositoryimpl implements EmpRepository{
	

	public EmpRepositoryimpl() {
      System.out.println("Repository object");
	}

	@Override
	public void saveEmp() {
		System.out.println("From RepositoryImplforDatabase Logic.");
		
	}

}
