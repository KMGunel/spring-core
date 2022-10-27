package az.developia.springweb;


import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
@Autowired
private StudentService studentService;	
	
	ArrayList<Student> students = new ArrayList<>();
	{
		students.add(new Student(1,"Gunay","Hesenli"));
		students.add(new Student(2,"Ehmed","Qardasov"));
		students.add(new Student(3,"Selim","Camalov"));
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
	public String saveNewStudent(@ModelAttribute(name="student") Student s){		
		studentService.save(s);
		return "homepage";
	}	
	
}
