package Practice;

public class Polymorphismpractise {
	
	public void add()
	{
		System.out.println("I am nonstatic method1");
	}
	public void add(int a)
	{
		System.out.println("I am nonstatic method2");
	}
	public void add(int a,String d)
	{
		System.out.println("I am nonstatic method3");
	}

	public static void main(String[] args) {
		
		Polymorphismpractise p1=new Polymorphismpractise();
		p1.add();
		p1.add(7);
		p1.add(8, "Sayali");
		
	}

}
