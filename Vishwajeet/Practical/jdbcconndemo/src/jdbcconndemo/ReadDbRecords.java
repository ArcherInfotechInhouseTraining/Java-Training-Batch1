package jdbcconndemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadDbRecords {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// register/load the drivers
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// establish connection
		String url = "jdbc:mysql://localhost:3306/contactinfo";
		String username = "root";
		String password = "Archer@1234";
		
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("Conncetion successfull");
		
		// create statement
		Statement stmt = con.createStatement();
		
		//Execute the query
		ResultSet rs = stmt.executeQuery("select * from contacts");
		
		// retrieve result
		while(rs.next()) 
			System.out.println(rs.getInt(1)+"         "+rs.getString(2)+"         "+rs.getString(3)+"         "+rs.getString(4));
			
		//close connection
		con.close();	

	}

}
