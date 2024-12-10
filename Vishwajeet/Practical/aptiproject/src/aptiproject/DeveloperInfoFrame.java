package aptiproject;

import javax.swing.*;

public class DeveloperInfoFrame extends JFrame {
    private static final long serialVersionUID = 1L;

    public DeveloperInfoFrame(String title) {
        super(title);

        JTextArea textArea = new JTextArea(10, 30);
        textArea.setText("Developer Team:\n\n" +
                         "1. Vishwajeet Pawar\n" +
                         "2. Swapnil Rupnar\n" +
                         "3. Sagar Borude\n" );
        textArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(textArea);

        add(scrollPane);

        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
