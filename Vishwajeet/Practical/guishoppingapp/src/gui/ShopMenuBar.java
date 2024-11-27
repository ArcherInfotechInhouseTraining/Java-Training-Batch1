package gui;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import handlers.ShopMenuBarHandler;

public class ShopMenuBar extends JMenuBar {
	private static final long serialVersionUID = 1L;
	public ShopMenuBar(ShopMenuBarHandler shopmenubarhandler) {

        JMenu fileMenu = new JMenu("File");

        JMenuItem asItem = new JMenuItem("Add-Show Items");
        asItem.addActionListener(shopmenubarhandler);
        JMenuItem asstock = new JMenuItem("Add-Show Stocks");
        asstock.addActionListener(shopmenubarhandler);
        JMenuItem sellItem = new JMenuItem("Sell");
        sellItem.addActionListener(shopmenubarhandler);
        JMenuItem sacarts = new JMenuItem("Show All Carts");
        sacarts.addActionListener(shopmenubarhandler);
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(shopmenubarhandler);

        // Add menu items to the "File" menu
        fileMenu.add(asItem);
        fileMenu.add(asstock);
        fileMenu.add(sellItem);
        fileMenu.add(sacarts);
        fileMenu.addSeparator();  // Add a separator line
        fileMenu.add(exitItem);

        add(fileMenu);

        JMenu helpMenu = new JMenu("Edit");

        JMenuItem producthelp = new JMenuItem("Product Help");
        producthelp.addActionListener(shopmenubarhandler);
        JMenuItem Apphelp = new JMenuItem("Application Help");
        Apphelp.addActionListener(shopmenubarhandler);

        helpMenu.add(producthelp);
        helpMenu.add(Apphelp);

        add(helpMenu);
	}
}
