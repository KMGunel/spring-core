package az.developia.springjpagunel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import az.developia.springjpagunel.model.Instructor;

public interface InstructorRepository extends JpaRepository<Instructor, Integer> {

	
	
	@Query(nativeQuery = true,value = "select * from instructor limit ?1,?2")
	List<Instructor> findPartial(Integer begin,Integer lenght);
		
	}
