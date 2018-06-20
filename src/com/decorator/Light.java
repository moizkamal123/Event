package com.decorator;

public class Light extends Lawn_decoration
{

	public Light(Lawn lawn)
	{
		super(lawn);
	}

	public int cost() 
	{
		return lawn.cost()+25000;
	}

}
