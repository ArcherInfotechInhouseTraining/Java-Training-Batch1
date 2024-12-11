import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainAppFrame1 extends JFrame {
    private JPanel mainPanel;
    private JPanel addItemPanel;
    private JPanel addStockPanel;
    private JPanel sellPanel;
    private JPanel showCartsPanel;

    public MainAppFrame1() {
        super("Main Application");

        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize main panel with CardLayout
        mainPanel = new JPanel(new CardLayout());
        add(mainPanel, BorderLayout.CENTER);

        // Initialize panels for each feature
        addItemPanel = new JPanel(new BorderLayout());
        addStockPanel = new JPanel();
        addStockPanel.add(new JLabel("Add-Show Stocks Panel"));
        sellPanel = new JPanel();
        sellPanel.add(new JLabel("Sell Panel"));
        showCartsPanel = new JPanel();
        showCartsPanel.add(new JLabel("Show All Carts Panel"));

        // Add item panel components
        JTextArea itemTextArea = new JTextArea(5, 20);
        JButton addItemButton = new JButton("Add");
        JPanel addItemInputPanel = new JPanel();
        addItemInputPanel.setLayout(new BorderLayout());
        addItemInputPanel.add(new JScrollPane(itemTextArea), BorderLayout.CENTER);
        addItemInputPanel.add(addItemButton, BorderLayout.SOUTH);
        
        addItemPanel.add(addItemInputPanel, BorderLayout.CENTER);

        // Add panels to the main panel with unique names
        mainPanel.add(addItemPanel, "Add-Show Items");
        mainPanel.add(addStockPanel, "Add-Show Stocks");
        mainPanel.add(sellPanel, "Sell");
        mainPanel.add(showCartsPanel, "Show All Carts");

        // Add a simple label for demonstration purposes
        JLabel label = new JLabel("Welcome to the Main Application", JLabel.CENTER);
        add(label, BorderLayout.NORTH);

        // Create and add menubar to frame
        JMenuBar menuBar = new JMenuBar();

        // Create the "File" menu
        JMenu fileMenu = new JMenu("File");

        // Create menu items for the "File" menu
        JMenuItem asItem = new JMenuItem("Add-Show Items");
        JMenuItem asstock = new JMenuItem("Add-Show Stocks");
        JMenuItem sellItem = new JMenuItem("Sell");
        JMenuItem sacarts = new JMenuItem("Show All Carts");
        JMenuItem exitItem = new JMenuItem("Exit");

        // Add menu items to the "File" menu
        fileMenu.add(asItem);
        fileMenu.add(asstock);
        fileMenu.add(sellItem);
        fileMenu.add(sacarts);
        fileMenu.addSeparator();  // Add a separator line
        fileMenu.add(exitItem);

        // Add the "File" menu to the menu bar
        menuBar.add(fileMenu);

        // Create the "Edit" menu
        JMenu helpMenu = new JMenu("Edit");

        // Create menu items for the "Edit" menu
        JMenuItem producthelp = new JMenuItem("Product Help");
        JMenuItem Apphelp = new JMenuItem("Application Help");

        // Add menu items to the "Edit" menu
        helpMenu.add(producthelp);
        helpMenu.add(Apphelp);

        // Add the "Edit" menu to the menu bar
        menuBar.add(helpMenu);

        // Set the menu bar for the frame
        setJMenuBar(menuBar);

        // Add event listeners for the menu items to switch cards
        asItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) mainPanel.getLayout();

                cl.show(mainPanel, "Add-Show Items");
            }
        });

        asstock.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) mainPanel.getLayout();
                cl.show(mainPanel, "Add-Show Stocks");
				  String input = itemTextArea.getText().trim();
                if (!input.isEmpty()) {
                    String[] parts = input.split("\\s+");
                    if (parts.length == 3) {
                        String id = parts[0];
                        String name = parts[1];
                        String price = parts[2];
                        // You can add the code to process these values, such as saving to a database
                        JOptionPane.showMessageDialog(addItemPanel, "Item Added: ID=" + id + ", Name=" + name + ", Price=" + price);
                        itemTextArea.setText(""); // Clear the text area after adding the item
                    } else {
                        JOptionPane.showMessageDialog(addItemPanel, "Invalid input. Please enter ID, Name, and Price separated by spaces.");
                    }
                } else {
                    JOptionPane.showMessageDialog(addItemPanel, "Input is empty. Please enter ID, Name, and Price.");
                }
            }
        });

        sellItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) mainPanel.getLayout();
                cl.show(mainPanel, "Sell");
            }
        });

        sacarts.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) mainPanel.getLayout();
                cl.show(mainPanel, "Show All Carts");
            }
        });

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        producthelp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MainAppFrame1.this, "Product Help item clicked");
            }
        });

        Apphelp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MainAppFrame1.this, "Application Help item clicked");
            }
        });

   }

    public static void main(String[] args) {
        // This is where the main application starts
        MainAppFrame app = new MainAppFrame();
        app.setVisible(true);
    }
}

