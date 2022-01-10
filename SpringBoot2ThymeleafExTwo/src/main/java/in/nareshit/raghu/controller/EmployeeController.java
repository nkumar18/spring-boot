package in.nareshit.raghu.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.nareshit.raghu.model.Employee;

@Controller
public class EmployeeController {

	@GetMapping("/data")
	public String showData() {
		return "EmpData";
	}
	
	@GetMapping("/msg")
	public String showmsg(Model model) {
		model.addAttribute("title", "NareshIT");

		Employee e = new Employee(101, "AJAY", 2500.0);
		model.addAttribute("eob", e);
		
		List<Employee> emps = Arrays.asList(
				new Employee(50, "JAY", 1500.0),
				new Employee(51, "SYED", 2500.0),
				new Employee(52, "VINAY", 3500.0)
				);
		model.addAttribute("list", emps);
		
		return "EmpMessage";
	}
}
