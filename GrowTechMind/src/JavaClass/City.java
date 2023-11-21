package JavaClass;
class State
{
	 void statehighway()
	{
		System.out.println("I am travelling in state");
	}
}
public class City extends State//this is child
{
	 void cityroad()
	{
		System.out.println("I am travelling in city");
	}
	public static void main(String[] args)
	{
		City c1=new City();
		c1.cityroad();
		c1.statehighway();
		
		
	}

}
