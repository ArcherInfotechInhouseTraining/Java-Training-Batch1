
package jdbcitemcrud;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class ShowFrame extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTable table;
    private DefaultTableModel model;

    public ShowFrame() {
        super("Show Items");
        setLayout(new BorderLayout());
        int width = 600;
        int height = 400;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - width) / 2;
        int y = (screen.height - height) / 2;
        setBounds(x, y, width, height);

        JPanel tablePanel = new JPanel(new BorderLayout());
        String[] columnNames = {"ID", "Name", "Price"};
        model = new DefaultTableModel(null, columnNames);
        table = new JTable(model);
        loadItemsFromDatabase();
        tablePanel.add(new JScrollPane(table), BorderLayout.CENTER);

        add(tablePanel, BorderLayout.CENTER);
        setVisible(true);
    }

    private void loadItemsFromDatabase() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection
            String url = "jdbc:mysql://localhost:3306/itemslist";
            String username = "root";
            String password = "Archer@1234";
            connection = DriverManager.getConnection(url, username, password);

            // Create SQL select statement
            String selectQuery = "SELECT * FROM items";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(selectQuery);

            // Load data into the table model
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                model.addRow(new Object[]{id, name, price});
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        } 
    }
}

