package ImplicitExplicitwait;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Google {
	@Test
	public void sc1()
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https:google.com");
	driver.manage().window().maximize();
	//WebDriverWait d2=new WebDriverWait(d1,Duration.ofSeconds(10));
	//d2.until(ExpectedConditions.titleIs("Manish"));
	WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(1));
	//w1.until(ExpectedConditions.titleIs("Google"));//exact replica
	w1.until(ExpectedConditions.titleContains("Goo"));//partial value
	driver.findElement(By.id("APjFqb")).sendKeys("India");
	
	}

}
