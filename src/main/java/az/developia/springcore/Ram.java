package az.developia.springcore;

import org.springframework.stereotype.Component;

@Component(value="ram1")
public class Ram {
  private int id;
  private int size;
  
  
public Ram() {
	this.id = 123;
	this.size=32;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public int getSize() {
	return size;
}


public void setSize(int size) {
	this.size = size;
}


@Override
public String toString() {
	return "Ram [id=" + id + ", size=" + size + "]";
}


  
  
}
