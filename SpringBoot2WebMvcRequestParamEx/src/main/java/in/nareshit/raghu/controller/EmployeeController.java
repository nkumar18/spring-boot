package in.nareshit.raghu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

	// http://localhost:80/emp/data?__=___&_=__  http://localhost/emp/data?ename=ram&eid=10
	@GetMapping("/data")
	public String showParam(
			//@RequestParam("ename")String name,
			//@RequestParam(value = "ename", required = false)String name,
			@RequestParam(value = "ename", required = false, defaultValue = "NO DATA")String name,
			//@RequestParam("eid") int id ,
			//@RequestParam(value="eid",required=false) int id,//java.lang.IllegalStateException: Optional int parameter 'eid' is present but cannot be translated into a null value due to being declared as a primitive type. Consider declaring it as object wrapper for the corresponding primitive type.
			@RequestParam(value = "eid", required = false, defaultValue = "-1") int id,
			Model model) {
		model.addAttribute("eid", id);
		model.addAttribute("ename", name);
		
		return "EmpData";
	}
}
