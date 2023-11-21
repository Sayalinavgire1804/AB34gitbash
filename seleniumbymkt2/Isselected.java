package seleniumbymkt2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Isselected {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.Amazon.in/");
		driver.manage().window().maximize();
		WebElement login=driver.findElement(By.xpath("//span[@class= 'nav-line-2 ']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(login).perform();
		WebElement login1=driver.findElement(By.xpath("//span[@class= 'nav-action-inner']"));
		login1.click();
		WebElement login2=driver.findElement(By.id("ap_email"));
		login2.sendKeys("sayunavgire@gmail.com");
		WebElement submit=driver.findElement(By.id("continue"));
		submit.click();
		WebElement pw=driver.findElement(By.name("password"));
		pw.sendKeys("Sayali@1804");
		WebElement submit2=driver.findElement(By.id("signInSubmit"));
		submit2.click();
		WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Shoes");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		//WebElement getitby=driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[1]"));
		//getitby.click();
		WebElement getday=driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[2]"));
		getday.click();
		Thread.sleep(3000);
		boolean get=getday.isSelected();
		System.out.println(get);
	}

}
