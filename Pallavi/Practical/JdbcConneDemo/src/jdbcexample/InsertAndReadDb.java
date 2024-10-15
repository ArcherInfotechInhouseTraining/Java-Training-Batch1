package jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertAndReadDb {

	private static final String DB_URL = "jdbc:mysql://localhost/contactinfo";
	private static final String NAME = "root";
	private static final String PASSWORD = "root@123";
	
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		PreparedStatement preparedstatement = null;
		
		//connection establish
		conn = DriverManager.getConnection(DB_URL, NAME, PASSWORD);
		
		//sql query to insert data in contacts table
		String sqlQuery = " INSERT INTO contacts (name, email, mobile) VALUES(?,?,?) " ;
		
		//PREPARE SQL STATEMENT
		preparedstatement = conn.prepareStatement(sqlQuery);
		
		
		// data for insertion data
		String[] name = {"Snehal jadhav", "Vaibhav Jadhav", "Vedashri Pawar", "Malhar Jdhav"};
		String[] email = {"snehal@example.com", "vaibhav@example.com", "vedu@example.com", "malhar@example.com"};
		String[] mobile = {"2467435790", "3829490482", "3428592281", "3829503578"};
		
		
		// insert data
		for(int i=0; i<name.length; i++)
		{
			preparedstatement.setString(1,name[i]);
			preparedstatement.setString(2,email[i]);
			preparedstatement.setString(3,mobile[i] );
			preparedstatement.executeUpdate();
		}
		System.out.println("Data Inserted successfully.");
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(" select * from contacts");
		
		while(rs.next())
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		
		conn.close();
		
	}

}
