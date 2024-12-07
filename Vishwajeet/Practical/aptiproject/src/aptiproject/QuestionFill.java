package aptiproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

class QuestionFill {
    static Connection con;
    static String sql;
    static {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://D://aptitest//AptiDatabase.mdb");
            sql = "";
        } catch (Exception e) {
            System.out.println("Error loading driver: " + e);
        }
    }

    private int id;

    QuestionFill() {
        id = 1;
    }

    void storeQuestion(int id, String que, String o1, String o2, String o3, String o4, String ans) {
        PreparedStatement ps = null;
        try {
            sql = "INSERT INTO c_apti_db (id, question, opt1, opt2, opt3, opt4, answer) VALUES (?, ?, ?, ?, ?, ?, ?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, que.trim());
            ps.setString(3, o1.trim());
            ps.setString(4, o2.trim());
            ps.setString(5, o3.trim());
            ps.setString(6, o4.trim());
            ps.setString(7, ans.trim());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error storing question: " + e.getMessage());
        } finally {
            try {
                if (ps != null) ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    void updateQuestion(int id, String que, String o1, String o2, String o3, String o4, String ans) {
        PreparedStatement ps = null;
        try {
            sql = "UPDATE c_apti_db SET question=?, opt1=?, opt2=?, opt3=?, opt4=?, answer=? WHERE id=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, que.trim());
            ps.setString(2, o1.trim());
            ps.setString(3, o2.trim());
            ps.setString(4, o3.trim());
            ps.setString(5, o4.trim());
            ps.setString(6, ans.trim());
           // ps.setInt(7, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error updating question: " + e.getMessage());
        }
    }

    int getNextID() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
//            sql = "SELECT id FROM c_apti_db ORDER BY id DESC";
        	sql = "SELECT id FROM "+ c_apti_db+" ORDER BY id DESC";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
             while(rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error getting next ID: " + e.getMessage());
        	} 
        return id+1;
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "" + new QuestionFill().getNextID());
    }
}
