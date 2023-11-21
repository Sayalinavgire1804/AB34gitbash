package DataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase_class {
	@Test(dataProvider="data1")
	public void test1(int a)
	{
		System.out.println(a);
		
	}
	@DataProvider(name="data")
	public Object[][] numbers()
	{
		return new Object[][] {{80},{98}};
		
	}
	@DataProvider(name="data1")
	public Object[][] numberof5student()
	{
		return new Object[][] {{80},{98},{76},{34},{45}};
		
	}


}
