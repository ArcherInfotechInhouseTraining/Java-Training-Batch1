package demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableIfNotExistsGUI extends JFrame {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/contactinfo";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root@123";

    private JTextField tableNameField;
    private JTextArea outputArea;

    public CreateTableIfNotExistsGUI() {
        setTitle("Create Table If Not Exists");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(new JLabel("Table Name:"));
        tableNameField = new JTextField(20);
        inputPanel.add(tableNameField);

        JButton checkCreateButton = new JButton("Check and Create Table");
        checkCreateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tableName = tableNameField.getText().trim();
                if (!tableName.isEmpty()) {
                    checkAndCreateTable(tableName);
                } else {
                    outputArea.setText("Please enter a table name.");
                }
            }
        });
        inputPanel.add(checkCreateButton);

        outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }

    private void checkAndCreateTable(String tableName) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            if (!checkTableExists(conn, tableName)) {
                createTable(conn, tableName);
                outputArea.setText("Table " + tableName + " created.");
            } else {
                outputArea.setText("Table " + tableName + " already exists.");
            }

        } catch (SQLException e) {
            outputArea.setText("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private boolean checkTableExists(Connection conn, String tableName) throws SQLException {
        DatabaseMetaData dbMetaData = conn.getMetaData();
        try (ResultSet rs = dbMetaData.getTables(null, null, tableName, new String[]{"TABLE"})) {
            return rs.next();
        }
    }

    private void createTable(Connection conn, String tableName) throws SQLException {
        String createTableSQL = "CREATE TABLE " + tableName + " (" +
                "ID INT AUTO_INCREMENT PRIMARY KEY, " +
                "Name VARCHAR(100), " +
                "Email VARCHAR(100), " +
                "Mobile VARCHAR(15))";
        
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(createTableSQL);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CreateTableIfNotExistsGUI().setVisible(true);
            }
        });
    }
}
