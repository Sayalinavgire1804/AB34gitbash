package seleniumbymkt2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enablelogicoperators {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Sayali/Documents/sayali.html");
		driver.manage().window().maximize();
		//WebElement lname=driver.findElement(By.id("121"));
		WebElement fname=driver.findElement(By.name("fname"));

		
		if(fname.isDisplayed()&& fname.isEnabled())
		{
			fname.sendKeys("Navgire");
		}
		else
		{
			System.out.println("Element is disabled");
		}
	}

}
