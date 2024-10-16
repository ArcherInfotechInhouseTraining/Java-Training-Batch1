package handlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Source.Item;
import driverpack.MainAppFrame;
import util.CrudUtil;
import util.FileUtil;
import util.ListUtil;

public class AddShowItemsPanelHandler extends WindowAdapter implements ActionListener, ListSelectionListener {

	MainAppFrame mainAppFrame;
	public AddShowItemsPanelHandler(MainAppFrame mainAppFrame) {
		// TODO Auto-generated constructor stub
		this.mainAppFrame = mainAppFrame;
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		if (!e.getValueIsAdjusting()) {
            int selectedRow = mainAppFrame.addshowitemspanel.table1.getSelectedRow();
            if (selectedRow != -1) {
                int id = (int)mainAppFrame.addshowitemspanel.table1.getValueAt(selectedRow, 0);
                String name = (String)mainAppFrame.addshowitemspanel. table1.getValueAt(selectedRow, 1);
                double price = (double) mainAppFrame.addshowitemspanel.table1.getValueAt(selectedRow, 2);
                //System.out.println("Selected Row: ID = " + id + ", Name = " + name + ", Price = " + price);
                mainAppFrame.addshowitemspanel.textid.setText(""+id);
                mainAppFrame.addshowitemspanel.textid.setEditable(false);
                mainAppFrame.addshowitemspanel.textname.setText(name);
                mainAppFrame.addshowitemspanel.textprice.setText(""+price);                        

                mainAppFrame.addshowitemspanel.addButton.setEnabled(false);
                mainAppFrame.addshowitemspanel.modifyButton.setEnabled(true);
                mainAppFrame.addshowitemspanel.deleteButton.setEnabled(true); 
            }
        }
    }  


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String command = e.getActionCommand();
        if (command.equals("Add")) {
            
            int id = Integer.parseInt(mainAppFrame.addshowitemspanel.textid.getText());
            String name = mainAppFrame.addshowitemspanel.textname.getText();
            double price = Double.parseDouble(mainAppFrame.addshowitemspanel.textprice.getText());
                       
            mainAppFrame.addshowitemspanel.textid.setText("");
            mainAppFrame.addshowitemspanel.textname.setText("");
            mainAppFrame.addshowitemspanel.textprice.setText("");
            Item item = new Item(id, name, price);
            
            mainAppFrame.addshowitemspanel.model1.addRow(new Object[]{id, name, price});
            CrudUtil.createItem(mainAppFrame.addshowitemspanel.model1, item, mainAppFrame.items);
            ListUtil.addOrUpdateStock(id, 0, mainAppFrame.stocks);
        } else if (command.equals("Modify")) {
        	int id = Integer.parseInt(mainAppFrame.addshowitemspanel.textid.getText());
            String name = mainAppFrame.addshowitemspanel.textname.getText();
            double price = Double.parseDouble(mainAppFrame.addshowitemspanel.textprice.getText());
                       
            mainAppFrame.addshowitemspanel.textid.setText("");
            mainAppFrame.addshowitemspanel.textname.setText("");
            mainAppFrame.addshowitemspanel.textprice.setText("");
            Item item = new Item(id, name, price);
        	CrudUtil.updateItem(item, mainAppFrame.items);
            CrudUtil.readItems(mainAppFrame.addshowitemspanel.model1, mainAppFrame.items);
        
            mainAppFrame.addshowitemspanel.textid.setEditable(true);                  
            mainAppFrame.addshowitemspanel.addButton.setEnabled(true);
            mainAppFrame.addshowitemspanel.modifyButton.setEnabled(false);
            mainAppFrame.addshowitemspanel.deleteButton.setEnabled(false);
    		
            JOptionPane.showMessageDialog(mainAppFrame, "Record Modified Sucessfully");
        	
        }else if (command.equals("Delete")) {
        	JOptionPane.showMessageDialog(mainAppFrame, "Record Deleted Sucessfully");
        	int id = Integer.parseInt(mainAppFrame.addshowitemspanel.textid.getText());
            
        	mainAppFrame.addshowitemspanel.textid.setText("");
        	mainAppFrame.addshowitemspanel.textname.setText("");
        	mainAppFrame.addshowitemspanel.textprice.setText("");
            
        	mainAppFrame.addshowitemspanel.textid.setEditable(true);                  
        	mainAppFrame.addshowitemspanel.addButton.setEnabled(true);
        	mainAppFrame.addshowitemspanel.modifyButton.setEnabled(false);
        	mainAppFrame.addshowitemspanel.deleteButton.setEnabled(false);
    		
        	CrudUtil.deleteItem(id, mainAppFrame.items);
            CrudUtil.readItems(mainAppFrame.addshowitemspanel.model1, mainAppFrame.items);
        }
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		try {
			FileUtil.saveItems(mainAppFrame.items);
			FileUtil.saveStock(mainAppFrame.stocks);
			FileUtil.saveCarts(mainAppFrame.carts);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
