package az.developia.computerregister;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComputerService {
	
	@Autowired	
	private ComputerRepository computerRepository;	
		
	public List<Computer> findAllComputers(){
		return computerRepository.findAllComputers();
	}
	
	public void save(Computer c) {
		computerRepository.save(c);
	}
	
	public void delete(Integer id) {
		computerRepository.delete(id);
	}
}
