package seleniumbymkt2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hoveroverFlipcart {

	public static void main(String[] args) {


		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement close=driver.findElement(By.xpath("//span[.='✕']"));
		close.click();
		WebElement fashion=driver.findElement(By.xpath("//div[@class='_1wE2Px']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(fashion).perform();
		
		
	}

}
