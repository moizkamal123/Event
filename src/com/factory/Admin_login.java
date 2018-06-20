package com.factory;

import java.util.Scanner;
import java.util.function.Function;

import abstract_factory.Abstract_factory;
import abstract_factory.Dinner;
import abstract_factory.Factory_producer;
import abstract_factory.Fun;



public class Admin_login implements Login
{

	public void login() 
	{
		System.out.println("Welcome Admin");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your user name");
		String user= sc.next();
		System.out.println("Enter your password");
		String pass= sc.next();
		if(user.equalsIgnoreCase("Zainab") && pass.equals("123"))
		{
			System.out.println("Login successful");
			System.out.println("***********************************************************************");
			System.out.println();
			System.out.println("Type 1 for Organize a Wedding Function");
			System.out.println("Type 2 for Organize a Party Function");
			System.out.println("***********************************************************************");
			int i= sc.nextInt();
			if(i==1)
			{
			     Abstract_factory a= Factory_producer.getfactory("Fun_factory");
			     Fun f= a.getfunction("Wedding_function");
			     f.fun();
			}
			else if(i==2)
			{
				Abstract_factory a= Factory_producer.getfactory("Fun_factory");
				Fun f= a.getfunction("Party_function");
				f.fun();
			}
			else
			{
				System.out.println("Incorrect");
			}
		}
	    else
	    {
			System.out.println("You enter wrong username or password");
			System.out.println("Please Try Again");
			System.out.println();
			System.out.println("***********************************************************************");
		    login();
	    }
	}
	
	
}
