package Amazon_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Amazon_Source.Amazon_Login;
import Amazon_Source.File_class;

public class TestCae1 extends LaunchAndQuite{
	@Test
	public void login_amazonapplication() throws InterruptedException, EncryptedDocumentException, IOException
	{
		

		Amazon_Login a1 =new Amazon_Login(driver);
		a1.un();
		a1.continueButton();
		a1.pw();
		a1.signInbuttonMethod();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		
		
		
	}

}
