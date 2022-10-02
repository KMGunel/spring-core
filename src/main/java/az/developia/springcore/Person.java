package az.developia.springcore;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class Person {
 private int id;
 private String name;
 private LocalDate age;
 private double salary;
 
public Person() {
	
	this.id = 1;
	this.name = "Feride";
	this.age = LocalDate.of(2001, 1, 13);
	this.salary = 950;
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

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
}
 
 
 
}
