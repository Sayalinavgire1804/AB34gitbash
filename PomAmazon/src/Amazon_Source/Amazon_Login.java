package Amazon_Source;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Amazon_Login extends File_class {
	WebDriver driver;
	@FindBy(name="email")
	WebElement username;
	
	
	@FindBy(id="continue")
	WebElement continue_button;
	
	@FindBy(id="ap_password")
	WebElement password1;
			
	@FindBy(id="signInSubmit")
	WebElement signIn_button;
	@FindBy(xpath="//span[@class= 'nav-line-2 ']")
	WebElement AccountList;
	@FindBy(xpath="//span[@class= 'nav-action-inner")
	WebElement siginlink;


	public void un() throws EncryptedDocumentException, IOException
	{
		File_class.DTDMethod();

		username.sendKeys(uname);
		
	}
	
	
	public void continueButton() throws EncryptedDocumentException, IOException
	{

		continue_button.click();
		
	}
	public void pw() throws EncryptedDocumentException, IOException
	{

		password1.sendKeys(password);
		
	}
	public void signInbuttonMethod()
	{
		signIn_button.click();
		
	}

//Step 3:initializing the element inside constructor
	public Amazon_Login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	

}
