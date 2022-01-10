package in.nareshit.raghu.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.nareshit.raghu.model.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	//1. show Edit Form With Data
	@GetMapping("/edit")
	public String showEdit(Model model) {
		Employee e = new Employee();
		e.setEmpId(99999);
		e.setEmpName("MSD");
		e.setEmpGen("Male");
		e.setEmpDept("3");
		e.setEmpLangs(Arrays.asList("ENG","TEL"));
		
		model.addAttribute("employee", e);
		
		//dynamic dropdown data (Consider we got from DB)
//		Map<String,String> data = Map.of(
//					"1","QA",
//					"2","BA",
//					"3","DEV",
//					"4","PROD"
//				);
		Map<String,String> data= new HashMap<>();
		data.put("1","QA");
		data.put("2","BA");
		data.put("3","DEV");
		data.put("4","PROD");
		model.addAttribute("map", data);
		
//		Map<String,String> langs = Map.of(
//				"ENG","ENG",
//				"TAM","TAM",
//				"HIN","HIN",
//				"TEL","TEL"
//			);
		Map<String,String> langs= new HashMap<>();
		langs.put("ENG","ENG");
		langs.put("TAM","TAM");
		langs.put("HIN","HIN");
		langs.put("TEL","TEL");
		model.addAttribute("langs", langs);
		return "EmployeeEdit";
	}
	
	//2. Read Form data back to controller on submit
}
