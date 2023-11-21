package Amazon_Source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_home extends File_class {
	WebDriver driver;
	//step1:
	@FindBy(id="twotabsearchtextbox")
	WebElement search_tf;
	
	//Step2:
	public void search()
	{
		search_tf.sendKeys("shoe");	
		search_tf.sendKeys(Keys.ENTER);
		
	}
	//Step 3:
	public Amazon_home(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
		
	}

}
