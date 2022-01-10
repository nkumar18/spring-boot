package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	@Value("${mycustom.data}")
	String propdata;
	
	@RequestMapping(method=RequestMethod.GET ,value = "/demo")
	@ResponseBody//when you specify @ResponseBody data is resolved by you given in return
	public String getData() {
		
		return "Welcome to Spring boot "+ propdata;
	}
    //When you donot specify @ResponseBody then data is return by spring using thymeleaf view resolver
	@RequestMapping(method=RequestMethod.GET ,value = "/demo1")
	public String getDatafromhtmlpage(Model model) {
		model.addAttribute("mymessage", propdata);
		return "data";
	}
	
	
	//Get employee using data
	@RequestMapping(method = RequestMethod.GET,value="/emp")
	public Employee getEmployee() {
	
	 return new Employee(101,"Prince",10000);
	}
	//Get list of Employee use jpa
	
	@Autowired
	EmployeeRepo empRepo;
	
	@RequestMapping(method = RequestMethod.GET,value="/emps")
	@ResponseBody()
	public List <Employee> getListEmployee() {
		return empRepo.findAll();
	  
	}
	
	
	  @PostMapping("/createEmp")
	  @ResponseBody() 
	  public Employee getEmps(@RequestBody Employee emp) { 
		  return empRepo.save(emp);
	  
	  }
	 
}
