package com.PhoneMaker;

public class DefineAppearanceHandler {

	private PhoneInventory store;
	BufferedImageLoader loader;
	
	public DefineAppearanceHandler(PhoneInventory store)
	{
		this.store = store;
		loader = new BufferedImageLoader();
	}
	public void Define()
	{
		for(int i = 0; i < store.Inventory.size(); i++)
		{
			PhoneComponentHandler handler = store.Inventory.get(i);
			
			if(handler.HandlerName == "Primary Camera") definePrimaryCamera(handler);
			else if(handler.HandlerName == "Secondary Camera") defineSecondaryCamera(handler);
			else if(handler.HandlerName == "Case Material") defineCaseMaterial(handler);
			else if(handler.HandlerName == "Screen Size") defineScreenSize(handler);
			else if(handler.HandlerName == "Flashlight") defineFlashLight(handler);
					
					
		}
	}
	private void defineFlashLight(PhoneComponentHandler handler) { // FLASH LIGHT
		
		PhoneComponent comp1 = new PhoneComponent("LED Flash -Single Tone", null, 1, 0);
		PhoneComponent comp2 = new PhoneComponent("Dual LED -Double Tone", null, 2, 0);
		PhoneComponent comp3 = new PhoneComponent("Xenon Flash", null, 3, 0);
		
		comp1.setComponentPrice(500);
		comp2.setComponentPrice(1000);
		comp3.setComponentPrice(1500);
		
		comp1.addDescription("Energy Efficient");
		comp1.addDescription("Fastest Strobe");
		comp1.addDescription("Simple And Economic");
		comp1.addDescription("Cost = " + comp1.ComponentPrice);
		
		comp2.addDescription("Emits 2x light");
		comp2.addDescription("1.4x Illumination Range");
		comp2.addDescription("Two different Color Temp.");
		comp2.addDescription("(Flourescent / Amber)");
		comp2.addDescription("Cost = " + comp2.ComponentPrice);
		
		comp3.addDescription("Much brighter light than LED");
		comp3.addDescription("Longer Range of Flash");
		comp3.addDescription("Increased Shutter Speed");
		comp3.addDescription("Cost = " + comp3.ComponentPrice);
		
		try{
			comp1.img = loader.loadImage("/LEDSingleTone.png");
			comp2.img = loader.loadImage("/LEDDualTone.png");
			comp3.img = loader.loadImage("/XenonFlash.png");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		
	
		handler.addComponent(comp1);
		handler.addComponent(comp2);
		handler.addComponent(comp3);

				
	}
	private void defineScreenSize(PhoneComponentHandler handler) { // SCREEN SIZE
		
		PhoneComponent comp1 = new PhoneComponent("4.7 inches", null, 1, 0);
		PhoneComponent comp2 = new PhoneComponent("5.0 inches", null, 2, 0);
		PhoneComponent comp3 = new PhoneComponent("5.2 inches", null, 3, 0);
		PhoneComponent comp4 = new PhoneComponent("5.5 inches", null, 4, 0);
		
		comp1.setComponentPrice(500);
		comp2.setComponentPrice(1000);
		comp3.setComponentPrice(1500);
		comp4.setComponentPrice(2000);
		
		
		comp1.addDescription("Supports 720x1280p");
		comp1.addDescription("IPS LCD Display");
		comp1.addDescription("Less Finger Movement");
		comp1.addDescription("Cost = " + comp1.ComponentPrice);
		
		comp2.addDescription("Supports 1440x2560p");
		comp2.addDescription("AMOLED Display");
		comp2.addDescription("Touch Wiz UI");
		comp2.addDescription("Multi Touch Features");
		comp2.addDescription("Cost = " + comp2.ComponentPrice);
		
		comp3.addDescription("Supports 1080x1920p");
		comp3.addDescription("LCD Display");
		comp3.addDescription("Gorilla Glass 3");
		comp3.addDescription("Cost = " + comp3.ComponentPrice);
		
		comp4.addDescription("Supports 1920x1080p");
		comp4.addDescription("Retina HD Display");
		comp4.addDescription("Multi Touch Features");
		comp4.addDescription("Cost = " + comp4.ComponentPrice);
		
		try{
			comp1.img = loader.loadImage("/4.7inches.png");
			comp2.img = loader.loadImage("/5.0inches.png");
			comp3.img = loader.loadImage("/5.2inches.png");
			comp4.img = loader.loadImage("/5.5inches.png");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		
		
		handler.addComponent(comp1);
		handler.addComponent(comp2);
		handler.addComponent(comp3);
		handler.addComponent(comp4);

	}
	private void defineCaseMaterial(PhoneComponentHandler handler) { // CASE MATERIAL
		
		PhoneComponent comp1 = new PhoneComponent("Polyurethane Plastic", null, 1, 0);
		PhoneComponent comp2 = new PhoneComponent("Aluminium Metal", null, 2, 0);
		PhoneComponent comp3 = new PhoneComponent("Natural Leather", null, 3, 0);
		PhoneComponent comp4 = new PhoneComponent("Carbon Fiber", null, 4, 0);
		
		comp1.setComponentPrice(500);
		comp2.setComponentPrice(1000);
		comp3.setComponentPrice(1500);
		comp4.setComponentPrice(2000);
		
		comp1.addDescription("Inexpensive");
		comp1.addDescription("Easy to hold and grip");
		comp1.addDescription("Easily customizable");
		comp1.addDescription("Cost = " + comp1.ComponentPrice);
		
		comp2.addDescription("Withstands big impacts");
		comp2.addDescription("High protection");
		comp2.addDescription("Distinctive Look");
		comp2.addDescription("Cost = " + comp2.ComponentPrice);
		
		comp3.addDescription("Waterproof");
		comp3.addDescription("Long-Lasting");
		comp3.addDescription("Improves with age");
		comp3.addDescription("Cost = " + comp3.ComponentPrice);
		
		comp4.addDescription("Sophisticated Woven-look");
		comp4.addDescription("Thin and Light");
		comp4.addDescription("Strong and Durable");
		comp4.addDescription("Cost = " + comp4.ComponentPrice);
		
		try{
			comp1.img = loader.loadImage("/PolyurethanePlastic.png");
			comp2.img = loader.loadImage("/AluminiumCase.png");
			comp3.img = loader.loadImage("/LeatherCase.png");
			comp4.img = loader.loadImage("/CarbonFibrePhone.png");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		
		handler.addComponent(comp1);
		handler.addComponent(comp2);
		handler.addComponent(comp3);
		handler.addComponent(comp4);

		
	}
	private void defineSecondaryCamera(PhoneComponentHandler handler) { // SECONDARY CAMERA

		PhoneComponent comp1 = new PhoneComponent("1.3 Mega Pixel", null, 1, 0);
		PhoneComponent comp2 = new PhoneComponent("3 Mega Pixel", null, 2, 0);
		PhoneComponent comp3 = new PhoneComponent("5 Mega Pixel", null, 3, 0);
		PhoneComponent comp4 = new PhoneComponent("8 MP Dual", null, 4, 0);
		
		comp1.setComponentPrice(500);
		comp2.setComponentPrice(1000);
		comp3.setComponentPrice(1500);
		comp4.setComponentPrice(2000);
		
		comp1.addDescription("LightWeight Image files");
		comp1.addDescription("Supports 240p imaging");
		comp1.addDescription("Stores basic RGB values");
		comp1.addDescription("Cost = " + comp1.ComponentPrice);
		
		comp2.addDescription("Lightweight Image files");
		comp2.addDescription("Can store basic RGB values");
		comp2.addDescription("1.5x Zoom");
		comp2.addDescription("Cost = " + comp2.ComponentPrice);
		
		comp3.addDescription("Lightweight Image Files");
		comp3.addDescription("Can store basic RGB Values");
		comp3.addDescription("2x Zoom, Face Recognition");
		comp3.addDescription("Cost = " + comp3.ComponentPrice);
		
		comp4.addDescription("Increased Field of View");
		comp4.addDescription("3D Stereography for VR");
		comp4.addDescription("720p Video Creation");
		comp4.addDescription("Cost = " + comp4.ComponentPrice);
		
		try{
			comp1.img = loader.loadImage("/1.3MPFront.png");
			comp2.img = loader.loadImage("/3MPFront.png");
			comp3.img = loader.loadImage("/5MPFront.png");
			comp4.img = loader.loadImage("/8MPDualFront.png");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		
		handler.addComponent(comp1);
		handler.addComponent(comp2);
		handler.addComponent(comp3);
		handler.addComponent(comp4);
		
	}
	private void definePrimaryCamera(PhoneComponentHandler handler) { // PRIMARY CAMERA
	
		PhoneComponent comp1 = new PhoneComponent("5 Mega Pixel", null, 1, 0);
		PhoneComponent comp2 = new PhoneComponent("8 Mega Pixel", null, 2, 0);
		PhoneComponent comp3 = new PhoneComponent("12 Mega Pixel", null, 3, 0);
		PhoneComponent comp4 = new PhoneComponent("13 MP Dual", null, 4, 0);
		
		comp1.setComponentPrice(500);
		comp2.setComponentPrice(1000);
		comp3.setComponentPrice(1500);
		comp4.setComponentPrice(2000);
		
		comp1.addDescription("LightWeight Image files");
		comp1.addDescription("2x Zoom");
		comp1.addDescription("Stores basic RGB values");
		comp1.addDescription("Cost = " + comp1.ComponentPrice);
		
		comp2.addDescription("Supports 720p video creation");
		comp2.addDescription("Greater Color BandWidth");
		comp2.addDescription("4x Optical Zoom");
		comp2.addDescription("Cost = " + comp2.ComponentPrice);
		
		comp3.addDescription("LED Colors and 1080p video making");
		comp3.addDescription("8x Optical Zoom");
		comp3.addDescription("Provides wider Image");
		comp3.addDescription("Cost = " + comp3.ComponentPrice);
		
		comp4.addDescription("Increased Field of View");
		comp4.addDescription("3D Stereography for VR");
		comp4.addDescription("2160p Video Creation");
		comp4.addDescription("Cost = " + comp4.ComponentPrice);
		
		try{
			comp1.img = loader.loadImage("/5MPprimary.png");
			comp2.img = loader.loadImage("/8MPprimary.png");
			comp3.img = loader.loadImage("/12MPprimary.png");
			comp4.img = loader.loadImage("/13MPDualprimary.png");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		
		handler.addComponent(comp1);
		handler.addComponent(comp2);
		handler.addComponent(comp3);
		handler.addComponent(comp4);
	}
}
