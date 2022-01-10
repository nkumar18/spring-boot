package in.nareshit.raghu.model;

import java.util.List;
import java.util.Set;

import lombok.Data;

@Data
public class Employee {

	private String empName;
	private String empPwd;
	private String empGen;
	private String empProj;
	private String empAddr;
	
	private List<String> empLangs;
	private Set<String> empClient;
}
