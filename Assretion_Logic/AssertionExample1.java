package Assretion_Logic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class AssertionExample1 {
	@Test
	public void scenario1()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.Amazon.in/");
		driver.manage().window().maximize();
		WebElement login=driver.findElement(By.xpath("//span[@class= 'nav-line-2 ']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(login).perform();
		WebElement signin=driver.findElement(By.xpath("//span[.='Sign in']"));
		signin.click();
		WebElement email=driver.findElement(By.id("ap_email"));
		email.sendKeys("sayunavgire@gmail.com");
		WebElement submit=driver.findElement(By.id("continue"));
		submit.click();
		WebElement pw=driver.findElement(By.name("password"));
		pw.sendKeys("Sayali@1804");
		WebElement submit2=driver.findElement(By.id("signInSubmit"));
		submit2.click();
		Assertion a2=new Assertion();
		//a2.assertEquals("https://google.com",driver.getCurrentUrl() );
		a2.assertEquals(driver.getCurrentUrl(),"https://www.amazon.in/?ref_=nav_signin" );
		
		
	}

}
