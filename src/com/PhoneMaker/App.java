package com.PhoneMaker;


import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.io.IOException;



public class App extends Canvas implements Runnable{


	/**
	 * 
	 */
	private static final long serialVersionUID = -4568458970452023326L;
	public static final int WIDTH = 1200;
	public static final int HEIGHT = 655;
	private Thread thread;
	private boolean running = false;
	private Handler handler;
	private PhoneInventory inventory;
	private InputHandler input;
	public static String CompanyName = null;
	public static boolean startApp = false;
	public static boolean PPTCommand = false;
	public static EntryAndExitPanel enex = new EntryAndExitPanel();
	
	public App()
	{
		
		new Window("Phone Maker Alpha", this);
		
		handler = new Handler();

		
		
		inventory = new PhoneInventory();
		inventory.FillInventory();
		
		input = new InputHandler(inventory);
		
		this.addMouseListener(input);
		
	
		
		handler.addObject(new List(0, 0, null, inventory));
		handler.addObject(new PhonePreview2(0, 0, null, this));
	
	
	}
	public synchronized void start()
	{
		if(running) return;
		running = true;
		thread = new Thread(this);
		thread.start();
		
	}
	public synchronized void stop()
	{
		if(!running) return;
		running = false;
		try
		{
			thread.join();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public void tick()
	{
		handler.tick();
	}
	public void render()
	{
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null)
		{
			this.createBufferStrategy(2);
			return;
			
		}
		Graphics g = bs.getDrawGraphics();
		g.setColor(new Color(34, 177, 76));
		g.fillRect(0, 0, WIDTH, HEIGHT);
		if(PPTCommand) 
			enex.renderPPTPanel(g);
		else 
			handler.render(g);
		//g.drawImage(bi, 0, 0, WIDTH, HEIGHT, this);
		g.dispose();
		bs.show();
		
	}
	public void run() {
		
		int fps = 0;
		long timer = 0;
		long previousTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double na = 1000000000.0 / amountOfTicks;
		double delta = 0.0;
		while (running) {
			requestFocus();
			long currentTime = System.nanoTime();
			delta += (currentTime - previousTime) / na;
			previousTime = currentTime;
			if (delta >= 1) {
				tick();
				delta--;
				fps++;
				// previousTime = currentTime;
			}
			if (running)
				render();
			
			if (System.currentTimeMillis() - timer > 1000) {
				//System.out.println(fps + " fps");
				fps = 0;
				timer = System.currentTimeMillis();
			}
		}
		stop();
	}
	
	public static void main(String args[]) throws IOException
	{
		
		enex.renderEntryPanel();
	}

	public enum ID
	{
		List(), PhonePreview(), OptionPane();
	}
}
