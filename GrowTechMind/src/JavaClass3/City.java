package JavaClass3;
class State
{
	State()
	{
		System.out.println("State Method");
	}
	State(int a,int b)
	{
		System.out.println("Parametrized State Method");
		
	}
	
}


public class City extends State {
	City()
	{
		//super();//non parametrize
		//super(78,89);//Parametrize
		System.out.println("City Method");
	}

	public static void main(String[] args) {
		new City();

		
	}

}
