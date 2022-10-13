package az.developia.springweb;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyMiniGoogleController {
	
	ArrayList<Student> students = new ArrayList<>();
	{
	students.add(new Student(1,"Gunay","Hesenli"));
	students.add(new Student(2,"Ehmed","Qardasov"));
	students.add(new Student(3,"Selim","Camalov"));
	students.add(new Student(4,"Murad","Hesenli"));
	students.add(new Student(5,"Melik","Ceferov"));
	students.add(new Student(6,"Raul","Aliyev"));
	}
	@GetMapping(path= "/mygoogle")
	public String searchStudents(@RequestParam(name="request") String s,Model model) {
		
		ArrayList<Student> list = new ArrayList<>();
		for (Student st : students) {
			if (st.getName().contains(s)) {
				list.add(st);
			}
		}
		model.addAttribute("students", list);
		return "mygoogle";
	}
}
