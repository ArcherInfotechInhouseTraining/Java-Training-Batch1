package gui;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import handlers.AddShowStockPanelEventHandler;

public class AddShowStockPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	public JTextField idtext, nametext, counttext;
	public JButton addButton;
	public DefaultTableModel model1;
	public JTable table1;
	public AddShowStockPanel(AddShowStockPanelEventHandler addshowstockpaneleventhandler) {
		setLayout(new GridLayout(1,2));
		
		JPanel leftPanel = new JPanel();
		leftPanel.setLayout(new GridLayout(20,1));
		
		JPanel mainmsgpanel = new JPanel();
		mainmsgpanel.setLayout(new FlowLayout());		
		JLabel mainmsg = new JLabel("Add-Show Stock");
		mainmsgpanel.add(mainmsg);
		leftPanel.add(mainmsgpanel);
		
		JPanel msgpanel = new JPanel();
		msgpanel.setLayout(new FlowLayout());
		JLabel msg = new JLabel("Id and Name are Auto fetched, Enter Inward Item Count only");
		msgpanel.add(msg);
		leftPanel.add(msgpanel);
		
		JPanel textPanel = new JPanel();
		textPanel.setLayout(new FlowLayout());
		idtext = new JTextField(10);
		idtext.setEditable(false);
		nametext = new JTextField(10);
		nametext.setEditable(false);
		counttext = new JTextField(10);
		textPanel.add(idtext);
		textPanel.add(nametext);
		textPanel.add(counttext);
		leftPanel.add(textPanel);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		addButton = new JButton("Add Stock");
		addButton.setEnabled(false);
		addButton.addActionListener(addshowstockpaneleventhandler);
		buttonPanel.add(addButton);
		leftPanel.add(buttonPanel);
		
		add(leftPanel);
		//----------------------------------------------
		
		JPanel rightPanel = new JPanel();
		String[] columnNames = {"ID", "Name", "Stock"};
        Object[][] data = {};
		model1 = new DefaultTableModel(data, columnNames);
        table1 = new JTable(model1);
        table1.getSelectionModel().addListSelectionListener(addshowstockpaneleventhandler);
        rightPanel.add(new JScrollPane(table1));
        add(rightPanel);
		//----------------------------------------------
	}
	
}
