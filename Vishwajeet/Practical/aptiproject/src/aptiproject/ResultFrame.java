package aptiproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

class ResultFrame extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;

    private JPanel respan;
    private MainPanel imgpan;
    private JPanel stspan;
    private JPanel bpan;

    private JLabel res;
    private Image img;
    private JLabel lmrk;
    private JLabel lsub;
    private JButton ok, re;

    ResultFrame(String ttl) {
        super(ttl);
        setLayout(new GridLayout(4, 1));

        respan = new JPanel();
        res = new JLabel("Your Result ");
        res.setFont(new Font("", Font.BOLD, 25));
        respan.add(res);
        add(respan);

        try {
            img = ImageIO.read(new File("WAITING.gif"));
            imgpan = new MainPanel(img);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error loading image: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            imgpan = new MainPanel(img);
        }
        add(imgpan);

        stspan = new JPanel();
        lmrk = new JLabel("Mark ");
        lmrk.setFont(new Font("", Font.BOLD, 25));
        stspan.add(lmrk);
        add(stspan);

        bpan = new JPanel();
        ok = new JButton("Okay");
        ok.setFont(new Font("", Font.BOLD, 25));
        ok.addActionListener(this);
        bpan.add(ok);

        re = new JButton("Get Result");
        re.setFont(new Font("", Font.BOLD, 25));
        re.addActionListener(this);
        bpan.add(re);
        add(bpan);

        setVisible(true);
        setLocation(0, 0);
        setSize(1024, 768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == re) {
            int mark = MainWindow.getMark();
            String subject = SubjectChooser.getSubject();
            res.setText("Your Score IS " + mark);
            lmrk.setText("Mark " + mark + " Out Of 20 " + " Subject " + subject);

            String imagePath;
            if (mark >= 5) {
                imagePath = "img\\PASS.bmp";
            } else {
                imagePath = "img\\FAIL.bmp";
            }

            try {
                imgpan.setImage(ImageIO.read(new File(imagePath)));
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error loading image: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == ok) {
            this.dispose();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ResultFrame("Result Frame").setVisible(true));
    }
}
