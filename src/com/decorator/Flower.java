package com.decorator;

public class Flower extends Lawn_decoration
{

	public Flower(Lawn lawn)
	{
		super(lawn);
	}

	public int cost()
	{
		return lawn.cost()+10000;
	}

}
