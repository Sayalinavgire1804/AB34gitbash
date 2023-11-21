package IRetryAnalyzer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestCase1 {
	@Test(retryAnalyzer=IRetryAnalyzer.Retry_Logic.class)
	public void scenario1()
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.navigate().refresh();
	WebElement appliance=driver.findElement(By.id("searchDropdownBox"));
	Select s1=new Select(appliance);
	//s1.selectByValue("search-alias=furniture");
	//s1.selectByIndex(11);
	s1.selectByVisibleText("Health & Personalll Care");
	List<WebElement> options=s1.getOptions();
	int count=options.size();
	System.out.println(count);
	}

}
