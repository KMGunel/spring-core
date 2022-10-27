package az.developia.springweb;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class BookController {
	@Autowired
private BookService bookService;

	ArrayList<Book> books = new ArrayList<>();
		{
		books.add(new Book(1,"Les Miserables","Victor Hugo"));
		books.add(new Book(2,"Anna Karenina","Leu Tolstoy"));
		books.add(new Book(3,"Don Quixote","Miguel de Cervantes"));
		}
	
	@GetMapping(path= "/books")
	public String showBooks(Model model) {				
		model.addAttribute("books", bookService.findAllBook());		
		return "books";
	}	
	
	@GetMapping(path= "/save-book")
		public String saveBook(Model m) {
		Book b = new Book();
		m.addAttribute("book", b);
		return "save-book";
	}	
	
	
	
	
	@PostMapping(path= "/save-new-book")
	public String saveNewBook(@ModelAttribute(name="book") Book b){
		bookService.saveBooks(b);
		return "homepage";
	}	
}
