package Assretion_Logic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class AssertionExample {
	@Test
	public void sceanrio1()
	{
		ChromeDriver d1=new ChromeDriver();
		d1.get("https://www.google.com");
		Assertion a1=new Assertion();
		d1.manage().window().maximize();
		a1.assertEquals("Ram", "Sita");
		//a1.assertEquals("Google", d1.getTitle());
		WebElement search=d1.findElement(By.xpath("//textarea[@id='APjFqb']"));
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);
		
	}

}
