package az.developia.springweb;

public class Book {
	
	private int id;
	private String name;
	private String author;
	private int pageCount;
	private double price;
	
	public Book(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public Book(int id, String name, String author, int pageCount, double price) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.pageCount = pageCount;
		this.price = price;
	}

	public Book(int id, String name, int pageCount, double price) {
		super();
		this.id = id;
		this.name = name;
		this.pageCount = pageCount;
		this.price = price;
	}

	public Book() {
		super();
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

}	
	
	