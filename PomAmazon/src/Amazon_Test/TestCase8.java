package Amazon_Test;

import org.testng.annotations.Test;

import Amazon_Source.Amazon_CreateAccount1;

public class TestCase8 extends LaunchAndQuite {
@Test
public void scenario1()
{
	Amazon_CreateAccount1 a1=new Amazon_CreateAccount1(driver);
	a1.CrateAccount();
}
	
}
