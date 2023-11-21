package JavaCalss2;
abstract  class Google
{
	abstract void Login();
	void add()
	{
		System.out.println("Addition of two numbers");
	}
	
	
}
 class facebook extends Google
{
	 void Logininfacebook()
		{
			System.out.println("Logged in in facebook");
		}

	void Login() {
		System.out.println("Logged in in google");
		
	}
	
}

public class Zoom extends facebook {
	 void Logininzoom()
		{
			System.out.println("Logged in in zoom");
		}
		void Login() {
			System.out.println("Logged in in google");
			
		}
		
	

	public static void main(String[] args) {
		Zoom z1=new Zoom();
		z1.Logininzoom();
		z1.Login();
		z1.Logininfacebook();
		z1.add();
		
	}

}
