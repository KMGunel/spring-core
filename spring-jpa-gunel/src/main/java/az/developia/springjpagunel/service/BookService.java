package az.developia.springjpagunel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import az.developia.springjpagunel.model.Book;
import az.developia.springjpagunel.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired	
	private BookRepository bookRepository;	
		
	public List<Book> findAll(){
		return bookRepository.findAll();
	}
	
	public void save(Book b) {
		bookRepository.save(b);
	}
	
	public void delete(Integer id) {
		bookRepository.deleteById(id);
	}
	
	public Book findById(Integer id) {
		return bookRepository.findById(id).get();
	}
}
