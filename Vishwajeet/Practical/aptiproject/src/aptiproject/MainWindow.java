package aptiproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class MainWindow extends JFrame implements ActionListener, ItemListener, Runnable {
    private static final long serialVersionUID = 1L;
    private Font fnt;

    private JScrollPane quesr;
    private JPanel qpan;
    private JTextArea que;

    private JPanel oopan;
    private java.awt.List anslst;

    private JPanel rmtpan, rmqpan;
    private JLabel remtm, remqu;

    private JPanel brpan, tbrpan, qbrpan;
    private JLabel tbar, qbar;

    private JPanel bpan, bbpan;
    private JButton nxt, sub, skp, bak;

    private Vector<Integer> list;
    private Question question;
    private DatabaseInterface database;

    private Thread t;

    private int pos;
    private static int mark; // Static mark variable
    private int mm = 19, ss = 60;

    private Integer id;
    private String name;

    public MainWindow(String ttl, String selectedSubject, int id, String name) {
        super("Best Luck ..." + ttl);
        this.id = id;
        this.name = name;

        setLayout(new GridLayout(3, 1));

        fnt = new Font("", Font.BOLD, 20);

        qpan = new JPanel();
        qpan.setBackground(Color.WHITE);
        qpan.setBorder(BorderFactory.createTitledBorder("Question To Attempt"));

        que = new JTextArea();
        que.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        que.setEditable(false);
        que.setFont(fnt);
        qpan.add(que);
        quesr = new JScrollPane(qpan);
        add(quesr);

        oopan = new JPanel();
        oopan.setBorder(BorderFactory.createTitledBorder("Select Any One Answer"));
        oopan.setLayout(new GridLayout(1, 1));
        anslst = new java.awt.List(4);
        anslst.addItemListener(this);
        anslst.setFont(fnt);
        oopan.add(anslst);
        add(oopan);

        bpan = new JPanel();
        bpan.setLayout(new GridLayout(2, 1));

        bbpan = new JPanel();

        nxt = new JButton("Next");
        nxt.addActionListener(this);
        nxt.setFont(new Font("", Font.BOLD, 20));
        nxt.setEnabled(false);
        bbpan.add(nxt);

        sub = new JButton("Submit");
        sub.setEnabled(false);
        sub.addActionListener(this);
        sub.setFont(new Font("", Font.BOLD, 20));
        bbpan.add(sub);

        skp = new JButton("Skip");
        skp.addActionListener(this);
        skp.setFont(new Font("", Font.BOLD, 20));
        bbpan.add(skp);

        bak = new JButton("Back");
        bak.addActionListener(this);
        bak.setFont(new Font("", Font.BOLD, 20));
        bbpan.add(bak);

        bpan.add(bbpan);

        brpan = new JPanel();
        brpan.setBorder(BorderFactory.createTitledBorder("Your Progress"));

        brpan.setLayout(new GridLayout(2, 1));

        rmtpan = new JPanel();
        rmtpan.setLayout(new GridLayout(1, 1));

        remtm = new JLabel("Remaining Time ..");
        remtm.setFont(fnt);
        rmtpan.add(remtm);
        brpan.add(rmtpan);

        tbrpan = new JPanel();

        tbrpan.setLayout(new GridLayout(2, 1));
        tbar = new JLabel("20:00");
        tbar.setFont(new Font("", Font.BOLD, 20));
        tbrpan.add(tbar);
        brpan.add(tbrpan);

        rmqpan = new JPanel();
        rmqpan.setLayout(new GridLayout(2, 1));

        remqu = new JLabel("Remaining Questions ..");
        remqu.setFont(fnt);
        rmqpan.add(remqu);
        brpan.add(rmqpan);

        qbrpan = new JPanel();
        qbrpan.setLayout(new GridLayout(2, 1));
        qbar = new JLabel("");
        qbar.setFont(new Font("", Font.BOLD, 20));
        qbrpan.add(qbar);
        brpan.add(qbrpan);
        bpan.add(brpan);

        add(bpan);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                saveResult(selectedSubject);
            }
        });

        pos = 0;
        mark = 0;
        t = new Thread(this);
        t.start();

        setVisible(true);
        setSize(1024, 700);

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error setting look and feel: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        database = new DatabaseInterface(); // Initialize database interface

        // Load questions for the selected subject
        list = (Vector<Integer>) database.getQuestionsForSubject(selectedSubject);
        if (list.size() > 0) {
            displayNextQuestion();
        } else {
            JOptionPane.showMessageDialog(this, "No questions available for the selected subject: " + selectedSubject, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void displayNextQuestion() {
        if (pos < list.size()) {
            int questionId = list.get(pos);
            question = database.getFullQuestion(questionId);
            que.setText(question.getQuestion());
            anslst.removeAll();
            anslst.add(question.getOpt1());
            anslst.add(question.getOpt2());
            anslst.add(question.getOpt3());
            anslst.add(question.getOpt4());
            pos++;
            nxt.setEnabled(true);
        } else {
            endTest();
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nxt) {
            displayNextQuestion();
        }
        if (e.getSource() == sub) {
            String selectedOption = anslst.getSelectedItem();
            String correctAnswer = question.getAnswer();

            if (selectedOption != null && selectedOption.equals(correctAnswer)) {
                mark++;
            }
            sub.setEnabled(false);
            nxt.setEnabled(true);
        }
        if (e.getSource() == skp) {
            displayNextQuestion();
        }
        if (e.getSource() == bak) {
            // Implement action for the back button
        }
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == anslst) {
            sub.setEnabled(true);
        }
    }

    public void run() {
        while (true) {
            if (mm == 0 && ss == 0) {
                endTest();
                break;
            } else {
                if (ss == 0) {
                    ss = 60;
                    mm--;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ss--;
                tbar.setText(mm + ":" + ss);
            }
        }
    }

    private void endTest() {
        nxt.setEnabled(false);
        sub.setEnabled(false);
        skp.setEnabled(false);
        bak.setEnabled(false);
        saveResult("subject_name_here"); // Replace with actual subject name
    }

    private void saveResult(String subject) {
        PreparedStatement ps = null;
        try {
            // Prepare SQL insert statement
            String sql = "INSERT INTO result_sheet (id, name, mark, subject, test_date) VALUES (?, ?, ?, ?, ?)";
            ps = database.getConnection().prepareStatement(sql);

            // Set the parameters for the prepared statement
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setDouble(3, mark);
            ps.setString(4, subject);
            ps.setDate(5, new java.sql.Date(System.currentTimeMillis()));

            // Execute the insert statement
            ps.executeUpdate();

            // Inform the user that the results have been saved
            JOptionPane.showMessageDialog(this, "Test results saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error saving test results: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (ps != null) ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
 
            new MainWindow("Aptitude Test", "Java Programming", 1, "John Doe");
        
    }

    public static int getMark() {
        return mark;
    }
}
