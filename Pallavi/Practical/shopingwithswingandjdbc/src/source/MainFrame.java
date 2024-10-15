package source;

import javax.swing.JButton;
import javax.swing.JFrame;

import gui.*;
import handlers.AddFrameHandler;
import handlers.DeleteFrameHandler;
import handlers.ShowFrameHandler;
import util.Dbutil;

import java.awt.event.*;
import java.sql.SQLException;
import java.awt.*;

public class MainFrame extends JFrame implements ActionListener {


	private static final long serialVersionUID = 1L;
	
	private JButton addButton, showButton, deleteButton, updateButton;
	
	public AddFrame addFrame;
	public AddFrameHandler addframeHandler;
	
	public ShowFrame showFrame;
	ShowFrameHandler showframeHandler;
	
	public DeleteFrame deleteFrame;
	DeleteFrameHandler deleteframeHandler;
	
	public UpdateFrame updateFrame;
	
	
	
	public MainFrame(String title)
	{
		super(title);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
			
			addframeHandler = new AddFrameHandler(this);
			addFrame = new AddFrame(addframeHandler);
			addFrame.saveButton.addActionListener(addframeHandler);
			
		}
		else if(command.equals("Display Item"))
		{
			System.out.println("Display item selected.");
			
			showframeHandler = new ShowFrameHandler(this);
			showFrame = new ShowFrame(showframeHandler);
			showframeHandler.actionPerformed(e);
			//showButton.addActionListener(showframeHandler);
			
			
		}
		else if(command.equals("Delete Item"))
		{
			System.out.println("Delete item selected.");
			deleteframeHandler = new DeleteFrameHandler(this);
			deleteFrame = new DeleteFrame(deleteframeHandler);
			deleteframeHandler.actionPerformed(e);
		}
		else if(command.equals("Update Item"))
		{
			System.out.println("Update item selected.");
			updateFrame = new UpdateFrame();
		}
		
	}
}
