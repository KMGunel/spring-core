package az.developia.springcore;

import org.springframework.stereotype.Component;

@Component
public class Book {
  
	private int id;
	private String name;
	private double price;
	private int pageCount;
	
	public Book() {
		
		this.id = 111;
		this.name = "Java-17";
		this.price = 300;
		this.pageCount = 1250;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", pageCount=" + pageCount + "]";
	}
	
	
}
