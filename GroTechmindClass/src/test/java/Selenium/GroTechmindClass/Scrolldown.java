package Selenium.GroTechmindClass;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrolldown {

	@Test
	public void scenario1() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
	
	JavascriptExecutor jse=driver;
	for(int i=1;i>0;i++)
	{
	jse.executeScript("window.scrollBy(0,500)");
	Thread.sleep(1000);
	
	}
		
	}

}
