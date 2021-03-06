package com.PhoneMaker;

import java.awt.Graphics;

import com.PhoneMaker.App.ID;

public abstract class AppEntity {

	protected int x, y;
	protected ID id;
	
	AppEntity(int x, int y, ID id)
	{
		this.x = x;
		this.y = y;
		this.id = id;
	}

	protected abstract void tick();
	
	protected abstract void render(Graphics g);
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}
	
}
