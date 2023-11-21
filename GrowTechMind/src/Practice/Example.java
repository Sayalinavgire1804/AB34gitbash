package Practice;

public class Example {
	
	Example()
	{
		System.out.println("I am constructor");
		
	}
	static
	{
		System.out.println("I am SIB1");

		
	}
	static
	{
		System.out.println("I am SIB2");

		
	}
	{
		System.out.println("I am IIB1");

	}
	{
		System.out.println("I am IIB2");

		
	}
	 public static void  scenario1()
	{
			System.out.println("I am Static method1");

		
	}
	 public  static void  scenario2(int a,int b)
	 {
			System.out.println("I am Static method2");

		 
	 }
	 public  void scenario3()
	 {
			System.out.println("I am non Static method1");

	 }
	 public void scenario4(String a,char b)
	 {
			System.out.println("I am non Static method2");

		 
	 }
	public static void main(String[] args) {
		
		Example e1=new Example() ;
		scenario2(90, 67);
		e1.scenario4("sayali", 'M');
		scenario1();
		e1.scenario3();
		
		
		
	}
}
