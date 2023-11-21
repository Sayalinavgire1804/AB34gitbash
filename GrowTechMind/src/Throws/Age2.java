package Throws;
class Exception1
{
	
	void add() throws ArithmeticException
	{ 
		try {
			//int c=0/1;
			int a=10;
				if(a>20)
				{
			System.out.println(a);
		}
		}
		 
		catch(ArithmeticException e1)
		
		{
			System.out.println("handling");
		}
		
		
	}
}

public class Age2 
{

	public static void main(String[] args) {
		Exception1 e1=new Exception1();
				e1.add();

	}

}
