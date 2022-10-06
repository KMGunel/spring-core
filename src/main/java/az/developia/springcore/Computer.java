package az.developia.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Computer {
  
	private int id;
	private String brand;
	private String color;
	private double price;
	@Autowired
	@Qualifier(value="ram2")
	private Ram ram;
	
	public Computer() {
		
		this.id = 333;
		this.brand = "Dell";
		this.color = "black";
		this.price = 1560;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Ram getRam() {
		return ram;
	}
	public void setRam(Ram ram) {
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "Computer [id=" + id + ", brand=" + brand + ", color=" + color + ", price=" + price + ", ram=" + ram
				+ "]";
	}
	
	
	
	
	
}
