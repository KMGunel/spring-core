package az.developia.springcore;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		
		ApplicationContext c=
		           SpringApplication.run(SpringCoreApplication.class, args); 
		
//		Student student = c.getBean(Student.class);
//		System.out.println(student.getName());
//		System.out.println(student.getSurname());
//		
//		
//		Book book = c.getBean(Book.class);
//		System.out.println(book.getName());
//		System.out.println(book);
//		
//		
//		Person person = c.getBean(Person.class);
//		System.out.println(person.getId());
//		System.out.println(person);
//		
//		String[] beanNames = c.getBeanDefinitionNames();
//		for (String s : beanNames) {
//			System.out.println(s);
//		}
//		
		Employee employee = (Employee)c.getBean("isci");
		System.out.println(employee);
		
		
		Home home  = c.getBean(Home.class);
		System.out.println(home);
		Home home1  = c.getBean(Home.class);
		System.out.println(home1);
		
		
	}
}
 