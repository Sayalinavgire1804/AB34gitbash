package JavaClass;

public class Country2 {
	Country2(int a,float b)
	{
		System.out.println("Constructor with int and flat");
	}
	Country2(double a,char b )
	{
		System.out.println("Constructor with double and char");
		
	}
Country2(boolean b,int a)
{
	
	System.out.println("Constructor wih boolean and int");
}
Country2(String a,String b,String C)
{
	System.out.println("Constructor wih String");
	
}
Country2(float b,int a,double c,char d,boolean e,String f)
{
	
	System.out.println("Constructor wih boolean,int,string,float,char,double");
}
	public static void main(String[] args) {
		
    new Country2(666.98f,8969,5432.90,'S',true,"Sayali");
    new Country2(5643,7654.87f);
    new Country2("Sayali","Akshat","Disha");
    new Country2(false,4321);
    new Country2(6521.765,'U');
	}

}
