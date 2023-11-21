package JavaCalss2;
class Country
{
	void NationalHighway()
	{
		System.out.println("NH");
	}
	
}

class State extends Country
{
	void StateHighway()
	{
		System.out.println("SH");
	}
	
}



public class City extends State
{
	void CityHighway()
	{
		System.out.println("CH");
		
	}
	

	public static void main(String[] args) {
		City c1 =new City();
		c1.StateHighway();
		c1.NationalHighway();
		c1.CityHighway();
		
	}

}
