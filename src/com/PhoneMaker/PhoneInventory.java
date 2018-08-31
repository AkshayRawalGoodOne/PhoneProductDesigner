package com.PhoneMaker;

import java.util.LinkedList;

public class PhoneInventory {
	
	public LinkedList<PhoneComponentHandler> Inventory = new LinkedList<PhoneComponentHandler>();
	private DefineAppearanceHandler appearance;
	private DefinePerformanceHandler performance;
	private DefineAddedFeaturesHandler addedFeatures;
	private DefineBoxContentsHandler boxContents;
	private DefineTechnologicalFeaturesHandler techFeatures;
	
	//private PhoneComponentHandler handler;
	
	PhoneInventory()
	{
		appearance = new DefineAppearanceHandler(this);
		performance = new DefinePerformanceHandler(this);
		addedFeatures = new DefineAddedFeaturesHandler(this);
		boxContents = new DefineBoxContentsHandler(this);
		techFeatures = new DefineTechnologicalFeaturesHandler(this);
	}
	
	void addObject(PhoneComponentHandler handler)
	{
		Inventory.add(handler);	
		
	}
	
	void removeObject(PhoneComponentHandler handler)
	{
		Inventory.remove(handler);
	}
	void defineAppearance()
	{
		
		Inventory.add(new PhoneComponentHandler("Screen Size"));
		Inventory.add(new PhoneComponentHandler("Case Material"));
		
		Inventory.add(new PhoneComponentHandler("Primary Camera"));
		Inventory.add(new PhoneComponentHandler("Secondary Camera"));
		
		
		Inventory.add(new PhoneComponentHandler("Flashlight"));	
		appearance.Define();
	}
	void definePerformance()
	{
		Inventory.add(new PhoneComponentHandler("Android Version"));
		Inventory.add(new PhoneComponentHandler("Ram Size"));
		Inventory.add(new PhoneComponentHandler("Processor"));
		Inventory.add(new PhoneComponentHandler("Battery"));
		//Inventory.add(new PhoneComponentHandler("Sound System"));
		Inventory.add(new PhoneComponentHandler("Graphics Processing Unit"));
		//Inventory.add(new PhoneComponentHandler("Audio Codec"));
		performance.Define();
	}
	void defineAddedFeatures()
	{
		Inventory.add(new PhoneComponentHandler("Added Features"));
		addedFeatures.Define();
	}
	void defineTechFeatures()
	{
		//Inventory.add(new PhoneComponentHandler("Power Control"));
		//Inventory.add(new PhoneComponentHandler("Temperature Control"));
		Inventory.add(new PhoneComponentHandler("Internet Connectivity"));
		techFeatures.Define();
	}
	void defineBoxContents()
	{
		Inventory.add(new PhoneComponentHandler("Box Contents"));
		boxContents.Define();
	}
	void FillInventory()
	{
		defineAppearance();
		definePerformance();
		defineAddedFeatures();
		defineTechFeatures();
		defineBoxContents();
		
	}
	public enum HandlerName
	{
		
	}
}
