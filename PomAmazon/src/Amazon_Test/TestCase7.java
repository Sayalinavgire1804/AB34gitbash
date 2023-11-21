package Amazon_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Amazon_Source.Amazon_forgotpass;

public class TestCase7 extends LaunchAndQuite {
	@Test
	public void scenario1() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Amazon_forgotpass a1=new Amazon_forgotpass(driver);
		a1.un();
		a1.continueButton();
		Thread.sleep(3000);
		a1.password();
		a1.Continuelink();
		
	}

}
