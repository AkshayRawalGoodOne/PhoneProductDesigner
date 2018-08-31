package com.PhoneMaker;

public class DefineTechnologicalFeaturesHandler {

private PhoneInventory store;
BufferedImageLoader loader;
	
	public DefineTechnologicalFeaturesHandler(PhoneInventory store)
	{
		this.store = store;
		loader = new BufferedImageLoader();
	}
	public void Define()
	{
		for(int i = 0; i < store.Inventory.size(); i++)
		{
			PhoneComponentHandler handler = store.Inventory.get(i);
			
			if(handler.HandlerName == "Temperature Control") defineTempControl(handler);
			else if(handler.HandlerName == "Power Control") definePowerControl(handler);
			else if(handler.HandlerName == "Internet Connectivity") defineConnectivity(handler);
		
		}
	}
	private void defineConnectivity(PhoneComponentHandler handler) { // CONNECTIVITY
		
		PhoneComponent comp1 = new PhoneComponent("GPRS", null, 1, 500);
		PhoneComponent comp2 = new PhoneComponent("EDGE", null, 2, 1000);
		PhoneComponent comp3 = new PhoneComponent("HSPA", null, 3, 1500);
		PhoneComponent comp4 = new PhoneComponent("LTE", null, 4, 2000);
		
		comp1.addDescription("Speed: 35-171 Kbps");
		comp1.addDescription("Can access light webpages");
		comp1.addDescription("Cheap Data Rates");
		comp1.addDescription("Cost = " + comp1.ComponentPrice) ;
		
		comp2.addDescription("Speed: 56-114 Kbps");
		comp2.addDescription("OK for mails and messaging");
		comp2.addDescription("Cheap Data Rates");
		comp2.addDescription("Cost = " + comp2.ComponentPrice) ;
		
		comp3.addDescription("Speed: 800-1000 Kbps");
		comp3.addDescription("Quality Video Streaming");
		comp3.addDescription("Cost = " + comp3.ComponentPrice) ;
		
		comp4.addDescription("Speed: 6 Mbps");
		comp4.addDescription("Best for Video/Audio Streaming");
		comp4.addDescription("Affordable due to 4G Revolution");
		comp4.addDescription("Cost = " + comp4.ComponentPrice) ;
		
		try{
			comp1.img = loader.loadImage("/GPRS.png");
			comp2.img = loader.loadImage("/EDGE.png");
			comp3.img = loader.loadImage("/HSPA.png");
			comp4.img = loader.loadImage("/LTE.png");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		
		handler.addComponent(comp1);
		handler.addComponent(comp2);
		handler.addComponent(comp3);
		handler.addComponent(comp4);
				
	}
		
	
	private void definePowerControl(PhoneComponentHandler handler) { // POWER CONRTOL
		
		PhoneComponent comp1 = new PhoneComponent("Power 1", null, 1, 0);
		PhoneComponent comp2 = new PhoneComponent("Power 2", null, 2, 0);
		PhoneComponent comp3 = new PhoneComponent("Power 3", null, 3, 0);
		PhoneComponent comp4 = new PhoneComponent("Power 4", null, 4, 0);
		
		comp1.addDescription("This is Power 1");
		comp2.addDescription("This is Power 2");
		comp3.addDescription("This is Power 3");
		comp4.addDescription("This is Power 4");
		
		handler.addComponent(comp1);
		handler.addComponent(comp2);
		handler.addComponent(comp3);
		handler.addComponent(comp4);
				
	
		
	}
	private void defineTempControl(PhoneComponentHandler handler) { 	// TEMPERATURE CONTROL
		
		PhoneComponent comp1 = new PhoneComponent("Module 1", null, 1, 0);
		PhoneComponent comp2 = new PhoneComponent("Module 2", null, 2, 0);
		PhoneComponent comp3 = new PhoneComponent("Module 3", null, 3, 0);
		PhoneComponent comp4 = new PhoneComponent("Module 4", null, 4, 0);
		
		comp1.addDescription("This is Module 1");
		comp2.addDescription("This is Module 2");
		comp3.addDescription("This is Module 3");
		comp4.addDescription("This is Module 4");
		
		handler.addComponent(comp1);
		handler.addComponent(comp2);
		handler.addComponent(comp3);
		handler.addComponent(comp4);
				
	}
		
}
	

