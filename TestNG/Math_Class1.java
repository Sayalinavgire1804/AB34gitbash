package TestNG;

import org.testng.annotations.Test;

public class Math_Class1 {
	@Test
	public void calculation()
	{
		for(int i=0;i<=999;i++)
		{
			System.out.println(Math.random());
			
		}
	}

}
