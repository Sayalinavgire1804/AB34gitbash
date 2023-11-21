package DataProviders;

import org.testng.annotations.DataProvider;

public class DataProviders_class {
	
	@DataProvider(name="data")
	public Object[][] numbers()
	{
		return new Object[][] {{80},{98}};
		
	}

}
