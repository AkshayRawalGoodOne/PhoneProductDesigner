package com.PhoneMaker;

public class FinanceSystem {
	
	
	public static double budget = 16000;
	public static double spent = 0;
	public static double total = budget;
	
	public static void Spend(double price)
	{
		budget -= price;
		spent += price;
	}
	public static void Unspend (double price)
	{
		budget += price;
		spent -= price;
	}
	

}
