package typecasting;
class State
{
	void Statename()
	{
		System.out.println("Statename");
		
	}
	void Stateroad()
	{
		System.out.println("Stateroad");
		
	}
}

public class City extends State {
	void Cityname()
	{
		System.out.println("Cityname");

		
	}
	
	void Cityroad()
	{
		System.out.println("Cityroad");

		
	}

	public static void main(String[] args) {
State s1=(State)new City();//upcasting
s1.Statename();
s1.Stateroad();
City c1=(City) s1;//downcasting
c1.Statename();
c1.Stateroad();
c1.Cityname();
c1.Cityroad();

		
	}

}
