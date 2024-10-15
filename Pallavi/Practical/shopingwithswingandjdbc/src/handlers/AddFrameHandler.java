package handlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import source.Item;
import source.MainFrame;
import util.Dbutil;

public class AddFrameHandler implements ActionListener {

	MainFrame mainframe;
	
	public AddFrameHandler(MainFrame mainframe)
	{
		this.mainframe = mainframe;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String command = e.getActionCommand();
		
		if(command.equals("save"))
		{
			int id = Integer.parseInt(mainframe.addFrame.textid.getText());
			String name = mainframe.addFrame.textname.getText();
			double price = Double.parseDouble(mainframe.addFrame.textprice.getText());

			mainframe.addFrame.textid.setText("");
			mainframe.addFrame.textname.setText("");
			mainframe.addFrame.textprice.setText("");
			Item item = new Item(id, name, price);
			
			try {
				System.out.println("entering in saveItem.");
				Dbutil.saveItem(item);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("Item inserted....");
		}
	}

}
