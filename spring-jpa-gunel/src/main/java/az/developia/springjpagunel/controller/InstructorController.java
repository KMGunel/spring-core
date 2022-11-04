package az.developia.springjpagunel.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.springjpagunel.model.Instructor;
import az.developia.springjpagunel.service.InstructorService;

@RestController
@RequestMapping(path= "/instructors")
public class InstructorController {
@Autowired
private InstructorService instructorService;	
	

	@GetMapping(path= "/list")
	public List<Instructor> findAll() {		
		return instructorService.findAll();
	}	
	
	@PostMapping
	public void save(@RequestBody Instructor i) {
		instructorService.save(i);
	}
	@PutMapping
	public String update(@RequestBody Instructor i) {
		if(i.getId()==null) {
			return "Enter Id!";
		}
			instructorService.save(i);
			return "Succes!";
	}
	
	@DeleteMapping(path="/{id}")
	public void deleteById(@PathVariable Integer id) {
		instructorService.delete(id);
	}	
	
	
}
