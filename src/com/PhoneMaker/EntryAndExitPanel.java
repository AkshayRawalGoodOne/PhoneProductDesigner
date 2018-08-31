package com.PhoneMaker;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.Font;

public class EntryAndExitPanel {
	
	public boolean clicked = false;
	//private JPanel panel = new JPanel();
	private int width = 400;
	private int height = 300;
	private JButton OK;
	private JTextField company;
	private Rectangle rOK;
	private int button_width = 100;
	private int button_height = 50;
	
	public void renderEntryPanel()
	{
		JFrame start = new JFrame();
		start.setTitle("Enter Company Name");
		start.setSize(new Dimension(width, height));
		start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		start.setLayout(new BorderLayout(10, 10));

		start.setAutoRequestFocus(true);
		start.setLocationRelativeTo(null);
		start.setResizable(false);
		start.setVisible(true);
		
		
		OK = new JButton("OK");
		rOK = new Rectangle(100, 50, button_width, button_height);
		OK.setBounds(rOK);
		start.add(OK, BorderLayout.SOUTH);
		
		company = new JTextField();
		company.setBounds(50, 10, 300, 20);
		start.add(company, BorderLayout.NORTH);
		
		
		
		
		OK.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				App.CompanyName = company.getText();
				start.dispose();
				App.startApp = true;
				new App();
				
				
			}
		});
			
		
		
	}
	

	public void renderPPTPanel(Graphics g)
	{
		g.setColor(Color.BLACK);
		g.setFont(new Font("Berlin Sans FB Demi", 0,  40));
		g.drawString("Product Design Complete!", 100, 100);
	//	g.setFont(new Font("Berlin Sans FB Demi", 0,  20));
	//	g.drawString("Path = " + CreatePPT.respath+ "/Presentation.pptx", 100, 200);
		g.setFont(new Font("Berlin Sans FB Demi", 0,  40));
		g.drawString("Find a Powerpoint Presentation on your Desktop", 100, 300);
		g.drawString("(Wait for a few seconds and Don't Close the App)", 100, 400);
		
	}
	

}
