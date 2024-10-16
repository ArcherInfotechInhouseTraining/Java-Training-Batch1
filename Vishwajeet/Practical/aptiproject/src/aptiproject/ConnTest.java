package aptiproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConnTest {

	public static void main(String []args) throws ClassNotFoundException, SQLException
	{
		Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		Connection con = DriverManager.getConnection("jdbc:ucanaccess://D:\\aptitest\\AptiDatabase.mdb");
		System.out.println("Connection Eastablished");

		String sql = "select * from c_apti_db";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
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
