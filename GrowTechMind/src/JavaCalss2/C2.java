package JavaCalss2;

public class C2 extends Parent {
	void DebitCard()
	{
		System.out.println("DebitCard Payment");
	}

	public static void main(String[] args) {

		C2 c=new C2();
		c.DebitCard();
		c.Login();
	}

}
