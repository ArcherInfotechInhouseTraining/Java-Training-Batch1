package handlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Source.Stock;
import driverpack.MainAppFrame;
import util.CrudUtil;
import util.FileUtil;
import util.ListUtil;

public class SellPanelHandler implements ActionListener, ListSelectionListener{

	MainAppFrame frame;
	
	public SellPanelHandler(MainAppFrame mainappframe) throws IOException
	{
		frame = mainappframe;
		
	}
	@Override
	public void valueChanged(ListSelectionEvent e) {
		
		frame.sellpanel.sellbutton.setEnabled(true);
		
		if(!e.getValueIsAdjusting())
		{
			int selectedrow = frame.sellpanel.table1.getSelectedRow();
			if(selectedrow != -1)
			{
				int id = (int) frame.sellpanel.table1.getValueAt(selectedrow, 0);
				String name = (String) frame.sellpanel.table1.getValueAt(selectedrow, 1);
				double price = 	(double) frame.sellpanel.table1.getValueAt(selectedrow, 2);

				
				frame.sellpanel.textid.setText(""+id);
				frame.sellpanel.textname.setText(name);
				frame.sellpanel.textprice.setText(""+price);
				
				
				
				System.out.println("Row is selected");
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String command = e.getActionCommand();
    	System.out.println(command);
        if (command.equals("sell")) {
        	
        	int id = Integer.parseInt(frame.sellpanel.textid.getText());
        	int count = Integer.parseInt(frame.sellpanel.textcount.getText());
//        	CrudUtil.sellItem(id, count,frame.stocks);
        	ListUtil.decreaseStock(id, count, frame.stocks);
        	JOptionPane.showMessageDialog(frame, "Record Modified Sucessfully");
//        	CrudUtil.readStock(frame.sellpanel.model1,  frame.stocks, frame.items);
//        	CrudUtil.sellItem(frame.sellpanel.model1, frame.stocks, frame.items);
			frame.sellpanel.textid.setText("");
			frame.sellpanel.textname.setText("");
//			frame.sellpanel.counttext.setText("");
			
			frame.sellpanel.sellbutton.setEnabled(false);
		
	}
	
}
}
