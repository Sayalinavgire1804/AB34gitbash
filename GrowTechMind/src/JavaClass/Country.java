package JavaClass;

public class Country {
	void add()
	{
		System.out.println("NonStatic method");
	}
	static void subtract()
	{
		System.out.println("Static Method");
		
	}
	Country()
	{
		System.out.println("Constuctor/nonstatic method");
	}

	public static void main(String[] args) {
		Country C1=new Country();
		subtract();
		C1.add();
		new Country();

	}

}
