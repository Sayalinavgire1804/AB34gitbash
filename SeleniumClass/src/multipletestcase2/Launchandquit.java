package multipletestcase2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Launchandquit {

	ChromeDriver driver;
	@BeforeMethod
	public void launch() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoe");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement shoe=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		shoe.click();
		Set<String>parentchild=driver.getWindowHandles();
		Iterator<String> count=parentchild.iterator();
		String parent=count.next();
		String child=count.next();
		driver.switchTo().window(child);
		WebElement addtocart=driver.findElement(By.name("submit.add-to-cart"));
		addtocart.click();
		WebElement proceedtobuy=driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
		proceedtobuy.click();
		WebElement login=driver.findElement(By.id("ap_email"));
		login.sendKeys("sayunavgire@gmail.com");
		WebElement submit=driver.findElement(By.id("continue"));
		submit.click();
		WebElement pw=driver.findElement(By.name("password"));
		pw.sendKeys("Sayali@1804");
		WebElement submit2=driver.findElement(By.id("signInSubmit"));
		submit2.click();
		WebElement address=driver.findElement(By.id("shipToThisAddressButton"));
		address.click();
		
		
	}
	@AfterMethod
	public void quit() throws InterruptedException
	{
		Thread.sleep(3000);
		//driver.quit();
		
	}
}
