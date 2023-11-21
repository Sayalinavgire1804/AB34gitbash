package polymorphism;
class Authentication
{
	private String Username="growtechmind@gmail.com";

	public void SetUsername(String Username)
	{
		this.Username=Username;
	}
	public String GetUsername()
	{
		return Username;
	}
}

public class Loginongoogle {

	public static void main(String[] args) {
		Authentication a1=new Authentication();
		a1.SetUsername("sayali@gmail.com");
		System.out.println(a1.GetUsername());

		
	}

}
