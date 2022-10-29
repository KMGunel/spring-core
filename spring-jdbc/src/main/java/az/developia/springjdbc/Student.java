package az.developia.springjdbc;

import java.sql.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class Student {
	
	
private Integer id;

@NotNull
@NotEmpty(message="Ad boş olmamalıdır!!!")
@Size(max=10,message="Ad maksimum 10 simvoldan ibarət ola bilər!!!")
private String name;
private String surname;
@Pattern(regexp = "[a-z0-9]+@[a-z0-9]+\\.[a-z]{2,4}",message="Email düzgün formatta deyil!!!")
private String email;
@Pattern(regexp = "[0-9]{3}[0-9]{3}[0-9]{3}",message="Nömrə düzgün formatta deyil!!!")
private String telephone;
@Min(value=2,message="Qiymət minimum 2 ola bilər!!!")
@Max(value=10,message="Qiymət maksimum 10 ola bilər!!!")
private Integer mark;
@MyVaridation
private String code;

@Past(message="Təvəllüd mütləq keçmiş zaman olmalıdır!!!")
private Date birthday;

public Student(Integer id, String name, String surname) {
	super();
	this.id = id;
	this.name = name;
	this.surname = surname;
}
public Student() {
	
}

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
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

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getTelephone() {
	return telephone;
}
public void setTelephone(String telephone) {
	this.telephone = telephone;
}
public Integer getMark() {
	return mark;
}
public void setMark(Integer mark) {
	this.mark = mark;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public Date getBirthday() {
	return birthday;
}
public void setBirthday(Date birthday) {
	this.birthday = birthday;
}


	
}
