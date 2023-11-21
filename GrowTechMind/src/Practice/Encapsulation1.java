package Practice;
class AuthenticationLog{

	private String Username="Google@gmail.com";
	private String Password="1234";
	private int age=34;
	public void setUsername(String Username)
	{
		this.Username=Username;
	}
	public String getUsername()
	{
		return Username;
		
	}
	public void SetPassword(String Password)
	{
		this.Password=Password;
	}
	public String getPassword()
	{
		return Password;
	}
	public void setage(int age)
	{
		this.age=age;
	}
	public int getage()
	{
		return age;
	}
}

public class Encapsulation1 {
	

	public static void main(String[] args) {

		AuthenticationLog a1=new AuthenticationLog();
		a1.setUsername("Sayali@gmail.com");
		a1.SetPassword("Sayali@1804");
		a1.setage(28);
		System.out.println(a1.getUsername());
		System.out.println(a1.getPassword());
		System.out.println(a1.getage());
		
	}

}
