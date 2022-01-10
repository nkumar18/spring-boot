package in.nareshit.raghu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {
	
	@RequestMapping(value = "/show")//GET
	public String showHome() {
		return "Home";
	}
	
	@RequestMapping(value = "/show",
			method = RequestMethod.POST)
	public String showData() {
		return "data";
	}

    
}
