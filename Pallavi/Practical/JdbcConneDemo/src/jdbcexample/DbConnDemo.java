package jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// Register/load drivers
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish the connection
		String url = "jdbc:mysql://localhost:3306/demodb";
		String username = "root";
		String password = "root@123";
		
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connection Succesful.");

	}

}
