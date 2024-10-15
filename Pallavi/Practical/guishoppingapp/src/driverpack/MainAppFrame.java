package driverpack;
import java.util.List;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import Source.Cart;
import Source.Item;
import Source.Stock;
import util.FileUtil;
import gui.AddShowItemsPanel;
import gui.AddShowStockPanel;
import gui.SellPanel;
import gui.ShopMenuBar;
import handlers.AddShowItemsPanelHandler;
import handlers.AddShowStockPanelEventHandler;
import handlers.SellPanelHandler;
import handlers.ShopMenuBarHandler;

public class MainAppFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	public JPanel cardsPanel;
	JPanel sellPanel;
	JPanel showCartsPanel;
    public CardLayout cardlayout;
    
	public AddShowStockPanel addshowstockpanel;
	public AddShowStockPanelEventHandler addshowstockpaneleventhandler;
	
	public AddShowItemsPanel addshowitemspanel;
	public AddShowItemsPanelHandler addshowitemspanelhandler;
	
	public SellPanel sellpanel;
	public SellPanelHandler sellpanelhandler;
	
	public ShopMenuBarHandler shopmenubarhandler;
	public List<Item> items;
	public List<Cart> carts;
	public List<Stock> stocks;
	
	public MainAppFrame() throws ClassNotFoundException, IOException {
        super("Main Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		items = FileUtil.loadItems();
		carts = FileUtil.loadCarts();
		stocks = FileUtil.loadStock();
		//-------------------------------------------------------------------------
		cardsPanel = new JPanel(); 
		cardlayout = new CardLayout();
		cardsPanel.setLayout(cardlayout);
		
		//===========================================================================================
		addshowitemspanelhandler = new AddShowItemsPanelHandler(this);
		addshowitemspanel = new AddShowItemsPanel(addshowitemspanelhandler); 
		//addShowStcokPanel.setBackground(Color.RED);
		
		//===========================================================================================
		
		addshowstockpaneleventhandler = new AddShowStockPanelEventHandler(this);
		addshowstockpanel = new AddShowStockPanel(addshowstockpaneleventhandler); 
		//addShowStcokPanel.setBackground(Color.RED);
		
		//===========================================================================================
		sellpanelhandler = new SellPanelHandler(this);
		sellpanel = new SellPanel(sellpanelhandler); 
		//sellPanel.setBackground(Color.GREEN);
		//===========================================================================================
		showCartsPanel = new JPanel();
		showCartsPanel.setBackground(Color.BLUE);
		//===========================================================================================
		cardsPanel.add(new JPanel().add(new JLabel("Shopping Application")),"appMain");
		cardsPanel.add(addshowitemspanel,"addshowitemspanel");
		cardsPanel.add(addshowstockpanel,"addshowstockpanel");
		cardsPanel.add(sellpanel,"sellpanel");
		cardsPanel.add(showCartsPanel,"showCartsPanel");
		add(cardsPanel, BorderLayout.CENTER);
		//===========================================================================================
		// Create and add menubar to frame
		// Create the menu bar
		
		shopmenubarhandler = new ShopMenuBarHandler(this);
		ShopMenuBar shopmenubar = new ShopMenuBar(shopmenubarhandler);        
        setJMenuBar(shopmenubar);

	}
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        // This is where the main application starts
        MainAppFrame app = new MainAppFrame();

        app.setVisible(true);
    }
}
