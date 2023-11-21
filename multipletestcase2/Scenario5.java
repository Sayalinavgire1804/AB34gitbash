package multipletestcase2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scenario5 extends Launchandquit {

	@Test
	public void COD() throws InterruptedException
	{
		Thread.sleep(5000);
	WebElement cod=driver.findElement(By.xpath("(//input[@name='ppw-instrumentRowSelection'])[6]"));
	cod.click();
	
		
	}
}
