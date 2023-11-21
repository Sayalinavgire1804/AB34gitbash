package Amazon_Source;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_shoepage extends File_class{
	
	 WebDriver driver;
	//step1:
	@FindBy(xpath="(//a[@class='a-link-normal s-no-outline'])[1]")
	
	WebElement shoelink;
	
	//Step2:
	public  void searchshoe() throws InterruptedException
	{
		shoelink.click();
		
		
	}
	//Step 3:
	public Amazon_shoepage(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
		
	}


}
