package Amazon_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Amazon_Source.Amazon_Login;
import Amazon_Source.Amazon_home;

public class TestCae2 extends LaunchAndQuite {
	@Test
	public void login_amazonapplication() throws EncryptedDocumentException, IOException
	{
	
	Amazon_Login a1 =new Amazon_Login(driver);
	a1.un();
	a1.continueButton();
	a1.pw();
	a1.signInbuttonMethod();
	driver.navigate().refresh();
	Amazon_home a2=new Amazon_home(driver);
	a2.search();
	driver.navigate().refresh();


}
}
