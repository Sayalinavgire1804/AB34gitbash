package seleniumbymkt2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysFunction {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("//textarea[@name='q']"));
		search.sendKeys("India");
		Thread.sleep(1000);
		for(int i=0;i<=3;i++)
		{
			
			search.sendKeys(Keys.ARROW_DOWN);
		}
		Thread.sleep(1000);

		search.sendKeys(Keys.ENTER);
	}

}
