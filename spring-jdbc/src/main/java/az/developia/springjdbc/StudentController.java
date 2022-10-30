package az.developia.springjdbc;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
@Autowired
private StudentService studentService;	
	
@InitBinder
public void initBinder(WebDataBinder dataBinder) {
	StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(false);
	dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
}
	
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
	public String saveNewStudent(@Valid @ModelAttribute(name="student") Student s, BindingResult br){		
		if(br.hasErrors()) {
			return "save-student";
		}
		
		studentService.save(s);
		return "home";
	}	
	
	@GetMapping(path= "/students/delete/{id}")
	public String deleteStudents(@PathVariable Integer id){
		studentService.delete(id);
		return "home";
	}	
	
	@GetMapping(path= "/students/edit/{id}")
	public String editStudents(@PathVariable Integer id,Model m){
		Student s = studentService.findById(id);
		m.addAttribute("student", s);
		return "save-student";
	}
		
}
