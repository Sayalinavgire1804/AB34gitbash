package JavaClass3;

public class ChatGpt {
	public void add()
	{
		System.out.println("Addition");
	}
	private void subtract()
	{
		System.out.println("subtract");
	}
	protected void multiply()
	{
		System.out.println("multiply");
		
	}
	 void divide()
	{
		System.out.println("divide");
		
	}
	public static void main(String[] args) {
		ChatGpt c1=new ChatGpt();
		c1.add();
		c1.multiply();
		c1.subtract();
		c1.divide();
		
	}

}
