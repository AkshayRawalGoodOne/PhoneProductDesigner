package com.PhoneMaker;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.LinkedList;

public class ImageHandler {

	public LinkedList<PhoneComponentHandler> FrontImage = new LinkedList<PhoneComponentHandler>();
	public LinkedList<String> FrontImageRenderScheme = new LinkedList<String>();
	
	public LinkedList<PhoneComponentHandler> BackImage = new LinkedList<PhoneComponentHandler>();
	public LinkedList<String> BackImageRenderScheme = new LinkedList<String>();
	
	public LinkedList<PhoneComponentHandler> BackInteriorImage = new LinkedList<PhoneComponentHandler>();
	public LinkedList<String> BackInteriorImageRenderScheme = new LinkedList<String>();
	
	public void renderFrontImage(Graphics g, int x, int y)
	{
		
	}
	
	public void renderBackImage(Graphics g, int x, int y)
	{
		
	}
	
	public void renderBackInteriorImage(Graphics g, int x, int y)
	{
		
	}
	
	public void defineRenderSchemes()
	{
		defineFrontRenderScheme();
		defineBackRenderScheme();
		defineBackInteriorRenderScheme();
	}
	
	public void defineFrontRenderScheme()
	{
		
	}
	public void defineBackRenderScheme()
	{
		
	}
	public void defineBackInteriorRenderScheme()
	{
		
	}
	public void addImageToRender(PhoneComponentHandler object, String type)
	{
		if(type.equalsIgnoreCase("Front"))
		FrontImage.add(object);

		if(type.equalsIgnoreCase("Back"))
		BackImage.add(object);

		if(type.equalsIgnoreCase("Back Interior"))
		BackInteriorImage.add(object);
	}
}
