package aptiproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		Connection con = DriverManager.getConnection("jdbc:ucanaccess://D:\\aptitest\\AptiDatabase.mdb");
		System.out.println("Connection Eastablished");
		
		String sql = "select * from ch_apti_db";
		PreparedStatement statement = con.prepareStatement(sql);
		ResultSet rs = statement.executeQuery();
		while(rs.next()) {
			System.out.println( rs.getString("question").trim()+"\n"+
        			rs.getString("opt1").trim()+"\t"+
        			rs.getString("opt2").trim()+"\t"+
        			rs.getString("opt3").trim()+"\t"+
        			rs.getString("opt4").trim()+"\t"+
        			rs.getString("answer").trim());
        System.out.println("\n ========================================== ");
		}
	}
}
