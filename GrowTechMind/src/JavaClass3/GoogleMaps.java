package JavaClass3;
interface GoogleAuth
{
	void un();
	void pw();
	
}
interface GooglewayAuth
{
	void call();
	void sms();
	
}

public class GoogleMaps implements GooglewayAuth,GoogleAuth  
{

	public static void main(String[] args) {
		
		GoogleMaps g1=new GoogleMaps();
		g1.un();
		g1.pw();
		g1.call();
		g1.sms();
			
		}

	
	public void un() {
		System.out.println("Username");
		
	}

	
	public void pw() {
		System.out.println("Password");
		
	}

	
	public void call() {
		System.out.println("Calling");
		
	}

	
	public void sms() {
		System.out.println("SMS");

		
	}
	}


