package az.developia.springjpagunel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import az.developia.springjpagunel.model.Instructor;
import az.developia.springjpagunel.repository.InstructorRepository;

@Service
public class InstructorService {
	
	@Autowired	
	private InstructorRepository instructorRepository;	
		
	public List<Instructor> findAll(){
		return instructorRepository.findAll();
	}
	
	public void save(Instructor i) {
		instructorRepository.save(i);
	}
	
	public void delete(Integer id) {
		instructorRepository.deleteById(id);
	}
	
	public Instructor findById(Integer id) {
		return instructorRepository.findById(id).get();
	}

	public List<Instructor> findPartial(Integer begin, Integer lenght) {
		List<Instructor>list=instructorRepository.findPartial(begin,lenght);
		return list;
	}
}
