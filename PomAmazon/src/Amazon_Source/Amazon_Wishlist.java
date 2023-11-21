package Amazon_Source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Wishlist extends File_class {
	
	WebDriver driver;
	//step1:
	@FindBy(id="add-to-wishlist-button")
	WebElement wishlist;
	@FindBy(xpath="(//input[@class='a-button-input a-declarative'])[1]")
	WebElement Createlist;

	@FindBy(xpath="(//span[.='Continue shopping'])[4]")
	WebElement contshopping;

	
	//Step2:
	public void Addwishlist() 
	{
		wishlist.click();
		
		
	}
	public void Crllist() 
	{
		Createlist.click();
		
		
	}
	public void ContinueShopping() 
	{
		contshopping.click();
		
		
	}
	//Step 3:
	public Amazon_Wishlist(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
		
	}
}
