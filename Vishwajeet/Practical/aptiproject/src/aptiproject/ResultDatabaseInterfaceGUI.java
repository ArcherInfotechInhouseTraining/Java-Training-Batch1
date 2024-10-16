package aptiproject;

import javax.swing.*;
import java.util.Vector;
import java.sql.*;
import java.awt.*;

class ResultDatabaseInterfaceGUI extends JFrame implements Runnable {
    private static final long serialVersionUID = 1L;
    private JTable sheet;
    private Thread t;
    private Vector<Vector<String>> row;
    private Vector<String> col;

    ResultDatabaseInterfaceGUI() {
        try {
            row = new Vector<Vector<String>>();
            col = new Vector<String>();
            col.add("Id");
            col.add("Name");
            col.add("Mark");
            col.add("Subject");

            setLocation(350, 250);
            setSize(600, 400); // Increased size for better visibility
            setResizable(false);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            t = new Thread(this);
            t.start();

            setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error initializing GUI: " + e.getMessage());
        }
    }

    public void run() {
        Connection con = null;
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://D:\\aptitest\\ResultDatabase.mdb");
            String sql = "SELECT * FROM result_sheet";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Vector<String> rowData = new Vector<String>();
                rowData.add(rs.getString("id"));
                rowData.add(rs.getString("name"));
                rowData.add(rs.getString("mark"));
                rowData.add(rs.getString("subject")); 
                row.add(rowData);
            }

            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    sheet = new JTable(row, col);
                    add(new JScrollPane(sheet), BorderLayout.CENTER);
                    revalidate(); // Refresh the JFrame to show the JTable
                }
            });

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error accessing database: " + e.getMessage());
        } 
    }

    public static void main(String[] args) {
        new ResultDatabaseInterfaceGUI();
    }
}
