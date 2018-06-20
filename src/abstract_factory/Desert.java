package abstract_factory;

import java.util.Scanner;

import com.strategy.BBQ;
import com.strategy.Cake;
import com.strategy.DESERT;
import com.strategy.Ice_cream;
import com.strategy.Kabab;

public class Desert  implements Dinner{
  
	int c;
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public void dinner() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Desert_range");
		System.out.println("Press 1 For Ice cream");
		System.out.println("Press 2 For Cake");
		System.out.println("Press 3 For Both");
		int input= sc.nextInt();
		if(input==1)
		{
			DESERT d= new Ice_cream();
			System.out.println("Cost of Ice cream = "+d.cost()+" Rupees");
			d.desert_range();
			setC(d.cost());
		}
		else if (input==2)
		{
			DESERT d= new Cake();
			System.out.println("Cost of Cake = "+d.cost()+" Rupees");
			d.desert_range();	
			setC(d.cost());
		}
		else if(input==3)
		{
			DESERT d= new Ice_cream();
			System.out.println("Cost of Ice cream = "+d.cost()+" Rupees");
			d.desert_range();
			DESERT d1= new Cake();
			System.out.println("Cost of Cake = "+d1.cost()+" Rupees");
			d1.desert_range();
			setC(d.cost()+d1.cost());
		}
		else
		{
			System.out.println("Incorrect Input");
		}
	}
	
}
