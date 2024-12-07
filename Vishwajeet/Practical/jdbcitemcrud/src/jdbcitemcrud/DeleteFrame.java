package jdbcitemcrud;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class DeleteFrame extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTable table;
    private DefaultTableModel model;
    private JButton deleteButton;

    public DeleteFrame() {
        super("Delete Frame");
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

        deleteButton = new JButton("Delete Selected Item");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteSelectedItem();
            }
        });

        add(tablePanel, BorderLayout.CENTER);
        add(deleteButton, BorderLayout.SOUTH);
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
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void deleteSelectedItem() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            int id = (int) table.getValueAt(selectedRow, 0);

            Connection connection = null;
            PreparedStatement preparedStatement = null;

            try {
                // Load the JDBC driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Establish a connection
                String url = "jdbc:mysql://localhost:3306/itemslist";
                String username = "root";
                String password = "Archer@1234";
                connection = DriverManager.getConnection(url, username, password);

                // Create SQL delete statement
                String deleteQuery = "DELETE FROM items WHERE id = ?";
                preparedStatement = connection.prepareStatement(deleteQuery);
                preparedStatement.setInt(1, id);

                // Execute the delete statement
                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Item deleted successfully!");
                    model.removeRow(selectedRow);
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to delete item.");
                }
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            }
        }
        else {
            JOptionPane.showMessageDialog(this, "No item selected.");
        }
    }
}
