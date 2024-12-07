package jdbcitemcrud;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MainFrame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	JButton addButton, deleteButton, updateButton, showButton;
    AddFrame addFrame;
    DeleteFrame deleteFrame;
    UpdateFrame updateFrame;
    ShowFrame showFrame;

    public MainFrame(String title) {
        super(title);
        setLayout(new FlowLayout());

        int width = 600;
        int height = 500;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - width) / 2;
        int y = (screen.height - height) / 2;
        setBounds(x, y, width, height);

        addButton = new JButton("Add Item");
        addButton.addActionListener(this);
        deleteButton = new JButton("Delete Item");
        deleteButton.addActionListener(this);
        updateButton = new JButton("Update Item");
        updateButton.addActionListener(this);
        showButton = new JButton("Show Item");
        showButton.addActionListener(this);

        add(addButton);
        add(deleteButton);
        add(updateButton);
        add(showButton);
    }

    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        if (command.equals("Add Item")) {
            System.out.println("Add Item is selected");
            addFrame = new AddFrame();
        } else if (command.equals("Delete Item")) {
            System.out.println("Delete Item is selected");
            deleteFrame = new DeleteFrame();
        } else if (command.equals("Update Item")) {
            System.out.println("Update Item is selected");
            updateFrame = new UpdateFrame();
        } else if (command.equals("Show Item")) {
            System.out.println("Show Item is selected");
            showFrame = new ShowFrame();
        }
    }

    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame("Main Frame");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }
}
