package az.developia.springcore;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName="prototype")
public class Home {

	private int id;
	private String address;
	private String color;
	public Home() {
		this.id=999;
		this.address= "Yasamal";
		this.color="brown";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Home [id=" + id + ", address=" + address + ", color=" + color + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Init");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy");
	}
	
	
}
