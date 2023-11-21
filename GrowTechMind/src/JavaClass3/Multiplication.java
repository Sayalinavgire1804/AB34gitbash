package JavaClass3;

public class Multiplication {
	 Multiplication()
		{
			System.out.println("Multiplication of three numbers");
			
		}
	
	 Multiplication(String a)
	{
		 this();
		System.out.println("Multiplication of two numbers");
		
	}
	 Multiplication(int a,int b)
	
	{
		 this("sayali");
		int c=a*b;
		System.out.println(c);
		
		
	}

	public static void main(String[] args) {

		new Multiplication(87,99);
		
	}

}
