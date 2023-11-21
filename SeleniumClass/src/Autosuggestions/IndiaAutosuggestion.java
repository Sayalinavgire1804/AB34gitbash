package Autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndiaAutosuggestion {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("banglore");
		Thread.sleep(3000);
		List<WebElement> list=search.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		Thread.sleep(3000);
		int count=list.size();
		list.get(count-7).click();
		
		
	}

}
