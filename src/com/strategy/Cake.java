package com.strategy;

public class Cake implements DESERT
{

	public void desert_range() 
	{
	    System.out.println("     Cake done");	
	}

	public int cost() 
	{	
		return 5000;
	}

}
