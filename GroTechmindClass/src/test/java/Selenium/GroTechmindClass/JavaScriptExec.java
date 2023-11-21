package Selenium.GroTechmindClass;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExec {

	@Test
	public void scenario1() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement country=driver.findElement(By.linkText("Canada"));
	Point p1=country.getLocation();
	int x=p1.getX();
	int y=p1.getY();
	System.out.println(x);
	System.out.println(y);
	JavascriptExecutor jse=driver;
	//jse.executeScript("window.scrollBy(0,"+y+")");//scrolldown-postive
	jse.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(3000);
	//jse.executeScript("window.scrollBy(0,-500)");
	jse.executeScript("window.scrollBy(0,"+-y+")");
		
	}

}
