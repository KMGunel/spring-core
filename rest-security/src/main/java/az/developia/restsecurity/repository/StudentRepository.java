package az.developia.restsecurity.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import az.developia.restsecurity.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

		
	}
