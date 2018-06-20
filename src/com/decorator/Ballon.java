package com.decorator;

public class Ballon extends Lawn_decoration 
{

	public Ballon(Lawn lawn)
	{
		super(lawn);	
	}

	public int cost() 
	{	
		return lawn.cost()+20000;
	}

}
