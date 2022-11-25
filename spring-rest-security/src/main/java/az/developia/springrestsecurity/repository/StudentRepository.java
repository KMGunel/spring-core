package az.developia.springrestsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.springrestsecurity.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
