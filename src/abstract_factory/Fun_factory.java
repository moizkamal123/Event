package abstract_factory;

public class Fun_factory extends Abstract_factory {

	public Fun getfunction(String function) {
		if(function.equalsIgnoreCase("Wedding_function"))
		{
			return new Wedding_function();
		}
		else if(function.equalsIgnoreCase("Party_function"))
		{
			return new Party_function();
		}
		return null;
	}

	public Dinner getdinner(String dinner) {
		// TODO Auto-generated method stub
		return null;
	}

}
