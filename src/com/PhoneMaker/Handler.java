package com.PhoneMaker;

import java.awt.Graphics;
import java.util.LinkedList;

public class Handler {

	private LinkedList<AppEntity> appObj = new LinkedList<AppEntity>();
	
	void addObject(AppEntity entity)
	{
		appObj.add(entity);
	}
	void removeObject(AppEntity entity)
	{
		appObj.remove(entity);
	}
	public void tick()
	{
		for(int i = 0; i < appObj.size(); i++)
		{
			AppEntity tempObject = appObj.get(i);
			tempObject.tick();
		}
	}
	public void render(Graphics g){
		for(int i = 0; i < appObj.size(); i++)
		{
			AppEntity tempObject = appObj.get(i);
			tempObject.render(g);
		}
	}
	public void clearAll()
	{
		int size = appObj.size();
		for(int i = 0; i < size; i++)
		{
			AppEntity entity = appObj.get(0);
			removeObject(entity);
		}
	}
}
