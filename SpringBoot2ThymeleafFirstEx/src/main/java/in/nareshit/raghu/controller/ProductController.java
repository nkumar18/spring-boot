package in.nareshit.raghu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {

	@GetMapping("/home")
	public String showProduct(Model model) {
		model.addAttribute("title", "Naresh-IT");
		return "ProductData";
	}
}
