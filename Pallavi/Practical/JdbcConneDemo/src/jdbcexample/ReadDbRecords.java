package jdbcexample;

//1. import sql files
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadDbRecords {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// 2.register/load the drivers
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 3.establish the connection
		String url = "jdbc:mysql://localhost:3306/contactinfo";
		String name = "root";
		String password = "root@123";
		Connection con = DriverManager.getConnection(url, name, password);
		System.out.println("Connection succesful.");
		
		// 4.create statement
		Statement stmt = con.createStatement();
		
		// 5.execute the query
		ResultSet rs = stmt.executeQuery("select * from contacts");
		
		//6.retrive results
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		}
		
		//7.close the connection
		con.close();
	}

}
