package abstract_factory;

public class Factory_producer {
   static public Abstract_factory getfactory(String factory)
   {
	   if(factory.equalsIgnoreCase("Fun_factory"))
	   {
		   return new Fun_factory();
	   }
	   else if(factory.equalsIgnoreCase("Dinner_factory"))
	   {
		   return new Dinner_factory();	
	   }
	   return null;
   }
}
