package Amazon_Source;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_forgotpass extends File_class {

	WebDriver driver;
	@FindBy(name="email")
	WebElement username;
	
	
	@FindBy(id="continue")
	WebElement continue_button;
	@FindBy(xpath="//a[@id='auth-fpp-link-bottom']")
	WebElement forgotpass;
	@FindBy(xpath="//input[@id='continue']")
	WebElement continuelink;


	public void un() throws EncryptedDocumentException, IOException
	{
		File_class.DTDMethod();

		username.sendKeys(uname);
		
	}
	
	
	public void continueButton() throws EncryptedDocumentException, IOException
	{

		continue_button.click();
		
	}
	public void password() throws EncryptedDocumentException, IOException
	{

		forgotpass.click();
		
	}
	public void Continuelink() throws EncryptedDocumentException, IOException
	{

		continuelink.click();
		
	}
	public Amazon_forgotpass(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
} 
