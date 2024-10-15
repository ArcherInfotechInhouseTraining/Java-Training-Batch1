package handlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import driverpack.MainAppFrame;
import util.ListUtil;
import util.CrudUtil;
public class AddShowStockPanelEventHandler implements ActionListener, ListSelectionListener{

	MainAppFrame frame;
	public AddShowStockPanelEventHandler(MainAppFrame mainAppFrame) {
		
		frame = mainAppFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		String command = e.getActionCommand();
    	System.out.println(command);
        if (command.equals("Add Stock")) {
        	
        	int id = Integer.parseInt(frame.addshowstockpanel.idtext.getText());
        	int count = Integer.parseInt(frame.addshowstockpanel.counttext.getText());
        	CrudUtil.addStock(id, count, frame.stocks, frame.items);
        	JOptionPane.showMessageDialog(frame, "Record Modified Sucessfully");
        	CrudUtil.readStock(frame.addshowstockpanel.model1,  frame.stocks, frame.items);
        	
			frame.addshowstockpanel.idtext.setText("");
			frame.addshowstockpanel.nametext.setText("");
			frame.addshowstockpanel.counttext.setText("");
			
			frame.addshowstockpanel.addButton.setEnabled(false);
        	
        } 
	}
	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		frame.addshowstockpanel.addButton.setEnabled(true);
		if (!e.getValueIsAdjusting()) {
            int selectedRow = frame.addshowstockpanel.table1.getSelectedRow();
            if (selectedRow != -1) {
                int id = (int) frame.addshowstockpanel.table1.getValueAt(selectedRow, 0);
                String name = (String) frame.addshowstockpanel.table1.getValueAt(selectedRow, 1);
                //int count = (int) frame.addshowstockpanel.table1.getValueAt(selectedRow, 2);
                //System.out.println("Selected Row: ID = " + id + ", Name = " + name + ", Price = " + price);
				frame.addshowstockpanel.idtext.setText(""+id);
				frame.addshowstockpanel.nametext.setText(name);
				//frame.addshowstockpanel.counttext.setText(""+count);
				 

            	System.out.println(" Row is Selected");
            }
        }
	}

}
