package aptiproject;

import java.sql.*;
import javax.swing.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

class DatabaseInterface {
    private Question q;

    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;
    private String table;

    DatabaseInterface() {
        try {
            q = new Question(0, sql, sql, sql, sql, sql, sql);

            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

            if (SubjectChooser.getSubject().trim().equals("C Programming")) table = "c_apti_db";
            if (SubjectChooser.getSubject().trim().equals("C++ Programming")) table = "cpp_apti_db";
            if (SubjectChooser.getSubject().trim().equals("Java Programming")) table = "j_apti_db";
            if (SubjectChooser.getSubject().trim().equals("C# Programming")) table = "ch_apti_db";
            con = DriverManager.getConnection("jdbc:ucanaccess://D:\\aptitest\\ResultDatabase.mdb");
            sql = new String();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e);
        }
    }
//
//    public List<Integer> getQuestionsForSubject(String subject) {
//        List<Integer> questionIds = new ArrayList<>();
//        String sql = "SELECT id FROM "+table+" WHERE subject = ?";
//        try (PreparedStatement ps = con.prepareStatement(sql)) {
//            ps.setString(1, subject);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                questionIds.add(rs.getInt("id"));
//            }
//        } catch (SQLException e) {
//        	 e.printStackTrace();
//            System.out.println("Error retrieving questions for subject: " + e.getMessage());
//        }
//        return questionIds;
//    }

    public Question getFullQuestion(int questionId) {
        Question question = null;
        String sql = "SELECT * FROM "+table +" WHERE id = questionId";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, questionId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                question = new Question(
                        rs.getInt("id"),
                        rs.getString("question"),
                        rs.getString("opt1"),
                        rs.getString("opt2"),
                        rs.getString("opt3"),
                        rs.getString("opt4"),
                        rs.getString("answer")
                );
            }
        } catch (SQLException e) {
            System.out.println("Error retrieving question details: " + e.getMessage());
            e.printStackTrace();
        }
        return question;
    }

    public void closeConnection() {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            System.out.println("Error closing database connection: " + e.getMessage());
            e.printStackTrace();
        }
    }


    String getAnswer(int id) {
        String ans = "";
        try {
            sql = "SELECT answer FROM " + table + " WHERE id=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                ans = rs.getString("answer").trim();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error retrieving answer: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return ans;
    }

	public Connection getConnection() {
        return con;
    }
}
