package az.developia.computerregister;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ComputerController {
	
@Autowired
private ComputerService computerService;		

	
	@GetMapping(path= "/computers")
	public String showStudents(Model model) {		
		model.addAttribute("computers", computerService.findAllComputers());
		return "computers";
	}
	
	
	@GetMapping(path= "/save-computer")
	public String saveComputers(Model m){
		Computer c = new Computer();
		m.addAttribute("computer", c);
		return "save-computer";
	}	
	
	
	
	@PostMapping(path= "/save-new-computer")
	public String saveNewComputer(@ModelAttribute(name="computer") Computer c){		
		computerService.save(c);
		return "home";
	}	
	
	@GetMapping(path= "/computers/delete/{id}")
	public String deleteComputers(@PathVariable Integer id){
		computerService.delete(id);
		return "home";
	}
	
	@GetMapping(path= "/computers/edit/{id}")
	public String editComputers(@PathVariable Integer id,Model m){
		Computer c = computerService.findById(id);
		m.addAttribute("computer", c);
		return "save-computer";
	}
	
	
}
