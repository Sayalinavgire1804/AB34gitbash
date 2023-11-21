package Practice;

class Country
{
	void Countryhighway()
	{
		
		System.out.println("Countryhighway");
	}
	static void CountryCode()
	{
		System.out.println("CountryCode");

		
	}
	
}
 class State extends Country
{
	void Stateyhighway()
	{
		System.out.println("Stateyhighway");

		
	}
	static void StateCode()
	{
		System.out.println("StateCode");
		
	}
	
}
public class MultilevelInheritanceCity extends State{
	void Cityhighway()
	{
		System.out.println("Cityhighway");

		
	}
	static void CityCode()
	{
		System.out.println("CityCode");
		
	}

	public static void main(String[] args) {

		MultilevelInheritanceCity mc=new MultilevelInheritanceCity();
		mc.Countryhighway();
		CountryCode();
		mc.Stateyhighway();
		StateCode();
		mc.Cityhighway();
		CityCode();
		
	}

}
