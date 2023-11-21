package Throws;

public class Age {

	public static void main(String[] args) {

		int age=6;
		if(age>=18)
		{
			System.out.println("welcome to google");
		}
		else
		{
			throw new ArithmeticException("You are still young");
		}
	}

}
