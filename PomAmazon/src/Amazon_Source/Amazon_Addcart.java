package Amazon_Source;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Addcart extends File_class {
	WebDriver driver;
	//step1:
	@FindBy(name="submit.add-to-cart")
	WebElement addtocart;
	
	//Step2:
	public void addtocartshoes() throws InterruptedException
	{
	
		addtocart.click();
		
	}
	//Step 3:
	public Amazon_Addcart(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
		
	}

}
