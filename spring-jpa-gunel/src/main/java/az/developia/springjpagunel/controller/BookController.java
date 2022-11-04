package az.developia.springjpagunel.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.springjpagunel.model.Book;
import az.developia.springjpagunel.service.BookService;

@RestController
@RequestMapping(path= "/books")
public class BookController {
@Autowired
private BookService bookService;	
	

	@GetMapping(path= "/list")
	public List<Book> findAll() {		
		return bookService.findAll();
	}	
	
	@PostMapping
	public void save(@RequestBody Book b) {
		bookService.save(b);
	}
	@PutMapping
	public String update(@RequestBody Book b) {
		if(b.getId()==null) {
			return "id mutleqdir!";
		}
			bookService.save(b);
			return "ugurlu redakte!";
	}
	
	@DeleteMapping(path="/{id}")
	public void deleteById(@PathVariable Integer id) {
		bookService.delete(id);
	}	
	
	
}
