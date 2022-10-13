package az.developia.springweb;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {
	
	@GetMapping(path= "/persons")
	public String showPerson(Model model) {
		ArrayList<Person> persons = new ArrayList<>();
		persons.add(new Person(1,"Selim",LocalDate.of(2001, 1, 13),"Baku"));
		persons.add(new Person(2,"Sara",LocalDate.of(1998, 5, 18),"Gence"));
		persons.add(new Person(3,"Fidan",LocalDate.of(1990, 9, 29),"Sheki"));
		persons.add(new Person(4,"Huner",LocalDate.of(2004, 2, 27),"Shamaxi"));
		persons.add(new Person(5,"Zara",LocalDate.of(2007, 3, 7),"Qebele"));
		
		model.addAttribute("persons", persons);
		return "persons";
	}	
}
