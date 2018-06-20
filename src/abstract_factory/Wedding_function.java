package abstract_factory;

import java.util.Scanner;
import com.decorator.Ballon;
import com.decorator.Barat;
import com.decorator.Flower;
import com.decorator.Lawn;
import com.decorator.Light;
import com.decorator.Mehendi;
import com.decorator.Valima;
import com.strategy.Dinner_in_event;

public class Wedding_function implements Fun{

	public void fun() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Organize a Wedding function");
		System.out.println("Press 1 for Barat");
        System.out.println("Press 2 for Valima");
        System.out.println("Press 3 for Mehendi");
        System.out.println("***********************************************************************");
        int i= sc.nextInt();
        if(i==1)
        {
        	Lawn l= new Barat();
        	System.out.println("Cost of Marriage Lawn club for Barat = "+l.cost()+" Rupees");
        	System.out.println("***********************************************************************");
        	System.out.println("Select Theme");
        	System.out.println("Press 1 for Light & Ballon Theme");
        	System.out.println("Press 2 for Light & Flower Theme");
        	System.out.println("***********************************************************************");
        	int t= sc.nextInt();
        	if(t==1)
        	{
        		l= new Light(l);
        		l= new Ballon(l);
        		System.out.println("Cost After decoration = "+l.cost()+" Rupees");
        		System.out.println("***********************************************************************");
        		Dinner_in_event d= new Barat();
        		d.dinner_in_event();
        		
        		System.out.println("Press 1 For BBQ  & Desert");
        		System.out.println("Press 2 For Rice $ Desert");
        		System.out.println("Press 3 for BBQ , Rice & Desert");
        		System.out.println("***********************************************************************");
        		int j= sc.nextInt();
        		if(j==1)
        		{
        			Bbq b= new Bbq();
        			b.dinner();
        			System.out.println("***********************************************************************");
        			Desert d1= new Desert();
        			d1.dinner();
        			int f= b.getA()+d1.getC()+l.cost();
        			System.out.println();
        			System.out.println("               ***********************************************************************");
        			System.out.println("               Final Cost After Booking, Decoration and Dinner is = "+f+" Rupees");
        			System.out.println("               ***********************************************************************");
        		}
        		else if(j==2)
        		{
        			Rice b= new Rice();
        			b.dinner();
        			System.out.println("***********************************************************************");
        			Desert d1= new Desert();
        			d1.dinner();
        			int f= b.getB()+d1.getC()+l.cost();
        			System.out.println();
        			System.out.println("               ***********************************************************************");
        			System.out.println("               Final Cost After Booking, Decoration and Dinner is = "+f+" Rupees");
        			System.out.println("               ***********************************************************************");
        		}
        		else if(j==3)
        		{
        			Bbq b= new Bbq();
        			b.dinner();
        			System.out.println("***********************************************************************");
        			Rice b1= new Rice();
        			b1.dinner();
        			System.out.println("***********************************************************************");	
        			Desert d1= new Desert();
        			d1.dinner();        
        			int f= b.getA()+b1.getB()+d1.getC()+l.cost();
        			System.out.println();
        			System.out.println("               ***********************************************************************");
        			System.out.println("               Final Cost After Booking, Decoration and Dinner is = "+f+" Rupees");
        			System.out.println("               ***********************************************************************");
        		
        		}
        		else
        		{
        			System.out.println("Incorrect Input");
        		}

        	}
        	else if(t==2)
        	{
        		l= new Light(l);
        		l= new Flower(l);
        		System.out.println("Cost After decoration = "+l.cost()+" Rupees");
        		System.out.println("***********************************************************************");
        		Dinner_in_event d= new Barat();
        		d.dinner_in_event();
        		
        		System.out.println("Press 1 For BBQ  & Desert");
        		System.out.println("Press 2 For Rice $ Desert");
        		System.out.println("Press 3 for BBQ , Rice & Desert");
        		System.out.println("***********************************************************************");
        		int j= sc.nextInt();
        		if(j==1)
        		{
        			Bbq b= new Bbq();
        			b.dinner();
        			System.out.println("***********************************************************************");
        			Desert d1= new Desert();
        			d1.dinner();
        			int f= b.getA()+d1.getC()+l.cost();
        			System.out.println();
        			System.out.println("               ***********************************************************************");
        			System.out.println("               Final Cost After Booking, Decoration and Dinner is = "+f+" Rupees");
        			System.out.println("               ***********************************************************************");
        		}
        		else if(j==2)
        		{
        			Rice b= new Rice();
        			b.dinner();
        			System.out.println("***********************************************************************");
        			Desert d1= new Desert();
        			d1.dinner();
        			int f= b.getB()+d1.getC()+l.cost();
        			System.out.println();
        			System.out.println("               ***********************************************************************");
        			System.out.println("               Final Cost After Booking, Decoration and Dinner is = "+f+" Rupees");
        			System.out.println("               ***********************************************************************");
        		}
        		else if(j==3)
        		{
        			Bbq b= new Bbq();
        			b.dinner();
        			System.out.println("***********************************************************************");
        			Rice b1= new Rice();
        			b1.dinner();
        			System.out.println("***********************************************************************");	
        			Desert d1= new Desert();
        			d1.dinner();        
        			int f= b.getA()+b1.getB()+d1.getC()+l.cost();
        			System.out.println();
        			System.out.println("               ***********************************************************************");
        			System.out.println("               Final Cost After Booking, Decoration and Dinner is = "+f+" Rupees");
        			System.out.println("               ***********************************************************************");
        		
        		}
        		else
        		{
        			System.out.println("Incorrect Input");
        		}
        	}
        	else
        	{
        		System.out.println("Incorrect Input");
        	}
        	
        	
    		
        	
        }
        else if(i==2)
        {
        	Lawn l2= new Valima();
        	System.out.println("Cost of Marriage Lawn club for Valima = "+l2.cost()+" Rupees");
        	System.out.println("***********************************************************************");    	
        	System.out.println("Select Theme");
        	System.out.println("Press 1 for Light & Ballon Theme");
        	System.out.println("Press 2 for Light & Flower Theme");
        	System.out.println("***********************************************************************");
        	int t= sc.nextInt();
        	if(t==1)
        	{
        		l2= new Light(l2);
        		l2= new Ballon(l2);
        		System.out.println("Cost After decoration = "+l2.cost()+" Rupees");
        		System.out.println("***********************************************************************");
        		Dinner_in_event d= new Valima();
        		d.dinner_in_event();
        		
        		System.out.println("Press 1 For BBQ  & Desert");
        		System.out.println("Press 2 For Rice $ Desert");
        		System.out.println("Press 3 for BBQ , Rice & Desert");
        		System.out.println("***********************************************************************");
        		int j= sc.nextInt();
        		if(j==1)
        		{
        			Bbq b= new Bbq();
        			b.dinner();
        			System.out.println("***********************************************************************");
        			Desert d1= new Desert();
        			d1.dinner();
        			int f= b.getA()+d1.getC()+l2.cost();
        			System.out.println();
        			System.out.println("               ***********************************************************************");
        			System.out.println("               Final Cost After Booking, Decoration and Dinner is = "+f+" Rupees");
        			System.out.println("               ***********************************************************************");
        		}
        		else if(j==2)
        		{
        			Rice b= new Rice();
        			b.dinner();
        			System.out.println("***********************************************************************");
        			Desert d1= new Desert();
        			d1.dinner();
        			int f= b.getB()+d1.getC()+l2.cost();
        			System.out.println();
        			System.out.println("               ***********************************************************************");
        			System.out.println("               Final Cost After Booking, Decoration and Dinner is = "+f+" Rupees");
        			System.out.println("               ***********************************************************************");	
        		}
        		else if(j==3)
        		{
        			Bbq b= new Bbq();
        			b.dinner();
        			System.out.println("***********************************************************************");
        			Rice b1= new Rice();
        			b1.dinner();
        			System.out.println("***********************************************************************");	
        			Desert d1= new Desert();
        			d1.dinner();        
        			int f= b.getA()+b1.getB()+d1.getC()+l2.cost();
        			System.out.println();
        			System.out.println("               ***********************************************************************");
        			System.out.println("               Final Cost After Booking, Decoration and Dinner is = "+f+" Rupees");
        			System.out.println("               ***********************************************************************");	
        		
        		}
        		else
        		{
        			System.out.println("Incorrect Input");
        		}
        	}
        	else if(t==2)
        	{
        		l2= new Light(l2);
        		l2= new Flower(l2);
        		System.out.println("Cost After decoration = "+l2.cost()+" Rupees");
        		System.out.println("***********************************************************************");
        		Dinner_in_event d= new Valima();
        		d.dinner_in_event();
        		
        		System.out.println("Press 1 For BBQ  & Desert");
        		System.out.println("Press 2 For Rice $ Desert");
        		System.out.println("Press 3 for BBQ , Rice & Desert");
        		System.out.println("***********************************************************************");
        		int j= sc.nextInt();
        		if(j==1)
        		{
        			Bbq b= new Bbq();
        			b.dinner();
        			System.out.println("***********************************************************************");
        			Desert d1= new Desert();
        			d1.dinner();
        			int f= b.getA()+d1.getC()+l2.cost();
        			System.out.println();
        			System.out.println("               ***********************************************************************");
        			System.out.println("               Final Cost After Booking, Decoration and Dinner is = "+f+" Rupees");
        			System.out.println("               ***********************************************************************");
        		}
        		else if(j==2)
        		{
        			Rice b= new Rice();
        			b.dinner();
        			System.out.println("***********************************************************************");
        			Desert d1= new Desert();
        			d1.dinner();
        			int f= b.getB()+d1.getC()+l2.cost();
        			System.out.println();
        			System.out.println("               ***********************************************************************");
        			System.out.println("               Final Cost After Booking, Decoration and Dinner is = "+f+" Rupees");
        			System.out.println("               ***********************************************************************");
        		}
        		else if(j==3)
        		{
        			Bbq b= new Bbq();
        			b.dinner();
        			System.out.println("***********************************************************************");
        			Rice b1= new Rice();
        			b1.dinner();
        			System.out.println("***********************************************************************");	
        			Desert d1= new Desert();
        			d1.dinner();        
        			int f= b.getA()+b1.getB()+d1.getC()+l2.cost();
        			System.out.println();
        			System.out.println("               ***********************************************************************");
        			System.out.println("               Final Cost After Booking, Decoration and Dinner is = "+f+" Rupees");
        			System.out.println("               ***********************************************************************");
        		
        		}
        		else
        		{
        			System.out.println("Incorrect Input");
        		}
        	}
        	else
        	{
        		System.out.println("Incorrect Input");
        	}
        	
        	
        }
        else if(i==3)
        {
        	Lawn l3= new Mehendi();
        	System.out.println("Cost of Marriage Lawn club for Mehendi = "+l3.cost()+" Rupees");
        	System.out.println("***********************************************************************");
        	System.out.println("Select Theme");
        	System.out.println("Press 1 for Light & Ballon Theme");
        	System.out.println("Press 2 for Light & Flower Theme");
        	System.out.println("***********************************************************************");
        	int t= sc.nextInt();
        	if(t==1)
        	{
        		l3= new Light(l3);
        		l3= new Ballon(l3);
        		System.out.println("Cost After decoration = "+l3.cost()+" Rupees");
        		System.out.println("***********************************************************************");
        		Dinner_in_event d= new Mehendi();
        		d.dinner_in_event();
        		
        		System.out.println("Press 1 For BBQ  & Desert");
        		System.out.println("Press 2 For Rice $ Desert");
        		System.out.println("Press 3 for BBQ , Rice & Desert");
        		System.out.println("***********************************************************************");
        		int j= sc.nextInt();
        		if(j==1)
        		{
        			Bbq b= new Bbq();
        			b.dinner();
        			System.out.println("***********************************************************************");
        			Desert d1= new Desert();
        			d1.dinner();
        			int f= b.getA()+d1.getC()+l3.cost();
        			System.out.println();
        			System.out.println("               ***********************************************************************");
        			System.out.println("               Final Cost After Booking, Decoration and Dinner is = "+f+" Rupees");
        			System.out.println("               ***********************************************************************");
        		}
        		else if(j==2)
        		{
        			Rice b= new Rice();
        			b.dinner();
        			System.out.println("***********************************************************************");
        			Desert d1= new Desert();
        			d1.dinner();
        			int f= b.getB()+d1.getC()+l3.cost();
        			System.out.println();
        			System.out.println("               ***********************************************************************");
        			System.out.println("               Final Cost After Booking, Decoration and Dinner is = "+f+" Rupees");
        			System.out.println("               ***********************************************************************");
        		}
        		else if(j==3)
        		{
        			Bbq b= new Bbq();
        			b.dinner();
        			System.out.println("***********************************************************************");
        			Rice b1= new Rice();
        			b1.dinner();
        			System.out.println("***********************************************************************");	
        			Desert d1= new Desert();
        			d1.dinner();        
        			int f= b.getA()+b1.getB()+d1.getC()+l3.cost();
        			System.out.println();
        			System.out.println("               ***********************************************************************");
        			System.out.println("               Final Cost After Booking, Decoration and Dinner is = "+f+" Rupees");
        			System.out.println("               ***********************************************************************");
        		
        		}
        		else
        		{
        			System.out.println("Incorrect Input");
        		}
        		
        	}
        	else if(t==2)
        	{
        		l3= new Light(l3);
        		l3= new Flower(l3);
        		System.out.println("Cost After decoration = "+l3.cost()+" Rupees");
        		System.out.println("***********************************************************************");
        		Dinner_in_event d= new Mehendi();
        		d.dinner_in_event();
        		
        		System.out.println("Press 1 For BBQ  & Desert");
        		System.out.println("Press 2 For Rice $ Desert");
        		System.out.println("Press 3 for BBQ , Rice & Desert");
        		System.out.println("***********************************************************************");
        		int j= sc.nextInt();
        		if(j==1)
        		{
        			Bbq b= new Bbq();
        			b.dinner();
        			System.out.println("***********************************************************************");
        			Desert d1= new Desert();
        			d1.dinner();
        			int f= b.getA()+d1.getC()+l3.cost();
        			System.out.println();
        			System.out.println("               ***********************************************************************");
        			System.out.println("               Final Cost After Booking, Decoration and Dinner is = "+f+" Rupees");
        			System.out.println("               ***********************************************************************");
        		}
        		else if(j==2)
        		{
        			Rice b= new Rice();
        			b.dinner();
        			System.out.println("***********************************************************************");
        			Desert d1= new Desert();
        			d1.dinner();
        			int f= b.getB()+d1.getC()+l3.cost();
        			System.out.println();
        			System.out.println("               ***********************************************************************");
        			System.out.println("               Final Cost After Booking, Decoration and Dinner is = "+f+" Rupees");
        			System.out.println("               ***********************************************************************");
        		}
        		else if(j==3)
        		{
        			Bbq b= new Bbq();
        			b.dinner();
        			System.out.println("***********************************************************************");
        			Rice b1= new Rice();
        			b1.dinner();
        			System.out.println("***********************************************************************");	
        			Desert d1= new Desert();
        			d1.dinner();        
        			int f= b.getA()+b1.getB()+d1.getC()+l3.cost();
        			System.out.println();
        			System.out.println("               ***********************************************************************");
        			System.out.println("               Final Cost After Booking, Decoration and Dinner is = "+f+" Rupees");
        			System.out.println("               ***********************************************************************");
        		}
        		else
        		{
        			System.out.println("Incorrect Input");
        		}
        	}
        	else
        	{
        		System.out.println("Incorrect Input");
        	}
        }
        else
        {
        	System.out.println("Incorrect Input");
        }
        
        
        
	}

}
