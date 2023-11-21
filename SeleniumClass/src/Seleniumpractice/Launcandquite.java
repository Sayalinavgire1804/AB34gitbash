package Seleniumpractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launcandquite extends Testdata {
ChromeDriver driver;
	
	@BeforeMethod
	public void launch() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK_New&gclid=EAIaIQobChMI1r67utK0ggMVD0YrCh0tgQuVEAAYASAAEgKD_PD_BwE");
		driver.manage().window().maximize();

	}
	@AfterMethod
	public void quit() throws InterruptedException
	{
		Thread.sleep(3000);
		//driver.quit();
		
	}


}
