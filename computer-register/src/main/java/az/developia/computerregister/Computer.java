package az.developia.computerregister;

public class Computer {
private Integer id;
private String brand;
private double price;


public Computer(Integer id, String brand, double price) {
	super();
	this.id = id;
	this.brand = brand;
	this.price = price;
}
public Computer() {
	super();
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}


}
