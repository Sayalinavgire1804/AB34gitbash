package seleniumbymkt2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion1 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d1=new ChromeDriver();
		d1.get("https:google.com");
		d1.manage().window().maximize();
		WebElement search=d1.findElement(By.xpath("//textarea[@name='q']"));
		search.sendKeys("India");
		Thread.sleep(1000); 
		List<WebElement>list=d1.findElements(By.xpath("//div[@class='OBMEnb']//ul/li"));
		int count=list.size();
		System.out.println(count);
		list.get(count-7).click();

	}

}
