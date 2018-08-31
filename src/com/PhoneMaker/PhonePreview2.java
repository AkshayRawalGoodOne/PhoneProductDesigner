package com.PhoneMaker;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import com.PhoneMaker.App.ID;

public class PhonePreview2 extends AppEntity{
	
	BufferedImage map;
	public static BufferedImage front, defaultPhone;
	public static boolean ComponentShown = false;
	BufferedImage currentImg;
	BufferedImageLoader loader;
	App app;

	PhonePreview2(int x, int y, ID id, App app) {
		super(x, y, id);
		this.app = app;
		loader = new BufferedImageLoader();
		try{
		map = loader.loadImage("/ScreenSize.png");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		int width =  map.getWidth();
		int height = map.getHeight();
		defaultPhone = map.getSubimage(0, 0, width/2, height);
		
		currentImg = front;
	}
	
	public static void setComponentImageShown()
	{
		ComponentShown = true;
	}

	protected void tick() {

		
	}

	protected void render(Graphics g) {
		

		g.setColor(Color.WHITE);
		g.fillRoundRect(800, 4, 392, 568, 20, 20);
		if(ComponentShown)
			currentImg = front;
		else
			currentImg = defaultPhone;
			
		g.drawImage(currentImg, 1000 - currentImg.getWidth()/2, App.HEIGHT/2 - currentImg.getHeight()/2 - 50, currentImg.getWidth(), currentImg.getHeight(), app);
			
		}
		
		
	}
	
