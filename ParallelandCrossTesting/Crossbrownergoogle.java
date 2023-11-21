package ParallelandCrossTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrownergoogle {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void scenario1(String nameofyourbrowser)
	{
		if(nameofyourbrowser.equals("Chrome"))
		{
		
			driver=new ChromeDriver();
		
	         
		}
		if(nameofyourbrowser.equals("Firefox"))
		{
			 driver=new FirefoxDriver();

		}
		if(nameofyourbrowser.equals("Edge"))
		{
			 driver=new EdgeDriver();

		}
		
	
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	WebElement search= driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
	search.sendKeys("India");
	search.sendKeys(Keys.ENTER);
	}

}
