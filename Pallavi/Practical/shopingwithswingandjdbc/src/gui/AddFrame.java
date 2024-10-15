package gui;

import javax.swing.JFrame;

import handlers.AddFrameHandler;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class AddFrame extends JFrame{

	public JButton saveButton, cancelButton;
	public TextField textid, textname, textprice;
	
	public AddFrame(AddFrameHandler addframeHandler)
	{
		super("Add Frame");
		setLayout(new FlowLayout());
		int width = 450;
        int height = 300;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - width) / 2;
        int y = (screen.height - height) / 2;
        setBounds(x, y, width, height);
		setVisible(true);
		
		JPanel panel = new JPanel(new FlowLayout());
		
		JPanel idpanel = new JPanel(new FlowLayout());
		idpanel.add(new JLabel("Id"));
		textid = new TextField(10);
		idpanel.add(textid);
		panel.add(idpanel);
		
		JPanel namepanel = new JPanel(new FlowLayout());
		namepanel.add(new JLabel("Name"));
		textname = new TextField(15);
		namepanel.add(textname);
		panel.add(namepanel);
		
		JPanel pricepanel = new JPanel(new FlowLayout());
		pricepanel.add(new JLabel("Price"));
		textprice = new TextField(10);
		pricepanel.add(textprice);
		panel.add(pricepanel);
		
		add(panel);
		
		JPanel buttonPanel = new JPanel();
		saveButton = new JButton("save");
		cancelButton = new JButton("cancel");
		
		buttonPanel.add(saveButton);
		buttonPanel.add(cancelButton);
		
		add(buttonPanel);

	}
}
