package Annotations;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Google_Launch 
{ChromeDriver driver;
	@BeforeMethod
	public void launch()
	{
		 driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}
	@Test
	public void testcase1()
	{
		WebElement serach=	driver.findElement(By.name("q"));
		serach.sendKeys("India");
		serach.sendKeys(Keys.ENTER);
	}
	@AfterMethod
	public void quit() throws InterruptedException
	{
		Thread.sleep(3000);

		driver.quit();
	}
	
	
}
