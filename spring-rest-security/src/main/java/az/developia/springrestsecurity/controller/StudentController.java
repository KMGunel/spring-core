package az.developia.springrestsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.springrestsecurity.model.Student;
import az.developia.springrestsecurity.service.StudentService;


@RestController
@RequestMapping(path= "/students")
public class StudentController {
	@Autowired
	private StudentService studentService;	
		

		@GetMapping(path= "/list")
		public List<Student> findAll() {		
			return studentService.findAll();
		}	
}
