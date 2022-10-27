package az.developia.springjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
@Autowired
private StudentService studentService;	
	

	
	@GetMapping(path= "/students")
	public String showStudents(Model model) {		
		model.addAttribute("students", studentService.findAllStudents());
		return "students";
	}
	
	
	@GetMapping(path= "/save-student")
	public String saveStudents(Model m){
		Student s = new Student();
		m.addAttribute("student", s);
		return "save-student";
	}	
	
	
	
	@PostMapping(path= "/save-new-student")
	public String saveNewStudent(@ModelAttribute(name="student") Student s){		
		studentService.save(s);
		return "home";
	}	
	
	@GetMapping(path= "/students/delete/{id}")
	public String deleteStudents(@PathVariable Integer id){
		studentService.delete(id);
		return "home";
	}	
	
	
}
