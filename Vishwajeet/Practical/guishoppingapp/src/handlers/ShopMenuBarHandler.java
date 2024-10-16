package handlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;

import driverpack.MainAppFrame;
import util.CrudUtil;
import util.FileUtil;

public class ShopMenuBarHandler implements ActionListener {

	MainAppFrame mainAppFrame;

	public ShopMenuBarHandler(MainAppFrame mainAppFrame) {
		// TODO Auto-generated constructor stub
		this.mainAppFrame = mainAppFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String command = e.getActionCommand();
		if (command.equals("Add-Show Items")) {

			System.out.println(command + " is Selected");
			mainAppFrame.cardlayout.show(mainAppFrame.cardsPanel, "addshowitemspanel");
			CrudUtil.readItems(mainAppFrame.addshowitemspanel.model1, mainAppFrame.items);

		} else if (command.equals("Add-Show Stocks")) {

			System.out.println(command + " is Selected");
			mainAppFrame.cardlayout.show(mainAppFrame.cardsPanel, "addshowstockpanel");
			CrudUtil.readStock(mainAppFrame.addshowstockpanel.model1, mainAppFrame.stocks, mainAppFrame.items);

		} else if (command.equals("Sell")) {
			
			JOptionPane.showMessageDialog(mainAppFrame, "Sell menu clicked");
			
		}else if (command.equals("Show All Carts")) {

			JOptionPane.showMessageDialog(mainAppFrame, "Show All Carts menu clicked");
			
		} else if (command.equals("Exit")) {

			try {
				FileUtil.saveItems(mainAppFrame.items);
				FileUtil.saveStock(mainAppFrame.stocks);
				FileUtil.saveCarts(mainAppFrame.carts);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.exit(0);
		}
	}

}
