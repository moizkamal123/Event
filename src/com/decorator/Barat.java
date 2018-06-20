package com.decorator;

import java.util.Scanner;

import abstract_factory.Bbq;
import abstract_factory.Desert;
import abstract_factory.Rice;

import com.strategy.Dinner_in_event;

public class Barat extends Dinner_in_event implements Lawn 
{

	public int cost() 
	{
		return 500000;
	}

	public void dinner_in_event() 
	{
	    System.out.println("Select Dishes for Dinner in Barat");	
	}
	

}
