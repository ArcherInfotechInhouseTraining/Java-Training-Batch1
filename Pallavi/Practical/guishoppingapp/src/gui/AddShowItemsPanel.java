package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import handlers.AddShowItemsPanelHandler;

public class AddShowItemsPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	public TextField textid, textname, textprice;
	public JButton addButton, modifyButton, deleteButton;
	public JTable table1;
	public DefaultTableModel model1;
	public AddShowItemsPanel(AddShowItemsPanelHandler addshowitemspanelhandler) {
		setLayout(new GridLayout(1, 2));

		JPanel firstleft = new JPanel();
		firstleft.setLayout(new GridLayout(20, 1));

		JPanel firstlefttop = new JPanel(new FlowLayout());
		firstlefttop.add(new JLabel("Enter the Item ID, Name and Price"));
		firstleft.add(firstlefttop);
		
		JPanel firstleftmid = new JPanel();
		firstleftmid.setLayout(new FlowLayout());
		textid = new TextField(10); 
		textname = new TextField(15); 
		textprice = new TextField(10);
		firstleftmid.add(textid);
		firstleftmid.add(textname);
		firstleftmid.add(textprice);
		firstleft.add(firstleftmid);
		
		JPanel firstleftbottom = new JPanel();
		firstleftbottom.setLayout(new FlowLayout());
		addButton = new JButton("Add");
		modifyButton = new JButton("Modify");
		deleteButton = new JButton("Delete");
		addButton.addActionListener(addshowitemspanelhandler);
		modifyButton.addActionListener(addshowitemspanelhandler);
		deleteButton.addActionListener(addshowitemspanelhandler);
		firstleftbottom.add(addButton);
		firstleftbottom.add(modifyButton);
		firstleftbottom.add(deleteButton);
		modifyButton.setEnabled(false);
		deleteButton.setEnabled(false);
		firstleft.add(firstleftbottom, BorderLayout.SOUTH);
		add(firstleft);
		
		JPanel tablePanel = new JPanel(new BorderLayout());
		String[] columnNames = {"ID", "Name", "Price"};
        Object[][] data = {};
		model1 = new DefaultTableModel(data, columnNames);
        table1 = new JTable(model1);
        table1.getSelectionModel().addListSelectionListener(addshowitemspanelhandler);
        tablePanel.add(new JScrollPane(table1),BorderLayout.CENTER);
		add(tablePanel);		
	}
}
