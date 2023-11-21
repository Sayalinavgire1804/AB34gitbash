package JavaClass3;
class C2{
	  void Result()
		{
			System.out.println("Result annoncement");
			
		
	
}
}
abstract class CA2 extends C2
{
	abstract void zoomin();
	abstract void zoomout();
	 static void Listing()
		{
			System.out.println("Listing the apllication");
			
		}
		
	
}
abstract class CA1 extends CA2
{
	abstract void signin();
	abstract void signout();
	 void registration()
	{
		System.out.println("registration");
		
	}
	
}

public class C1 extends CA1 
{
	static void add()
	{
		System.out.println("Addition");
		
	}
	void subtract()
	{
		System.out.println("subtraction");
		
	}

	public static void main(String[] args) {
		C1 child1=new C1();
		child1.signin();
		child1.signout();
		child1.zoomin();
		child1.zoomout();
		add();
		child1.subtract();
		child1.Result();
		Listing();
		
		
		
		
	}
	void signin() {

		System.out.println("signin");
	}
	void signout() {
		System.out.println("signout");		
	}
	void zoomin() {
		System.out.println("zoomin");		
		
	}
	void zoomout() {
		System.out.println("zoomout");	
		
	}

}

