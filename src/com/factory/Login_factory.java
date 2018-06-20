package com.factory;

public class Login_factory 
{
	static public Login get_login(String l)
	{
		if(l.equalsIgnoreCase("Admin"))
		{
			return new Admin_login();
		}
		else if(l.equalsIgnoreCase("Manager"))
		{
			return  new Manager_login();
		}
		return null;
	}
}
