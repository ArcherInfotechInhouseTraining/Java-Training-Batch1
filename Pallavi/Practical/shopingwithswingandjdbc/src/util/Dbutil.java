package util;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;

import gui.ShowFrame;
import source.Item;

public class Dbutil {
	
//	private static final String Db_url = "jdbc:mysql://localhost/shopinfo";
	private static final String Db_url = "jdbc:mysql://127.0.0.1:3306/shopinfo";
	private static final String Name = "root";
	private static final String Password = "root@123";
	
	static String tableName ;
	
	static Connection conn = null;
	static {
		try {
			conn = DriverManager.getConnection(Db_url, Name, Password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void saveItem(Item item) throws SQLException {
		
		//String tableName = "itemTable";
		tableName = "itemTable";
		//conn = DriverManager.getConnection(Db_url, Name, Password);
		
		if(! checkTableExists(conn, tableName))
		{
			createTable(conn,tableName);
			System.out.println("Table " + tableName + " created.");
		}
		
		String insertQuery = " INSERT INTO itemTable (Id, Name, Price)VALUES(?, ?, ?) ";
		PreparedStatement insertStatement = conn.prepareStatement(insertQuery);
		insertStatement.setInt(1,item.getId());
		insertStatement.setString(2, item.getName());
		insertStatement.setDouble(3, item.getPrice());
		insertStatement.executeUpdate();
		
		System.out.println("Item inserted");
	}

	private static void createTable(Connection conn2, String tableName) throws SQLException {
		
		Statement statement = conn.createStatement();
		String createtableSql = "CREATE TABLE IF NOT EXISTS itemTable(Id INT primary key, Name VARCHAR(100), Price DOUBLE)";
		statement.executeUpdate(createtableSql);
		
	}

	private static boolean checkTableExists(Connection conn2, String tableName) throws SQLException {
		// TODO Auto-generated method stub
		DatabaseMetaData dbMetaData = conn.getMetaData();
		
		try(ResultSet rs = dbMetaData.getTables(null, null, tableName, new String[] {"Table"}))
		{
			return rs.next();
		}
	}

	public static void showItems() throws SQLException {
	
	//	conn = DriverManager.getConnection(Db_url, Name, Password);
		String showQuery = "SELECT * FROM itemTable";
		PreparedStatement RetriveStatement = conn.prepareStatement(showQuery);
		ResultSet resultSet = RetriveStatement.executeQuery();
		
		//clear existing tble
		DefaultTableModel model = (DefaultTableModel)ShowFrame.table.getModel();
		model.setRowCount(0);
		
		while(resultSet.next())
		{
			int Id = resultSet.getInt("Id");
			String Name = resultSet.getString("Name");
			double Price = resultSet.getDouble("Price");
			
			model.addRow(new Object[] {Id, Name, Price});
		}
		resultSet.close();
		RetriveStatement.close();	
	}

}
