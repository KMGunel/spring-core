package az.developia.springrestsecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import az.developia.springrestsecurity.model.Student;
import az.developia.springrestsecurity.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired	
	private StudentRepository studentRepository;	
		
	public List<Student> findAll(){
		return studentRepository.findAll();
	}
}
