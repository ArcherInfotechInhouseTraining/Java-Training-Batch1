package jdbcitemcrud;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class UpdateFrame extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTable table;
    private DefaultTableModel model;
    private JTextField idField, nameField, priceField;
    private JButton updateButton;

    public UpdateFrame() {
        super("Update Frame");
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

        JPanel inputPanel = new JPanel(new GridLayout(4, 2));
        inputPanel.add(new JLabel("ID:"));
        idField = new JTextField();
        idField.setEnabled(false);
        inputPanel.add(idField);

        inputPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Price:"));
        priceField = new JTextField();
        inputPanel.add(priceField);

        updateButton = new JButton("Update Selected Item");
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateSelectedItem();
            }
        });
        inputPanel.add(updateButton);

        table.getSelectionModel().addListSelectionListener(event -> {
            if (!event.getValueIsAdjusting() && table.getSelectedRow() != -1) {
                int selectedRow = table.getSelectedRow();
                idField.setText(table.getValueAt(selectedRow, 0).toString());
                nameField.setText(table.getValueAt(selectedRow, 1).toString());
                priceField.setText(table.getValueAt(selectedRow, 2).toString());
            }
        });

        add(tablePanel, BorderLayout.CENTER);
        add(inputPanel, BorderLayout.SOUTH);
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

    private void updateSelectedItem() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            int id = Integer.parseInt(idField.getText());
            String name = nameField.getText();
            double price = Double.parseDouble(priceField.getText());

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

                // Create SQL update statement
                String updateQuery = "UPDATE items SET name = ?, price = ? WHERE id = ?";
                preparedStatement = connection.prepareStatement(updateQuery);
                preparedStatement.setString(1, name);
                preparedStatement.setDouble(2, price);
                preparedStatement.setInt(3, id);

                // Execute the update statement
                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Item updated successfully!");
                    table.setValueAt(name, selectedRow, 1);
                    table.setValueAt(price, selectedRow, 2);
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to update item.");
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

