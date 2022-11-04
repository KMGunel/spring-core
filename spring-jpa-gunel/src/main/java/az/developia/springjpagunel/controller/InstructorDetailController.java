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

import az.developia.springjpagunel.model.InstructorDetail;
import az.developia.springjpagunel.service.InstructorDetailService;

@RestController
@RequestMapping(path= "/instructor-details")
public class InstructorDetailController {
@Autowired
private InstructorDetailService instructorDetailService;	
	

	@GetMapping(path= "/list")
	public List<InstructorDetail> findAll() {		
		return instructorDetailService.findAll();
	}	
	
	@PostMapping
	public void save(@RequestBody InstructorDetail det) {
		instructorDetailService.save(det);
	}
	@PutMapping
	public String update(@RequestBody InstructorDetail det) {
		if(det.getId()==null) {
			return "Enter Id!";
		}
			instructorDetailService.save(det);
			return "Succes!";
	}
	
	@DeleteMapping(path="/{id}")
	public void deleteById(@PathVariable Integer id) {
		instructorDetailService.delete(id);
	}	
	
	
}
