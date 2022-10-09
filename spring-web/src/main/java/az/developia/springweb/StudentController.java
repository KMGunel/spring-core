package az.developia.springweb;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
	
	@GetMapping(path= "/students")
	public String showStudents(Model model) {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student(1,"Gunay","Hesenli"));
		students.add(new Student(2,"Ehmed","Qardasov"));
		students.add(new Student(3,"Selim","Camalov"));
		
		model.addAttribute("students", students);
		return "students";
	}	
}
