package com.decorator;

import com.strategy.Dinner_in_event;

public class Newyear_party extends Dinner_in_event implements Lawn
{

	public int cost() 
	{
		return 80000;
	}

	public void dinner_in_event() {
		System.out.println("Select Dishes for Dinner in Newyear Party");
	}

}
