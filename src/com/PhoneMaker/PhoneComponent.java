package com.PhoneMaker;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.LinkedList;

public class PhoneComponent {
	
	protected String ComponentName;
	protected LinkedList<String> Description;
	protected BufferedImage img;
	protected int ComponentOption;
	protected double ComponentPrice;
	protected boolean selected;
	protected boolean bought;
	
	public PhoneComponent(String ComponentName, LinkedList<String> Description, int ComponentOption, double ComponentPrice)

	{
		this.ComponentName = ComponentName;
		this.ComponentOption = ComponentOption;
		this.ComponentPrice = ComponentPrice;
		this.Description =  new LinkedList<String>();
		selected = false;
	}
	
	public void render(Graphics g)
	{
		//g.drawImg()
	}
	
	public void Buy()
	{
		selected = true;
	}

	public String getComponentName() {
		return ComponentName;
	}

	public void setComponentName(String componentName) {
		ComponentName = componentName;
	}

	public int getComponentOption() {
		return ComponentOption;
	}

	public void setComponentOption(int componentOption) {
		ComponentOption = componentOption;
	}

	public double getComponentPrice() {
		return ComponentPrice;
	}

	public void setComponentPrice(double componentPrice) {
		ComponentPrice = componentPrice;
	}
	public void addDescription(String para)
	{

			Description.addLast(para);
	}
	
}
