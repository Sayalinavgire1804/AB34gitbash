package Practice;

public class global_1 {

	 String  username;
	int age;
	String Password;
	
	public void variable(String username,int age,String Password)
	{
		this.username=username;
		this.Password=Password;
		this.age=age;
		
		
		System.out.println("123");
	}

	public static void main(String[] args) {
		
		global_1 g1=new global_1();
		g1.variable("Sayali", 23, "123");
		System.out.println(g1.age);
		System.out.println(g1.username);
		System.out.println(g1.Password);
		
		
	}

}
