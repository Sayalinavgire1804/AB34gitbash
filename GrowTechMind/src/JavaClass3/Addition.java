package JavaClass3;
public class Addition 
{
	
	Addition(String a)
	{			System.out.println("Addition of two number");		
	}
	Addition()
	{	this("MANISH");	
		System.out.println("Addition of one number");
	}
	Addition(int a,int b)
	{	this();
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
	new Addition(100,200);
	}

}
