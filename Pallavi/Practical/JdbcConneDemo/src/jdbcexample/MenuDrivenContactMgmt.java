package jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MenuDrivenContactMgmt {

	private static final String DB_URL = "jdbc:mysql://localhost/contactinfo";
	private static final String Name = "root";
	private static final String Password = "root@123";
	
	private static void  createTable(Connection conn) throws SQLException
	{
		Statement statement = conn.createStatement();
		String createTableSQL = "CREATE TABLE IF NOT EXISTS contacts(ID INT AUTO_INCREMENT primary key, Name VARCHAR(100), Email VARCHAR(100), Mobile VARCHAR(15))";
		statement.executeUpdate(createTableSQL);
		System.out.println("Table created successfully.");
	}
	
	private static void insertContact(Connection conn, Scanner sc) throws SQLException
	{
		
		sc.nextLine();
		
		System.out.println("Enter name: ");
		String Name = sc.nextLine();
		
		System.out.println("Enter email: ");
		String Email = sc.nextLine();
		
		
		System.out.println("Enter mobile number: ");
		String Mobile = sc.nextLine();
		
		String insertQuery = " INSERT INTO contacts (name, email, mobile) VALUES(?, ?, ?) ";
		PreparedStatement insertStatement = conn.prepareStatement(insertQuery);
		insertStatement.setString(1, Name);
		insertStatement.setString(2, Email);
		insertStatement.setString(3, Mobile);
		insertStatement.executeUpdate();
		
		System.out.println("Contact inserted successfully");	
	}
	
	private static void updateContact(Connection conn, Scanner sc) throws SQLException
	{
		System.out.println("Enter contact id to update: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter new name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter new email: ");
		String email = sc.nextLine();
		
		System.out.println("Enter new mobile: ");
		String mobile = sc.nextLine();
		
		String updateQuery = " UPDATE contacts SET name = ?, email = ?, mobile = ? WHERE id = ?";
		PreparedStatement updateStatement = conn.prepareStatement(updateQuery);
		updateStatement.setString(1, name);
		updateStatement.setString(2, email);
		updateStatement.setString(3, mobile);
		updateStatement.setInt(4, id);
		int updateRows = updateStatement.executeUpdate();
		
		if(updateRows>0)
			System.out.println("Contact updated successfully.");
		else
			System.out.println("Invalid Id.");
	}
	
	private static void deleteContact(Connection conn, Scanner sc) throws SQLException
	{
		System.out.println("Enter Contact id to delete: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		String deleteQuery = "DELETE FROM contacts WHERE id=?";
		PreparedStatement deleteStatement = conn.prepareStatement(deleteQuery);
		deleteStatement.setInt(1, id);
		int deletedRows = deleteStatement.executeUpdate();
		
		if(deletedRows>0)
		{
			System.out.println("Contact deleted successfully.");
		}
		else
		{
			System.out.println("No contact found with given id");
		}
	}
	
	private static void retriveContact(Connection conn) throws SQLException
	{
		String retiveQuery = "SELECT * FROM contacts";
		PreparedStatement RetriveStatement = conn.prepareStatement(retiveQuery);
		ResultSet resultSet = RetriveStatement.executeQuery();
		
		while(resultSet.next())
		{
			int id = resultSet.getInt("id");
			String name = resultSet.getString("name");
			String email = resultSet.getString("email");
			String mobile = resultSet.getString("mobile");
			System.out.println("ID: "+id+" name: "+name+" email: "+email+" mobile: "+mobile);
		}
		resultSet.close();
		RetriveStatement.close();
		
	}
	public static void main(String[] args) throws SQLException {
		
		Connection conn = null;
		
		conn = DriverManager.getConnection(DB_URL,Name,Password);
		Scanner sc = new Scanner(System.in);
		int ch;
		
		while(true)
		{
			System.out.println("******** MENU ********");
			System.out.println("1.Create Contact");
			System.out.println("2.Insert Contact");
			System.out.println("3.Update Contact");
			System.out.println("4.Delete Contact");
			System.out.println("5.Retrive Contact");
			System.out.println("6.Exit");
			
			System.out.println("Enter your choice: ");
			ch = sc.nextInt();
			
			switch(ch)
			{
				case 1:
					createTable(conn);
					break;
					
				case 2:
					insertContact(conn, sc);
					break;
					
				case 3:
					updateContact(conn, sc);
					break;
					
				case 4:
					deleteContact(conn, sc);
					break;
					
				case 5:
					retriveContact(conn);
					break;
					
				case 6:
					conn.close();
					System.out.println("Exiting...");
					return;
				
				default:
						System.out.println("Invalid choice, please try again.");
			}
		}

	}

}
