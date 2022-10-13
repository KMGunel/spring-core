package az.developia.springweb;

import java.time.LocalDate;

public class Person {

	private int id;
	private String name;
	private LocalDate age;
	private String address;
	
	
	public Person(int id, String name, LocalDate age, String address) {
	
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
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


	public LocalDate getAge() {
		return age;
	}


	public void setAge(LocalDate age) {
		this.age = age;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
