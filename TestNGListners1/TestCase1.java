package TestNGListners1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import TestNGListners.Reporting;

@Listeners(Reporting1.class)
public class TestCase1  {
static ChromeDriver driver;
	@Test
	public static  void scenarios1 ()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search= driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		search.sendKeys("Canada");
		search.sendKeys(Keys.ENTER);
		
	}

}
