package az.developia.restsecurity.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.restsecurity.model.Student;
import az.developia.restsecurity.service.StudentService;

@RestController
@RequestMapping(path= "/students")
public class StudentController {
@Autowired
private StudentService studentService;	
	

	@GetMapping
	@PreAuthorize(value = "hasAuthority('students:find:all')")
	public List<Student> findAll() {		
		return studentService.findAll();
	}	
	
	@GetMapping(path="/{id}")
	@PreAuthorize(value = "hasAuthority('students:find:by:id')")
	public Student findById(@PathVariable Integer id) {		
		return studentService.findById(id);
	}	
	
		
}
