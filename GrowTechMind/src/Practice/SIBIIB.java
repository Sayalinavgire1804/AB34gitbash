package Practice;

public class SIBIIB {
	
	SIBIIB(int a,int b)
	{
		System.out.println("I am constructor1");
	}
	SIBIIB(int a)
	{
		System.out.println("I am constructor2");

	}
	{
		System.out.println("I am IIB1");

	}
	static
	{
		System.out.println("I am SIB1");

	}
	{
		System.out.println("I am IIB2");

	}
	static
	{
		System.out.println("I am SIB2");

		
	}
	public static void main(String[] args) {

		
		SIBIIB sb=new SIBIIB(0);
		SIBIIB sb1=new SIBIIB(78, 90);

		
	}

}
