package Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleLaunchCountry {
	ChromeDriver driver;
	@BeforeMethod
	public void Launch()
	{
	driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
		
	}
	@Test
	public void India()
	{
		WebElement search1=driver.findElement(By.name("q"));
		search1.sendKeys("India");
		search1.sendKeys(Keys.ENTER);
	}
	@Test
	public void Canada()
	{
		WebElement search2=driver.findElement(By.name("q"));
		search2.sendKeys("Canada");
		search2.sendKeys(Keys.ENTER);
		
	}
	@Test
	public void Norway()
	{
		WebElement search3=driver.findElement(By.name("q"));
		search3.sendKeys("Norway");
		search3.sendKeys(Keys.ENTER);
		
	}
	@Test
	public void UnitedStates()
	{
		WebElement search4=driver.findElement(By.name("q"));
		search4.sendKeys("UnitedStates");
		search4.sendKeys(Keys.ENTER);
		
	}
	@Test
	public void Italy()
	{
		WebElement search5=driver.findElement(By.name("q"));
		search5.sendKeys("Italy");
		search5.sendKeys(Keys.ENTER);
	}
	@AfterMethod
	public void quit() throws InterruptedException
	{
	
		Thread.sleep(3000);
		driver.quit();
	}
		
}
