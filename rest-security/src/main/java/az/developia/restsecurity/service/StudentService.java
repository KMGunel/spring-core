package az.developia.restsecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import az.developia.restsecurity.model.Student;
import az.developia.restsecurity.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired	
	private StudentRepository studentRepository;	
		
	public List<Student> findAll(){
		return studentRepository.findAll();
	}

	public Student findById(Integer id) {		
		return studentRepository.findById(id).get();
	}
	
	
}
