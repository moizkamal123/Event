package com.decorator;

public abstract class Lawn_decoration implements Lawn
{
     Lawn lawn;
     public Lawn_decoration(Lawn lawn)
     {
    	 super();
    	 this.lawn=lawn;
     }
}
