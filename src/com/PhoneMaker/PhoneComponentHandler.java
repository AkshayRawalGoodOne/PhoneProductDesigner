package com.PhoneMaker;

import java.util.LinkedList;

import java.awt.Graphics;

public class PhoneComponentHandler {

	protected LinkedList<PhoneComponent> CompHandler = new LinkedList<PhoneComponent>();
	protected String HandlerName;
	protected boolean selected;
	protected boolean bought;
	
	PhoneComponentHandler(String HandlerName)
	{
		setHandlerName(HandlerName);
		selected = false;
	}
	void addComponent(PhoneComponent pcomp)
	{
		CompHandler.add(pcomp);
	}
	void removeComponent(PhoneComponent pcomp)
	{
		CompHandler.remove(pcomp);
	}
	void renderComponents(Graphics g)
	{
		for(int i = 0; i < CompHandler.size(); i++)
		{
			PhoneComponent comp = CompHandler.get(i);
			comp.render(g);
		}
	}
	public String getHandlerName() {
		return HandlerName;
	}
	public void setHandlerName(String HandlerName) {
		this.HandlerName = HandlerName;
	}

}
