package JavaPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptpopup11 {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sayali/Documents/sayali.html");
		driver.switchTo().alert().accept();
		WebElement uname=driver.findElement(By.id("1"));
		uname.sendKeys("Sayali");
	}

}
