package com.PhoneMaker;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

public class InputHandler implements MouseListener {

	private PhoneInventory store;
	private int MouseX, MouseY;
	
	
	InputHandler(PhoneInventory store) {
		this.store = store;
	}

	public void mouseClicked(MouseEvent e) {

		MouseX = e.getX();
		MouseY = e.getY();
		
		if(MouseX >= 0 && MouseX <= 300){
		
		for (int i = 0; i < store.Inventory.size(); i++) {
			PhoneComponentHandler aspect = store.Inventory.get(i);

			if (MouseY >= i * 30 + 33 && MouseY <= i * 30 + 33 + 28) {
				aspect.selected = true;
				setRestHandlersAsFalse(aspect);
			}
		}}
		
		else if( MouseX >= 301 && MouseX <= 550)
		{
			for (int i = 0; i < store.Inventory.size(); i++) {
				PhoneComponentHandler aspect = store.Inventory.get(i);
				if(aspect.selected)
				{
					for(int j = 0; j < aspect.CompHandler.size(); j++)
					{
						PhoneComponent comp = aspect.CompHandler.get(j);
						if(MouseY >= j * 50 + 78 && MouseY <= j * 50 + 78 + 48)
						{
							comp.selected = true;
							//if(aspect.HandlerName != "Added Features" && aspect.HandlerName != "Box Contents")
							setRestAsFalse(aspect, comp);
						}
					}
				}

		}}
		else if (MouseX > 500 && MouseY > 575 && MouseX < 500 + 150 && MouseY < 575 + 45) //BUY
		{
			System.out.println("Buy Button Pressed");
			for (int i = 0; i < store.Inventory.size(); i++) {
				PhoneComponentHandler aspect = store.Inventory.get(i);
				if(aspect.selected && !aspect.bought)
				{
					for(int j = 0; j < aspect.CompHandler.size(); j++)
					{
						PhoneComponent comp = aspect.CompHandler.get(j);
							if(comp.selected && !comp.bought)
							{	
								System.out.println("Bought");
								if(aspect.HandlerName != "Added Features" && aspect.HandlerName != "Box Contents")
								aspect.bought = true;
								comp.bought = true;
								FinanceSystem.Spend(comp.ComponentPrice);
							}
						}
					}
			
			}
		}
		
		else if (MouseX > 1040 && MouseY > 575 && MouseX < 1040 + 150 && MouseY < 575 + 45) // Finalize
		{
			for (int i = 0; i < store.Inventory.size(); i++) {
				PhoneComponentHandler aspect = store.Inventory.get(i);
				if(aspect.HandlerName == "Added Features" || aspect.HandlerName == "Box Contents")
				{
					for(int j = 0; j < aspect.CompHandler.size(); j++)
					{
						PhoneComponent comp = aspect.CompHandler.get(j);
							if(comp.bought)
							{	
								aspect.bought = true;
							}
						}
					}
			
			}
			
			App.PPTCommand = true;
			try {
				CreatePPT.MakeFinal(store);
			} catch (IOException error) {
				error.printStackTrace();
			}
		}
	}

	private void setRestHandlersAsFalse(PhoneComponentHandler aspect) {
		
		for (int i = 0; i < store.Inventory.size(); i++) {
			PhoneComponentHandler AspectHandler = store.Inventory.get(i);
			if (AspectHandler.HandlerName != aspect.HandlerName) {
				AspectHandler.selected = false;
				}
			}
		}

	public void mousePressed(MouseEvent e) {

	}

	public void mouseReleased(MouseEvent e) {

	}

	public void mouseEntered(MouseEvent e) {

	}

	public void mouseExited(MouseEvent e) {

	}

	public void setRestAsFalse(PhoneComponentHandler handler, PhoneComponent comp) {
		for (int i = 0; i < store.Inventory.size(); i++) {
			PhoneComponentHandler AspectHandler = store.Inventory.get(i);
			if (AspectHandler.HandlerName != handler.HandlerName) {
				AspectHandler.selected = false;
			}
			for (int j = 0; j < AspectHandler.CompHandler.size(); j++) {
				PhoneComponent component = AspectHandler.CompHandler.get(j);
				if (component.ComponentName != comp.ComponentName) {
					component.selected = false;
				}
			}
		}
	}

}