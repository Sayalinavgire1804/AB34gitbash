package seleniumbymkt;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonRelativeXpath {

	public static void main(String[] args) {

		ChromeDriver d1=new ChromeDriver();
		d1.get("https://www.amazon.in/");
		d1.manage().window().maximize();
d1.findElement(By.xpath("//input [@name='field-keywords']")).sendKeys("Shoes");
	}

}
