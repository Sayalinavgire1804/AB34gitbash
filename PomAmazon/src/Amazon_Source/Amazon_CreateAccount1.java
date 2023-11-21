package Amazon_Source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_CreateAccount1 {

	
	WebDriver driver;
	
	@FindBy(xpath="//a[@id='createAccountSubmit']")
	WebElement Createacct;
	
	public void CrateAccount()
	{
		Createacct.click();
		
	}
	
	public Amazon_CreateAccount1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
}
