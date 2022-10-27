package az.developia.springjdbc;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired	
	private StudentRepository studentRepository;	
		
	public List<Student> findAllStudents(){
		return studentRepository.findAllStudents();
	}
	
	public void save(Student s) {
		studentRepository.save(s);
	}
	
	public void delete(Integer id) {
		studentRepository.delete(id);
	}
	
	public Student findById(Integer id) {
		return studentRepository.findById(id);
	}
}
