package az.developia.springweb;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {
	
	@GetMapping(path= "/books")
	public String showBooks(Model model) {
		
		ArrayList<Book> books = new ArrayList<>();
		books.add(new Book(1,"Les Miserables","Victor Hugo"));
		books.add(new Book(2,"Anna Karenina","Leu Tolstoy"));
		books.add(new Book(3,"Don Quixote","Miguel de Cervantes"));
		
		model.addAttribute("books", books);
		
		return "books";
	}	
}
