package az.developia.springcore;

import org.springframework.stereotype.Component;

@Component(value = "Telebe")
public class Student {
	private String name;
	private String surname;
	
	public Student() {
		 name = "Adil";
		 surname = "Eliyev";	 }
	 
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	 

}
