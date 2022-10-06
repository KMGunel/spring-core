package az.developia.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MyBeanConfig {

	@Bean(name = "isci")
	public Employee createEmployeeBean() {
		Employee e = new Employee();
		e.setId(222);
		e.setName("Lucia");
		e.setSalary(900);
		return e;				
	}
	

	@Bean
	@Primary
	public Computer createComputerBean() {
		Computer comp = new Computer();
		comp.setId(555);
		comp.setBrand("Acer");
		comp.setColor("silver");
		comp.setPrice(1140);		
		return comp;				
	}
	
	@Bean(name="ram2")	
	public Ram createRamBean() {
		Ram ram = new Ram();
		ram.setId(235);
		ram.setSize(64);	
		return ram;				
	}
	
	
}
