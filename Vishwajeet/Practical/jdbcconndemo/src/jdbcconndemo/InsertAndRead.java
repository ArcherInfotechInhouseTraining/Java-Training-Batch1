package jdbcconndemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertAndRead {

private static String  DB_URL = "jdbc:mysql://localhost/contactinfo";
private static final String USER = "root";
private static final String PASSWORD = "Archer@1234";
		
		public static void main(String[] args) {
			Connection con = null;
			PreparedStatement preparedstatement = null;
			
			try {
				// Establish conncetion to database
				con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
				
				// sql query to insert data in to contacts
				
				String sqlQuery = "INSERT INTO contacts (name,email,mobile) VALUES (?,?,?)";
				
				//prepare sql statement
				preparedstatement = con.prepareStatement(sqlQuery);
				
				// sample data for insertion
				String []names = {"Ritu Patil", "nisha pol", "vinod Joshi", "Rahul Kulkarni", "swagat More"};
				String []emails = {"Ritu.patil@example.com", "nisha.pol@example.com", "vinod.joshi@example.com", "rahul.kulkarni@example.com", "swagat.more@example.com"};
				String[] mobiles = {"9872343210", "7898889999", "5551434567", "4445786666", "3944567890"};
				
				// insert data into table
				for(int i=0;i<names.length;i++) {
					preparedstatement.setString(1, names[i]); 
					preparedstatement.setString(2, emails[i]); 
					preparedstatement.setString(3, mobiles[i]); 
					preparedstatement.executeUpdate();
				}
				System.out.println("Data Conncetion successfull");
				
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from contacts");
				while(rs.next())
						System.out.println(rs.getInt(1)+"         "+rs.getString(2)+"         "+rs.getString(3)+"         "+rs.getString(4));
				
				con.close();
				
			} catch(Exception e) {
				e.printStackTrace();
				
			}
		

	}

}
