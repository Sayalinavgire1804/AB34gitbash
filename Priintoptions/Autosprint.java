package Priintoptions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Autosprint {
	@Test
	public void scenario1() throws InterruptedException
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Mobiles");
		Thread.sleep(3000);
		List<WebElement> autos=driver.findElements(By.xpath("(//div[@class='two-pane-results-container'])//div/div"));
		int mcount=autos.size();
		System.out.println(mcount);
		for(int i=0;i<mcount-1;i++)
			
		{
			WebElement mobile=autos.get(i);
			String mlist= mobile.getText();
			System.out.println(mlist);
			
		}
	}

}
