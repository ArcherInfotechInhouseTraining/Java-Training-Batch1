package gui;

import javax.swing.JFrame;

import handlers.DeleteFrameHandler;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class DeleteFrame extends JFrame {

	public DeleteFrame(DeleteFrameHandler deleteframeHandler)
	{
		super("Delete Frame");
		setLayout(new FlowLayout());      
		int width = 450;
        int height = 300;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - width) / 2;
        int y = (screen.height - height) / 2;
        setBounds(x, y, width, height);
		setVisible(true);
	}
}
