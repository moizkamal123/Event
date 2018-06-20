package abstract_factory;

import java.util.Scanner;

import com.strategy.Biryani;
import com.strategy.Fried_rice;
import com.strategy.RICE;

public class Rice implements Dinner{

	int b;
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public void dinner()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Rice Range");
		System.out.println("Press 1 For Biryani");
		System.out.println("Press 2 For Fried Rice");
		System.out.println("Press 3 For both");
		int input= sc.nextInt();
		if(input==1)
		{
		  RICE r= new Biryani();
		  System.out.println("Cost of Biryani = "+r.cost()+" Rupees");
		  r.rice_range();
		  setB(r.cost());
		    
		}
		else if (input==2)
		{
			RICE r= new Fried_rice();
			System.out.println("Cost of Fried Rice = "+r.cost()+" Rupees");
			r.rice_range();
			setB(r.cost());
		}
		else if(input==3)
		{
			RICE r= new Biryani();
			System.out.println("Cost of Biryani = "+r.cost()+" Rupees");
	        r.rice_range();
			  
	   	    RICE r1= new Fried_rice();
	    	System.out.println("Cost of Fried Rice = "+r1.cost()+" Rupees");
			r1.rice_range();
			setB(r.cost()+r1.cost());
		}	
		else
		{
			System.out.println("Incorrect Input");
		}
	}

}
