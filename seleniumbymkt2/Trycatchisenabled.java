package seleniumbymkt2;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trycatchisenabled {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Sayali/Documents/sayali.html");
		driver.manage().window().maximize();
		WebElement lname=driver.findElement(By.id("121"));
		lname.isEnabled();
		try
		{
			lname.sendKeys("Navgire");
			
		}
		catch(ElementNotInteractableException r)
		{
			
			System.out.println("Element is disabled");
		}
	}

}
