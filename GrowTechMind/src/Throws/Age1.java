package Throws;
class Exception
{
	
	void add() throws ArithmeticException
	{ 
		int a=17;
		if(a>18)
		{
			System.out.println("Log in to google");
		}
		else {
			throw new ArithmeticException();
		}
		
	}
}

public class Age1 extends Exception 
{
	public static void main(String[] args) {
		Exception e1=new Exception();
		e1.add();
		
	}

}
