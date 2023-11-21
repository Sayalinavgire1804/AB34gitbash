package TestNGGrouping1;

import org.testng.annotations.Test;

public class grouping_class {
	@Test(groups= {"Smoke"})
	public void scenario1()
	{
		System.out.println("Smoke");
		
	}
	@Test(groups={"Smoke"})
	public void scenario2()
	{
		System.out.println("Smoke");

		
	}
	@Test(groups= {"Smoke","System"})
	public void scenario3()
	{
		System.out.println("Smoke and system");

		
	}
	@Test(groups= {"Smoke","System","Regression"})
	public void scenario4()
	{
		System.out.println("Smoke,System,Regression");

	}
	@Test(groups= {"Regression"})
	public void scenario5()
	{
		System.out.println("Regression");

	}
	@Test(groups= {"Regression","System"})
	public void scenario6()
	{
		System.out.println("Regression,System");

	}
	@Test(groups= {"System","Smoke"})
	public void scenario7()
	{
		System.out.println("Smoke,System");

	}
	@Test(groups={"Regression","Integration"})
	public void scenario8()
	{
		System.out.println("Regression,Integration");

	}

	@Test(groups={"Integration","System"})
	public void scenario9()
	{
		System.out.println("Integration,System");

	}
	@Test(groups= {"Component","System"})
	public void scenario10()
	{
		System.out.println("Component,System");

	}
}
