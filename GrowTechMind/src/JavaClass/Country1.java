package JavaClass;

public class Country1 {
	Country1()
	{
		System.out.println("1");
		
	}
	Country1(int a)
	{
		System.out.println("2");
		
	}

	public static void main(String[] args) {
		new Country1();
		new Country1(999);
		Country1 C1=new Country1();
		Country1 C2=new Country1(8765);

	}

}
