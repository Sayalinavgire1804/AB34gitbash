package Amazon_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Amazon_Source.Amazon_Login;
import Amazon_Source.Amazon_Loginphone;

public class TestCase6 extends LaunchAndQuite {
	@Test
	public void scenario1() throws EncryptedDocumentException, IOException
	{
		
		Amazon_Loginphone a1=new Amazon_Loginphone(driver);
		a1.un();
		a1.continueButton();
		a1.pw();
		a1.signInbuttonMethod();
	}

}
