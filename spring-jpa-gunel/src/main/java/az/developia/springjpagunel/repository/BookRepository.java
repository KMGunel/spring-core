package az.developia.springjpagunel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.springjpagunel.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
		
	}
