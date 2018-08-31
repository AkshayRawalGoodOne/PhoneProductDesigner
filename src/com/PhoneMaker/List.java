package com.PhoneMaker;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import com.PhoneMaker.App.ID;

public class List extends AppEntity {

	PhoneInventory store;
	public static int MouseX, MouseY;
	static String buyButtonString = null;

	public List(int x, int y, ID id, PhoneInventory store) {
		super(x, y, id);
		this.store = store;
	}

	protected void tick() {

	}

	protected void render(Graphics g) {

		buyButtonString = "BUY";

		for (int i = 0; i < store.Inventory.size(); i++) {
			PhoneComponentHandler aspect = store.Inventory.get(i);
			g.setColor(new Color(45, 215, 96));

			if (aspect.selected && !aspect.bought) {
				PhonePreview2.ComponentShown = false;
				buyButtonString = "BUY";
				g.setColor(new Color(181, 230, 29));
				for (int j = 0; j < aspect.CompHandler.size(); j++) {

					PhoneComponent component = aspect.CompHandler.get(j);
					g.setColor(new Color(45, 215, 96));
					if (component.selected && !component.bought) {
						g.setColor(new Color(181, 230, 29));
					}
					else if(component.bought) g.setColor(Color.RED);
					g.fillRoundRect(300 + 3, j * 50 + 78, 244, 48, 5, 5);
					g.setColor(Color.BLACK);
					g.setFont(new Font("Berlin Sans FB Demi", 0, 22));
					g.drawString(component.ComponentName, 315, j * 50 + 55 + 52);

					if (component.selected)
					{
						PhonePreview2.ComponentShown = true;
						PhonePreview2.front = component.img;
						if (!component.bought) {

							g.setColor(new Color(45, 215, 96));
							g.fillRoundRect(500, 575, 150, 45, 5, 5);
							g.setColor(Color.BLACK);
							g.setFont(new Font("Berlin Sans FB Demi", 0, 30));
							g.drawString(buyButtonString, 520, 605);

						}
						g.setColor(new Color(181, 230, 29));
						
						if(component.bought) g.setColor(Color.RED);
						g.fillRoundRect(550 + 3, 78, 244, 480, 15, 15);
						g.setColor(Color.BLACK);
						g.setFont(new Font("Berlin Sans FB Demi", 0, 30));
						g.drawString(component.ComponentName, 560, 130);

						for (int k = 0; k < component.Description.size(); k++) {
							g.setFont(new Font("Berlin Sans FB Demi", 0, 20));
							g.drawString(component.Description.get(k), 560, k * 30 + 300);
						}
					}

				}
			}


			g.setColor(new Color(45, 215, 96));
			if (aspect.selected && aspect.bought) {
				g.setColor(new Color(255, 79, 83));
				if(aspect.HandlerName != "Added Features" && aspect.HandlerName != "Box Contents"){
				for(int l = 0; l < aspect.CompHandler.size(); l++)
				{
					PhoneComponent compo = aspect.CompHandler.get(l);
					if(compo.bought){
						PhonePreview2.ComponentShown = true;
						PhonePreview2.front = compo.img;
						break;
					}
				}
				}
			} else if (aspect.selected)
				g.setColor(new Color(181, 230, 29));
			else if (aspect.bought)
				g.setColor(Color.RED);
			g.fillRoundRect(3, i * 30 + 33, 294, 28, 5, 5);
			g.setColor(Color.BLACK);
			g.setFont(new Font("Berlin Sans FB Demi", 0, 22));
			g.drawString(aspect.HandlerName, 8, i * 30 + 55);
		}

		g.setColor(Color.BLACK);
		g.setFont(new Font("Berlin Sans FB Demi", 0, 50));
		g.drawString(App.CompanyName + " Inc.", 330, 60);

		g.setColor(new Color(45, 215, 96));
		g.fillRoundRect(1040, 575, 150, 45, 5, 5);

		g.setColor(Color.BLACK);
		g.setFont(new Font("Berlin Sans FB Demi", 0, 30));
		g.drawString("Finalize", 1060, 605);

		g.drawString("Total Budget :  " + Integer.toString((int) FinanceSystem.budget), 10, 575);
		g.drawString("Total Money Spent : " + Integer.toString((int) FinanceSystem.spent), 10, 615);

	}
}
