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
public class BookService {

	@Autowired
	DataSource ds;
	
	public List<Book> findAllBook(){
		ArrayList<Book>booklist=new ArrayList<>();
		try {
			Connection conn=ds.getConnection();
			Statement st=conn.createStatement();
			ResultSet rs = st.executeQuery("select * from books");
			while(rs.next()) {
				Book b = new Book(rs.getInt("id"),rs.getString("name"),rs.getInt("pageCount"),rs.getDouble("price"));
				booklist.add(b);
			}
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		return booklist;
	}
	
	public void saveBooks(Book b) {
		try {
			Connection conn=ds.getConnection();
			Statement st=conn.createStatement();
			st.executeUpdate("insert into books (name,price,pageCount) " + "values ('"+b.getName()+"','"+b.getPrice()+"','"+b.getPageCount()+"');");
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
