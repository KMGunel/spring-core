package az.developia.springweb;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
		@Autowired
		DataSource ds;
		
		
	public List<Student> findAllStudents(){		
		
		ArrayList<Student>	arraylist= new ArrayList<>();
		try {
			Connection conn=ds.getConnection();
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("select * from students");
			while(rs.next()) {
				Student s = new Student(rs.getInt("id"),rs.getString("name"),rs.getString("surname"));
				arraylist.add(s);
			}			
			conn.close();			
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		
		return arraylist;
	}
	
	public void save(Student s) {
	
	try {
		Connection conn=ds.getConnection();
		Statement st=conn.createStatement();
		st.executeUpdate("insert into students (name,surname) " + "values ('"+s.getName()+"','"+s.getSurname()+"');");
		conn.close();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
}
