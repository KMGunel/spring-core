package az.developia.springjdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
	
	@Autowired
	DataSource dataSource;
	

	public List<Student> findAllStudents() {
		ArrayList<Student>	studentlist= new ArrayList<>();
		try {
			Connection conn=dataSource.getConnection();
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("select * from students");
			while(rs.next()) {
				Student s = new Student(rs.getInt("id"),rs.getString("name"),rs.getString("surname"));
				studentlist.add(s);
			}			
			conn.close();			
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		
		return studentlist;
	}



	public void save(Student s) {
		try {
			Connection conn=dataSource.getConnection();
			Statement st=conn.createStatement();
			st.executeUpdate("insert into students (name,surname) " + "values ('"+s.getName()+"','"+s.getSurname()+"');");
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}



	public void delete(Integer id){
		try {
			Connection conn=dataSource.getConnection();
			Statement st=conn.createStatement();
			st.executeUpdate("delete from students where id="+id);
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


}
