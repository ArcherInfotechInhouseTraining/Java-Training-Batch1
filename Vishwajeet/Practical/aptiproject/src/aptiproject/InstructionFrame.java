package aptiproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class InstructionFrame extends JFrame implements ActionListener, ItemListener {
    private static final long serialVersionUID = 1L;

    private JPanel ipan;
    private JLabel i1, i2, i3, i4, i5;
    private static JPanel apan;
    private static JButton ok;
    private static JCheckBox agr;

    InstructionFrame(String ttl) {
        super(ttl);

        ipan = new JPanel();
        ipan.setBorder(BorderFactory.createTitledBorder("Instructions"));
        ipan.setLayout(new GridLayout(5, 1));

        i1 = new JLabel("(1). You Can Submit Your Answer Only Once");
        i1.setFont(new Font("", Font.ITALIC, 20));
        ipan.add(i1);

        i2 = new JLabel("(2). Any Misbehaving Will Lead To Disqualification");
        i2.setFont(new Font("", Font.ITALIC, 20));
        ipan.add(i2);

        i3 = new JLabel("(3). Passing Marks 5 Out Of 20");
        i3.setFont(new Font("", Font.ITALIC, 20));
        ipan.add(i3);

        i4 = new JLabel("(4). There Are 20 Questions For One Mark Each");
        i4.setFont(new Font("", Font.ITALIC, 20));
        ipan.add(i4);

        i5 = new JLabel("(5). You Have Selected " + SubjectChooser.getSubject() + " Subject");
        i5.setFont(new Font("", Font.ITALIC, 20));
        ipan.add(i5);

        add(ipan, BorderLayout.CENTER);

        apan = new JPanel();
        apan.setBorder(BorderFactory.createTitledBorder("Agreement"));
        agr = new JCheckBox(" I / We Agree To All Above Terms");
        agr.addItemListener(this);
        agr.setFont(new Font("", Font.BOLD, 15));
        apan.add(agr);

        ok = new JButton("Continue");
        ok.addActionListener(this);
        ok.setEnabled(false);
        apan.add(ok);

        add(apan, BorderLayout.SOUTH);

        setVisible(true);
        setLocation(250, 150);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

    public void itemStateChanged(ItemEvent e) {
        if (agr.isSelected()) {
            ok.setEnabled(true);
        } else {
            ok.setEnabled(false);
        }
    }

    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new StartOfTest("Best Luck");
    }

    public void setInstruction1(String ins) {
        i1.setText(ins);
    }

    public void setInstruction2(String ins) {
        i2.setText(ins);
    }

    public void setInstruction3(String ins) {
        i3.setText(ins);
    }

    public void setInstruction4(String ins) {
        i4.setText(ins);
    }

    public void setInstruction5(String ins) {
        i5.setText(ins);
    }

    public static void makeDisable() {
        apan.setVisible(false);
        agr.setVisible(false);
        ok.setVisible(false);
    }
    class SubjectChooser {
        // This method should return the selected subject
        public static String getSubject() {
            return "Sample Subject"; // Replace with actual logic to get the selected subject
        }
    }

    class StartOfTest {
        StartOfTest(String message) {
            // Constructor logic for starting the test
            System.out.println(message);
        }
    }

}