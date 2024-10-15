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
import javax.swing.table.DefaultTableModel;

import handlers.SellPanelHandler;


public class SellPanel extends JPanel{

	public DefaultTableModel model1, model2;
	public JTable table1, table2;
	public TextField textid, textname, textcount, textprice;
	public JButton sellbutton;
	public SellPanel(SellPanelHandler sellpanelhandler)
	{
		setLayout(new GridLayout(1,2));
		
		//------------left panel
		JPanel tablepanel = new JPanel(new BorderLayout());
		String[] columnNames = {"ID", "Name", "Price"};
		Object[][] data = {};
		model1 = new DefaultTableModel(data, columnNames);
		table1 = new JTable(model1);
		table1.getSelectionModel().addListSelectionListener(sellpanelhandler);

		tablepanel.add(new JScrollPane(table1));
		add(tablepanel);
		
		//----------- right panel
		JPanel rightpanel = new JPanel();
		rightpanel.setLayout(new GridLayout(2,1));
		
		JPanel righttoptablepanel = new JPanel(new BorderLayout());
		String[] columnNames1 = {"ID", "Name", "Count"};
		Object[][] data1 = {};
		model2 = new DefaultTableModel(data1, columnNames1);
		table2 = new JTable(model2);
		righttoptablepanel.add(new JScrollPane(table2), BorderLayout.CENTER);
		rightpanel.add(righttoptablepanel);
		
		
//		JPanel rightmid = new JPanel();
//		//rightmid.setLayout(new FlowLayout());
//		textid = new TextField(10);
//		textname = new TextField(15);
//		textprice = new TextField(10);
//		rightmid.add(textid);
//		rightmid.add(textname);
//		rightmid.add(textprice);
//		rightpanel.add(rightmid, BorderLayout.CENTER);
//		
		
		JPanel rightbottom = new JPanel();
		//rightbottom.setLayout(new FlowLayout());
		
		JPanel rightbottomtop = new JPanel();
		rightbottomtop.add(new JLabel("Enter item count"));
		rightbottom.add(rightbottomtop,BorderLayout.NORTH);
		
		JPanel rightbottommid = new JPanel();
		textid = new TextField(10);
		textname = new TextField(15);
		textcount = new TextField(10);
		textprice = new TextField(10);
		rightbottommid.add(textid);
		textid.setEditable(false);
		rightbottommid.add(textname);
		textname.setEditable(false);
		rightbottommid.add(textcount);
		//rightbottommid.add(textprice);
		rightbottom.add(rightbottommid,BorderLayout.CENTER);
		
		JPanel bottom = new JPanel();
		sellbutton = new JButton("sell");
		sellbutton.setEnabled(false);
		sellbutton.addActionListener(sellpanelhandler);
		bottom.add(sellbutton, BorderLayout.SOUTH);
		rightbottom.add(bottom);
		rightpanel.add(rightbottom);
				
		add(rightpanel);
			
		
	}
}
