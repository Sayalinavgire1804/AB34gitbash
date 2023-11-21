package JavaClass3;
abstract class Google
{
	abstract void Searching();
	abstract void videostraming();
	static void login()
	{
		System.out.println("login");

		
	}
	void learning()
	{
		System.out.println("learning");

		
	}
	
}
abstract class facebook extends Google
{
	abstract void  Editing();
	abstract void Compiling();
	
	
	static void Chatting()
	{
		System.out.println("Chatting");

	}
		
	
	void Posting()
	{
		System.out.println("Posting");
		
	}
}

public class Child1 extends facebook {

	static void add()
	{
		System.out.println("Addition");
		
	}
	void subtract()
	{
		System.out.println("subtraction");
		
	}

	public static void main(String[] args) {
		Child1 c1=new Child1();
		c1.Compiling();
		c1.Editing();
		c1.Searching();
		c1.videostraming();
		add();
		c1.subtract();
		Chatting();
		c1.Posting();
		login();
		c1.learning();
		
	}
	void Editing() {
		System.out.println("Editing");

		
	}
	void Compiling() {
		System.out.println("Compiling");
		
	}
	void Searching() {
		System.out.println("Searching");
		
	}
	void videostraming() {
		System.out.println("videostraming");
		
	}

}
