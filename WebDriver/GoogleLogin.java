package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleLogin {
	 WebDriver driver;
	public void Chrodriver()
	{
		
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement india=driver.findElement(By.name("q"));
		india.sendKeys("India");
		india.sendKeys(Keys.ENTER);
	}
	public void Firefox()
	{
		
		driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement China=driver.findElement(By.name("q"));
		China.sendKeys("China");
		China.sendKeys(Keys.ENTER);
	}
	public  void Edge()
	{
		driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement Keral=driver.findElement(By.name("q"));
		Keral.sendKeys("Keral");
		Keral.sendKeys(Keys.ENTER);
		
		
	}
	public static void main(String[] args) {

		GoogleLogin g1=new GoogleLogin();
		g1.Chrodriver();
		g1.Firefox();
		g1.Edge();
	}

}
