package TestNGListners;

import org.testng.annotations.Test;

public class Grouping_class {
	
	@Test(groups= {"Smoke"})
	 public void sceanrio1()
	{
		System.out.println("1");
		
	}
	@Test(groups= {"Smoke"})
	 public void sceanrio2()
	{
		System.out.println("2");
	}
	@Test(groups= {"Smoke","System"})
	 public void sceanrio3()
	{
		System.out.println("3");

	}
	@Test(groups= {"System","Regression"})
	 public void sceanrio4()
	{
		System.out.println("4");

		
	}
	

}
