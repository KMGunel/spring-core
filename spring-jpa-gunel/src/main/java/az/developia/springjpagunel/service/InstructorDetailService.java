package az.developia.springjpagunel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import az.developia.springjpagunel.model.InstructorDetail;
import az.developia.springjpagunel.repository.InstructorDetailRepository;

@Service
public class InstructorDetailService {
	
	@Autowired	
	private InstructorDetailRepository instructorDetailRepository;	
		
	public List<InstructorDetail> findAll(){
		return instructorDetailRepository.findAll();
	}
	
	public void save(InstructorDetail det) {
		instructorDetailRepository.save(det);
	}
	
	public void delete(Integer id) {
		instructorDetailRepository.deleteById(id);
	}
	
	public InstructorDetail findById(Integer id) {
		return instructorDetailRepository.findById(id).get();
	}
}
