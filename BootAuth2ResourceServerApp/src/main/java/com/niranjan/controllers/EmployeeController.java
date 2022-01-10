package com.niranjan.controllers;
import com.niranjan.model.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	 @RequestMapping(value="/getEmplist" ,produces = "application/json")
	  public  List<Employee>  getEmployeesList(){
		
		 List<Employee> employees= new ArrayList<>();
		 
		  Employee employee= new Employee();
		  employee.setEmpId("emp1");
		  employee.setEmpName("Rajesh");
		  employees.add(employee);
		  
		  return employees;
		  	
	}

}
