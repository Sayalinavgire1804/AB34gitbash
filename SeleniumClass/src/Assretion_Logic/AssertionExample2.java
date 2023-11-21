package Assretion_Logic;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class AssertionExample2 {
	@Test
	public void scenario1()
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.Amazon.in/");
		driver.manage().window().maximize();
		WebElement signin=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(signin).perform();
		WebElement login=driver.findElement(By.xpath("//span[.='Sign in']"));
		login.click();
		WebElement uname=driver.findElement(By.id("ap_email"));
		uname.sendKeys("sayunavgire@gmail.com");
		WebElement submit=driver.findElement(By.id("continue"));
		submit.click();
		WebElement pw= driver.findElement(By.name("password"));
		pw.sendKeys("Sayali@0404");
		WebElement submit1=driver.findElement(By.id("signInSubmit"));
		submit1.click();
		Assertion a2=new Assertion();
		a2.assertEquals(driver.getCurrentUrl(),"https://www.amazon.in/?ref_=nav_signin" );
		
		
		
		

	}

}
