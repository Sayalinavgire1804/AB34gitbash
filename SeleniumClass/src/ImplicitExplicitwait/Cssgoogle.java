package ImplicitExplicitwait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Cssgoogle {
	
		@Test
		public void sc1()
		{
		ChromeDriver d1=new ChromeDriver();
		d1.get("https:google.com");
		d1.manage().window().maximize();
		d1.findElement(By.cssSelector("textarea[id=APjFqb]")).sendKeys("Pune");
		
		}

}

