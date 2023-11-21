package CrossbrowesrTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Google_Search {
	WebDriver driver;
	@Test
	@Parameters("browser")

	public void search(String nameofyourbrowser) throws InterruptedException
	{
		if(nameofyourbrowser.equals("Chrome"))
		{
			 driver=new ChromeDriver();

		}
		if(nameofyourbrowser.equals("Edge"))
		{
			 driver=new EdgeDriver();

		}
		if(nameofyourbrowser.equals("Firefox"))
		{
			 driver=new FirefoxDriver();

		}
		driver.get("https://www.Amazon.in/");
		driver.manage().window().maximize();
		WebElement login=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(login).perform();
		WebElement signin=driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
		signin.click();
		WebElement uname=driver.findElement(By.id("ap_email"));
		uname.sendKeys("Sayunavgire@gmail.com");
		WebElement cont=driver.findElement(By.id("continue"));
		cont.click();
		WebElement pw=driver.findElement(By.name("password"));
		pw.sendKeys("Sayali@1804");
		WebElement signin1=driver.findElement(By.id("signInSubmit"));
		signin1.click();
		WebElement login1=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
       Actions a2=new Actions(driver);
		a2.moveToElement(login1).perform();
		WebElement signout=driver.findElement(By.xpath("//span[.='Sign Out']"));
		signout.click();

		Thread.sleep(3000);
		//driver.quit();
		
		
	}
	

}
