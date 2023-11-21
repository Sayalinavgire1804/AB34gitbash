package ImplicitExplicitwait;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CSSAmazon {
	@Test
	public void sc1()
	{
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.cssSelector("input.nav-input nav-progressive-attribute,[id=twotabsearchtextbox]")).sendKeys("Jwellery");
		
		

}
}