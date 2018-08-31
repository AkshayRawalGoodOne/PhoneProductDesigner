package com.PhoneMaker;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Window {

	public Window(String title, App app)
	{
		JFrame frame = new JFrame(title);
		
		frame.setSize(new Dimension(App.WIDTH, App.HEIGHT));
		frame.setMaximumSize(new Dimension(App.WIDTH, App.HEIGHT));
		frame.setPreferredSize(new Dimension(App.WIDTH, App.HEIGHT));
		frame.setMinimumSize(new Dimension(App.WIDTH, App.HEIGHT));
		
		frame.add(app);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setAutoRequestFocus(true);
		
		frame.setVisible(true);
		
		app.start();
	}
}
