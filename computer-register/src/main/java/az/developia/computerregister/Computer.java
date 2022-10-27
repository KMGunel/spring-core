package az.developia.computerregister;

public class Computer {
private int id;
private String brand;
private double price;


public Computer(int id, String brand, double price) {
	super();
	this.id = id;
	this.brand = brand;
	this.price = price;
}
public Computer() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
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
