package Amazon_Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Amazon_Source.Amazon_Addcart;
import Amazon_Source.Amazon_Login;
import Amazon_Source.Amazon_home;
import Amazon_Source.Amazon_shoepage;

public class TestCase5 extends LaunchAndQuite {
	
	@Test
	public void login_amazonapplication() throws InterruptedException, EncryptedDocumentException, IOException
	{
	
	Amazon_Login a1 =new Amazon_Login(driver);
	a1.un();
	a1.continueButton();
	a1.pw();
	a1.signInbuttonMethod();
	driver.navigate().refresh();
	Amazon_home a2=new Amazon_home(driver);
	a2.search();
	Amazon_shoepage a3=new Amazon_shoepage(driver);
	a3.searchshoe();
	Set<String>parentchild=driver.getWindowHandles();
	Iterator<String> count=parentchild.iterator();
	String parent=count.next();
	String child=count.next();
	driver.switchTo().window(child);
	Amazon_Addcart a4=new Amazon_Addcart(driver);
	a4.addtocartshoes();

}

}
