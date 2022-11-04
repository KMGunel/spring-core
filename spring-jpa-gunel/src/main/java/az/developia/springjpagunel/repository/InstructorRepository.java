package az.developia.springjpagunel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.springjpagunel.model.Instructor;

public interface InstructorRepository extends JpaRepository<Instructor, Integer> {
		
	}
