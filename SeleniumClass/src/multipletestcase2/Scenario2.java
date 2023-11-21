package multipletestcase2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scenario2 extends Launchandquit {
	@Test
	public void Netbanking() throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement Netbanking=driver.findElement(By.xpath("(//input[@name='ppw-instrumentRowSelection'])[3]"));
		Netbanking.click();
		Thread.sleep(5000);
		WebElement choose=driver.findElement(By.xpath("(//span[.='Choose an Option'])[4]"));
		choose.click();
		List<WebElement> banklist=driver.findElements(By.xpath("(//div[@class='a-popover-inner a-lgtbox-vertical-scroll'])//ul/li/a"));
		Thread.sleep(5000);
		int count=banklist.size();
		System.out.println(count);
		Thread.sleep(5000);
		banklist.get(count-15).click();
		
	}

}
