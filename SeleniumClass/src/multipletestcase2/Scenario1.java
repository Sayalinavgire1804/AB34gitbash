package multipletestcase2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scenario1 extends Launchandquit {

	@Test
	public void Creditcard() throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement creditcard=driver.findElement(By.xpath("(//input[@name='ppw-instrumentRowSelection'])[2]"));
		creditcard.click();
		WebElement creditcardlink=driver.findElement(By.xpath("(//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link'])[1]"));
		creditcardlink.click();
	}
}
