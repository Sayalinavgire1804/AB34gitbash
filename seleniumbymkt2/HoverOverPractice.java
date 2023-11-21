package seleniumbymkt2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOverPractice {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement accountlist=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(accountlist).perform();
		WebElement signin=driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
		signin.click();
		
	}

}
