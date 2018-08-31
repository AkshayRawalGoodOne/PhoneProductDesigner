package com.PhoneMaker;

public class DefineBoxContentsHandler {

private PhoneInventory store;
BufferedImageLoader loader;
	
	public DefineBoxContentsHandler(PhoneInventory store)
	{
		this.store = store;
		loader = new BufferedImageLoader();
	}
	public void Define()
	{
		for(int i = 0; i < store.Inventory.size(); i++)
		{
			PhoneComponentHandler handler = store.Inventory.get(i);
			
			if(handler.getHandlerName() == "Box Contents") defineBoxContents(handler);
					
					
		}
	}

	private void defineBoxContents(PhoneComponentHandler handler) { // BOX CONTENTS
		
		PhoneComponent comp1 = new PhoneComponent("Earphone Jack Plugs", null, 1, 1000);
		PhoneComponent comp2 = new PhoneComponent("Power Bank", null, 2, 1000);
		PhoneComponent comp3 = new PhoneComponent("Extra Mobile Covers", null, 3, 250);
		PhoneComponent comp4 = new PhoneComponent("4G Data Pack", null, 4, 500);
		PhoneComponent comp5 = new PhoneComponent("Vouchers & Gift Cards", null, 5, 250);
		PhoneComponent comp6 = new PhoneComponent("Replacement Warranty", null, 6, 1000);
		
		comp1.addDescription("Increased performance for");
		comp1.addDescription("Wireless Earphones");
		comp1.addDescription("Supports stereo audio");
		comp1.addDescription("Keeps Phone Jack clean");
		comp1.addDescription("Attachable Antenna");
		comp1.addDescription("Cost = " + comp1.ComponentPrice);
		
		comp2.addDescription("Extended Battery Life");
		comp2.addDescription("Useful for Outdoor");
		comp2.addDescription("10400 mAh Capacity");
		comp2.addDescription("Multiple Ports");
		comp2.addDescription("Cost = " + comp2.ComponentPrice);
		
		comp3.addDescription("Stylish And Trendy");
		comp3.addDescription("Easily Interchangeable");
		comp3.addDescription("Available in multiple colors");
		comp3.addDescription("Cost = " + comp3.ComponentPrice);
		
		comp4.addDescription("1 GB Data Pack");
		comp4.addDescription("Valid for 1 week");;
		comp4.addDescription("Cost = " + comp4.ComponentPrice);
		
		comp5.addDescription("Vouchers from Shopping Centres");
		comp5.addDescription("Movie Complexes");
		comp5.addDescription("Attractive Offers");
		comp5.addDescription("Cost = " + comp5.ComponentPrice);
		
		comp6.addDescription("Valid for 1 year");
		comp6.addDescription("Attractive Offer");
		comp6.addDescription("Cost = " + comp6.ComponentPrice);
		
		try{
			comp1.img = loader.loadImage("/EarphoneJackPlugs.png");
			comp2.img = loader.loadImage("/PowerBank.png");
			comp3.img = loader.loadImage("/MobilePhoneCovers.png");
			comp4.img = loader.loadImage("/4GDataPack.png");
			comp5.img = loader.loadImage("/GiftVoucher.png");
			comp6.img = loader.loadImage("/WarrantyCard.png");
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
				
	}
	
}

