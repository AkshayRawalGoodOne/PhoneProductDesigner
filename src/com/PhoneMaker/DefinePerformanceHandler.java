package com.PhoneMaker;

public class DefinePerformanceHandler {

private PhoneInventory store;
BufferedImageLoader loader;
	
	public DefinePerformanceHandler(PhoneInventory store)
	{
		this.store = store;
		loader = new BufferedImageLoader();
	}
	public void Define()
	{
		for(int i = 0; i < store.Inventory.size(); i++)
		{
			PhoneComponentHandler handler = store.Inventory.get(i);
			
			if(handler.HandlerName == "Android Version") defineAndroidOSVersion(handler);
			else if(handler.HandlerName == "Ram Size") defineRamSize(handler);
			else if(handler.HandlerName == "Processor") defineProcessor(handler);
			else if(handler.HandlerName == "Battery") defineBattery(handler);
			else if(handler.HandlerName == "Sound System") defineSoundSystem(handler);
			else if(handler.HandlerName == "Graphics Processing Unit") defineGPU(handler);
			else if(handler.HandlerName == "Internal Memory") defineInternalMemory(handler);
			else if(handler.HandlerName == "Audio Codec") defineAudioCodec(handler);
					
					
		}
	}
	private void defineAudioCodec(PhoneComponentHandler handler) { // AUDIO CODEC
	

		PhoneComponent comp1 = new PhoneComponent("Codec 1", null, 1, 0);
		PhoneComponent comp2 = new PhoneComponent("Codec 2", null, 2, 0);
		PhoneComponent comp3 = new PhoneComponent("Codec 3", null, 3, 0);
		PhoneComponent comp4 = new PhoneComponent("Codec 4", null, 4, 0);
	
		/*
		comp1.addDescription("This is Codec 1");
		comp2.addDescription("This is Codec 2");
		comp3.addDescription("This is Codec 3");
		comp4.addDescription("This is Codec 4"); */
		
		comp1.setComponentPrice(1000);
		comp2.setComponentPrice(2000);
		comp3.setComponentPrice(3000);
		comp4.setComponentPrice(4000);
		
		handler.addComponent(comp1);
		handler.addComponent(comp2);
		handler.addComponent(comp3);
		handler.addComponent(comp4);
		
	}
	private void defineInternalMemory(PhoneComponentHandler handler) {	//INTERNAL MEMORY
	

		PhoneComponent comp1 = new PhoneComponent("Memory 1", null, 1, 0);
		PhoneComponent comp2 = new PhoneComponent("Memory 2", null, 2, 0);
		PhoneComponent comp3 = new PhoneComponent("Memory 3", null, 3, 0);
		PhoneComponent comp4 = new PhoneComponent("Memory 4", null, 4, 0);
		
	/*	comp1.addDescription("This is Memory 1");
		comp2.addDescription("This is Memory 2");
		comp3.addDescription("This is Memory 3");
		comp4.addDescription("This is Memory 4"); */
		
		comp1.setComponentPrice(1000);
		comp2.setComponentPrice(2000);
		comp3.setComponentPrice(3000);
		comp4.setComponentPrice(4000);
		
		handler.addComponent(comp1);
		handler.addComponent(comp2);
		handler.addComponent(comp3);
		handler.addComponent(comp4);
	}
	private void defineGPU(PhoneComponentHandler handler) {	//	GPU
		

		PhoneComponent comp1 = new PhoneComponent("Adreno 308", null, 1, 0);
		PhoneComponent comp2 = new PhoneComponent("Adreno 506", null, 2, 0);
		PhoneComponent comp3 = new PhoneComponent("Adreno 540", null, 3, 0);
		PhoneComponent comp4 = new PhoneComponent("Adreno 630", null, 4, 0);
		
		comp1.setComponentPrice(500);
		comp2.setComponentPrice(1000);
		comp3.setComponentPrice(1500);
		comp4.setComponentPrice(2000);
		
		
		comp1.addDescription("For SnapDragon 425 and below");
		comp1.addDescription("Good Graphics Rendering");
		comp1.addDescription("Basic Phone GUI/Shapes rendered");
		comp1.addDescription("Cost = " + comp1.ComponentPrice);
		
		comp2.addDescription("For SnapDragon 635 and below");
		comp2.addDescription("Works fine with Games/Videos");
		comp2.addDescription("Anti-Aliased & Increased Color Bands");
		comp2.addDescription("Cost = " + comp2.ComponentPrice);
		
		comp3.addDescription("For SnapDragon 636 and below");
		comp3.addDescription("Great texture quality");
		comp3.addDescription("Anti-aliasing");
		comp3.addDescription("Increaed Color Bands");
		comp3.addDescription("Cost = " + comp3.ComponentPrice);
		
		comp4.addDescription("for SnapDragon 845 and below");
		comp4.addDescription("Excellent Anisotropic Filtering");
		comp4.addDescription("Great Anti-Aliasing");
		comp4.addDescription("Fascinating Texture Quality and Vibrant Colors");
		comp4.addDescription("Cost = " + comp4.ComponentPrice);
		
		try{
			comp1.img = loader.loadImage("/Adreno308.png");
			comp2.img = loader.loadImage("/Adreno506.png");
			comp3.img = loader.loadImage("/Adreno540.png");
			comp4.img = loader.loadImage("/Adreno630.png");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		
		
		handler.addComponent(comp1);
		handler.addComponent(comp2);
		handler.addComponent(comp3);
		handler.addComponent(comp4);

		
	}
	private void defineSoundSystem(PhoneComponentHandler handler) {	//	SOUND SYSTEM
	

		PhoneComponent comp1 = new PhoneComponent("Sound System 1", null, 1, 0);
		PhoneComponent comp2 = new PhoneComponent("Sound System 2", null, 2, 0);
		PhoneComponent comp3 = new PhoneComponent("Sound System 3", null, 3, 0);
		PhoneComponent comp4 = new PhoneComponent("Sound System 4", null, 4, 0);
		
	/*	comp1.addDescription("This is System 1");
		comp2.addDescription("This is System 2");
		comp3.addDescription("This is System 3");
		comp4.addDescription("This is System 4");  */
		
		comp1.setComponentPrice(1000);
		comp2.setComponentPrice(2000);
		comp3.setComponentPrice(3000);
		comp4.setComponentPrice(4000);
		
		handler.addComponent(comp1);
		handler.addComponent(comp2);
		handler.addComponent(comp3);
		handler.addComponent(comp4);
	}
	private void defineBattery(PhoneComponentHandler handler) {	//	BATTERY
		

		PhoneComponent comp1 = new PhoneComponent("3200 mAh", null, 1, 0);
		PhoneComponent comp2 = new PhoneComponent("3800 mAh", null, 2, 0);
		PhoneComponent comp3 = new PhoneComponent("4000 mAh", null, 3, 0);
		PhoneComponent comp4 = new PhoneComponent("4100 mAh", null, 4, 0);
		
		comp1.setComponentPrice(500);
		comp2.setComponentPrice(1000);
		comp3.setComponentPrice(1500);
		comp4.setComponentPrice(2000);
		
		
		comp1.addDescription("Lasts for 7 Hrs on Talk");
		comp1.addDescription("Proper support to Basic Functions");
		comp1.addDescription("Low End Apps don't heat it up");
		comp1.addDescription("Cost = " + comp1.ComponentPrice);
		
		comp2.addDescription("Lasts for 10 Hrs on Talk");
		comp2.addDescription("Proper Audio/Video Streaming Support");
		comp2.addDescription("Less Battery Drain");
		comp2.addDescription("Power Saver Mode");
		comp2.addDescription("Cost = " + comp2.ComponentPrice);
		
		comp3.addDescription("Lasts for 15 Hrs on Talk");
		comp3.addDescription("High Charging Speed");
		comp3.addDescription("Excellent Power to Games, Video Calling etc");
		comp3.addDescription("Cost = " + comp3.ComponentPrice);
		
		comp4.addDescription("Lasts for 18 Hrs on Talk");
		comp4.addDescription("Good Temperature Control");
		comp4.addDescription("Efficient Power Control");
		comp4.addDescription("Power Support to High End Apps");
		comp4.addDescription("Cost = " + comp4.ComponentPrice);
		
		try{
			comp1.img = loader.loadImage("/3200mAh.png");
			comp2.img = loader.loadImage("/3800mAh.png");
			comp3.img = loader.loadImage("/4000mAh.png");
			comp4.img = loader.loadImage("/4100mAh.png");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		
		handler.addComponent(comp1);
		handler.addComponent(comp2);
		handler.addComponent(comp3);
		handler.addComponent(comp4);

	}
	private void defineProcessor(PhoneComponentHandler handler) {	//	PROCESSOR
	

		PhoneComponent comp1 = new PhoneComponent("SnapDragon 425", null, 1, 0);
		PhoneComponent comp2 = new PhoneComponent("SnapDragon 635", null, 2, 0);
		PhoneComponent comp3 = new PhoneComponent("SnapDragon 636", null, 3, 0);
		PhoneComponent comp4 = new PhoneComponent("SnapDragon 845", null, 4, 0);
		
		comp1.setComponentPrice(500);
		comp2.setComponentPrice(1000);
		comp3.setComponentPrice(1500);
		comp4.setComponentPrice(2000);
		
		
		comp1.addDescription("Supports LTE FDD");
		comp1.addDescription("Supports 16MP Camera");
		comp1.addDescription("1080p Video Capture (30fps)");
		comp1.addDescription("WXGA display");
		comp1.addDescription("Cost = " + comp1.ComponentPrice);
		
		comp2.addDescription("Supports LTE FDD");
		comp2.addDescription("Supports 13MP Camera");
		comp2.addDescription("1080p Video Capture (20fps)");
		comp2.addDescription("1280x800 screen resolution");
		comp2.addDescription("4k UHD Display");
		comp2.addDescription("Cost = " + comp2.ComponentPrice);
		
		comp3.addDescription("Supports LTE FDD");
		comp3.addDescription("Supports 24MP Camera");
		comp3.addDescription("1080p Video Capture @120 fps");
		comp3.addDescription("1280x800 screen resolution");
		comp3.addDescription("Full HD Display");
		comp3.addDescription("Cost = " + comp3.ComponentPrice);
		
		comp4.addDescription("Supports LTE FDD");
		comp4.addDescription("Supports 24MP Dual Camera");
		comp4.addDescription("1080p Video Capture @30fps");
		comp4.addDescription("1280x800 screen resolution");
		comp4.addDescription("Full UHD Display");
		comp4.addDescription("Cost = " + comp4.ComponentPrice);
		
		try{
			comp1.img = loader.loadImage("/SnapDragon425.png");
			comp2.img = loader.loadImage("/SnapDragon635.png");
			comp3.img = loader.loadImage("/SnapDragon636.png");
			comp4.img = loader.loadImage("/SnapDragon845.png");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		
		handler.addComponent(comp1);
		handler.addComponent(comp2);
		handler.addComponent(comp3);
		handler.addComponent(comp4);

	}
	private void defineRamSize(PhoneComponentHandler handler) {		//	RAM SIZE
		

		PhoneComponent comp1 = new PhoneComponent("2 GB", null, 1, 0);
		PhoneComponent comp2 = new PhoneComponent("3 GB", null, 2, 0);
		PhoneComponent comp3 = new PhoneComponent("4 GB", null, 3, 0);
		PhoneComponent comp4 = new PhoneComponent("6 GB", null, 4, 0);
		
		comp1.setComponentPrice(500);
		comp2.setComponentPrice(1000);
		comp3.setComponentPrice(1500);
		comp4.setComponentPrice(2000);
		
		
		comp1.addDescription("Smooth Basic Functionality");
		comp1.addDescription("Basic Audio/Video Streaming");
		comp1.addDescription("Low-end apps run easily");
		comp1.addDescription("Cost = " + comp1.ComponentPrice);
		
		comp2.addDescription("Increased Basic Process Speed");
		comp2.addDescription("High Quality Rendering of Apps");
		comp2.addDescription("Efficient Video Rendering");
		comp2.addDescription("Good performance management");
		comp2.addDescription("Cost = " + comp2.ComponentPrice);
		
		comp3.addDescription("Extended Support for High End Apps");
		comp3.addDescription("Good VR Support");
		comp3.addDescription("MultiTasking");
		comp3.addDescription("Space for Process History");
		comp3.addDescription("Cost = " + comp3.ComponentPrice);
		
		comp4.addDescription("Excellent Fluidity in High End Apps");
		comp4.addDescription("Seamless Gaming Experience");
		comp4.addDescription("Increased Compatibility");
		comp4.addDescription("Eliminates Buffering of 60fps Games");
		comp4.addDescription("Cost = " + comp4.ComponentPrice);
		
		try{
			comp1.img = loader.loadImage("/2GBRam.png");
			comp2.img = loader.loadImage("/3GBRam.png");
			comp3.img = loader.loadImage("/4GBRam.png");
			comp4.img = loader.loadImage("/6GBRam.png");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		
		handler.addComponent(comp1);
		handler.addComponent(comp2);
		handler.addComponent(comp3);
		handler.addComponent(comp4);

	}
	private void defineAndroidOSVersion(PhoneComponentHandler handler) { // 	ANDROID OS VERSION
		

		PhoneComponent comp1 = new PhoneComponent("Lollipop", null, 1, 0);
		PhoneComponent comp2 = new PhoneComponent("Marshmallow", null, 2, 0);
		PhoneComponent comp3 = new PhoneComponent("Nougat", null, 3, 0);
		PhoneComponent comp4 = new PhoneComponent("Oreo", null, 4, 0);
		
		comp1.setComponentPrice(500);
		comp2.setComponentPrice(1000);
		comp3.setComponentPrice(1500);
		comp4.setComponentPrice(2000);
		
		
		comp1.addDescription("Smart Lock with Bluetooth");
		comp1.addDescription("Handle Multiple User Accounts");
		comp1.addDescription("Data Encryption");
		comp1.addDescription("Malware Protection");
		comp1.addDescription("Cost = " + comp1.ComponentPrice);
		
		comp2.addDescription("All features of Lollipop");
		comp2.addDescription("Increased Accessibliity");
		comp2.addDescription("Better File Explorer");
		comp2.addDescription("Cost = " + comp2.ComponentPrice);
		
		comp3.addDescription("All features of Marshmallow");
		comp3.addDescription("Quick App Switching");
		comp3.addDescription("Quick notification adjustment");
		comp3.addDescription("Multi-tasking platform");
		comp3.addDescription("Screen Savers in VR");
		comp3.addDescription("Cost = " + comp3.ComponentPrice);
		
		comp4.addDescription("All features of Nougat");
		comp4.addDescription("Faster Booting");
		comp4.addDescription("Better Split Window Function");
		comp4.addDescription("Multi Tasking");
		comp4.addDescription("Improved User Interface");
		comp4.addDescription("Cost = " + comp4.ComponentPrice);
		
		try{
			comp1.img = loader.loadImage("/AndroidLollipop.png");
			comp2.img = loader.loadImage("/AndroidMarshmallow.png");
			comp3.img = loader.loadImage("/AndroidNougat.png");
			comp4.img = loader.loadImage("/AndroidOreo.png");
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
	
	