package aptiproject;

import javax.swing.*;

public class ProductHelpFrame extends JFrame {
    private static final long serialVersionUID = 1L;

    public ProductHelpFrame(String title) {
        super(title);

        JTextArea textArea = new JTextArea(10, 30);
        textArea.setText("Product Help:\n\n" +
                         "For any issues or inquiries, please contact our support team.\n\n" +
                         "Support Email: vishwjitpawar340@gmail.com\n" +
                         "Support Phone: 9096574223\n");
        textArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(textArea);

        add(scrollPane);

        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}

