package com.PhoneMaker;

public class DefineAddedFeaturesHandler {

private PhoneInventory store;
BufferedImageLoader loader;
	
	public DefineAddedFeaturesHandler(PhoneInventory store)
	{
		this.store = store;
		loader = new BufferedImageLoader();
	}
	public void Define()
	{
		for(int i = 0; i < store.Inventory.size(); i++)
		{
			PhoneComponentHandler handler = store.Inventory.get(i);
			
			if(handler.HandlerName == "Added Features") defineAddedFeatures(handler);
			
		}
	}
	private void defineAddedFeatures(PhoneComponentHandler handler) { // FLASH LIGHT
		
		PhoneComponent comp1 = new PhoneComponent("Dual Sim", null, 1, 500);
		PhoneComponent comp2 = new PhoneComponent("Wireless Earphones", null, 2, 1000);
		PhoneComponent comp3 = new PhoneComponent("Stylus", null, 3, 1000);
		PhoneComponent comp4 = new PhoneComponent("Fingerprint Sensor", null, 4, 750);
		PhoneComponent comp5 = new PhoneComponent("Wireless Charging", null, 4, 750);
		PhoneComponent comp6 = new PhoneComponent("VR Head Gear", null, 4, 1000);
		PhoneComponent comp7 = new PhoneComponent("Projector", null, 4, 500);
		PhoneComponent comp8 = new PhoneComponent("Infrared Port", null, 4, 250);
		//PhoneComponent comp9 = new PhoneComponent("MICRO SD Slot", null, 4, 0);
		
		comp1.addDescription("Own Two Different Mobile Plans");
		comp1.addDescription("Separate Business & Personal Needs");
		comp1.addDescription("Global Roaming");
		comp1.addDescription("Useful In Emergency");
		comp1.addDescription("Cost = " + comp1.ComponentPrice);
		
		comp2.addDescription("No Cables");
		comp2.addDescription("Enhanced Sound Technology");
		comp2.addDescription("Stylish & Trendy Feel");
		comp2.addDescription("MultiTasking");
		comp2.addDescription("Increased Mobility");
		comp2.addDescription("Cost = " + comp2.ComponentPrice);
		
		comp3.addDescription("Easy Navigation and Handling");
		comp3.addDescription("Good For Artists");
		comp3.addDescription("No Smudges/Scratches on Screen");
		comp3.addDescription("Reduces Typing Error");
		comp3.addDescription("Good For Winters");
		comp3.addDescription("Cost = " + comp3.ComponentPrice);
		
		comp4.addDescription("Better Security of Phone and Apps");
		comp2.addDescription("Increased Accessibility");
		comp4.addDescription("Unique Identification");
		comp4.addDescription("Reliable Tracking");
		comp4.addDescription("Cost = " + comp4.ComponentPrice);
		
		comp5.addDescription("No Cables");
		comp5.addDescription("Integration with multiple cell phones");
		comp5.addDescription("Multiple Device Charging");
		comp5.addDescription("Increased Mobility");
		comp5.addDescription("Cost = " + comp5.ComponentPrice);
		
		comp6.addDescription("Immersive Viewing Experience");
		comp6.addDescription("Interactive Gaming");
		comp6.addDescription("Best with 3D Video/Stereographic Content");
		comp6.addDescription("Infotainment/Educational Purposes");
		comp6.addDescription("Cost = " + comp6.ComponentPrice);
		
		comp7.addDescription("Portability Of Projector");
		comp7.addDescription("Can Serve a Larger Audience");
		comp7.addDescription("Cinematic Video Experience");
		comp7.addDescription("Presentations/Educational Purposes");
		comp7.addDescription("Cost = " + comp7.ComponentPrice);
		
		comp8.addDescription("Multi-Utility Phone Remote");
		comp8.addDescription("Thermal Imaging");
		comp8.addDescription("Heat Detection");
		comp8.addDescription("Cost = " + comp8.ComponentPrice);
		
		try{
			comp1.img = loader.loadImage("/DualSim.png");
			comp2.img = loader.loadImage("/WirelessEarphones.png");
			comp3.img = loader.loadImage("/Stylus.png");
			comp4.img = loader.loadImage("/FingerPrintScanner.png");
			comp5.img = loader.loadImage("/WirelessCharger.png");
			comp6.img = loader.loadImage("/VRHeadGear.png");
			comp7.img = loader.loadImage("/BuiltInProjector.png");
			comp8.img = loader.loadImage("/IRPort.png");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		
		handler.addComponent(comp1);
		handler.addComponent(comp2);
		handler.addComponent(comp3);
		handler.addComponent(comp4);
		handler.addComponent(comp5);
		handler.addComponent(comp6);
		handler.addComponent(comp7);
		handler.addComponent(comp8);
				
	}

}

