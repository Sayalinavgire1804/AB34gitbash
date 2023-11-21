package seleniumbymkt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipcarthoverover {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//WebElement close=driver.findElement(By.xpath(""));
		WebElement fashion=driver.findElement(By.xpath("(//img)[5]"));
		fashion.click();
		//Actions a1=new Actions(driver);
		//a1.moveToElement(fashion).perform();
		//WebElement shirt=driver.findElement(By.xpath("(//a)[22]"));
		//shirt.click();
		
	}

}
