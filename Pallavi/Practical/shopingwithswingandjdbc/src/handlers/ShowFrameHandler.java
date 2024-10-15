package handlers;

import source.MainFrame;
import util.Dbutil;
import source.Item;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ShowFrameHandler implements ActionListener, ListSelectionListener{
	
	MainFrame mainFrame;
	Item item;
	
	JTable table = new JTable();

	public ShowFrameHandler(MainFrame mainFrame) {
		
		this.mainFrame = mainFrame;
		
	}

	public ShowFrameHandler(JTable table) {
		this.table = table;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		try{
			Dbutil.showItems();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
