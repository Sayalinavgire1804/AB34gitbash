package Practice;

public class Throw {

	public static void main(String[] args) throws ArithmeticException
	{
		int age=6;
		if(age>=18)
		{
			System.out.println("Welcome to google");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		else
		{
			throw new ArithmeticException();
		}

	}

}
