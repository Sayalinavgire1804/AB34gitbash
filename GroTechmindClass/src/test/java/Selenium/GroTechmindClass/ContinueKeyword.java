package Selenium.GroTechmindClass;

public class ContinueKeyword {
	public static void main(String[] args) {
		for(int i=0;i<5;i++)
		{
			if(i==3)
			{
				continue;//skip the iteraion 
			}
			System.out.println("hello"+" "+i);

		}
		
	}

}
