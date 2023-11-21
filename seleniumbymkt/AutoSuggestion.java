package seleniumbymkt;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d1=new ChromeDriver();
		d1.get("https:google.com");
		d1.manage().window().maximize();
		WebElement searchtextfield=	d1.findElement(By.name("q"));
		searchtextfield.sendKeys("India");
		Thread.sleep(1000); //1 second
		List<WebElement> autosuggestion=	d1.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int countofautos=	autosuggestion.size();
		System.out.println(countofautos);
		Thread.sleep(5000);
		autosuggestion.get(countofautos-6).click();
		
	}

}
