package Throws;

public class Ages {
	public static void main(String[] args) throws ArithmeticException, InterruptedException
	{
		int a=7;
		if(a>=18)
		{
			System.out.println("Welcome to google");

			Thread.sleep(3000);
		} 
			
		else
		{
			throw new ArithmeticException();
			}
		
	}

}
