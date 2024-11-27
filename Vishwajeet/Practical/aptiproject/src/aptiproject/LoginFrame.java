package aptiproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginFrame extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;

    JLabel userLabel;
    JTextField userTextField;
    JLabel passLabel;
    JPasswordField passField;
    JButton loginButton;
    JButton cancelButton;

    public LoginFrame(String title) {
        super(title);

        userLabel = new JLabel("Username:");
        userTextField = new JTextField(15);

        passLabel = new JLabel("Password:");
        passField = new JPasswordField(15);

        loginButton = new JButton("Login");
        loginButton.addActionListener(this);

        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(this);

        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(userLabel);
        panel.add(userTextField);
        panel.add(passLabel);
        panel.add(passField);
        panel.add(loginButton);
        panel.add(cancelButton);

        add(panel, BorderLayout.CENTER);

        setSize(300, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = userTextField.getText();
            String password = new String(passField.getPassword());

            // Placeholder for login action (implement your authentication logic here)
            if (username.equals("user") && password.equals("password")) { // Example credentials
                System.out.println("Username: " + username);
                System.out.println("Password: " + password);

                // If login is successful
                JOptionPane.showMessageDialog(this, "Login Successful!");
                dispose(); // Close the login window on successful login
                new SubjectChooser("Choose Subject", username); // Pass username to SubjectChooser
            } else {
                JOptionPane.showMessageDialog(this, "Login Failed!");
            }
        } else if (e.getSource() == cancelButton) {
            dispose(); // Close the login window if cancel is pressed
        }
    }

    public static void main(String[] args) {
      
            new LoginFrame("Login");
        
    }
}
