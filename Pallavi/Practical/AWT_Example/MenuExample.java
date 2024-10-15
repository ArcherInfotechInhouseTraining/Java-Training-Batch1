import java.awt.*;
import java.awt.event.*;

public class MenuExample extends Frame implements ActionListener {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public MenuExample() {
        // Set the title of the frame
        super("Menu Example");

        // Set the size of the frame
        setSize(400, 300);

        // Create a menu bar
        MenuBar menuBar = new MenuBar();

        // Create a menu
        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");

        // Create menu items
        MenuItem openItem = new MenuItem("Open");
        MenuItem saveItem = new MenuItem("Save");
        MenuItem exitItem = new MenuItem("Exit");

        MenuItem cutItem = new MenuItem("Cut");
        MenuItem copyItem = new MenuItem("Copy");
        MenuItem pasteItem = new MenuItem("Paste");

        // Add action listeners to menu items
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);
        cutItem.addActionListener(this);
        copyItem.addActionListener(this);
        pasteItem.addActionListener(this);

        // Add menu items to the menu
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator(); // Add a separator line
        fileMenu.add(exitItem);

        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        // Add menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        // Set the menu bar for the frame
        setMenuBar(menuBar);

        // Add window listener to handle window close event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Get the label of the menu item that was clicked
        String command = e.getActionCommand();

        // Handle the menu item actions
        switch (command) {
            case "Open":
                System.out.println("Open selected");
                break;
            case "Save":
                System.out.println("Save selected");
                break;
            case "Exit":
                System.exit(0);
                break;
            case "Cut":
                System.out.println("Cut selected");
                break;
            case "Copy":
                System.out.println("Copy selected");
                break;
            case "Paste":
                System.out.println("Paste selected");
                break;
        }
    }

    public static void main(String[] args) {
        // Create an instance of the frame
        MenuExample frame = new MenuExample();

        // Make the frame visible
        frame.setVisible(true);
    }
}
