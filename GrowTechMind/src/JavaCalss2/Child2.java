package JavaCalss2;
class Parent1
{
	void login()
	{
		System.out.println("Login into Amazon");
		
	}
}
abstract class Child1 extends Parent1
{
	
	abstract void add();
	{
		
		
	}
	 void subtract()
	{
		System.out.println("subtraction");

		
	}
	
	
}

public class Child2 extends Child1 
{
	

	public static void main(String[] args) {
		Child2 a1=new Child2();
		a1.add();
		Parent1 p1=new Parent1();
		p1.login();
		
		
	}

	void add() {
		System.out.println("Addition2");
		
	}

	
	void subtract() {
		System.out.println("subtraction2");
		
	}

}
