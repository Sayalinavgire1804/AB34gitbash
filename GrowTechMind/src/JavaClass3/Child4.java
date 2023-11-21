package JavaClass3;
interface Teacher
{
	void assignment();
	void lessions();
	
}
class Child2 implements Teacher
{
	static void subtraction()
	{
		System.out.println("subtraction");
	}

	
	public void assignment() {

		System.out.println("assignment");
	}

	public void lessions() {

		System.out.println("lessions");
	}
	
}
class Child3 extends Child2
{
	void add()
	{
		System.out.println("addition");
	}
	
}

public class Child4 extends Child3   {

	public static void main(String[] args) {
		Child4 c4=new Child4();
		c4.assignment();
		c4.lessions();
		c4.add();
		subtraction();
		
	}

}
