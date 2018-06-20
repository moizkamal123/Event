package abstract_factory;

import java.util.Scanner;

import com.strategy.BBQ;
import com.strategy.Kabab;
import com.strategy.Tikkay;

public class Bbq implements Dinner{
 
	int a;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	
	public void dinner() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Select BBQ-Range");
		System.out.println("Press 1 For Gola Kabab");
		System.out.println("Press 2 For Chicken Tikka");
		System.out.println("Press 3 For Both");
		int input= sc.nextInt();
		if(input==1)
		{
			BBQ b= new Kabab();
			System.out.println("Cost of Gola Kabab = "+b.cost()+" Rupees");
			b.BBQ_range();
			setA(b.cost());
		}
		else if (input==2)
		{
			BBQ b= new Tikkay();
			System.out.println("Cost of Tikkay = "+b.cost()+" Rupees");
			b.BBQ_range();
			setA(b.cost());
		}
		else if(input==3)
		{
			BBQ b= new Kabab();
			System.out.println("Cost of Gola Kabab = "+b.cost()+" Rupees");
			b.BBQ_range();
			BBQ b1= new Tikkay();
			System.out.println("Cost of Tikkay = "+b1.cost()+" Rupees");
			b1.BBQ_range();	
			setA(b.cost()+b1.cost());
		}
		else
		{
			System.out.println("Incorrect Input");
		}
	}
}
