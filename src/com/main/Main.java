package com.main;

import java.util.Scanner;
import java.util.function.Function;
import abstract_factory.Abstract_factory;
import abstract_factory.Bbq;
import abstract_factory.Dinner;
import abstract_factory.Factory_producer;
import abstract_factory.Fun;
import abstract_factory.Wedding_function;
import com.decorator.Ballon;
import com.decorator.Barat;
import com.decorator.Flower;
import com.decorator.Lawn;
import com.decorator.Light;
import com.factory.Login;
import com.factory.Admin_login;
import com.factory.Login_factory;
import com.factory.Manager_login;


public class Main {

	public static void main(String[] args) 
	{
        System.out.println("Write your designation for login 'Admin' or 'Manager'");
		Scanner sc = new Scanner(System.in);
        String input = sc.next();
        
        Login l = Login_factory.get_login(input);
        l.login();
	}

}
