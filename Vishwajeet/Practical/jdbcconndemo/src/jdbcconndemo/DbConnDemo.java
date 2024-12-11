package jdbcconndemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnDemo{

    public static void main(String[] args) {
        
        try {
            // Register/load the drivers
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish the connection
            String url = "jdbc:mysql://localhost:3306/demodb";
            String username = "root";
            String password = "Archer@1234";
            
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection successful");
            
            // Close the connection
            con.close();
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("MySQL JDBC Driver not found.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Connection failed.");
        }
    }
}

