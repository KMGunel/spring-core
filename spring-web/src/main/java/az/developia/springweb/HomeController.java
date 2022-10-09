package az.developia.springweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping(path= "/homepage")
	public String homePage() {
		return "homepage";
	}	
}
