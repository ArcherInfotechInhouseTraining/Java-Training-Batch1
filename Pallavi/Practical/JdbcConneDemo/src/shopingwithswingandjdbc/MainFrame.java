package shopingwithswingandjdbc;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MainFrame extends JFrame implements ActionListener {

	private JButton addButton, showButton, deleteButton, updateButton;
	AddFrame addFrame;
	ShowFrame showFrame;
	DeleteFrame deleteFrame;
	UpdateFrame updateFrame;
	
	
	public MainFrame(String title)
	{
		super(title);
		setLayout(new FlowLayout());
		int width = 600;
		int height = 500;
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (screen.width - width)/2;
		int y = (screen.height - height)/2;
		
		
		addButton = new JButton("Add Item");
		addButton.addActionListener(this);
		
		showButton = new JButton("Display Item");
		showButton.addActionListener(this);
		
		deleteButton = new JButton("Delete Item");
		deleteButton.addActionListener(this);
		
		updateButton = new JButton("Update Item");
		updateButton.addActionListener(this);
		
		add(addButton);
		add(showButton);
		add(deleteButton);
		add(updateButton);
				
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		String command = e.getActionCommand();
		
		if(command.equals("Add Item"))
		{
			System.out.println("Add item selected.");
			 addFrame = new AddFrame();
			
		}
		else if(command.equals("Display Item"))
		{
			System.out.println("Display item selected.");
			showFrame = new ShowFrame() ;
			
		}
		else if(command.equals("Delete Item"))
		{
			System.out.println("Delete item selected.");
			deleteFrame = new DeleteFrame() ;
			
		}
		else if(command.equals("Update Item"))
		{
			System.out.println("Update item selected.");
			updateFrame = new UpdateFrame();
		}
		
	}


}
