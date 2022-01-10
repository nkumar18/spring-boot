package in.nareshit.raghu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.nareshit.raghu.model.Employee;
import in.nareshit.raghu.model.pageview;

@Controller
public class EmployeeController {

	@GetMapping("/register")
	public String showReg() {
		return "EmployeeRegister";
	}
	
	@PostMapping("/save")
	public String readForm(
			@ModelAttribute Employee employee,
			Model model
			)
	{
		model.addAttribute("emp", employee);
		return "EmployeeData";
	}
	
	@GetMapping("/show")
	public String showpage() {
		return "type";
	}
	
	@PostMapping("/savetype")
	public String saveFormdate(
			@ModelAttribute pageview pgObj,
			Model model
			)
	{
		model.addAttribute("empdata", pgObj);
		return "output";
	}
	
}
