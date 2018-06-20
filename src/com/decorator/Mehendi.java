package com.decorator;

import com.strategy.Dinner_in_event;

public class Mehendi extends Dinner_in_event implements Lawn
{

	public int cost() 
	{
    	return 200000;
	}

	public void dinner_in_event() {
	  System.out.println("Select Dishes for Dinner in Mehendi");
	}

}
