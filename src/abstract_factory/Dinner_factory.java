package abstract_factory;

public class Dinner_factory extends Abstract_factory{

	public Fun getfunction(String function) {
		// TODO Auto-generated method stub
		return null;
	}

	public Dinner getdinner(String dinner) {
		if(dinner.equalsIgnoreCase("Rice"))
		{
			return new Rice();
		}
		else if(dinner.equalsIgnoreCase("Desert"))
		{
			return new Desert();
		}
		else if(dinner.equalsIgnoreCase("Bbq"))
		{
			return new Bbq();
		}
		return null;
		
	}

}
