package gui;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

import handlers.ShowFrameHandler;

import javax.swing.*;
import java.awt.*;

public class ShowFrame extends JFrame{

	public static JTable table;
	DefaultTableModel model1;
	
	public ShowFrame(ShowFrameHandler showframeHandler)
	{
		super("Show Frame");
		setLayout(new FlowLayout());      
		int width = 450;
        int height = 300;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - width) / 2;
        int y = (screen.height - height) / 2;
        setBounds(x, y, width, height);
		setVisible(true);
		
		
		String[] colunmNames = {"id", "name", "price"};
		Object[][] data = {};
		model1 = new DefaultTableModel(data, colunmNames);
		table = new JTable(model1);
       // table.getSelectionModel().addListSelectionListener(showframeHandler);
		//showframeHandler = new ShowFrameHandler(table);
		
		add(new JScrollPane(table));
		
	}

}
