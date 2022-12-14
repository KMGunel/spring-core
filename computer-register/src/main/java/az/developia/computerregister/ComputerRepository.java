package az.developia.computerregister;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class ComputerRepository {
	
	@Autowired
	DataSource dataSource;
	

	public List<Computer> findAllComputers() {
		ArrayList<Computer>	computerlist= new ArrayList<>();
		try {
			Connection conn=dataSource.getConnection();
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("select * from computers");
			while(rs.next()) {
				Computer c = new Computer(rs.getInt("id"),rs.getString("brand"),rs.getDouble("price"));
				computerlist.add(c);
			}			
			conn.close();			
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		
		return computerlist;
	}



	public void save(Computer c) {
		try {
			Connection conn=dataSource.getConnection();
			Statement st=conn.createStatement();
			
			if(c.getId()==null) {
				st.executeUpdate("insert into computers (brand,price) " + "values ('"+c.getBrand()+"','"+c.getPrice()+"');");
			}
			else {
				st.executeUpdate("update computers set brand='"+c.getBrand()+"',price='"+c.getPrice()+"' where id="+c.getId());
			}
			
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}



	public void delete(Integer id){
		try {
			Connection conn=dataSource.getConnection();
			Statement st=conn.createStatement();
			st.executeUpdate("delete from computers where id="+id);
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public Computer findById(Integer id) {
		Computer c=new Computer();
		try {
			Connection conn=dataSource.getConnection();
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("select * from computers where id="+id);
			if(rs.next()) {
				c = new Computer(rs.getInt("id"),rs.getString("brand"),rs.getDouble("price"));
				
			}			
			conn.close();			
		} catch (Exception e) {
			e.printStackTrace();
		}			
		return c;
	}


}
