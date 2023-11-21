package TestNGListners1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase2 {
	static ChromeDriver driver;
	@Test(timeOut=3000)
	public static  void scenarios1 ()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search= driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		search.sendKeys("Canada");
		search.sendKeys(Keys.ENTER);
		
	}

}
