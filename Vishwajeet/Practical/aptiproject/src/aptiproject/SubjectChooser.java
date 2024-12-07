package aptiproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SubjectChooser extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    private JPanel pan, pan2, pan3;
    private JButton ok;
    private JLabel lab;
    private Choice sub;
    private static String selectedSubject;
    private String username;

    SubjectChooser(String ttl, String username) {
        super(ttl);
        this.username = username;

        setLayout(new GridLayout(3, 1));
        pan2 = new JPanel();
        pan = new JPanel();
        lab = new JLabel("Select Subject ");
        lab.setFont(new Font("", Font.BOLD, 15));
        pan.add(lab);
        sub = new Choice();
        sub.setFont(new Font("", Font.BOLD, 15));
        sub.add("C Programming");
        sub.add("Data Structure");
        sub.add("C++ Programming");
        sub.add("Java Programming");
        sub.add("C# Programming");
        pan.add(sub);
        pan3 = new JPanel();
        ok = new JButton("Continue");
        ok.addActionListener(this);
        pan3.add(ok);
        add(pan2);
        add(pan);
        add(pan3);
        setVisible(true);
        setSize(300, 300);
        setLocationRelativeTo(null); // Center on screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        selectedSubject = sub.getItem(sub.getSelectedIndex());
        setVisible(false);
        SwingUtilities.invokeLater(() -> {
            new StartOfTest("Start Test");
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SubjectChooser("Choose Subject", "DefaultUser");
        });
    }

    public static String getSubject() {
        
        return selectedSubject;
    }
}
