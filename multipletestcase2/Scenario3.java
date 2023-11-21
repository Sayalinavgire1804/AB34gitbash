package multipletestcase2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scenario3 extends Launchandquit {
	@Test
	public void UPI() throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement upi=driver.findElement(By.xpath("(//input[@name='ppw-instrumentRowSelection'])[4]"));
		upi.click();
	
		
	}
}
