package jdbcconndemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MenuDrivenContactMgmt {

	private static final String DB_URL = "jdbc:mysql://localhost/contactinfo";
	private static final String USER = "root";
	private static final String PASSWORD = "Archer@1234";
	
	

	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(DB_URL,USER,PASSWORD);
			Scanner scanner = new Scanner(System.in);
			int choice;
			
			while(true) {
				System.out.println("\n Menu \n");
				System.out.println("1. Create Contact");
				System.out.println("2. Insert Contact");
				System.out.println("3. Update Contact");
				System.out.println("4. Delete Contact");
				System.out.println("5. Retrieve Contact");
				System.out.println("6. Exit");
				System.out.println("Enter your choice");
				
				choice = scanner.nextInt();
				scanner.nextLine();
				
				switch(choice) {
				
				case 1:
					createTable(conn);
					break;
					
				case 2:
					insertContact(conn,scanner);
					break;
					
				case 3:
					updateContact(conn,scanner);
					break;
					
				case 4:
					deleteContact(conn,scanner);
					break;
					
				case 5:
					retreiveContacts(conn);
					break;
					
				case 6:
					conn.close();
					System.out.println("Exiting!!!!");
					return ;
					
				default:
					System.out.println("Invalid Choice");
					break;						
					
				}
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}



	private static void retreiveContacts(Connection conn) throws SQLException {
		String retreiveQuery = "SELECT * FROM contacts";
		PreparedStatement retreiveStatement = conn.prepareStatement(retreiveQuery);
		ResultSet resultSet = retreiveStatement.executeQuery();
		
		while(resultSet.next()) {
			int id = resultSet.getInt("id");
			String name = resultSet.getString("name");
			String email = resultSet.getString("email");
			String mobile = resultSet.getString("mobile");
			
			System.out.println("ID: "+id+", Name: "+name+", Email: "+email+", Mobile: "+mobile);
		}
		resultSet.close();
		retreiveStatement.close();
		
		
	}



	private static void deleteContact(Connection conn, Scanner scanner) throws SQLException {
		System.out.println("Enter id to delete");
		int id = scanner.nextInt();
		scanner.nextLine();
		
		String deleteQuery = "DELETE from contacts WHERE id=?";
		PreparedStatement deleteStatement = conn.prepareStatement(deleteQuery);
		deleteStatement.setInt(1, id);
		int deletedRows = deleteStatement.executeUpdate();
		
		if(deletedRows>0) {
			System.out.println("Contact delete successsfully!");
		}
		else {
			System.out.println("No contact found with given id");
		}
		
	}



	private static void updateContact(Connection conn, Scanner scanner) throws SQLException {
		System.out.println("Enter contact id to update");
		int id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter new name to update");
		String name = scanner.nextLine();
		System.out.println("Enter new email");
		String email = scanner.nextLine();
		System.out.println("Enter new Mobile number");
		String mobile = scanner.nextLine();
		
		String updateQuery = "UPDATE contacts SET name =?,email=?,mobile=? WHERE id =?";
		PreparedStatement updateStatement = conn.prepareStatement(updateQuery);
		updateStatement.setString(1,name);
		updateStatement.setString(2,email);
		updateStatement.setString(3,mobile);
		updateStatement.setInt(4,id);
		int updatedRows = updateStatement.executeUpdate();
		
		if(updatedRows>0) {
			System.out.println("Contact updated successfully!");
		}
		else {
			System.out.println("No contact found with given id");
		}
		
		
	}

	private static void insertContact(Connection conn, Scanner scanner) throws SQLException {
		System.out.println("Enter name");
		String name = scanner.nextLine();
		
		System.out.println("Enter Email");
		String email = scanner.nextLine();
		
		System.out.println("Enter mobile number");
		String mobile = scanner.nextLine();
		
		String insertQuery = "INSERT INTO contacts(name,email,mobile) VALUES(?,?,?)";
		PreparedStatement insertStatement = conn.prepareStatement(insertQuery);
		
		insertStatement.setString(1,name);
		insertStatement.setString(2,email);
		insertStatement.setString(3,mobile);
		insertStatement.executeUpdate();
		
		System.out.println("Contact inserted successfully");
		
	}



	private static void createTable(Connection conn) throws SQLException {
		Statement statement = conn.createStatement();
		String createTableSQL = "CREATE TABLE IF NOT EXISTS contacts (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(100),email VARCHAR(100),mobile VARCHAR(15))";
		statement.executeUpdate(createTableSQL);
		System.out.println("Table Created Successfully!");
		
		
	}

}
