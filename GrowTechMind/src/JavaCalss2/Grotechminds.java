package JavaCalss2;
interface Login
{
	void un();
	
	
}


public class Grotechminds implements Login {


	public static void main(String[] args) {
		Grotechminds g2=new Grotechminds();
		g2.un();
	}

	public void un() {

		System.out.println("Logged in");
	}

}
